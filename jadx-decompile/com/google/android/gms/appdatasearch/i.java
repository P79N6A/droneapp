package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<RegisterSectionInfo> {
    static void a(RegisterSectionInfo registerSectionInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, registerSectionInfo.b, false);
        b.a(parcel, 2, registerSectionInfo.c, false);
        b.a(parcel, 3, registerSectionInfo.d);
        b.a(parcel, 4, registerSectionInfo.e);
        b.a(parcel, 5, registerSectionInfo.f);
        b.a(parcel, 6, registerSectionInfo.g, false);
        b.a(parcel, 7, registerSectionInfo.h, i, false);
        b.a(parcel, 1000, registerSectionInfo.a);
        b.a(parcel, 8, registerSectionInfo.i, false);
        b.a(parcel, 11, registerSectionInfo.j, false);
        b.a(parcel, a);
    }

    public RegisterSectionInfo a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        int i = 1;
        int[] iArr = null;
        Feature[] featureArr = null;
        String str2 = null;
        boolean z2 = false;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str4 = a.q(parcel, a);
                    break;
                case 2:
                    str3 = a.q(parcel, a);
                    break;
                case 3:
                    z2 = a.c(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    featureArr = (Feature[]) a.b(parcel, a, Feature.CREATOR);
                    break;
                case 8:
                    iArr = a.w(parcel, a);
                    break;
                case 11:
                    str = a.q(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RegisterSectionInfo(i2, str4, str3, z2, i, z, str2, featureArr, iArr, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RegisterSectionInfo[] a(int i) {
        return new RegisterSectionInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
