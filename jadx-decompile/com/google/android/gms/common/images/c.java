package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<WebImage> {
    static void a(WebImage webImage, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, webImage.a());
        b.a(parcel, 2, webImage.b(), i, false);
        b.a(parcel, 3, webImage.c());
        b.a(parcel, 4, webImage.d());
        b.a(parcel, a);
    }

    public WebImage a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            Uri uri2;
            int g;
            int a = a.a(parcel);
            int i4;
            switch (a.a(a)) {
                case 1:
                    i4 = i;
                    i = i2;
                    uri2 = uri;
                    g = a.g(parcel, a);
                    a = i4;
                    break;
                case 2:
                    g = i3;
                    i4 = i2;
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    a = i;
                    i = i4;
                    break;
                case 3:
                    uri2 = uri;
                    g = i3;
                    i4 = i;
                    i = a.g(parcel, a);
                    a = i4;
                    break;
                case 4:
                    a = a.g(parcel, a);
                    i = i2;
                    uri2 = uri;
                    g = i3;
                    break;
                default:
                    a.b(parcel, a);
                    a = i;
                    i = i2;
                    uri2 = uri;
                    g = i3;
                    break;
            }
            i3 = g;
            uri = uri2;
            i2 = i;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new WebImage(i3, uri, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WebImage[] a(int i) {
        return new WebImage[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
