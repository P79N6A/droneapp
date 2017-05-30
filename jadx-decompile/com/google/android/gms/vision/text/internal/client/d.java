package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<LineBoxParcel> {
    static void a(LineBoxParcel lineBoxParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, lineBoxParcel.a);
        b.a(parcel, 2, lineBoxParcel.b, i, false);
        b.a(parcel, 3, lineBoxParcel.c, i, false);
        b.a(parcel, 4, lineBoxParcel.d, i, false);
        b.a(parcel, 5, lineBoxParcel.e, i, false);
        b.a(parcel, 6, lineBoxParcel.f, false);
        b.a(parcel, 7, lineBoxParcel.g);
        b.a(parcel, 8, lineBoxParcel.h, false);
        b.a(parcel, 9, lineBoxParcel.i);
        b.a(parcel, 10, lineBoxParcel.j);
        b.a(parcel, 11, lineBoxParcel.k);
        b.a(parcel, 12, lineBoxParcel.l);
        b.a(parcel, a);
    }

    public LineBoxParcel a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        WordBoxParcel[] wordBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        BoundingBoxParcel boundingBoxParcel3 = null;
        String str = null;
        float f = 0.0f;
        String str2 = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    wordBoxParcelArr = (WordBoxParcel[]) a.b(parcel, a, WordBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) a.a(parcel, a, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) a.a(parcel, a, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    boundingBoxParcel3 = (BoundingBoxParcel) a.a(parcel, a, BoundingBoxParcel.CREATOR);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 7:
                    f = a.l(parcel, a);
                    break;
                case 8:
                    str2 = a.q(parcel, a);
                    break;
                case 9:
                    i2 = a.g(parcel, a);
                    break;
                case 10:
                    z = a.c(parcel, a);
                    break;
                case 11:
                    i3 = a.g(parcel, a);
                    break;
                case 12:
                    i4 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LineBoxParcel(i, wordBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, boundingBoxParcel3, str, f, str2, i2, z, i3, i4);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LineBoxParcel[] a(int i) {
        return new LineBoxParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
