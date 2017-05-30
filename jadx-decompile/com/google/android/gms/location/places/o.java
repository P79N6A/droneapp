package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class o implements Creator<AddPlaceRequest> {
    static void a(AddPlaceRequest addPlaceRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, addPlaceRequest.a(), false);
        b.a(parcel, 2, addPlaceRequest.b(), i, false);
        b.a(parcel, 3, addPlaceRequest.c(), false);
        b.a(parcel, 4, addPlaceRequest.d(), false);
        b.a(parcel, 5, addPlaceRequest.e(), false);
        b.a(parcel, 6, addPlaceRequest.f(), i, false);
        b.a(parcel, 1000, addPlaceRequest.a);
        b.a(parcel, a);
    }

    public AddPlaceRequest a(Parcel parcel) {
        Uri uri = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        LatLng latLng = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str3 = a.q(parcel, a);
                    break;
                case 2:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    list = a.D(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AddPlaceRequest(i, str3, latLng, str2, list, str, uri);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AddPlaceRequest[] a(int i) {
        return new AddPlaceRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
