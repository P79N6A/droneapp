package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<CredentialPickerConfig> {
    static void a(CredentialPickerConfig credentialPickerConfig, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, credentialPickerConfig.a());
        b.a(parcel, 2, credentialPickerConfig.b());
        b.a(parcel, 3, credentialPickerConfig.c());
        b.a(parcel, 4, credentialPickerConfig.d());
        b.a(parcel, 1000, credentialPickerConfig.a);
        b.a(parcel, a);
    }

    public CredentialPickerConfig a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    z3 = a.c(parcel, a);
                    break;
                case 2:
                    z2 = a.c(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CredentialPickerConfig(i2, z3, z2, z, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CredentialPickerConfig[] a(int i) {
        return new CredentialPickerConfig[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
