package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class k implements Creator<TokenData> {
    static void a(TokenData tokenData, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, tokenData.a);
        b.a(parcel, 2, tokenData.a(), false);
        b.a(parcel, 3, tokenData.b(), false);
        b.a(parcel, 4, tokenData.c());
        b.a(parcel, 5, tokenData.d());
        b.b(parcel, 6, tokenData.e(), false);
        b.a(parcel, a);
    }

    public TokenData a(Parcel parcel) {
        List list = null;
        boolean z = false;
        int b = a.b(parcel);
        boolean z2 = false;
        Long l = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    l = a.j(parcel, a);
                    break;
                case 4:
                    z2 = a.c(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                case 6:
                    list = a.E(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TokenData(i, str, l, z2, z, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TokenData[] a(int i) {
        return new TokenData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
