package com.google.android.gms.ads.internal.safebrowsing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<SafeBrowsingConfigParcel> {
    static void a(SafeBrowsingConfigParcel safeBrowsingConfigParcel, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, safeBrowsingConfigParcel.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, safeBrowsingConfigParcel.b, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, safeBrowsingConfigParcel.c, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, safeBrowsingConfigParcel.d);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, safeBrowsingConfigParcel.e);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public SafeBrowsingConfigParcel a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        boolean z2 = false;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    z2 = a.c(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SafeBrowsingConfigParcel(i, str2, str, z2, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SafeBrowsingConfigParcel[] a(int i) {
        return new SafeBrowsingConfigParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
