package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.uo;
import com.google.android.gms.internal.uq;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.wy;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.yo;
import java.util.Map;

@aaa
public abstract class c extends b implements h, yo {
    public c(Context context, AdSizeParcel adSizeParcel, String str, xq xqVar, VersionInfoParcel versionInfoParcel, d dVar) {
        super(context, adSizeParcel, str, xqVar, versionInfoParcel, dVar);
    }

    public void E() {
        e();
    }

    public void F() {
        B();
        h();
    }

    public void G() {
        p();
    }

    protected acy a(a aVar, @Nullable e eVar, @Nullable com.google.android.gms.ads.internal.safebrowsing.c cVar) {
        acy com_google_android_gms_internal_acy = null;
        View nextView = this.f.f.getNextView();
        if (nextView instanceof acy) {
            com_google_android_gms_internal_acy = (acy) nextView;
            if (((Boolean) uf.ai.c()).booleanValue()) {
                b.a("Reusing webview...");
                com_google_android_gms_internal_acy.a(this.f.c, this.f.i, this.a);
            } else {
                com_google_android_gms_internal_acy.destroy();
                com_google_android_gms_internal_acy = null;
            }
        }
        if (com_google_android_gms_internal_acy == null) {
            if (nextView != null) {
                this.f.f.removeView(nextView);
            }
            com_google_android_gms_internal_acy = u.f().a(this.f.c, this.f.i, false, false, this.f.d, this.f.e, this.a, this, this.i);
            if (this.f.i.h == null) {
                a(com_google_android_gms_internal_acy.b());
            }
        }
        wy wyVar = com_google_android_gms_internal_acy;
        wyVar.l().a(this, this, this, this, false, this, null, eVar, this, cVar);
        a(wyVar);
        wyVar.b(aVar.a.w);
        return wyVar;
    }

    public void a(int i, int i2, int i3, int i4) {
        r();
    }

    protected void a(final a aVar, final un unVar) {
        if (aVar.e != -2) {
            abv.a.post(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.b(new abi(aVar, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        if (aVar.d != null) {
            this.f.i = aVar.d;
        }
        if (!aVar.b.h || aVar.b.B) {
            final com.google.android.gms.ads.internal.safebrowsing.c a = this.i.d.a(this.f.c, aVar.b);
            abv.a.post(new Runnable(this) {
                final /* synthetic */ c d;

                public void run() {
                    if (aVar.b.s && this.d.f.y != null) {
                        String str = null;
                        if (aVar.b.b != null) {
                            str = u.e().a(aVar.b.b);
                        }
                        uq uoVar = new uo(this.d, str, aVar.b.c);
                        this.d.f.E = 1;
                        try {
                            this.d.d = false;
                            this.d.f.y.a(uoVar);
                            return;
                        } catch (Throwable e) {
                            b.d("Could not call the onCustomRenderedAdLoadedListener.", e);
                            this.d.d = true;
                        }
                    }
                    final e eVar = new e(this.d.f.c, aVar);
                    acy a = this.d.a(aVar, eVar, a);
                    a.setOnTouchListener(new OnTouchListener(this) {
                        final /* synthetic */ AnonymousClass3 b;

                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            eVar.a();
                            return false;
                        }
                    });
                    a.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ AnonymousClass3 b;

                        public void onClick(View view) {
                            eVar.a();
                        }
                    });
                    this.d.f.E = 0;
                    this.d.f.h = u.d().a(this.d.f.c, this.d, aVar, this.d.f.d, a, this.d.j, this.d, unVar);
                }
            });
            return;
        }
        this.f.E = 0;
        this.f.h = u.d().a(this.f.c, this, aVar, this.f.d, null, this.j, this, unVar);
    }

    public void a(ur urVar) {
        d.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f.y = urVar;
    }

    protected void a(wy wyVar) {
        wyVar.a("/trackActiveViewUnit", new vt(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
                if (this.a.f.j != null) {
                    this.a.h.a(this.a.f.i, this.a.f.j, com_google_android_gms_internal_acy.b(), (wy) com_google_android_gms_internal_acy);
                } else {
                    b.d("Request to enable ActiveView before adState is available.");
                }
            }
        });
    }

    protected boolean a(@Nullable abi com_google_android_gms_internal_abi, abi com_google_android_gms_internal_abi2) {
        if (this.f.e() && this.f.f != null) {
            this.f.f.a().b(com_google_android_gms_internal_abi2.C);
        }
        return super.a(com_google_android_gms_internal_abi, com_google_android_gms_internal_abi2);
    }

    public void b(View view) {
        this.f.D = view;
        b(new abi(this.f.k, null, null, null, null, null, null, null));
    }
}
