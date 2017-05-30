package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class s implements Creator<MapStyleOptions> {
    static void a(MapStyleOptions mapStyleOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, mapStyleOptions.a());
        b.a(parcel, 2, mapStyleOptions.b(), false);
        b.a(parcel, a);
    }

    public MapStyleOptions a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MapStyleOptions(i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MapStyleOptions[] a(int i) {
        return new MapStyleOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
