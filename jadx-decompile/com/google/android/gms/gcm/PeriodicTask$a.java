package com.google.android.gms.gcm;

import android.os.Bundle;

public class PeriodicTask$a extends Task$a {
    private long i;
    private long j;

    public PeriodicTask$a() {
        this.i = -1;
        this.j = -1;
        this.e = true;
    }

    public PeriodicTask$a a(int i) {
        this.a = i;
        return this;
    }

    public PeriodicTask$a a(long j) {
        this.i = j;
        return this;
    }

    public PeriodicTask$a a(Bundle bundle) {
        this.h = bundle;
        return this;
    }

    public PeriodicTask$a a(Class<? extends GcmTaskService> cls) {
        this.b = cls.getName();
        return this;
    }

    public PeriodicTask$a a(String str) {
        this.c = str;
        return this;
    }

    public PeriodicTask$a a(boolean z) {
        this.f = z;
        return this;
    }

    protected void a() {
        super.a();
        if (this.i == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        } else if (this.i <= 0) {
            throw new IllegalArgumentException("Period set cannot be less than or equal to 0: " + this.i);
        } else if (this.j == -1) {
            this.j = (long) (((float) this.i) * 0.1f);
        } else if (this.j > this.i) {
            this.j = this.i;
        }
    }

    public PeriodicTask$a b(long j) {
        this.j = j;
        return this;
    }

    public PeriodicTask$a b(boolean z) {
        this.e = z;
        return this;
    }

    public PeriodicTask b() {
        a();
        return new PeriodicTask(this, null);
    }

    public /* synthetic */ Task$a b(int i) {
        return a(i);
    }

    public /* synthetic */ Task$a b(Bundle bundle) {
        return a(bundle);
    }

    public /* synthetic */ Task$a b(Class cls) {
        return a(cls);
    }

    public /* synthetic */ Task$a b(String str) {
        return a(str);
    }

    public PeriodicTask$a c(boolean z) {
        this.d = z;
        return this;
    }

    public /* synthetic */ Task c() {
        return b();
    }

    public /* synthetic */ Task$a d(boolean z) {
        return b(z);
    }

    public /* synthetic */ Task$a e(boolean z) {
        return c(z);
    }

    public /* synthetic */ Task$a f(boolean z) {
        return a(z);
    }
}
