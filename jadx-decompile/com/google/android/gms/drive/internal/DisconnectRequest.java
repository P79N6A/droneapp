package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DisconnectRequest extends AbstractSafeParcelable {
    public static final Creator<DisconnectRequest> CREATOR = new bq();
    final int a;

    public DisconnectRequest() {
        this(1);
    }

    DisconnectRequest(int i) {
        this.a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bq.a(this, parcel, i);
    }
}
