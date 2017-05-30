package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class v implements Creator<GetServiceRequest> {
    static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getServiceRequest.a);
        b.a(parcel, 2, getServiceRequest.b);
        b.a(parcel, 3, getServiceRequest.c);
        b.a(parcel, 4, getServiceRequest.d, false);
        b.a(parcel, 5, getServiceRequest.e, false);
        b.a(parcel, 6, getServiceRequest.f, i, false);
        b.a(parcel, 7, getServiceRequest.g, false);
        b.a(parcel, 8, getServiceRequest.h, i, false);
        b.a(parcel, 9, getServiceRequest.i);
        b.a(parcel, a);
    }

    public GetServiceRequest a(Parcel parcel) {
        int i = 0;
        Account account = null;
        int b = a.b(parcel);
        long j = 0;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    iBinder = a.r(parcel, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) a.b(parcel, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = a.s(parcel, a);
                    break;
                case 8:
                    account = (Account) a.a(parcel, a, Account.CREATOR);
                    break;
                case 9:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetServiceRequest(i3, i2, i, str, iBinder, scopeArr, bundle, account, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetServiceRequest[] a(int i) {
        return new GetServiceRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
