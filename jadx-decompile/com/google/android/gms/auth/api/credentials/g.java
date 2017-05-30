package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<HintRequest> {
    static void a(HintRequest hintRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, hintRequest.a(), i, false);
        b.a(parcel, 2, hintRequest.b());
        b.a(parcel, 3, hintRequest.c());
        b.a(parcel, 4, hintRequest.d(), false);
        b.a(parcel, 1000, hintRequest.a);
        b.a(parcel, a);
    }

    public HintRequest a(Parcel parcel) {
        String[] strArr = null;
        boolean z = false;
        int b = a.b(parcel);
        boolean z2 = false;
        CredentialPickerConfig credentialPickerConfig = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    credentialPickerConfig = (CredentialPickerConfig) a.a(parcel, a, CredentialPickerConfig.CREATOR);
                    break;
                case 2:
                    z2 = a.c(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    strArr = a.C(parcel, a);
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
            return new HintRequest(i, credentialPickerConfig, z2, z, strArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public HintRequest[] a(int i) {
        return new HintRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
