package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class UserAttributeParcel extends AbstractSafeParcelable {
    public static final k CREATOR = new k();
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final Float e;
    public final String f;
    public final String g;
    public final Double h;

    UserAttributeParcel(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        Double d2 = null;
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        this.e = null;
        if (i == 1) {
            if (f != null) {
                d2 = Double.valueOf(f.doubleValue());
            }
            this.h = d2;
        } else {
            this.h = d;
        }
        this.f = str2;
        this.g = str3;
    }

    UserAttributeParcel(l lVar) {
        this(lVar.b, lVar.c, lVar.d, lVar.a);
    }

    UserAttributeParcel(String str, long j, Object obj, String str2) {
        d.a(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.g = str2;
        if (obj == null) {
            this.d = null;
            this.e = null;
            this.h = null;
            this.f = null;
        } else if (obj instanceof Long) {
            this.d = (Long) obj;
            this.e = null;
            this.h = null;
            this.f = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.e = null;
            this.h = null;
            this.f = (String) obj;
        } else if (obj instanceof Double) {
            this.d = null;
            this.e = null;
            this.h = (Double) obj;
            this.f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public Object a() {
        return this.d != null ? this.d : this.h != null ? this.h : this.f != null ? this.f : null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
