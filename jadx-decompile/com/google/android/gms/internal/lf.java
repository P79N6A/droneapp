package com.google.android.gms.internal;

import com.google.android.gms.internal.lh.a;

public class lf extends le<lf> {
    private final long a;

    public lf(Long l, lh lhVar) {
        super(lhVar);
        this.a = l.longValue();
    }

    protected int a(lf lfVar) {
        return mk.a(this.a, lfVar.a);
    }

    public lf a(lh lhVar) {
        return new lf(Long.valueOf(this.a), lhVar);
    }

    public Object a() {
        return Long.valueOf(this.a);
    }

    public String a(a aVar) {
        String valueOf = String.valueOf(String.valueOf(b(aVar)).concat("number:"));
        String valueOf2 = String.valueOf(mk.a((double) this.a));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public /* synthetic */ lh b(lh lhVar) {
        return a(lhVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj;
        return this.a == lfVar.a && this.b.equals(lfVar.b);
    }

    public int hashCode() {
        return ((int) (this.a ^ (this.a >>> 32))) + this.b.hashCode();
    }

    protected a p_() {
        return a.Number;
    }
}
