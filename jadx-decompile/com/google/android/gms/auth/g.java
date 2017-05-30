package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<AccountChangeEventsRequest> {
    static void a(AccountChangeEventsRequest accountChangeEventsRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, accountChangeEventsRequest.a);
        b.a(parcel, 2, accountChangeEventsRequest.b);
        b.a(parcel, 3, accountChangeEventsRequest.c, false);
        b.a(parcel, 4, accountChangeEventsRequest.d, i, false);
        b.a(parcel, a);
    }

    public AccountChangeEventsRequest a(Parcel parcel) {
        Account account = null;
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    account = (Account) a.a(parcel, a, Account.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsRequest(i2, i, str, account);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AccountChangeEventsRequest[] a(int i) {
        return new AccountChangeEventsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
