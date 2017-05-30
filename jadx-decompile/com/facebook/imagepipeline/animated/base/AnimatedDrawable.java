package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.a.a.q;
import com.a.a.q.b;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.time.MonotonicClock;
import com.facebook.drawable.base.DrawableWithCaches;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AnimatedDrawable extends Drawable implements DrawableWithCaches, AnimatableDrawable {
    private static final int NO_FRAME = -1;
    private static final int POLL_FOR_RENDERED_FRAME_MS = 5;
    private static final Class<?> TAG = AnimatedDrawable.class;
    private static final long WATCH_DOG_TIMER_MIN_TIMEOUT_MS = 1000;
    private static final long WATCH_DOG_TIMER_POLL_INTERVAL_MS = 2000;
    private AnimatedDrawableCachingBackend mAnimatedDrawableBackend;
    private final AnimatedDrawableDiagnostics mAnimatedDrawableDiagnostics;
    private boolean mApplyTransformation;
    private final Rect mDstRect = new Rect();
    private final int mDurationMs;
    private final int mFrameCount;
    private boolean mHaveWatchdogScheduled;
    private final Runnable mInvalidateTask = new Runnable() {
        public void run() {
            FLog.v(AnimatedDrawable.TAG, "(%s) Invalidate Task", AnimatedDrawable.this.mLogId);
            AnimatedDrawable.this.mInvalidateTaskScheduled = false;
            AnimatedDrawable.this.doInvalidateSelf();
        }
    };
    private boolean mInvalidateTaskScheduled;
    private boolean mIsRunning;
    private CloseableReference<Bitmap> mLastDrawnFrame;
    private int mLastDrawnFrameMonotonicNumber = -1;
    private int mLastDrawnFrameNumber = -1;
    private long mLastInvalidateTimeMs = -1;
    private volatile String mLogId;
    private final MonotonicClock mMonotonicClock;
    private final Runnable mNextFrameTask = new Runnable() {
        public void run() {
            FLog.v(AnimatedDrawable.TAG, "(%s) Next Frame Task", AnimatedDrawable.this.mLogId);
            AnimatedDrawable.this.onNextFrame();
        }
    };
    private long mNextFrameTaskMs = -1;
    private final Paint mPaint = new Paint(6);
    private int mPendingRenderedFrameMonotonicNumber;
    private int mPendingRenderedFrameNumber;
    private final ScheduledExecutorService mScheduledExecutorServiceForUiThread;
    private int mScheduledFrameMonotonicNumber;
    private int mScheduledFrameNumber;
    private final Runnable mStartTask = new Runnable() {
        public void run() {
            AnimatedDrawable.this.onStart();
        }
    };
    private long mStartTimeMs;
    private float mSx = 1.0f;
    private float mSy = 1.0f;
    private final int mTotalLoops;
    private final Paint mTransparentPaint;
    private boolean mWaitingForDraw;
    private final Runnable mWatchdogTask = new Runnable() {
        public void run() {
            FLog.v(AnimatedDrawable.TAG, "(%s) Watchdog Task", AnimatedDrawable.this.mLogId);
            AnimatedDrawable.this.doWatchdogCheck();
        }
    };

    public AnimatedDrawable(ScheduledExecutorService scheduledExecutorService, AnimatedDrawableCachingBackend animatedDrawableCachingBackend, AnimatedDrawableDiagnostics animatedDrawableDiagnostics, MonotonicClock monotonicClock) {
        this.mScheduledExecutorServiceForUiThread = scheduledExecutorService;
        this.mAnimatedDrawableBackend = animatedDrawableCachingBackend;
        this.mAnimatedDrawableDiagnostics = animatedDrawableDiagnostics;
        this.mMonotonicClock = monotonicClock;
        this.mDurationMs = this.mAnimatedDrawableBackend.getDurationMs();
        this.mFrameCount = this.mAnimatedDrawableBackend.getFrameCount();
        this.mAnimatedDrawableDiagnostics.setBackend(this.mAnimatedDrawableBackend);
        this.mTotalLoops = this.mAnimatedDrawableBackend.getLoopCount();
        this.mTransparentPaint = new Paint();
        this.mTransparentPaint.setColor(0);
        this.mTransparentPaint.setStyle(Style.FILL);
        resetToPreviewFrame();
    }

    private void computeAndScheduleNextFrame(boolean z) {
        if (this.mDurationMs != 0) {
            long now = this.mMonotonicClock.now();
            int i = (int) ((now - this.mStartTimeMs) / ((long) this.mDurationMs));
            if (this.mTotalLoops <= 0 || i < this.mTotalLoops) {
                int i2 = (int) ((now - this.mStartTimeMs) % ((long) this.mDurationMs));
                int frameForTimestampMs = this.mAnimatedDrawableBackend.getFrameForTimestampMs(i2);
                Object obj = this.mScheduledFrameNumber != frameForTimestampMs ? 1 : null;
                this.mScheduledFrameNumber = frameForTimestampMs;
                this.mScheduledFrameMonotonicNumber = (i * this.mFrameCount) + frameForTimestampMs;
                if (!z) {
                    return;
                }
                if (obj != null) {
                    doInvalidateSelf();
                    return;
                }
                int timestampMsForFrame = (this.mAnimatedDrawableBackend.getTimestampMsForFrame(this.mScheduledFrameNumber) + this.mAnimatedDrawableBackend.getDurationMsForFrame(this.mScheduledFrameNumber)) - i2;
                i = (this.mScheduledFrameNumber + 1) % this.mFrameCount;
                now += (long) timestampMsForFrame;
                if (this.mNextFrameTaskMs == -1 || this.mNextFrameTaskMs > now) {
                    FLog.v(TAG, "(%s) Next frame (%d) in %d ms", this.mLogId, Integer.valueOf(i), Integer.valueOf(timestampMsForFrame));
                    unscheduleSelf(this.mNextFrameTask);
                    scheduleSelf(this.mNextFrameTask, now);
                    this.mNextFrameTaskMs = now;
                }
            }
        }
    }

    private void doInvalidateSelf() {
        this.mWaitingForDraw = true;
        this.mLastInvalidateTimeMs = this.mMonotonicClock.now();
        invalidateSelf();
    }

    private void doWatchdogCheck() {
        boolean z = false;
        this.mHaveWatchdogScheduled = false;
        if (this.mIsRunning) {
            long now = this.mMonotonicClock.now();
            boolean z2 = this.mWaitingForDraw && now - this.mLastInvalidateTimeMs > 1000;
            if (this.mNextFrameTaskMs != -1 && now - this.mNextFrameTaskMs > 1000) {
                z = true;
            }
            if (z2 || r2) {
                dropCaches();
                doInvalidateSelf();
                return;
            }
            this.mScheduledExecutorServiceForUiThread.schedule(this.mWatchdogTask, WATCH_DOG_TIMER_POLL_INTERVAL_MS, TimeUnit.MILLISECONDS);
            this.mHaveWatchdogScheduled = true;
        }
    }

    private void onNextFrame() {
        this.mNextFrameTaskMs = -1;
        if (this.mIsRunning && this.mDurationMs != 0) {
            this.mAnimatedDrawableDiagnostics.onNextFrameMethodBegin();
            try {
                computeAndScheduleNextFrame(true);
            } finally {
                this.mAnimatedDrawableDiagnostics.onNextFrameMethodEnd();
            }
        }
    }

    private void onStart() {
        if (this.mIsRunning) {
            this.mAnimatedDrawableDiagnostics.onStartMethodBegin();
            try {
                this.mStartTimeMs = this.mMonotonicClock.now();
                this.mScheduledFrameNumber = 0;
                this.mScheduledFrameMonotonicNumber = 0;
                long durationMsForFrame = this.mStartTimeMs + ((long) this.mAnimatedDrawableBackend.getDurationMsForFrame(0));
                scheduleSelf(this.mNextFrameTask, durationMsForFrame);
                this.mNextFrameTaskMs = durationMsForFrame;
                doInvalidateSelf();
            } finally {
                this.mAnimatedDrawableDiagnostics.onStartMethodEnd();
            }
        }
    }

    private boolean renderFrame(Canvas canvas, int i, int i2) {
        CloseableReference bitmapForFrame = this.mAnimatedDrawableBackend.getBitmapForFrame(i);
        if (bitmapForFrame == null) {
            return false;
        }
        canvas.drawBitmap((Bitmap) bitmapForFrame.get(), 0.0f, 0.0f, this.mPaint);
        if (this.mLastDrawnFrame != null) {
            this.mLastDrawnFrame.close();
        }
        if (this.mIsRunning && i2 > this.mLastDrawnFrameMonotonicNumber) {
            int i3 = (i2 - this.mLastDrawnFrameMonotonicNumber) - 1;
            this.mAnimatedDrawableDiagnostics.incrementDrawnFrames(1);
            this.mAnimatedDrawableDiagnostics.incrementDroppedFrames(i3);
            if (i3 > 0) {
                FLog.v(TAG, "(%s) Dropped %d frames", this.mLogId, Integer.valueOf(i3));
            }
        }
        this.mLastDrawnFrame = bitmapForFrame;
        this.mLastDrawnFrameNumber = i;
        this.mLastDrawnFrameMonotonicNumber = i2;
        FLog.v(TAG, "(%s) Drew frame %d", this.mLogId, Integer.valueOf(i));
        return true;
    }

    private void resetToPreviewFrame() {
        this.mScheduledFrameNumber = this.mAnimatedDrawableBackend.getFrameForPreview();
        this.mScheduledFrameMonotonicNumber = this.mScheduledFrameNumber;
        this.mPendingRenderedFrameNumber = -1;
        this.mPendingRenderedFrameMonotonicNumber = -1;
    }

    private void scheduleInvalidatePoll() {
        if (!this.mInvalidateTaskScheduled) {
            this.mInvalidateTaskScheduled = true;
            scheduleSelf(this.mInvalidateTask, 5);
        }
    }

    public b createAnimatorUpdateListener() {
        return new b() {
            public void onAnimationUpdate(q qVar) {
                AnimatedDrawable.this.setLevel(((Integer) qVar.u()).intValue());
            }
        };
    }

    public q createValueAnimator() {
        int loopCount = this.mAnimatedDrawableBackend.getLoopCount();
        q qVar = new q();
        qVar.a(0, this.mDurationMs);
        qVar.d((long) this.mDurationMs);
        if (loopCount == 0) {
            loopCount = -1;
        }
        qVar.a(loopCount);
        qVar.b(1);
        qVar.a(new LinearInterpolator());
        qVar.a(createAnimatorUpdateListener());
        return qVar;
    }

    public q createValueAnimator(int i) {
        q createValueAnimator = createValueAnimator();
        createValueAnimator.a(Math.max(i / this.mAnimatedDrawableBackend.getDurationMs(), 1));
        return createValueAnimator;
    }

    public boolean didLastDrawRender() {
        return this.mLastDrawnFrame != null;
    }

    public void draw(Canvas canvas) {
        int i = 0;
        this.mAnimatedDrawableDiagnostics.onDrawMethodBegin();
        try {
            this.mWaitingForDraw = false;
            if (this.mIsRunning && !this.mHaveWatchdogScheduled) {
                this.mScheduledExecutorServiceForUiThread.schedule(this.mWatchdogTask, WATCH_DOG_TIMER_POLL_INTERVAL_MS, TimeUnit.MILLISECONDS);
                this.mHaveWatchdogScheduled = true;
            }
            if (this.mApplyTransformation) {
                this.mDstRect.set(getBounds());
                if (!this.mDstRect.isEmpty()) {
                    AnimatedDrawableCachingBackend forNewBounds = this.mAnimatedDrawableBackend.forNewBounds(this.mDstRect);
                    if (forNewBounds != this.mAnimatedDrawableBackend) {
                        this.mAnimatedDrawableBackend.dropCaches();
                        this.mAnimatedDrawableBackend = forNewBounds;
                        this.mAnimatedDrawableDiagnostics.setBackend(forNewBounds);
                    }
                    this.mSx = ((float) this.mDstRect.width()) / ((float) this.mAnimatedDrawableBackend.getRenderedWidth());
                    this.mSy = ((float) this.mDstRect.height()) / ((float) this.mAnimatedDrawableBackend.getRenderedHeight());
                    this.mApplyTransformation = false;
                }
            }
            if (!this.mDstRect.isEmpty()) {
                boolean renderFrame;
                canvas.save();
                canvas.scale(this.mSx, this.mSy);
                if (this.mPendingRenderedFrameNumber != -1) {
                    renderFrame = renderFrame(canvas, this.mPendingRenderedFrameNumber, this.mPendingRenderedFrameMonotonicNumber);
                    i = 0 | renderFrame;
                    if (renderFrame) {
                        FLog.v(TAG, "(%s) Rendered pending frame %d", this.mLogId, Integer.valueOf(this.mPendingRenderedFrameNumber));
                        this.mPendingRenderedFrameNumber = -1;
                        this.mPendingRenderedFrameMonotonicNumber = -1;
                    } else {
                        FLog.v(TAG, "(%s) Trying again later for pending %d", this.mLogId, Integer.valueOf(this.mPendingRenderedFrameNumber));
                        scheduleInvalidatePoll();
                    }
                }
                if (this.mPendingRenderedFrameNumber == -1) {
                    if (this.mIsRunning) {
                        computeAndScheduleNextFrame(false);
                    }
                    renderFrame = renderFrame(canvas, this.mScheduledFrameNumber, this.mScheduledFrameMonotonicNumber);
                    i |= renderFrame;
                    if (renderFrame) {
                        FLog.v(TAG, "(%s) Rendered current frame %d", this.mLogId, Integer.valueOf(this.mScheduledFrameNumber));
                        if (this.mIsRunning) {
                            computeAndScheduleNextFrame(true);
                        }
                    } else {
                        FLog.v(TAG, "(%s) Trying again later for current %d", this.mLogId, Integer.valueOf(this.mScheduledFrameNumber));
                        this.mPendingRenderedFrameNumber = this.mScheduledFrameNumber;
                        this.mPendingRenderedFrameMonotonicNumber = this.mScheduledFrameMonotonicNumber;
                        scheduleInvalidatePoll();
                    }
                }
                if (i == 0 && this.mLastDrawnFrame != null) {
                    canvas.drawBitmap((Bitmap) this.mLastDrawnFrame.get(), 0.0f, 0.0f, this.mPaint);
                    FLog.v(TAG, "(%s) Rendered last known frame %d", this.mLogId, Integer.valueOf(this.mLastDrawnFrameNumber));
                    i = 1;
                }
                if (i == 0) {
                    CloseableReference previewBitmap = this.mAnimatedDrawableBackend.getPreviewBitmap();
                    if (previewBitmap != null) {
                        canvas.drawBitmap((Bitmap) previewBitmap.get(), 0.0f, 0.0f, this.mPaint);
                        previewBitmap.close();
                        FLog.v(TAG, "(%s) Rendered preview frame", this.mLogId);
                        i = 1;
                    }
                }
                if (i == 0) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.mDstRect.width(), (float) this.mDstRect.height(), this.mTransparentPaint);
                    FLog.v(TAG, "(%s) Failed to draw a frame", this.mLogId);
                }
                canvas.restore();
                this.mAnimatedDrawableDiagnostics.drawDebugOverlay(canvas, this.mDstRect);
                this.mAnimatedDrawableDiagnostics.onDrawMethodEnd();
            }
        } finally {
            this.mAnimatedDrawableDiagnostics.onDrawMethodEnd();
        }
    }

    public void dropCaches() {
        FLog.v(TAG, "(%s) Dropping caches", this.mLogId);
        if (this.mLastDrawnFrame != null) {
            this.mLastDrawnFrame.close();
            this.mLastDrawnFrame = null;
            this.mLastDrawnFrameNumber = -1;
            this.mLastDrawnFrameMonotonicNumber = -1;
        }
        this.mAnimatedDrawableBackend.dropCaches();
    }

    protected void finalize() {
        super.finalize();
        if (this.mLastDrawnFrame != null) {
            this.mLastDrawnFrame.close();
            this.mLastDrawnFrame = null;
        }
    }

    public int getIntrinsicHeight() {
        return this.mAnimatedDrawableBackend.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.mAnimatedDrawableBackend.getWidth();
    }

    public int getOpacity() {
        return -3;
    }

    @VisibleForTesting
    int getScheduledFrameNumber() {
        return this.mScheduledFrameNumber;
    }

    public boolean isRunning() {
        return this.mIsRunning;
    }

    @VisibleForTesting
    boolean isWaitingForDraw() {
        return this.mWaitingForDraw;
    }

    @VisibleForTesting
    boolean isWaitingForNextFrame() {
        return this.mNextFrameTaskMs != -1;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mApplyTransformation = true;
        if (this.mLastDrawnFrame != null) {
            this.mLastDrawnFrame.close();
            this.mLastDrawnFrame = null;
        }
        this.mLastDrawnFrameNumber = -1;
        this.mLastDrawnFrameMonotonicNumber = -1;
        this.mAnimatedDrawableBackend.dropCaches();
    }

    protected boolean onLevelChange(int i) {
        if (this.mIsRunning) {
            return false;
        }
        int frameForTimestampMs = this.mAnimatedDrawableBackend.getFrameForTimestampMs(i);
        if (frameForTimestampMs == this.mScheduledFrameNumber) {
            return false;
        }
        try {
            this.mScheduledFrameNumber = frameForTimestampMs;
            this.mScheduledFrameMonotonicNumber = frameForTimestampMs;
            doInvalidateSelf();
            return true;
        } catch (IllegalStateException e) {
            return false;
        }
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
        doInvalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        doInvalidateSelf();
    }

    public void setLogId(String str) {
        this.mLogId = str;
    }

    public void start() {
        if (this.mDurationMs != 0 && this.mFrameCount > 1) {
            this.mIsRunning = true;
            scheduleSelf(this.mStartTask, this.mMonotonicClock.now());
        }
    }

    public void stop() {
        this.mIsRunning = false;
    }
}
