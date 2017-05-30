package com.google.android.gms.analytics.internal;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aiz;
import com.hoho.android.usbserial.driver.UsbId;
import com.tencent.mm.sdk.platformtools.Util;

public final class ao {
    public static a<Integer> A = a.a("analytics.max_batch_post_length", 8192);
    public static a<String> B = a.a("analytics.fallback_responses.k", "404,502");
    public static a<Integer> C = a.a("analytics.batch_retry_interval.seconds.k", 3600);
    public static a<Long> D = a.a("analytics.service_monitor_interval", 86400000);
    public static a<Integer> E = a.a("analytics.http_connection.connect_timeout_millis", (int) UsbId.SILAB_CP2102);
    public static a<Integer> F = a.a("analytics.http_connection.read_timeout_millis", 61000);
    public static a<Long> G = a.a("analytics.campaigns.time_limit", 86400000);
    public static a<String> H = a.a("analytics.first_party_experiment_id", "");
    public static a<Integer> I = a.a("analytics.first_party_experiment_variant", 0);
    public static a<Boolean> J = a.a("analytics.test.disable_receiver", false);
    public static a<Long> K = a.a("analytics.service_client.idle_disconnect_millis", (long) NotificationOptions.a, (long) NotificationOptions.a);
    public static a<Long> L = a.a("analytics.service_client.connect_timeout_millis", 5000);
    public static a<Long> M = a.a("analytics.service_client.second_connect_delay_millis", 5000);
    public static a<Long> N = a.a("analytics.service_client.unexpected_reconnect_millis", (long) Util.MILLSECONDS_OF_MINUTE);
    public static a<Long> O = a.a("analytics.service_client.reconnect_throttle_millis", 1800000);
    public static a<Long> P = a.a("analytics.monitoring.sample_period_millis", 86400000);
    public static a<Long> Q = a.a("analytics.initialization_warning_threshold", 5000);
    public static a<Boolean> a = a.a("analytics.service_enabled", false);
    public static a<Boolean> b = a.a("analytics.service_client_enabled", true);
    public static a<String> c = a.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static a<Long> d = a.a("analytics.max_tokens", 60);
    public static a<Float> e = a.a("analytics.tokens_per_sec", 0.5f);
    public static a<Integer> f = a.a("analytics.max_stored_hits", 2000, 20000);
    public static a<Integer> g = a.a("analytics.max_stored_hits_per_app", 2000);
    public static a<Integer> h = a.a("analytics.max_stored_properties_per_app", 100);
    public static a<Long> i = a.a("analytics.local_dispatch_millis", 1800000, 120000);
    public static a<Long> j = a.a("analytics.initial_local_dispatch_millis", 5000, 5000);
    public static a<Long> k = a.a("analytics.min_local_dispatch_millis", 120000);
    public static a<Long> l = a.a("analytics.max_local_dispatch_millis", 7200000);
    public static a<Long> m = a.a("analytics.dispatch_alarm_millis", 7200000);
    public static a<Long> n = a.a("analytics.max_dispatch_alarm_millis", 32400000);
    public static a<Integer> o = a.a("analytics.max_hits_per_dispatch", 20);
    public static a<Integer> p = a.a("analytics.max_hits_per_batch", 20);
    public static a<String> q = a.a("analytics.insecure_host", "http://www.google-analytics.com");
    public static a<String> r = a.a("analytics.secure_host", "https://ssl.google-analytics.com");
    public static a<String> s = a.a("analytics.simple_endpoint", "/collect");
    public static a<String> t = a.a("analytics.batching_endpoint", "/batch");
    public static a<Integer> u = a.a("analytics.max_get_length", 2036);
    public static a<String> v = a.a("analytics.batching_strategy.k", ac.BATCH_BY_COUNT.name(), ac.BATCH_BY_COUNT.name());
    public static a<String> w = a.a("analytics.compression_strategy.k", ae.GZIP.name());
    public static a<Integer> x = a.a("analytics.max_hits_per_request.k", 20);
    public static a<Integer> y = a.a("analytics.max_hit_length.k", 8192);
    public static a<Integer> z = a.a("analytics.max_post_length.k", 8192);

    public static final class a<V> {
        private final V a;
        private final aiz<V> b;

        private a(aiz<V> com_google_android_gms_internal_aiz_V, V v) {
            d.a((Object) com_google_android_gms_internal_aiz_V);
            this.b = com_google_android_gms_internal_aiz_V;
            this.a = v;
        }

        static a<Float> a(String str, float f) {
            return a(str, f, f);
        }

        static a<Float> a(String str, float f, float f2) {
            return new a(aiz.a(str, Float.valueOf(f2)), Float.valueOf(f));
        }

        static a<Integer> a(String str, int i) {
            return a(str, i, i);
        }

        static a<Integer> a(String str, int i, int i2) {
            return new a(aiz.a(str, Integer.valueOf(i2)), Integer.valueOf(i));
        }

        static a<Long> a(String str, long j) {
            return a(str, j, j);
        }

        static a<Long> a(String str, long j, long j2) {
            return new a(aiz.a(str, Long.valueOf(j2)), Long.valueOf(j));
        }

        static a<String> a(String str, String str2) {
            return a(str, str2, str2);
        }

        static a<String> a(String str, String str2, String str3) {
            return new a(aiz.a(str, str3), str2);
        }

        static a<Boolean> a(String str, boolean z) {
            return a(str, z, z);
        }

        static a<Boolean> a(String str, boolean z, boolean z2) {
            return new a(aiz.a(str, z2), Boolean.valueOf(z));
        }

        public V a() {
            return this.a;
        }
    }
}
