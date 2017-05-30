package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class d implements Creator<GoogleSignInAccount> {
    static void a(GoogleSignInAccount googleSignInAccount, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, googleSignInAccount.b);
        b.a(parcel, 2, googleSignInAccount.a(), false);
        b.a(parcel, 3, googleSignInAccount.b(), false);
        b.a(parcel, 4, googleSignInAccount.c(), false);
        b.a(parcel, 5, googleSignInAccount.d(), false);
        b.a(parcel, 6, googleSignInAccount.g(), i, false);
        b.a(parcel, 7, googleSignInAccount.h(), false);
        b.a(parcel, 8, googleSignInAccount.i());
        b.a(parcel, 9, googleSignInAccount.k(), false);
        b.c(parcel, 10, googleSignInAccount.c, false);
        b.a(parcel, 11, googleSignInAccount.e(), false);
        b.a(parcel, 12, googleSignInAccount.f(), false);
        b.a(parcel, a);
    }

    public GoogleSignInAccount a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = a.q(parcel, a);
                    break;
                case 8:
                    j = a.i(parcel, a);
                    break;
                case 9:
                    str6 = a.q(parcel, a);
                    break;
                case 10:
                    list = a.c(parcel, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = a.q(parcel, a);
                    break;
                case 12:
                    str8 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GoogleSignInAccount[] a(int i) {
        return new GoogleSignInAccount[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
