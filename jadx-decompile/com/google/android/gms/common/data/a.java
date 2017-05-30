package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

public abstract class a<T> implements b<T> {
    protected final DataHolder a;

    protected a(DataHolder dataHolder) {
        this.a = dataHolder;
        if (this.a == null) {
        }
    }

    public abstract T a(int i);

    public void b() {
        if (this.a != null) {
            this.a.close();
        }
    }

    public int c() {
        return this.a == null ? 0 : this.a.g();
    }

    @Deprecated
    public final void d() {
        b();
    }

    @Deprecated
    public boolean e() {
        return this.a == null || this.a.h();
    }

    public Bundle f() {
        return this.a.f();
    }

    public Iterator<T> g() {
        return new n(this);
    }

    public Iterator<T> iterator() {
        return new i(this);
    }
}
