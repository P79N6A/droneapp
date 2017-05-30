package com.google.android.gms.common.stats;

import com.google.android.gms.internal.aiz;

public final class c {
    public static aiz<Integer> a = aiz.a("gms:common:stats:max_num_of_events", Integer.valueOf(100));
    public static aiz<Integer> b = aiz.a("gms:common:stats:max_chunk_size", Integer.valueOf(100));

    public static final class a {
        public static aiz<Integer> a = aiz.a("gms:common:stats:connections:level", Integer.valueOf(d.b));
        public static aiz<String> b = aiz.a("gms:common:stats:connections:ignored_calling_processes", "");
        public static aiz<String> c = aiz.a("gms:common:stats:connections:ignored_calling_services", "");
        public static aiz<String> d = aiz.a("gms:common:stats:connections:ignored_target_processes", "");
        public static aiz<String> e = aiz.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        public static aiz<Long> f = aiz.a("gms:common:stats:connections:time_out_duration", Long.valueOf(600000));
    }

    public static final class b {
        public static aiz<Integer> a = aiz.a("gms:common:stats:wakeLocks:level", Integer.valueOf(d.b));
        public static aiz<Long> b = aiz.a("gms:common:stats:wakelocks:time_out_duration", Long.valueOf(600000));
    }
}
