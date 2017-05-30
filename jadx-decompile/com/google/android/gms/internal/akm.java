package com.google.android.gms.internal;

import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.fitness.data.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class akm {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"altitude", "duration", "food_item", "meal_type", "repetitions", "resistance", "resistance_type", "debug_session"})));
    private static final akm d = new akm();
    private final Map<String, Map<String, a>> b;
    private final Map<String, a> c;

    public static class a {
        private final double a;
        private final double b;

        private a(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public boolean a(double d) {
            return d >= this.a && d <= this.b;
        }
    }

    private akm() {
        Map hashMap = new HashMap();
        hashMap.put("latitude", new a(-90.0d, 90.0d));
        hashMap.put("longitude", new a(-180.0d, 180.0d));
        hashMap.put("accuracy", new a(0.0d, 10000.0d));
        hashMap.put("bpm", new a(0.0d, 1000.0d));
        hashMap.put("altitude", new a(-100000.0d, 100000.0d));
        hashMap.put("percentage", new a(0.0d, 100.0d));
        hashMap.put("confidence", new a(0.0d, 100.0d));
        hashMap.put("duration", new a(0.0d, 9.223372036854776E18d));
        hashMap.put(FimiMediaMeta.IJKM_KEY_HEIGHT, new a(0.0d, 3.0d));
        hashMap.put("weight", new a(0.0d, 1000.0d));
        hashMap.put("speed", new a(0.0d, 11000.0d));
        this.c = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put("com.google.step_count.delta", a((Object) "steps", new a(0.0d, 1.0E-8d)));
        hashMap.put("com.google.calories.consumed", a(Field.I, new a(0.0d, 1.0E-6d)));
        hashMap.put("com.google.calories.expended", a(Field.I, new a(0.0d, 5.555555555555555E-10d)));
        hashMap.put("com.google.distance.delta", a((Object) "distance", new a(0.0d, 1.0E-7d)));
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public static akm a() {
        return d;
    }

    private static <K, V> Map<K, V> a(K k, V v) {
        Map<K, V> hashMap = new HashMap();
        hashMap.put(k, v);
        return hashMap;
    }

    a a(String str) {
        return (a) this.c.get(str);
    }

    a a(String str, String str2) {
        Map map = (Map) this.b.get(str);
        return map != null ? (a) map.get(str2) : null;
    }
}
