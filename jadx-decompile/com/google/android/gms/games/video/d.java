package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<VideoConfiguration> {
    static void a(VideoConfiguration videoConfiguration, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, videoConfiguration.b());
        b.a(parcel, 2, videoConfiguration.c());
        b.a(parcel, 3, videoConfiguration.e(), false);
        b.a(parcel, 4, videoConfiguration.d(), false);
        b.a(parcel, 5, videoConfiguration.f(), false);
        b.a(parcel, 6, videoConfiguration.g(), false);
        b.a(parcel, 7, videoConfiguration.h());
        b.a(parcel, 1000, videoConfiguration.a());
        b.a(parcel, a);
    }

    public VideoConfiguration a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    str4 = a.q(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 7:
                    z = a.c(parcel, a);
                    break;
                case 1000:
                    i3 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VideoConfiguration(i3, i2, i, str4, str3, str2, str, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public VideoConfiguration[] a(int i) {
        return new VideoConfiguration[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
