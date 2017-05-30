package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.doubleclick.c;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.purchase.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.us;
import com.google.android.gms.internal.xp;
import com.google.android.gms.internal.ze;
import com.google.android.gms.internal.zi;
import java.util.concurrent.atomic.AtomicBoolean;

@aaa
public class f {
    final ae a;
    private final xp b;
    private final y c;
    private final AtomicBoolean d;
    private final h e;
    private a f;
    private a g;
    private d[] h;
    private com.google.android.gms.ads.doubleclick.a i;
    private e j;
    private ak k;
    private b l;
    private c m;
    private com.google.android.gms.ads.purchase.d n;
    private i o;
    private String p;
    private String q;
    private ViewGroup r;
    private boolean s;
    private boolean t;

    public f(ViewGroup viewGroup) {
        this(viewGroup, null, false, y.a(), false);
    }

    public f(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, y.a(), false);
    }

    f(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, y yVar, ak akVar, boolean z2) {
        this.b = new xp();
        this.e = new h();
        this.a = new ae(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.e.a(this.a.o());
                super.a();
            }

            public void a(int i) {
                this.a.e.a(this.a.o());
                super.a(i);
            }
        };
        this.r = viewGroup;
        this.c = yVar;
        this.k = akVar;
        this.d = new AtomicBoolean(false);
        this.s = z2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzk com_google_android_gms_ads_internal_client_zzk = new zzk(context, attributeSet);
                this.h = com_google_android_gms_ads_internal_client_zzk.a(z);
                this.p = com_google_android_gms_ads_internal_client_zzk.a();
                if (viewGroup.isInEditMode()) {
                    ac.a().a(viewGroup, a(context, this.h[0], this.s), "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                ac.a().a(viewGroup, new AdSizeParcel(context, d.c), e.getMessage(), e.getMessage());
            }
        }
    }

    f(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, y yVar, boolean z2) {
        this(viewGroup, attributeSet, z, yVar, null, z2);
    }

    public f(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, boolean z2) {
        this(viewGroup, attributeSet, z, y.a(), z2);
    }

    public f(ViewGroup viewGroup, boolean z) {
        this(viewGroup, null, false, y.a(), z);
    }

    private static AdSizeParcel a(Context context, d dVar, boolean z) {
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, dVar);
        adSizeParcel.a(z);
        return adSizeParcel;
    }

    private static AdSizeParcel a(Context context, d[] dVarArr, boolean z) {
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, dVarArr);
        adSizeParcel.a(z);
        return adSizeParcel;
    }

    private void s() {
        try {
            com.google.android.gms.c.e a = this.k.a();
            if (a != null) {
                this.r.addView((View) com.google.android.gms.c.f.a(a));
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to get an ad frame.", e);
        }
    }

    public void a() {
        try {
            if (this.k != null) {
                this.k.b();
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to destroy AdView.", e);
        }
    }

    public void a(a aVar) {
        this.g = aVar;
        this.a.a(aVar);
    }

    public void a(com.google.android.gms.ads.doubleclick.a aVar) {
        try {
            this.i = aVar;
            if (this.k != null) {
                this.k.a(aVar != null ? new aa(aVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AppEventListener.", e);
        }
    }

    public void a(c cVar) {
        this.m = cVar;
        try {
            if (this.k != null) {
                this.k.a(cVar != null ? new us(cVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    public void a(e eVar) {
        this.j = eVar;
        try {
            if (this.k != null) {
                this.k.a(this.j == null ? null : this.j.b());
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set correlator.", e);
        }
    }

    public void a(i iVar) {
        this.o = iVar;
        try {
            if (this.k != null) {
                this.k.a(iVar == null ? null : new VideoOptionsParcel(iVar));
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set video options.", e);
        }
    }

    public void a(a aVar) {
        try {
            this.f = aVar;
            if (this.k != null) {
                this.k.a(aVar != null ? new s(aVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AdClickListener.", e);
        }
    }

    public void a(e eVar) {
        try {
            if (this.k == null) {
                q();
            }
            if (this.k.a(this.c.a(this.r.getContext(), eVar))) {
                this.b.a(eVar.j());
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to load ad.", e);
        }
    }

    public void a(b bVar) {
        if (this.n != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.l = bVar;
            if (this.k != null) {
                this.k.a(bVar != null ? new ze(bVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void a(com.google.android.gms.ads.purchase.d dVar, String str) {
        if (this.l != null) {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        try {
            this.n = dVar;
            this.q = str;
            if (this.k != null) {
                this.k.a(dVar != null ? new zi(dVar) : null, str);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the play store purchase parameter.", e);
        }
    }

    public void a(String str) {
        if (this.p != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.p = str;
    }

    public void a(boolean z) {
        this.t = z;
        try {
            if (this.k != null) {
                this.k.a(this.t);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set manual impressions.", e);
        }
    }

    public void a(d... dVarArr) {
        if (this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        b(dVarArr);
    }

    public boolean a(AdSizeParcel adSizeParcel) {
        return "search_v2".equals(adSizeParcel.b);
    }

    public a b() {
        return this.g;
    }

    public void b(d... dVarArr) {
        this.h = dVarArr;
        try {
            if (this.k != null) {
                this.k.a(a(this.r.getContext(), this.h, this.s));
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the ad size.", e);
        }
        this.r.requestLayout();
    }

    public d c() {
        try {
            if (this.k != null) {
                AdSizeParcel i = this.k.i();
                if (i != null) {
                    return i.b();
                }
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to get the current AdSize.", e);
        }
        return this.h != null ? this.h[0] : null;
    }

    public d[] d() {
        return this.h;
    }

    public String e() {
        return this.p;
    }

    public com.google.android.gms.ads.doubleclick.a f() {
        return this.i;
    }

    public b g() {
        return this.l;
    }

    public c h() {
        return this.m;
    }

    public void i() {
        try {
            if (this.k != null) {
                this.k.d();
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to call pause.", e);
        }
    }

    public void j() {
        if (!this.d.getAndSet(true)) {
            try {
                if (this.k != null) {
                    this.k.h();
                }
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Failed to record impression.", e);
            }
        }
    }

    public void k() {
        try {
            if (this.k != null) {
                this.k.c_();
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to call resume.", e);
        }
    }

    public String l() {
        try {
            if (this.k != null) {
                return this.k.j();
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public boolean m() {
        try {
            if (this.k != null) {
                return this.k.k();
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to check if ad is loading.", e);
        }
        return false;
    }

    public h n() {
        return this.e;
    }

    public c o() {
        c cVar = null;
        if (this.k != null) {
            try {
                cVar = this.k.l();
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Failed to retrieve VideoController.", e);
            }
        }
        return cVar;
    }

    public i p() {
        return this.o;
    }

    void q() {
        if ((this.h == null || this.p == null) && this.k == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        this.k = r();
        this.k.a(new t(this.a));
        if (this.f != null) {
            this.k.a(new s(this.f));
        }
        if (this.i != null) {
            this.k.a(new aa(this.i));
        }
        if (this.l != null) {
            this.k.a(new ze(this.l));
        }
        if (this.n != null) {
            this.k.a(new zi(this.n), this.q);
        }
        if (this.m != null) {
            this.k.a(new us(this.m));
        }
        if (this.j != null) {
            this.k.a(this.j.b());
        }
        if (this.o != null) {
            this.k.a(new VideoOptionsParcel(this.o));
        }
        this.k.a(this.t);
        s();
    }

    protected ak r() {
        Context context = this.r.getContext();
        AdSizeParcel a = a(context, this.h, this.s);
        return a(a) ? ac.b().a(context, a, this.p) : ac.b().a(context, a, this.p, this.b);
    }
}
