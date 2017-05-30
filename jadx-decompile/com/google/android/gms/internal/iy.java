package com.google.android.gms.internal;

public class iy {
    private final long a;
    private final ij b;
    private final lh c;
    private final ia d;
    private final boolean e;

    public iy(long j, ij ijVar, ia iaVar) {
        this.a = j;
        this.b = ijVar;
        this.c = null;
        this.d = iaVar;
        this.e = true;
    }

    public iy(long j, ij ijVar, lh lhVar, boolean z) {
        this.a = j;
        this.b = ijVar;
        this.c = lhVar;
        this.d = null;
        this.e = z;
    }

    public long a() {
        return this.a;
    }

    public ij b() {
        return this.b;
    }

    public lh c() {
        if (this.c != null) {
            return this.c;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public ia d() {
        if (this.d != null) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public boolean e() {
        return this.c != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iy iyVar = (iy) obj;
        if (this.a != iyVar.a) {
            return false;
        }
        if (!this.b.equals(iyVar.b)) {
            return false;
        }
        if (this.e != iyVar.e) {
            return false;
        }
        if (!this.c == null ? this.c.equals(iyVar.c) : iyVar.c == null) {
            return false;
        }
        if (this.d != null) {
            if (this.d.equals(iyVar.d)) {
                return true;
            }
        } else if (iyVar.d == null) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.e;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.c != null ? this.c.hashCode() : 0) + (((((Long.valueOf(this.a).hashCode() * 31) + Boolean.valueOf(this.e).hashCode()) * 31) + this.b.hashCode()) * 31)) * 31;
        if (this.d != null) {
            i = this.d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.e;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        return new StringBuilder(((String.valueOf(valueOf).length() + 78) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("UserWriteRecord{id=").append(j).append(" path=").append(valueOf).append(" visible=").append(z).append(" overwrite=").append(valueOf2).append(" merge=").append(valueOf3).append("}").toString();
    }
}
