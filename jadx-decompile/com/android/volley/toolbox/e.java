package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.b;
import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.p;

public class e extends n<Object> {
    private final b a;
    private final Runnable b;

    public e(b bVar, Runnable runnable) {
        super(0, null, null);
        this.a = bVar;
        this.b = runnable;
    }

    protected p<Object> a(j jVar) {
        return null;
    }

    protected void b(Object obj) {
    }

    public boolean m() {
        this.a.b();
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.b);
        }
        return true;
    }

    public n.b x() {
        return n.b.IMMEDIATE;
    }
}
