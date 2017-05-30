package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.doubleclick.c;
import com.google.android.gms.ads.doubleclick.e;
import com.google.android.gms.ads.purchase.b;
import com.google.android.gms.ads.purchase.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.us;
import com.google.android.gms.internal.xp;
import com.google.android.gms.internal.ze;
import com.google.android.gms.internal.zi;

@aaa
public class g {
    private final xp a;
    private final Context b;
    private final y c;
    private a d;
    private a e;
    private ak f;
    private String g;
    private String h;
    private com.google.android.gms.ads.doubleclick.a i;
    private d j;
    private b k;
    private e l;
    private c m;
    private com.google.android.gms.ads.e n;
    private com.google.android.gms.ads.b.c o;
    private boolean p;

    public g(Context context) {
        this(context, y.a(), null);
    }

    public g(Context context, e eVar) {
        this(context, y.a(), eVar);
    }

    public g(Context context, y yVar, e eVar) {
        this.a = new xp();
        this.b = context;
        this.c = yVar;
        this.l = eVar;
    }

    private void b(String str) {
        if (this.g == null) {
            c(str);
        }
        this.f = ac.b().b(this.b, this.p ? AdSizeParcel.a() : new AdSizeParcel(), this.g, this.a);
        if (this.d != null) {
            this.f.a(new t(this.d));
        }
        if (this.e != null) {
            this.f.a(new s(this.e));
        }
        if (this.i != null) {
            this.f.a(new aa(this.i));
        }
        if (this.k != null) {
            this.f.a(new ze(this.k));
        }
        if (this.j != null) {
            this.f.a(new zi(this.j), this.h);
        }
        if (this.m != null) {
            this.f.a(new us(this.m));
        }
        if (this.n != null) {
            this.f.a(this.n.b());
        }
        if (this.o != null) {
            this.f.a(new com.google.android.gms.ads.internal.reward.client.g(this.o));
        }
    }

    private void c(String str) {
        if (this.f == null) {
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 63).append("The ad unit ID must be set on InterstitialAd before ").append(str).append(" is called.").toString());
        }
    }

    public a a() {
        return this.d;
    }

    public void a(a aVar) {
        try {
            this.d = aVar;
            if (this.f != null) {
                this.f.a(aVar != null ? new t(aVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AdListener.", e);
        }
    }

    public void a(com.google.android.gms.ads.b.c cVar) {
        try {
            this.o = cVar;
            if (this.f != null) {
                this.f.a(cVar != null ? new com.google.android.gms.ads.internal.reward.client.g(cVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AdListener.", e);
        }
    }

    public void a(com.google.android.gms.ads.doubleclick.a aVar) {
        try {
            this.i = aVar;
            if (this.f != null) {
                this.f.a(aVar != null ? new aa(aVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AppEventListener.", e);
        }
    }

    public void a(c cVar) {
        try {
            this.m = cVar;
            if (this.f != null) {
                this.f.a(cVar != null ? new us(cVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the OnCustomRenderedAdLoadedListener.", e);
        }
    }

    public void a(com.google.android.gms.ads.e eVar) {
        this.n = eVar;
        try {
            if (this.f != null) {
                this.f.a(this.n == null ? null : this.n.b());
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set correlator.", e);
        }
    }

    public void a(a aVar) {
        try {
            this.e = aVar;
            if (this.f != null) {
                this.f.a(aVar != null ? new s(aVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AdClickListener.", e);
        }
    }

    public void a(e eVar) {
        try {
            if (this.f == null) {
                b("loadAd");
            }
            if (this.f.a(this.c.a(this.b, eVar))) {
                this.a.a(eVar.j());
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to load ad.", e);
        }
    }

    public void a(b bVar) {
        if (this.j != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.k = bVar;
            if (this.f != null) {
                this.f.a(bVar != null ? new ze(bVar) : null);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void a(d dVar, String str) {
        if (this.k != null) {
            throw new IllegalStateException("In app purchase parameter has already been set.");
        }
        try {
            this.j = dVar;
            this.h = str;
            if (this.f != null) {
                this.f.a(dVar != null ? new zi(dVar) : null, str);
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to set the play store purchase parameter.", e);
        }
    }

    public void a(String str) {
        if (this.g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.g = str;
    }

    public void a(boolean z) {
        this.p = z;
    }

    public String b() {
        return this.g;
    }

    public com.google.android.gms.ads.doubleclick.a c() {
        return this.i;
    }

    public b d() {
        return this.k;
    }

    public c e() {
        return this.m;
    }

    public boolean f() {
        boolean z = false;
        try {
            if (this.f != null) {
                z = this.f.c();
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to check if ad is ready.", e);
        }
        return z;
    }

    public boolean g() {
        boolean z = false;
        try {
            if (this.f != null) {
                z = this.f.k();
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to check if ad is loading.", e);
        }
        return z;
    }

    public String h() {
        try {
            if (this.f != null) {
                return this.f.j();
            }
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public void i() {
        try {
            c("show");
            this.f.f();
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Failed to show interstitial.", e);
        }
    }
}
