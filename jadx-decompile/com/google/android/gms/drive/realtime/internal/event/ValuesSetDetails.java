package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ValuesSetDetails extends AbstractSafeParcelable {
    public static final Creator<ValuesSetDetails> CREATOR = new k();
    final int a;
    final int b;
    final int c;
    final int d;

    ValuesSetDetails(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}