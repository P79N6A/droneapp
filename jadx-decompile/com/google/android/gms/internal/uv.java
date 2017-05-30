package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;

@aaa
public class uv extends a {
    private final uu a;
    private final Drawable b;
    private final Uri c;
    private final double d;

    public uv(uu uuVar) {
        Drawable drawable;
        double d;
        Uri uri = null;
        this.a = uuVar;
        try {
            e a = this.a.a();
            if (a != null) {
                drawable = (Drawable) f.a(a);
                this.b = drawable;
                uri = this.a.b();
                this.c = uri;
                d = 1.0d;
                d = this.a.c();
                this.d = d;
            }
        } catch (Throwable e) {
            b.b("Failed to get drawable.", e);
        }
        Object obj = uri;
        this.b = drawable;
        try {
            uri = this.a.b();
        } catch (Throwable e2) {
            b.b("Failed to get uri.", e2);
        }
        this.c = uri;
        d = 1.0d;
        try {
            d = this.a.c();
        } catch (Throwable e3) {
            b.b("Failed to get scale.", e3);
        }
        this.d = d;
    }

    public Drawable a() {
        return this.b;
    }

    public Uri b() {
        return this.c;
    }

    public double c() {
        return this.d;
    }
}
