package com.google.android.gms.vision;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.b.a;
import com.google.android.gms.vision.b.b;

public abstract class c<T> implements b<T> {
    private b<T> a;
    private g<T> b;
    private int c = 3;
    private boolean d = false;
    private int e;
    private int f = 0;

    public c(b<T> bVar, g<T> gVar) {
        this.a = bVar;
        this.b = gVar;
    }

    public void a() {
        this.b.a();
    }

    protected void a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid max gap: " + i);
        }
        this.c = i;
    }

    public void a(a<T> aVar) {
        SparseArray a = aVar.a();
        if (a.size() == 0) {
            if (this.f == this.c) {
                this.b.a();
                this.d = false;
            } else {
                this.b.a(aVar);
            }
            this.f++;
            return;
        }
        this.f = 0;
        if (this.d) {
            Object obj = a.get(this.e);
            if (obj != null) {
                this.b.a((a) aVar, obj);
                return;
            } else {
                this.b.a();
                this.d = false;
            }
        }
        int b = b(aVar);
        Object obj2 = a.get(b);
        if (obj2 == null) {
            Log.w("FocusingProcessor", "Invalid focus selected: " + b);
            return;
        }
        this.d = true;
        this.e = b;
        this.a.a(this.e);
        this.b.a(this.e, obj2);
        this.b.a((a) aVar, obj2);
    }

    public abstract int b(a<T> aVar);
}
