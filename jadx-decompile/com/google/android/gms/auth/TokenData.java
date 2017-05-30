package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final k CREATOR = new k();
    final int a;
    private final String b;
    private final Long c;
    private final boolean d;
    private final boolean e;
    private final List<String> f;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list) {
        this.a = i;
        this.b = d.a(str);
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
    }

    @Nullable
    public static TokenData a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public String a() {
        return this.b;
    }

    @Nullable
    public Long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    @Nullable
    public List<String> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && c.a(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && c.a(this.f, tokenData.f);
    }

    public int hashCode() {
        return c.a(this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
