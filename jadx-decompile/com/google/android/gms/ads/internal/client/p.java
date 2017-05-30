package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class p implements Creator<SearchAdRequestParcel> {
    static void a(SearchAdRequestParcel searchAdRequestParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, searchAdRequestParcel.a);
        b.a(parcel, 2, searchAdRequestParcel.b);
        b.a(parcel, 3, searchAdRequestParcel.c);
        b.a(parcel, 4, searchAdRequestParcel.d);
        b.a(parcel, 5, searchAdRequestParcel.e);
        b.a(parcel, 6, searchAdRequestParcel.f);
        b.a(parcel, 7, searchAdRequestParcel.g);
        b.a(parcel, 8, searchAdRequestParcel.h);
        b.a(parcel, 9, searchAdRequestParcel.i);
        b.a(parcel, 10, searchAdRequestParcel.j, false);
        b.a(parcel, 11, searchAdRequestParcel.k);
        b.a(parcel, 12, searchAdRequestParcel.l, false);
        b.a(parcel, 13, searchAdRequestParcel.m);
        b.a(parcel, 14, searchAdRequestParcel.n);
        b.a(parcel, 15, searchAdRequestParcel.o, false);
        b.a(parcel, a);
    }

    public SearchAdRequestParcel a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    i3 = a.g(parcel, a);
                    break;
                case 4:
                    i4 = a.g(parcel, a);
                    break;
                case 5:
                    i5 = a.g(parcel, a);
                    break;
                case 6:
                    i6 = a.g(parcel, a);
                    break;
                case 7:
                    i7 = a.g(parcel, a);
                    break;
                case 8:
                    i8 = a.g(parcel, a);
                    break;
                case 9:
                    i9 = a.g(parcel, a);
                    break;
                case 10:
                    str = a.q(parcel, a);
                    break;
                case 11:
                    i10 = a.g(parcel, a);
                    break;
                case 12:
                    str2 = a.q(parcel, a);
                    break;
                case 13:
                    i11 = a.g(parcel, a);
                    break;
                case 14:
                    i12 = a.g(parcel, a);
                    break;
                case 15:
                    str3 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SearchAdRequestParcel(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SearchAdRequestParcel[] a(int i) {
        return new SearchAdRequestParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
