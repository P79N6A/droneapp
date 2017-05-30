package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<SignInAccount> {
    static void a(SignInAccount signInAccount, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, signInAccount.a);
        b.a(parcel, 4, signInAccount.b, false);
        b.a(parcel, 7, signInAccount.a(), i, false);
        b.a(parcel, 8, signInAccount.c, false);
        b.a(parcel, a);
    }

    public SignInAccount a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < b) {
            GoogleSignInAccount googleSignInAccount2;
            String str3;
            int g;
            String str4;
            int a = a.a(parcel);
            String str5;
            switch (a.a(a)) {
                case 1:
                    str5 = str2;
                    googleSignInAccount2 = googleSignInAccount;
                    str3 = str;
                    g = a.g(parcel, a);
                    str4 = str5;
                    break;
                case 4:
                    g = i;
                    GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
                    str3 = a.q(parcel, a);
                    str4 = str2;
                    googleSignInAccount2 = googleSignInAccount3;
                    break;
                case 7:
                    str3 = str;
                    g = i;
                    str5 = str2;
                    googleSignInAccount2 = (GoogleSignInAccount) a.a(parcel, a, GoogleSignInAccount.CREATOR);
                    str4 = str5;
                    break;
                case 8:
                    str4 = a.q(parcel, a);
                    googleSignInAccount2 = googleSignInAccount;
                    str3 = str;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    str4 = str2;
                    googleSignInAccount2 = googleSignInAccount;
                    str3 = str;
                    g = i;
                    break;
            }
            i = g;
            str = str3;
            googleSignInAccount = googleSignInAccount2;
            str2 = str4;
        }
        if (parcel.dataPosition() == b) {
            return new SignInAccount(i, str, googleSignInAccount, str2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SignInAccount[] a(int i) {
        return new SignInAccount[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
