package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.overlay.e;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.r;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aal;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abw;
import com.google.android.gms.internal.abz;
import com.google.android.gms.internal.acd;
import com.google.android.gms.internal.acf;
import com.google.android.gms.internal.acq;
import com.google.android.gms.internal.act;
import com.google.android.gms.internal.ada;
import com.google.android.gms.internal.tp;
import com.google.android.gms.internal.uc;
import com.google.android.gms.internal.ud;
import com.google.android.gms.internal.ue;
import com.google.android.gms.internal.ui;
import com.google.android.gms.internal.wh;
import com.google.android.gms.internal.wp;
import com.google.android.gms.internal.xc;
import com.google.android.gms.internal.xm;
import com.google.android.gms.internal.zn;

@aaa
public class u {
    private static final Object a = new Object();
    private static u b;
    private final r A = new r();
    private final xm B = new xm();
    private final acf C = new acf();
    private final p D = new p();
    private final wh E = new wh();
    private final act F = new act();
    private final a c = new a();
    private final com.google.android.gms.ads.internal.request.a d = new com.google.android.gms.ads.internal.request.a();
    private final e e = new e();
    private final zn f = new zn();
    private final abv g = new abv();
    private final ada h = new ada();
    private final abw i = abw.a(VERSION.SDK_INT);
    private final tp j = new tp();
    private final abl k = new abl(this.g);
    private final com.google.android.gms.ads.internal.cache.a l = new com.google.android.gms.ads.internal.cache.a();
    private final com.google.android.gms.common.util.e m = new h();
    private final g n = new g();
    private final ui o = new ui();
    private final abz p = new abz();
    private final aal q = new aal();
    private final uc r = new uc();
    private final ud s = new ud();
    private final ue t = new ue();
    private final acq u = new acq();
    private final i v = new i();
    private final wp w = new wp();
    private final xc x = new xc();
    private final acd y = new acd();
    private final q z = new q();

    static {
        a(new u());
    }

    protected u() {
    }

    public static g A() {
        return D().n;
    }

    public static wh B() {
        return D().E;
    }

    public static act C() {
        return D().F;
    }

    private static u D() {
        u uVar;
        synchronized (a) {
            uVar = b;
        }
        return uVar;
    }

    public static com.google.android.gms.ads.internal.request.a a() {
        return D().d;
    }

    protected static void a(u uVar) {
        synchronized (a) {
            b = uVar;
        }
    }

    public static a b() {
        return D().c;
    }

    public static e c() {
        return D().e;
    }

    public static zn d() {
        return D().f;
    }

    public static abv e() {
        return D().g;
    }

    public static ada f() {
        return D().h;
    }

    public static abw g() {
        return D().i;
    }

    public static tp h() {
        return D().j;
    }

    public static abl i() {
        return D().k;
    }

    public static com.google.android.gms.ads.internal.cache.a j() {
        return D().l;
    }

    public static com.google.android.gms.common.util.e k() {
        return D().m;
    }

    public static ui l() {
        return D().o;
    }

    public static abz m() {
        return D().p;
    }

    public static aal n() {
        return D().q;
    }

    public static ud o() {
        return D().s;
    }

    public static uc p() {
        return D().r;
    }

    public static ue q() {
        return D().t;
    }

    public static acq r() {
        return D().u;
    }

    public static i s() {
        return D().v;
    }

    public static wp t() {
        return D().w;
    }

    public static acd u() {
        return D().y;
    }

    public static q v() {
        return D().z;
    }

    public static r w() {
        return D().A;
    }

    public static xm x() {
        return D().B;
    }

    public static p y() {
        return D().D;
    }

    public static acf z() {
        return D().C;
    }
}
