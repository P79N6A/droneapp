package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.analytics.h;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.n;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adp;
import com.google.android.gms.internal.ads;
import com.google.android.gms.internal.adx;
import com.tencent.stat.DeviceInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class ab extends t {
    private boolean a;
    private final z b;
    private final i c;
    private final h d;
    private final y e;
    private long f = Long.MIN_VALUE;
    private final aj g;
    private final aj h;
    private final m i;
    private long j;
    private boolean k;

    protected ab(v vVar, w wVar) {
        super(vVar);
        d.a((Object) wVar);
        this.d = wVar.k(vVar);
        this.b = wVar.m(vVar);
        this.c = wVar.n(vVar);
        this.e = wVar.o(vVar);
        this.i = new m(n());
        this.g = new aj(this, vVar) {
            final /* synthetic */ ab a;

            public void a() {
                this.a.L();
            }
        };
        this.h = new aj(this, vVar) {
            final /* synthetic */ ab a;

            public void a() {
                this.a.M();
            }
        };
    }

    private void K() {
        m();
        Context b = k().b();
        if (!k.a(b)) {
            t("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!l.a(b)) {
            u("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.a(b)) {
            t("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!CampaignTrackingService.a(b)) {
            t("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
    }

    private void L() {
        a(new am(this) {
            final /* synthetic */ ab a;

            {
                this.a = r1;
            }

            public void a(Throwable th) {
                this.a.H();
            }
        });
    }

    private void M() {
        try {
            this.b.i();
            H();
        } catch (SQLiteException e) {
            d("Failed to delete stale hits", e);
        }
        this.h.a(q().C());
    }

    private boolean N() {
        return this.k ? false : (!q().a() || q().b()) && I() > 0;
    }

    private void O() {
        al u = u();
        if (u.b() && !u.c()) {
            long G = G();
            if (G != 0 && Math.abs(n().a() - G) <= q().k()) {
                a("Dispatch alarm scheduled (ms)", Long.valueOf(q().j()));
                u.d();
            }
        }
    }

    private void P() {
        O();
        long I = I();
        long d = w().d();
        if (d != 0) {
            d = I - Math.abs(n().a() - d);
            if (d <= 0) {
                d = Math.min(q().h(), I);
            }
        } else {
            d = Math.min(q().h(), I);
        }
        a("Dispatch scheduled (ms)", Long.valueOf(d));
        if (this.g.c()) {
            this.g.b(Math.max(1, d + this.g.b()));
            return;
        }
        this.g.a(d);
    }

    private void Q() {
        R();
        S();
    }

    private void R() {
        if (this.g.c()) {
            q("All hits dispatched or no network/service. Going to power save mode");
        }
        this.g.d();
    }

    private void S() {
        al u = u();
        if (u.c()) {
            u.e();
        }
    }

    private void a(x xVar, adp com_google_android_gms_internal_adp) {
        d.a((Object) xVar);
        d.a((Object) com_google_android_gms_internal_adp);
        h hVar = new h(k());
        hVar.b(xVar.c());
        hVar.c(xVar.d());
        l l = hVar.l();
        adx com_google_android_gms_internal_adx = (adx) l.b(adx.class);
        com_google_android_gms_internal_adx.a(UriUtil.DATA_SCHEME);
        com_google_android_gms_internal_adx.b(true);
        l.a((n) com_google_android_gms_internal_adp);
        ads com_google_android_gms_internal_ads = (ads) l.b(ads.class);
        ado com_google_android_gms_internal_ado = (ado) l.b(ado.class);
        for (Entry entry : xVar.f().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                com_google_android_gms_internal_ado.a(str2);
            } else if ("av".equals(str)) {
                com_google_android_gms_internal_ado.b(str2);
            } else if (DeviceInfo.TAG_ANDROID_ID.equals(str)) {
                com_google_android_gms_internal_ado.c(str2);
            } else if ("aiid".equals(str)) {
                com_google_android_gms_internal_ado.d(str2);
            } else if ("uid".equals(str)) {
                com_google_android_gms_internal_adx.c(str2);
            } else {
                com_google_android_gms_internal_ads.a(str, str2);
            }
        }
        b("Sending installation campaign to", xVar.c(), com_google_android_gms_internal_adp);
        l.a(w().b());
        l.e();
    }

    private boolean b(String str) {
        return o().checkCallingOrSelfPermission(str) == 0;
    }

    public void F() {
        p.d();
        D();
        r("Sync dispatching local hits");
        long j = this.j;
        if (!q().a()) {
            g();
        }
        do {
            try {
            } catch (Throwable th) {
                e("Sync local dispatch failed", th);
                H();
                return;
            }
        } while (j());
        w().e();
        H();
        if (this.j != j) {
            this.d.c();
        }
    }

    public long G() {
        p.d();
        D();
        try {
            return this.b.j();
        } catch (SQLiteException e) {
            e("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }

    public void H() {
        k().s();
        D();
        if (!N()) {
            this.d.b();
            Q();
        } else if (this.b.h()) {
            this.d.b();
            Q();
        } else {
            boolean z;
            if (((Boolean) ao.J.a()).booleanValue()) {
                z = true;
            } else {
                this.d.a();
                z = this.d.e();
            }
            if (z) {
                P();
                return;
            }
            Q();
            O();
        }
    }

    public long I() {
        if (this.f != Long.MIN_VALUE) {
            return this.f;
        }
        return v().f() ? ((long) v().g()) * 1000 : q().i();
    }

    public void J() {
        D();
        m();
        this.k = true;
        this.e.e();
        H();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(com.google.android.gms.analytics.internal.x r6, boolean r7) {
        /*
        r5 = this;
        com.google.android.gms.common.internal.d.a(r6);
        r5.D();
        r5.m();
        r0 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r0.b();	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r6.a();	 Catch:{ SQLiteException -> 0x0049 }
        r1 = r6.b();	 Catch:{ SQLiteException -> 0x0049 }
        r0.a(r2, r1);	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r6.a();	 Catch:{ SQLiteException -> 0x0049 }
        r1 = r6.b();	 Catch:{ SQLiteException -> 0x0049 }
        r4 = r6.c();	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r0.a(r2, r1, r4);	 Catch:{ SQLiteException -> 0x0049 }
        if (r7 != 0) goto L_0x0042;
    L_0x002f:
        r6.a(r0);	 Catch:{ SQLiteException -> 0x0049 }
    L_0x0032:
        r2 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r2.a(r6);	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r2.c();	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r5.b;	 Catch:{ SQLiteException -> 0x0057 }
        r2.d();	 Catch:{ SQLiteException -> 0x0057 }
    L_0x0041:
        return r0;
    L_0x0042:
        r2 = 1;
        r2 = r2 + r0;
        r6.a(r2);	 Catch:{ SQLiteException -> 0x0049 }
        goto L_0x0032;
    L_0x0049:
        r0 = move-exception;
        r1 = "Failed to update Analytics property";
        r5.e(r1, r0);	 Catch:{ all -> 0x0065 }
        r0 = r5.b;	 Catch:{ SQLiteException -> 0x005e }
        r0.d();	 Catch:{ SQLiteException -> 0x005e }
    L_0x0054:
        r0 = -1;
        goto L_0x0041;
    L_0x0057:
        r2 = move-exception;
        r3 = "Failed to end transaction";
        r5.e(r3, r2);
        goto L_0x0041;
    L_0x005e:
        r0 = move-exception;
        r1 = "Failed to end transaction";
        r5.e(r1, r0);
        goto L_0x0054;
    L_0x0065:
        r0 = move-exception;
        r1 = r5.b;	 Catch:{ SQLiteException -> 0x006c }
        r1.d();	 Catch:{ SQLiteException -> 0x006c }
    L_0x006b:
        throw r0;
    L_0x006c:
        r1 = move-exception;
        r2 = "Failed to end transaction";
        r5.e(r2, r1);
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.ab.a(com.google.android.gms.analytics.internal.x, boolean):long");
    }

    protected void a() {
        this.b.E();
        this.c.E();
        this.e.E();
    }

    public void a(long j) {
        p.d();
        D();
        if (j < 0) {
            j = 0;
        }
        this.f = j;
        H();
    }

    public void a(am amVar) {
        a(amVar, this.j);
    }

    public void a(final am amVar, final long j) {
        p.d();
        D();
        long j2 = -1;
        long d = w().d();
        if (d != 0) {
            j2 = Math.abs(n().a() - d);
        }
        b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        if (!q().a()) {
            g();
        }
        try {
            if (j()) {
                r().a(new Runnable(this) {
                    final /* synthetic */ ab c;

                    public void run() {
                        this.c.a(amVar, j);
                    }
                });
                return;
            }
            w().e();
            H();
            if (amVar != null) {
                amVar.a(null);
            }
            if (this.j != j) {
                this.d.c();
            }
        } catch (Throwable th) {
            e("Local dispatch failed", th);
            w().e();
            H();
            if (amVar != null) {
                amVar.a(th);
            }
        }
    }

    public void a(c cVar) {
        d.a((Object) cVar);
        p.d();
        D();
        if (this.k) {
            r("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            a("Delivering hit", cVar);
        }
        c b = b(cVar);
        g();
        if (this.e.a(b)) {
            r("Hit sent to the device AnalyticsService for delivery");
        } else if (q().a()) {
            p().a(b, "Service unavailable on package side");
        } else {
            try {
                this.b.a(b);
                H();
            } catch (SQLiteException e) {
                e("Delivery failed to save hit to a database", e);
                p().a(b, "deliver: failed to insert hit to database");
            }
        }
    }

    protected void a(x xVar) {
        m();
        b("Sending first hit to property", xVar.c());
        if (!w().c().a(q().F())) {
            String f = w().f();
            if (!TextUtils.isEmpty(f)) {
                adp a = p.a(p(), f);
                b("Found relevant installation campaign", a);
                a(xVar, a);
            }
        }
    }

    public void a(String str) {
        d.a(str);
        m();
        l();
        adp a = p.a(p(), str);
        if (a == null) {
            d("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        CharSequence f = w().f();
        if (str.equals(f)) {
            t("Ignoring duplicate install campaign");
        } else if (TextUtils.isEmpty(f)) {
            w().a(str);
            if (w().c().a(q().F())) {
                d("Campaign received too late, ignoring", a);
                return;
            }
            b("Received installation campaign", a);
            for (x a2 : this.b.d(0)) {
                a(a2, a);
            }
        } else {
            d("Ignoring multiple install campaigns. original, new", f, str);
        }
    }

    public void a(boolean z) {
        H();
    }

    c b(c cVar) {
        if (!TextUtils.isEmpty(cVar.h())) {
            return cVar;
        }
        Pair a = w().g().a();
        if (a == null) {
            return cVar;
        }
        Long l = (Long) a.second;
        String str = (String) a.first;
        String valueOf = String.valueOf(l);
        valueOf = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
        Map hashMap = new HashMap(cVar.b());
        hashMap.put("_m", valueOf);
        return c.a(this, cVar, hashMap);
    }

    void b() {
        D();
        d.a(!this.a, (Object) "Analytics backend already started");
        this.a = true;
        r().a(new Runnable(this) {
            final /* synthetic */ ab a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.c();
            }
        });
    }

    protected void c() {
        D();
        if (!q().a()) {
            K();
        }
        w().b();
        if (!b("android.permission.ACCESS_NETWORK_STATE")) {
            u("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            J();
        }
        if (!b("android.permission.INTERNET")) {
            u("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            J();
        }
        if (l.a(o())) {
            q("AnalyticsService registered in the app manifest and enabled");
        } else if (q().a()) {
            u("Device AnalyticsService not registered! Hits will not be delivered reliably.");
        } else {
            t("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!(this.k || q().a() || this.b.h())) {
            g();
        }
        H();
    }

    void d() {
        m();
        this.j = n().a();
    }

    protected void e() {
        m();
        if (!q().a()) {
            i();
        }
    }

    public void f() {
        p.d();
        D();
        q("Service disconnected");
    }

    protected void g() {
        if (!this.k && q().c() && !this.e.b()) {
            if (this.i.a(q().x())) {
                this.i.a();
                q("Connecting to service");
                if (this.e.d()) {
                    q("Connected to service");
                    this.i.b();
                    e();
                }
            }
        }
    }

    public void h() {
        p.d();
        D();
        if (!q().a()) {
            q("Delete all hits from local store");
            try {
                this.b.e();
                this.b.f();
                H();
            } catch (SQLiteException e) {
                d("Failed to delete hits from store", e);
            }
        }
        g();
        if (this.e.c()) {
            q("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    public void i() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r6 = this;
        com.google.android.gms.analytics.p.d();
        r6.D();
        r6.l();
        r0 = r6.q();
        r0 = r0.c();
        if (r0 != 0) goto L_0x0018;
    L_0x0013:
        r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService";
        r6.t(r0);
    L_0x0018:
        r0 = r6.e;
        r0 = r0.b();
        if (r0 != 0) goto L_0x0026;
    L_0x0020:
        r0 = "Service not connected";
        r6.q(r0);
    L_0x0025:
        return;
    L_0x0026:
        r0 = r6.b;
        r0 = r0.h();
        if (r0 != 0) goto L_0x0025;
    L_0x002e:
        r0 = "Dispatching local hits to device AnalyticsService";
        r6.q(r0);
    L_0x0033:
        r0 = r6.b;	 Catch:{ SQLiteException -> 0x004c }
        r1 = r6.q();	 Catch:{ SQLiteException -> 0x004c }
        r1 = r1.l();	 Catch:{ SQLiteException -> 0x004c }
        r2 = (long) r1;	 Catch:{ SQLiteException -> 0x004c }
        r1 = r0.b(r2);	 Catch:{ SQLiteException -> 0x004c }
        r0 = r1.isEmpty();	 Catch:{ SQLiteException -> 0x004c }
        if (r0 == 0) goto L_0x0062;	 Catch:{ SQLiteException -> 0x004c }
    L_0x0048:
        r6.H();	 Catch:{ SQLiteException -> 0x004c }
        goto L_0x0025;
    L_0x004c:
        r0 = move-exception;
        r1 = "Failed to read hits from store";
        r6.e(r1, r0);
        r6.Q();
        goto L_0x0025;
    L_0x0056:
        r1.remove(r0);
        r2 = r6.b;	 Catch:{ SQLiteException -> 0x007b }
        r4 = r0.c();	 Catch:{ SQLiteException -> 0x007b }
        r2.c(r4);	 Catch:{ SQLiteException -> 0x007b }
    L_0x0062:
        r0 = r1.isEmpty();
        if (r0 != 0) goto L_0x0033;
    L_0x0068:
        r0 = 0;
        r0 = r1.get(r0);
        r0 = (com.google.android.gms.analytics.internal.c) r0;
        r2 = r6.e;
        r2 = r2.a(r0);
        if (r2 != 0) goto L_0x0056;
    L_0x0077:
        r6.H();
        goto L_0x0025;
    L_0x007b:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r6.e(r1, r0);
        r6.Q();
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.ab.i():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean j() {
        /*
        r12 = this;
        r1 = 1;
        r2 = 0;
        com.google.android.gms.analytics.p.d();
        r12.D();
        r0 = "Dispatching a batch of local hits";
        r12.q(r0);
        r0 = r12.e;
        r0 = r0.b();
        if (r0 != 0) goto L_0x0032;
    L_0x0015:
        r0 = r12.q();
        r0 = r0.a();
        if (r0 != 0) goto L_0x0032;
    L_0x001f:
        r0 = r1;
    L_0x0020:
        r3 = r12.c;
        r3 = r3.b();
        if (r3 != 0) goto L_0x0034;
    L_0x0028:
        if (r0 == 0) goto L_0x0036;
    L_0x002a:
        if (r1 == 0) goto L_0x0036;
    L_0x002c:
        r0 = "No network or service available. Will retry later";
        r12.q(r0);
    L_0x0031:
        return r2;
    L_0x0032:
        r0 = r2;
        goto L_0x0020;
    L_0x0034:
        r1 = r2;
        goto L_0x0028;
    L_0x0036:
        r0 = r12.q();
        r0 = r0.l();
        r1 = r12.q();
        r1 = r1.m();
        r0 = java.lang.Math.max(r0, r1);
        r6 = (long) r0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = 0;
    L_0x0052:
        r0 = r12.b;	 Catch:{ all -> 0x01eb }
        r0.b();	 Catch:{ all -> 0x01eb }
        r3.clear();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00d3 }
        r8 = r0.b(r6);	 Catch:{ SQLiteException -> 0x00d3 }
        r0 = r8.isEmpty();	 Catch:{ SQLiteException -> 0x00d3 }
        if (r0 == 0) goto L_0x0083;
    L_0x0066:
        r0 = "Store is empty, nothing to dispatch";
        r12.q(r0);	 Catch:{ SQLiteException -> 0x00d3 }
        r12.Q();	 Catch:{ SQLiteException -> 0x00d3 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x0079 }
        r0.c();	 Catch:{ SQLiteException -> 0x0079 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x0079 }
        r0.d();	 Catch:{ SQLiteException -> 0x0079 }
        goto L_0x0031;
    L_0x0079:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.e(r1, r0);
        r12.Q();
        goto L_0x0031;
    L_0x0083:
        r0 = "Hits loaded from store. count";
        r1 = r8.size();	 Catch:{ SQLiteException -> 0x00d3 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x00d3 }
        r12.a(r0, r1);	 Catch:{ SQLiteException -> 0x00d3 }
        r1 = r8.iterator();	 Catch:{ all -> 0x01eb }
    L_0x0094:
        r0 = r1.hasNext();	 Catch:{ all -> 0x01eb }
        if (r0 == 0) goto L_0x00f3;
    L_0x009a:
        r0 = r1.next();	 Catch:{ all -> 0x01eb }
        r0 = (com.google.android.gms.analytics.internal.c) r0;	 Catch:{ all -> 0x01eb }
        r10 = r0.c();	 Catch:{ all -> 0x01eb }
        r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0094;
    L_0x00a8:
        r0 = "Database contains successfully uploaded hit";
        r1 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x01eb }
        r3 = r8.size();	 Catch:{ all -> 0x01eb }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x01eb }
        r12.d(r0, r1, r3);	 Catch:{ all -> 0x01eb }
        r12.Q();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00c8 }
        r0.c();	 Catch:{ SQLiteException -> 0x00c8 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00c8 }
        r0.d();	 Catch:{ SQLiteException -> 0x00c8 }
        goto L_0x0031;
    L_0x00c8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.e(r1, r0);
        r12.Q();
        goto L_0x0031;
    L_0x00d3:
        r0 = move-exception;
        r1 = "Failed to read hits from persisted store";
        r12.d(r1, r0);	 Catch:{ all -> 0x01eb }
        r12.Q();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00e8 }
        r0.c();	 Catch:{ SQLiteException -> 0x00e8 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00e8 }
        r0.d();	 Catch:{ SQLiteException -> 0x00e8 }
        goto L_0x0031;
    L_0x00e8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.e(r1, r0);
        r12.Q();
        goto L_0x0031;
    L_0x00f3:
        r0 = r12.e;	 Catch:{ all -> 0x01eb }
        r0 = r0.b();	 Catch:{ all -> 0x01eb }
        if (r0 == 0) goto L_0x0202;
    L_0x00fb:
        r0 = r12.q();	 Catch:{ all -> 0x01eb }
        r0 = r0.a();	 Catch:{ all -> 0x01eb }
        if (r0 != 0) goto L_0x0202;
    L_0x0105:
        r0 = "Service connected, sending hits to the service";
        r12.q(r0);	 Catch:{ all -> 0x01eb }
    L_0x010a:
        r0 = r8.isEmpty();	 Catch:{ all -> 0x01eb }
        if (r0 != 0) goto L_0x0202;
    L_0x0110:
        r0 = 0;
        r0 = r8.get(r0);	 Catch:{ all -> 0x01eb }
        r0 = (com.google.android.gms.analytics.internal.c) r0;	 Catch:{ all -> 0x01eb }
        r1 = r12.e;	 Catch:{ all -> 0x01eb }
        r1 = r1.a(r0);	 Catch:{ all -> 0x01eb }
        if (r1 != 0) goto L_0x0148;
    L_0x011f:
        r0 = r4;
    L_0x0120:
        r4 = r12.c;	 Catch:{ all -> 0x01eb }
        r4 = r4.b();	 Catch:{ all -> 0x01eb }
        if (r4 == 0) goto L_0x0196;
    L_0x0128:
        r4 = r12.c;	 Catch:{ all -> 0x01eb }
        r8 = r4.a(r8);	 Catch:{ all -> 0x01eb }
        r9 = r8.iterator();	 Catch:{ all -> 0x01eb }
        r4 = r0;
    L_0x0133:
        r0 = r9.hasNext();	 Catch:{ all -> 0x01eb }
        if (r0 == 0) goto L_0x018d;
    L_0x0139:
        r0 = r9.next();	 Catch:{ all -> 0x01eb }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x01eb }
        r0 = r0.longValue();	 Catch:{ all -> 0x01eb }
        r4 = java.lang.Math.max(r4, r0);	 Catch:{ all -> 0x01eb }
        goto L_0x0133;
    L_0x0148:
        r10 = r0.c();	 Catch:{ all -> 0x01eb }
        r4 = java.lang.Math.max(r4, r10);	 Catch:{ all -> 0x01eb }
        r8.remove(r0);	 Catch:{ all -> 0x01eb }
        r1 = "Hit sent do device AnalyticsService for delivery";
        r12.b(r1, r0);	 Catch:{ all -> 0x01eb }
        r1 = r12.b;	 Catch:{ SQLiteException -> 0x016d }
        r10 = r0.c();	 Catch:{ SQLiteException -> 0x016d }
        r1.c(r10);	 Catch:{ SQLiteException -> 0x016d }
        r0 = r0.c();	 Catch:{ SQLiteException -> 0x016d }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ SQLiteException -> 0x016d }
        r3.add(r0);	 Catch:{ SQLiteException -> 0x016d }
        goto L_0x010a;
    L_0x016d:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r12.e(r1, r0);	 Catch:{ all -> 0x01eb }
        r12.Q();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x0182 }
        r0.c();	 Catch:{ SQLiteException -> 0x0182 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x0182 }
        r0.d();	 Catch:{ SQLiteException -> 0x0182 }
        goto L_0x0031;
    L_0x0182:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.e(r1, r0);
        r12.Q();
        goto L_0x0031;
    L_0x018d:
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01b3 }
        r0.a(r8);	 Catch:{ SQLiteException -> 0x01b3 }
        r3.addAll(r8);	 Catch:{ SQLiteException -> 0x01b3 }
        r0 = r4;
    L_0x0196:
        r4 = r3.isEmpty();	 Catch:{ all -> 0x01eb }
        if (r4 == 0) goto L_0x01d3;
    L_0x019c:
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01a8 }
        r0.c();	 Catch:{ SQLiteException -> 0x01a8 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01a8 }
        r0.d();	 Catch:{ SQLiteException -> 0x01a8 }
        goto L_0x0031;
    L_0x01a8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.e(r1, r0);
        r12.Q();
        goto L_0x0031;
    L_0x01b3:
        r0 = move-exception;
        r1 = "Failed to remove successfully uploaded hits";
        r12.e(r1, r0);	 Catch:{ all -> 0x01eb }
        r12.Q();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01c8 }
        r0.c();	 Catch:{ SQLiteException -> 0x01c8 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01c8 }
        r0.d();	 Catch:{ SQLiteException -> 0x01c8 }
        goto L_0x0031;
    L_0x01c8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.e(r1, r0);
        r12.Q();
        goto L_0x0031;
    L_0x01d3:
        r4 = r12.b;	 Catch:{ SQLiteException -> 0x01e0 }
        r4.c();	 Catch:{ SQLiteException -> 0x01e0 }
        r4 = r12.b;	 Catch:{ SQLiteException -> 0x01e0 }
        r4.d();	 Catch:{ SQLiteException -> 0x01e0 }
        r4 = r0;
        goto L_0x0052;
    L_0x01e0:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.e(r1, r0);
        r12.Q();
        goto L_0x0031;
    L_0x01eb:
        r0 = move-exception;
        r1 = r12.b;	 Catch:{ SQLiteException -> 0x01f7 }
        r1.c();	 Catch:{ SQLiteException -> 0x01f7 }
        r1 = r12.b;	 Catch:{ SQLiteException -> 0x01f7 }
        r1.d();	 Catch:{ SQLiteException -> 0x01f7 }
        throw r0;
    L_0x01f7:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.e(r1, r0);
        r12.Q();
        goto L_0x0031;
    L_0x0202:
        r0 = r4;
        goto L_0x0120;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.ab.j():boolean");
    }
}
