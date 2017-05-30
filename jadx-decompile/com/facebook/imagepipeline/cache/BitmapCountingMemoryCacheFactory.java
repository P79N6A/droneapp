package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.image.CloseableImage;

public class BitmapCountingMemoryCacheFactory {
    public static CountingMemoryCache<CacheKey, CloseableImage> get(Supplier<MemoryCacheParams> supplier, MemoryTrimmableRegistry memoryTrimmableRegistry) {
        Object countingMemoryCache = new CountingMemoryCache(new ValueDescriptor<CloseableImage>() {
            public int getSizeInBytes(CloseableImage closeableImage) {
                return closeableImage.getSizeInBytes();
            }
        }, new BitmapMemoryCacheTrimStrategy(), supplier);
        memoryTrimmableRegistry.registerMemoryTrimmable(countingMemoryCache);
        return countingMemoryCache;
    }
}
