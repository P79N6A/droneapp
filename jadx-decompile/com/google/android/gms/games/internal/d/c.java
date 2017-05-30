package com.google.android.gms.games.internal.d;

import java.util.concurrent.atomic.AtomicReference;

public abstract class c {
    private final AtomicReference<a> a = new AtomicReference();

    protected abstract a a();

    public void a(String str, int i) {
        a aVar = (a) this.a.get();
        if (aVar == null) {
            aVar = a();
            if (!this.a.compareAndSet(null, aVar)) {
                aVar = (a) this.a.get();
            }
        }
        aVar.b(str, i);
    }

    public void b() {
        a aVar = (a) this.a.get();
        if (aVar != null) {
            aVar.a();
        }
    }
}
