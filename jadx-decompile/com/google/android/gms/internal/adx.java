package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.n;
import com.google.android.gms.common.internal.d;
import com.xiaomi.market.sdk.j;
import java.util.HashMap;
import java.util.Map;

public final class adx extends n<adx> {
    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e;
    private String f;
    private boolean g;
    private double h;

    public String a() {
        return this.a;
    }

    public void a(double d) {
        boolean z = d >= 0.0d && d <= 100.0d;
        d.b(z, "Sample rate must be between 0% and 100%");
        this.h = d;
    }

    public /* synthetic */ void a(n nVar) {
        a((adx) nVar);
    }

    public void a(adx com_google_android_gms_internal_adx) {
        if (!TextUtils.isEmpty(this.a)) {
            com_google_android_gms_internal_adx.a(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            com_google_android_gms_internal_adx.b(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            com_google_android_gms_internal_adx.c(this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            com_google_android_gms_internal_adx.d(this.d);
        }
        if (this.e) {
            com_google_android_gms_internal_adx.a(true);
        }
        if (!TextUtils.isEmpty(this.f)) {
            com_google_android_gms_internal_adx.e(this.f);
        }
        if (this.g) {
            com_google_android_gms_internal_adx.b(this.g);
        }
        if (this.h != 0.0d) {
            com_google_android_gms_internal_adx.a(this.h);
        }
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.c = str;
    }

    public String d() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public void e(String str) {
        this.f = str;
    }

    public boolean e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public double h() {
        return this.h;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("hitType", this.a);
        hashMap.put(j.aa, this.b);
        hashMap.put("userId", this.c);
        hashMap.put("androidAdId", this.d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.e));
        hashMap.put("sessionControl", this.f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.g));
        hashMap.put("sampleRate", Double.valueOf(this.h));
        return a(hashMap);
    }
}
