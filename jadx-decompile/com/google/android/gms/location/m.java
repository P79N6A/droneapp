package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.tencent.mm.sdk.platformtools.Util;

public class m implements Creator<LocationRequest> {
    public static final int a = 0;

    static void a(LocationRequest locationRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, locationRequest.e);
        b.a(parcel, 2, locationRequest.f);
        b.a(parcel, 3, locationRequest.g);
        b.a(parcel, 4, locationRequest.h);
        b.a(parcel, 5, locationRequest.i);
        b.a(parcel, 6, locationRequest.j);
        b.a(parcel, 7, locationRequest.k);
        b.a(parcel, 1000, locationRequest.i());
        b.a(parcel, 8, locationRequest.l);
        b.a(parcel, a);
    }

    public LocationRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        int i2 = 102;
        long j = Util.MILLSECONDS_OF_HOUR;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    j2 = a.i(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    j3 = a.i(parcel, a);
                    break;
                case 6:
                    i3 = a.g(parcel, a);
                    break;
                case 7:
                    f = a.l(parcel, a);
                    break;
                case 8:
                    j4 = a.i(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationRequest(i, i2, j, j2, z, j3, i3, f, j4);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LocationRequest[] a(int i) {
        return new LocationRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
