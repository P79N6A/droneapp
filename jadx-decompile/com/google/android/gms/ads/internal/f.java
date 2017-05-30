package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.acz.c;
import com.google.android.gms.internal.acz.e;
import com.google.android.gms.internal.add;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.xq;
import java.util.List;

@aaa
public class f extends c implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean l;

    public class a {
        final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        public void a() {
            this.a.e();
        }
    }

    public f(Context context, AdSizeParcel adSizeParcel, String str, xq xqVar, VersionInfoParcel versionInfoParcel, d dVar) {
        super(context, adSizeParcel, str, xqVar, versionInfoParcel, dVar);
    }

    private AdSizeParcel b(com.google.android.gms.internal.abi.a aVar) {
        if (aVar.b.A) {
            return this.f.i;
        }
        d dVar;
        String str = aVar.b.m;
        if (str != null) {
            String[] split = str.split("[xX]");
            split[0] = split[0].trim();
            split[1] = split[1].trim();
            dVar = new d(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        } else {
            dVar = this.f.i.b();
        }
        return new AdSizeParcel(this.f.c, dVar);
    }

    private boolean b(@Nullable abi com_google_android_gms_internal_abi, abi com_google_android_gms_internal_abi2) {
        if (com_google_android_gms_internal_abi2.n) {
            View a = n.a(com_google_android_gms_internal_abi2);
            if (a == null) {
                b.d("Could not get mediation view");
                return false;
            }
            View nextView = this.f.f.getNextView();
            if (nextView != null) {
                if (nextView instanceof acy) {
                    ((acy) nextView).destroy();
                }
                this.f.f.removeView(nextView);
            }
            if (!n.b(com_google_android_gms_internal_abi2)) {
                try {
                    a(a);
                } catch (Throwable th) {
                    b.d("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            }
        } else if (!(com_google_android_gms_internal_abi2.v == null || com_google_android_gms_internal_abi2.b == null)) {
            com_google_android_gms_internal_abi2.b.a(com_google_android_gms_internal_abi2.v);
            this.f.f.removeAllViews();
            this.f.f.setMinimumWidth(com_google_android_gms_internal_abi2.v.g);
            this.f.f.setMinimumHeight(com_google_android_gms_internal_abi2.v.d);
            a(com_google_android_gms_internal_abi2.b.b());
        }
        if (this.f.f.getChildCount() > 1) {
            this.f.f.showNext();
        }
        if (com_google_android_gms_internal_abi != null) {
            View nextView2 = this.f.f.getNextView();
            if (nextView2 instanceof acy) {
                ((acy) nextView2).a(this.f.c, this.f.i, this.a);
            } else if (nextView2 != null) {
                this.f.f.removeView(nextView2);
            }
            this.f.d();
        }
        this.f.f.setVisibility(0);
        return true;
    }

    private void e(final abi com_google_android_gms_internal_abi) {
        if (this.f.e()) {
            if (com_google_android_gms_internal_abi.b != null) {
                if (com_google_android_gms_internal_abi.j != null) {
                    this.h.a(this.f.i, com_google_android_gms_internal_abi);
                }
                if (com_google_android_gms_internal_abi.a()) {
                    this.h.a(this.f.i, com_google_android_gms_internal_abi).a(com_google_android_gms_internal_abi.b);
                } else {
                    com_google_android_gms_internal_abi.b.l().a(new c(this) {
                        final /* synthetic */ f b;

                        public void a() {
                            this.b.h.a(this.b.f.i, com_google_android_gms_internal_abi).a(com_google_android_gms_internal_abi.b);
                        }
                    });
                }
            }
        } else if (this.f.D != null && com_google_android_gms_internal_abi.j != null) {
            this.h.a(this.f.i, com_google_android_gms_internal_abi, this.f.D);
        }
    }

    protected acy a(com.google.android.gms.internal.abi.a aVar, @Nullable e eVar, @Nullable com.google.android.gms.ads.internal.safebrowsing.c cVar) {
        if (this.f.i.h == null && this.f.i.j) {
            this.f.i = b(aVar);
        }
        return super.a(aVar, eVar, cVar);
    }

    protected void a(@Nullable abi com_google_android_gms_internal_abi, boolean z) {
        super.a(com_google_android_gms_internal_abi, z);
        if (n.b(com_google_android_gms_internal_abi)) {
            n.a(com_google_android_gms_internal_abi, new a(this));
        }
    }

    public void a(boolean z) {
        com.google.android.gms.common.internal.d.b("setManualImpressionsEnabled must be called from the main thread.");
        this.l = z;
    }

    public boolean a(AdRequestParcel adRequestParcel) {
        return super.a(d(adRequestParcel));
    }

    public boolean a(@Nullable abi com_google_android_gms_internal_abi, final abi com_google_android_gms_internal_abi2) {
        if (!super.a(com_google_android_gms_internal_abi, com_google_android_gms_internal_abi2)) {
            return false;
        }
        if (!this.f.e() || b(com_google_android_gms_internal_abi, com_google_android_gms_internal_abi2)) {
            add z;
            if (com_google_android_gms_internal_abi2.k) {
                d(com_google_android_gms_internal_abi2);
                u.C().a(this.f.f, (OnGlobalLayoutListener) this);
                u.C().a(this.f.f, (OnScrollChangedListener) this);
                if (!com_google_android_gms_internal_abi2.m) {
                    final Runnable anonymousClass1 = new Runnable(this) {
                        final /* synthetic */ f a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.d(this.a.f.j);
                        }
                    };
                    acz l = com_google_android_gms_internal_abi2.b != null ? com_google_android_gms_internal_abi2.b.l() : null;
                    if (l != null) {
                        l.a(new e(this) {
                            final /* synthetic */ f c;

                            public void a() {
                                if (!com_google_android_gms_internal_abi2.m) {
                                    u.e();
                                    abv.b(anonymousClass1);
                                }
                            }
                        });
                    }
                }
            } else if (!this.f.f() || ((Boolean) uf.bH.c()).booleanValue()) {
                a(com_google_android_gms_internal_abi2, false);
            }
            if (com_google_android_gms_internal_abi2.b != null) {
                z = com_google_android_gms_internal_abi2.b.z();
                acz l2 = com_google_android_gms_internal_abi2.b.l();
                if (l2 != null) {
                    l2.h();
                }
            } else {
                z = null;
            }
            if (!(this.f.x == null || z == null)) {
                z.b(this.f.x.b);
            }
            e(com_google_android_gms_internal_abi2);
            return true;
        }
        a(0);
        return false;
    }

    AdRequestParcel d(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.h == this.l) {
            return adRequestParcel;
        }
        int i = adRequestParcel.a;
        long j = adRequestParcel.b;
        Bundle bundle = adRequestParcel.c;
        int i2 = adRequestParcel.d;
        List list = adRequestParcel.e;
        boolean z = adRequestParcel.f;
        int i3 = adRequestParcel.g;
        boolean z2 = adRequestParcel.h || this.l;
        return new AdRequestParcel(i, j, bundle, i2, list, z, i3, z2, adRequestParcel.i, adRequestParcel.j, adRequestParcel.k, adRequestParcel.l, adRequestParcel.m, adRequestParcel.n, adRequestParcel.o, adRequestParcel.p, adRequestParcel.q, adRequestParcel.r);
    }

    void d(@Nullable abi com_google_android_gms_internal_abi) {
        if (com_google_android_gms_internal_abi != null && !com_google_android_gms_internal_abi.m && this.f.f != null && u.e().a(this.f.f, this.f.c) && this.f.f.getGlobalVisibleRect(new Rect(), null)) {
            if (!(com_google_android_gms_internal_abi == null || com_google_android_gms_internal_abi.b == null || com_google_android_gms_internal_abi.b.l() == null)) {
                com_google_android_gms_internal_abi.b.l().a(null);
            }
            a(com_google_android_gms_internal_abi, false);
            com_google_android_gms_internal_abi.m = true;
        }
    }

    public void f() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    @Nullable
    public com.google.android.gms.ads.internal.client.c l() {
        com.google.android.gms.common.internal.d.b("getVideoController must be called from the main thread.");
        return (this.f.j == null || this.f.j.b == null) ? null : this.f.j.b.z();
    }

    public void onGlobalLayout() {
        d(this.f.j);
    }

    public void onScrollChanged() {
        d(this.f.j);
    }

    protected boolean u() {
        boolean z = true;
        if (!u.e().a(this.f.c.getPackageManager(), this.f.c.getPackageName(), "android.permission.INTERNET")) {
            ac.a().a(this.f.f, this.f.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        if (!u.e().a(this.f.c)) {
            ac.a().a(this.f.f, this.f.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.f.f == null)) {
            this.f.f.setVisibility(0);
        }
        return z;
    }
}
