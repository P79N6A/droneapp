package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.n;
import java.util.HashMap;
import java.util.Map;

public final class ado extends n<ado> {
    private String a;
    private String b;
    private String c;
    private String d;

    public String a() {
        return this.a;
    }

    public /* synthetic */ void a(n nVar) {
        a((ado) nVar);
    }

    public void a(ado com_google_android_gms_internal_ado) {
        if (!TextUtils.isEmpty(this.a)) {
            com_google_android_gms_internal_ado.a(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            com_google_android_gms_internal_ado.b(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            com_google_android_gms_internal_ado.c(this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            com_google_android_gms_internal_ado.d(this.d);
        }
    }

    public void a(String str) {
        this.a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
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

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("appName", this.a);
        hashMap.put("appVersion", this.b);
        hashMap.put("appId", this.c);
        hashMap.put("appInstallerId", this.d);
        return a(hashMap);
    }
}
