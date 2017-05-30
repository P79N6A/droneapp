package com.google.android.gms.internal;

import com.google.android.gms.internal.lh.a;
import java.util.Map;

public class ky extends le<ky> {
    static final /* synthetic */ boolean a = (!ky.class.desiredAssertionStatus());
    private Map<Object, Object> e;

    public ky(Map<Object, Object> map, lh lhVar) {
        super(lhVar);
        this.e = map;
    }

    protected int a(ky kyVar) {
        return 0;
    }

    public ky a(lh lhVar) {
        if (a || ll.a(lhVar)) {
            return new ky(this.e, lhVar);
        }
        throw new AssertionError();
    }

    public Object a() {
        return this.e;
    }

    public String a(a aVar) {
        String valueOf = String.valueOf(b(aVar));
        String valueOf2 = String.valueOf(this.e);
        return new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(valueOf2).length()).append(valueOf).append("deferredValue:").append(valueOf2).toString();
    }

    public /* synthetic */ lh b(lh lhVar) {
        return a(lhVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ky)) {
            return false;
        }
        ky kyVar = (ky) obj;
        return this.e.equals(kyVar.e) && this.b.equals(kyVar.b);
    }

    public int hashCode() {
        return this.e.hashCode() + this.b.hashCode();
    }

    protected a p_() {
        return a.DeferredValue;
    }
}
