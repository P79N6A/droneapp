package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.TypeFilterImpl;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class l implements Creator<SnapshotRequest> {
    static void a(SnapshotRequest snapshotRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, snapshotRequest.a());
        b.a(parcel, 2, snapshotRequest.b());
        b.c(parcel, 3, snapshotRequest.c(), false);
        b.a(parcel, a);
    }

    public SnapshotRequest a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        ArrayList arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    arrayList = a.c(parcel, a, TypeFilterImpl.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SnapshotRequest(i2, i, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SnapshotRequest[] a(int i) {
        return new SnapshotRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
