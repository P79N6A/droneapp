package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ValuesRemovedDetails extends AbstractSafeParcelable {
    public static final Creator<ValuesRemovedDetails> CREATOR = new j();
    final int a;
    final int b;
    final int c;
    final int d;
    final String e;
    final int f;

    ValuesRemovedDetails(int i, int i2, int i3, int i4, String str, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = i5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
