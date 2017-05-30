package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;
import java.util.concurrent.Callable;

public class sg implements Callable {
    private final rw a;
    private final a b;

    public sg(rw rwVar, a aVar) {
        this.a = rwVar;
        this.b = aVar;
    }

    public Void a() {
        if (this.a.l() != null) {
            this.a.l().get();
        }
        rd k = this.a.k();
        if (k != null) {
            try {
                synchronized (this.b) {
                    rd.a(this.b, rd.a(k));
                }
            } catch (rc e) {
            }
        }
        return null;
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
