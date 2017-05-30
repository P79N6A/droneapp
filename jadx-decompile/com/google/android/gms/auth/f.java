package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<AccountChangeEvent> {
    static void a(AccountChangeEvent accountChangeEvent, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, accountChangeEvent.a);
        b.a(parcel, 2, accountChangeEvent.b);
        b.a(parcel, 3, accountChangeEvent.c, false);
        b.a(parcel, 4, accountChangeEvent.d);
        b.a(parcel, 5, accountChangeEvent.e);
        b.a(parcel, 6, accountChangeEvent.f, false);
        b.a(parcel, a);
    }

    public AccountChangeEvent a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        long j = 0;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEvent(i3, j, str2, i2, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AccountChangeEvent[] a(int i) {
        return new AccountChangeEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
