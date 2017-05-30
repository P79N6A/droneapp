package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.u;

@aaa
public class wg extends abq {
    final acy a;
    final wi b;
    private final String c;

    wg(acy com_google_android_gms_internal_acy, wi wiVar, String str) {
        this.a = com_google_android_gms_internal_acy;
        this.b = wiVar;
        this.c = str;
        u.B().a(this);
    }

    public void a() {
        try {
            this.b.a(this.c);
        } finally {
            abv.a.post(new 1(this));
        }
    }

    public void b() {
        this.b.a();
    }
}
