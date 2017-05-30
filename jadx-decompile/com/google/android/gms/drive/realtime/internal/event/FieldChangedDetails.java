package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FieldChangedDetails extends AbstractSafeParcelable {
    public static final Creator<FieldChangedDetails> CREATOR = new a();
    final int a;
    final int b;

    FieldChangedDetails(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
