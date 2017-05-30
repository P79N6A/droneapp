package com.google.android.gms.games.internal.d;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a {
    private Handler a;
    final Object b = new Object();
    private boolean c;
    private HashMap<String, AtomicInteger> d;
    private int e;

    public a(Looper looper, int i) {
        this.a = new Handler(looper);
        this.d = new HashMap();
        this.e = i;
    }

    private void b() {
        synchronized (this.b) {
            this.c = false;
            a();
        }
    }

    public void a() {
        synchronized (this.b) {
            for (Entry entry : this.d.entrySet()) {
                a((String) entry.getKey(), ((AtomicInteger) entry.getValue()).get());
            }
            this.d.clear();
        }
    }

    protected abstract void a(String str, int i);

    public void b(String str, int i) {
        synchronized (this.b) {
            if (!this.c) {
                this.c = true;
                this.a.postDelayed(new Runnable(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.b();
                    }
                }, (long) this.e);
            }
            AtomicInteger atomicInteger = (AtomicInteger) this.d.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                this.d.put(str, atomicInteger);
            }
            atomicInteger.addAndGet(i);
        }
    }
}
