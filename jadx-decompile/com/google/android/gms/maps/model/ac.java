package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ac implements Creator<TileOverlayOptions> {
    static void a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, tileOverlayOptions.a());
        b.a(parcel, 2, tileOverlayOptions.b(), false);
        b.a(parcel, 3, tileOverlayOptions.e());
        b.a(parcel, 4, tileOverlayOptions.d());
        b.a(parcel, 5, tileOverlayOptions.f());
        b.a(parcel, 6, tileOverlayOptions.g());
        b.a(parcel, a);
    }

    public TileOverlayOptions a(Parcel parcel) {
        boolean z = false;
        float f = 0.0f;
        int b = a.b(parcel);
        IBinder iBinder = null;
        boolean z2 = true;
        float f2 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    f2 = a.l(parcel, a);
                    break;
                case 5:
                    z2 = a.c(parcel, a);
                    break;
                case 6:
                    f = a.l(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TileOverlayOptions(i, iBinder, z, f2, z2, f);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TileOverlayOptions[] a(int i) {
        return new TileOverlayOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
