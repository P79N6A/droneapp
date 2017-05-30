package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q implements Creator<MediaTrack> {
    static void a(MediaTrack mediaTrack, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, mediaTrack.a());
        b.a(parcel, 2, mediaTrack.b());
        b.a(parcel, 3, mediaTrack.c());
        b.a(parcel, 4, mediaTrack.d(), false);
        b.a(parcel, 5, mediaTrack.e(), false);
        b.a(parcel, 6, mediaTrack.f(), false);
        b.a(parcel, 7, mediaTrack.g(), false);
        b.a(parcel, 8, mediaTrack.h());
        b.a(parcel, 9, mediaTrack.l, false);
        b.a(parcel, a);
    }

    public MediaTrack a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        long j = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    str5 = a.q(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    break;
                case 7:
                    str2 = a.q(parcel, a);
                    break;
                case 8:
                    i = a.g(parcel, a);
                    break;
                case 9:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MediaTrack(i3, j, i2, str5, str4, str3, str2, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MediaTrack[] a(int i) {
        return new MediaTrack[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
