package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import java.util.List;

public class p implements Creator<ParcelableChangeInfo> {
    static void a(ParcelableChangeInfo parcelableChangeInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, parcelableChangeInfo.a);
        b.a(parcel, 2, parcelableChangeInfo.b);
        b.c(parcel, 3, parcelableChangeInfo.c, false);
        b.a(parcel, a);
    }

    public ParcelableChangeInfo a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    list = a.c(parcel, a, ParcelableEvent.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableChangeInfo(i, j, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableChangeInfo[] a(int i) {
        return new ParcelableChangeInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
