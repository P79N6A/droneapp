package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.e;

public class CreateContentsRequest extends AbstractSafeParcelable {
    public static final Creator<CreateContentsRequest> CREATOR = new bj();
    final int a;
    final int b;

    public CreateContentsRequest(int i) {
        this(1, i);
    }

    CreateContentsRequest(int i, int i2) {
        this.a = i;
        boolean z = i2 == e.c || i2 == e.b;
        d.b(z, "Cannot create a new read-only contents!");
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bj.a(this, parcel, i);
    }
}
