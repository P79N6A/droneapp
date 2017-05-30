package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ra implements Cloneable {
    private qy<?, ?> a;
    private Object b;
    private List<rf> c = new ArrayList();

    ra() {
    }

    private byte[] c() {
        byte[] bArr = new byte[a()];
        a(qw.a(bArr));
        return bArr;
    }

    int a() {
        if (this.b != null) {
            return this.a.a(this.b);
        }
        int i = 0;
        for (rf a : this.c) {
            i = a.a() + i;
        }
        return i;
    }

    <T> T a(qy<?, T> qyVar) {
        if (this.b == null) {
            this.a = qyVar;
            this.b = qyVar.a(this.c);
            this.c = null;
        } else if (!this.a.equals(qyVar)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return this.b;
    }

    void a(qw qwVar) {
        if (this.b != null) {
            this.a.a(this.b, qwVar);
            return;
        }
        for (rf a : this.c) {
            a.a(qwVar);
        }
    }

    void a(rf rfVar) {
        this.c.add(rfVar);
    }

    public final ra b() {
        ra raVar = new ra();
        try {
            raVar.a = this.a;
            if (this.c == null) {
                raVar.c = null;
            } else {
                raVar.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof rd) {
                    raVar.b = (rd) ((rd) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    raVar.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    r4 = new byte[bArr.length][];
                    raVar.b = r4;
                    for (r2 = 0; r2 < bArr.length; r2++) {
                        r4[r2] = (byte[]) bArr[r2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    raVar.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    raVar.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    raVar.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    raVar.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    raVar.b = ((double[]) this.b).clone();
                } else if (this.b instanceof rd[]) {
                    rd[] rdVarArr = (rd[]) this.b;
                    r4 = new rd[rdVarArr.length];
                    raVar.b = r4;
                    for (r2 = 0; r2 < rdVarArr.length; r2++) {
                        r4[r2] = (rd) rdVarArr[r2].clone();
                    }
                }
            }
            return raVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public /* synthetic */ Object clone() {
        return b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (this.b != null && raVar.b != null) {
            return this.a == raVar.a ? !this.a.b.isArray() ? this.b.equals(raVar.b) : this.b instanceof byte[] ? Arrays.equals((byte[]) this.b, (byte[]) raVar.b) : this.b instanceof int[] ? Arrays.equals((int[]) this.b, (int[]) raVar.b) : this.b instanceof long[] ? Arrays.equals((long[]) this.b, (long[]) raVar.b) : this.b instanceof float[] ? Arrays.equals((float[]) this.b, (float[]) raVar.b) : this.b instanceof double[] ? Arrays.equals((double[]) this.b, (double[]) raVar.b) : this.b instanceof boolean[] ? Arrays.equals((boolean[]) this.b, (boolean[]) raVar.b) : Arrays.deepEquals((Object[]) this.b, (Object[]) raVar.b) : false;
        } else {
            if (this.c != null && raVar.c != null) {
                return this.c.equals(raVar.c);
            }
            try {
                return Arrays.equals(c(), raVar.c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
