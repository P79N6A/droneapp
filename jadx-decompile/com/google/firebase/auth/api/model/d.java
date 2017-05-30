package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<GetTokenResponse> {
    static void a(GetTokenResponse getTokenResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getTokenResponse.a);
        b.a(parcel, 2, getTokenResponse.b(), false);
        b.a(parcel, 3, getTokenResponse.c(), false);
        b.a(parcel, 4, Long.valueOf(getTokenResponse.d()), false);
        b.a(parcel, 5, getTokenResponse.e(), false);
        b.a(parcel, 6, Long.valueOf(getTokenResponse.f()), false);
        b.a(parcel, a);
    }

    public GetTokenResponse a(Parcel parcel) {
        Long l = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        Long l2 = null;
        String str2 = null;
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
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    l2 = a.j(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    l = a.j(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetTokenResponse(i, str3, str2, l2, str, l);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetTokenResponse[] a(int i) {
        return new GetTokenResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
