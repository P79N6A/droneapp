package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnLoadRealtimeResponse extends AbstractSafeParcelable {
    public static final Creator<OnLoadRealtimeResponse> CREATOR = new af();
    final int a;
    final boolean b;

    OnLoadRealtimeResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        af.a(this, parcel, i);
    }
}
