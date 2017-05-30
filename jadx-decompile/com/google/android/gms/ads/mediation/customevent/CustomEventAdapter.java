package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter implements com.google.android.gms.ads.mediation.c, e, g {
    b a;
    e b;
    h c;
    private View d;

    static final class a implements c {
        private final CustomEventAdapter a;
        private final d b;

        public a(CustomEventAdapter customEventAdapter, d dVar) {
            this.a = customEventAdapter;
            this.b = dVar;
        }

        public void a() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClicked.");
            this.b.e(this.a);
        }

        public void a(int i) {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdFailedToLoad.");
            this.b.a(this.a, i);
        }

        public void a(View view) {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLoaded.");
            this.a.a(view);
            this.b.a(this.a);
        }

        public void b() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdOpened.");
            this.b.b(this.a);
        }

        public void c() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClosed.");
            this.b.c(this.a);
        }

        public void d() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLeftApplication.");
            this.b.d(this.a);
        }
    }

    class b implements f {
        final /* synthetic */ CustomEventAdapter a;
        private final CustomEventAdapter b;
        private final f c;

        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, f fVar) {
            this.a = customEventAdapter;
            this.b = customEventAdapter2;
            this.c = fVar;
        }

        public void a() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClicked.");
            this.c.e(this.b);
        }

        public void a(int i) {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
            this.c.a(this.b, i);
        }

        public void b() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdOpened.");
            this.c.b(this.b);
        }

        public void c() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClosed.");
            this.c.c(this.b);
        }

        public void d() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLeftApplication.");
            this.c.d(this.b);
        }

        public void e() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onReceivedAd.");
            this.c.a(this.a);
        }
    }

    static class c implements i {
        private final CustomEventAdapter a;
        private final h b;

        public c(CustomEventAdapter customEventAdapter, h hVar) {
            this.a = customEventAdapter;
            this.b = hVar;
        }

        public void a() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClicked.");
            this.b.d(this.a);
        }

        public void a(int i) {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdFailedToLoad.");
            this.b.a(this.a, i);
        }

        public void a(i iVar) {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLoaded.");
            this.b.a(this.a, iVar);
        }

        public void b() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdOpened.");
            this.b.a(this.a);
        }

        public void c() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdClosed.");
            this.b.b(this.a);
        }

        public void d() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdLeftApplication.");
            this.b.c(this.a);
        }

        public void e() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onAdImpression.");
            this.b.e(this.a);
        }
    }

    private static <T> T a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String valueOf = String.valueOf(th.getMessage());
            com.google.android.gms.ads.internal.util.client.b.d(new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(valueOf).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    private void a(View view) {
        this.d = view;
    }

    b a(f fVar) {
        return new b(this, this, fVar);
    }

    public View getBannerView() {
        return this.d;
    }

    public void onDestroy() {
        if (this.a != null) {
            this.a.a();
        }
        if (this.b != null) {
            this.b.a();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    public void onPause() {
        if (this.a != null) {
            this.a.b();
        }
        if (this.b != null) {
            this.b.b();
        }
        if (this.c != null) {
            this.c.b();
        }
    }

    public void onResume() {
        if (this.a != null) {
            this.a.c();
        }
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.c();
        }
    }

    public void requestBannerAd(Context context, d dVar, Bundle bundle, com.google.android.gms.ads.d dVar2, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.a = (b) a(bundle.getString("class_name"));
        if (this.a == null) {
            dVar.a(this, 0);
            return;
        }
        this.a.a(context, new a(this, dVar), bundle.getString(com.google.android.gms.ads.b.a.a.a), dVar2, aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void requestInterstitialAd(Context context, f fVar, Bundle bundle, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.b = (e) a(bundle.getString("class_name"));
        if (this.b == null) {
            fVar.a(this, 0);
            return;
        }
        this.b.a(context, a(fVar), bundle.getString(com.google.android.gms.ads.b.a.a.a), aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void requestNativeAd(Context context, h hVar, Bundle bundle, l lVar, Bundle bundle2) {
        this.c = (h) a(bundle.getString("class_name"));
        if (this.c == null) {
            hVar.a((g) this, 0);
            return;
        }
        this.c.a(context, new c(this, hVar), bundle.getString(com.google.android.gms.ads.b.a.a.a), lVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void showInterstitial() {
        this.b.d();
    }
}
