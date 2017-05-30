package com.google.android.gms.internal;

public abstract class amf<T> {
    private final int a;
    private final String b;
    private final T c;

    private amf(int i, String str, T t) {
        this.a = i;
        this.b = str;
        this.c = t;
        amk.a().a(this);
    }

    public static a a(int i, String str, Boolean bool) {
        return new a(i, str, bool);
    }

    public static b a(int i, String str, int i2) {
        return new b(i, str, Integer.valueOf(i2));
    }

    public static c a(int i, String str, long j) {
        return new c(i, str, Long.valueOf(j));
    }

    public static d a(int i, String str, String str2) {
        return new d(i, str, str2);
    }

    protected abstract T a(ami com_google_android_gms_internal_ami);

    public String a() {
        return this.b;
    }

    public T b() {
        return this.c;
    }

    public T c() {
        return amk.b().a(this);
    }

    public int d() {
        return this.a;
    }
}
