package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Creator<HarmfulAppsData> CREATOR = new f();
    public final int a;
    public final String b;
    public final byte[] c;
    public final int d;

    HarmfulAppsData(int i, String str, byte[] bArr, int i2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
