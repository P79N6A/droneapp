package com.google.android.gms.internal;

import com.google.ads.a.a;
import com.google.ads.a.b;
import com.google.ads.mediation.c;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.j;
import java.util.Date;
import java.util.HashSet;

@aaa
public final class yf {
    public static int a(a aVar) {
        switch (1.b[aVar.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    public static b a(int i) {
        switch (i) {
            case 1:
                return b.MALE;
            case 2:
                return b.FEMALE;
            default:
                return b.UNKNOWN;
        }
    }

    public static com.google.ads.b a(AdSizeParcel adSizeParcel) {
        int i = 0;
        com.google.ads.b[] bVarArr = new com.google.ads.b[]{com.google.ads.b.f, com.google.ads.b.g, com.google.ads.b.h, com.google.ads.b.i, com.google.ads.b.j, com.google.ads.b.k};
        while (i < 6) {
            if (bVarArr[i].a() == adSizeParcel.f && bVarArr[i].b() == adSizeParcel.c) {
                return bVarArr[i];
            }
            i++;
        }
        return new com.google.ads.b(j.a(adSizeParcel.f, adSizeParcel.c, adSizeParcel.b));
    }

    public static c a(AdRequestParcel adRequestParcel) {
        return new c(new Date(adRequestParcel.b), a(adRequestParcel.d), adRequestParcel.e != null ? new HashSet(adRequestParcel.e) : null, adRequestParcel.f, adRequestParcel.k);
    }
}
