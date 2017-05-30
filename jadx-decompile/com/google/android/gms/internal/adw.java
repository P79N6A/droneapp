package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.n;
import java.util.HashMap;
import java.util.Map;

public final class adw extends n<adw> {
    public String a;
    public boolean b;

    public String a() {
        return this.a;
    }

    public /* synthetic */ void a(n nVar) {
        a((adw) nVar);
    }

    public void a(adw com_google_android_gms_internal_adw) {
        if (!TextUtils.isEmpty(this.a)) {
            com_google_android_gms_internal_adw.a(this.a);
        }
        if (this.b) {
            com_google_android_gms_internal_adw.a(this.b);
        }
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean b() {
        return this.b;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("description", this.a);
        hashMap.put("fatal", Boolean.valueOf(this.b));
        return a(hashMap);
    }
}
