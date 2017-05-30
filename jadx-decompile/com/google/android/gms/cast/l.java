package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class l implements Creator<LaunchOptions> {
    static void a(LaunchOptions launchOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, launchOptions.a());
        b.a(parcel, 2, launchOptions.b());
        b.a(parcel, 3, launchOptions.c(), false);
        b.a(parcel, a);
    }

    public LaunchOptions a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    z = a.c(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LaunchOptions(i, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LaunchOptions[] a(int i) {
        return new LaunchOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
