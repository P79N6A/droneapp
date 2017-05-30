package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<WordBoxParcel> {
    static void a(WordBoxParcel wordBoxParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, wordBoxParcel.a);
        b.a(parcel, 2, wordBoxParcel.b, i, false);
        b.a(parcel, 3, wordBoxParcel.c, i, false);
        b.a(parcel, 4, wordBoxParcel.d, i, false);
        b.a(parcel, 5, wordBoxParcel.e, false);
        b.a(parcel, 6, wordBoxParcel.f);
        b.a(parcel, 7, wordBoxParcel.g, false);
        b.a(parcel, 8, wordBoxParcel.h);
        b.a(parcel, a);
    }

    public WordBoxParcel a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        float f = 0.0f;
        String str2 = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        SymbolBoxParcel[] symbolBoxParcelArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    symbolBoxParcelArr = (SymbolBoxParcel[]) a.b(parcel, a, SymbolBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel2 = (BoundingBoxParcel) a.a(parcel, a, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel = (BoundingBoxParcel) a.a(parcel, a, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    break;
                case 6:
                    f = a.l(parcel, a);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WordBoxParcel(i, symbolBoxParcelArr, boundingBoxParcel2, boundingBoxParcel, str2, f, str, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WordBoxParcel[] a(int i) {
        return new WordBoxParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
