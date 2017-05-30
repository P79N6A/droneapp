package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.vision.barcode.Barcode.WiFi;

public class n implements Creator<WiFi> {
    static void a(WiFi wiFi, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, wiFi.d);
        b.a(parcel, 2, wiFi.e, false);
        b.a(parcel, 3, wiFi.f, false);
        b.a(parcel, 4, wiFi.g);
        b.a(parcel, a);
    }

    public WiFi a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
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
            return new WiFi(i2, str2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WiFi[] a(int i) {
        return new WiFi[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
