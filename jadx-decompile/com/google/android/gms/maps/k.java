package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public class k implements Creator<GoogleMapOptions> {
    static void a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, googleMapOptions.a());
        b.a(parcel, 2, googleMapOptions.b());
        b.a(parcel, 3, googleMapOptions.c());
        b.a(parcel, 4, googleMapOptions.o());
        b.a(parcel, 5, googleMapOptions.p(), i, false);
        b.a(parcel, 6, googleMapOptions.d());
        b.a(parcel, 7, googleMapOptions.e());
        b.a(parcel, 8, googleMapOptions.f());
        b.a(parcel, 9, googleMapOptions.g());
        b.a(parcel, 10, googleMapOptions.h());
        b.a(parcel, 11, googleMapOptions.i());
        b.a(parcel, 12, googleMapOptions.j());
        b.a(parcel, 14, googleMapOptions.k());
        b.a(parcel, 15, googleMapOptions.l());
        b.a(parcel, 16, googleMapOptions.z(), false);
        b.a(parcel, 17, googleMapOptions.A(), false);
        b.a(parcel, 18, googleMapOptions.B(), i, false);
        b.a(parcel, a);
    }

    public GoogleMapOptions a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        byte b2 = (byte) -1;
        byte b3 = (byte) -1;
        int i2 = 0;
        CameraPosition cameraPosition = null;
        byte b4 = (byte) -1;
        byte b5 = (byte) -1;
        byte b6 = (byte) -1;
        byte b7 = (byte) -1;
        byte b8 = (byte) -1;
        byte b9 = (byte) -1;
        byte b10 = (byte) -1;
        byte b11 = (byte) -1;
        byte b12 = (byte) -1;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    b2 = a.e(parcel, a);
                    break;
                case 3:
                    b3 = a.e(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) a.a(parcel, a, CameraPosition.CREATOR);
                    break;
                case 6:
                    b4 = a.e(parcel, a);
                    break;
                case 7:
                    b5 = a.e(parcel, a);
                    break;
                case 8:
                    b6 = a.e(parcel, a);
                    break;
                case 9:
                    b7 = a.e(parcel, a);
                    break;
                case 10:
                    b8 = a.e(parcel, a);
                    break;
                case 11:
                    b9 = a.e(parcel, a);
                    break;
                case 12:
                    b10 = a.e(parcel, a);
                    break;
                case 14:
                    b11 = a.e(parcel, a);
                    break;
                case 15:
                    b12 = a.e(parcel, a);
                    break;
                case 16:
                    f = a.m(parcel, a);
                    break;
                case 17:
                    f2 = a.m(parcel, a);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) a.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleMapOptions(i, b2, b3, i2, cameraPosition, b4, b5, b6, b7, b8, b9, b10, b11, b12, f, f2, latLngBounds);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GoogleMapOptions[] a(int i) {
        return new GoogleMapOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
