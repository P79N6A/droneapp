package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

public class d implements Creator<ParcelableEventList> {
    static void a(ParcelableEventList parcelableEventList, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, parcelableEventList.a);
        b.c(parcel, 2, parcelableEventList.b, false);
        b.a(parcel, 3, parcelableEventList.c, i, false);
        b.a(parcel, 4, parcelableEventList.d);
        b.b(parcel, 5, parcelableEventList.e, false);
        b.a(parcel, 6, parcelableEventList.f, i, false);
        b.a(parcel, a);
    }

    public ParcelableEventList a(Parcel parcel) {
        boolean z = false;
        ParcelableChangeInfo parcelableChangeInfo = null;
        int b = a.b(parcel);
        List list = null;
        DataHolder dataHolder = null;
        List list2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    list2 = a.c(parcel, a, ParcelableEvent.CREATOR);
                    break;
                case 3:
                    dataHolder = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    list = a.E(parcel, a);
                    break;
                case 6:
                    parcelableChangeInfo = (ParcelableChangeInfo) a.a(parcel, a, ParcelableChangeInfo.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableEventList(i, list2, dataHolder, z, list, parcelableChangeInfo);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableEventList[] a(int i) {
        return new ParcelableEventList[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
