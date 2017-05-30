package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class p implements Creator<ChangeSequenceNumber> {
    static void a(ChangeSequenceNumber changeSequenceNumber, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, changeSequenceNumber.a);
        b.a(parcel, 2, changeSequenceNumber.b);
        b.a(parcel, 3, changeSequenceNumber.c);
        b.a(parcel, 4, changeSequenceNumber.d);
        b.a(parcel, a);
    }

    public ChangeSequenceNumber a(Parcel parcel) {
        long j = 0;
        int b = a.b(parcel);
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    j3 = a.i(parcel, a);
                    break;
                case 3:
                    j2 = a.i(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChangeSequenceNumber(i, j3, j2, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ChangeSequenceNumber[] a(int i) {
        return new ChangeSequenceNumber[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
