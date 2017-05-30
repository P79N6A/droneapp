package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class j implements Creator<CastDevice> {
    static void a(CastDevice castDevice, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, castDevice.a());
        b.a(parcel, 2, castDevice.c(), false);
        b.a(parcel, 3, castDevice.f, false);
        b.a(parcel, 4, castDevice.e(), false);
        b.a(parcel, 5, castDevice.f(), false);
        b.a(parcel, 6, castDevice.g(), false);
        b.a(parcel, 7, castDevice.i());
        b.c(parcel, 8, castDevice.j(), false);
        b.a(parcel, 9, castDevice.l());
        b.a(parcel, 10, castDevice.m());
        b.a(parcel, 11, castDevice.h(), false);
        b.a(parcel, a);
    }

    public CastDevice a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        int i2 = -1;
        List list = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i4 = a.g(parcel, a);
                    break;
                case 2:
                    str6 = a.q(parcel, a);
                    break;
                case 3:
                    str5 = a.q(parcel, a);
                    break;
                case 4:
                    str4 = a.q(parcel, a);
                    break;
                case 5:
                    str3 = a.q(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    i3 = a.g(parcel, a);
                    break;
                case 8:
                    list = a.c(parcel, a, WebImage.CREATOR);
                    break;
                case 9:
                    i = a.g(parcel, a);
                    break;
                case 10:
                    i2 = a.g(parcel, a);
                    break;
                case 11:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CastDevice(i4, str6, str5, str4, str3, str2, i3, list, i, i2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CastDevice[] a(int i) {
        return new CastDevice[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
