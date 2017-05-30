package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k implements Creator<NativeAdOptionsParcel> {
    static void a(NativeAdOptionsParcel nativeAdOptionsParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, nativeAdOptionsParcel.a);
        b.a(parcel, 2, nativeAdOptionsParcel.b);
        b.a(parcel, 3, nativeAdOptionsParcel.c);
        b.a(parcel, 4, nativeAdOptionsParcel.d);
        b.a(parcel, 5, nativeAdOptionsParcel.e);
        b.a(parcel, 6, nativeAdOptionsParcel.f, i, false);
        b.a(parcel, a);
    }

    public NativeAdOptionsParcel a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        VideoOptionsParcel videoOptionsParcel = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    z2 = a.c(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                case 6:
                    videoOptionsParcel = (VideoOptionsParcel) a.a(parcel, a, VideoOptionsParcel.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NativeAdOptionsParcel(i3, z2, i2, z, i, videoOptionsParcel);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NativeAdOptionsParcel[] a(int i) {
        return new NativeAdOptionsParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
