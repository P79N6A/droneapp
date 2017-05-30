package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetCloudSyncOptInOutDoneResponse extends AbstractSafeParcelable {
    public static final Creator<GetCloudSyncOptInOutDoneResponse> CREATOR = new m();
    public final int a;
    public final int b;
    public final boolean c;

    GetCloudSyncOptInOutDoneResponse(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
