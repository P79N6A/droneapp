package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class w implements Creator<PlaceReport> {
    static void a(PlaceReport placeReport, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placeReport.a);
        b.a(parcel, 2, placeReport.a(), false);
        b.a(parcel, 3, placeReport.b(), false);
        b.a(parcel, 4, placeReport.c(), false);
        b.a(parcel, a);
    }

    public PlaceReport a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str3 = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlaceReport(i, str3, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlaceReport[] a(int i) {
        return new PlaceReport[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
