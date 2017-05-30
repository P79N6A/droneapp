package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<ValuesAddedDetails> {
    static void a(ValuesAddedDetails valuesAddedDetails, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, valuesAddedDetails.a);
        b.a(parcel, 2, valuesAddedDetails.b);
        b.a(parcel, 3, valuesAddedDetails.c);
        b.a(parcel, 4, valuesAddedDetails.d);
        b.a(parcel, 5, valuesAddedDetails.e, false);
        b.a(parcel, 6, valuesAddedDetails.f);
        b.a(parcel, a);
    }

    public ValuesAddedDetails a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i5 = a.g(parcel, a);
                    break;
                case 2:
                    i4 = a.g(parcel, a);
                    break;
                case 3:
                    i3 = a.g(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ValuesAddedDetails(i5, i4, i3, i2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ValuesAddedDetails[] a(int i) {
        return new ValuesAddedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
