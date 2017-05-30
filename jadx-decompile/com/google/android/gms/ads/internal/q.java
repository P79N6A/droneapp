package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.d;
import com.google.android.gms.ads.internal.formats.e;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.formats.g;
import com.google.android.gms.ads.internal.formats.h;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.xu;
import com.google.android.gms.internal.xv;
import com.google.android.gms.internal.yy;
import java.util.List;

@aaa
public class q extends b {
    private acy l;

    public q(Context context, d dVar, AdSizeParcel adSizeParcel, String str, xq xqVar, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, str, xqVar, versionInfoParcel, dVar);
    }

    private static d a(xu xuVar) {
        return new d(xuVar.a(), xuVar.b(), xuVar.c(), xuVar.d() != null ? xuVar.d() : null, xuVar.e(), xuVar.f(), xuVar.g(), xuVar.h(), null, xuVar.l(), xuVar.m(), null);
    }

    private static e a(xv xvVar) {
        return new e(xvVar.a(), xvVar.b(), xvVar.c(), xvVar.d() != null ? xvVar.d() : null, xvVar.e(), xvVar.f(), null, xvVar.j());
    }

    private void a(final d dVar) {
        abv.a.post(new Runnable(this) {
            final /* synthetic */ q b;

            public void run() {
                try {
                    if (this.b.f.s != null) {
                        this.b.f.s.a(dVar);
                    }
                } catch (Throwable e) {
                    b.d("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
                }
            }
        });
    }

    private void a(final e eVar) {
        abv.a.post(new Runnable(this) {
            final /* synthetic */ q b;

            public void run() {
                try {
                    if (this.b.f.t != null) {
                        this.b.f.t.a(eVar);
                    }
                } catch (Throwable e) {
                    b.d("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
                }
            }
        });
    }

    private void a(final abi com_google_android_gms_internal_abi, final String str) {
        abv.a.post(new Runnable(this) {
            final /* synthetic */ q c;

            public void run() {
                try {
                    ((vi) this.c.f.v.get(str)).a((f) com_google_android_gms_internal_abi.E);
                } catch (Throwable e) {
                    b.d("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
                }
            }
        });
    }

    public void E() {
        if (this.f.j == null || this.l == null) {
            b.d("Request to enable ActiveView before adState is available.");
        } else {
            u.i().p().a(this.f.i, this.f.j, this.l.b(), this.l);
        }
    }

    public SimpleArrayMap<String, vi> F() {
        com.google.android.gms.common.internal.d.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f.v;
    }

    public void G() {
        if (this.l != null) {
            this.l.destroy();
            this.l = null;
        }
    }

    public void H() {
        if (this.l != null && this.l.z() != null && this.f.w != null && this.f.w.f != null) {
            this.l.z().b(this.f.w.f.b);
        }
    }

    public void a(SimpleArrayMap<String, vi> simpleArrayMap) {
        com.google.android.gms.common.internal.d.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        this.f.v = simpleArrayMap;
    }

    public void a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        com.google.android.gms.common.internal.d.b("setNativeAdOptions must be called on the main UI thread.");
        this.f.w = nativeAdOptionsParcel;
    }

    public void a(g gVar) {
        if (this.l != null) {
            this.l.a(gVar);
        }
    }

    public void a(i iVar) {
        if (this.f.j.j != null) {
            u.i().p().a(this.f.i, this.f.j, iVar);
        }
    }

    public void a(final a aVar, un unVar) {
        if (aVar.d != null) {
            this.f.i = aVar.d;
        }
        if (aVar.e != -2) {
            abv.a.post(new Runnable(this) {
                final /* synthetic */ q b;

                public void run() {
                    this.b.b(new abi(aVar, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.f.E = 0;
        this.f.h = u.d().a(this.f.c, this, aVar, this.f.d, null, this.j, this, unVar);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(this.f.h.getClass().getName());
        b.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public void a(acy com_google_android_gms_internal_acy) {
        this.l = com_google_android_gms_internal_acy;
    }

    public void a(ur urVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public void a(vf vfVar) {
        com.google.android.gms.common.internal.d.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        this.f.s = vfVar;
    }

    public void a(vg vgVar) {
        com.google.android.gms.common.internal.d.b("setOnContentAdLoadedListener must be called on the main UI thread.");
        this.f.t = vgVar;
    }

    public void a(yy yyVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public void a(@Nullable List<String> list) {
        com.google.android.gms.common.internal.d.b("setNativeTemplates must be called on the main UI thread.");
        this.f.A = list;
    }

    protected boolean a(AdRequestParcel adRequestParcel, abi com_google_android_gms_internal_abi, boolean z) {
        return this.e.d();
    }

    protected boolean a(abi com_google_android_gms_internal_abi, abi com_google_android_gms_internal_abi2) {
        a(null);
        if (this.f.e()) {
            if (com_google_android_gms_internal_abi2.n) {
                try {
                    xu h = com_google_android_gms_internal_abi2.p != null ? com_google_android_gms_internal_abi2.p.h() : null;
                    xv i = com_google_android_gms_internal_abi2.p != null ? com_google_android_gms_internal_abi2.p.i() : null;
                    if (h == null || this.f.s == null) {
                        if (i != null) {
                            if (this.f.t != null) {
                                e a = a(i);
                                a.a(new h(this.f.c, this, this.f.d, i, (i.a) a));
                                a(a);
                            }
                        }
                        b.d("No matching mapper/listener for retrieved native ad template.");
                        a(0);
                        return false;
                    }
                    d a2 = a(h);
                    a2.a(new h(this.f.c, this, this.f.d, h, (i.a) a2));
                    a(a2);
                } catch (Throwable e) {
                    b.d("Failed to get native ad mapper", e);
                }
            } else {
                i.a aVar = com_google_android_gms_internal_abi2.E;
                if ((aVar instanceof e) && this.f.t != null) {
                    a((e) com_google_android_gms_internal_abi2.E);
                } else if ((aVar instanceof d) && this.f.s != null) {
                    a((d) com_google_android_gms_internal_abi2.E);
                } else if (!(aVar instanceof f) || this.f.v == null || this.f.v.get(((f) aVar).l()) == null) {
                    b.d("No matching listener for retrieved native ad template.");
                    a(0);
                    return false;
                } else {
                    a(com_google_android_gms_internal_abi2, ((f) aVar).l());
                }
            }
            return super.a(com_google_android_gms_internal_abi, com_google_android_gms_internal_abi2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    public void b(SimpleArrayMap<String, vh> simpleArrayMap) {
        com.google.android.gms.common.internal.d.b("setOnCustomClickListener must be called on the main UI thread.");
        this.f.u = simpleArrayMap;
    }

    @Nullable
    public vh c(String str) {
        com.google.android.gms.common.internal.d.b("getOnCustomClickListener must be called on the main UI thread.");
        return (vh) this.f.u.get(str);
    }

    public void c_() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public void d() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public void f() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }
}
