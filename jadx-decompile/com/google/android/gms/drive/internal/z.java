package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class z implements Creator<OnFetchThumbnailResponse> {
    static void a(OnFetchThumbnailResponse onFetchThumbnailResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onFetchThumbnailResponse.a);
        b.a(parcel, 2, onFetchThumbnailResponse.b, i, false);
        b.a(parcel, a);
    }

    public OnFetchThumbnailResponse a(Parcel parcel) {
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
            return new OnFetchThumbnailResponse(i, parcelFileDescriptor);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnFetchThumbnailResponse[] a(int i) {
        return new OnFetchThumbnailResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
