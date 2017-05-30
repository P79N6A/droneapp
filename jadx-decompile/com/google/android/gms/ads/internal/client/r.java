package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r implements Creator<VideoOptionsParcel> {
    static void a(VideoOptionsParcel videoOptionsParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, videoOptionsParcel.a);
        b.a(parcel, 2, videoOptionsParcel.b);
        b.a(parcel, a);
    }

    public VideoOptionsParcel a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
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
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VideoOptionsParcel(i, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public VideoOptionsParcel[] a(int i) {
        return new VideoOptionsParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
