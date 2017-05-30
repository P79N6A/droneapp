package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public class l implements Creator<PlaceEntity> {
    static void a(PlaceEntity placeEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placeEntity.c(), false);
        b.a(parcel, 2, placeEntity.x(), false);
        b.a(parcel, 3, placeEntity.z(), i, false);
        b.a(parcel, 4, placeEntity.h(), i, false);
        b.a(parcel, 5, placeEntity.r());
        b.a(parcel, 6, placeEntity.i(), i, false);
        b.a(parcel, 7, placeEntity.y(), false);
        b.a(parcel, 1000, placeEntity.bx);
        b.a(parcel, 8, placeEntity.j(), i, false);
        b.a(parcel, 9, placeEntity.v());
        b.a(parcel, 10, placeEntity.l());
        b.a(parcel, 11, placeEntity.m());
        b.a(parcel, 12, placeEntity.w());
        b.a(parcel, 13, placeEntity.o(), false);
        b.a(parcel, 14, (String) placeEntity.e(), false);
        b.a(parcel, 15, (String) placeEntity.k(), false);
        b.a(parcel, 16, placeEntity.t(), false);
        b.b(parcel, 17, placeEntity.u(), false);
        b.a(parcel, 19, (String) placeEntity.g(), false);
        b.a(parcel, 20, placeEntity.d(), false);
        b.a(parcel, a);
    }

    public PlaceEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list3 = null;
        LatLng latLng = null;
        float f = 0.0f;
        LatLngBounds latLngBounds = null;
        String str6 = null;
        Uri uri = null;
        boolean z = false;
        float f2 = 0.0f;
        int i2 = 0;
        long j = 0;
        PlaceLocalization placeLocalization = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    bundle = a.s(parcel, a);
                    break;
                case 3:
                    placeLocalization = (PlaceLocalization) a.a(parcel, a, PlaceLocalization.CREATOR);
                    break;
                case 4:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    f = a.l(parcel, a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) a.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str6 = a.q(parcel, a);
                    break;
                case 8:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 9:
                    z = a.c(parcel, a);
                    break;
                case 10:
                    f2 = a.l(parcel, a);
                    break;
                case 11:
                    i2 = a.g(parcel, a);
                    break;
                case 12:
                    j = a.i(parcel, a);
                    break;
                case 13:
                    list2 = a.D(parcel, a);
                    break;
                case 14:
                    str3 = a.q(parcel, a);
                    break;
                case 15:
                    str4 = a.q(parcel, a);
                    break;
                case 16:
                    str5 = a.q(parcel, a);
                    break;
                case 17:
                    list3 = a.E(parcel, a);
                    break;
                case 19:
                    str2 = a.q(parcel, a);
                    break;
                case 20:
                    list = a.D(parcel, a);
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
            return new PlaceEntity(i, str, list, list2, bundle, str2, str3, str4, str5, list3, latLng, f, latLngBounds, str6, uri, z, f2, i2, j, placeLocalization);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlaceEntity[] a(int i) {
        return new PlaceEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
