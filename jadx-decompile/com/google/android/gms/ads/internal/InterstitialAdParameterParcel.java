package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public final class InterstitialAdParameterParcel extends AbstractSafeParcelable {
    public static final m CREATOR = new m();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final float f;
    public final int g;

    InterstitialAdParameterParcel(int i, boolean z, boolean z2, String str, boolean z3, float f, int i2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.f = f;
        this.g = i2;
    }

    public InterstitialAdParameterParcel(boolean z, boolean z2, boolean z3, float f, int i) {
        this(3, z, z2, null, z3, f, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
