package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ParcelableTransferPreferences extends AbstractSafeParcelable {
    public static final Creator<ParcelableTransferPreferences> CREATOR = new am();
    final int a;
    final int b;
    final int c;
    final boolean d;

    ParcelableTransferPreferences(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        am.a(this, parcel, i);
    }
}
