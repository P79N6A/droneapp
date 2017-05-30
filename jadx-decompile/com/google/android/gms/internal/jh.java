package com.google.android.gms.internal;

public abstract class jh {
    protected final a b;
    protected final ji c;
    protected final ij d;

    public enum a {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    protected jh(a aVar, ji jiVar, ij ijVar) {
        this.b = aVar;
        this.c = jiVar;
        this.d = ijVar;
    }

    public abstract jh a(kv kvVar);

    public ij c() {
        return this.d;
    }

    public ji d() {
        return this.c;
    }

    public a e() {
        return this.b;
    }
}
