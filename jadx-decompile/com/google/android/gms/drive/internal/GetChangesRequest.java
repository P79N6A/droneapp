package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetChangesRequest extends AbstractSafeParcelable {
    public static final Creator<GetChangesRequest> CREATOR = new i();
    final int a;
    final ChangeSequenceNumber b;
    final int c;
    final List<DriveSpace> d;
    final boolean e;
    private final Set<DriveSpace> f;

    private GetChangesRequest(int i, ChangeSequenceNumber changeSequenceNumber, int i2, List<DriveSpace> list, Set<DriveSpace> set, boolean z) {
        this.a = i;
        this.b = changeSequenceNumber;
        this.c = i2;
        this.d = list;
        this.f = set;
        this.e = z;
    }

    GetChangesRequest(int i, ChangeSequenceNumber changeSequenceNumber, int i2, List<DriveSpace> list, boolean z) {
        this(i, changeSequenceNumber, i2, list, list == null ? null : new HashSet(list), z);
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
