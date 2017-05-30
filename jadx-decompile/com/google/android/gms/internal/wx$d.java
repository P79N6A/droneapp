package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.acr.a;
import com.google.android.gms.internal.acr.b;
import com.google.android.gms.internal.acr.c;

public class wx$d extends acs<wu> {
    private final Object d = new Object();
    private aca<wu> e;
    private boolean f;
    private int g;

    public wx$d(aca<wu> com_google_android_gms_internal_aca_com_google_android_gms_internal_wu) {
        this.e = com_google_android_gms_internal_aca_com_google_android_gms_internal_wu;
        this.f = false;
        this.g = 0;
    }

    public void c() {
        boolean z = true;
        synchronized (this.d) {
            if (this.g < 0) {
                z = false;
            }
            d.a(z);
            abr.e("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f = true;
            d();
        }
    }

    protected void d() {
        synchronized (this.d) {
            d.a(this.g >= 0);
            if (this.f && this.g == 0) {
                abr.e("No reference is left (including root). Cleaning up engine.");
                a(new c<wu>(this) {
                    final /* synthetic */ wx$d a;

                    {
                        this.a = r1;
                    }

                    public void a(final wu wuVar) {
                        u.e().a(new Runnable(this) {
                            final /* synthetic */ AnonymousClass3 b;

                            public void run() {
                                this.b.a.e.a(wuVar);
                                wuVar.a();
                            }
                        });
                    }

                    public /* synthetic */ void a(Object obj) {
                        a((wu) obj);
                    }
                }, new b());
            } else {
                abr.e("There are still references to the engine. Not destroying.");
            }
        }
    }

    public wx$c r_() {
        final wx$c com_google_android_gms_internal_wx_c = new wx$c(this);
        synchronized (this.d) {
            a(new c<wu>(this) {
                final /* synthetic */ wx$d b;

                public void a(wu wuVar) {
                    abr.e("Getting a new session for JS Engine.");
                    com_google_android_gms_internal_wx_c.a(wuVar.b());
                }

                public /* synthetic */ void a(Object obj) {
                    a((wu) obj);
                }
            }, new a(this) {
                final /* synthetic */ wx$d b;

                public void a() {
                    abr.e("Rejecting reference for JS Engine.");
                    com_google_android_gms_internal_wx_c.a();
                }
            });
            d.a(this.g >= 0);
            this.g++;
        }
        return com_google_android_gms_internal_wx_c;
    }

    protected void s_() {
        boolean z = true;
        synchronized (this.d) {
            if (this.g < 1) {
                z = false;
            }
            d.a(z);
            abr.e("Releasing 1 reference for JS Engine");
            this.g--;
            d();
        }
    }
}
