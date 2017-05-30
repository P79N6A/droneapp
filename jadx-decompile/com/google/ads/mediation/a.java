package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.adn;
import java.util.Date;
import java.util.Set;

@aaa
public abstract class a implements com.google.android.gms.ads.b.a.a, com.google.android.gms.ads.mediation.c, g, adn {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    protected AdView zzfz;
    protected f zzga;
    private com.google.android.gms.ads.b zzgb;
    private Context zzgc;
    private f zzgd;
    private com.google.android.gms.ads.b.a.b zzge;
    final com.google.android.gms.ads.b.c zzgf = new com.google.android.gms.ads.b.c(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void a() {
            this.a.zzge.b(this.a);
        }

        public void a(int i) {
            this.a.zzge.b(this.a, i);
        }

        public void a(com.google.android.gms.ads.b.a aVar) {
            this.a.zzge.a(this.a, aVar);
        }

        public void b() {
            this.a.zzge.c(this.a);
        }

        public void c() {
            this.a.zzge.d(this.a);
        }

        public void d() {
            this.a.zzge.e(this.a);
            this.a.zzgd = null;
        }

        public void e() {
            this.a.zzge.g(this.a);
        }
    };

    static class a extends j {
        private final com.google.android.gms.ads.formats.c d;

        public a(com.google.android.gms.ads.formats.c cVar) {
            this.d = cVar;
            a(cVar.b().toString());
            a(cVar.c());
            b(cVar.d().toString());
            a(cVar.e());
            c(cVar.f().toString());
            if (cVar.g() != null) {
                a(cVar.g().doubleValue());
            }
            if (cVar.h() != null) {
                d(cVar.h().toString());
            }
            if (cVar.i() != null) {
                e(cVar.i().toString());
            }
            a(true);
            b(true);
            a(cVar.j());
        }

        public void a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.d);
            }
        }
    }

    static class b extends k {
        private final com.google.android.gms.ads.formats.d d;

        public b(com.google.android.gms.ads.formats.d dVar) {
            this.d = dVar;
            a(dVar.b().toString());
            a(dVar.c());
            b(dVar.d().toString());
            if (dVar.e() != null) {
                a(dVar.e());
            }
            c(dVar.f().toString());
            d(dVar.g().toString());
            a(true);
            b(true);
        }

        public void a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.d);
            }
        }
    }

    static final class c extends com.google.android.gms.ads.a implements com.google.android.gms.ads.internal.client.a {
        final a a;
        final com.google.android.gms.ads.mediation.d b;

        public c(a aVar, com.google.android.gms.ads.mediation.d dVar) {
            this.a = aVar;
            this.b = dVar;
        }

        public void a() {
            this.b.a(this.a);
        }

        public void a(int i) {
            this.b.a(this.a, i);
        }

        public void b() {
            this.b.b(this.a);
        }

        public void c() {
            this.b.c(this.a);
        }

        public void d() {
            this.b.d(this.a);
        }

        public void e() {
            this.b.e(this.a);
        }
    }

    static final class d extends com.google.android.gms.ads.a implements com.google.android.gms.ads.internal.client.a {
        final a a;
        final com.google.android.gms.ads.mediation.f b;

        public d(a aVar, com.google.android.gms.ads.mediation.f fVar) {
            this.a = aVar;
            this.b = fVar;
        }

        public void a() {
            this.b.a(this.a);
        }

        public void a(int i) {
            this.b.a(this.a, i);
        }

        public void b() {
            this.b.b(this.a);
        }

        public void c() {
            this.b.c(this.a);
        }

        public void d() {
            this.b.d(this.a);
        }

        public void e() {
            this.b.e(this.a);
        }
    }

    static final class e extends com.google.android.gms.ads.a implements com.google.android.gms.ads.formats.c.a, com.google.android.gms.ads.formats.d.a, com.google.android.gms.ads.internal.client.a {
        final a a;
        final h b;

        public e(a aVar, h hVar) {
            this.a = aVar;
            this.b = hVar;
        }

        public void a() {
        }

        public void a(int i) {
            this.b.a(this.a, i);
        }

        public void a(com.google.android.gms.ads.formats.c cVar) {
            this.b.a(this.a, new a(cVar));
        }

        public void a(com.google.android.gms.ads.formats.d dVar) {
            this.b.a(this.a, new b(dVar));
        }

        public void b() {
            this.b.a(this.a);
        }

        public void c() {
            this.b.b(this.a);
        }

        public void d() {
            this.b.c(this.a);
        }

        public void e() {
            this.b.d(this.a);
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzfz;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new com.google.android.gms.ads.mediation.b.a().a(1).a();
    }

    public void initialize(Context context, com.google.android.gms.ads.mediation.a aVar, String str, com.google.android.gms.ads.b.a.b bVar, Bundle bundle, Bundle bundle2) {
        this.zzgc = context.getApplicationContext();
        this.zzge = bVar;
        this.zzge.a(this);
    }

    public boolean isInitialized() {
        return this.zzge != null;
    }

    public void loadAd(com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        if (this.zzgc == null || this.zzge == null) {
            com.google.android.gms.ads.internal.util.client.b.b("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzgd = new f(this.zzgc);
        this.zzgd.a(true);
        this.zzgd.a(getAdUnitId(bundle));
        this.zzgd.a(this.zzgf);
        this.zzgd.a(zza(this.zzgc, aVar, bundle2, bundle));
    }

    public void onDestroy() {
        if (this.zzfz != null) {
            this.zzfz.d();
            this.zzfz = null;
        }
        if (this.zzga != null) {
            this.zzga = null;
        }
        if (this.zzgb != null) {
            this.zzgb = null;
        }
        if (this.zzgd != null) {
            this.zzgd = null;
        }
    }

    public void onPause() {
        if (this.zzfz != null) {
            this.zzfz.c();
        }
    }

    public void onResume() {
        if (this.zzfz != null) {
            this.zzfz.b();
        }
    }

    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.d dVar, Bundle bundle, com.google.android.gms.ads.d dVar2, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.zzfz = new AdView(context);
        this.zzfz.setAdSize(new com.google.android.gms.ads.d(dVar2.b(), dVar2.a()));
        this.zzfz.setAdUnitId(getAdUnitId(bundle));
        this.zzfz.setAdListener(new c(this, dVar));
        this.zzfz.a(zza(context, aVar, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.f fVar, Bundle bundle, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.zzga = new f(context);
        this.zzga.a(getAdUnitId(bundle));
        this.zzga.a(new d(this, fVar));
        this.zzga.a(zza(context, aVar, bundle2, bundle));
    }

    public void requestNativeAd(Context context, h hVar, Bundle bundle, l lVar, Bundle bundle2) {
        com.google.android.gms.ads.formats.d.a eVar = new e(this, hVar);
        com.google.android.gms.ads.b.a a = zza(context, bundle.getString(AD_UNIT_ID_PARAMETER)).a((com.google.android.gms.ads.a) eVar);
        com.google.android.gms.ads.formats.b h = lVar.h();
        if (h != null) {
            a.a(h);
        }
        if (lVar.i()) {
            a.a((com.google.android.gms.ads.formats.c.a) eVar);
        }
        if (lVar.j()) {
            a.a(eVar);
        }
        this.zzgb = a.a();
        this.zzgb.a(zza(context, lVar, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzga.g();
    }

    public void showVideo() {
        this.zzgd.g();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    com.google.android.gms.ads.b.a zza(Context context, String str) {
        return new com.google.android.gms.ads.b.a(context, str);
    }

    com.google.android.gms.ads.c zza(Context context, com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        com.google.android.gms.ads.c.a aVar2 = new com.google.android.gms.ads.c.a();
        Date a = aVar.a();
        if (a != null) {
            aVar2.a(a);
        }
        int b = aVar.b();
        if (b != 0) {
            aVar2.a(b);
        }
        Set<String> c = aVar.c();
        if (c != null) {
            for (String a2 : c) {
                aVar2.a(a2);
            }
        }
        Location d = aVar.d();
        if (d != null) {
            aVar2.a(d);
        }
        if (aVar.f()) {
            aVar2.b(ac.a().a(context));
        }
        if (aVar.e() != -1) {
            aVar2.a(aVar.e() == 1);
        }
        aVar2.b(aVar.g());
        aVar2.a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar2.a();
    }
}
