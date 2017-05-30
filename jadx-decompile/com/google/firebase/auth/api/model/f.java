package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class f implements Creator<ProviderUserInfoList> {
    static void a(ProviderUserInfoList providerUserInfoList, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, providerUserInfoList.a);
        b.c(parcel, 2, providerUserInfoList.a(), false);
        b.a(parcel, a);
    }

    public ProviderUserInfoList a(Parcel parcel) {
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
                    list = a.c(parcel, a, ProviderUserInfo.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ProviderUserInfoList(i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ProviderUserInfoList[] a(int i) {
        return new ProviderUserInfoList[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
