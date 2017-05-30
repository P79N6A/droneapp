package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<CredentialRequest> {
    static void a(CredentialRequest credentialRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, credentialRequest.b());
        b.a(parcel, 2, credentialRequest.c(), false);
        b.a(parcel, 3, credentialRequest.d(), i, false);
        b.a(parcel, 4, credentialRequest.e(), i, false);
        b.a(parcel, 1000, credentialRequest.a);
        b.a(parcel, a);
    }

    public CredentialRequest a(Parcel parcel) {
        boolean z = false;
        CredentialPickerConfig credentialPickerConfig = null;
        int b = a.b(parcel);
        CredentialPickerConfig credentialPickerConfig2 = null;
        String[] strArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    z = a.c(parcel, a);
                    break;
                case 2:
                    strArr = a.C(parcel, a);
                    break;
                case 3:
                    credentialPickerConfig2 = (CredentialPickerConfig) a.a(parcel, a, CredentialPickerConfig.CREATOR);
                    break;
                case 4:
                    credentialPickerConfig = (CredentialPickerConfig) a.a(parcel, a, CredentialPickerConfig.CREATOR);
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
            return new CredentialRequest(i, z, strArr, credentialPickerConfig2, credentialPickerConfig);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CredentialRequest[] a(int i) {
        return new CredentialRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
