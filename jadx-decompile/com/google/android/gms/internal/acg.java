package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.c;

@aaa
public final class acg extends abq {
    private final c a;
    private final String b;

    public acg(Context context, String str, String str2) {
        this(str2, u.e().a(context, str));
    }

    public acg(String str, String str2) {
        this.a = new c(str2);
        this.b = str;
    }

    public void a() {
        this.a.a(this.b);
    }

    public void b() {
    }
}
