package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.ag.a;
import com.google.android.gms.ads.internal.u;

class wn$1 extends a {
    final /* synthetic */ wn a;

    wn$1(wn wnVar) {
        this.a = wnVar;
    }

    public void a() {
        wn.a(this.a).add(new wn$a(this) {
            final /* synthetic */ wn$1 a;

            {
                this.a = r1;
            }

            public void a(wo woVar) {
                if (woVar.a != null) {
                    woVar.a.a();
                }
                u.t().a();
            }
        });
    }

    public void a(final int i) {
        wn.a(this.a).add(new wn$a(this) {
            final /* synthetic */ wn$1 b;

            public void a(wo woVar) {
                if (woVar.a != null) {
                    woVar.a.a(i);
                }
            }
        });
        abr.e("Pooled interstitial failed to load.");
    }

    public void b() {
        wn.a(this.a).add(new wn$a(this) {
            final /* synthetic */ wn$1 a;

            {
                this.a = r1;
            }

            public void a(wo woVar) {
                if (woVar.a != null) {
                    woVar.a.b();
                }
            }
        });
    }

    public void c() {
        wn.a(this.a).add(new wn$a(this) {
            final /* synthetic */ wn$1 a;

            {
                this.a = r1;
            }

            public void a(wo woVar) {
                if (woVar.a != null) {
                    woVar.a.c();
                }
            }
        });
        abr.e("Pooled interstitial loaded.");
    }

    public void d() {
        wn.a(this.a).add(new wn$a(this) {
            final /* synthetic */ wn$1 a;

            {
                this.a = r1;
            }

            public void a(wo woVar) {
                if (woVar.a != null) {
                    woVar.a.d();
                }
            }
        });
    }
}
