package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<CreateAuthUriResponse> {
    static void a(CreateAuthUriResponse createAuthUriResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, createAuthUriResponse.a);
        b.a(parcel, 2, createAuthUriResponse.a(), false);
        b.a(parcel, 3, createAuthUriResponse.b());
        b.a(parcel, 4, createAuthUriResponse.c(), false);
        b.a(parcel, 5, createAuthUriResponse.d());
        b.a(parcel, 6, createAuthUriResponse.e(), i, false);
        b.a(parcel, a);
    }

    public CreateAuthUriResponse a(Parcel parcel) {
        StringList stringList = null;
        boolean z = false;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        boolean z2 = false;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                case 4:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 5:
                    z = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                case 6:
                    stringList = (StringList) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, StringList.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CreateAuthUriResponse(i, str2, z2, str, z, stringList);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public CreateAuthUriResponse[] a(int i) {
        return new CreateAuthUriResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
