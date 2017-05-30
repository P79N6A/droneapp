package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<ProviderUserInfo> {
    static void a(ProviderUserInfo providerUserInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, providerUserInfo.a);
        b.a(parcel, 2, providerUserInfo.a(), false);
        b.a(parcel, 3, providerUserInfo.b(), false);
        b.a(parcel, 4, providerUserInfo.c(), false);
        b.a(parcel, 5, providerUserInfo.e(), false);
        b.a(parcel, a);
    }

    public ProviderUserInfo a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str4 = a.q(parcel, a);
                    break;
                case 3:
                    str3 = a.q(parcel, a);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ProviderUserInfo(i, str4, str3, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ProviderUserInfo[] a(int i) {
        return new ProviderUserInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
