package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.SimpleBitmapReleaser;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.Executor;

public class LocalVideoThumbnailProducer implements Producer<CloseableReference<CloseableImage>> {
    @VisibleForTesting
    static final String CREATED_THUMBNAIL = "createdThumbnail";
    @VisibleForTesting
    static final String PRODUCER_NAME = "VideoThumbnailProducer";
    private final Executor mExecutor;

    public LocalVideoThumbnailProducer(Executor executor) {
        this.mExecutor = executor;
    }

    private static int calculateKind(ImageRequest imageRequest) {
        return (imageRequest.getPreferredWidth() > 96 || imageRequest.getPreferredHeight() > 96) ? 1 : 3;
    }

    public void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext producerContext) {
        ProducerListener listener = producerContext.getListener();
        String id = producerContext.getId();
        final ImageRequest imageRequest = producerContext.getImageRequest();
        final Runnable anonymousClass1 = new StatefulProducerRunnable<CloseableReference<CloseableImage>>(consumer, listener, PRODUCER_NAME, id) {
            protected void disposeResult(CloseableReference<CloseableImage> closeableReference) {
                CloseableReference.closeSafely((CloseableReference) closeableReference);
            }

            protected Map<String, String> getExtraMapOnSuccess(CloseableReference<CloseableImage> closeableReference) {
                return ImmutableMap.of(LocalVideoThumbnailProducer.CREATED_THUMBNAIL, String.valueOf(closeableReference != null));
            }

            protected CloseableReference<CloseableImage> getResult() {
                Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(imageRequest.getSourceFile().getPath(), LocalVideoThumbnailProducer.calculateKind(imageRequest));
                return createVideoThumbnail == null ? null : CloseableReference.of(new CloseableStaticBitmap(createVideoThumbnail, SimpleBitmapReleaser.getInstance(), ImmutableQualityInfo.FULL_QUALITY, 0));
            }
        };
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            public void onCancellationRequested() {
                anonymousClass1.cancel();
            }
        });
        this.mExecutor.execute(anonymousClass1);
    }
}
