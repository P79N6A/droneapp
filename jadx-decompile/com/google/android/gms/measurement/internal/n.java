package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n implements Creator<AppMetadata> {
    static void a(AppMetadata appMetadata, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, appMetadata.a);
        b.a(parcel, 2, appMetadata.b, false);
        b.a(parcel, 3, appMetadata.c, false);
        b.a(parcel, 4, appMetadata.d, false);
        b.a(parcel, 5, appMetadata.e, false);
        b.a(parcel, 6, appMetadata.f);
        b.a(parcel, 7, appMetadata.g);
        b.a(parcel, 8, appMetadata.h, false);
        b.a(parcel, 9, appMetadata.i);
        b.a(parcel, 10, appMetadata.j);
        b.a(parcel, 11, appMetadata.k);
        b.a(parcel, 12, appMetadata.l, false);
        b.a(parcel, a);
    }

    public AppMetadata a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        long j3 = 0;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    j = a.i(parcel, a);
                    break;
                case 7:
                    j2 = a.i(parcel, a);
                    break;
                case 8:
                    str5 = a.q(parcel, a);
                    break;
                case 9:
                    z = a.c(parcel, a);
                    break;
                case 10:
                    z2 = a.c(parcel, a);
                    break;
                case 11:
                    j3 = a.i(parcel, a);
                    break;
                case 12:
                    str6 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AppMetadata(i, str, str2, str3, str4, j, j2, str5, z, z2, j3, str6);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AppMetadata[] a(int i) {
        return new AppMetadata[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
