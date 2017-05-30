package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q implements Creator<ParcelableCollaborator> {
    static void a(ParcelableCollaborator parcelableCollaborator, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, parcelableCollaborator.a);
        b.a(parcel, 2, parcelableCollaborator.b);
        b.a(parcel, 3, parcelableCollaborator.c);
        b.a(parcel, 4, parcelableCollaborator.d, false);
        b.a(parcel, 5, parcelableCollaborator.e, false);
        b.a(parcel, 6, parcelableCollaborator.f, false);
        b.a(parcel, 7, parcelableCollaborator.g, false);
        b.a(parcel, 8, parcelableCollaborator.h, false);
        b.a(parcel, a);
    }

    public ParcelableCollaborator a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    z2 = a.c(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    str5 = a.q(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    break;
                case 7:
                    str2 = a.q(parcel, a);
                    break;
                case 8:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableCollaborator(i, z2, z, str5, str4, str3, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableCollaborator[] a(int i) {
        return new ParcelableCollaborator[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
