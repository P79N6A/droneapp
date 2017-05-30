package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetCloudSyncOptInStatusResponse extends AbstractSafeParcelable {
    public static final Creator<GetCloudSyncOptInStatusResponse> CREATOR = new n();
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    GetCloudSyncOptInStatusResponse(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
