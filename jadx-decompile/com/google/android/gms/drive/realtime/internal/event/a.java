package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<FieldChangedDetails> {
    static void a(FieldChangedDetails fieldChangedDetails, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fieldChangedDetails.a);
        b.a(parcel, 2, fieldChangedDetails.b);
        b.a(parcel, a);
    }

    public FieldChangedDetails a(Parcel parcel) {
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FieldChangedDetails(i2, i);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public FieldChangedDetails[] a(int i) {
        return new FieldChangedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
