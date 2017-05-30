package com.facebook.imagepipeline.cache;

import a.l;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.memory.PooledByteStreams;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class BufferedDiskCache {
    private static final Class<?> TAG = BufferedDiskCache.class;
    private final FileCache mFileCache;
    private final ImageCacheStatsTracker mImageCacheStatsTracker;
    private final PooledByteBufferFactory mPooledByteBufferFactory;
    private final PooledByteStreams mPooledByteStreams;
    private final Executor mReadExecutor;
    private final StagingArea mStagingArea = StagingArea.getInstance();
    private final Executor mWriteExecutor;

    public BufferedDiskCache(FileCache fileCache, PooledByteBufferFactory pooledByteBufferFactory, PooledByteStreams pooledByteStreams, Executor executor, Executor executor2, ImageCacheStatsTracker imageCacheStatsTracker) {
        this.mFileCache = fileCache;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mPooledByteStreams = pooledByteStreams;
        this.mReadExecutor = executor;
        this.mWriteExecutor = executor2;
        this.mImageCacheStatsTracker = imageCacheStatsTracker;
    }

    private PooledByteBuffer readFromDiskCache(CacheKey cacheKey) {
        InputStream openStream;
        try {
            FLog.v(TAG, "Disk cache read for %s", cacheKey.toString());
            BinaryResource resource = this.mFileCache.getResource(cacheKey);
            if (resource == null) {
                FLog.v(TAG, "Disk cache miss for %s", cacheKey.toString());
                this.mImageCacheStatsTracker.onDiskCacheMiss();
                return null;
            }
            FLog.v(TAG, "Found entry in disk cache for %s", cacheKey.toString());
            this.mImageCacheStatsTracker.onDiskCacheHit();
            openStream = resource.openStream();
            PooledByteBuffer newByteBuffer = this.mPooledByteBufferFactory.newByteBuffer(openStream, (int) resource.size());
            openStream.close();
            FLog.v(TAG, "Successful read from disk cache for %s", cacheKey.toString());
            return newByteBuffer;
        } catch (Throwable e) {
            FLog.w(TAG, e, "Exception reading from cache for %s", cacheKey.toString());
            this.mImageCacheStatsTracker.onDiskCacheGetFail();
            throw e;
        } catch (Throwable th) {
            openStream.close();
        }
    }

    private void writeToDiskCache(CacheKey cacheKey, final EncodedImage encodedImage) {
        FLog.v(TAG, "About to write to disk-cache for key %s", cacheKey.toString());
        try {
            this.mFileCache.insert(cacheKey, new WriterCallback() {
                public void write(OutputStream outputStream) {
                    BufferedDiskCache.this.mPooledByteStreams.copy(encodedImage.getInputStream(), outputStream);
                }
            });
            FLog.v(TAG, "Successful disk-cache write for key %s", cacheKey.toString());
        } catch (Throwable e) {
            FLog.w(TAG, e, "Failed to write to disk-cache for key %s", cacheKey.toString());
        }
    }

    public l<Void> clearAll() {
        this.mStagingArea.clearAll();
        try {
            return l.a(new Callable<Void>() {
                public Void call() {
                    BufferedDiskCache.this.mStagingArea.clearAll();
                    BufferedDiskCache.this.mFileCache.clearAll();
                    return null;
                }
            }, this.mWriteExecutor);
        } catch (Exception e) {
            FLog.w(TAG, (Throwable) e, "Failed to schedule disk-cache clear", new Object[0]);
            return l.a(e);
        }
    }

    public l<Boolean> contains(final CacheKey cacheKey) {
        Preconditions.checkNotNull(cacheKey);
        EncodedImage encodedImage = this.mStagingArea.get(cacheKey);
        if (encodedImage != null) {
            encodedImage.close();
            FLog.v(TAG, "Found image for %s in staging area", cacheKey.toString());
            this.mImageCacheStatsTracker.onStagingAreaHit();
            return l.a(Boolean.valueOf(true));
        }
        try {
            return l.a(new Callable<Boolean>() {
                public Boolean call() {
                    EncodedImage encodedImage = BufferedDiskCache.this.mStagingArea.get(cacheKey);
                    if (encodedImage != null) {
                        encodedImage.close();
                        FLog.v(BufferedDiskCache.TAG, "Found image for %s in staging area", cacheKey.toString());
                        BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaHit();
                        return Boolean.valueOf(true);
                    }
                    FLog.v(BufferedDiskCache.TAG, "Did not find image for %s in staging area", cacheKey.toString());
                    BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaMiss();
                    try {
                        return Boolean.valueOf(BufferedDiskCache.this.mFileCache.hasKey(cacheKey));
                    } catch (Exception e) {
                        return Boolean.valueOf(false);
                    }
                }
            }, this.mReadExecutor);
        } catch (Exception e) {
            FLog.w(TAG, (Throwable) e, "Failed to schedule disk-cache read for %s", cacheKey.toString());
            return l.a(e);
        }
    }

    public l<EncodedImage> get(final CacheKey cacheKey, final AtomicBoolean atomicBoolean) {
        Preconditions.checkNotNull(cacheKey);
        Preconditions.checkNotNull(atomicBoolean);
        Object obj = this.mStagingArea.get(cacheKey);
        if (obj != null) {
            FLog.v(TAG, "Found image for %s in staging area", cacheKey.toString());
            this.mImageCacheStatsTracker.onStagingAreaHit();
            return l.a(obj);
        }
        try {
            return l.a(new Callable<EncodedImage>() {
                public EncodedImage call() {
                    if (atomicBoolean.get()) {
                        throw new CancellationException();
                    }
                    EncodedImage encodedImage = BufferedDiskCache.this.mStagingArea.get(cacheKey);
                    if (encodedImage != null) {
                        FLog.v(BufferedDiskCache.TAG, "Found image for %s in staging area", cacheKey.toString());
                        BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaHit();
                    } else {
                        FLog.v(BufferedDiskCache.TAG, "Did not find image for %s in staging area", cacheKey.toString());
                        BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaMiss();
                        CloseableReference of;
                        try {
                            of = CloseableReference.of(BufferedDiskCache.this.readFromDiskCache(cacheKey));
                            encodedImage = new EncodedImage(of);
                            CloseableReference.closeSafely(of);
                        } catch (Exception e) {
                            return null;
                        } catch (Throwable th) {
                            CloseableReference.closeSafely(of);
                        }
                    }
                    if (!Thread.interrupted()) {
                        return encodedImage;
                    }
                    FLog.v(BufferedDiskCache.TAG, "Host thread was interrupted, decreasing reference count");
                    if (encodedImage != null) {
                        encodedImage.close();
                    }
                    throw new InterruptedException();
                }
            }, this.mReadExecutor);
        } catch (Exception e) {
            FLog.w(TAG, (Throwable) e, "Failed to schedule disk-cache read for %s", cacheKey.toString());
            return l.a(e);
        }
    }

    public void put(final CacheKey cacheKey, EncodedImage encodedImage) {
        Preconditions.checkNotNull(cacheKey);
        Preconditions.checkArgument(EncodedImage.isValid(encodedImage));
        this.mStagingArea.put(cacheKey, encodedImage);
        final EncodedImage cloneOrNull = EncodedImage.cloneOrNull(encodedImage);
        try {
            this.mWriteExecutor.execute(new Runnable() {
                public void run() {
                    try {
                        BufferedDiskCache.this.writeToDiskCache(cacheKey, cloneOrNull);
                    } finally {
                        BufferedDiskCache.this.mStagingArea.remove(cacheKey, cloneOrNull);
                        EncodedImage.closeSafely(cloneOrNull);
                    }
                }
            });
        } catch (Throwable e) {
            FLog.w(TAG, e, "Failed to schedule disk-cache write for %s", cacheKey.toString());
            this.mStagingArea.remove(cacheKey, encodedImage);
            EncodedImage.closeSafely(cloneOrNull);
        }
    }

    public l<Void> remove(final CacheKey cacheKey) {
        Preconditions.checkNotNull(cacheKey);
        this.mStagingArea.remove(cacheKey);
        try {
            return l.a(new Callable<Void>() {
                public Void call() {
                    BufferedDiskCache.this.mStagingArea.remove(cacheKey);
                    BufferedDiskCache.this.mFileCache.remove(cacheKey);
                    return null;
                }
            }, this.mWriteExecutor);
        } catch (Exception e) {
            FLog.w(TAG, (Throwable) e, "Failed to schedule disk-cache remove for %s", cacheKey.toString());
            return l.a(e);
        }
    }
}
