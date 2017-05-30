package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetDriveIdFromUniqueIdentifierRequest extends AbstractSafeParcelable {
    public static final Creator<GetDriveIdFromUniqueIdentifierRequest> CREATOR = new j();
    final int a;
    final String b;
    final boolean c;

    GetDriveIdFromUniqueIdentifierRequest(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
