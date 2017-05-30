package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BeginCompoundOperationRequest extends AbstractSafeParcelable {
    public static final Creator<BeginCompoundOperationRequest> CREATOR = new a();
    final int a;
    final boolean b;
    final String c;
    final boolean d;

    BeginCompoundOperationRequest(int i, boolean z, String str, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
