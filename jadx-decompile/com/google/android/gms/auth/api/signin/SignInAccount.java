package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new f();
    final int a;
    @Deprecated
    String b;
    @Deprecated
    String c;
    private GoogleSignInAccount d;

    SignInAccount(int i, String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.a = i;
        this.d = googleSignInAccount;
        this.b = d.a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.c = d.a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    public GoogleSignInAccount a() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
