package com.google.android.gms.internal;

public class js {
    public final long a;
    public final kg b;
    public final long c;
    public final boolean d;
    public final boolean e;

    public js(long j, kg kgVar, long j2, boolean z, boolean z2) {
        this.a = j;
        if (!kgVar.e() || kgVar.d()) {
            this.b = kgVar;
            this.c = j2;
            this.d = z;
            this.e = z2;
            return;
        }
        throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
    }

    public js a() {
        return new js(this.a, this.b, this.c, true, this.e);
    }

    public js a(long j) {
        return new js(this.a, this.b, j, this.d, this.e);
    }

    public js a(boolean z) {
        return new js(this.a, this.b, this.c, this.d, z);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        js jsVar = (js) obj;
        return this.a == jsVar.a && this.b.equals(jsVar.b) && this.c == jsVar.c && this.d == jsVar.d && this.e == jsVar.e;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.a).hashCode() * 31) + this.b.hashCode()) * 31) + Long.valueOf(this.c).hashCode()) * 31) + Boolean.valueOf(this.d).hashCode()) * 31) + Boolean.valueOf(this.e).hashCode();
    }

    public String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        long j2 = this.c;
        boolean z = this.d;
        return new StringBuilder(String.valueOf(valueOf).length() + 109).append("TrackedQuery{id=").append(j).append(", querySpec=").append(valueOf).append(", lastUse=").append(j2).append(", complete=").append(z).append(", active=").append(this.e).append("}").toString();
    }
}
