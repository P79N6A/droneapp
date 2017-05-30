package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Permission;
import java.util.List;

public class GetPermissionsResponse extends AbstractSafeParcelable {
    public static final Creator<GetPermissionsResponse> CREATOR = new m();
    final int a;
    final List<Permission> b;
    final int c;

    GetPermissionsResponse(int i, List<Permission> list, int i2) {
        this.a = i;
        this.b = list;
        this.c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
