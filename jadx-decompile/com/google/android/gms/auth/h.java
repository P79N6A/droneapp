package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class h implements Creator<AccountChangeEventsResponse> {
    static void a(AccountChangeEventsResponse accountChangeEventsResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, accountChangeEventsResponse.a);
        b.c(parcel, 2, accountChangeEventsResponse.b, false);
        b.a(parcel, a);
    }

    public AccountChangeEventsResponse a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    list = a.c(parcel, a, AccountChangeEvent.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsResponse(i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AccountChangeEventsResponse[] a(int i) {
        return new AccountChangeEventsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
