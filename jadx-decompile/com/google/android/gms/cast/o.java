package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o implements Creator<MediaQueueItem> {
    static void a(MediaQueueItem mediaQueueItem, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, mediaQueueItem.a());
        b.a(parcel, 2, mediaQueueItem.b(), i, false);
        b.a(parcel, 3, mediaQueueItem.c());
        b.a(parcel, 4, mediaQueueItem.d());
        b.a(parcel, 5, mediaQueueItem.e());
        b.a(parcel, 6, mediaQueueItem.f());
        b.a(parcel, 7, mediaQueueItem.g());
        b.a(parcel, 8, mediaQueueItem.h(), false);
        b.a(parcel, 9, mediaQueueItem.c, false);
        b.a(parcel, a);
    }

    public MediaQueueItem a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        MediaInfo mediaInfo = null;
        int i2 = 0;
        boolean z = false;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        long[] jArr = null;
        String str = null;
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
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    d = a.n(parcel, a);
                    break;
                case 6:
                    d2 = a.n(parcel, a);
                    break;
                case 7:
                    d3 = a.n(parcel, a);
                    break;
                case 8:
                    jArr = a.x(parcel, a);
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
            return new MediaQueueItem(i, mediaInfo, i2, z, d, d2, d3, jArr, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MediaQueueItem[] a(int i) {
        return new MediaQueueItem[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
