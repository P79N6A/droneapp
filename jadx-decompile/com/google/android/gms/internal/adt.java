package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.n;
import java.util.HashMap;
import java.util.Map;

public final class adt extends n<adt> {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private String f;

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public /* synthetic */ void a(n nVar) {
        a((adt) nVar);
    }

    public void a(adt com_google_android_gms_internal_adt) {
        if (this.a != 0) {
            com_google_android_gms_internal_adt.a(this.a);
        }
        if (this.b != 0) {
            com_google_android_gms_internal_adt.b(this.b);
        }
        if (this.c != 0) {
            com_google_android_gms_internal_adt.c(this.c);
        }
        if (this.d != 0) {
            com_google_android_gms_internal_adt.d(this.d);
        }
        if (this.e != 0) {
            com_google_android_gms_internal_adt.e(this.e);
        }
        if (!TextUtils.isEmpty(this.f)) {
            com_google_android_gms_internal_adt.a(this.f);
        }
    }

    public void a(String str) {
        this.f = str;
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public int c() {
        return this.c;
    }

    public void c(int i) {
        this.c = i;
    }

    public int d() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public String f() {
        return this.f;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("language", this.f);
        hashMap.put("screenColors", Integer.valueOf(this.a));
        hashMap.put("screenWidth", Integer.valueOf(this.b));
        hashMap.put("screenHeight", Integer.valueOf(this.c));
        hashMap.put("viewportWidth", Integer.valueOf(this.d));
        hashMap.put("viewportHeight", Integer.valueOf(this.e));
        return a(hashMap);
    }
}
