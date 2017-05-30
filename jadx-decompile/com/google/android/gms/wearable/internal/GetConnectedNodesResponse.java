package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class GetConnectedNodesResponse extends AbstractSafeParcelable {
    public static final Creator<GetConnectedNodesResponse> CREATOR = new r();
    public final int a;
    public final int b;
    public final List<NodeParcelable> c;

    GetConnectedNodesResponse(int i, int i2, List<NodeParcelable> list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
