package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class PlusSession extends AbstractSafeParcelable {
    public static final h CREATOR = new h();
    private final int a;
    private final String b;
    private final String[] c;
    private final String[] d;
    private final String[] e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final PlusCommonExtras j;

    PlusSession(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String str5, PlusCommonExtras plusCommonExtras) {
        this.a = i;
        this.b = str;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = plusCommonExtras;
    }

    public PlusSession(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, PlusCommonExtras plusCommonExtras) {
        this.a = 1;
        this.b = str;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = null;
        this.j = plusCommonExtras;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String[] c() {
        return this.c;
    }

    public String[] d() {
        return this.d;
    }

    public String[] e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusSession)) {
            return false;
        }
        PlusSession plusSession = (PlusSession) obj;
        return this.a == plusSession.a && c.a(this.b, plusSession.b) && Arrays.equals(this.c, plusSession.c) && Arrays.equals(this.d, plusSession.d) && Arrays.equals(this.e, plusSession.e) && c.a(this.f, plusSession.f) && c.a(this.g, plusSession.g) && c.a(this.h, plusSession.h) && c.a(this.i, plusSession.i) && c.a(this.j, plusSession.j);
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }

    public String i() {
        return this.i;
    }

    public PlusCommonExtras j() {
        return this.j;
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
        this.j.a(bundle);
        return bundle;
    }

    public String toString() {
        return c.a(this).a("versionCode", Integer.valueOf(this.a)).a("accountName", this.b).a("requestedScopes", this.c).a("visibleActivities", this.d).a("requiredFeatures", this.e).a("packageNameForAuth", this.f).a("callingPackageName", this.g).a("applicationName", this.h).a("extra", this.j.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
