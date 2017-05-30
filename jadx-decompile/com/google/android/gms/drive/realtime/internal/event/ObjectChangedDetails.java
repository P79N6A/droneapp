package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ObjectChangedDetails extends AbstractSafeParcelable {
    public static final Creator<ObjectChangedDetails> CREATOR = new b();
    final int a;
    final int b;
    final int c;

    ObjectChangedDetails(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
