package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class v implements Creator<PlacePhotoResult> {
    static void a(PlacePhotoResult placePhotoResult, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placePhotoResult.a(), i, false);
        b.a(parcel, 2, placePhotoResult.b, i, false);
        b.a(parcel, 1000, placePhotoResult.a);
        b.a(parcel, a);
    }

    public PlacePhotoResult a(Parcel parcel) {
        BitmapTeleporter bitmapTeleporter = null;
        int b = a.b(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < b) {
            int i2;
            BitmapTeleporter bitmapTeleporter2;
            Status status2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    Status status3 = (Status) a.a(parcel, a, Status.CREATOR);
                    bitmapTeleporter2 = bitmapTeleporter;
                    status2 = status3;
                    break;
                case 2:
                    bitmapTeleporter2 = (BitmapTeleporter) a.a(parcel, a, BitmapTeleporter.CREATOR);
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    BitmapTeleporter bitmapTeleporter3 = bitmapTeleporter;
                    status2 = status;
                    i2 = a.g(parcel, a);
                    bitmapTeleporter2 = bitmapTeleporter3;
                    break;
                default:
                    a.b(parcel, a);
                    bitmapTeleporter2 = bitmapTeleporter;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            bitmapTeleporter = bitmapTeleporter2;
        }
        if (parcel.dataPosition() == b) {
            return new PlacePhotoResult(i, status, bitmapTeleporter);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlacePhotoResult[] a(int i) {
        return new PlacePhotoResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
