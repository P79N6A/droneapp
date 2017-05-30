package com.google.android.gms.measurement.internal;

import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;

class a {
    private final aj a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private boolean v;
    private long w;
    private long x;

    @WorkerThread
    a(aj ajVar, String str) {
        d.a(ajVar);
        d.a(str);
        this.a = ajVar;
        this.b = str;
        this.a.z();
    }

    @WorkerThread
    public void a() {
        this.a.z();
        this.v = false;
    }

    @WorkerThread
    public void a(long j) {
        this.a.z();
        this.v = (this.h != j ? 1 : 0) | this.v;
        this.h = j;
    }

    @WorkerThread
    public void a(String str) {
        this.a.z();
        this.v = (!m.c(this.c, str) ? 1 : 0) | this.v;
        this.c = str;
    }

    @WorkerThread
    public void a(boolean z) {
        this.a.z();
        this.v = (this.o != z ? 1 : 0) | this.v;
        this.o = z;
    }

    @WorkerThread
    public String b() {
        this.a.z();
        return this.b;
    }

    @WorkerThread
    public void b(long j) {
        this.a.z();
        this.v = (this.i != j ? 1 : 0) | this.v;
        this.i = j;
    }

    @WorkerThread
    public void b(String str) {
        this.a.z();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.v = (!m.c(this.d, str) ? 1 : 0) | this.v;
        this.d = str;
    }

    @WorkerThread
    public String c() {
        this.a.z();
        return this.c;
    }

    @WorkerThread
    public void c(long j) {
        this.a.z();
        this.v = (this.k != j ? 1 : 0) | this.v;
        this.k = j;
    }

    @WorkerThread
    public void c(String str) {
        this.a.z();
        this.v = (!m.c(this.e, str) ? 1 : 0) | this.v;
        this.e = str;
    }

    @WorkerThread
    public String d() {
        this.a.z();
        return this.d;
    }

    @WorkerThread
    public void d(long j) {
        this.a.z();
        this.v = (this.m != j ? 1 : 0) | this.v;
        this.m = j;
    }

    @WorkerThread
    public void d(String str) {
        this.a.z();
        this.v = (!m.c(this.f, str) ? 1 : 0) | this.v;
        this.f = str;
    }

    @WorkerThread
    public String e() {
        this.a.z();
        return this.e;
    }

    @WorkerThread
    public void e(long j) {
        this.a.z();
        this.v = (this.n != j ? 1 : 0) | this.v;
        this.n = j;
    }

    @WorkerThread
    public void e(String str) {
        this.a.z();
        this.v = (!m.c(this.j, str) ? 1 : 0) | this.v;
        this.j = str;
    }

    @WorkerThread
    public String f() {
        this.a.z();
        return this.f;
    }

    @WorkerThread
    public void f(long j) {
        int i = 1;
        d.b(j >= 0);
        this.a.z();
        boolean z = this.v;
        if (this.g == j) {
            i = 0;
        }
        this.v = z | i;
        this.g = j;
    }

    @WorkerThread
    public void f(String str) {
        this.a.z();
        this.v = (!m.c(this.l, str) ? 1 : 0) | this.v;
        this.l = str;
    }

    @WorkerThread
    public long g() {
        this.a.z();
        return this.h;
    }

    @WorkerThread
    public void g(long j) {
        this.a.z();
        this.v = (this.w != j ? 1 : 0) | this.v;
        this.w = j;
    }

    @WorkerThread
    public long h() {
        this.a.z();
        return this.i;
    }

    @WorkerThread
    public void h(long j) {
        this.a.z();
        this.v = (this.x != j ? 1 : 0) | this.v;
        this.x = j;
    }

    @WorkerThread
    public String i() {
        this.a.z();
        return this.j;
    }

    @WorkerThread
    public void i(long j) {
        this.a.z();
        this.v = (this.p != j ? 1 : 0) | this.v;
        this.p = j;
    }

    @WorkerThread
    public long j() {
        this.a.z();
        return this.k;
    }

    @WorkerThread
    public void j(long j) {
        this.a.z();
        this.v = (this.q != j ? 1 : 0) | this.v;
        this.q = j;
    }

    @WorkerThread
    public String k() {
        this.a.z();
        return this.l;
    }

    @WorkerThread
    public void k(long j) {
        this.a.z();
        this.v = (this.r != j ? 1 : 0) | this.v;
        this.r = j;
    }

    @WorkerThread
    public long l() {
        this.a.z();
        return this.m;
    }

    @WorkerThread
    public void l(long j) {
        this.a.z();
        this.v = (this.s != j ? 1 : 0) | this.v;
        this.s = j;
    }

    @WorkerThread
    public long m() {
        this.a.z();
        return this.n;
    }

    @WorkerThread
    public void m(long j) {
        this.a.z();
        this.v = (this.u != j ? 1 : 0) | this.v;
        this.u = j;
    }

    @WorkerThread
    public void n(long j) {
        this.a.z();
        this.v = (this.t != j ? 1 : 0) | this.v;
        this.t = j;
    }

    @WorkerThread
    public boolean n() {
        this.a.z();
        return this.o;
    }

    @WorkerThread
    public long o() {
        this.a.z();
        return this.g;
    }

    @WorkerThread
    public long p() {
        this.a.z();
        return this.w;
    }

    @WorkerThread
    public long q() {
        this.a.z();
        return this.x;
    }

    @WorkerThread
    public void r() {
        this.a.z();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.f().z().a("Bundle index overflow");
            j = 0;
        }
        this.v = true;
        this.g = j;
    }

    @WorkerThread
    public long s() {
        this.a.z();
        return this.p;
    }

    @WorkerThread
    public long t() {
        this.a.z();
        return this.q;
    }

    @WorkerThread
    public long u() {
        this.a.z();
        return this.r;
    }

    @WorkerThread
    public long v() {
        this.a.z();
        return this.s;
    }

    @WorkerThread
    public long w() {
        this.a.z();
        return this.u;
    }

    @WorkerThread
    public long x() {
        this.a.z();
        return this.t;
    }
}
