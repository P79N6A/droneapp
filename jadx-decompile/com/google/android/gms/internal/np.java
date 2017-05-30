package com.google.android.gms.internal;

import com.google.android.gms.clearcut.b;
import com.google.android.gms.internal.ce.a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class np {
    protected static volatile b a = null;
    private static volatile Random d = null;
    private static final Object e = new Object();
    protected boolean b = false;
    private rw c;

    public np(rw rwVar) {
        this.c = rwVar;
        uf.a(rwVar.a());
        this.b = ((Boolean) uf.aZ.c()).booleanValue();
        if (this.b && a == null) {
            synchronized (e) {
                if (a == null) {
                    a = new b(rwVar.a(), "ADSHIELD", null);
                }
            }
        }
    }

    private static Random b() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new Random();
                }
            }
        }
        return d;
    }

    public int a() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (NoClassDefFoundError e) {
            return b().nextInt();
        } catch (RuntimeException e2) {
            return b().nextInt();
        }
    }

    public void a(int i, int i2, long j) {
        try {
            if (this.b && a != null && this.c.i()) {
                rd aVar = new a();
                aVar.a = this.c.a().getPackageName();
                aVar.b = Long.valueOf(j);
                b.a a = a.a(rd.a(aVar));
                a.b(i2);
                a.a(i);
                a.a(this.c.g());
            }
        } catch (Exception e) {
        }
    }
}
