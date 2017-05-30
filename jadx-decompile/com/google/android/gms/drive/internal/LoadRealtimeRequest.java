package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class LoadRealtimeRequest extends AbstractSafeParcelable {
    public static final Creator<LoadRealtimeRequest> CREATOR = new s();
    final int a;
    final DriveId b;
    final boolean c;
    final List<String> d;
    final boolean e;
    final DataHolder f;
    final String g;

    LoadRealtimeRequest(int i, DriveId driveId, boolean z, List<String> list, boolean z2, DataHolder dataHolder, String str) {
        this.a = i;
        this.b = driveId;
        this.c = z;
        this.d = list;
        this.e = z2;
        this.f = dataHolder;
        this.g = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        s.a(this, parcel, i);
    }
}
