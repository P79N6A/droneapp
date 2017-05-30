package com.google.android.gms.common.util;

import android.support.v4.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f {
    public static <T> List<T> a(T t) {
        return Collections.singletonList(t);
    }

    public static <T> List<T> a(T t, T t2) {
        List arrayList = new ArrayList(2);
        arrayList.add(t);
        arrayList.add(t2);
        return Collections.unmodifiableList(arrayList);
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map arrayMap = new ArrayMap(6);
        arrayMap.put(k, v);
        arrayMap.put(k2, v2);
        arrayMap.put(k3, v3);
        arrayMap.put(k4, v4);
        arrayMap.put(k5, v5);
        arrayMap.put(k6, v6);
        return Collections.unmodifiableMap(arrayMap);
    }

    public static <K, V> Map<K, V> a(K[] kArr, V[] vArr) {
        int i = 0;
        b((Object[]) kArr, (Object[]) vArr);
        int length = kArr.length;
        switch (length) {
            case 0:
                return b();
            case 1:
                return c(kArr[0], vArr[0]);
            default:
                Map arrayMap = length <= 32 ? new ArrayMap(length) : new HashMap(length, 1.0f);
                while (i < length) {
                    arrayMap.put(kArr[i], vArr[i]);
                    i++;
                }
                return Collections.unmodifiableMap(arrayMap);
        }
    }

    public static <T> Set<T> a() {
        return Collections.emptySet();
    }

    public static <T> Set<T> a(T t, T t2, T t3) {
        Set aVar = new a(3);
        aVar.add(t);
        aVar.add(t2);
        aVar.add(t3);
        return Collections.unmodifiableSet(aVar);
    }

    public static <T> Set<T> a(T t, T t2, T t3, T t4) {
        Set aVar = new a(4);
        aVar.add(t);
        aVar.add(t2);
        aVar.add(t3);
        aVar.add(t4);
        return Collections.unmodifiableSet(aVar);
    }

    public static <T> Set<T> a(T... tArr) {
        switch (tArr.length) {
            case 0:
                return a();
            case 1:
                return b(tArr[0]);
            case 2:
                return b(tArr[0], tArr[1]);
            case 3:
                return a(tArr[0], tArr[1], tArr[2]);
            case 4:
                return a(tArr[0], tArr[1], tArr[2], tArr[3]);
            default:
                return Collections.unmodifiableSet(tArr.length <= 32 ? new a(Arrays.asList(tArr)) : new HashSet(Arrays.asList(tArr)));
        }
    }

    public static <K, V> Map<K, V> b() {
        return Collections.emptyMap();
    }

    public static <T> Set<T> b(T t) {
        return Collections.singleton(t);
    }

    public static <T> Set<T> b(T t, T t2) {
        Set aVar = new a(2);
        aVar.add(t);
        aVar.add(t2);
        return Collections.unmodifiableSet(aVar);
    }

    private static <K, V> void b(K[] kArr, V[] vArr) {
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + vArr.length);
        }
    }

    public static <K, V> Map<K, V> c(K k, V v) {
        return Collections.singletonMap(k, v);
    }
}
