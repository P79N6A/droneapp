package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<HintRequest> CREATOR = new g();
    final int a;
    private final CredentialPickerConfig b;
    private final boolean c;
    private final boolean d;
    private final String[] e;

    public static final class a {
        private boolean a;
        private boolean b;
        private String[] c;
        private CredentialPickerConfig d = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.a().a();

        public a a(@NonNull CredentialPickerConfig credentialPickerConfig) {
            this.d = (CredentialPickerConfig) d.a((Object) credentialPickerConfig);
            return this;
        }

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public a a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.c = strArr;
            return this;
        }

        public HintRequest a() {
            if (this.c == null) {
                this.c = new String[0];
            }
            if (this.a || this.b || this.c.length != 0) {
                return new HintRequest();
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }
    }

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr) {
        this.a = i;
        this.b = (CredentialPickerConfig) d.a((Object) credentialPickerConfig);
        this.c = z;
        this.d = z2;
        this.e = (String[]) d.a((Object) strArr);
    }

    private HintRequest(a aVar) {
        this(1, aVar.d, aVar.a, aVar.b, aVar.c);
    }

    @NonNull
    public CredentialPickerConfig a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    @NonNull
    public String[] d() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
