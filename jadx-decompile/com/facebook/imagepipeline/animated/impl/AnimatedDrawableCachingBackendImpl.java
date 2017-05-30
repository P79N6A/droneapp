package com.facebook.imagepipeline.animated.impl;

import a.j;
import a.l;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.support.v4.util.SparseArrayCompat;
import com.facebook.common.executors.SerialExecutorService;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.common.time.MonotonicClock;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableCachingBackend;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableOptions;
import com.facebook.imagepipeline.animated.base.DelegatingAnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.Callback;
import com.facebook.imagepipeline.animated.util.AnimatedDrawableUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public class AnimatedDrawableCachingBackendImpl extends DelegatingAnimatedDrawableBackend implements AnimatedDrawableCachingBackend {
    private static final int PREFETCH_FRAMES = 3;
    private static final Class<?> TAG = AnimatedDrawableCachingBackendImpl.class;
    private static final AtomicInteger sTotalBitmaps = new AtomicInteger();
    private final ActivityManager mActivityManager;
    private final AnimatedDrawableBackend mAnimatedDrawableBackend;
    private final AnimatedDrawableOptions mAnimatedDrawableOptions;
    private final AnimatedDrawableUtil mAnimatedDrawableUtil;
    private final AnimatedImageCompositor mAnimatedImageCompositor;
    private final double mApproxKiloBytesToHoldAllFrames;
    @GuardedBy("this")
    private final WhatToKeepCachedArray mBitmapsToKeepCached;
    @GuardedBy("this")
    private final SparseArrayCompat<CloseableReference<Bitmap>> mCachedBitmaps;
    @GuardedBy("ui-thread")
    private int mCurrentFrameIndex;
    @GuardedBy("this")
    private final SparseArrayCompat<l<Object>> mDecodesInFlight;
    private final SerialExecutorService mExecutorService;
    @GuardedBy("this")
    private final List<Bitmap> mFreeBitmaps;
    private final double mMaximumKiloBytes;
    private final MonotonicClock mMonotonicClock;
    private final ResourceReleaser<Bitmap> mResourceReleaserForBitmaps;

    public AnimatedDrawableCachingBackendImpl(SerialExecutorService serialExecutorService, ActivityManager activityManager, AnimatedDrawableUtil animatedDrawableUtil, MonotonicClock monotonicClock, AnimatedDrawableBackend animatedDrawableBackend, AnimatedDrawableOptions animatedDrawableOptions) {
        super(animatedDrawableBackend);
        this.mExecutorService = serialExecutorService;
        this.mActivityManager = activityManager;
        this.mAnimatedDrawableUtil = animatedDrawableUtil;
        this.mMonotonicClock = monotonicClock;
        this.mAnimatedDrawableBackend = animatedDrawableBackend;
        this.mAnimatedDrawableOptions = animatedDrawableOptions;
        this.mMaximumKiloBytes = animatedDrawableOptions.maximumBytes >= 0 ? (double) (animatedDrawableOptions.maximumBytes / 1024) : (double) (getDefaultMaxBytes(activityManager) / 1024);
        this.mAnimatedImageCompositor = new AnimatedImageCompositor(animatedDrawableBackend, new Callback() {
            public CloseableReference<Bitmap> getCachedBitmap(int i) {
                return AnimatedDrawableCachingBackendImpl.this.getCachedOrPredecodedFrame(i);
            }

            public void onIntermediateResult(int i, Bitmap bitmap) {
                AnimatedDrawableCachingBackendImpl.this.maybeCacheBitmapDuringRender(i, bitmap);
            }
        });
        this.mResourceReleaserForBitmaps = new ResourceReleaser<Bitmap>() {
            public void release(Bitmap bitmap) {
                AnimatedDrawableCachingBackendImpl.this.releaseBitmapInternal(bitmap);
            }
        };
        this.mFreeBitmaps = new ArrayList();
        this.mDecodesInFlight = new SparseArrayCompat(10);
        this.mCachedBitmaps = new SparseArrayCompat(10);
        this.mBitmapsToKeepCached = new WhatToKeepCachedArray(this.mAnimatedDrawableBackend.getFrameCount());
        this.mApproxKiloBytesToHoldAllFrames = (double) ((((this.mAnimatedDrawableBackend.getRenderedWidth() * this.mAnimatedDrawableBackend.getRenderedHeight()) / 1024) * this.mAnimatedDrawableBackend.getFrameCount()) * 4);
    }

    private synchronized void cancelFuturesOutsideOfRange(int i, int i2) {
        int i3 = 0;
        while (i3 < this.mDecodesInFlight.size()) {
            int i4;
            if (AnimatedDrawableUtil.isOutsideRange(i, i2, this.mDecodesInFlight.keyAt(i3))) {
                l lVar = (l) this.mDecodesInFlight.valueAt(i3);
                this.mDecodesInFlight.removeAt(i3);
                i4 = i3;
            } else {
                i4 = i3 + 1;
            }
            i3 = i4;
        }
    }

    private void copyAndCacheBitmapDuringRendering(int i, Bitmap bitmap) {
        CloseableReference obtainBitmapInternal = obtainBitmapInternal();
        try {
            Canvas canvas = new Canvas((Bitmap) obtainBitmapInternal.get());
            canvas.drawColor(0, Mode.SRC);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
            maybeCacheRenderedBitmap(i, obtainBitmapInternal);
        } finally {
            obtainBitmapInternal.close();
        }
    }

    private Bitmap createNewBitmap() {
        FLog.v(TAG, "Creating new bitmap");
        sTotalBitmaps.incrementAndGet();
        FLog.v(TAG, "Total bitmaps: %d", Integer.valueOf(sTotalBitmaps.get()));
        return Bitmap.createBitmap(this.mAnimatedDrawableBackend.getRenderedWidth(), this.mAnimatedDrawableBackend.getRenderedHeight(), Config.ARGB_8888);
    }

    private synchronized void doPrefetch(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            final int frameCount = (i + i3) % this.mAnimatedDrawableBackend.getFrameCount();
            l lVar = (l) this.mDecodesInFlight.get(frameCount);
            if (!hasCachedOrPredecodedFrame(frameCount) && lVar == null) {
                lVar = l.a(new Callable<Object>() {
                    public Object call() {
                        AnimatedDrawableCachingBackendImpl.this.runPrefetch(frameCount);
                        return null;
                    }
                }, this.mExecutorService);
                this.mDecodesInFlight.put(frameCount, lVar);
                lVar.a(new j<Object, Object>() {
                    public Object then(l<Object> lVar) {
                        AnimatedDrawableCachingBackendImpl.this.onFutureFinished(lVar, frameCount);
                        return null;
                    }
                });
            }
        }
    }

    private synchronized void dropBitmapsThatShouldNotBeCached() {
        int i = 0;
        while (i < this.mCachedBitmaps.size()) {
            int i2;
            if (this.mBitmapsToKeepCached.get(this.mCachedBitmaps.keyAt(i))) {
                i2 = i + 1;
            } else {
                CloseableReference closeableReference = (CloseableReference) this.mCachedBitmaps.valueAt(i);
                this.mCachedBitmaps.removeAt(i);
                closeableReference.close();
                i2 = i;
            }
            i = i2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.references.CloseableReference<android.graphics.Bitmap> getBitmapForFrameInternal(int r9, boolean r10) {
        /*
        r8 = this;
        r2 = 1;
        r6 = 10;
        r3 = 0;
        r0 = r8.mMonotonicClock;
        r4 = r0.now();
        monitor-enter(r8);	 Catch:{ all -> 0x0077 }
        r0 = r8.mBitmapsToKeepCached;	 Catch:{ all -> 0x0074 }
        r1 = 1;
        r0.set(r9, r1);	 Catch:{ all -> 0x0074 }
        r1 = r8.getCachedOrPredecodedFrame(r9);	 Catch:{ all -> 0x0074 }
        if (r1 == 0) goto L_0x0038;
    L_0x0017:
        monitor-exit(r8);	 Catch:{ all -> 0x0074 }
        r0 = r8.mMonotonicClock;
        r2 = r0.now();
        r2 = r2 - r4;
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0036;
    L_0x0023:
        r0 = "";
        r0 = "ok";
        r4 = TAG;
        r5 = "obtainBitmap for frame %d took %d ms (%s)";
        r6 = java.lang.Integer.valueOf(r9);
        r2 = java.lang.Long.valueOf(r2);
        com.facebook.common.logging.FLog.v(r4, r5, r6, r2, r0);
    L_0x0036:
        r0 = r1;
    L_0x0037:
        return r0;
    L_0x0038:
        monitor-exit(r8);	 Catch:{ all -> 0x0074 }
        if (r10 == 0) goto L_0x00a4;
    L_0x003b:
        r3 = r8.obtainBitmapInternal();	 Catch:{ all -> 0x00a0 }
        r1 = r8.mAnimatedImageCompositor;	 Catch:{ all -> 0x009b }
        r0 = r3.get();	 Catch:{ all -> 0x009b }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ all -> 0x009b }
        r1.renderFrame(r9, r0);	 Catch:{ all -> 0x009b }
        r8.maybeCacheRenderedBitmap(r9, r3);	 Catch:{ all -> 0x009b }
        r1 = r3.clone();	 Catch:{ all -> 0x009b }
        r3.close();	 Catch:{ all -> 0x00a0 }
        r0 = r8.mMonotonicClock;
        r2 = r0.now();
        r2 = r2 - r4;
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0072;
    L_0x005f:
        r0 = "";
        r0 = "renderedOnCallingThread";
        r4 = TAG;
        r5 = "obtainBitmap for frame %d took %d ms (%s)";
        r6 = java.lang.Integer.valueOf(r9);
        r2 = java.lang.Long.valueOf(r2);
        com.facebook.common.logging.FLog.v(r4, r5, r6, r2, r0);
    L_0x0072:
        r0 = r1;
        goto L_0x0037;
    L_0x0074:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0074 }
        throw r0;	 Catch:{ all -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        r1 = r0;
        r0 = r3;
    L_0x007a:
        r2 = r8.mMonotonicClock;
        r2 = r2.now();
        r2 = r2 - r4;
        r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x009a;
    L_0x0085:
        r4 = "";
        if (r0 == 0) goto L_0x00c6;
    L_0x0089:
        r0 = "renderedOnCallingThread";
    L_0x008b:
        r4 = TAG;
        r5 = "obtainBitmap for frame %d took %d ms (%s)";
        r6 = java.lang.Integer.valueOf(r9);
        r2 = java.lang.Long.valueOf(r2);
        com.facebook.common.logging.FLog.v(r4, r5, r6, r2, r0);
    L_0x009a:
        throw r1;
    L_0x009b:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x00a0 }
        throw r0;	 Catch:{ all -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
        goto L_0x007a;
    L_0x00a4:
        r1 = 0;
        r0 = r8.mMonotonicClock;
        r2 = r0.now();
        r2 = r2 - r4;
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c3;
    L_0x00b0:
        r0 = "";
        r0 = "deferred";
        r4 = TAG;
        r5 = "obtainBitmap for frame %d took %d ms (%s)";
        r6 = java.lang.Integer.valueOf(r9);
        r2 = java.lang.Long.valueOf(r2);
        com.facebook.common.logging.FLog.v(r4, r5, r6, r2, r0);
    L_0x00c3:
        r0 = r1;
        goto L_0x0037;
    L_0x00c6:
        r0 = "ok";
        goto L_0x008b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.animated.impl.AnimatedDrawableCachingBackendImpl.getBitmapForFrameInternal(int, boolean):com.facebook.common.references.CloseableReference<android.graphics.Bitmap>");
    }

    private synchronized CloseableReference<Bitmap> getCachedOrPredecodedFrame(int i) {
        CloseableReference<Bitmap> cloneOrNull;
        cloneOrNull = CloseableReference.cloneOrNull((CloseableReference) this.mCachedBitmaps.get(i));
        if (cloneOrNull == null) {
            cloneOrNull = this.mAnimatedDrawableBackend.getPreDecodedFrame(i);
        }
        return cloneOrNull;
    }

    private static int getDefaultMaxBytes(ActivityManager activityManager) {
        return activityManager.getMemoryClass() > 32 ? 5242880 : 3145728;
    }

    private synchronized boolean hasCachedOrPredecodedFrame(int i) {
        boolean z;
        z = this.mCachedBitmaps.get(i) != null || this.mAnimatedDrawableBackend.hasPreDecodedFrame(i);
        return z;
    }

    private void maybeCacheBitmapDuringRender(int i, Bitmap bitmap) {
        Object obj = null;
        synchronized (this) {
            if (this.mBitmapsToKeepCached.get(i) && this.mCachedBitmaps.get(i) == null) {
                obj = 1;
            }
        }
        if (obj != null) {
            copyAndCacheBitmapDuringRendering(i, bitmap);
        }
    }

    private synchronized void maybeCacheRenderedBitmap(int i, CloseableReference<Bitmap> closeableReference) {
        if (this.mBitmapsToKeepCached.get(i)) {
            int indexOfKey = this.mCachedBitmaps.indexOfKey(i);
            if (indexOfKey >= 0) {
                ((CloseableReference) this.mCachedBitmaps.valueAt(indexOfKey)).close();
                this.mCachedBitmaps.removeAt(indexOfKey);
            }
            this.mCachedBitmaps.put(i, closeableReference.clone());
        }
    }

    private CloseableReference<Bitmap> obtainBitmapInternal() {
        Object createNewBitmap;
        synchronized (this) {
            long nanoTime = System.nanoTime();
            long convert = TimeUnit.NANOSECONDS.convert(20, TimeUnit.MILLISECONDS) + nanoTime;
            while (this.mFreeBitmaps.isEmpty() && nanoTime < convert) {
                try {
                    TimeUnit.NANOSECONDS.timedWait(this, convert - nanoTime);
                    nanoTime = System.nanoTime();
                } catch (Throwable e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }
            if (this.mFreeBitmaps.isEmpty()) {
                createNewBitmap = createNewBitmap();
            } else {
                Bitmap bitmap = (Bitmap) this.mFreeBitmaps.remove(this.mFreeBitmaps.size() - 1);
            }
        }
        return CloseableReference.of(createNewBitmap, this.mResourceReleaserForBitmaps);
    }

    private synchronized void onFutureFinished(l<?> lVar, int i) {
        int indexOfKey = this.mDecodesInFlight.indexOfKey(i);
        if (indexOfKey >= 0 && ((l) this.mDecodesInFlight.valueAt(indexOfKey)) == lVar) {
            this.mDecodesInFlight.removeAt(indexOfKey);
            if (lVar.f() != null) {
                FLog.v(TAG, lVar.f(), "Failed to render frame %d", Integer.valueOf(i));
            }
        }
    }

    private void runPrefetch(int r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.facebook.imagepipeline.animated.impl.AnimatedDrawableCachingBackendImpl.runPrefetch(int):void. bs: [B:16:0x001f, B:22:0x002a]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.mBitmapsToKeepCached;	 Catch:{ all -> 0x0013 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0013 }
        if (r0 != 0) goto L_0x000b;	 Catch:{ all -> 0x0013 }
    L_0x0009:
        monitor-exit(r5);	 Catch:{ all -> 0x0013 }
    L_0x000a:
        return;	 Catch:{ all -> 0x0013 }
    L_0x000b:
        r0 = r5.hasCachedOrPredecodedFrame(r6);	 Catch:{ all -> 0x0013 }
        if (r0 == 0) goto L_0x0016;	 Catch:{ all -> 0x0013 }
    L_0x0011:
        monitor-exit(r5);	 Catch:{ all -> 0x0013 }
        goto L_0x000a;	 Catch:{ all -> 0x0013 }
    L_0x0013:
        r0 = move-exception;	 Catch:{ all -> 0x0013 }
        monitor-exit(r5);	 Catch:{ all -> 0x0013 }
        throw r0;
    L_0x0016:
        monitor-exit(r5);	 Catch:{ all -> 0x0013 }
        r0 = r5.mAnimatedDrawableBackend;
        r1 = r0.getPreDecodedFrame(r6);
        if (r1 == 0) goto L_0x0026;
    L_0x001f:
        r5.maybeCacheRenderedBitmap(r6, r1);	 Catch:{ all -> 0x0047 }
    L_0x0022:
        com.facebook.common.references.CloseableReference.closeSafely(r1);
        goto L_0x000a;
    L_0x0026:
        r2 = r5.obtainBitmapInternal();	 Catch:{ all -> 0x0047 }
        r3 = r5.mAnimatedImageCompositor;	 Catch:{ all -> 0x004c }
        r0 = r2.get();	 Catch:{ all -> 0x004c }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ all -> 0x004c }
        r3.renderFrame(r6, r0);	 Catch:{ all -> 0x004c }
        r5.maybeCacheRenderedBitmap(r6, r2);	 Catch:{ all -> 0x004c }
        r0 = TAG;	 Catch:{ all -> 0x004c }
        r3 = "Prefetch rendered frame %d";	 Catch:{ all -> 0x004c }
        r4 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x004c }
        com.facebook.common.logging.FLog.v(r0, r3, r4);	 Catch:{ all -> 0x004c }
        r2.close();	 Catch:{ all -> 0x0047 }
        goto L_0x0022;
    L_0x0047:
        r0 = move-exception;
        com.facebook.common.references.CloseableReference.closeSafely(r1);
        throw r0;
    L_0x004c:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x0047 }
        throw r0;	 Catch:{ all -> 0x0047 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.animated.impl.AnimatedDrawableCachingBackendImpl.runPrefetch(int):void");
    }

    private synchronized void schedulePrefetches() {
        int i = 1;
        synchronized (this) {
            int i2 = this.mAnimatedDrawableBackend.getFrameInfo(this.mCurrentFrameIndex).disposalMethod == DisposalMethod.DISPOSE_TO_PREVIOUS ? 1 : 0;
            int max = Math.max(0, this.mCurrentFrameIndex - (i2 != 0 ? 1 : 0));
            int i3 = this.mAnimatedDrawableOptions.allowPrefetching ? 3 : 0;
            if (i2 == 0) {
                i = 0;
            }
            int max2 = Math.max(i3, i);
            i = (max + max2) % this.mAnimatedDrawableBackend.getFrameCount();
            cancelFuturesOutsideOfRange(max, i);
            if (!shouldKeepAllFramesInMemory()) {
                this.mBitmapsToKeepCached.setAll(true);
                this.mBitmapsToKeepCached.removeOutsideRange(max, i);
                for (i = max; i >= 0; i--) {
                    if (this.mCachedBitmaps.get(i) != null) {
                        this.mBitmapsToKeepCached.set(i, true);
                        break;
                    }
                }
                dropBitmapsThatShouldNotBeCached();
            }
            if (this.mAnimatedDrawableOptions.allowPrefetching) {
                doPrefetch(max, max2);
            } else {
                cancelFuturesOutsideOfRange(this.mCurrentFrameIndex, this.mCurrentFrameIndex);
            }
        }
    }

    private boolean shouldKeepAllFramesInMemory() {
        return this.mAnimatedDrawableOptions.forceKeepAllFramesInMemory || this.mApproxKiloBytesToHoldAllFrames < this.mMaximumKiloBytes;
    }

    public void appendDebugOptionString(StringBuilder stringBuilder) {
        if (this.mAnimatedDrawableOptions.forceKeepAllFramesInMemory) {
            stringBuilder.append("Pinned To Memory");
        } else {
            if (this.mApproxKiloBytesToHoldAllFrames < this.mMaximumKiloBytes) {
                stringBuilder.append("within ");
            } else {
                stringBuilder.append("exceeds ");
            }
            this.mAnimatedDrawableUtil.appendMemoryString(stringBuilder, (int) this.mMaximumKiloBytes);
        }
        if (shouldKeepAllFramesInMemory() && this.mAnimatedDrawableOptions.allowPrefetching) {
            stringBuilder.append(" MT");
        }
    }

    public synchronized void dropCaches() {
        this.mBitmapsToKeepCached.setAll(false);
        dropBitmapsThatShouldNotBeCached();
        for (Bitmap recycle : this.mFreeBitmaps) {
            recycle.recycle();
            sTotalBitmaps.decrementAndGet();
        }
        this.mFreeBitmaps.clear();
        this.mAnimatedDrawableBackend.dropCaches();
        FLog.v(TAG, "Total bitmaps: %d", Integer.valueOf(sTotalBitmaps.get()));
    }

    protected synchronized void finalize() {
        super.finalize();
        if (this.mCachedBitmaps.size() > 0) {
            FLog.d(TAG, "Finalizing with rendered bitmaps");
        }
        sTotalBitmaps.addAndGet(-this.mFreeBitmaps.size());
        this.mFreeBitmaps.clear();
    }

    public AnimatedDrawableCachingBackend forNewBounds(Rect rect) {
        AnimatedDrawableBackend forNewBounds = this.mAnimatedDrawableBackend.forNewBounds(rect);
        return forNewBounds == this.mAnimatedDrawableBackend ? this : new AnimatedDrawableCachingBackendImpl(this.mExecutorService, this.mActivityManager, this.mAnimatedDrawableUtil, this.mMonotonicClock, forNewBounds, this.mAnimatedDrawableOptions);
    }

    public CloseableReference<Bitmap> getBitmapForFrame(int i) {
        this.mCurrentFrameIndex = i;
        CloseableReference<Bitmap> bitmapForFrameInternal = getBitmapForFrameInternal(i, false);
        schedulePrefetches();
        return bitmapForFrameInternal;
    }

    @VisibleForTesting
    CloseableReference<Bitmap> getBitmapForFrameBlocking(int i) {
        this.mCurrentFrameIndex = i;
        CloseableReference<Bitmap> bitmapForFrameInternal = getBitmapForFrameInternal(i, true);
        schedulePrefetches();
        return bitmapForFrameInternal;
    }

    @VisibleForTesting
    synchronized Map<Integer, l<?>> getDecodesInFlight() {
        Map<Integer, l<?>> hashMap;
        hashMap = new HashMap();
        for (int i = 0; i < this.mDecodesInFlight.size(); i++) {
            hashMap.put(Integer.valueOf(this.mDecodesInFlight.keyAt(i)), this.mDecodesInFlight.valueAt(i));
        }
        return hashMap;
    }

    @VisibleForTesting
    synchronized Set<Integer> getFramesCached() {
        Set<Integer> hashSet;
        hashSet = new HashSet();
        for (int i = 0; i < this.mCachedBitmaps.size(); i++) {
            hashSet.add(Integer.valueOf(this.mCachedBitmaps.keyAt(i)));
        }
        return hashSet;
    }

    public int getMemoryUsage() {
        int i;
        int i2 = 0;
        synchronized (this) {
            i = 0;
            for (Bitmap sizeOfBitmap : this.mFreeBitmaps) {
                i += this.mAnimatedDrawableUtil.getSizeOfBitmap(sizeOfBitmap);
            }
            while (i2 < this.mCachedBitmaps.size()) {
                i += this.mAnimatedDrawableUtil.getSizeOfBitmap((Bitmap) ((CloseableReference) this.mCachedBitmaps.valueAt(i2)).get());
                i2++;
            }
        }
        return this.mAnimatedDrawableBackend.getMemoryUsage() + i;
    }

    public CloseableReference<Bitmap> getPreviewBitmap() {
        return getAnimatedImageResult().getPreviewBitmap();
    }

    synchronized void releaseBitmapInternal(Bitmap bitmap) {
        this.mFreeBitmaps.add(bitmap);
    }

    public void renderFrame(int i, Canvas canvas) {
        throw new IllegalStateException();
    }
}
