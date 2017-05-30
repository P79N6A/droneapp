package com.facebook.imagepipeline.producers;

import android.os.Build.VERSION;
import com.facebook.common.internal.Closeables;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.Executor;

public abstract class LocalFetchProducer implements Producer<EncodedImage> {
    private final boolean mDecodeFileDescriptorEnabledForKitKat;
    private final Executor mExecutor;
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    protected LocalFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, boolean z) {
        this.mExecutor = executor;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        boolean z2 = z && VERSION.SDK_INT == 19;
        this.mDecodeFileDescriptorEnabledForKitKat = z2;
    }

    protected EncodedImage getByteBufferBackedEncodedImage(InputStream inputStream, int i) {
        CloseableReference closeableReference = null;
        if (i < 0) {
            try {
                closeableReference = CloseableReference.of(this.mPooledByteBufferFactory.newByteBuffer(inputStream));
            } catch (Throwable th) {
                Closeables.closeQuietly(inputStream);
                CloseableReference.closeSafely(closeableReference);
            }
        } else {
            closeableReference = CloseableReference.of(this.mPooledByteBufferFactory.newByteBuffer(inputStream, i));
        }
        EncodedImage encodedImage = new EncodedImage(closeableReference);
        Closeables.closeQuietly(inputStream);
        CloseableReference.closeSafely(closeableReference);
        return encodedImage;
    }

    protected abstract EncodedImage getEncodedImage(ImageRequest imageRequest);

    protected EncodedImage getEncodedImage(InputStream inputStream, int i) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        return (this.mDecodeFileDescriptorEnabledForKitKat && (inputStream instanceof FileInputStream) && maxMemory >= Math.min(maxMemory - (runtime.totalMemory() - runtime.freeMemory()), 8388608) * 64) ? getInputStreamBackedEncodedImage(new File(inputStream.toString()), i) : getByteBufferBackedEncodedImage(inputStream, i);
    }

    protected EncodedImage getInputStreamBackedEncodedImage(final File file, int i) {
        return new EncodedImage(new Supplier<FileInputStream>() {
            public FileInputStream get() {
                try {
                    return new FileInputStream(file);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }, i);
    }

    protected abstract String getProducerName();

    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        ProducerListener listener = producerContext.getListener();
        String id = producerContext.getId();
        final ImageRequest imageRequest = producerContext.getImageRequest();
        final Runnable anonymousClass1 = new StatefulProducerRunnable<EncodedImage>(consumer, listener, getProducerName(), id) {
            protected void disposeResult(EncodedImage encodedImage) {
                EncodedImage.closeSafely(encodedImage);
            }

            protected EncodedImage getResult() {
                EncodedImage encodedImage = LocalFetchProducer.this.getEncodedImage(imageRequest);
                if (encodedImage == null) {
                    return null;
                }
                encodedImage.parseMetaData();
                return encodedImage;
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
