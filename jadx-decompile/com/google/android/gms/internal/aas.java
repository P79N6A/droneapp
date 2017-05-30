package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.client.a.a;
import com.google.android.gms.common.internal.c;

@aaa
public class aas extends a {
    private final String a;
    private final int b;

    public aas(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aas)) {
            return false;
        }
        aas com_google_android_gms_internal_aas = (aas) obj;
        return c.a(a(), com_google_android_gms_internal_aas.a()) && c.a(Integer.valueOf(b()), Integer.valueOf(com_google_android_gms_internal_aas.b()));
    }
}
