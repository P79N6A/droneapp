package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uu.a;

@aaa
public class c extends a {
    private final Drawable a;
    private final Uri b;
    private final double c;

    public c(Drawable drawable, Uri uri, double d) {
        this.a = drawable;
        this.b = uri;
        this.c = d;
    }

    public e a() {
        return f.a(this.a);
    }

    public Uri b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }
}
