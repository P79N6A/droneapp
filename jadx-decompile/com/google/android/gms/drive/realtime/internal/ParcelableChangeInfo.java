package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import java.util.List;

public class ParcelableChangeInfo extends AbstractSafeParcelable {
    public static final Creator<ParcelableChangeInfo> CREATOR = new p();
    final int a;
    final long b;
    final List<ParcelableEvent> c;

    ParcelableChangeInfo(int i, long j, List<ParcelableEvent> list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel, i);
    }
}
