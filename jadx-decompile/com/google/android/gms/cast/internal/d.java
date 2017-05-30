package com.google.android.gms.cast.internal;

import android.support.annotation.NonNull;
import android.text.TextUtils;

public abstract class d {
    private final String a;
    private o b;
    protected final m f;

    protected d(String str, String str2, String str3) {
        f.a(str);
        this.a = str;
        this.f = new m(str2);
        a(str3);
    }

    public void a() {
    }

    public void a(long j, int i) {
    }

    public final void a(o oVar) {
        this.b = oVar;
        if (this.b == null) {
            a();
        }
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f.a(str);
        }
    }

    protected final void a(String str, long j, String str2) {
        this.f.a("Sending text message: %s to: %s", str, str2);
        this.b.a(this.a, str, j, str2);
    }

    public String b() {
        return this.a;
    }

    public void b(@NonNull String str) {
    }

    protected final long c() {
        return this.b.a();
    }
}
