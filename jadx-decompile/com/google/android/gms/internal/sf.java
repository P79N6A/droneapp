package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;
import java.io.IOException;

public class sf extends sq {
    public sf(rw rwVar, String str, String str2, a aVar, int i, int i2) {
        super(rwVar, str, str2, aVar, i, i2);
    }

    private void a(String str) {
    }

    private void c() {
        synchronized (this.e) {
            this.e.aa = (String) this.f.invoke(null, new Object[]{this.b.b()});
        }
    }

    private void d() {
        com.google.android.gms.ads.a.a n = this.b.n();
        if (n == null) {
            a("E1");
            return;
        }
        try {
            com.google.android.gms.ads.a.a.a b = n.b();
            String a = ry.a(b.a());
            if (a != null) {
                synchronized (this.e) {
                    this.e.aa = a;
                    this.e.ac = Boolean.valueOf(b.b());
                    this.e.ab = Integer.valueOf(5);
                }
                return;
            }
            a("E");
        } catch (IOException e) {
            a("E");
        }
    }

    protected void a() {
        if (this.b.h()) {
            d();
        } else {
            c();
        }
    }
}
