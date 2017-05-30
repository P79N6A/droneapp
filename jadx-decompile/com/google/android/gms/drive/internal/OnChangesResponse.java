package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

public class OnChangesResponse extends WriteAwareParcelable {
    public static final Creator<OnChangesResponse> CREATOR = new t();
    final int a;
    final DataHolder b;
    final List<DriveId> c;
    final ChangeSequenceNumber d;
    final boolean e;

    OnChangesResponse(int i, DataHolder dataHolder, List<DriveId> list, ChangeSequenceNumber changeSequenceNumber, boolean z) {
        this.a = i;
        this.b = dataHolder;
        this.c = list;
        this.d = changeSequenceNumber;
        this.e = z;
    }

    protected void a(Parcel parcel, int i) {
        t.a(this, parcel, i | 1);
    }
}
