package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<GeneratePasswordRequest> {
    static void a(GeneratePasswordRequest generatePasswordRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, generatePasswordRequest.a(), i, false);
        b.a(parcel, 1000, generatePasswordRequest.a);
        b.a(parcel, a);
    }

    public GeneratePasswordRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        PasswordSpecification passwordSpecification = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    passwordSpecification = (PasswordSpecification) a.a(parcel, a, PasswordSpecification.CREATOR);
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
            return new GeneratePasswordRequest(i, passwordSpecification);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GeneratePasswordRequest[] a(int i) {
        return new GeneratePasswordRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
