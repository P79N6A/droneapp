package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

public class ParcelableEventList extends AbstractSafeParcelable {
    public static final Creator<ParcelableEventList> CREATOR = new d();
    final int a;
    final List<ParcelableEvent> b;
    final DataHolder c;
    final boolean d;
    final List<String> e;
    final ParcelableChangeInfo f;

    ParcelableEventList(int i, List<ParcelableEvent> list, DataHolder dataHolder, boolean z, List<String> list2, ParcelableChangeInfo parcelableChangeInfo) {
        this.a = i;
        this.b = list;
        this.c = dataHolder;
        this.d = z;
        this.e = list2;
        this.f = parcelableChangeInfo;
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
