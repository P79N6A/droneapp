package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<ValueChangedDetails> {
    static void a(ValueChangedDetails valueChangedDetails, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, valueChangedDetails.a);
        b.a(parcel, 2, valueChangedDetails.b);
        b.a(parcel, a);
    }

    public ValueChangedDetails a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
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
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ValueChangedDetails(i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ValueChangedDetails[] a(int i) {
        return new ValueChangedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
