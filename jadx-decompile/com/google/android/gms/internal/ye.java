package com.google.android.gms.internal;

import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;
import com.google.ads.mediation.h;
import com.google.ads.mediation.i;
import com.google.ads.mediation.j;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;

@aaa
public final class ye<NETWORK_EXTRAS extends j, SERVER_PARAMETERS extends i> implements f, h {
    private final xs a;

    public ye(xs xsVar) {
        this.a = xsVar;
    }

    public void a(e<?, ?> eVar) {
        b.a("Adapter called onReceivedAd.");
        if (ac.a().b()) {
            try {
                this.a.e();
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdLoaded.", e);
                return;
            }
        }
        b.d("onReceivedAd must be called on the main UI thread.");
        a.a.post(new 10(this));
    }

    public void a(e<?, ?> eVar, com.google.ads.a.a aVar) {
        String valueOf = String.valueOf(aVar);
        b.a(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(valueOf).toString());
        if (ac.a().b()) {
            try {
                this.a.a(yf.a(aVar));
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        b.d("onFailedToReceiveAd must be called on the main UI thread.");
        a.a.post(new 7(this, aVar));
    }

    public void a(g<?, ?> gVar) {
        b.a("Adapter called onReceivedAd.");
        if (ac.a().b()) {
            try {
                this.a.e();
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdLoaded.", e);
                return;
            }
        }
        b.d("onReceivedAd must be called on the main UI thread.");
        a.a.post(new 5(this));
    }

    public void a(g<?, ?> gVar, com.google.ads.a.a aVar) {
        String valueOf = String.valueOf(aVar);
        b.a(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(valueOf).append(".").toString());
        if (ac.a().b()) {
            try {
                this.a.a(yf.a(aVar));
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        b.d("onFailedToReceiveAd must be called on the main UI thread.");
        a.a.post(new 2(this, aVar));
    }

    public void b(e<?, ?> eVar) {
        b.a("Adapter called onPresentScreen.");
        if (ac.a().b()) {
            try {
                this.a.d();
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdOpened.", e);
                return;
            }
        }
        b.d("onPresentScreen must be called on the main UI thread.");
        a.a.post(new 9(this));
    }

    public void b(g<?, ?> gVar) {
        b.a("Adapter called onPresentScreen.");
        if (ac.a().b()) {
            try {
                this.a.d();
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdOpened.", e);
                return;
            }
        }
        b.d("onPresentScreen must be called on the main UI thread.");
        a.a.post(new 4(this));
    }

    public void c(e<?, ?> eVar) {
        b.a("Adapter called onDismissScreen.");
        if (ac.a().b()) {
            try {
                this.a.b();
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdClosed.", e);
                return;
            }
        }
        b.d("onDismissScreen must be called on the main UI thread.");
        a.a.post(new 6(this));
    }

    public void c(g<?, ?> gVar) {
        b.a("Adapter called onDismissScreen.");
        if (ac.a().b()) {
            try {
                this.a.b();
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdClosed.", e);
                return;
            }
        }
        b.d("onDismissScreen must be called on the main UI thread.");
        a.a.post(new 11(this));
    }

    public void d(e<?, ?> eVar) {
        b.a("Adapter called onLeaveApplication.");
        if (ac.a().b()) {
            try {
                this.a.c();
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        b.d("onLeaveApplication must be called on the main UI thread.");
        a.a.post(new 8(this));
    }

    public void d(g<?, ?> gVar) {
        b.a("Adapter called onLeaveApplication.");
        if (ac.a().b()) {
            try {
                this.a.c();
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        b.d("onLeaveApplication must be called on the main UI thread.");
        a.a.post(new 3(this));
    }

    public void e(e<?, ?> eVar) {
        b.a("Adapter called onClick.");
        if (ac.a().b()) {
            try {
                this.a.a();
                return;
            } catch (Throwable e) {
                b.d("Could not call onAdClicked.", e);
                return;
            }
        }
        b.d("onClick must be called on the main UI thread.");
        a.a.post(new 1(this));
    }
}
