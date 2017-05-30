package com.google.android.gms.internal;

import com.google.android.gms.internal.lh.a;

public class ku extends le<ku> {
    private final boolean a;

    public ku(Boolean bool, lh lhVar) {
        super(lhVar);
        this.a = bool.booleanValue();
    }

    protected int a(ku kuVar) {
        return this.a == kuVar.a ? 0 : this.a ? 1 : -1;
    }

    public ku a(lh lhVar) {
        return new ku(Boolean.valueOf(this.a), lhVar);
    }

    public Object a() {
        return Boolean.valueOf(this.a);
    }

    public String a(a aVar) {
        String valueOf = String.valueOf(b(aVar));
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append("boolean:").append(this.a).toString();
    }

    public /* synthetic */ lh b(lh lhVar) {
        return a(lhVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ku)) {
            return false;
        }
        ku kuVar = (ku) obj;
        return this.a == kuVar.a && this.b.equals(kuVar.b);
    }

    public int hashCode() {
        return (this.a ? 1 : 0) + this.b.hashCode();
    }

    protected a p_() {
        return a.Boolean;
    }
}
