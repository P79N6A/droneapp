package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class m implements Creator<InterstitialAdParameterParcel> {
    static void a(InterstitialAdParameterParcel interstitialAdParameterParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, interstitialAdParameterParcel.a);
        b.a(parcel, 2, interstitialAdParameterParcel.b);
        b.a(parcel, 3, interstitialAdParameterParcel.c);
        b.a(parcel, 4, interstitialAdParameterParcel.d, false);
        b.a(parcel, 5, interstitialAdParameterParcel.e);
        b.a(parcel, 6, interstitialAdParameterParcel.f);
        b.a(parcel, 7, interstitialAdParameterParcel.g);
        b.a(parcel, a);
    }

    public InterstitialAdParameterParcel a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        float f = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    z3 = a.c(parcel, a);
                    break;
                case 3:
                    z2 = a.c(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                case 6:
                    f = a.l(parcel, a);
                    break;
                case 7:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new InterstitialAdParameterParcel(i2, z3, z2, str, z, f, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public InterstitialAdParameterParcel[] a(int i) {
        return new InterstitialAdParameterParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
