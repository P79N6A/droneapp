package com.google.android.gms.internal;

import com.google.android.gms.internal.acr.a;
import com.google.android.gms.internal.acr.c;

class aae$2 implements Runnable {
    final /* synthetic */ wx a;
    final /* synthetic */ aag b;
    final /* synthetic */ un c;
    final /* synthetic */ ul d;
    final /* synthetic */ String e;

    aae$2(wx wxVar, aag com_google_android_gms_internal_aag, un unVar, ul ulVar, String str) {
        this.a = wxVar;
        this.b = com_google_android_gms_internal_aag;
        this.c = unVar;
        this.d = ulVar;
        this.e = str;
    }

    public void run() {
        wx$c a = this.a.a();
        this.b.a(a);
        this.c.a(this.d, new String[]{"rwc"});
        final ul a2 = this.c.a();
        a.a(new c<wy>(this) {
            final /* synthetic */ aae$2 b;

            public void a(wy wyVar) {
                this.b.c.a(a2, new String[]{"jsf"});
                this.b.c.b();
                wyVar.a("/invalidRequest", this.b.b.b);
                wyVar.a("/loadAdURL", this.b.b.c);
                wyVar.a("/loadAd", this.b.b.d);
                try {
                    wyVar.a("AFMA_getAd", this.b.e);
                } catch (Throwable e) {
                    abr.b("Error requesting an ad url", e);
                }
            }

            public /* synthetic */ void a(Object obj) {
                a((wy) obj);
            }
        }, new a(this) {
            final /* synthetic */ aae$2 a;

            {
                this.a = r1;
            }

            public void a() {
            }
        });
    }
}
