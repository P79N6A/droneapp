package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;

public abstract class j {
    private int c;
    protected final DataHolder c_;
    protected int d_;

    public j(DataHolder dataHolder, int i) {
        this.c_ = (DataHolder) d.a((Object) dataHolder);
        a(i);
    }

    protected void a(int i) {
        boolean z = i >= 0 && i < this.c_.g();
        d.a(z);
        this.d_ = i;
        this.c = this.c_.a(this.d_);
    }

    protected void a(String str, CharArrayBuffer charArrayBuffer) {
        this.c_.a(str, this.d_, this.c, charArrayBuffer);
    }

    protected long b(String str) {
        return this.c_.a(str, this.d_, this.c);
    }

    public boolean b() {
        return !this.c_.h();
    }

    protected int c(String str) {
        return this.c_.b(str, this.d_, this.c);
    }

    protected boolean d(String str) {
        return this.c_.d(str, this.d_, this.c);
    }

    public boolean d_(String str) {
        return this.c_.a(str);
    }

    protected String e(String str) {
        return this.c_.c(str, this.d_, this.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return c.a(Integer.valueOf(jVar.d_), Integer.valueOf(this.d_)) && c.a(Integer.valueOf(jVar.c), Integer.valueOf(this.c)) && jVar.c_ == this.c_;
    }

    protected float f(String str) {
        return this.c_.e(str, this.d_, this.c);
    }

    protected byte[] g(String str) {
        return this.c_.f(str, this.d_, this.c);
    }

    protected Uri h(String str) {
        return this.c_.g(str, this.d_, this.c);
    }

    public int hashCode() {
        return c.a(Integer.valueOf(this.d_), Integer.valueOf(this.c), this.c_);
    }

    protected boolean i(String str) {
        return this.c_.h(str, this.d_, this.c);
    }

    protected int n_() {
        return this.d_;
    }
}
