package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<CacheEntryParcel> {
    static void a(CacheEntryParcel cacheEntryParcel, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, cacheEntryParcel.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, cacheEntryParcel.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public CacheEntryParcel a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) a.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CacheEntryParcel(i, parcelFileDescriptor);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CacheEntryParcel[] a(int i) {
        return new CacheEntryParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
