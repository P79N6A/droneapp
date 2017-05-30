package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.cast.a;
import com.google.android.gms.cast.b;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.j;
import com.google.android.gms.cast.framework.m;

public class afd extends m {
    private final CastOptions a;
    private final afm b;

    public afd(Context context, CastOptions castOptions, afm com_google_android_gms_internal_afm) {
        super(context, a(castOptions));
        this.a = castOptions;
        this.b = com_google_android_gms_internal_afm;
    }

    private static String a(CastOptions castOptions) {
        return castOptions.c().isEmpty() ? b.b(castOptions.b()) : b.a(castOptions.b(), castOptions.c());
    }

    public j a(String str) {
        return new d(a(), b(), str, this.a, a.l, new afe(), new afq(a(), this.a, this.b));
    }

    public boolean c() {
        return this.a.f();
    }
}
