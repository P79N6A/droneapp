package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o implements Creator<WeatherImpl> {
    static void a(WeatherImpl weatherImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, weatherImpl.a());
        b.a(parcel, 2, weatherImpl.d());
        b.a(parcel, 3, weatherImpl.c());
        b.a(parcel, 4, weatherImpl.b());
        b.a(parcel, 5, weatherImpl.e());
        b.a(parcel, 6, weatherImpl.f(), false);
        b.a(parcel, a);
    }

    public WeatherImpl a(Parcel parcel) {
        int i = 0;
        float f = 0.0f;
        int b = a.b(parcel);
        int[] iArr = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    f3 = a.l(parcel, a);
                    break;
                case 3:
                    f2 = a.l(parcel, a);
                    break;
                case 4:
                    f = a.l(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                case 6:
                    iArr = a.w(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WeatherImpl(i2, f3, f2, f, i, iArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WeatherImpl[] a(int i) {
        return new WeatherImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
