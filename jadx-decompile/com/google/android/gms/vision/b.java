package com.google.android.gms.vision;

import android.util.SparseArray;

public abstract class b<T> {
    private Object a = new Object();
    private b<T> b;

    public static class a<T> {
        private SparseArray<T> a;
        private com.google.android.gms.vision.d.b b;
        private boolean c;

        public a(SparseArray<T> sparseArray, com.google.android.gms.vision.d.b bVar, boolean z) {
            this.a = sparseArray;
            this.b = bVar;
            this.c = z;
        }

        public SparseArray<T> a() {
            return this.a;
        }

        public com.google.android.gms.vision.d.b b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }

    public interface b<T> {
        void a();

        void a(a<T> aVar);
    }

    public abstract SparseArray<T> a(d dVar);

    public void a() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a();
                this.b = null;
            }
        }
    }

    public void a(b<T> bVar) {
        this.b = bVar;
    }

    public boolean a(int i) {
        return true;
    }

    public void b(d dVar) {
        synchronized (this.a) {
            if (this.b == null) {
                throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
            }
            com.google.android.gms.vision.d.b bVar = new com.google.android.gms.vision.d.b(dVar.a());
            bVar.g();
            this.b.a(new a(a(dVar), bVar, b()));
        }
    }

    public boolean b() {
        return true;
    }
}
