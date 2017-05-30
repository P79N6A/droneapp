package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.af;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.am;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.ads.internal.reward.client.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abj;
import com.google.android.gms.internal.abo;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.aby;
import com.google.android.gms.internal.ach;
import com.google.android.gms.internal.ack;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.ro;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@aaa
public final class v implements OnGlobalLayoutListener, OnScrollChangedListener {
    @Nullable
    List<String> A;
    @Nullable
    k B;
    @Nullable
    public abo C;
    @Nullable
    View D;
    public int E;
    boolean F;
    boolean G;
    private HashSet<abj> H;
    private int I;
    private int J;
    private ach K;
    private boolean L;
    private boolean M;
    private boolean N;
    final String a;
    public String b;
    public final Context c;
    final ro d;
    public final VersionInfoParcel e;
    @Nullable
    a f;
    @Nullable
    public abq g;
    @Nullable
    public abx h;
    public AdSizeParcel i;
    @Nullable
    public abi j;
    public com.google.android.gms.internal.abi.a k;
    @Nullable
    public abj l;
    @Nullable
    af m;
    @Nullable
    ag n;
    @Nullable
    am o;
    @Nullable
    ao p;
    @Nullable
    yy q;
    @Nullable
    zd r;
    @Nullable
    vf s;
    @Nullable
    vg t;
    SimpleArrayMap<String, vh> u;
    SimpleArrayMap<String, vi> v;
    NativeAdOptionsParcel w;
    @Nullable
    VideoOptionsParcel x;
    @Nullable
    ur y;
    @Nullable
    d z;

    public static class a extends ViewSwitcher {
        private final aby a;
        @Nullable
        private final ack b;

        public a(Context context, String str, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
            super(context);
            this.a = new aby(context);
            this.a.a(str);
            if (context instanceof Activity) {
                this.b = new ack((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
            } else {
                this.b = new ack(null, this, onGlobalLayoutListener, onScrollChangedListener);
            }
            this.b.a();
        }

        public aby a() {
            return this.a;
        }

        public void b() {
            abr.e("Disable position monitoring on adFrame.");
            if (this.b != null) {
                this.b.b();
            }
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.b != null) {
                this.b.c();
            }
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.b != null) {
                this.b.d();
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.a.a(motionEvent);
            return false;
        }

        public void removeAllViews() {
            List<acy> arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (childAt instanceof acy)) {
                    arrayList.add((acy) childAt);
                }
            }
            super.removeAllViews();
            for (acy destroy : arrayList) {
                destroy.destroy();
            }
        }
    }

    public v(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel) {
        this(context, adSizeParcel, str, versionInfoParcel, null);
    }

    v(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel, ro roVar) {
        this.C = null;
        this.D = null;
        this.E = 0;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = -1;
        this.J = -1;
        this.L = true;
        this.M = true;
        this.N = false;
        uf.a(context);
        if (u.i().e() != null) {
            List b = uf.b();
            if (versionInfoParcel.c != 0) {
                b.add(Integer.toString(versionInfoParcel.c));
            }
            u.i().e().a(b);
        }
        this.a = UUID.randomUUID().toString();
        if (adSizeParcel.e || adSizeParcel.i) {
            this.f = null;
        } else {
            this.f = new a(context, str, this, this);
            this.f.setMinimumWidth(adSizeParcel.g);
            this.f.setMinimumHeight(adSizeParcel.d);
            this.f.setVisibility(4);
        }
        this.i = adSizeParcel;
        this.b = str;
        this.c = context;
        this.e = versionInfoParcel;
        if (roVar == null) {
            roVar = new ro(new i(this));
        }
        this.d = roVar;
        this.K = new ach(200);
        this.v = new SimpleArrayMap();
    }

    private void b(boolean z) {
        boolean z2 = true;
        if (this.f != null && this.j != null && this.j.b != null && this.j.b.l() != null) {
            if (!z || this.K.a()) {
                if (this.j.b.l().b()) {
                    int[] iArr = new int[2];
                    this.f.getLocationOnScreen(iArr);
                    int b = ac.a().b(this.c, iArr[0]);
                    int b2 = ac.a().b(this.c, iArr[1]);
                    if (!(b == this.I && b2 == this.J)) {
                        this.I = b;
                        this.J = b2;
                        acz l = this.j.b.l();
                        b = this.I;
                        int i = this.J;
                        if (z) {
                            z2 = false;
                        }
                        l.a(b, i, z2);
                    }
                }
                k();
            }
        }
    }

    private void k() {
        if (this.f != null) {
            View findViewById = this.f.getRootView().findViewById(16908290);
            if (findViewById != null) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                this.f.getGlobalVisibleRect(rect);
                findViewById.getGlobalVisibleRect(rect2);
                if (rect.top != rect2.top) {
                    this.L = false;
                }
                if (rect.bottom != rect2.bottom) {
                    this.M = false;
                }
            }
        }
    }

    public HashSet<abj> a() {
        return this.H;
    }

    public void a(HashSet<abj> hashSet) {
        this.H = hashSet;
    }

    public void a(boolean z) {
        if (this.E == 0) {
            c();
        }
        if (this.g != null) {
            this.g.d();
        }
        if (this.h != null) {
            this.h.d();
        }
        if (z) {
            this.j = null;
        }
    }

    public void b() {
        if (this.j != null && this.j.b != null) {
            this.j.b.destroy();
        }
    }

    public void c() {
        if (this.j != null && this.j.b != null) {
            this.j.b.stopLoading();
        }
    }

    public void d() {
        if (this.j != null && this.j.p != null) {
            try {
                this.j.p.c();
            } catch (RemoteException e) {
                b.d("Could not destroy mediation adapter.");
            }
        }
    }

    public boolean e() {
        return this.E == 0;
    }

    public boolean f() {
        return this.E == 1;
    }

    public void g() {
        if (this.f != null) {
            this.f.b();
        }
    }

    public String h() {
        return (this.L && this.M) ? "" : this.L ? this.N ? "top-scrollable" : "top-locked" : this.M ? this.N ? "bottom-scrollable" : "bottom-locked" : "";
    }

    public void i() {
        if (this.l != null) {
            if (this.j != null) {
                this.l.a(this.j.A);
                this.l.b(this.j.B);
                this.l.b(this.j.n);
            }
            this.l.a(this.i.e);
        }
    }

    public void j() {
        g();
        this.n = null;
        this.o = null;
        this.r = null;
        this.q = null;
        this.y = null;
        this.p = null;
        a(false);
        if (this.f != null) {
            this.f.removeAllViews();
        }
        b();
        d();
        this.j = null;
    }

    public void onGlobalLayout() {
        b(false);
    }

    public void onScrollChanged() {
        b(true);
        this.N = true;
    }
}
