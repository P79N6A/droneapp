package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<GetAccountInfoUser> {
    static void a(GetAccountInfoUser getAccountInfoUser, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, getAccountInfoUser.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, getAccountInfoUser.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, getAccountInfoUser.a(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, getAccountInfoUser.b());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, getAccountInfoUser.d(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, getAccountInfoUser.e(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, getAccountInfoUser.i(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, getAccountInfoUser.g(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public GetAccountInfoUser a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        ProviderUserInfoList providerUserInfoList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str5 = a.q(parcel, a);
                    break;
                case 3:
                    str4 = a.q(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    str3 = a.q(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    providerUserInfoList = (ProviderUserInfoList) a.a(parcel, a, ProviderUserInfoList.CREATOR);
                    break;
                case 8:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetAccountInfoUser(i, str5, str4, z, str3, str2, providerUserInfoList, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetAccountInfoUser[] a(int i) {
        return new GetAccountInfoUser[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
