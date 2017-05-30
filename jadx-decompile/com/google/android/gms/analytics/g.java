package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.c;
import com.google.android.gms.analytics.internal.e;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.analytics.internal.u;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ado;
import com.tencent.stat.DeviceInfo;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class g extends t {
    private boolean a;
    private final Map<String, String> b = new HashMap();
    private final Map<String, String> c = new HashMap();
    private final e d;
    private final a e;
    private b f;
    private o g;

    private class a extends t implements a {
        final /* synthetic */ g a;
        private boolean b;
        private int c;
        private long d = -1;
        private boolean e;
        private long f;

        protected a(g gVar, v vVar) {
            this.a = gVar;
            super(vVar);
        }

        private void d() {
            if (this.d >= 0 || this.b) {
                s().a(this.a.e);
            } else {
                s().b(this.a.e);
            }
        }

        protected void a() {
        }

        public void a(long j) {
            this.d = j;
            d();
        }

        public void a(Activity activity) {
            if (this.c == 0 && c()) {
                this.e = true;
            }
            this.c++;
            if (this.b) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    this.a.a(intent.getData());
                }
                Map hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                this.a.a("&cd", this.a.g != null ? this.a.g.a(activity) : activity.getClass().getCanonicalName());
                if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                    CharSequence a = g.a(activity);
                    if (!TextUtils.isEmpty(a)) {
                        hashMap.put("&dr", a);
                    }
                }
                this.a.a(hashMap);
            }
        }

        public void a(boolean z) {
            this.b = z;
            d();
        }

        public void b(Activity activity) {
            this.c--;
            this.c = Math.max(0, this.c);
            if (this.c == 0) {
                this.f = n().b();
            }
        }

        public synchronized boolean b() {
            boolean z;
            z = this.e;
            this.e = false;
            return z;
        }

        boolean c() {
            return n().b() >= this.f + Math.max(1000, this.d);
        }
    }

    g(v vVar, String str, e eVar) {
        super(vVar);
        if (str != null) {
            this.b.put("&tid", str);
        }
        this.b.put("useSecure", "1");
        this.b.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        if (eVar == null) {
            this.d = new e("tracking", n());
        } else {
            this.d = eVar;
        }
        this.e = new a(this, vVar);
    }

    static String a(Activity activity) {
        d.a((Object) activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        CharSequence stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return !TextUtils.isEmpty(stringExtra) ? stringExtra : null;
    }

    private static void a(Map<String, String> map, Map<String, String> map2) {
        d.a((Object) map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String b = b(entry);
                if (b != null) {
                    map2.put(b, (String) entry.getValue());
                }
            }
        }
    }

    private static boolean a(Entry<String, String> entry) {
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        return str.startsWith("&") && str.length() >= 2;
    }

    private static String b(Entry<String, String> entry) {
        return !a((Entry) entry) ? null : ((String) entry.getKey()).substring(1);
    }

    private static void b(Map<String, String> map, Map<String, String> map2) {
        d.a((Object) map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String b = b(entry);
                if (!(b == null || map2.containsKey(b))) {
                    map2.put(b, (String) entry.getValue());
                }
            }
        }
    }

    private boolean c() {
        return this.f != null;
    }

    public String a(String str) {
        D();
        return TextUtils.isEmpty(str) ? null : this.b.containsKey(str) ? (String) this.b.get(str) : str.equals("&ul") ? p.a(Locale.getDefault()) : str.equals("&cid") ? x().b() : str.equals("&sr") ? A().c() : str.equals("&aid") ? z().c().c() : str.equals("&an") ? z().c().a() : str.equals("&av") ? z().c().b() : str.equals("&aiid") ? z().c().d() : null;
    }

    protected void a() {
        this.e.E();
        String c = v().c();
        if (c != null) {
            a("&an", c);
        }
        c = v().b();
        if (c != null) {
            a("&av", c);
        }
    }

    public void a(double d) {
        a("&sf", Double.toString(d));
    }

    public void a(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            a("&sr", i + "x" + i2);
        } else {
            t("Invalid width or height. The values should be non-negative.");
        }
    }

    public void a(long j) {
        this.e.a(1000 * j);
    }

    public void a(Uri uri) {
        if (uri != null && !uri.isOpaque()) {
            CharSequence queryParameter = uri.getQueryParameter("referrer");
            if (!TextUtils.isEmpty(queryParameter)) {
                String str = "http://hostname/?";
                String valueOf = String.valueOf(queryParameter);
                Uri parse = Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                str = parse.getQueryParameter("utm_id");
                if (str != null) {
                    this.c.put("&ci", str);
                }
                str = parse.getQueryParameter("anid");
                if (str != null) {
                    this.c.put("&anid", str);
                }
                str = parse.getQueryParameter("utm_campaign");
                if (str != null) {
                    this.c.put("&cn", str);
                }
                str = parse.getQueryParameter("utm_content");
                if (str != null) {
                    this.c.put("&cc", str);
                }
                str = parse.getQueryParameter("utm_medium");
                if (str != null) {
                    this.c.put("&cm", str);
                }
                str = parse.getQueryParameter("utm_source");
                if (str != null) {
                    this.c.put("&cs", str);
                }
                str = parse.getQueryParameter("utm_term");
                if (str != null) {
                    this.c.put("&ck", str);
                }
                str = parse.getQueryParameter("dclid");
                if (str != null) {
                    this.c.put("&dclid", str);
                }
                str = parse.getQueryParameter("gclid");
                if (str != null) {
                    this.c.put("&gclid", str);
                }
                valueOf = parse.getQueryParameter("aclid");
                if (valueOf != null) {
                    this.c.put("&aclid", valueOf);
                }
            }
        }
    }

    void a(o oVar) {
        q("Loading Tracker config values");
        this.g = oVar;
        if (this.g.a()) {
            String b = this.g.b();
            a("&tid", b);
            a("trackingId loaded", b);
        }
        if (this.g.c()) {
            b = Double.toString(this.g.d());
            a("&sf", b);
            a("Sample frequency loaded", b);
        }
        if (this.g.e()) {
            int f = this.g.f();
            a((long) f);
            a("Session timeout loaded", Integer.valueOf(f));
        }
        if (this.g.g()) {
            boolean h = this.g.h();
            b(h);
            a("Auto activity tracking loaded", Boolean.valueOf(h));
        }
        if (this.g.i()) {
            h = this.g.j();
            if (h) {
                a("&aip", "1");
            }
            a("Anonymize ip loaded", Boolean.valueOf(h));
        }
        a(this.g.k());
    }

    public void a(String str, String str2) {
        d.a((Object) str, (Object) "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.b.put(str, str2);
        }
    }

    public void a(Map<String, String> map) {
        final long a = n().a();
        if (s().f()) {
            r("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        final boolean e = s().e();
        final Map hashMap = new HashMap();
        a(this.b, hashMap);
        a((Map) map, hashMap);
        final boolean a2 = p.a((String) this.b.get("useSecure"), true);
        b(this.c, hashMap);
        this.c.clear();
        final String str = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str)) {
            p().a(hashMap, "Missing hit type parameter");
            return;
        }
        final String str2 = (String) hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            p().a(hashMap, "Missing tracking id parameter");
            return;
        }
        final boolean b = b();
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt((String) this.b.get("&a")) + 1;
                if (parseInt >= Integer.MAX_VALUE) {
                    parseInt = 1;
                }
                this.b.put("&a", Integer.toString(parseInt));
            }
        }
        r().a(new Runnable(this) {
            final /* synthetic */ g h;

            public void run() {
                boolean z = true;
                if (this.h.e.b()) {
                    hashMap.put("sc", "start");
                }
                p.b(hashMap, "cid", this.h.s().h());
                String str = (String) hashMap.get("sf");
                if (str != null) {
                    double a = p.a(str, 100.0d);
                    if (p.a(a, (String) hashMap.get("cid"))) {
                        this.h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(a));
                        return;
                    }
                }
                com.google.android.gms.analytics.internal.a b = this.h.y();
                if (b) {
                    p.a(hashMap, "ate", b.b());
                    p.a(hashMap, "adid", b.c());
                } else {
                    hashMap.remove("ate");
                    hashMap.remove("adid");
                }
                ado c = this.h.z().c();
                p.a(hashMap, "an", c.a());
                p.a(hashMap, "av", c.b());
                p.a(hashMap, DeviceInfo.TAG_ANDROID_ID, c.c());
                p.a(hashMap, "aiid", c.d());
                hashMap.put("v", "1");
                hashMap.put("_v", u.b);
                p.a(hashMap, "ul", this.h.A().b().f());
                p.a(hashMap, "sr", this.h.A().c());
                boolean z2 = str.equals("transaction") || str.equals("item");
                if (z2 || this.h.d.a()) {
                    long b2 = p.b((String) hashMap.get("ht"));
                    if (b2 == 0) {
                        b2 = a;
                    }
                    if (e) {
                        this.h.p().c("Dry run enabled. Would have sent hit", new c(this.h, hashMap, b2, a2));
                        return;
                    }
                    String str2 = (String) hashMap.get("cid");
                    Map hashMap = new HashMap();
                    p.a(hashMap, "uid", hashMap);
                    p.a(hashMap, "an", hashMap);
                    p.a(hashMap, DeviceInfo.TAG_ANDROID_ID, hashMap);
                    p.a(hashMap, "av", hashMap);
                    p.a(hashMap, "aiid", hashMap);
                    String str3 = str2;
                    if (TextUtils.isEmpty((CharSequence) hashMap.get("adid"))) {
                        z = false;
                    }
                    hashMap.put("_s", String.valueOf(this.h.t().a(new x(0, str2, str3, z, 0, hashMap))));
                    this.h.t().a(new c(this.h, hashMap, b2, a2));
                    return;
                }
                this.h.p().a(hashMap, "Too many hits sent too quickly, rate limiting invoked");
            }
        });
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.c();	 Catch:{ all -> 0x0026 }
        if (r0 != r4) goto L_0x0009;
    L_0x0007:
        monitor-exit(r3);	 Catch:{ all -> 0x0026 }
    L_0x0008:
        return;
    L_0x0009:
        if (r4 == 0) goto L_0x0029;
    L_0x000b:
        r0 = r3.o();	 Catch:{ all -> 0x0026 }
        r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler();	 Catch:{ all -> 0x0026 }
        r2 = new com.google.android.gms.analytics.b;	 Catch:{ all -> 0x0026 }
        r2.<init>(r3, r1, r0);	 Catch:{ all -> 0x0026 }
        r3.f = r2;	 Catch:{ all -> 0x0026 }
        r0 = r3.f;	 Catch:{ all -> 0x0026 }
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r0);	 Catch:{ all -> 0x0026 }
        r0 = "Uncaught exceptions will be reported to Google Analytics";
        r3.q(r0);	 Catch:{ all -> 0x0026 }
    L_0x0024:
        monitor-exit(r3);	 Catch:{ all -> 0x0026 }
        goto L_0x0008;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0026 }
        throw r0;
    L_0x0029:
        r0 = r3.f;	 Catch:{ all -> 0x0026 }
        r0 = r0.c();	 Catch:{ all -> 0x0026 }
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r0);	 Catch:{ all -> 0x0026 }
        r0 = "Uncaught exceptions will not be reported to Google Analytics";
        r3.q(r0);	 Catch:{ all -> 0x0026 }
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.g.a(boolean):void");
    }

    public void b(String str) {
        a("&cd", str);
    }

    public void b(boolean z) {
        this.e.a(z);
    }

    boolean b() {
        return this.a;
    }

    public void c(String str) {
        a("&dl", str);
    }

    public void c(boolean z) {
        a("useSecure", p.a(z));
    }

    public void d(String str) {
        a("&dr", str);
    }

    public void d(boolean z) {
        a("&aip", p.a(z));
    }

    public void e(String str) {
        a("&dp", str);
    }

    public void e(boolean z) {
        this.a = z;
    }

    public void f(String str) {
        a("&dh", str);
    }

    public void g(String str) {
        a("&dt", str);
    }

    public void h(String str) {
        a("&ul", str);
    }

    public void i(String str) {
        a("&de", str);
    }

    public void j(String str) {
        a("&sd", str);
    }

    public void k(String str) {
        a("&vp", str);
    }

    public void l(String str) {
        a("&cid", str);
    }

    public void m(String str) {
        a("&an", str);
    }

    public void n(String str) {
        a("&aid", str);
    }

    public void o(String str) {
        a("&aiid", str);
    }

    public void p(String str) {
        a("&av", str);
    }
}
