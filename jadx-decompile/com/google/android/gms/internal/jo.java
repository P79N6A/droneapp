package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class jo implements jp {
    private boolean a = false;

    private void c() {
        mk.a(this.a, "Transaction expected to already be in progress.");
    }

    public jy a(kg kgVar) {
        return new jy(lc.a(la.j(), kgVar.c()), false, false);
    }

    public <T> T a(Callable<T> callable) {
        mk.a(!this.a, "runInTransaction called when an existing transaction is already in progress.");
        this.a = true;
        try {
            T call = callable.call();
            this.a = false;
            return call;
        } catch (Throwable th) {
            this.a = false;
        }
    }

    public void a() {
        c();
    }

    public void a(long j) {
        c();
    }

    public void a(ij ijVar, ia iaVar) {
        c();
    }

    public void a(ij ijVar, ia iaVar, long j) {
        c();
    }

    public void a(ij ijVar, lh lhVar) {
        c();
    }

    public void a(ij ijVar, lh lhVar, long j) {
        c();
    }

    public void a(kg kgVar, lh lhVar) {
        c();
    }

    public void a(kg kgVar, Set<kv> set) {
        c();
    }

    public void a(kg kgVar, Set<kv> set, Set<kv> set2) {
        c();
    }

    public List<iy> b() {
        return Collections.emptyList();
    }

    public void b(ij ijVar, ia iaVar) {
        c();
    }

    public void b(kg kgVar) {
        c();
    }

    public void c(kg kgVar) {
        c();
    }

    public void d(kg kgVar) {
        c();
    }
}
