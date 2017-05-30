package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ParcelableIndexReference extends AbstractSafeParcelable {
    public static final Creator<ParcelableIndexReference> CREATOR = new r();
    final int a;
    final String b;
    final int c;
    final boolean d;
    final int e;

    ParcelableIndexReference(int i, String str, int i2, boolean z, int i3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
