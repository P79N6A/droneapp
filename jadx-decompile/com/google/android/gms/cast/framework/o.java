package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class o implements Creator<CastOptions> {
    static void a(CastOptions castOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, castOptions.a());
        b.a(parcel, 2, castOptions.b(), false);
        b.b(parcel, 3, castOptions.c(), false);
        b.a(parcel, 4, castOptions.d());
        b.a(parcel, 5, castOptions.e(), i, false);
        b.a(parcel, 6, castOptions.f());
        b.a(parcel, 7, castOptions.g(), i, false);
        b.a(parcel, 8, castOptions.h());
        b.a(parcel, 9, castOptions.i());
        b.a(parcel, a);
    }

    public CastOptions a(Parcel parcel) {
        CastMediaOptions castMediaOptions = null;
        boolean z = false;
        int b = a.b(parcel);
        double d = 0.0d;
        boolean z2 = false;
        LaunchOptions launchOptions = null;
        boolean z3 = false;
        List list = null;
        String str = null;
        int i = 0;
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
                    list = a.E(parcel, a);
                    break;
                case 4:
                    z3 = a.c(parcel, a);
                    break;
                case 5:
                    launchOptions = (LaunchOptions) a.a(parcel, a, LaunchOptions.CREATOR);
                    break;
                case 6:
                    z2 = a.c(parcel, a);
                    break;
                case 7:
                    castMediaOptions = (CastMediaOptions) a.a(parcel, a, CastMediaOptions.CREATOR);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                case 9:
                    d = a.n(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CastOptions(i, str, list, z3, launchOptions, z2, castMediaOptions, z, d);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CastOptions[] a(int i) {
        return new CastOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
