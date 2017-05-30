package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class EndCompoundOperationRequest extends AbstractSafeParcelable {
    public static final Creator<EndCompoundOperationRequest> CREATOR = new b();
    final int a;

    public EndCompoundOperationRequest() {
        this(1);
    }

    EndCompoundOperationRequest(int i) {
        this.a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
