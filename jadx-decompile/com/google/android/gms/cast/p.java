package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class p implements Creator<MediaStatus> {
    static void a(MediaStatus mediaStatus, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, mediaStatus.a());
        b.a(parcel, 2, mediaStatus.f(), i, false);
        b.a(parcel, 3, mediaStatus.b());
        b.a(parcel, 4, mediaStatus.l());
        b.a(parcel, 5, mediaStatus.e());
        b.a(parcel, 6, mediaStatus.c());
        b.a(parcel, 7, mediaStatus.d());
        b.a(parcel, 8, mediaStatus.g());
        b.a(parcel, 9, mediaStatus.u);
        b.a(parcel, 10, mediaStatus.h());
        b.a(parcel, 11, mediaStatus.i());
        b.a(parcel, 12, mediaStatus.j(), false);
        b.a(parcel, 13, mediaStatus.m());
        b.a(parcel, 14, mediaStatus.n());
        b.a(parcel, 15, mediaStatus.v, false);
        b.a(parcel, 16, mediaStatus.w);
        b.c(parcel, 17, mediaStatus.x, false);
        b.a(parcel, 18, mediaStatus.r());
        b.a(parcel, a);
    }

    public MediaStatus a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        MediaInfo mediaInfo = null;
        long j = 0;
        int i2 = 0;
        double d = 0.0d;
        int i3 = 0;
        int i4 = 0;
        long j2 = 0;
        long j3 = 0;
        double d2 = 0.0d;
        boolean z = false;
        long[] jArr = null;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        int i7 = 0;
        List list = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    mediaInfo = (MediaInfo) a.a(parcel, a, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    d = a.n(parcel, a);
                    break;
                case 6:
                    i3 = a.g(parcel, a);
                    break;
                case 7:
                    i4 = a.g(parcel, a);
                    break;
                case 8:
                    j2 = a.i(parcel, a);
                    break;
                case 9:
                    j3 = a.i(parcel, a);
                    break;
                case 10:
                    d2 = a.n(parcel, a);
                    break;
                case 11:
                    z = a.c(parcel, a);
                    break;
                case 12:
                    jArr = a.x(parcel, a);
                    break;
                case 13:
                    i5 = a.g(parcel, a);
                    break;
                case 14:
                    i6 = a.g(parcel, a);
                    break;
                case 15:
                    str = a.q(parcel, a);
                    break;
                case 16:
                    i7 = a.g(parcel, a);
                    break;
                case 17:
                    list = a.c(parcel, a, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MediaStatus(i, mediaInfo, j, i2, d, i3, i4, j2, j3, d2, z, jArr, i5, i6, str, i7, list, z2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MediaStatus[] a(int i) {
        return new MediaStatus[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
