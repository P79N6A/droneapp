package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<SignInConfiguration> {
    static void a(SignInConfiguration signInConfiguration, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, signInConfiguration.a);
        b.a(parcel, 2, signInConfiguration.a(), false);
        b.a(parcel, 5, signInConfiguration.b(), i, false);
        b.a(parcel, a);
    }

    public SignInConfiguration a(Parcel parcel) {
        GoogleSignInOptions googleSignInOptions = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    googleSignInOptions = (GoogleSignInOptions) a.a(parcel, a, GoogleSignInOptions.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SignInConfiguration(i, str, googleSignInOptions);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SignInConfiguration[] a(int i) {
        return new SignInConfiguration[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
