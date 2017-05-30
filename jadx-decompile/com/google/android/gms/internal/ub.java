package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.u;

@aaa
public abstract class ub<T> {
    private final int a;
    private final String b;
    private final T c;

    private ub(int i, String str, T t) {
        this.a = i;
        this.b = str;
        this.c = t;
        u.p().a(this);
    }

    public static ub<String> a(int i, String str) {
        ub<String> a = a(i, str, null);
        u.p().b(a);
        return a;
    }

    public static ub<Integer> a(int i, String str, int i2) {
        return new 2(i, str, Integer.valueOf(i2));
    }

    public static ub<Long> a(int i, String str, long j) {
        return new 3(i, str, Long.valueOf(j));
    }

    public static ub<Boolean> a(int i, String str, Boolean bool) {
        return new 1(i, str, bool);
    }

    public static ub<String> a(int i, String str, String str2) {
        return new 4(i, str, str2);
    }

    public static ub<String> b(int i, String str) {
        ub<String> a = a(i, str, null);
        u.p().c(a);
        return a;
    }

    protected abstract T a(SharedPreferences sharedPreferences);

    public String a() {
        return this.b;
    }

    public T b() {
        return this.c;
    }

    public T c() {
        return u.q().a(this);
    }
}
