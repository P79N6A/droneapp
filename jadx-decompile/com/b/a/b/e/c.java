package com.b.a.b.e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.b.a.b.a.e;
import com.b.a.b.a.h;

public class c implements a {
    protected final String a;
    protected final e b;
    protected final h c;

    public c(e eVar, h hVar) {
        this(null, eVar, hVar);
    }

    public c(String str, e eVar, h hVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("imageSize must not be null");
        } else if (hVar == null) {
            throw new IllegalArgumentException("scaleType must not be null");
        } else {
            this.a = str;
            this.b = eVar;
            this.c = hVar;
        }
    }

    public int a() {
        return this.b.a();
    }

    public boolean a(Bitmap bitmap) {
        return true;
    }

    public boolean a(Drawable drawable) {
        return true;
    }

    public int b() {
        return this.b.b();
    }

    public h c() {
        return this.c;
    }

    public View d() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public int f() {
        return TextUtils.isEmpty(this.a) ? super.hashCode() : this.a.hashCode();
    }
}
