package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.image.CloseableImage;

public class BitmapMemoryCacheFactory {
    public static MemoryCache<CacheKey, CloseableImage> get(CountingMemoryCache<CacheKey, CloseableImage> countingMemoryCache, final ImageCacheStatsTracker imageCacheStatsTracker) {
        imageCacheStatsTracker.registerBitmapMemoryCache(countingMemoryCache);
        return new InstrumentedMemoryCache(countingMemoryCache, new MemoryCacheTracker() {
            public void onCacheHit() {
                imageCacheStatsTracker.onBitmapCacheHit();
            }

            public void onCacheMiss() {
                imageCacheStatsTracker.onBitmapCacheMiss();
            }

            public void onCachePut() {
                imageCacheStatsTracker.onBitmapCachePut();
            }
        });
    }
}
