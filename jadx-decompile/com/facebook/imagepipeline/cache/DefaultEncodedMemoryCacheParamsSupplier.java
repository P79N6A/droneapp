package com.facebook.imagepipeline.cache;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.memory.DefaultFlexByteArrayPoolParams;

public class DefaultEncodedMemoryCacheParamsSupplier implements Supplier<MemoryCacheParams> {
    private static final int MAX_CACHE_ENTRIES = Integer.MAX_VALUE;
    private static final int MAX_EVICTION_QUEUE_ENTRIES = Integer.MAX_VALUE;

    private int getMaxCacheSize() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min < ViewCompat.MEASURED_STATE_TOO_SMALL ? 1048576 : min < 33554432 ? AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END : DefaultFlexByteArrayPoolParams.DEFAULT_MAX_BYTE_ARRAY_SIZE;
    }

    public MemoryCacheParams get() {
        int maxCacheSize = getMaxCacheSize();
        return new MemoryCacheParams(maxCacheSize, Integer.MAX_VALUE, maxCacheSize, Integer.MAX_VALUE, maxCacheSize / 8);
    }
}
