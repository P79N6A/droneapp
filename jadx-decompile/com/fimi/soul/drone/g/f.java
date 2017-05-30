package com.fimi.soul.drone.g;

import android.os.Handler;

public class f {
    public boolean a;
    public boolean b;
    private int c;
    private Handler d = new Handler();
    private Runnable e;
    private Runnable f;

    public f(int i) {
        this.c = i;
    }

    public f(int i, Runnable runnable) {
        this.c = i;
        a(runnable);
    }

    public int a() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(int i, Runnable runnable) {
        this.b = true;
        if (!this.a) {
            this.c = i;
            a(runnable);
            this.d.postDelayed(this.f, (long) this.c);
            this.a = true;
        }
    }

    public void a(Runnable runnable) {
        if (runnable != null) {
            this.e = runnable;
            this.f = new Runnable(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.e != null) {
                        this.a.e.run();
                        this.a.d.postDelayed(this.a.f, (long) this.a.c);
                    }
                }
            };
        }
    }

    public boolean b() {
        return this.a;
    }

    public void c() {
        this.d.removeCallbacks(this.f);
        this.a = false;
        this.d.postDelayed(this.f, (long) this.c);
        this.a = true;
    }

    public void d() {
        if (!this.a) {
            this.d.postDelayed(this.f, (long) this.c);
            this.a = true;
        }
    }

    public void e() {
        this.d.removeCallbacks(this.f);
        this.a = false;
    }

    public void f() {
        this.d.removeCallbacks(this.e);
        this.d.removeCallbacks(this.f);
    }
}
