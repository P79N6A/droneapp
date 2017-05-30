package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<DataItemParcelable> {
    static void a(DataItemParcelable dataItemParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, dataItemParcelable.a);
        b.a(parcel, 2, dataItemParcelable.c(), i, false);
        b.a(parcel, 4, dataItemParcelable.g(), false);
        b.a(parcel, 5, dataItemParcelable.d(), false);
        b.a(parcel, a);
    }

    public DataItemParcelable a(Parcel parcel) {
        byte[] bArr = null;
        int b = a.b(parcel);
        int i = 0;
        Bundle bundle = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            Bundle bundle2;
            Uri uri2;
            int g;
            byte[] bArr2;
            int a = a.a(parcel);
            byte[] bArr3;
            switch (a.a(a)) {
                case 1:
                    bArr3 = bArr;
                    bundle2 = bundle;
                    uri2 = uri;
                    g = a.g(parcel, a);
                    bArr2 = bArr3;
                    break;
                case 2:
                    g = i;
                    Bundle bundle3 = bundle;
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    bArr2 = bArr;
                    bundle2 = bundle3;
                    break;
                case 4:
                    uri2 = uri;
                    g = i;
                    bArr3 = bArr;
                    bundle2 = a.s(parcel, a);
                    bArr2 = bArr3;
                    break;
                case 5:
                    bArr2 = a.t(parcel, a);
                    bundle2 = bundle;
                    uri2 = uri;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    bArr2 = bArr;
                    bundle2 = bundle;
                    uri2 = uri;
                    g = i;
                    break;
            }
            i = g;
            uri = uri2;
            bundle = bundle2;
            bArr = bArr2;
        }
        if (parcel.dataPosition() == b) {
            return new DataItemParcelable(i, uri, bundle, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DataItemParcelable[] a(int i) {
        return new DataItemParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
