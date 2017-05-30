package com.facebook.imagepipeline.core;

import a.j;
import a.l;
import android.net.Uri;
import com.android.internal.util.Predicate;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSources;
import com.facebook.datasource.SettableDataSource;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheKey;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.datasource.CloseableProducerToDataSourceAdapter;
import com.facebook.imagepipeline.datasource.ProducerToDataSourceAdapter;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.ProducerListener;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class ImagePipeline {
    private static final CancellationException PREFETCH_EXCEPTION = new CancellationException("Prefetching is not enabled");
    private final MemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
    private final CacheKeyFactory mCacheKeyFactory;
    private final MemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;
    private AtomicLong mIdCounter = new AtomicLong();
    private final Supplier<Boolean> mIsPrefetchEnabledSupplier;
    private final BufferedDiskCache mMainBufferedDiskCache;
    private final ProducerSequenceFactory mProducerSequenceFactory;
    private final RequestListener mRequestListener;
    private final BufferedDiskCache mSmallImageBufferedDiskCache;

    public ImagePipeline(ProducerSequenceFactory producerSequenceFactory, Set<RequestListener> set, Supplier<Boolean> supplier, MemoryCache<CacheKey, CloseableImage> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory) {
        this.mProducerSequenceFactory = producerSequenceFactory;
        this.mRequestListener = new ForwardingRequestListener(set);
        this.mIsPrefetchEnabledSupplier = supplier;
        this.mBitmapMemoryCache = memoryCache;
        this.mEncodedMemoryCache = memoryCache2;
        this.mMainBufferedDiskCache = bufferedDiskCache;
        this.mSmallImageBufferedDiskCache = bufferedDiskCache2;
        this.mCacheKeyFactory = cacheKeyFactory;
    }

    private String generateUniqueFutureId() {
        return String.valueOf(this.mIdCounter.getAndIncrement());
    }

    private Predicate<CacheKey> predicateForUri(Uri uri) {
        final String uri2 = this.mCacheKeyFactory.getCacheKeySourceUri(uri).toString();
        return new Predicate<CacheKey>() {
            public boolean apply(CacheKey cacheKey) {
                return cacheKey instanceof BitmapMemoryCacheKey ? ((BitmapMemoryCacheKey) cacheKey).getSourceUriString().equals(uri2) : false;
            }
        };
    }

    private <T> DataSource<CloseableReference<T>> submitFetchRequest(Producer<CloseableReference<T>> producer, ImageRequest imageRequest, RequestLevel requestLevel, Object obj) {
        boolean z = false;
        try {
            RequestLevel max = RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), requestLevel);
            String generateUniqueFutureId = generateUniqueFutureId();
            ProducerListener producerListener = this.mRequestListener;
            if (imageRequest.getProgressiveRenderingEnabled() || !UriUtil.isNetworkUri(imageRequest.getSourceUri())) {
                z = true;
            }
            return CloseableProducerToDataSourceAdapter.create(producer, new SettableProducerContext(imageRequest, generateUniqueFutureId, producerListener, obj, max, false, z, imageRequest.getPriority()), this.mRequestListener);
        } catch (Throwable e) {
            return DataSources.immediateFailedDataSource(e);
        }
    }

    private DataSource<Void> submitPrefetchRequest(Producer<Void> producer, ImageRequest imageRequest, RequestLevel requestLevel, Object obj) {
        try {
            return ProducerToDataSourceAdapter.create(producer, new SettableProducerContext(imageRequest, generateUniqueFutureId(), this.mRequestListener, obj, RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), requestLevel), true, false, Priority.LOW), this.mRequestListener);
        } catch (Throwable e) {
            return DataSources.immediateFailedDataSource(e);
        }
    }

    public void clearCaches() {
        clearMemoryCaches();
        clearDiskCaches();
    }

    public void clearDiskCaches() {
        this.mMainBufferedDiskCache.clearAll();
        this.mSmallImageBufferedDiskCache.clearAll();
    }

    public void clearMemoryCaches() {
        Predicate anonymousClass4 = new Predicate<CacheKey>() {
            public boolean apply(CacheKey cacheKey) {
                return true;
            }
        };
        this.mBitmapMemoryCache.removeAll(anonymousClass4);
        this.mEncodedMemoryCache.removeAll(anonymousClass4);
    }

    public void evictFromCache(Uri uri) {
        evictFromMemoryCache(uri);
        evictFromDiskCache(uri);
    }

    public void evictFromDiskCache(Uri uri) {
        evictFromDiskCache(ImageRequest.fromUri(uri));
    }

    public void evictFromDiskCache(ImageRequest imageRequest) {
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest);
        this.mMainBufferedDiskCache.remove(encodedCacheKey);
        this.mSmallImageBufferedDiskCache.remove(encodedCacheKey);
    }

    public void evictFromMemoryCache(Uri uri) {
        this.mBitmapMemoryCache.removeAll(predicateForUri(uri));
        final String uri2 = this.mCacheKeyFactory.getCacheKeySourceUri(uri).toString();
        this.mEncodedMemoryCache.removeAll(new Predicate<CacheKey>() {
            public boolean apply(CacheKey cacheKey) {
                return cacheKey.toString().equals(uri2);
            }
        });
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj) {
        try {
            return submitFetchRequest(this.mProducerSequenceFactory.getDecodedImageProducerSequence(imageRequest), imageRequest, RequestLevel.FULL_FETCH, obj);
        } catch (Throwable e) {
            return DataSources.immediateFailedDataSource(e);
        }
    }

    public DataSource<CloseableReference<PooledByteBuffer>> fetchEncodedImage(ImageRequest imageRequest, Object obj) {
        Preconditions.checkNotNull(imageRequest.getSourceUri());
        try {
            Producer encodedImageProducerSequence = this.mProducerSequenceFactory.getEncodedImageProducerSequence(imageRequest);
            if (imageRequest.getResizeOptions() != null) {
                imageRequest = ImageRequestBuilder.fromRequest(imageRequest).setResizeOptions(null).build();
            }
            return submitFetchRequest(encodedImageProducerSequence, imageRequest, RequestLevel.FULL_FETCH, obj);
        } catch (Throwable e) {
            return DataSources.immediateFailedDataSource(e);
        }
    }

    public DataSource<CloseableReference<CloseableImage>> fetchImageFromBitmapCache(ImageRequest imageRequest, Object obj) {
        try {
            return submitFetchRequest(this.mProducerSequenceFactory.getDecodedImageProducerSequence(imageRequest), imageRequest, RequestLevel.BITMAP_MEMORY_CACHE, obj);
        } catch (Throwable e) {
            return DataSources.immediateFailedDataSource(e);
        }
    }

    public Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(final ImageRequest imageRequest, final Object obj, final boolean z) {
        return new Supplier<DataSource<CloseableReference<CloseableImage>>>() {
            public DataSource<CloseableReference<CloseableImage>> get() {
                return z ? ImagePipeline.this.fetchImageFromBitmapCache(imageRequest, obj) : ImagePipeline.this.fetchDecodedImage(imageRequest, obj);
            }

            public String toString() {
                return Objects.toStringHelper((Object) this).add("uri", imageRequest.getSourceUri()).toString();
            }
        };
    }

    public Supplier<DataSource<CloseableReference<PooledByteBuffer>>> getEncodedImageDataSourceSupplier(final ImageRequest imageRequest, final Object obj) {
        return new Supplier<DataSource<CloseableReference<PooledByteBuffer>>>() {
            public DataSource<CloseableReference<PooledByteBuffer>> get() {
                return ImagePipeline.this.fetchEncodedImage(imageRequest, obj);
            }

            public String toString() {
                return Objects.toStringHelper((Object) this).add("uri", imageRequest.getSourceUri()).toString();
            }
        };
    }

    public boolean isInBitmapMemoryCache(Uri uri) {
        return this.mBitmapMemoryCache.contains(predicateForUri(uri));
    }

    public boolean isInBitmapMemoryCache(ImageRequest imageRequest) {
        CloseableReference closeableReference = this.mBitmapMemoryCache.get(this.mCacheKeyFactory.getBitmapCacheKey(imageRequest));
        try {
            boolean isValid = CloseableReference.isValid(closeableReference);
            return isValid;
        } finally {
            CloseableReference.closeSafely(closeableReference);
        }
    }

    public DataSource<Boolean> isInDiskCache(Uri uri) {
        return isInDiskCache(ImageRequest.fromUri(uri));
    }

    public DataSource<Boolean> isInDiskCache(ImageRequest imageRequest) {
        final CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest);
        final DataSource create = SettableDataSource.create();
        this.mMainBufferedDiskCache.contains(encodedCacheKey).b(new j<Boolean, l<Boolean>>() {
            public l<Boolean> then(l<Boolean> lVar) {
                return (lVar.c() || lVar.d() || !((Boolean) lVar.e()).booleanValue()) ? ImagePipeline.this.mSmallImageBufferedDiskCache.contains(encodedCacheKey) : l.a(Boolean.valueOf(true));
            }
        }).a(new j<Boolean, Void>() {
            public Void then(l<Boolean> lVar) {
                SettableDataSource settableDataSource = create;
                boolean z = (lVar.c() || lVar.d() || !((Boolean) lVar.e()).booleanValue()) ? false : true;
                settableDataSource.setResult(Boolean.valueOf(z));
                return null;
            }
        });
        return create;
    }

    public DataSource<Void> prefetchToBitmapCache(ImageRequest imageRequest, Object obj) {
        if (!((Boolean) this.mIsPrefetchEnabledSupplier.get()).booleanValue()) {
            return DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
        }
        try {
            return submitPrefetchRequest(this.mProducerSequenceFactory.getDecodedImagePrefetchProducerSequence(imageRequest), imageRequest, RequestLevel.FULL_FETCH, obj);
        } catch (Throwable e) {
            return DataSources.immediateFailedDataSource(e);
        }
    }

    public DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, Object obj) {
        if (!((Boolean) this.mIsPrefetchEnabledSupplier.get()).booleanValue()) {
            return DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
        }
        try {
            return submitPrefetchRequest(this.mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest), imageRequest, RequestLevel.FULL_FETCH, obj);
        } catch (Throwable e) {
            return DataSources.immediateFailedDataSource(e);
        }
    }
}
