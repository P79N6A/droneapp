package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new e();
    final int a;
    private final boolean b;
    private final boolean c;
    @Deprecated
    private final boolean d;
    private final int e;

    public static class a {
        private boolean a = false;
        private boolean b = true;
        private int c = 1;

        public a a(int i) {
            this.c = i;
            return this;
        }

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public CredentialPickerConfig a() {
            return new CredentialPickerConfig();
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }

        @Deprecated
        public a c(boolean z) {
            this.c = z ? 3 : 1;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        int i3 = 3;
        boolean z4 = true;
        this.a = i;
        this.b = z;
        this.c = z2;
        if (i < 2) {
            this.d = z3;
            if (!z3) {
                i3 = 1;
            }
            this.e = i3;
            return;
        }
        if (i2 != 3) {
            z4 = false;
        }
        this.d = z4;
        this.e = i2;
    }

    private CredentialPickerConfig(a aVar) {
        this(2, aVar.a, aVar.b, false, aVar.c);
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    @Deprecated
    public boolean c() {
        return this.e == 3;
    }

    int d() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
