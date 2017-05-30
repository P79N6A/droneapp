package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class e implements Creator<GoogleSignInOptions> {
    static void a(GoogleSignInOptions googleSignInOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, googleSignInOptions.e);
        b.c(parcel, 2, googleSignInOptions.a(), false);
        b.a(parcel, 3, googleSignInOptions.c(), i, false);
        b.a(parcel, 4, googleSignInOptions.d());
        b.a(parcel, 5, googleSignInOptions.e());
        b.a(parcel, 6, googleSignInOptions.f());
        b.a(parcel, 7, googleSignInOptions.g(), false);
        b.a(parcel, 8, googleSignInOptions.h(), false);
        b.a(parcel, a);
    }

    public GoogleSignInOptions a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    arrayList = a.c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) a.a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z3 = a.c(parcel, a);
                    break;
                case 5:
                    z2 = a.c(parcel, a);
                    break;
                case 6:
                    z = a.c(parcel, a);
                    break;
                case 7:
                    str2 = a.q(parcel, a);
                    break;
                case 8:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInOptions(i, arrayList, account, z3, z2, z, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GoogleSignInOptions[] a(int i) {
        return new GoogleSignInOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
