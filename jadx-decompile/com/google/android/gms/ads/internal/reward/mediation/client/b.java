package com.google.android.gms.ads.internal.reward.mediation.client;

import com.google.android.gms.ads.b.a.a;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;

@aaa
public class b implements com.google.android.gms.ads.b.a.b {
    private final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    public void a(a aVar) {
        d.b("onInitializationSucceeded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onInitializationSucceeded.");
        try {
            this.a.a(f.a((Object) aVar));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not call onInitializationSucceeded.", e);
        }
    }

    public void a(a aVar, int i) {
        d.b("onInitializationFailed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onInitializationFailed.");
        try {
            this.a.a(f.a((Object) aVar), i);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not call onInitializationFailed.", e);
        }
    }

    public void a(a aVar, com.google.android.gms.ads.b.a aVar2) {
        d.b("onRewarded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onRewarded.");
        if (aVar2 != null) {
            try {
                this.a.a(f.a((Object) aVar), new RewardItemParcel(aVar2));
                return;
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not call onRewarded.", e);
                return;
            }
        }
        this.a.a(f.a((Object) aVar), new RewardItemParcel(aVar.getClass().getName(), 1));
    }

    public void b(a aVar) {
        d.b("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdLoaded.");
        try {
            this.a.b(f.a((Object) aVar));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdLoaded.", e);
        }
    }

    public void b(a aVar, int i) {
        d.b("onAdFailedToLoad must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdFailedToLoad.");
        try {
            this.a.b(f.a((Object) aVar), i);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void c(a aVar) {
        d.b("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdOpened.");
        try {
            this.a.c(f.a((Object) aVar));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdOpened.", e);
        }
    }

    public void d(a aVar) {
        d.b("onVideoStarted must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onVideoStarted.");
        try {
            this.a.d(f.a((Object) aVar));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not call onVideoStarted.", e);
        }
    }

    public void e(a aVar) {
        d.b("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdClosed.");
        try {
            this.a.e(f.a((Object) aVar));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdClosed.", e);
        }
    }

    public void f(a aVar) {
        d.b("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdClicked.");
        try {
            this.a.f(f.a((Object) aVar));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdClicked.", e);
        }
    }

    public void g(a aVar) {
        d.b("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a("Adapter called onAdLeftApplication.");
        try {
            this.a.g(f.a((Object) aVar));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not call onAdLeftApplication.", e);
        }
    }
}
