package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.h;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.uq.a;

@aaa
public final class uo extends a {
    private final h a;
    @Nullable
    private final String b;
    private final String c;

    public uo(h hVar, @Nullable String str, String str2) {
        this.a = hVar;
        this.b = str;
        this.c = str2;
    }

    public String a() {
        return this.b;
    }

    public void a(@Nullable e eVar) {
        if (eVar != null) {
            this.a.b((View) f.a(eVar));
        }
    }

    public String b() {
        return this.c;
    }

    public void c() {
        this.a.E();
    }

    public void d() {
        this.a.F();
    }
}
