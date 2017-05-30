package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.u;

@aaa
public class abo {
    private final Object a;
    private int b;
    private int c;
    private final abl d;
    private final String e;

    abo(abl com_google_android_gms_internal_abl, String str) {
        this.a = new Object();
        this.d = com_google_android_gms_internal_abl;
        this.e = str;
    }

    public abo(String str) {
        this(u.i(), str);
    }

    public Bundle a() {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.b);
            bundle.putInt("pmnll", this.c);
        }
        return bundle;
    }

    public void a(int i, int i2) {
        synchronized (this.a) {
            this.b = i;
            this.c = i2;
            this.d.a(this.e, this);
        }
    }
}
