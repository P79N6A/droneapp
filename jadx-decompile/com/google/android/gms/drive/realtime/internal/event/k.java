package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k implements Creator<ValuesSetDetails> {
    static void a(ValuesSetDetails valuesSetDetails, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, valuesSetDetails.a);
        b.a(parcel, 2, valuesSetDetails.b);
        b.a(parcel, 3, valuesSetDetails.c);
        b.a(parcel, 4, valuesSetDetails.d);
        b.a(parcel, a);
    }

    public ValuesSetDetails a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i4 = a.g(parcel, a);
                    break;
                case 2:
                    i3 = a.g(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ValuesSetDetails(i4, i3, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ValuesSetDetails[] a(int i) {
        return new ValuesSetDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
