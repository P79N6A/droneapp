package com.google.android.gms.internal;

public class adf<T> {
    public final T a;
    public final com.google.android.gms.internal.ru.a b;
    public final aii c;
    public boolean d;

    public interface a {
        void a(aii com_google_android_gms_internal_aii);
    }

    public interface b<T> {
        void a(T t);
    }

    private adf(aii com_google_android_gms_internal_aii) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = com_google_android_gms_internal_aii;
    }

    private adf(T t, com.google.android.gms.internal.ru.a aVar) {
        this.d = false;
        this.a = t;
        this.b = aVar;
        this.c = null;
    }

    public static <T> adf<T> a(aii com_google_android_gms_internal_aii) {
        return new adf(com_google_android_gms_internal_aii);
    }

    public static <T> adf<T> a(T t, com.google.android.gms.internal.ru.a aVar) {
        return new adf(t, aVar);
    }

    public boolean a() {
        return this.c == null;
    }
}
