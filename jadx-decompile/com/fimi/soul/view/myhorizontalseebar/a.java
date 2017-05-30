package com.fimi.soul.view.myhorizontalseebar;

import android.util.Log;

class a<T extends c<T>> implements b<T> {
    private static final String a = "FinitePool";
    private final d<T> b;
    private final int c;
    private final boolean d;
    private T e;
    private int f;

    a(d<T> dVar) {
        this.b = dVar;
        this.c = 0;
        this.d = true;
    }

    a(d<T> dVar, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The pool limit must be > 0");
        }
        this.b = dVar;
        this.c = i;
        this.d = false;
    }

    public T a() {
        T t;
        if (this.e != null) {
            T t2 = this.e;
            this.e = (c) t2.a();
            this.f--;
            t = t2;
        } else {
            t = this.b.a();
        }
        if (t != null) {
            t.a(null);
            t.a(false);
            this.b.a(t);
        }
        return t;
    }

    public void a(T t) {
        if (t.b()) {
            Log.w(a, "Element is already in pool: " + t);
            return;
        }
        if (this.d || this.f < this.c) {
            this.f++;
            t.a(this.e);
            t.a(true);
            this.e = t;
        }
        this.b.b(t);
    }
}
