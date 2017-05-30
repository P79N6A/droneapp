package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class an implements Creator<StorageInfoResponse> {
    static void a(StorageInfoResponse storageInfoResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, storageInfoResponse.a);
        b.a(parcel, 2, storageInfoResponse.b);
        b.a(parcel, 3, storageInfoResponse.c);
        b.c(parcel, 4, storageInfoResponse.d, false);
        b.a(parcel, a);
    }

    public StorageInfoResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        long j = 0;
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    list = a.c(parcel, a, PackageStorageInfo.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StorageInfoResponse(i2, i, j, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StorageInfoResponse[] a(int i) {
        return new StorageInfoResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
