package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.Map;

public class EncodedMemoryCacheProducer implements Producer<EncodedImage> {
    @VisibleForTesting
    static final String PRODUCER_NAME = "EncodedMemoryCacheProducer";
    @VisibleForTesting
    static final String VALUE_FOUND = "cached_value_found";
    private final CacheKeyFactory mCacheKeyFactory;
    private final Producer<EncodedImage> mInputProducer;
    private final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;

    public EncodedMemoryCacheProducer(MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> producer) {
        this.mMemoryCache = memoryCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = producer;
    }

    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        EncodedImage encodedImage;
        Map map = null;
        String id = producerContext.getId();
        ProducerListener listener = producerContext.getListener();
        listener.onProducerStart(id, PRODUCER_NAME);
        final CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(producerContext.getImageRequest());
        CloseableReference closeableReference = this.mMemoryCache.get(encodedCacheKey);
        if (closeableReference != null) {
            try {
                encodedImage = new EncodedImage(closeableReference);
                String str = PRODUCER_NAME;
                if (listener.requiresExtraMap(id)) {
                    map = ImmutableMap.of(VALUE_FOUND, "true");
                }
                listener.onProducerFinishWithSuccess(id, str, map);
                consumer.onProgressUpdate(1.0f);
                consumer.onNewResult(encodedImage, true);
                EncodedImage.closeSafely(encodedImage);
                CloseableReference.closeSafely(closeableReference);
            } catch (Throwable th) {
                CloseableReference.closeSafely(closeableReference);
            }
        } else if (producerContext.getLowestPermittedRequestLevel().getValue() >= RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
            r3 = PRODUCER_NAME;
            if (listener.requiresExtraMap(id)) {
                map = ImmutableMap.of(VALUE_FOUND, "false");
            }
            listener.onProducerFinishWithSuccess(id, r3, map);
            consumer.onNewResult(null, true);
            CloseableReference.closeSafely(closeableReference);
        } else {
            Consumer anonymousClass1 = new DelegatingConsumer<EncodedImage, EncodedImage>(consumer) {
                public void onNewResultImpl(EncodedImage encodedImage, boolean z) {
                    if (!z || encodedImage == null) {
                        getConsumer().onNewResult(encodedImage, z);
                        return;
                    }
                    EncodedImage byteBufferRef = encodedImage.getByteBufferRef();
                    if (byteBufferRef != null) {
                        try {
                            CloseableReference cache = EncodedMemoryCacheProducer.this.mMemoryCache.cache(encodedCacheKey, byteBufferRef);
                            if (cache != null) {
                                try {
                                    byteBufferRef = new EncodedImage(cache);
                                    byteBufferRef.copyMetaDataFrom(encodedImage);
                                    try {
                                        getConsumer().onProgressUpdate(1.0f);
                                        getConsumer().onNewResult(byteBufferRef, true);
                                        return;
                                    } finally {
                                        EncodedImage.closeSafely(byteBufferRef);
                                    }
                                } finally {
                                    CloseableReference.closeSafely(cache);
                                }
                            }
                        } finally {
                            CloseableReference.closeSafely((CloseableReference) byteBufferRef);
                        }
                    }
                    getConsumer().onNewResult(encodedImage, true);
                }
            };
            r3 = PRODUCER_NAME;
            if (listener.requiresExtraMap(id)) {
                map = ImmutableMap.of(VALUE_FOUND, "false");
            }
            listener.onProducerFinishWithSuccess(id, r3, map);
            this.mInputProducer.produceResults(anonymousClass1, producerContext);
            CloseableReference.closeSafely(closeableReference);
        }
    }
}
