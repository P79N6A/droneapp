package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.memory.PooledByteBuffer;

public class EncodedMemoryCacheFactory {
    public static MemoryCache<CacheKey, PooledByteBuffer> get(CountingMemoryCache<CacheKey, PooledByteBuffer> countingMemoryCache, final ImageCacheStatsTracker imageCacheStatsTracker) {
        imageCacheStatsTracker.registerEncodedMemoryCache(countingMemoryCache);
        return new InstrumentedMemoryCache(countingMemoryCache, new MemoryCacheTracker() {
            public void onCacheHit() {
                imageCacheStatsTracker.onMemoryCacheHit();
            }

            public void onCacheMiss() {
                imageCacheStatsTracker.onMemoryCacheMiss();
            }

            public void onCachePut() {
                imageCacheStatsTracker.onMemoryCachePut();
            }
        });
    }
}
