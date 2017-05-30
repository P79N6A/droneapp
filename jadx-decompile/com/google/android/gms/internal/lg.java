package com.google.android.gms.internal;

public class lg {
    private static final lg c = new lg(kv.a(), la.j());
    private static final lg d = new lg(kv.b(), lh.d);
    private final kv a;
    private final lh b;

    public lg(kv kvVar, lh lhVar) {
        this.a = kvVar;
        this.b = lhVar;
    }

    public static lg a() {
        return c;
    }

    public static lg b() {
        return d;
    }

    public kv c() {
        return this.a;
    }

    public lh d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lg lgVar = (lg) obj;
        return !this.a.equals(lgVar.a) ? false : this.b.equals(lgVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append("NamedNode{name=").append(valueOf).append(", node=").append(valueOf2).append("}").toString();
    }
}
