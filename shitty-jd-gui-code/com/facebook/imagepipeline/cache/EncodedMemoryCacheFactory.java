package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.memory.PooledByteBuffer;

public class EncodedMemoryCacheFactory
{
  public static MemoryCache<CacheKey, PooledByteBuffer> get(CountingMemoryCache<CacheKey, PooledByteBuffer> paramCountingMemoryCache, ImageCacheStatsTracker paramImageCacheStatsTracker)
  {
    paramImageCacheStatsTracker.registerEncodedMemoryCache(paramCountingMemoryCache);
    new InstrumentedMemoryCache(paramCountingMemoryCache, new MemoryCacheTracker()
    {
      public void onCacheHit()
      {
        this.val$imageCacheStatsTracker.onMemoryCacheHit();
      }
      
      public void onCacheMiss()
      {
        this.val$imageCacheStatsTracker.onMemoryCacheMiss();
      }
      
      public void onCachePut()
      {
        this.val$imageCacheStatsTracker.onMemoryCachePut();
      }
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/cache/EncodedMemoryCacheFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */