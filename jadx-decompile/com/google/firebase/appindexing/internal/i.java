package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.firebase.appindexing.internal.ActionImpl.MetadataImpl;

public class i implements Creator<MetadataImpl> {
    static void a(MetadataImpl metadataImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, metadataImpl.a());
        b.a(parcel, 2, metadataImpl.b());
        b.a(parcel, 3, metadataImpl.c(), false);
        b.a(parcel, 4, metadataImpl.d(), false);
        b.a(parcel, 5, metadataImpl.e(), false);
        b.a(parcel, 6, metadataImpl.f());
        b.a(parcel, 1000, metadataImpl.a);
        b.a(parcel, a);
    }

    public MetadataImpl a(Parcel parcel) {
        byte[] bArr = null;
        boolean z = false;
        int b = a.b(parcel);
        String str = null;
        String str2 = null;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    z2 = a.c(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    bArr = a.t(parcel, a);
                    break;
                case 6:
                    z = a.c(parcel, a);
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
            return new MetadataImpl(i2, i, z2, str2, str, bArr, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MetadataImpl[] a(int i) {
        return new MetadataImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
