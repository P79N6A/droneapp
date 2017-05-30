package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<BoundingBoxParcel> {
    static void a(BoundingBoxParcel boundingBoxParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, boundingBoxParcel.a);
        b.a(parcel, 2, boundingBoxParcel.b);
        b.a(parcel, 3, boundingBoxParcel.c);
        b.a(parcel, 4, boundingBoxParcel.d);
        b.a(parcel, 5, boundingBoxParcel.e);
        b.a(parcel, 6, boundingBoxParcel.f);
        b.a(parcel, a);
    }

    public BoundingBoxParcel a(Parcel parcel) {
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    i4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 3:
                    i3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 4:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 5:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 6:
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new BoundingBoxParcel(i5, i4, i3, i2, i, f);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public BoundingBoxParcel[] a(int i) {
        return new BoundingBoxParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
