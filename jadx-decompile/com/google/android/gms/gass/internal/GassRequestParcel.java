package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GassRequestParcel extends AbstractSafeParcelable {
    public static final Creator<GassRequestParcel> CREATOR = new c();
    public final int a;
    public final String b;
    public final String c;

    GassRequestParcel(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public GassRequestParcel(String str, String str2) {
        this(1, str, str2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
