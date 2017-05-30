package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<ObjectChangedDetails> {
    static void a(ObjectChangedDetails objectChangedDetails, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, objectChangedDetails.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, objectChangedDetails.b);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, objectChangedDetails.c);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public ObjectChangedDetails a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ObjectChangedDetails(i3, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ObjectChangedDetails[] a(int i) {
        return new ObjectChangedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
