package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.TriState;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.memory.PooledByteBufferOutputStream;
import com.facebook.imagepipeline.nativecode.WebpTranscoder;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class WebpTranscodeProducer implements Producer<EncodedImage> {
    private static final int DEFAULT_JPEG_QUALITY = 80;
    private static final String PRODUCER_NAME = "WebpTranscodeProducer";
    private final Executor mExecutor;
    private final Producer<EncodedImage> mInputProducer;
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    private class WebpTranscodeConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private final ProducerContext mContext;
        private TriState mShouldTranscodeWhenFinished = TriState.UNSET;

        public WebpTranscodeConsumer(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
            super(consumer);
            this.mContext = producerContext;
        }

        protected void onNewResultImpl(@Nullable EncodedImage encodedImage, boolean z) {
            if (this.mShouldTranscodeWhenFinished == TriState.UNSET && encodedImage != null) {
                this.mShouldTranscodeWhenFinished = WebpTranscodeProducer.shouldTranscode(encodedImage);
            }
            if (this.mShouldTranscodeWhenFinished == TriState.NO) {
                getConsumer().onNewResult(encodedImage, z);
            } else if (!z) {
            } else {
                if (this.mShouldTranscodeWhenFinished != TriState.YES || encodedImage == null) {
                    getConsumer().onNewResult(encodedImage, z);
                } else {
                    WebpTranscodeProducer.this.transcodeLastResult(encodedImage, getConsumer(), this.mContext);
                }
            }
        }
    }

    public WebpTranscodeProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, Producer<EncodedImage> producer) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mPooledByteBufferFactory = (PooledByteBufferFactory) Preconditions.checkNotNull(pooledByteBufferFactory);
        this.mInputProducer = (Producer) Preconditions.checkNotNull(producer);
    }

    private static void doTranscode(EncodedImage encodedImage, PooledByteBufferOutputStream pooledByteBufferOutputStream) {
        InputStream inputStream = encodedImage.getInputStream();
        switch (ImageFormatChecker.getImageFormat_WrapIOException(inputStream)) {
            case WEBP_SIMPLE:
            case WEBP_EXTENDED:
                WebpTranscoder.transcodeWebpToJpeg(inputStream, pooledByteBufferOutputStream, 80);
                return;
            case WEBP_LOSSLESS:
            case WEBP_EXTENDED_WITH_ALPHA:
                WebpTranscoder.transcodeWebpToPng(inputStream, pooledByteBufferOutputStream);
                return;
            default:
                throw new IllegalArgumentException("Wrong image format");
        }
    }

    private static TriState shouldTranscode(EncodedImage encodedImage) {
        Preconditions.checkNotNull(encodedImage);
        ImageFormat imageFormat_WrapIOException = ImageFormatChecker.getImageFormat_WrapIOException(encodedImage.getInputStream());
        switch (imageFormat_WrapIOException) {
            case WEBP_SIMPLE:
            case WEBP_LOSSLESS:
            case WEBP_EXTENDED:
            case WEBP_EXTENDED_WITH_ALPHA:
                return TriState.valueOf(!WebpTranscoder.isWebpNativelySupported(imageFormat_WrapIOException));
            case UNKNOWN:
                return TriState.UNSET;
            default:
                return TriState.NO;
        }
    }

    private void transcodeLastResult(EncodedImage encodedImage, Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        Preconditions.checkNotNull(encodedImage);
        final EncodedImage cloneOrNull = EncodedImage.cloneOrNull(encodedImage);
        this.mExecutor.execute(new StatefulProducerRunnable<EncodedImage>(consumer, producerContext.getListener(), PRODUCER_NAME, producerContext.getId()) {
            protected void disposeResult(EncodedImage encodedImage) {
                EncodedImage.closeSafely(encodedImage);
            }

            protected EncodedImage getResult() {
                CloseableReference of;
                PooledByteBufferOutputStream newOutputStream = WebpTranscodeProducer.this.mPooledByteBufferFactory.newOutputStream();
                try {
                    WebpTranscodeProducer.doTranscode(cloneOrNull, newOutputStream);
                    of = CloseableReference.of(newOutputStream.toByteBuffer());
                    EncodedImage encodedImage = new EncodedImage(of);
                    encodedImage.copyMetaDataFrom(cloneOrNull);
                    CloseableReference.closeSafely(of);
                    newOutputStream.close();
                    return encodedImage;
                } catch (Throwable th) {
                    newOutputStream.close();
                }
            }

            protected void onCancellation() {
                EncodedImage.closeSafely(cloneOrNull);
                super.onCancellation();
            }

            protected void onFailure(Exception exception) {
                EncodedImage.closeSafely(cloneOrNull);
                super.onFailure(exception);
            }

            protected void onSuccess(EncodedImage encodedImage) {
                EncodedImage.closeSafely(cloneOrNull);
                super.onSuccess(encodedImage);
            }
        });
    }

    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        this.mInputProducer.produceResults(new WebpTranscodeConsumer(consumer, producerContext), producerContext);
    }
}