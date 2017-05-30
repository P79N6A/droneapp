package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri.Builder;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import android.support.v7.media.SystemMediaRouteProvider;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.j;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.t;
import com.google.android.gms.internal.aie;
import com.google.android.gms.measurement.internal.x.a;
import com.tencent.connect.common.Constants;
import com.tencent.mm.sdk.platformtools.Util;
import java.lang.reflect.InvocationTargetException;

public class p extends al {
    static final String a = String.valueOf(j.c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
    private Boolean b;

    p(aj ajVar) {
        super(ajVar);
    }

    public int A() {
        return 2048;
    }

    int B() {
        return 500;
    }

    public long C() {
        return (long) ((Integer) x.m.b()).intValue();
    }

    public long D() {
        return (long) ((Integer) x.o.b()).intValue();
    }

    int E() {
        return 25;
    }

    int F() {
        return 50;
    }

    long G() {
        return Util.MILLSECONDS_OF_HOUR;
    }

    long H() {
        return Util.MILLSECONDS_OF_MINUTE;
    }

    long I() {
        return 61000;
    }

    long J() {
        return ((Long) x.G.b()).longValue();
    }

    public String K() {
        return "google_app_measurement.db";
    }

    public String L() {
        return "google_app_measurement2.db";
    }

    public long M() {
        return 9683;
    }

    public boolean N() {
        return false;
    }

    public boolean O() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    ApplicationInfo applicationInfo = q().getApplicationInfo();
                    String b = t.b();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(b);
                        this.b = Boolean.valueOf(z);
                    }
                    if (this.b == null) {
                        this.b = Boolean.TRUE;
                        w().f().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.b.booleanValue();
    }

    public boolean P() {
        if (N()) {
            return false;
        }
        Boolean g = g("firebase_analytics_collection_deactivated");
        return g != null && g.booleanValue();
    }

    public Boolean Q() {
        return N() ? null : g("firebase_analytics_collection_enabled");
    }

    public boolean R() {
        return aie.b();
    }

    public long S() {
        return ((Long) x.D.b()).longValue();
    }

    public long T() {
        return ((Long) x.z.b()).longValue();
    }

    public long U() {
        return 1000;
    }

    public long V() {
        return Math.max(0, ((Long) x.e.b()).longValue());
    }

    public int W() {
        return Math.max(0, ((Integer) x.k.b()).intValue());
    }

    public int X() {
        return Math.max(1, ((Integer) x.l.b()).intValue());
    }

    public String Y() {
        return (String) x.s.b();
    }

    public long Z() {
        return ((Long) x.f.b()).longValue();
    }

    public int a(@Size(min = 1) String str) {
        return Math.max(0, Math.min(1000000, b(str, x.n)));
    }

    public long a(String str, a<Long> aVar) {
        if (str == null) {
            return ((Long) aVar.b()).longValue();
        }
        Object a = t().a(str, aVar.a());
        if (TextUtils.isEmpty(a)) {
            return ((Long) aVar.b()).longValue();
        }
        try {
            return ((Long) aVar.a(Long.valueOf(Long.valueOf(a).longValue()))).longValue();
        } catch (NumberFormatException e) {
            return ((Long) aVar.b()).longValue();
        }
    }

    String a() {
        return (String) x.c.b();
    }

    public String a(String str, String str2) {
        Builder builder = new Builder();
        Builder encodedAuthority = builder.scheme((String) x.g.b()).encodedAuthority((String) x.h.b());
        String str3 = "config/app/";
        String valueOf = String.valueOf(str);
        encodedAuthority.path(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)).appendQueryParameter("app_instance_id", str2).appendQueryParameter(Constants.PARAM_PLATFORM, SystemMediaRouteProvider.PACKAGE_NAME).appendQueryParameter("gmp_version", String.valueOf(M()));
        return builder.build().toString();
    }

    public long aa() {
        return Math.max(0, ((Long) x.t.b()).longValue());
    }

    public long ab() {
        return Math.max(0, ((Long) x.v.b()).longValue());
    }

    public long ac() {
        return Math.max(0, ((Long) x.w.b()).longValue());
    }

    public long ad() {
        return Math.max(0, ((Long) x.x.b()).longValue());
    }

    public long ae() {
        return Math.max(0, ((Long) x.y.b()).longValue());
    }

    public long af() {
        return ((Long) x.u.b()).longValue();
    }

    public long ag() {
        return Math.max(0, ((Long) x.A.b()).longValue());
    }

    public long ah() {
        return Math.max(0, ((Long) x.B.b()).longValue());
    }

    public int ai() {
        return Math.min(20, Math.max(0, ((Integer) x.C.b()).intValue()));
    }

    public String aj() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"firebase.analytics.debug-mode", ""});
        } catch (ClassNotFoundException e) {
            w().f().a("Could not find SystemProperties class", e);
        } catch (NoSuchMethodException e2) {
            w().f().a("Could not find SystemProperties.get() method", e2);
        } catch (IllegalAccessException e3) {
            w().f().a("Could not access SystemProperties.get()", e3);
        } catch (InvocationTargetException e4) {
            w().f().a("SystemProperties.get() threw an exception", e4);
        }
        return "";
    }

    public int b() {
        return 25;
    }

    public int b(@Size(min = 1) String str) {
        return b(str, x.p);
    }

    public int b(String str, a<Integer> aVar) {
        if (str == null) {
            return ((Integer) aVar.b()).intValue();
        }
        Object a = t().a(str, aVar.a());
        if (TextUtils.isEmpty(a)) {
            return ((Integer) aVar.b()).intValue();
        }
        try {
            return ((Integer) aVar.a(Integer.valueOf(Integer.valueOf(a).intValue()))).intValue();
        } catch (NumberFormatException e) {
            return ((Integer) aVar.b()).intValue();
        }
    }

    public int c() {
        return 32;
    }

    public int c(@Size(min = 1) String str) {
        return b(str, x.q);
    }

    public int d() {
        return 24;
    }

    long d(String str) {
        return a(str, x.d);
    }

    int e() {
        return 24;
    }

    int e(String str) {
        return b(str, x.E);
    }

    int f() {
        return 36;
    }

    int f(String str) {
        return Math.max(0, Math.min(2000, b(str, x.F)));
    }

    int g() {
        return 256;
    }

    @Nullable
    Boolean g(@Size(min = 1) String str) {
        Boolean bool = null;
        d.a(str);
        try {
            PackageManager packageManager = q().getPackageManager();
            if (packageManager == null) {
                w().f().a("Failed to load metadata: PackageManager is null");
            } else {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(q().getPackageName(), 128);
                if (applicationInfo == null) {
                    w().f().a("Failed to load metadata: ApplicationInfo is null");
                } else if (applicationInfo.metaData == null) {
                    w().f().a("Failed to load metadata: Metadata bundle is null");
                } else if (applicationInfo.metaData.containsKey(str)) {
                    bool = Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                }
            }
        } catch (NameNotFoundException e) {
            w().f().a("Failed to load metadata: Package name not found", e);
        }
        return bool;
    }

    public int h(String str) {
        return b(str, x.i);
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public int i(String str) {
        return Math.max(0, b(str, x.j));
    }

    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public int j(String str) {
        return Math.max(0, Math.min(1000000, b(str, x.r)));
    }

    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public /* bridge */ /* synthetic */ o k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ d l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ z m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ s n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ e o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ Context q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ q r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ m s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ ah t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ g u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ ai v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ ab w() {
        return super.w();
    }

    public /* bridge */ /* synthetic */ af x() {
        return super.x();
    }

    public /* bridge */ /* synthetic */ p y() {
        return super.y();
    }

    public int z() {
        return 36;
    }
}
