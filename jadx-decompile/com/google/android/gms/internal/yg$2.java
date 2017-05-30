package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.util.client.b;

class yg$2 implements g {
    final /* synthetic */ yg a;

    yg$2(yg ygVar) {
        this.a = ygVar;
    }

    public void d_() {
        b.a("AdMobCustomTabsAdapter overlay is closed.");
        yg.a(this.a).c(this.a);
        yg.c(this.a).a(yg.b(this.a));
    }

    public void e_() {
        b.a("Opening AdMobCustomTabsAdapter overlay.");
        yg.a(this.a).b(this.a);
    }

    public void f_() {
        b.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    public void g() {
        b.a("AdMobCustomTabsAdapter overlay is resumed.");
    }
}
