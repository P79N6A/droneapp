package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k implements Creator<UserAttributeParcel> {
    static void a(UserAttributeParcel userAttributeParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, userAttributeParcel.a);
        b.a(parcel, 2, userAttributeParcel.b, false);
        b.a(parcel, 3, userAttributeParcel.c);
        b.a(parcel, 4, userAttributeParcel.d, false);
        b.a(parcel, 5, userAttributeParcel.e, false);
        b.a(parcel, 6, userAttributeParcel.f, false);
        b.a(parcel, 7, userAttributeParcel.g, false);
        b.a(parcel, 8, userAttributeParcel.h, false);
        b.a(parcel, a);
    }

    public UserAttributeParcel a(Parcel parcel) {
        Double d = null;
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        Float f = null;
        Long l = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str3 = a.q(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    l = a.j(parcel, a);
                    break;
                case 5:
                    f = a.m(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                case 8:
                    d = a.o(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UserAttributeParcel(i, str3, j, l, f, str2, str, d);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UserAttributeParcel[] a(int i) {
        return new UserAttributeParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
