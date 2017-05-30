package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n implements Creator<CameraPosition> {
    static void a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, cameraPosition.a());
        b.a(parcel, 2, cameraPosition.a, i, false);
        b.a(parcel, 3, cameraPosition.b);
        b.a(parcel, 4, cameraPosition.c);
        b.a(parcel, 5, cameraPosition.d);
        b.a(parcel, a);
    }

    public CameraPosition a(Parcel parcel) {
        float f = 0.0f;
        int b = a.b(parcel);
        int i = 0;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    f3 = a.l(parcel, a);
                    break;
                case 4:
                    f2 = a.l(parcel, a);
                    break;
                case 5:
                    f = a.l(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CameraPosition(i, latLng, f3, f2, f);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CameraPosition[] a(int i) {
        return new CameraPosition[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
