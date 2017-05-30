package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<BitmapTeleporter> {
    static void a(BitmapTeleporter bitmapTeleporter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, bitmapTeleporter.a);
        b.a(parcel, 2, bitmapTeleporter.b, i, false);
        b.a(parcel, 3, bitmapTeleporter.c);
        b.a(parcel, a);
    }

    public BitmapTeleporter a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            ParcelFileDescriptor parcelFileDescriptor2;
            int g;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    int i3 = i;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    g = a.g(parcel, a);
                    a = i3;
                    break;
                case 2:
                    g = i2;
                    ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) a.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    a = i;
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
                case 3:
                    a = a.g(parcel, a);
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    g = i2;
                    break;
                default:
                    a.b(parcel, a);
                    a = i;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    g = i2;
                    break;
            }
            i2 = g;
            parcelFileDescriptor = parcelFileDescriptor2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new BitmapTeleporter(i2, parcelFileDescriptor, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public BitmapTeleporter[] a(int i) {
        return new BitmapTeleporter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
