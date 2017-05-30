package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new i();
    final int a;
    private final String b;
    private GoogleSignInOptions c;

    SignInConfiguration(int i, String str, GoogleSignInOptions googleSignInOptions) {
        this.a = i;
        this.b = d.a(str);
        this.c = googleSignInOptions;
    }

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this(3, str, googleSignInOptions);
    }

    public String a() {
        return this.b;
    }

    public GoogleSignInOptions b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (!this.b.equals(signInConfiguration.a())) {
                return false;
            }
            if (this.c == null) {
                if (signInConfiguration.b() != null) {
                    return false;
                }
            } else if (!this.c.equals(signInConfiguration.b())) {
                return false;
            }
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return new d().a(this.b).a(this.c).a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
