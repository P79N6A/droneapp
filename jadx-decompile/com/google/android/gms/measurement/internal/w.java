package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class w implements Creator<EventParcel> {
    static void a(EventParcel eventParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, eventParcel.a);
        b.a(parcel, 2, eventParcel.b, false);
        b.a(parcel, 3, eventParcel.c, i, false);
        b.a(parcel, 4, eventParcel.d, false);
        b.a(parcel, 5, eventParcel.e);
        b.a(parcel, a);
    }

    public EventParcel a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        EventParams eventParams = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    eventParams = (EventParams) a.a(parcel, a, EventParams.CREATOR);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new EventParcel(i, str2, eventParams, str, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public EventParcel[] a(int i) {
        return new EventParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
