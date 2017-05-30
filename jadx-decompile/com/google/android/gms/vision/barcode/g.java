package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.vision.barcode.Barcode.DriverLicense;

public class g implements Creator<DriverLicense> {
    static void a(DriverLicense driverLicense, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, driverLicense.a);
        b.a(parcel, 2, driverLicense.b, false);
        b.a(parcel, 3, driverLicense.c, false);
        b.a(parcel, 4, driverLicense.d, false);
        b.a(parcel, 5, driverLicense.e, false);
        b.a(parcel, 6, driverLicense.f, false);
        b.a(parcel, 7, driverLicense.g, false);
        b.a(parcel, 8, driverLicense.h, false);
        b.a(parcel, 9, driverLicense.i, false);
        b.a(parcel, 10, driverLicense.j, false);
        b.a(parcel, 11, driverLicense.k, false);
        b.a(parcel, 12, driverLicense.l, false);
        b.a(parcel, 13, driverLicense.m, false);
        b.a(parcel, 14, driverLicense.n, false);
        b.a(parcel, 15, driverLicense.o, false);
        b.a(parcel, a);
    }

    public DriverLicense a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str5 = a.q(parcel, a);
                    break;
                case 7:
                    str6 = a.q(parcel, a);
                    break;
                case 8:
                    str7 = a.q(parcel, a);
                    break;
                case 9:
                    str8 = a.q(parcel, a);
                    break;
                case 10:
                    str9 = a.q(parcel, a);
                    break;
                case 11:
                    str10 = a.q(parcel, a);
                    break;
                case 12:
                    str11 = a.q(parcel, a);
                    break;
                case 13:
                    str12 = a.q(parcel, a);
                    break;
                case 14:
                    str13 = a.q(parcel, a);
                    break;
                case 15:
                    str14 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DriverLicense(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DriverLicense[] a(int i) {
        return new DriverLicense[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
