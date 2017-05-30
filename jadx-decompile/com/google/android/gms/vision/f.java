package com.google.android.gms.vision;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.Set;

public class f<T> implements com.google.android.gms.vision.b.b<T> {
    private b<T> a;
    private SparseArray<c> b;
    private int c;

    public static class a<T> {
        private f<T> a = new f();

        public a(b<T> bVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("No factory supplied.");
            }
            this.a.a = bVar;
        }

        public a<T> a(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Invalid max gap: " + i);
            }
            this.a.c = i;
            return this;
        }

        public f<T> a() {
            return this.a;
        }
    }

    public interface b<T> {
        g<T> a(T t);
    }

    private class c {
        final /* synthetic */ f a;
        private g<T> b;
        private int c;

        private c(f fVar) {
            this.a = fVar;
            this.c = 0;
        }
    }

    private f() {
        this.b = new SparseArray();
        this.c = 3;
    }

    private void b(com.google.android.gms.vision.b.a<T> aVar) {
        SparseArray a = aVar.a();
        for (int i = 0; i < a.size(); i++) {
            int keyAt = a.keyAt(i);
            Object valueAt = a.valueAt(i);
            if (this.b.get(keyAt) == null) {
                c cVar = new c();
                cVar.b = this.a.a(valueAt);
                cVar.b.a(keyAt, valueAt);
                this.b.append(keyAt, cVar);
            }
        }
    }

    private void c(com.google.android.gms.vision.b.a<T> aVar) {
        SparseArray a = aVar.a();
        Set<Integer> hashSet = new HashSet();
        for (int i = 0; i < this.b.size(); i++) {
            int keyAt = this.b.keyAt(i);
            if (a.get(keyAt) == null) {
                c cVar = (c) this.b.valueAt(i);
                cVar.c = cVar.c + 1;
                if (cVar.c >= this.c) {
                    cVar.b.a();
                    hashSet.add(Integer.valueOf(keyAt));
                } else {
                    cVar.b.a(aVar);
                }
            }
        }
        for (Integer intValue : hashSet) {
            this.b.delete(intValue.intValue());
        }
    }

    private void d(com.google.android.gms.vision.b.a<T> aVar) {
        SparseArray a = aVar.a();
        for (int i = 0; i < a.size(); i++) {
            int keyAt = a.keyAt(i);
            Object valueAt = a.valueAt(i);
            c cVar = (c) this.b.get(keyAt);
            cVar.c = 0;
            cVar.b.a((com.google.android.gms.vision.b.a) aVar, valueAt);
        }
    }

    public void a() {
        for (int i = 0; i < this.b.size(); i++) {
            ((c) this.b.valueAt(i)).b.a();
        }
        this.b.clear();
    }

    public void a(com.google.android.gms.vision.b.a<T> aVar) {
        b(aVar);
        c(aVar);
        d(aVar);
    }
}
