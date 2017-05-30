package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<HarmfulAppsData> {
    static void a(HarmfulAppsData harmfulAppsData, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, harmfulAppsData.a);
        b.a(parcel, 2, harmfulAppsData.b, false);
        b.a(parcel, 3, harmfulAppsData.c, false);
        b.a(parcel, 4, harmfulAppsData.d);
        b.a(parcel, a);
    }

    public HarmfulAppsData a(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    bArr = a.t(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new HarmfulAppsData(i2, str, bArr, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public HarmfulAppsData[] a(int i) {
        return new HarmfulAppsData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
