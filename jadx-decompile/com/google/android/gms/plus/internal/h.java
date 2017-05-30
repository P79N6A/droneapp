package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<PlusSession> {
    static void a(PlusSession plusSession, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, plusSession.b(), false);
        b.a(parcel, 2, plusSession.c(), false);
        b.a(parcel, 3, plusSession.d(), false);
        b.a(parcel, 4, plusSession.e(), false);
        b.a(parcel, 5, plusSession.f(), false);
        b.a(parcel, 6, plusSession.g(), false);
        b.a(parcel, 7, plusSession.h(), false);
        b.a(parcel, 1000, plusSession.a());
        b.a(parcel, 8, plusSession.i(), false);
        b.a(parcel, 9, plusSession.j(), i, false);
        b.a(parcel, a);
    }

    public PlusSession a(Parcel parcel) {
        PlusCommonExtras plusCommonExtras = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str5 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str5 = a.q(parcel, a);
                    break;
                case 2:
                    strArr3 = a.C(parcel, a);
                    break;
                case 3:
                    strArr2 = a.C(parcel, a);
                    break;
                case 4:
                    strArr = a.C(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    break;
                case 7:
                    str2 = a.q(parcel, a);
                    break;
                case 8:
                    str = a.q(parcel, a);
                    break;
                case 9:
                    plusCommonExtras = (PlusCommonExtras) a.a(parcel, a, PlusCommonExtras.CREATOR);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlusSession(i, str5, strArr3, strArr2, strArr, str4, str3, str2, str, plusCommonExtras);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlusSession[] a(int i) {
        return new PlusSession[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
