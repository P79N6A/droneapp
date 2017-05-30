package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class u implements Creator<PlacePhotoMetadataResult> {
    static void a(PlacePhotoMetadataResult placePhotoMetadataResult, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placePhotoMetadataResult.a(), i, false);
        b.a(parcel, 2, placePhotoMetadataResult.b, i, false);
        b.a(parcel, 1000, placePhotoMetadataResult.a);
        b.a(parcel, a);
    }

    public PlacePhotoMetadataResult a(Parcel parcel) {
        DataHolder dataHolder = null;
        int b = a.b(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < b) {
            int i2;
            DataHolder dataHolder2;
            Status status2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    Status status3 = (Status) a.a(parcel, a, Status.CREATOR);
                    dataHolder2 = dataHolder;
                    status2 = status3;
                    break;
                case 2:
                    dataHolder2 = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    DataHolder dataHolder3 = dataHolder;
                    status2 = status;
                    i2 = a.g(parcel, a);
                    dataHolder2 = dataHolder3;
                    break;
                default:
                    a.b(parcel, a);
                    dataHolder2 = dataHolder;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            dataHolder = dataHolder2;
        }
        if (parcel.dataPosition() == b) {
            return new PlacePhotoMetadataResult(i, status, dataHolder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlacePhotoMetadataResult[] a(int i) {
        return new PlacePhotoMetadataResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
