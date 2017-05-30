package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<VideoEntity> {
    static void a(VideoEntity videoEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, videoEntity.c());
        b.a(parcel, 2, videoEntity.d(), false);
        b.a(parcel, 3, videoEntity.e());
        b.a(parcel, 4, videoEntity.f());
        b.a(parcel, 5, videoEntity.g(), false);
        b.a(parcel, 1000, videoEntity.h());
        b.a(parcel, a);
    }

    public VideoEntity a(Parcel parcel) {
        long j = 0;
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        long j2 = 0;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    j2 = a.i(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VideoEntity(i2, i, str2, j2, j, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public VideoEntity[] a(int i) {
        return new VideoEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
