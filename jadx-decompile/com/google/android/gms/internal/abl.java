package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.abt.b;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;

@aaa
public class abl implements b, tp.b {
    private long A = 0;
    private int B = -1;
    private final Object a = new Object();
    private final String b;
    private final abm c;
    private ti d;
    private BigInteger e = BigInteger.ONE;
    private final HashSet<abj> f = new HashSet();
    private final HashMap<String, abo> g = new HashMap();
    private boolean h = false;
    private boolean i = true;
    private int j = 0;
    private boolean k = false;
    private Context l;
    private VersionInfoParcel m;
    private uh n = null;
    private boolean o = true;
    private tq p = null;
    private to q = null;
    private String r;
    private Boolean s = null;
    private String t;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private String y = "";
    private long z = 0;

    public abl(abv com_google_android_gms_internal_abv) {
        this.b = com_google_android_gms_internal_abv.d();
        this.c = new abm(this.b);
    }

    public Bundle a(Context context, abn com_google_android_gms_internal_abn, String str) {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.c.a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.g.keySet()) {
                bundle2.putBundle(str2, ((abo) this.g.get(str2)).a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                arrayList.add(((abj) it.next()).d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            com_google_android_gms_internal_abn.a(this.f);
            this.f.clear();
        }
        return bundle;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.tq a(android.content.Context r9) {
        /*
        r8 = this;
        r1 = 0;
        r0 = com.google.android.gms.internal.uf.Q;
        r0 = r0.c();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x001b;
    L_0x000f:
        r0 = com.google.android.gms.common.util.s.d();
        if (r0 == 0) goto L_0x001b;
    L_0x0015:
        r0 = r8.b();
        if (r0 == 0) goto L_0x001d;
    L_0x001b:
        r0 = r1;
    L_0x001c:
        return r0;
    L_0x001d:
        r2 = r8.a;
        monitor-enter(r2);
        r0 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x0057 }
        if (r0 == 0) goto L_0x0028;
    L_0x0026:
        if (r9 != 0) goto L_0x002b;
    L_0x0028:
        monitor-exit(r2);	 Catch:{ all -> 0x0057 }
        r0 = r1;
        goto L_0x001c;
    L_0x002b:
        r0 = r8.q;	 Catch:{ all -> 0x0057 }
        if (r0 != 0) goto L_0x0036;
    L_0x002f:
        r0 = new com.google.android.gms.internal.to;	 Catch:{ all -> 0x0057 }
        r0.<init>();	 Catch:{ all -> 0x0057 }
        r8.q = r0;	 Catch:{ all -> 0x0057 }
    L_0x0036:
        r0 = r8.p;	 Catch:{ all -> 0x0057 }
        if (r0 != 0) goto L_0x004e;
    L_0x003a:
        r0 = new com.google.android.gms.internal.tq;	 Catch:{ all -> 0x0057 }
        r1 = r8.q;	 Catch:{ all -> 0x0057 }
        r3 = new com.google.android.gms.internal.zz;	 Catch:{ all -> 0x0057 }
        r4 = r8.l;	 Catch:{ all -> 0x0057 }
        r5 = r8.m;	 Catch:{ all -> 0x0057 }
        r6 = 0;
        r7 = 0;
        r3.<init>(r4, r5, r6, r7);	 Catch:{ all -> 0x0057 }
        r0.<init>(r1, r3);	 Catch:{ all -> 0x0057 }
        r8.p = r0;	 Catch:{ all -> 0x0057 }
    L_0x004e:
        r0 = r8.p;	 Catch:{ all -> 0x0057 }
        r0.a();	 Catch:{ all -> 0x0057 }
        r0 = r8.p;	 Catch:{ all -> 0x0057 }
        monitor-exit(r2);	 Catch:{ all -> 0x0057 }
        goto L_0x001c;
    L_0x0057:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0057 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.abl.a(android.content.Context):com.google.android.gms.internal.tq");
    }

    public String a() {
        return this.b;
    }

    public Future a(int i) {
        Future a;
        synchronized (this.a) {
            this.B = i;
            a = abt.a(this.l, i);
        }
        return a;
    }

    public Future a(long j) {
        Future a;
        synchronized (this.a) {
            if (this.A < j) {
                this.A = j;
                a = abt.a(this.l, j);
            } else {
                a = null;
            }
        }
        return a;
    }

    public Future a(Context context, String str) {
        Future a;
        this.z = u.k().a();
        synchronized (this.a) {
            if (str != null) {
                if (!str.equals(this.y)) {
                    this.y = str;
                    a = abt.a(context, str, this.z);
                }
            }
            a = null;
        }
        return a;
    }

    public Future a(Context context, boolean z) {
        Future a;
        synchronized (this.a) {
            if (z != this.i) {
                this.i = z;
                a = abt.a(context, z);
            } else {
                a = null;
            }
        }
        return a;
    }

    public Future a(String str) {
        Future a;
        synchronized (this.a) {
            if (str != null) {
                if (!str.equals(this.r)) {
                    this.r = str;
                    a = abt.a(this.l, str);
                }
            }
            a = null;
        }
        return a;
    }

    @TargetApi(23)
    public void a(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (this.a) {
            if (!this.k) {
                this.l = context.getApplicationContext();
                this.m = versionInfoParcel;
                u.h().a((tp.b) this);
                abt.a(context, (b) this);
                abt.b(context, (b) this);
                abt.c(context, (b) this);
                abt.d(context, this);
                abt.e(context, this);
                abt.f(context, this);
                abt.g(context, this);
                a(Thread.currentThread());
                this.t = u.e().a(context, versionInfoParcel.b);
                if (s.l() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    this.v = true;
                }
                this.d = new ti(context.getApplicationContext(), this.m, u.e().a(context, versionInfoParcel));
                s();
                u.s().a(this.l);
                this.k = true;
            }
        }
    }

    public void a(Bundle bundle) {
        synchronized (this.a) {
            this.i = bundle.getBoolean("use_https", this.i);
            this.j = bundle.getInt("webview_cache_version", this.j);
            if (bundle.containsKey("content_url_opted_out")) {
                b(bundle.getBoolean("content_url_opted_out"));
            }
            if (bundle.containsKey("content_url_hashes")) {
                this.r = bundle.getString("content_url_hashes");
            }
            this.w = bundle.getBoolean("auto_collect_location", this.w);
            this.y = bundle.containsKey("app_settings_json") ? bundle.getString("app_settings_json") : this.y;
            this.z = bundle.getLong("app_settings_last_update_ms", this.z);
            this.A = bundle.getLong("app_last_background_time_ms", this.A);
            this.B = bundle.getInt("request_in_session_count", this.B);
        }
    }

    public void a(abj com_google_android_gms_internal_abj) {
        synchronized (this.a) {
            this.f.add(com_google_android_gms_internal_abj);
        }
    }

    public void a(Boolean bool) {
        synchronized (this.a) {
            this.s = bool;
        }
    }

    public void a(String str, abo com_google_android_gms_internal_abo) {
        synchronized (this.a) {
            this.g.put(str, com_google_android_gms_internal_abo);
        }
    }

    public void a(Thread thread) {
        zz.a(this.l, thread, this.m);
    }

    public void a(Throwable th, String str) {
        new zz(this.l, this.m, null, null).a(th, str);
    }

    public void a(HashSet<abj> hashSet) {
        synchronized (this.a) {
            this.f.addAll(hashSet);
        }
    }

    public void a(boolean z) {
        if (!z) {
            a(u.k().a());
            a(this.c.d());
        } else if (u.k().a() - this.A > ((Long) uf.aq.c()).longValue()) {
            this.c.a(-1);
        } else {
            this.c.a(this.B);
        }
    }

    public Future b(Context context, boolean z) {
        Future c;
        synchronized (this.a) {
            if (z != this.w) {
                this.w = z;
                c = abt.c(context, z);
            } else {
                c = null;
            }
        }
        return c;
    }

    public void b(boolean z) {
        synchronized (this.a) {
            if (this.o != z) {
                abt.b(this.l, z);
            }
            this.o = z;
            tq a = a(this.l);
            if (!(a == null || a.isAlive())) {
                com.google.android.gms.ads.internal.util.client.b.c("start fetching content...");
                a.a();
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.o;
        }
        return z;
    }

    public String c() {
        String bigInteger;
        synchronized (this.a) {
            bigInteger = this.e.toString();
            this.e = this.e.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    public void c(boolean z) {
        this.x = z;
    }

    public abm d() {
        abm com_google_android_gms_internal_abm;
        synchronized (this.a) {
            com_google_android_gms_internal_abm = this.c;
        }
        return com_google_android_gms_internal_abm;
    }

    public void d(boolean z) {
        synchronized (this.a) {
            this.u = z;
        }
    }

    public uh e() {
        uh uhVar;
        synchronized (this.a) {
            uhVar = this.n;
        }
        return uhVar;
    }

    public boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.h;
            this.h = true;
        }
        return z;
    }

    public boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.i || this.v;
        }
        return z;
    }

    public String h() {
        String str;
        synchronized (this.a) {
            str = this.t;
        }
        return str;
    }

    public String i() {
        String str;
        synchronized (this.a) {
            str = this.r;
        }
        return str;
    }

    public Boolean j() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.s;
        }
        return bool;
    }

    public boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.w;
        }
        return z;
    }

    public long l() {
        long j;
        synchronized (this.a) {
            j = this.A;
        }
        return j;
    }

    public int m() {
        int i;
        synchronized (this.a) {
            i = this.B;
        }
        return i;
    }

    public boolean n() {
        return this.x;
    }

    public abk o() {
        abk com_google_android_gms_internal_abk;
        synchronized (this.a) {
            com_google_android_gms_internal_abk = new abk(this.y, this.z);
        }
        return com_google_android_gms_internal_abk;
    }

    public ti p() {
        return this.d;
    }

    public Resources q() {
        if (this.m.e) {
            return this.l.getResources();
        }
        try {
            akb a = akb.a(this.l, akb.a, ModuleDescriptor.MODULE_ID);
            return a != null ? a.a().getResources() : null;
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public boolean r() {
        boolean z;
        synchronized (this.a) {
            z = this.u;
        }
        return z;
    }

    void s() {
        try {
            this.n = u.l().a(new ug(this.l, this.m.b));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Cannot initialize CSI reporter.", e);
        }
    }
}
