package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.aby;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.uf;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Future;

@aaa
public class d extends com.google.android.gms.internal.yq.a implements u {
    static final int a = Color.argb(0, 0, 0, 0);
    AdOverlayInfoParcel b;
    acy c;
    c d;
    o e;
    boolean f = false;
    FrameLayout g;
    CustomViewCallback h;
    boolean i = false;
    boolean j = false;
    b k;
    boolean l = false;
    int m = 0;
    l n;
    private final Activity o;
    private final Object p = new Object();
    private Runnable q;
    private boolean r;
    private boolean s;
    private boolean t = false;
    private boolean u = false;
    private boolean v = true;

    @aaa
    private static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    @aaa
    static class b extends RelativeLayout {
        aby a;
        boolean b;

        public b(Context context, String str) {
            super(context);
            this.a = new aby(context, str);
        }

        void a() {
            this.b = true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.b) {
                this.a.a(motionEvent);
            }
            return false;
        }
    }

    @aaa
    public static class c {
        public final int a;
        public final LayoutParams b;
        public final ViewGroup c;
        public final Context d;

        public c(acy com_google_android_gms_internal_acy) {
            this.b = com_google_android_gms_internal_acy.getLayoutParams();
            ViewParent parent = com_google_android_gms_internal_acy.getParent();
            this.d = com_google_android_gms_internal_acy.g();
            if (parent == null || !(parent instanceof ViewGroup)) {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
            this.c = (ViewGroup) parent;
            this.a = this.c.indexOfChild(com_google_android_gms_internal_acy.b());
            this.c.removeView(com_google_android_gms_internal_acy.b());
            com_google_android_gms_internal_acy.a(true);
        }
    }

    @aaa
    private class d extends abq {
        final /* synthetic */ d a;

        private d(d dVar) {
            this.a = dVar;
        }

        public void a() {
            Bitmap a = u.z().a(Integer.valueOf(this.a.b.q.g));
            if (a != null) {
                final Drawable a2 = u.g().a(this.a.o, a, this.a.b.q.e, this.a.b.q.f);
                abv.a.post(new Runnable(this) {
                    final /* synthetic */ d b;

                    public void run() {
                        this.b.a.o.getWindow().setBackgroundDrawable(a2);
                    }
                });
            }
        }

        public void b() {
        }
    }

    public d(Activity activity) {
        this.o = activity;
        this.n = new s();
    }

    public void a() {
        this.m = 2;
        this.o.finish();
    }

    public void a(int i) {
        this.o.setRequestedOrientation(i);
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(Bundle bundle) {
        boolean z = false;
        this.o.requestWindowFeature(1);
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.i = z;
        try {
            this.b = AdOverlayInfoParcel.a(this.o.getIntent());
            if (this.b == null) {
                throw new a("Could not get info for ad overlay.");
            }
            if (this.b.n.d > 7500000) {
                this.m = 3;
            }
            if (this.o.getIntent() != null) {
                this.v = this.o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.b.q != null) {
                this.j = this.b.q.b;
            } else {
                this.j = false;
            }
            if (((Boolean) uf.bA.c()).booleanValue() && this.j && this.b.q.g != -1) {
                Future future = (Future) new d().e();
            }
            if (bundle == null) {
                if (this.b.d != null && this.v) {
                    this.b.d.e_();
                }
                if (!(this.b.l == 1 || this.b.c == null)) {
                    this.b.c.e();
                }
            }
            this.k = new b(this.o, this.b.p);
            this.k.setId(1000);
            switch (this.b.l) {
                case 1:
                    b(false);
                    return;
                case 2:
                    this.d = new c(this.b.e);
                    b(false);
                    return;
                case 3:
                    b(true);
                    return;
                case 4:
                    if (this.i) {
                        this.m = 3;
                        this.o.finish();
                        return;
                    } else if (!u.b().a(this.o, this.b.b, this.b.j)) {
                        this.m = 3;
                        this.o.finish();
                        return;
                    } else {
                        return;
                    }
                default:
                    throw new a("Could not determine ad overlay type.");
            }
        } catch (a e) {
            com.google.android.gms.ads.internal.util.client.b.d(e.getMessage());
            this.m = 3;
            this.o.finish();
        }
    }

    public void a(View view, CustomViewCallback customViewCallback) {
        this.g = new FrameLayout(this.o);
        this.g.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.g.addView(view, -1, -1);
        this.o.setContentView(this.g);
        l();
        this.h = customViewCallback;
        this.f = true;
    }

    public void a(e eVar) {
        if (((Boolean) uf.cK.c()).booleanValue() && s.m()) {
            if (u.e().a(this.o, (Configuration) f.a(eVar))) {
                this.o.getWindow().addFlags(1024);
                this.o.getWindow().clearFlags(2048);
                return;
            }
            this.o.getWindow().addFlags(2048);
            this.o.getWindow().clearFlags(1024);
        }
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        this.n.a(com_google_android_gms_internal_acy, map);
    }

    public void a(boolean z) {
        this.e = new o(this.o, z ? 50 : 32, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.e.a(z, this.b.h);
        this.k.addView(this.e, layoutParams);
    }

    public void a(boolean z, boolean z2) {
        if (this.e != null) {
            this.e.a(z, z2);
        }
    }

    public void b() {
        if (this.b != null && this.f) {
            a(this.b.k);
        }
        if (this.g != null) {
            this.o.setContentView(this.k);
            l();
            this.g.removeAllViews();
            this.g = null;
        }
        if (this.h != null) {
            this.h.onCustomViewHidden();
            this.h = null;
        }
        this.f = false;
    }

    protected void b(int i) {
        this.c.a(i);
    }

    public void b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
    }

    protected void b(boolean z) {
        if (!this.s) {
            this.o.requestWindowFeature(1);
        }
        Window window = this.o.getWindow();
        if (window == null) {
            throw new a("Invalid activity, no window available.");
        }
        boolean a = (s.m() && ((Boolean) uf.cK.c()).booleanValue()) ? u.e().a(this.o, this.o.getResources().getConfiguration()) : true;
        Object obj = (this.b.q == null || !this.b.q.c) ? null : 1;
        if (!(this.j && obj == null) && a) {
            window.setFlags(1024, 1024);
        }
        acz l = this.b.e.l();
        boolean b = l != null ? l.b() : false;
        this.l = false;
        if (b) {
            if (this.b.k == u.g().a()) {
                this.l = this.o.getResources().getConfiguration().orientation == 1;
            } else if (this.b.k == u.g().b()) {
                this.l = this.o.getResources().getConfiguration().orientation == 2;
            }
        }
        com.google.android.gms.ads.internal.util.client.b.a("Delay onShow to next orientation change: " + this.l);
        a(this.b.k);
        if (u.g().a(window)) {
            com.google.android.gms.ads.internal.util.client.b.a("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.j) {
            this.k.setBackgroundColor(a);
        } else {
            this.k.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.o.setContentView(this.k);
        l();
        if (z) {
            this.c = u.f().a(this.o, this.b.e.k(), true, b, null, this.b.n, null, null, this.b.e.h());
            this.c.l().a(null, null, this.b.f, this.b.j, true, this.b.o, null, this.b.e.l().a(), null, null);
            this.c.l().a(new com.google.android.gms.internal.acz.a(this) {
                final /* synthetic */ d a;

                {
                    this.a = r1;
                }

                public void a(acy com_google_android_gms_internal_acy, boolean z) {
                    com_google_android_gms_internal_acy.d();
                }
            });
            if (this.b.m != null) {
                this.c.loadUrl(this.b.m);
            } else if (this.b.i != null) {
                this.c.loadDataWithBaseURL(this.b.g, this.b.i, "text/html", "UTF-8", null);
            } else {
                throw new a("No URL or HTML to display in ad overlay.");
            }
            if (this.b.e != null) {
                this.b.e.b(this);
            }
        } else {
            this.c = this.b.e;
            this.c.a(this.o);
        }
        this.c.a(this);
        ViewParent parent = this.c.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.c.b());
        }
        if (this.j) {
            this.c.H();
        }
        this.k.addView(this.c.b(), -1, -1);
        if (!(z || this.l)) {
            q();
        }
        a(b);
        if (this.c.m()) {
            a(b, true);
        }
        com.google.android.gms.ads.internal.d h = this.c.h();
        m mVar = h != null ? h.c : null;
        if (mVar != null) {
            this.n = mVar.a(this.o, this.c, this.k);
        } else {
            com.google.android.gms.ads.internal.util.client.b.d("Appstreaming controller is null.");
        }
    }

    public void c() {
        this.m = 1;
        this.o.finish();
    }

    public void d() {
        this.m = 0;
    }

    public boolean e() {
        boolean z = true;
        this.m = 0;
        if (this.c != null) {
            if (!(this.c.t() && this.n.d())) {
                z = false;
            }
            if (!z) {
                this.c.a("onbackblocked", Collections.emptyMap());
            }
        }
        return z;
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
        if (this.b != null && this.b.l == 4) {
            if (this.i) {
                this.m = 3;
                this.o.finish();
            } else {
                this.i = true;
            }
        }
        if (this.b.d != null) {
            this.b.d.g();
        }
        if (this.c == null || this.c.r()) {
            com.google.android.gms.ads.internal.util.client.b.d("The webview does not exit. Ignoring action.");
        } else {
            u.g().b(this.c);
        }
        this.n.b();
    }

    public void i() {
        this.n.a();
        b();
        if (this.b.d != null) {
            this.b.d.f_();
        }
        if (this.c != null && (!this.o.isFinishing() || this.d == null)) {
            u.g().a(this.c);
        }
        n();
    }

    public void j() {
        n();
    }

    public void k() {
        if (this.c != null) {
            this.k.removeView(this.c.b());
        }
        n();
    }

    public void l() {
        this.s = true;
    }

    public void m() {
        this.k.removeView(this.e);
        a(true);
    }

    protected void n() {
        if (this.o.isFinishing() && !this.t) {
            this.t = true;
            if (this.c != null) {
                b(this.m);
                synchronized (this.p) {
                    if (!this.r && this.c.A()) {
                        this.q = new Runnable(this) {
                            final /* synthetic */ d a;

                            {
                                this.a = r1;
                            }

                            public void run() {
                                this.a.o();
                            }
                        };
                        abv.a.postDelayed(this.q, ((Long) uf.au.c()).longValue());
                        return;
                    }
                }
            }
            o();
        }
    }

    void o() {
        if (!this.u) {
            this.u = true;
            if (this.c != null) {
                this.k.removeView(this.c.b());
                if (this.d != null) {
                    this.c.a(this.d.d);
                    this.c.a(false);
                    this.d.c.addView(this.c.b(), this.d.a, this.d.b);
                    this.d = null;
                } else if (this.o.getApplicationContext() != null) {
                    this.c.a(this.o.getApplicationContext());
                }
                this.c = null;
            }
            if (!(this.b == null || this.b.d == null)) {
                this.b.d.d_();
            }
            this.n.c();
        }
    }

    public void p() {
        if (this.l) {
            this.l = false;
            q();
        }
    }

    protected void q() {
        this.c.d();
    }

    public void r() {
        this.k.a();
    }

    public void s() {
        synchronized (this.p) {
            this.r = true;
            if (this.q != null) {
                abv.a.removeCallbacks(this.q);
                abv.a.post(this.q);
            }
        }
    }
}
