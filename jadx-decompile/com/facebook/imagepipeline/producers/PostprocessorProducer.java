package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessorRunner;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class PostprocessorProducer implements Producer<CloseableReference<CloseableImage>> {
    @VisibleForTesting
    static final String NAME = "PostprocessorProducer";
    @VisibleForTesting
    static final String POSTPROCESSOR = "Postprocessor";
    private final PlatformBitmapFactory mBitmapFactory;
    private final Executor mExecutor;
    private final Producer<CloseableReference<CloseableImage>> mInputProducer;

    private class PostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        @GuardedBy("PostprocessorConsumer.this")
        private boolean mIsClosed;
        @GuardedBy("PostprocessorConsumer.this")
        private boolean mIsDirty = false;
        @GuardedBy("PostprocessorConsumer.this")
        private boolean mIsLast = false;
        @GuardedBy("PostprocessorConsumer.this")
        private boolean mIsPostProcessingRunning = false;
        private final ProducerListener mListener;
        private final Postprocessor mPostprocessor;
        private final String mRequestId;
        @GuardedBy("PostprocessorConsumer.this")
        @Nullable
        private CloseableReference<CloseableImage> mSourceImageRef = null;

        public PostprocessorConsumer(Consumer<CloseableReference<CloseableImage>> consumer, ProducerListener producerListener, String str, Postprocessor postprocessor, ProducerContext producerContext) {
            super(consumer);
            this.mListener = producerListener;
            this.mRequestId = str;
            this.mPostprocessor = postprocessor;
            producerContext.addCallbacks(new BaseProducerContextCallbacks(PostprocessorProducer.this) {
                public void onCancellationRequested() {
                    PostprocessorConsumer.this.maybeNotifyOnCancellation();
                }
            });
        }

        private void clearRunningAndStartIfDirty() {
            synchronized (this) {
                this.mIsPostProcessingRunning = false;
                boolean runningIfDirtyAndNotRunning = setRunningIfDirtyAndNotRunning();
            }
            if (runningIfDirtyAndNotRunning) {
                submitPostprocessing();
            }
        }

        private boolean close() {
            boolean z = true;
            synchronized (this) {
                if (this.mIsClosed) {
                    z = false;
                } else {
                    CloseableReference closeableReference = this.mSourceImageRef;
                    this.mSourceImageRef = null;
                    this.mIsClosed = true;
                    CloseableReference.closeSafely(closeableReference);
                }
            }
            return z;
        }

        private void doPostprocessing(CloseableReference<CloseableImage> closeableReference, boolean z) {
            Preconditions.checkArgument(CloseableReference.isValid(closeableReference));
            if (shouldPostprocess((CloseableImage) closeableReference.get())) {
                this.mListener.onProducerStart(this.mRequestId, PostprocessorProducer.NAME);
                CloseableReference closeableReference2 = null;
                try {
                    closeableReference2 = postprocessInternal((CloseableImage) closeableReference.get());
                    this.mListener.onProducerFinishWithSuccess(this.mRequestId, PostprocessorProducer.NAME, getExtraMap(this.mListener, this.mRequestId, this.mPostprocessor));
                    maybeNotifyOnNewResult(closeableReference2, z);
                } catch (Throwable e) {
                    this.mListener.onProducerFinishWithFailure(this.mRequestId, PostprocessorProducer.NAME, e, getExtraMap(this.mListener, this.mRequestId, this.mPostprocessor));
                    maybeNotifyOnFailure(e);
                } finally {
                    CloseableReference.closeSafely(closeableReference2);
                }
            } else {
                maybeNotifyOnNewResult(closeableReference, z);
            }
        }

        private Map<String, String> getExtraMap(ProducerListener producerListener, String str, Postprocessor postprocessor) {
            return !producerListener.requiresExtraMap(str) ? null : ImmutableMap.of(PostprocessorProducer.POSTPROCESSOR, postprocessor.getName());
        }

        private synchronized boolean isClosed() {
            return this.mIsClosed;
        }

        private void maybeNotifyOnCancellation() {
            if (close()) {
                getConsumer().onCancellation();
            }
        }

        private void maybeNotifyOnFailure(Throwable th) {
            if (close()) {
                getConsumer().onFailure(th);
            }
        }

        private void maybeNotifyOnNewResult(CloseableReference<CloseableImage> closeableReference, boolean z) {
            if ((!z && !isClosed()) || (z && close())) {
                getConsumer().onNewResult(closeableReference, z);
            }
        }

        private CloseableReference<CloseableImage> postprocessInternal(CloseableImage closeableImage) {
            CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
            CloseableReference process = this.mPostprocessor.process(closeableStaticBitmap.getUnderlyingBitmap(), PostprocessorProducer.this.mBitmapFactory);
            try {
                CloseableReference<CloseableImage> of = CloseableReference.of(new CloseableStaticBitmap(process, closeableImage.getQualityInfo(), closeableStaticBitmap.getRotationAngle()));
                return of;
            } finally {
                CloseableReference.closeSafely(process);
            }
        }

        private synchronized boolean setRunningIfDirtyAndNotRunning() {
            boolean z = true;
            synchronized (this) {
                if (this.mIsClosed || !this.mIsDirty || this.mIsPostProcessingRunning || !CloseableReference.isValid(this.mSourceImageRef)) {
                    z = false;
                } else {
                    this.mIsPostProcessingRunning = true;
                }
            }
            return z;
        }

        private boolean shouldPostprocess(CloseableImage closeableImage) {
            return closeableImage instanceof CloseableStaticBitmap;
        }

        private void submitPostprocessing() {
            PostprocessorProducer.this.mExecutor.execute(new Runnable() {
                public void run() {
                    synchronized (PostprocessorConsumer.this) {
                        CloseableReference access$300 = PostprocessorConsumer.this.mSourceImageRef;
                        boolean access$400 = PostprocessorConsumer.this.mIsLast;
                        PostprocessorConsumer.this.mSourceImageRef = null;
                        PostprocessorConsumer.this.mIsDirty = false;
                    }
                    if (CloseableReference.isValid(access$300)) {
                        try {
                            PostprocessorConsumer.this.doPostprocessing(access$300, access$400);
                        } finally {
                            CloseableReference.closeSafely(access$300);
                        }
                    }
                    PostprocessorConsumer.this.clearRunningAndStartIfDirty();
                }
            });
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void updateSourceImageRef(@javax.annotation.Nullable com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage> r3, boolean r4) {
            /*
            r2 = this;
            monitor-enter(r2);
            r0 = r2.mIsClosed;	 Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        L_0x0006:
            return;
        L_0x0007:
            r0 = r2.mSourceImageRef;	 Catch:{ all -> 0x0022 }
            r1 = com.facebook.common.references.CloseableReference.cloneOrNull(r3);	 Catch:{ all -> 0x0022 }
            r2.mSourceImageRef = r1;	 Catch:{ all -> 0x0022 }
            r2.mIsLast = r4;	 Catch:{ all -> 0x0022 }
            r1 = 1;
            r2.mIsDirty = r1;	 Catch:{ all -> 0x0022 }
            r1 = r2.setRunningIfDirtyAndNotRunning();	 Catch:{ all -> 0x0022 }
            monitor-exit(r2);	 Catch:{ all -> 0x0022 }
            com.facebook.common.references.CloseableReference.closeSafely(r0);
            if (r1 == 0) goto L_0x0006;
        L_0x001e:
            r2.submitPostprocessing();
            goto L_0x0006;
        L_0x0022:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0022 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.PostprocessorProducer.PostprocessorConsumer.updateSourceImageRef(com.facebook.common.references.CloseableReference, boolean):void");
        }

        protected void onCancellationImpl() {
            maybeNotifyOnCancellation();
        }

        protected void onFailureImpl(Throwable th) {
            maybeNotifyOnFailure(th);
        }

        protected void onNewResultImpl(CloseableReference<CloseableImage> closeableReference, boolean z) {
            if (CloseableReference.isValid(closeableReference)) {
                updateSourceImageRef(closeableReference, z);
            } else if (z) {
                maybeNotifyOnNewResult(null, true);
            }
        }
    }

    class RepeatedPostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> implements RepeatedPostprocessorRunner {
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        private boolean mIsClosed;
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        @Nullable
        private CloseableReference<CloseableImage> mSourceImageRef;

        private RepeatedPostprocessorConsumer(PostprocessorConsumer postprocessorConsumer, RepeatedPostprocessor repeatedPostprocessor, ProducerContext producerContext) {
            super(postprocessorConsumer);
            this.mIsClosed = false;
            this.mSourceImageRef = null;
            repeatedPostprocessor.setCallback(this);
            producerContext.addCallbacks(new BaseProducerContextCallbacks(PostprocessorProducer.this) {
                public void onCancellationRequested() {
                    if (RepeatedPostprocessorConsumer.this.close()) {
                        RepeatedPostprocessorConsumer.this.getConsumer().onCancellation();
                    }
                }
            });
        }

        private boolean close() {
            boolean z = true;
            synchronized (this) {
                if (this.mIsClosed) {
                    z = false;
                } else {
                    CloseableReference closeableReference = this.mSourceImageRef;
                    this.mSourceImageRef = null;
                    this.mIsClosed = true;
                    CloseableReference.closeSafely(closeableReference);
                }
            }
            return z;
        }

        private void setSourceImageRef(CloseableReference<CloseableImage> closeableReference) {
            synchronized (this) {
                if (this.mIsClosed) {
                    return;
                }
                CloseableReference closeableReference2 = this.mSourceImageRef;
                this.mSourceImageRef = CloseableReference.cloneOrNull((CloseableReference) closeableReference);
                CloseableReference.closeSafely(closeableReference2);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void updateInternal() {
            /*
            r3 = this;
            monitor-enter(r3);
            r0 = r3.mIsClosed;	 Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r3);	 Catch:{ all -> 0x001a }
        L_0x0006:
            return;
        L_0x0007:
            r0 = r3.mSourceImageRef;	 Catch:{ all -> 0x001a }
            r1 = com.facebook.common.references.CloseableReference.cloneOrNull(r0);	 Catch:{ all -> 0x001a }
            monitor-exit(r3);	 Catch:{ all -> 0x001a }
            r0 = r3.getConsumer();	 Catch:{ all -> 0x001d }
            r2 = 0;
            r0.onNewResult(r1, r2);	 Catch:{ all -> 0x001d }
            com.facebook.common.references.CloseableReference.closeSafely(r1);
            goto L_0x0006;
        L_0x001a:
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x001a }
            throw r0;
        L_0x001d:
            r0 = move-exception;
            com.facebook.common.references.CloseableReference.closeSafely(r1);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.PostprocessorProducer.RepeatedPostprocessorConsumer.updateInternal():void");
        }

        protected void onCancellationImpl() {
            if (close()) {
                getConsumer().onCancellation();
            }
        }

        protected void onFailureImpl(Throwable th) {
            if (close()) {
                getConsumer().onFailure(th);
            }
        }

        protected void onNewResultImpl(CloseableReference<CloseableImage> closeableReference, boolean z) {
            if (z) {
                setSourceImageRef(closeableReference);
                updateInternal();
            }
        }

        public synchronized void update() {
            updateInternal();
        }
    }

    class SingleUsePostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        private SingleUsePostprocessorConsumer(PostprocessorConsumer postprocessorConsumer) {
            super(postprocessorConsumer);
        }

        protected void onNewResultImpl(CloseableReference<CloseableImage> closeableReference, boolean z) {
            if (z) {
                getConsumer().onNewResult(closeableReference, z);
            }
        }
    }

    public PostprocessorProducer(Producer<CloseableReference<CloseableImage>> producer, PlatformBitmapFactory platformBitmapFactory, Executor executor) {
        this.mInputProducer = (Producer) Preconditions.checkNotNull(producer);
        this.mBitmapFactory = platformBitmapFactory;
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
    }

    public void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext producerContext) {
        Consumer repeatedPostprocessorConsumer;
        ProducerListener listener = producerContext.getListener();
        Postprocessor postprocessor = producerContext.getImageRequest().getPostprocessor();
        PostprocessorConsumer postprocessorConsumer = new PostprocessorConsumer(consumer, listener, producerContext.getId(), postprocessor, producerContext);
        if (postprocessor instanceof RepeatedPostprocessor) {
            repeatedPostprocessorConsumer = new RepeatedPostprocessorConsumer(postprocessorConsumer, (RepeatedPostprocessor) postprocessor, producerContext);
        } else {
            repeatedPostprocessorConsumer = new SingleUsePostprocessorConsumer(postprocessorConsumer);
        }
        this.mInputProducer.produceResults(repeatedPostprocessorConsumer, producerContext);
    }
}
