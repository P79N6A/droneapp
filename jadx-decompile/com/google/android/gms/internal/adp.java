package com.google.android.gms.internal;

import android.text.TextUtils;
import com.fimi.soul.entity.User;
import com.google.android.gms.analytics.n;
import java.util.HashMap;
import java.util.Map;

public final class adp extends n<adp> {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public String a() {
        return this.a;
    }

    public /* synthetic */ void a(n nVar) {
        a((adp) nVar);
    }

    public void a(adp com_google_android_gms_internal_adp) {
        if (!TextUtils.isEmpty(this.a)) {
            com_google_android_gms_internal_adp.a(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            com_google_android_gms_internal_adp.b(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            com_google_android_gms_internal_adp.c(this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            com_google_android_gms_internal_adp.d(this.d);
        }
        if (!TextUtils.isEmpty(this.e)) {
            com_google_android_gms_internal_adp.e(this.e);
        }
        if (!TextUtils.isEmpty(this.f)) {
            com_google_android_gms_internal_adp.f(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            com_google_android_gms_internal_adp.g(this.g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            com_google_android_gms_internal_adp.h(this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            com_google_android_gms_internal_adp.i(this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            com_google_android_gms_internal_adp.j(this.j);
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

    public String e() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public String f() {
        return this.f;
    }

    public void f(String str) {
        this.f = str;
    }

    public String g() {
        return this.g;
    }

    public void g(String str) {
        this.g = str;
    }

    public String h() {
        return this.h;
    }

    public void h(String str) {
        this.h = str;
    }

    public String i() {
        return this.i;
    }

    public void i(String str) {
        this.i = str;
    }

    public String j() {
        return this.j;
    }

    public void j(String str) {
        this.j = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put(User.FN_NAME, this.a);
        hashMap.put("source", this.b);
        hashMap.put("medium", this.c);
        hashMap.put("keyword", this.d);
        hashMap.put("content", this.e);
        hashMap.put("id", this.f);
        hashMap.put("adNetworkId", this.g);
        hashMap.put("gclid", this.h);
        hashMap.put("dclid", this.i);
        hashMap.put("aclid", this.j);
        return a(hashMap);
    }
}
