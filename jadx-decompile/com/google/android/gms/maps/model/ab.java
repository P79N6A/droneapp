package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ab implements Creator<Tile> {
    static void a(Tile tile, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, tile.a());
        b.a(parcel, 2, tile.a);
        b.a(parcel, 3, tile.b);
        b.a(parcel, 4, tile.c, false);
        b.a(parcel, a);
    }

    public Tile a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    bArr = a.t(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Tile(i3, i2, i, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Tile[] a(int i) {
        return new Tile[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
