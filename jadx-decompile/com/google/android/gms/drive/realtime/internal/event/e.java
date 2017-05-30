package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<ReferenceShiftedDetails> {
    static void a(ReferenceShiftedDetails referenceShiftedDetails, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, referenceShiftedDetails.a);
        b.a(parcel, 2, referenceShiftedDetails.b, false);
        b.a(parcel, 3, referenceShiftedDetails.c, false);
        b.a(parcel, 4, referenceShiftedDetails.d);
        b.a(parcel, 5, referenceShiftedDetails.e);
        b.a(parcel, a);
    }

    public ReferenceShiftedDetails a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ReferenceShiftedDetails(i3, str2, str, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ReferenceShiftedDetails[] a(int i) {
        return new ReferenceShiftedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
