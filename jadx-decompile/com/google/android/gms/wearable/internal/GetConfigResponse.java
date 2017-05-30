package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Creator<GetConfigResponse> CREATOR = new p();
    public final int a;
    public final int b;
    public final ConnectionConfiguration c;

    GetConfigResponse(int i, int i2, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = i2;
        this.c = connectionConfiguration;
    }

    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel, i);
    }
}
