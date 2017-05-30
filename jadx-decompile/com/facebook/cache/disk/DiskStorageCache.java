package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheEventListener.EvictionReason;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.DiskStorage.DiskDumpInfo;
import com.facebook.cache.disk.DiskStorage.Entry;
import com.facebook.common.disk.DiskTrimmable;
import com.facebook.common.disk.DiskTrimmableRegistry;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.statfs.StatFsHelper;
import com.facebook.common.statfs.StatFsHelper.StorageType;
import com.facebook.common.time.Clock;
import com.facebook.common.time.SystemClock;
import com.facebook.common.util.SecureHashUtil;
import com.tencent.mm.sdk.platformtools.LocaleUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class DiskStorageCache implements FileCache, DiskTrimmable {
    private static final long FILECACHE_SIZE_UPDATE_PERIOD_MS = TimeUnit.MINUTES.toMillis(30);
    private static final long FUTURE_TIMESTAMP_THRESHOLD_MS = TimeUnit.HOURS.toMillis(2);
    public static final int START_OF_VERSIONING = 1;
    private static final Class<?> TAG = DiskStorageCache.class;
    private static final double TRIMMING_LOWER_BOUND = 0.02d;
    private static final long UNINITIALIZED = -1;
    private final CacheErrorLogger mCacheErrorLogger;
    private final CacheEventListener mCacheEventListener;
    @GuardedBy("mLock")
    private long mCacheSizeLastUpdateTime;
    private long mCacheSizeLimit;
    private final long mCacheSizeLimitMinimum;
    private final CacheStats mCacheStats;
    private final Clock mClock;
    private final long mDefaultCacheSizeLimit;
    private final Object mLock = new Object();
    private final long mLowDiskSpaceCacheSizeLimit;
    private final StatFsHelper mStatFsHelper;
    private final DiskStorageSupplier mStorageSupplier;

    @VisibleForTesting
    static class CacheStats {
        private long mCount = -1;
        private boolean mInitialized = false;
        private long mSize = -1;

        CacheStats() {
        }

        public synchronized long getCount() {
            return this.mCount;
        }

        public synchronized long getSize() {
            return this.mSize;
        }

        public synchronized void increment(long j, long j2) {
            if (this.mInitialized) {
                this.mSize += j;
                this.mCount += j2;
            }
        }

        public synchronized boolean isInitialized() {
            return this.mInitialized;
        }

        public synchronized void reset() {
            this.mInitialized = false;
            this.mCount = -1;
            this.mSize = -1;
        }

        public synchronized void set(long j, long j2) {
            this.mCount = j2;
            this.mSize = j;
            this.mInitialized = true;
        }
    }

    public static class Params {
        public final long mCacheSizeLimitMinimum;
        public final long mDefaultCacheSizeLimit;
        public final long mLowDiskSpaceCacheSizeLimit;

        public Params(long j, long j2, long j3) {
            this.mCacheSizeLimitMinimum = j;
            this.mLowDiskSpaceCacheSizeLimit = j2;
            this.mDefaultCacheSizeLimit = j3;
        }
    }

    private static class TimestampComparator implements Comparator<Entry> {
        private final long threshold;

        public TimestampComparator(long j) {
            this.threshold = j;
        }

        public int compare(Entry entry, Entry entry2) {
            long j = 0;
            long timestamp = entry.getTimestamp() <= this.threshold ? entry.getTimestamp() : 0;
            if (entry2.getTimestamp() <= this.threshold) {
                j = entry2.getTimestamp();
            }
            return timestamp < j ? -1 : j > timestamp ? 1 : 0;
        }
    }

    public DiskStorageCache(DiskStorageSupplier diskStorageSupplier, Params params, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, @Nullable DiskTrimmableRegistry diskTrimmableRegistry) {
        this.mLowDiskSpaceCacheSizeLimit = params.mLowDiskSpaceCacheSizeLimit;
        this.mDefaultCacheSizeLimit = params.mDefaultCacheSizeLimit;
        this.mCacheSizeLimit = params.mDefaultCacheSizeLimit;
        this.mStatFsHelper = StatFsHelper.getInstance();
        this.mStorageSupplier = diskStorageSupplier;
        this.mCacheSizeLastUpdateTime = -1;
        this.mCacheEventListener = cacheEventListener;
        this.mCacheSizeLimitMinimum = params.mCacheSizeLimitMinimum;
        this.mCacheErrorLogger = cacheErrorLogger;
        this.mCacheStats = new CacheStats();
        if (diskTrimmableRegistry != null) {
            diskTrimmableRegistry.registerDiskTrimmable(this);
        }
        this.mClock = SystemClock.get();
    }

    @GuardedBy("mLock")
    private void calcFileCacheSize() {
        Object obj = null;
        int i = 0;
        int i2 = 0;
        long j = -1;
        long now = this.mClock.now();
        long j2 = now + FUTURE_TIMESTAMP_THRESHOLD_MS;
        try {
            long j3 = 0;
            int i3 = 0;
            for (Entry entry : this.mStorageSupplier.get().getEntries()) {
                long max;
                int i4;
                int i5;
                Object obj2;
                int i6 = i3 + 1;
                j3 += entry.getSize();
                if (entry.getTimestamp() > j2) {
                    int i7 = i + 1;
                    i = (int) (((long) i2) + entry.getSize());
                    max = Math.max(entry.getTimestamp() - now, j);
                    i4 = i;
                    i5 = i7;
                    obj2 = 1;
                } else {
                    long j4 = j;
                    i4 = i2;
                    i5 = i;
                    max = j4;
                    obj2 = obj;
                }
                obj = obj2;
                i3 = i6;
                i = i5;
                i2 = i4;
                j = max;
            }
            if (obj != null) {
                this.mCacheErrorLogger.logError(CacheErrorCategory.READ_INVALID_ENTRY, TAG, "Future timestamp found in " + i + " files , with a total size of " + i2 + " bytes, and a maximum time delta of " + j + LocaleUtil.MALAY, null);
            }
            this.mCacheStats.set(j3, (long) i3);
        } catch (Throwable e) {
            this.mCacheErrorLogger.logError(CacheErrorCategory.GENERIC_IO, TAG, "calcFileCacheSize: " + e.getMessage(), e);
        }
    }

    private BinaryResource commitResource(String str, CacheKey cacheKey, BinaryResource binaryResource) {
        BinaryResource commit;
        synchronized (this.mLock) {
            commit = this.mStorageSupplier.get().commit(str, binaryResource, cacheKey);
            this.mCacheStats.increment(commit.size(), 1);
        }
        return commit;
    }

    private BinaryResource createTemporaryResource(String str, CacheKey cacheKey) {
        maybeEvictFilesInCacheDir();
        return this.mStorageSupplier.get().createTemporary(str, cacheKey);
    }

    private void deleteTemporaryResource(BinaryResource binaryResource) {
        if (binaryResource instanceof FileBinaryResource) {
            File file = ((FileBinaryResource) binaryResource).getFile();
            if (file.exists()) {
                FLog.e(TAG, "Temp file still on disk: %s ", file);
                if (!file.delete()) {
                    FLog.e(TAG, "Failed to delete temp file: %s", file);
                }
            }
        }
    }

    @GuardedBy("mLock")
    private void evictAboveSize(long j, EvictionReason evictionReason) {
        DiskStorage diskStorage = this.mStorageSupplier.get();
        try {
            long size = this.mCacheStats.getSize() - j;
            int i = 0;
            long j2 = 0;
            for (Entry entry : getSortedEntries(diskStorage.getEntries())) {
                if (j2 > size) {
                    break;
                }
                long j3;
                int i2;
                long remove = diskStorage.remove(entry);
                if (remove > 0) {
                    j3 = j2 + remove;
                    i2 = i + 1;
                } else {
                    long j4 = j2;
                    i2 = i;
                    j3 = j4;
                }
                i = i2;
                j2 = j3;
            }
            this.mCacheStats.increment(-j2, (long) (-i));
            diskStorage.purgeUnexpectedResources();
            reportEviction(evictionReason, i, j2);
        } catch (Throwable e) {
            this.mCacheErrorLogger.logError(CacheErrorCategory.EVICTION, TAG, "evictAboveSize: " + e.getMessage(), e);
            throw e;
        }
    }

    private Collection<Entry> getSortedEntries(Collection<Entry> collection) {
        Collection arrayList = new ArrayList(collection);
        Collections.sort(arrayList, new TimestampComparator(this.mClock.now() + FUTURE_TIMESTAMP_THRESHOLD_MS));
        return arrayList;
    }

    private void maybeEvictFilesInCacheDir() {
        synchronized (this.mLock) {
            boolean maybeUpdateFileCacheSize = maybeUpdateFileCacheSize();
            updateFileCacheSizeLimit();
            long size = this.mCacheStats.getSize();
            if (size > this.mCacheSizeLimit && !maybeUpdateFileCacheSize) {
                this.mCacheStats.reset();
                maybeUpdateFileCacheSize();
            }
            if (size > this.mCacheSizeLimit) {
                evictAboveSize((this.mCacheSizeLimit * 9) / 10, EvictionReason.CACHE_FULL);
            }
        }
    }

    @GuardedBy("mLock")
    private boolean maybeUpdateFileCacheSize() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.mCacheStats.isInitialized() && this.mCacheSizeLastUpdateTime != -1 && elapsedRealtime - this.mCacheSizeLastUpdateTime <= FILECACHE_SIZE_UPDATE_PERIOD_MS) {
            return false;
        }
        calcFileCacheSize();
        this.mCacheSizeLastUpdateTime = elapsedRealtime;
        return true;
    }

    private void reportEviction(EvictionReason evictionReason, int i, long j) {
        this.mCacheEventListener.onEviction(evictionReason, i, j);
    }

    private void trimBy(double d) {
        synchronized (this.mLock) {
            try {
                this.mCacheStats.reset();
                maybeUpdateFileCacheSize();
                long size = this.mCacheStats.getSize();
                evictAboveSize(size - ((long) (((double) size) * d)), EvictionReason.CACHE_MANAGER_TRIMMED);
            } catch (Throwable e) {
                this.mCacheErrorLogger.logError(CacheErrorCategory.EVICTION, TAG, "trimBy: " + e.getMessage(), e);
            }
        }
    }

    @GuardedBy("mLock")
    private void updateFileCacheSizeLimit() {
        if (this.mStatFsHelper.testLowDiskSpace(StorageType.INTERNAL, this.mDefaultCacheSizeLimit - this.mCacheStats.getSize())) {
            this.mCacheSizeLimit = this.mLowDiskSpaceCacheSizeLimit;
        } else {
            this.mCacheSizeLimit = this.mDefaultCacheSizeLimit;
        }
    }

    public void clearAll() {
        synchronized (this.mLock) {
            try {
                this.mStorageSupplier.get().clearAll();
            } catch (Throwable e) {
                this.mCacheErrorLogger.logError(CacheErrorCategory.EVICTION, TAG, "clearAll: " + e.getMessage(), e);
            }
            this.mCacheStats.reset();
        }
    }

    public long clearOldEntries(long j) {
        long j2 = 0;
        synchronized (this.mLock) {
            try {
                long now = this.mClock.now();
                DiskStorage diskStorage = this.mStorageSupplier.get();
                int i = 0;
                long j3 = 0;
                for (Entry entry : diskStorage.getEntries()) {
                    long j4;
                    int i2;
                    long max = Math.max(1, Math.abs(now - entry.getTimestamp()));
                    long j5;
                    if (max >= j) {
                        long remove = diskStorage.remove(entry);
                        if (remove > 0) {
                            j4 = j3 + remove;
                            i2 = i + 1;
                        } else {
                            j5 = j3;
                            i2 = i;
                            j4 = j5;
                        }
                        max = j2;
                    } else {
                        max = Math.max(j2, max);
                        j5 = j3;
                        i2 = i;
                        j4 = j5;
                    }
                    j2 = max;
                    int i3 = i2;
                    j3 = j4;
                    i = i3;
                }
                diskStorage.purgeUnexpectedResources();
                if (i > 0) {
                    maybeUpdateFileCacheSize();
                    this.mCacheStats.increment(-j3, (long) (-i));
                    reportEviction(EvictionReason.CONTENT_STALE, i, j3);
                }
            } catch (Throwable e) {
                this.mCacheErrorLogger.logError(CacheErrorCategory.EVICTION, TAG, "clearOldEntries: " + e.getMessage(), e);
            }
        }
        return j2;
    }

    public DiskDumpInfo getDumpInfo() {
        return this.mStorageSupplier.get().getDumpInfo();
    }

    public BinaryResource getResource(CacheKey cacheKey) {
        try {
            BinaryResource resource;
            synchronized (this.mLock) {
                resource = this.mStorageSupplier.get().getResource(getResourceId(cacheKey), cacheKey);
                if (resource == null) {
                    this.mCacheEventListener.onMiss();
                } else {
                    this.mCacheEventListener.onHit();
                }
            }
            return resource;
        } catch (Throwable e) {
            this.mCacheErrorLogger.logError(CacheErrorCategory.GENERIC_IO, TAG, "getResource", e);
            this.mCacheEventListener.onReadException();
            return null;
        }
    }

    @VisibleForTesting
    String getResourceId(CacheKey cacheKey) {
        try {
            return SecureHashUtil.makeSHA1HashBase64(cacheKey.toString().getBytes("UTF-8"));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public long getSize() {
        return this.mCacheStats.getSize();
    }

    public boolean hasKey(CacheKey cacheKey) {
        try {
            return this.mStorageSupplier.get().contains(getResourceId(cacheKey), cacheKey);
        } catch (IOException e) {
            return false;
        }
    }

    public BinaryResource insert(CacheKey cacheKey, WriterCallback writerCallback) {
        this.mCacheEventListener.onWriteAttempt();
        String resourceId = getResourceId(cacheKey);
        BinaryResource createTemporaryResource;
        try {
            createTemporaryResource = createTemporaryResource(resourceId, cacheKey);
            this.mStorageSupplier.get().updateResource(resourceId, createTemporaryResource, writerCallback, cacheKey);
            BinaryResource commitResource = commitResource(resourceId, cacheKey, createTemporaryResource);
            deleteTemporaryResource(createTemporaryResource);
            return commitResource;
        } catch (Throwable e) {
            this.mCacheEventListener.onWriteException();
            FLog.d(TAG, "Failed inserting a file into the cache", e);
            throw e;
        } catch (Throwable th) {
            deleteTemporaryResource(createTemporaryResource);
        }
    }

    public boolean isEnabled() {
        try {
            return this.mStorageSupplier.get().isEnabled();
        } catch (IOException e) {
            return false;
        }
    }

    public boolean probe(CacheKey cacheKey) {
        try {
            boolean touch;
            synchronized (this.mLock) {
                touch = this.mStorageSupplier.get().touch(getResourceId(cacheKey), cacheKey);
            }
            return touch;
        } catch (IOException e) {
            this.mCacheEventListener.onReadException();
            return false;
        }
    }

    public void remove(CacheKey cacheKey) {
        synchronized (this.mLock) {
            try {
                this.mStorageSupplier.get().remove(getResourceId(cacheKey));
            } catch (Throwable e) {
                this.mCacheErrorLogger.logError(CacheErrorCategory.DELETE_FILE, TAG, "delete: " + e.getMessage(), e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToMinimum() {
        /*
        r8 = this;
        r6 = 0;
        r1 = r8.mLock;
        monitor-enter(r1);
        r8.maybeUpdateFileCacheSize();	 Catch:{ all -> 0x0038 }
        r0 = r8.mCacheStats;	 Catch:{ all -> 0x0038 }
        r2 = r0.getSize();	 Catch:{ all -> 0x0038 }
        r4 = r8.mCacheSizeLimitMinimum;	 Catch:{ all -> 0x0038 }
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x001e;
    L_0x0014:
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x001e;
    L_0x0018:
        r4 = r8.mCacheSizeLimitMinimum;	 Catch:{ all -> 0x0038 }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0020;
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0038 }
    L_0x001f:
        return;
    L_0x0020:
        r4 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r6 = r8.mCacheSizeLimitMinimum;	 Catch:{ all -> 0x0038 }
        r6 = (double) r6;	 Catch:{ all -> 0x0038 }
        r2 = (double) r2;	 Catch:{ all -> 0x0038 }
        r2 = r6 / r2;
        r2 = r4 - r2;
        r4 = 4581421828931458171; // 0x3f947ae147ae147b float:89128.96 double:0.02;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0036;
    L_0x0033:
        r8.trimBy(r2);	 Catch:{ all -> 0x0038 }
    L_0x0036:
        monitor-exit(r1);	 Catch:{ all -> 0x0038 }
        goto L_0x001f;
    L_0x0038:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0038 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.DiskStorageCache.trimToMinimum():void");
    }

    public void trimToNothing() {
        clearAll();
    }
}
