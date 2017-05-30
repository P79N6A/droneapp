package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Request;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<Request> {
    static void a(Request request, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, request.b, i, false);
        b.a(parcel, 2, request.c);
        b.a(parcel, 3, request.d);
        b.a(parcel, 4, request.e);
        b.a(parcel, 5, request.f, false);
        b.a(parcel, 1000, request.a);
        b.a(parcel, a);
    }

    public Request a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    account = (Account) a.a(parcel, a, Account.CREATOR);
                    break;
                case 2:
                    z3 = a.c(parcel, a);
                    break;
                case 3:
                    z2 = a.c(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
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
            return new Request(i, account, z3, z2, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Request[] a(int i) {
        return new Request[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
