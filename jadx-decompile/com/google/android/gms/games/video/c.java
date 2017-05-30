package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<VideoCapabilities> {
    static void a(VideoCapabilities videoCapabilities, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, videoCapabilities.c());
        b.a(parcel, 2, videoCapabilities.b());
        b.a(parcel, 3, videoCapabilities.d());
        b.a(parcel, 4, videoCapabilities.e(), false);
        b.a(parcel, 5, videoCapabilities.f(), false);
        b.a(parcel, 1000, videoCapabilities.a());
        b.a(parcel, a);
    }

    public VideoCapabilities a(Parcel parcel) {
        boolean[] zArr = null;
        boolean z = false;
        int b = a.b(parcel);
        boolean[] zArr2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    z3 = a.c(parcel, a);
                    break;
                case 2:
                    z2 = a.c(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    zArr2 = a.v(parcel, a);
                    break;
                case 5:
                    zArr = a.v(parcel, a);
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
            return new VideoCapabilities(i, z3, z2, z, zArr2, zArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public VideoCapabilities[] a(int i) {
        return new VideoCapabilities[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
