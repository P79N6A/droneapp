package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ReferenceShiftedDetails extends AbstractSafeParcelable {
    public static final Creator<ReferenceShiftedDetails> CREATOR = new e();
    final int a;
    final String b;
    final String c;
    final int d;
    final int e;

    ReferenceShiftedDetails(int i, String str, String str2, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
