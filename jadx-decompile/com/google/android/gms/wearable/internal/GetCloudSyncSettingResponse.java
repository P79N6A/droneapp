package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetCloudSyncSettingResponse extends AbstractSafeParcelable {
    public static final Creator<GetCloudSyncSettingResponse> CREATOR = new o();
    public final int a;
    public final int b;
    public final boolean c;

    GetCloudSyncSettingResponse(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
