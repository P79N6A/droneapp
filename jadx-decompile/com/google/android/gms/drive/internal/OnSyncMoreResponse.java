package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnSyncMoreResponse extends AbstractSafeParcelable {
    public static final Creator<OnSyncMoreResponse> CREATOR = new ai();
    final int a;
    final boolean b;

    OnSyncMoreResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ai.a(this, parcel, i);
    }
}
