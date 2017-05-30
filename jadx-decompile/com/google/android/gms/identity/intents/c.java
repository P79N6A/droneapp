package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.List;

public class c implements Creator<UserAddressRequest> {
    static void a(UserAddressRequest userAddressRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, userAddressRequest.b());
        b.c(parcel, 2, userAddressRequest.a, false);
        b.a(parcel, a);
    }

    public UserAddressRequest a(Parcel parcel) {
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
                    list = a.c(parcel, a, CountrySpecification.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UserAddressRequest(i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UserAddressRequest[] a(int i) {
        return new UserAddressRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
