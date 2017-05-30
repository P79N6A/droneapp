package com.google.android.gms.internal;

import com.google.android.gms.internal.acr.a;
import com.google.android.gms.internal.acr.b;
import com.google.android.gms.internal.acr.c;

public class wx$c extends acs<wy> {
    private final Object d = new Object();
    private final wx$d e;
    private boolean f;

    public wx$c(wx$d com_google_android_gms_internal_wx_d) {
        this.e = com_google_android_gms_internal_wx_d;
    }

    public void q_() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            a(new c<wy>(this) {
                final /* synthetic */ wx$c a;

                {
                    this.a = r1;
                }

                public void a(wy wyVar) {
                    abr.e("Ending javascript session.");
                    ((xa) wyVar).a();
                }

                public /* synthetic */ void a(Object obj) {
                    a((wy) obj);
                }
            }, new b());
            a(new c<wy>(this) {
                final /* synthetic */ wx$c a;

                {
                    this.a = r1;
                }

                public void a(wy wyVar) {
                    abr.e("Releasing engine reference.");
                    this.a.e.s_();
                }

                public /* synthetic */ void a(Object obj) {
                    a((wy) obj);
                }
            }, new a(this) {
                final /* synthetic */ wx$c a;

                {
                    this.a = r1;
                }

                public void a() {
                    this.a.e.s_();
                }
            });
        }
    }
}
