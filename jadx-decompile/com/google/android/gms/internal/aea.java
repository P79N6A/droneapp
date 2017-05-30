package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.n;
import com.google.android.gms.plus.e;
import java.util.HashMap;
import java.util.Map;

public final class aea extends n<aea> {
    public String a;
    public long b;
    public String c;
    public String d;

    public String a() {
        return this.a;
    }

    public void a(long j) {
        this.b = j;
    }

    public /* synthetic */ void a(n nVar) {
        a((aea) nVar);
    }

    public void a(aea com_google_android_gms_internal_aea) {
        if (!TextUtils.isEmpty(this.a)) {
            com_google_android_gms_internal_aea.a(this.a);
        }
        if (this.b != 0) {
            com_google_android_gms_internal_aea.a(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            com_google_android_gms_internal_aea.b(this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            com_google_android_gms_internal_aea.c(this.d);
        }
    }

    public void a(String str) {
        this.a = str;
    }

    public long b() {
        return this.b;
    }

    public void b(String str) {
        this.c = str;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.d = str;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("variableName", this.a);
        hashMap.put("timeInMillis", Long.valueOf(this.b));
        hashMap.put("category", this.c);
        hashMap.put(e.i, this.d);
        return a(hashMap);
    }
}
