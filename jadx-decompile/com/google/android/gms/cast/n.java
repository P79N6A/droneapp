package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class n implements Creator<MediaMetadata> {
    static void a(MediaMetadata mediaMetadata, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, mediaMetadata.a());
        b.c(parcel, 2, mediaMetadata.f(), false);
        b.a(parcel, 3, mediaMetadata.g, false);
        b.a(parcel, 4, mediaMetadata.b());
        b.a(parcel, a);
    }

    public MediaMetadata a(Parcel parcel) {
        Bundle bundle = null;
        int i = 0;
        int b = a.b(parcel);
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    list = a.c(parcel, a, WebImage.CREATOR);
                    break;
                case 3:
                    bundle = a.s(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MediaMetadata(i2, list, bundle, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MediaMetadata[] a(int i) {
        return new MediaMetadata[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
