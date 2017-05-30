package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Credential> CREATOR = new d();
    public static final String a = "com.google.android.gms.credentials.Credential";
    final int b;
    private final String c;
    @Nullable
    private final String d;
    @Nullable
    private final Uri e;
    private final List<IdToken> f;
    @Nullable
    private final String g;
    @Nullable
    private final String h;
    @Nullable
    private final String i;
    @Nullable
    private final String j;

    public static class a {
        private final String a;
        private String b;
        private Uri c;
        private List<IdToken> d;
        private String e;
        private String f;
        private String g;
        private String h;

        public a(Credential credential) {
            this.a = credential.c;
            this.b = credential.d;
            this.c = credential.e;
            this.d = credential.f;
            this.e = credential.g;
            this.f = credential.h;
            this.g = credential.i;
            this.h = credential.j;
        }

        public a(String str) {
            this.a = str;
        }

        public a a(Uri uri) {
            this.c = uri;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }

        public Credential a() {
            return new Credential(3, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public a b(String str) {
            this.e = str;
            return this;
        }

        public a c(String str) {
            this.f = str;
            return this;
        }
    }

    Credential(int i, String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        this.b = i;
        String trim = ((String) d.a((Object) str, (Object) "credential identifier cannot be null")).trim();
        d.a(trim, (Object) "credential identifier cannot be empty");
        this.c = trim;
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.d = str2;
        this.e = uri;
        this.f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.g = str3;
        if (str3 == null || !str3.isEmpty()) {
            if (!TextUtils.isEmpty(str4)) {
                b.a(str4);
            }
            this.h = str4;
            this.i = str5;
            this.j = str6;
            if (!TextUtils.isEmpty(this.g) && !TextUtils.isEmpty(this.h)) {
                throw new IllegalStateException("password and accountType cannot both be set");
            }
            return;
        }
        throw new IllegalArgumentException("password cannot be empty");
    }

    public String a() {
        return this.c;
    }

    @Nullable
    public String b() {
        return this.d;
    }

    @Nullable
    public Uri c() {
        return this.e;
    }

    public List<IdToken> d() {
        return this.f;
    }

    @Nullable
    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.c, credential.c) && TextUtils.equals(this.d, credential.d) && c.a(this.e, credential.e) && TextUtils.equals(this.g, credential.g) && TextUtils.equals(this.h, credential.h) && TextUtils.equals(this.i, credential.i);
    }

    @Nullable
    public String f() {
        return this.i;
    }

    @Nullable
    public String g() {
        return this.h;
    }

    public String h() {
        return this.j;
    }

    public int hashCode() {
        return c.a(this.c, this.d, this.e, this.g, this.h, this.i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
