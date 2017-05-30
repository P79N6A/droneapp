package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PackageStorageInfo extends AbstractSafeParcelable {
    public static final Creator<PackageStorageInfo> CREATOR = new ag();
    public final int a;
    public final String b;
    public final String c;
    public final long d;

    PackageStorageInfo(int i, String str, String str2, long j) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ag.a(this, parcel, i);
    }
}
