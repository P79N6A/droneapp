package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ValueChangedDetails extends AbstractSafeParcelable {
    public static final Creator<ValueChangedDetails> CREATOR = new h();
    final int a;
    final int b;

    ValueChangedDetails(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
