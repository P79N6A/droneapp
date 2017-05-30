package com.google.android.gms.analytics.internal;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.t;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Set;

public class ah {
    private final v a;
    private volatile Boolean b;
    private String c;
    private Set<Integer> d;

    protected ah(v vVar) {
        d.a((Object) vVar);
        this.a = vVar;
    }

    public String A() {
        return "google_analytics_v4.db";
    }

    public String B() {
        return "google_analytics2_v4.db";
    }

    public long C() {
        return 86400000;
    }

    public int D() {
        return ((Integer) ao.E.a()).intValue();
    }

    public int E() {
        return ((Integer) ao.F.a()).intValue();
    }

    public long F() {
        return ((Long) ao.G.a()).longValue();
    }

    public long G() {
        return ((Long) ao.P.a()).longValue();
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    ApplicationInfo applicationInfo = this.a.b().getApplicationInfo();
                    String b = t.b();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(b);
                        this.b = Boolean.valueOf(z);
                    }
                    if ((this.b == null || !this.b.booleanValue()) && "com.google.android.gms.analytics".equals(b)) {
                        this.b = Boolean.TRUE;
                    }
                    if (this.b == null) {
                        this.b = Boolean.TRUE;
                        this.a.f().u("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.b.booleanValue();
    }

    public boolean c() {
        return ((Boolean) ao.b.a()).booleanValue();
    }

    public int d() {
        return ((Integer) ao.u.a()).intValue();
    }

    public int e() {
        return ((Integer) ao.y.a()).intValue();
    }

    public int f() {
        return ((Integer) ao.z.a()).intValue();
    }

    public int g() {
        return ((Integer) ao.A.a()).intValue();
    }

    public long h() {
        return ((Long) ao.j.a()).longValue();
    }

    public long i() {
        return ((Long) ao.i.a()).longValue();
    }

    public long j() {
        return ((Long) ao.m.a()).longValue();
    }

    public long k() {
        return ((Long) ao.n.a()).longValue();
    }

    public int l() {
        return ((Integer) ao.o.a()).intValue();
    }

    public int m() {
        return ((Integer) ao.p.a()).intValue();
    }

    public long n() {
        return (long) ((Integer) ao.C.a()).intValue();
    }

    public String o() {
        return (String) ao.r.a();
    }

    public String p() {
        return (String) ao.q.a();
    }

    public String q() {
        return (String) ao.s.a();
    }

    public String r() {
        return (String) ao.t.a();
    }

    public ac s() {
        return ac.a((String) ao.v.a());
    }

    public ae t() {
        return ae.a((String) ao.w.a());
    }

    public Set<Integer> u() {
        String str = (String) ao.B.a();
        if (this.d == null || this.c == null || !this.c.equals(str)) {
            String[] split = TextUtils.split(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
            Set hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException e) {
                }
            }
            this.c = str;
            this.d = hashSet;
        }
        return this.d;
    }

    public long v() {
        return ((Long) ao.K.a()).longValue();
    }

    public long w() {
        return ((Long) ao.L.a()).longValue();
    }

    public long x() {
        return ((Long) ao.O.a()).longValue();
    }

    public int y() {
        return ((Integer) ao.f.a()).intValue();
    }

    public int z() {
        return ((Integer) ao.h.a()).intValue();
    }
}
