package com.google.android.gms.cast.a;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.agm;
import org.json.JSONObject;

public final class a {
    public static final int a = 2150;
    public static final int b = 2151;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    private final agm r;

    public interface a extends m {
        a b();
    }

    public interface b extends m {
        String b();

        long c();

        JSONObject d();
    }

    public interface c {
        void a(b bVar, b bVar2);

        void a(String str, JSONObject jSONObject);
    }

    public a(agm com_google_android_gms_internal_agm) {
        this.r = com_google_android_gms_internal_agm;
    }

    public static i<a> a(g gVar, String str) {
        return a(new agm(gVar, str, com.google.android.gms.cast.a.l));
    }

    static i<a> a(agm com_google_android_gms_internal_agm) {
        return com_google_android_gms_internal_agm.a(new a(com_google_android_gms_internal_agm));
    }

    private i<b> a(String str, int i, JSONObject jSONObject) {
        return this.r.a(str, i, jSONObject);
    }

    public synchronized b a() {
        return this.r.e();
    }

    public i<b> a(String str, JSONObject jSONObject) {
        return a(str, 3, jSONObject);
    }

    public i<b> a(JSONObject jSONObject) {
        return a(b(), 3, jSONObject);
    }

    public void a(c cVar) {
        this.r.a(cVar);
    }

    public void a(String str) {
        this.r.a(str);
    }

    public i<b> b(String str, JSONObject jSONObject) {
        return a(str, 4, jSONObject);
    }

    public i<b> b(JSONObject jSONObject) {
        return a(b(), 4, jSONObject);
    }

    public String b() {
        return this.r.f();
    }

    public i<b> c(String str, JSONObject jSONObject) {
        return a(str, 6, jSONObject);
    }

    public i<b> c(JSONObject jSONObject) {
        return a(b(), 6, jSONObject);
    }

    public void c() {
        this.r.d();
    }

    public i<b> d(String str, JSONObject jSONObject) {
        return a(str, 5, jSONObject);
    }

    public i<b> d(JSONObject jSONObject) {
        return a(b(), 5, jSONObject);
    }

    public boolean d() {
        return this.r.g();
    }

    public i<b> e(String str, JSONObject jSONObject) {
        return a(str, 2, jSONObject);
    }

    public i<b> e(JSONObject jSONObject) {
        return a(b(), 2, jSONObject);
    }

    public i<b> f(String str, JSONObject jSONObject) {
        return this.r.b(str, jSONObject);
    }

    public i<b> f(JSONObject jSONObject) {
        return f(b(), jSONObject);
    }

    public void g(String str, JSONObject jSONObject) {
        this.r.a(str, jSONObject);
    }

    public void g(JSONObject jSONObject) {
        g(b(), jSONObject);
    }
}
