package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class sq implements Callable {
    protected final String a = getClass().getSimpleName();
    protected final rw b;
    protected final String c;
    protected final String d;
    protected final a e;
    protected Method f;
    protected final int g;
    protected final int h;

    public sq(rw rwVar, String str, String str2, a aVar, int i, int i2) {
        this.b = rwVar;
        this.c = str;
        this.d = str2;
        this.e = aVar;
        this.g = i;
        this.h = i2;
    }

    protected abstract void a();

    public Void b() {
        try {
            long nanoTime = System.nanoTime();
            this.f = this.b.a(this.c, this.d);
            if (this.f != null) {
                a();
                np j = this.b.j();
                if (!(j == null || this.g == Integer.MIN_VALUE)) {
                    j.a(this.h, this.g, (System.nanoTime() - nanoTime) / 1000);
                }
            }
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
        }
        return null;
    }

    public /* synthetic */ Object call() {
        return b();
    }
}
