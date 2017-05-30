package com.google.android.gms.internal;

import com.google.android.gms.internal.lh.a;

public class kz extends le<kz> {
    static final /* synthetic */ boolean a = (!kz.class.desiredAssertionStatus());
    private final Double e;

    public kz(Double d, lh lhVar) {
        super(lhVar);
        this.e = d;
    }

    protected int a(kz kzVar) {
        return this.e.compareTo(kzVar.e);
    }

    public kz a(lh lhVar) {
        if (a || ll.a(lhVar)) {
            return new kz(this.e, lhVar);
        }
        throw new AssertionError();
    }

    public Object a() {
        return this.e;
    }

    public String a(a aVar) {
        String valueOf = String.valueOf(String.valueOf(b(aVar)).concat("number:"));
        String valueOf2 = String.valueOf(mk.a(this.e.doubleValue()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public /* synthetic */ lh b(lh lhVar) {
        return a(lhVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kz)) {
            return false;
        }
        kz kzVar = (kz) obj;
        return this.e.equals(kzVar.e) && this.b.equals(kzVar.b);
    }

    public int hashCode() {
        return this.e.hashCode() + this.b.hashCode();
    }

    protected a p_() {
        return a.Number;
    }
}
