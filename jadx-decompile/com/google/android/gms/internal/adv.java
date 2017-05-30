package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.n;
import com.google.android.gms.plus.e;
import com.tencent.tauth.AuthActivity;
import java.util.HashMap;
import java.util.Map;

public final class adv extends n<adv> {
    private String a;
    private String b;
    private String c;
    private long d;

    public String a() {
        return this.a;
    }

    public void a(long j) {
        this.d = j;
    }

    public /* synthetic */ void a(n nVar) {
        a((adv) nVar);
    }

    public void a(adv com_google_android_gms_internal_adv) {
        if (!TextUtils.isEmpty(this.a)) {
            com_google_android_gms_internal_adv.a(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            com_google_android_gms_internal_adv.b(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            com_google_android_gms_internal_adv.c(this.c);
        }
        if (this.d != 0) {
            com_google_android_gms_internal_adv.a(this.d);
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

    public long d() {
        return this.d;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("category", this.a);
        hashMap.put(AuthActivity.ACTION_KEY, this.b);
        hashMap.put(e.i, this.c);
        hashMap.put("value", Long.valueOf(this.d));
        return a(hashMap);
    }
}
