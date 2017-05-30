package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;

public class dd {
    private final String a;
    @Nullable
    private final String b;
    @Nullable
    private final String c;
    private final boolean d;
    @Nullable
    private final String e;
    @Nullable
    private final String f;

    public dd(String str, String str2, @Nullable String str3, boolean z, @Nullable String str4) {
        this(str, str2, str3, z, str4, "");
    }

    public dd(String str, String str2, @Nullable String str3, boolean z, @Nullable String str4, String str5) {
        d.a(str);
        d.a(str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        if (this.c == null) {
            return this.a;
        }
        String str = this.c;
        String str2 = this.a;
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("_").append(str2).toString();
    }

    public boolean e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public String g() {
        return this.f;
    }
}
