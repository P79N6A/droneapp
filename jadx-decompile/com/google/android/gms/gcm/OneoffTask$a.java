package com.google.android.gms.gcm;

import android.os.Bundle;

public class OneoffTask$a extends Task$a {
    private long i;
    private long j;

    public OneoffTask$a() {
        this.i = -1;
        this.j = -1;
        this.e = false;
    }

    public OneoffTask$a a(int i) {
        this.a = i;
        return this;
    }

    public OneoffTask$a a(long j, long j2) {
        this.i = j;
        this.j = j2;
        return this;
    }

    public OneoffTask$a a(Bundle bundle) {
        this.h = bundle;
        return this;
    }

    public OneoffTask$a a(Class<? extends GcmTaskService> cls) {
        this.b = cls.getName();
        return this;
    }

    public OneoffTask$a a(String str) {
        this.c = str;
        return this;
    }

    public OneoffTask$a a(boolean z) {
        this.f = z;
        return this;
    }

    protected void a() {
        super.a();
        if (this.i == -1 || this.j == -1) {
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        } else if (this.i >= this.j) {
            throw new IllegalArgumentException("Window start must be shorter than window end.");
        }
    }

    public OneoffTask$a b(boolean z) {
        this.e = z;
        return this;
    }

    public OneoffTask b() {
        a();
        return new OneoffTask(this, null);
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

    public OneoffTask$a c(boolean z) {
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
