package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class x implements Creator<Asset> {
    static void a(Asset asset, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, asset.a);
        b.a(parcel, 2, asset.a(), false);
        b.a(parcel, 3, asset.b(), false);
        b.a(parcel, 4, asset.b, i, false);
        b.a(parcel, 5, asset.c, i, false);
        b.a(parcel, a);
    }

    public Asset a(Parcel parcel) {
        Uri uri = null;
        int b = a.b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bArr = a.t(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) a.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Asset(i, bArr, str, parcelFileDescriptor, uri);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Asset[] a(int i) {
        return new Asset[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
