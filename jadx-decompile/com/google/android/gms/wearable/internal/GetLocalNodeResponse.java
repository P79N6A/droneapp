package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetLocalNodeResponse extends AbstractSafeParcelable {
    public static final Creator<GetLocalNodeResponse> CREATOR = new u();
    public final int a;
    public final int b;
    public final NodeParcelable c;

    GetLocalNodeResponse(int i, int i2, NodeParcelable nodeParcelable) {
        this.a = i;
        this.b = i2;
        this.c = nodeParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        u.a(this, parcel, i);
    }
}
