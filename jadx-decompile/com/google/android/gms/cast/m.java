package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class m implements Creator<MediaInfo> {
    static void a(MediaInfo mediaInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, mediaInfo.a());
        b.a(parcel, 2, mediaInfo.b(), false);
        b.a(parcel, 3, mediaInfo.c());
        b.a(parcel, 4, mediaInfo.d(), false);
        b.a(parcel, 5, mediaInfo.e(), i, false);
        b.a(parcel, 6, mediaInfo.f());
        b.c(parcel, 7, mediaInfo.g(), false);
        b.a(parcel, 8, mediaInfo.h(), i, false);
        b.a(parcel, 9, mediaInfo.f, false);
        b.c(parcel, 10, mediaInfo.j(), false);
        b.a(parcel, a);
    }

    public MediaInfo a(Parcel parcel) {
        int i = 0;
        List list = null;
        int b = a.b(parcel);
        long j = 0;
        String str = null;
        TextTrackStyle textTrackStyle = null;
        List list2 = null;
        MediaMetadata mediaMetadata = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str3 = a.q(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    break;
                case 5:
                    mediaMetadata = (MediaMetadata) a.a(parcel, a, MediaMetadata.CREATOR);
                    break;
                case 6:
                    j = a.i(parcel, a);
                    break;
                case 7:
                    list2 = a.c(parcel, a, MediaTrack.CREATOR);
                    break;
                case 8:
                    textTrackStyle = (TextTrackStyle) a.a(parcel, a, TextTrackStyle.CREATOR);
                    break;
                case 9:
                    str = a.q(parcel, a);
                    break;
                case 10:
                    list = a.c(parcel, a, AdBreakInfo.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MediaInfo(i2, str3, i, str2, mediaMetadata, j, list2, textTrackStyle, str, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MediaInfo[] a(int i) {
        return new MediaInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
