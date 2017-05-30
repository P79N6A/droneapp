package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Creator<GetConfigsResponse> CREATOR = new q();
    public final int a;
    public final int b;
    public final ConnectionConfiguration[] c;

    GetConfigsResponse(int i, int i2, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = i2;
        this.c = connectionConfigurationArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
