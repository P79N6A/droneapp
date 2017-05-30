package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.c;
import com.google.android.gms.ads.internal.purchase.f;
import com.google.android.gms.ads.internal.purchase.j;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abj;
import com.google.android.gms.internal.abk;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.vv;
import com.google.android.gms.internal.xi;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.yv;
import com.google.android.gms.internal.yx;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;

@aaa
public abstract class b extends a implements g, j, s, vv, xi {
    protected final xq j;
    protected transient boolean k;
    private final Messenger l;

    public b(Context context, AdSizeParcel adSizeParcel, String str, xq xqVar, VersionInfoParcel versionInfoParcel, d dVar) {
        this(new v(context, adSizeParcel, str, versionInfoParcel), xqVar, null, dVar);
    }

    protected b(v vVar, xq xqVar, @Nullable r rVar, d dVar) {
        super(vVar, rVar, dVar);
        this.j = xqVar;
        this.l = new Messenger(new yv(this.f.c));
        this.k = false;
    }

    private a a(AdRequestParcel adRequestParcel, Bundle bundle, abk com_google_android_gms_internal_abk) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo = this.f.c.getApplicationInfo();
        try {
            packageInfo = this.f.c.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.f.c.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (!(this.f.f == null || this.f.f.getParent() == null)) {
            int[] iArr = new int[2];
            this.f.f.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int width = this.f.f.getWidth();
            int height = this.f.f.getHeight();
            int i3 = 0;
            if (this.f.f.isShown() && i + width > 0 && i2 + height > 0 && i <= displayMetrics.widthPixels && i2 <= displayMetrics.heightPixels) {
                i3 = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i);
            bundle2.putInt("y", i2);
            bundle2.putInt(FimiMediaMeta.IJKM_KEY_WIDTH, width);
            bundle2.putInt(FimiMediaMeta.IJKM_KEY_HEIGHT, height);
            bundle2.putInt("visible", i3);
        }
        String c = u.i().c();
        this.f.l = new abj(c, this.f.b);
        this.f.l.a(adRequestParcel);
        String a = u.e().a(this.f.c, this.f.f, this.f.i);
        long j = 0;
        if (this.f.p != null) {
            try {
                j = this.f.p.b();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.b.d("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle a2 = u.i().a(this.f.c, this, c);
        List arrayList = new ArrayList();
        for (i = 0; i < this.f.v.size(); i++) {
            arrayList.add((String) this.f.v.keyAt(i));
        }
        boolean z = this.f.q != null;
        boolean z2 = this.f.r != null && u.i().r();
        boolean a3 = this.i.c.a(this.f.c);
        String str = "";
        if (((Boolean) uf.cu.c()).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.b.a("Getting webview cookie from CookieManager.");
            CookieManager b = u.g().b(this.f.c);
            if (b != null) {
                str = b.getCookie("googleads.g.doubleclick.net");
            }
        }
        String str2 = null;
        if (com_google_android_gms_internal_abk != null) {
            str2 = com_google_android_gms_internal_abk.c();
        }
        return new a(bundle2, adRequestParcel, this.f.i, this.f.b, applicationInfo, packageInfo, c, u.i().a(), this.f.e, a2, this.f.A, arrayList, bundle, u.i().g(), this.l, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, a, j, uuid, uf.a(), this.f.a, this.f.w, new CapabilityParcel(z, z2, a3), this.f.h(), u.e().g(), u.e().h(), u.e().k(this.f.c), u.e().b(this.f.f), this.f.c instanceof Activity, u.i().k(), str, str2, u.i().n(), u.B().a(), u.e().i(), u.m().a());
    }

    public void A() {
        B();
    }

    public void B() {
        a(this.f.j, false);
    }

    public void C() {
        u.e().a(new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.e.b();
            }
        });
    }

    public void D() {
        u.e().a(new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.e.c();
            }
        });
    }

    protected void a(@Nullable abi com_google_android_gms_internal_abi, boolean z) {
        if (com_google_android_gms_internal_abi == null) {
            com.google.android.gms.ads.internal.util.client.b.d("Ad state was null when trying to ping impression URLs.");
            return;
        }
        super.c(com_google_android_gms_internal_abi);
        if (!(com_google_android_gms_internal_abi.r == null || com_google_android_gms_internal_abi.r.d == null)) {
            u.x().a(this.f.c, this.f.e.b, com_google_android_gms_internal_abi, this.f.b, z, com_google_android_gms_internal_abi.r.d);
        }
        if (com_google_android_gms_internal_abi.o != null && com_google_android_gms_internal_abi.o.g != null) {
            u.x().a(this.f.c, this.f.e.b, com_google_android_gms_internal_abi, this.f.b, z, com_google_android_gms_internal_abi.o.g);
        }
    }

    public void a(yy yyVar) {
        d.b("setInAppPurchaseListener must be called on the main UI thread.");
        this.f.q = yyVar;
    }

    public void a(zd zdVar, @Nullable String str) {
        d.b("setPlayStorePurchaseParams must be called on the main UI thread.");
        this.f.B = new k(str);
        this.f.r = zdVar;
        if (!u.i().f() && zdVar != null) {
            Future future = (Future) new c(this.f.c, this.f.r, this.f.B).e();
        }
    }

    public void a(String str, ArrayList<String> arrayList) {
        yx dVar = new com.google.android.gms.ads.internal.purchase.d(str, arrayList, this.f.c, this.f.e.b);
        if (this.f.q == null) {
            com.google.android.gms.ads.internal.util.client.b.d("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!ac.a().b(this.f.c)) {
                com.google.android.gms.ads.internal.util.client.b.d("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            } else if (this.f.r == null) {
                com.google.android.gms.ads.internal.util.client.b.d("PlayStorePurchaseListener is not set.");
                return;
            } else if (this.f.B == null) {
                com.google.android.gms.ads.internal.util.client.b.d("PlayStorePurchaseVerifier is not initialized.");
                return;
            } else if (this.f.F) {
                com.google.android.gms.ads.internal.util.client.b.d("An in-app purchase request is already in progress, abort");
                return;
            } else {
                this.f.F = true;
                try {
                    if (this.f.r.a(str)) {
                        u.s().a(this.f.c, this.f.e.e, new GInAppPurchaseManagerInfoParcel(this.f.c, this.f.B, dVar, this));
                        return;
                    } else {
                        this.f.F = false;
                        return;
                    }
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.b.d("Could not start In-App purchase.");
                    this.f.F = false;
                    return;
                }
            }
        }
        try {
            this.f.q.a(dVar);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not start In-App purchase.");
        }
    }

    public void a(String str, boolean z, int i, final Intent intent, f fVar) {
        try {
            if (this.f.r != null) {
                this.f.r.a(new com.google.android.gms.ads.internal.purchase.g(this.f.c, str, z, i, intent, fVar));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.d("Fail to invoke PlayStorePurchaseListener.");
        }
        abv.a.postDelayed(new Runnable(this) {
            final /* synthetic */ b b;

            public void run() {
                int a = u.s().a(intent);
                u.s();
                if (!(a != 0 || this.b.f.j == null || this.b.f.j.b == null || this.b.f.j.b.i() == null)) {
                    this.b.f.j.b.i().a();
                }
                this.b.f.F = false;
            }
        }, 500);
    }

    protected boolean a(AdRequestParcel adRequestParcel, abi com_google_android_gms_internal_abi, boolean z) {
        if (!z && this.f.e()) {
            if (com_google_android_gms_internal_abi.h > 0) {
                this.e.a(adRequestParcel, com_google_android_gms_internal_abi.h);
            } else if (com_google_android_gms_internal_abi.r != null && com_google_android_gms_internal_abi.r.i > 0) {
                this.e.a(adRequestParcel, com_google_android_gms_internal_abi.r.i);
            } else if (!com_google_android_gms_internal_abi.n && com_google_android_gms_internal_abi.d == 2) {
                this.e.b(adRequestParcel);
            }
        }
        return this.e.d();
    }

    public boolean a(AdRequestParcel adRequestParcel, un unVar) {
        String str = null;
        if (!u()) {
            return false;
        }
        abk o;
        Bundle a = a(u.i().a(this.f.c));
        this.e.a();
        this.f.E = 0;
        if (((Boolean) uf.cd.c()).booleanValue()) {
            o = u.i().o();
            g A = u.A();
            Context context = this.f.c;
            VersionInfoParcel versionInfoParcel = this.f.e;
            if (o != null) {
                str = o.d();
            }
            A.a(context, versionInfoParcel, false, o, str, this.f.b);
        } else {
            o = null;
        }
        a a2 = a(adRequestParcel, a, o);
        unVar.a("seq_num", a2.g);
        unVar.a("request_id", a2.v);
        unVar.a("session_id", a2.h);
        if (a2.f != null) {
            unVar.a(Constants.EXTRA_KEY_APP_VERSION, String.valueOf(a2.f.versionCode));
        }
        this.f.g = u.a().a(this.f.c, a2, this.f.d, this);
        return true;
    }

    boolean a(abi com_google_android_gms_internal_abi) {
        AdRequestParcel adRequestParcel;
        boolean z = false;
        if (this.g != null) {
            adRequestParcel = this.g;
            this.g = null;
        } else {
            adRequestParcel = com_google_android_gms_internal_abi.a;
            if (adRequestParcel.c != null) {
                z = adRequestParcel.c.getBoolean("_noRefresh", false);
            }
        }
        return a(adRequestParcel, com_google_android_gms_internal_abi, z);
    }

    protected boolean a(@Nullable abi com_google_android_gms_internal_abi, abi com_google_android_gms_internal_abi2) {
        int i;
        int i2 = 0;
        if (!(com_google_android_gms_internal_abi == null || com_google_android_gms_internal_abi.s == null)) {
            com_google_android_gms_internal_abi.s.a(null);
        }
        if (com_google_android_gms_internal_abi2.s != null) {
            com_google_android_gms_internal_abi2.s.a((xi) this);
        }
        if (com_google_android_gms_internal_abi2.r != null) {
            i = com_google_android_gms_internal_abi2.r.o;
            i2 = com_google_android_gms_internal_abi2.r.p;
        } else {
            i = 0;
        }
        this.f.C.a(i, i2);
        return true;
    }

    public void b(abi com_google_android_gms_internal_abi) {
        super.b(com_google_android_gms_internal_abi);
        if (com_google_android_gms_internal_abi.o != null) {
            com.google.android.gms.ads.internal.util.client.b.a("Pinging network fill URLs.");
            u.x().a(this.f.c, this.f.e.b, com_google_android_gms_internal_abi, this.f.b, false, com_google_android_gms_internal_abi.o.h);
            if (!(com_google_android_gms_internal_abi.r == null || com_google_android_gms_internal_abi.r.f == null || com_google_android_gms_internal_abi.r.f.size() <= 0)) {
                com.google.android.gms.ads.internal.util.client.b.a("Pinging urls remotely");
                u.e().a(this.f.c, com_google_android_gms_internal_abi.r.f);
            }
        }
        if (com_google_android_gms_internal_abi.d == 3 && com_google_android_gms_internal_abi.r != null && com_google_android_gms_internal_abi.r.e != null) {
            com.google.android.gms.ads.internal.util.client.b.a("Pinging no fill URLs.");
            u.x().a(this.f.c, this.f.e.b, com_google_android_gms_internal_abi, this.f.b, false, com_google_android_gms_internal_abi.r.e);
        }
    }

    protected boolean b(AdRequestParcel adRequestParcel) {
        return super.b(adRequestParcel) && !this.k;
    }

    public void c_() {
        d.b("resume must be called on the main UI thread.");
        acy com_google_android_gms_internal_acy = null;
        if (!(this.f.j == null || this.f.j.b == null)) {
            com_google_android_gms_internal_acy = this.f.j.b;
        }
        if (com_google_android_gms_internal_acy != null && this.f.e()) {
            u.g().b(this.f.j.b);
        }
        if (!(this.f.j == null || this.f.j.p == null)) {
            try {
                this.f.j.p.e();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not resume mediation adapter.");
            }
        }
        if (com_google_android_gms_internal_acy == null || !com_google_android_gms_internal_acy.u()) {
            this.e.c();
        }
        this.h.e(this.f.j);
    }

    public void d() {
        d.b("pause must be called on the main UI thread.");
        if (!(this.f.j == null || this.f.j.b == null || !this.f.e())) {
            u.g().a(this.f.j.b);
        }
        if (!(this.f.j == null || this.f.j.p == null)) {
            try {
                this.f.j.p.d();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not pause mediation adapter.");
            }
        }
        this.h.d(this.f.j);
        this.e.b();
    }

    public void d_() {
        this.h.b(this.f.j);
        this.k = false;
        p();
        this.f.l.c();
    }

    public void e() {
        if (this.f.j == null) {
            com.google.android.gms.ads.internal.util.client.b.d("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.f.j.r == null || this.f.j.r.c == null)) {
            u.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.r.c);
        }
        if (!(this.f.j.o == null || this.f.j.o.f == null)) {
            u.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.o.f);
        }
        super.e();
    }

    public void e_() {
        this.k = true;
        r();
    }

    public void f() {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public void f_() {
        this.h.d(this.f.j);
    }

    public void g() {
        this.h.e(this.f.j);
    }

    public String j() {
        return this.f.j == null ? null : this.f.j.q;
    }

    protected boolean u() {
        return u.e().a(this.f.c.getPackageManager(), this.f.c.getPackageName(), "android.permission.INTERNET") && u.e().a(this.f.c);
    }

    public void v() {
        e();
    }

    public void w() {
        d_();
    }

    public void x() {
        m();
    }

    public void y() {
        e_();
    }

    public void z() {
        if (this.f.j != null) {
            String str = this.f.j.q;
            com.google.android.gms.ads.internal.util.client.b.d(new StringBuilder(String.valueOf(str).length() + 74).append("Mediation adapter ").append(str).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        a(this.f.j, true);
        s();
    }
}
