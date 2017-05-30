package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.acz.a;

@aaa
public class zo extends zj implements a {
    zo(Context context, abi.a aVar, acy com_google_android_gms_internal_acy, zn.a aVar2) {
        super(context, aVar, com_google_android_gms_internal_acy, aVar2);
    }

    protected void b() {
        if (this.e.e == -2) {
            this.c.l().a((a) this);
            f();
            b.a("Loading HTML in WebView.");
            this.c.loadDataWithBaseURL(u.e().a(this.e.b), this.e.c, "text/html", "UTF-8", null);
        }
    }

    protected void f() {
    }
}
