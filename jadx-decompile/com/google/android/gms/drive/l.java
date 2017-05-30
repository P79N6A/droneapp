package com.google.android.gms.drive;

import com.google.android.gms.common.data.f;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.ajw;
import com.google.android.gms.internal.ajy;
import com.google.android.gms.internal.aka;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public abstract class l implements f<l> {
    public static final int a = 0;
    public static final int b = 1;

    public boolean A() {
        Boolean bool = (Boolean) a(ajw.r);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean B() {
        Boolean bool = (Boolean) a(ajw.s);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean C() {
        Boolean bool = (Boolean) a(ajw.E);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean D() {
        Boolean bool = (Boolean) a(ajw.H);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean E() {
        Boolean bool = (Boolean) a(ajw.v);
        return bool == null ? true : bool.booleanValue();
    }

    public boolean F() {
        Boolean bool = (Boolean) a(ajw.n);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean G() {
        Boolean bool = (Boolean) a(ajw.w);
        return bool == null ? false : bool.booleanValue();
    }

    public abstract <T> T a(a<T> aVar);

    public String c() {
        return (String) a(ajw.b);
    }

    public int d() {
        Integer num = (Integer) a(aka.a);
        return num == null ? 0 : num.intValue();
    }

    public Date e() {
        return (Date) a(ajy.a);
    }

    public Map<CustomPropertyKey, String> f() {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) a(ajw.c);
        return appVisibleCustomProperties == null ? Collections.emptyMap() : appVisibleCustomProperties.a();
    }

    public String g() {
        return (String) a(ajw.d);
    }

    public DriveId h() {
        return (DriveId) a(ajw.a);
    }

    public String i() {
        return (String) a(ajw.e);
    }

    public String j() {
        return (String) a(ajw.f);
    }

    public long k() {
        return ((Long) a(ajw.g)).longValue();
    }

    public Date l() {
        return (Date) a(ajy.b);
    }

    public String m() {
        return (String) a(ajw.x);
    }

    public Date n() {
        return (Date) a(ajy.d);
    }

    public Date o() {
        return (Date) a(ajy.c);
    }

    public String p() {
        return (String) a(ajw.y);
    }

    public boolean q() {
        Boolean bool = (Boolean) a(aka.b);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean r() {
        Boolean bool = (Boolean) a(ajw.p);
        return bool == null ? false : bool.booleanValue();
    }

    public long s() {
        return ((Long) a(ajw.D)).longValue();
    }

    public Date t() {
        return (Date) a(ajy.e);
    }

    public String u() {
        return (String) a(ajw.G);
    }

    public String v() {
        return (String) a(ajw.I);
    }

    public String w() {
        return (String) a(ajw.J);
    }

    public boolean x() {
        Boolean bool = (Boolean) a(ajw.k);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean y() {
        Boolean bool = (Boolean) a(ajw.m);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean z() {
        return f.b_.equals(m());
    }
}
