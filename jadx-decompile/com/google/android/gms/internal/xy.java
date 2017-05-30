package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.i;

@aaa
public final class xy implements d, f, h {
    private final xs a;
    private i b;

    public xy(xs xsVar) {
        this.a = xsVar;
    }

    public i a() {
        return this.b;
    }

    public void a(c cVar) {
        com.google.android.gms.common.internal.d.b("onAdLoaded must be called on the main UI thread.");
        b.a("Adapter called onAdLoaded.");
        try {
            this.a.e();
        } catch (Throwable e) {
            b.d("Could not call onAdLoaded.", e);
        }
    }

    public void a(c cVar, int i) {
        com.google.android.gms.common.internal.d.b("onAdFailedToLoad must be called on the main UI thread.");
        b.a("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.a.a(i);
        } catch (Throwable e) {
            b.d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void a(e eVar) {
        com.google.android.gms.common.internal.d.b("onAdLoaded must be called on the main UI thread.");
        b.a("Adapter called onAdLoaded.");
        try {
            this.a.e();
        } catch (Throwable e) {
            b.d("Could not call onAdLoaded.", e);
        }
    }

    public void a(e eVar, int i) {
        com.google.android.gms.common.internal.d.b("onAdFailedToLoad must be called on the main UI thread.");
        b.a("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.a.a(i);
        } catch (Throwable e) {
            b.d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void a(g gVar) {
        com.google.android.gms.common.internal.d.b("onAdOpened must be called on the main UI thread.");
        b.a("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (Throwable e) {
            b.d("Could not call onAdOpened.", e);
        }
    }

    public void a(g gVar, int i) {
        com.google.android.gms.common.internal.d.b("onAdFailedToLoad must be called on the main UI thread.");
        b.a("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.a.a(i);
        } catch (Throwable e) {
            b.d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void a(g gVar, i iVar) {
        com.google.android.gms.common.internal.d.b("onAdLoaded must be called on the main UI thread.");
        b.a("Adapter called onAdLoaded.");
        this.b = iVar;
        try {
            this.a.e();
        } catch (Throwable e) {
            b.d("Could not call onAdLoaded.", e);
        }
    }

    public void b(c cVar) {
        com.google.android.gms.common.internal.d.b("onAdOpened must be called on the main UI thread.");
        b.a("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (Throwable e) {
            b.d("Could not call onAdOpened.", e);
        }
    }

    public void b(e eVar) {
        com.google.android.gms.common.internal.d.b("onAdOpened must be called on the main UI thread.");
        b.a("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (Throwable e) {
            b.d("Could not call onAdOpened.", e);
        }
    }

    public void b(g gVar) {
        com.google.android.gms.common.internal.d.b("onAdClosed must be called on the main UI thread.");
        b.a("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (Throwable e) {
            b.d("Could not call onAdClosed.", e);
        }
    }

    public void c(c cVar) {
        com.google.android.gms.common.internal.d.b("onAdClosed must be called on the main UI thread.");
        b.a("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (Throwable e) {
            b.d("Could not call onAdClosed.", e);
        }
    }

    public void c(e eVar) {
        com.google.android.gms.common.internal.d.b("onAdClosed must be called on the main UI thread.");
        b.a("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (Throwable e) {
            b.d("Could not call onAdClosed.", e);
        }
    }

    public void c(g gVar) {
        com.google.android.gms.common.internal.d.b("onAdLeftApplication must be called on the main UI thread.");
        b.a("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (Throwable e) {
            b.d("Could not call onAdLeftApplication.", e);
        }
    }

    public void d(c cVar) {
        com.google.android.gms.common.internal.d.b("onAdLeftApplication must be called on the main UI thread.");
        b.a("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (Throwable e) {
            b.d("Could not call onAdLeftApplication.", e);
        }
    }

    public void d(e eVar) {
        com.google.android.gms.common.internal.d.b("onAdLeftApplication must be called on the main UI thread.");
        b.a("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (Throwable e) {
            b.d("Could not call onAdLeftApplication.", e);
        }
    }

    public void d(g gVar) {
        com.google.android.gms.common.internal.d.b("onAdClicked must be called on the main UI thread.");
        i a = a();
        if (a == null) {
            b.d("Could not call onAdClicked since NativeAdMapper is null.");
        } else if (a.b()) {
            b.a("Adapter called onAdClicked.");
            try {
                this.a.a();
            } catch (Throwable e) {
                b.d("Could not call onAdClicked.", e);
            }
        } else {
            b.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        }
    }

    public void e(c cVar) {
        com.google.android.gms.common.internal.d.b("onAdClicked must be called on the main UI thread.");
        b.a("Adapter called onAdClicked.");
        try {
            this.a.a();
        } catch (Throwable e) {
            b.d("Could not call onAdClicked.", e);
        }
    }

    public void e(e eVar) {
        com.google.android.gms.common.internal.d.b("onAdClicked must be called on the main UI thread.");
        b.a("Adapter called onAdClicked.");
        try {
            this.a.a();
        } catch (Throwable e) {
            b.d("Could not call onAdClicked.", e);
        }
    }

    public void e(g gVar) {
        com.google.android.gms.common.internal.d.b("onAdImpression must be called on the main UI thread.");
        i a = a();
        if (a == null) {
            b.d("Could not call onAdImpression since NativeAdMapper is null. ");
        } else if (a.a()) {
            b.a("Adapter called onAdImpression.");
            try {
                this.a.f();
            } catch (Throwable e) {
                b.d("Could not call onAdImpression.", e);
            }
        } else {
            b.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
        }
    }
}
