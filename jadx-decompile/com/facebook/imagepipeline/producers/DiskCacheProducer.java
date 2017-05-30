package com.facebook.imagepipeline.producers;

import a.j;
import a.l;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.ImageType;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public class DiskCacheProducer implements Producer<EncodedImage> {
    @VisibleForTesting
    static final String PRODUCER_NAME = "DiskCacheProducer";
    @VisibleForTesting
    static final String VALUE_FOUND = "cached_value_found";
    private final CacheKeyFactory mCacheKeyFactory;
    private final BufferedDiskCache mDefaultBufferedDiskCache;
    private final Producer<EncodedImage> mInputProducer;
    private final BufferedDiskCache mSmallImageBufferedDiskCache;

    private class DiskCacheConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        private final BufferedDiskCache mCache;
        private final CacheKey mCacheKey;

        private DiskCacheConsumer(Consumer<EncodedImage> consumer, BufferedDiskCache bufferedDiskCache, CacheKey cacheKey) {
            super(consumer);
            this.mCache = bufferedDiskCache;
            this.mCacheKey = cacheKey;
        }

        public void onNewResultImpl(EncodedImage encodedImage, boolean z) {
            if (encodedImage != null && z) {
                this.mCache.put(this.mCacheKey, encodedImage);
            }
            getConsumer().onNewResult(encodedImage, z);
        }
    }

    public DiskCacheProducer(BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> producer) {
        this.mDefaultBufferedDiskCache = bufferedDiskCache;
        this.mSmallImageBufferedDiskCache = bufferedDiskCache2;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = producer;
    }

    @VisibleForTesting
    static Map<String, String> getExtraMap(ProducerListener producerListener, String str, boolean z) {
        return !producerListener.requiresExtraMap(str) ? null : ImmutableMap.of(VALUE_FOUND, String.valueOf(z));
    }

    private void maybeStartInputProducer(Consumer<EncodedImage> consumer, Consumer<EncodedImage> consumer2, ProducerContext producerContext) {
        if (producerContext.getLowestPermittedRequestLevel().getValue() >= RequestLevel.DISK_CACHE.getValue()) {
            consumer.onNewResult(null, true);
        } else {
            this.mInputProducer.produceResults(consumer2, producerContext);
        }
    }

    private void subscribeTaskForRequestCancellation(final AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            public void onCancellationRequested() {
                atomicBoolean.set(true);
            }
        });
    }

    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        ImageRequest imageRequest = producerContext.getImageRequest();
        if (imageRequest.isDiskCacheEnabled()) {
            final ProducerListener listener = producerContext.getListener();
            final String id = producerContext.getId();
            listener.onProducerStart(id, PRODUCER_NAME);
            final CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest);
            final BufferedDiskCache bufferedDiskCache = imageRequest.getImageType() == ImageType.SMALL ? this.mSmallImageBufferedDiskCache : this.mDefaultBufferedDiskCache;
            final Consumer<EncodedImage> consumer2 = consumer;
            final ProducerContext producerContext2 = producerContext;
            j anonymousClass1 = new j<EncodedImage, Void>() {
                public Void then(l<EncodedImage> lVar) {
                    if (lVar.c() || (lVar.d() && (lVar.f() instanceof CancellationException))) {
                        listener.onProducerFinishWithCancellation(id, DiskCacheProducer.PRODUCER_NAME, null);
                        consumer2.onCancellation();
                    } else if (lVar.d()) {
                        listener.onProducerFinishWithFailure(id, DiskCacheProducer.PRODUCER_NAME, lVar.f(), null);
                        DiskCacheProducer.this.maybeStartInputProducer(consumer2, new DiskCacheConsumer(consumer2, bufferedDiskCache, encodedCacheKey), producerContext2);
                    } else {
                        EncodedImage encodedImage = (EncodedImage) lVar.e();
                        if (encodedImage != null) {
                            listener.onProducerFinishWithSuccess(id, DiskCacheProducer.PRODUCER_NAME, DiskCacheProducer.getExtraMap(listener, id, true));
                            consumer2.onProgressUpdate(1.0f);
                            consumer2.onNewResult(encodedImage, true);
                            encodedImage.close();
                        } else {
                            listener.onProducerFinishWithSuccess(id, DiskCacheProducer.PRODUCER_NAME, DiskCacheProducer.getExtraMap(listener, id, false));
                            DiskCacheProducer.this.maybeStartInputProducer(consumer2, new DiskCacheConsumer(consumer2, bufferedDiskCache, encodedCacheKey), producerContext2);
                        }
                    }
                    return null;
                }
            };
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            bufferedDiskCache.get(encodedCacheKey, atomicBoolean).a(anonymousClass1);
            subscribeTaskForRequestCancellation(atomicBoolean, producerContext);
            return;
        }
        maybeStartInputProducer(consumer, consumer, producerContext);
    }
}
