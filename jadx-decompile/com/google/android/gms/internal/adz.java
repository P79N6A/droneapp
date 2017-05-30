package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.n;
import com.tencent.tauth.AuthActivity;
import java.util.HashMap;
import java.util.Map;

public final class adz extends n<adz> {
    public String a;
    public String b;
    public String c;

    public String a() {
        return this.a;
    }

    public /* synthetic */ void a(n nVar) {
        a((adz) nVar);
    }

    public void a(adz com_google_android_gms_internal_adz) {
        if (!TextUtils.isEmpty(this.a)) {
            com_google_android_gms_internal_adz.a(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            com_google_android_gms_internal_adz.b(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            com_google_android_gms_internal_adz.c(this.c);
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

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("network", this.a);
        hashMap.put(AuthActivity.ACTION_KEY, this.b);
        hashMap.put("target", this.c);
        return a(hashMap);
    }
}
