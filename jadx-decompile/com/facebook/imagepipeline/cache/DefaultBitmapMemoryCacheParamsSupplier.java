package com.facebook.imagepipeline.cache;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.memory.DefaultFlexByteArrayPoolParams;

public class DefaultBitmapMemoryCacheParamsSupplier implements Supplier<MemoryCacheParams> {
    private static final int MAX_CACHE_ENTRIES = 256;
    private static final int MAX_CACHE_ENTRY_SIZE = Integer.MAX_VALUE;
    private static final int MAX_EVICTION_QUEUE_ENTRIES = Integer.MAX_VALUE;
    private static final int MAX_EVICTION_QUEUE_SIZE = Integer.MAX_VALUE;
    private final ActivityManager mActivityManager;

    public DefaultBitmapMemoryCacheParamsSupplier(ActivityManager activityManager) {
        this.mActivityManager = activityManager;
    }

    private int getMaxCacheSize() {
        int min = Math.min(this.mActivityManager.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return min < 33554432 ? DefaultFlexByteArrayPoolParams.DEFAULT_MAX_BYTE_ARRAY_SIZE : min < 67108864 ? 6291456 : VERSION.SDK_INT < 11 ? 8388608 : min / 4;
    }

    public MemoryCacheParams get() {
        return new MemoryCacheParams(getMaxCacheSize(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
