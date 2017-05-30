package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Looper;
import java.util.HashMap;

public class sx<L, W extends IInterface> {
    private final Looper a;
    private final a<L, W> b;
    private final HashMap<L, W> c = new HashMap();

    public interface a<L, W extends IInterface> {
        W a(L l, Looper looper);
    }

    public sx(Looper looper, a<L, W> aVar) {
        this.a = looper;
        this.b = aVar;
    }

    public W a(L l) {
        IInterface iInterface = (IInterface) this.c.get(l);
        if (iInterface != null) {
            return iInterface;
        }
        W a = this.b.a(l, this.a);
        this.c.put(l, a);
        return a;
    }
}
