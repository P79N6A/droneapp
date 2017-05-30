package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Creator<StorageInfoResponse> CREATOR = new an();
    public final int a;
    public final int b;
    public final long c;
    public final List<PackageStorageInfo> d;

    StorageInfoResponse(int i, int i2, long j, List<PackageStorageInfo> list) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        an.a(this, parcel, i);
    }
}
