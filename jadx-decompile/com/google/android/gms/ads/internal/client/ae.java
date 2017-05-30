package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.a;
import com.google.android.gms.internal.aaa;

@aaa
public class ae extends a {
    private final Object a = new Object();
    private a b;

    public void a() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a();
            }
        }
    }

    public void a(int i) {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a(i);
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.a) {
            this.b = aVar;
        }
    }

    public void b() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.b();
            }
        }
    }

    public void c() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.c();
            }
        }
    }

    public void d() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.d();
            }
        }
    }
}
