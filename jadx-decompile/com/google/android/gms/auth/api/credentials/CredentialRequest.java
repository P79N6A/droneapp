package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Creator<CredentialRequest> CREATOR = new f();
    final int a;
    private final boolean b;
    private final String[] c;
    private final CredentialPickerConfig d;
    private final CredentialPickerConfig e;

    public static final class a {
        private boolean a;
        private String[] b;
        private CredentialPickerConfig c;
        private CredentialPickerConfig d;

        public a a(CredentialPickerConfig credentialPickerConfig) {
            this.c = credentialPickerConfig;
            return this;
        }

        @Deprecated
        public a a(boolean z) {
            return b(z);
        }

        public a a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.b = strArr;
            return this;
        }

        public CredentialRequest a() {
            if (this.b == null) {
                this.b = new String[0];
            }
            if (this.a || this.b.length != 0) {
                return new CredentialRequest();
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public a b(CredentialPickerConfig credentialPickerConfig) {
            this.d = credentialPickerConfig;
            return this;
        }

        public a b(boolean z) {
            this.a = z;
            return this;
        }
    }

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2) {
        this.a = i;
        this.b = z;
        this.c = (String[]) d.a((Object) strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.a().a();
        }
        this.d = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.a().a();
        }
        this.e = credentialPickerConfig2;
    }

    private CredentialRequest(a aVar) {
        this(2, aVar.a, aVar.b, aVar.c, aVar.d);
    }

    @Deprecated
    public boolean a() {
        return b();
    }

    public boolean b() {
        return this.b;
    }

    @NonNull
    public String[] c() {
        return this.c;
    }

    @NonNull
    public CredentialPickerConfig d() {
        return this.d;
    }

    @NonNull
    public CredentialPickerConfig e() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
