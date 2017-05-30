package com.google.android.gms.internal;

import com.google.firebase.database.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ij implements Comparable<ij>, Iterable<kv> {
    static final /* synthetic */ boolean a = (!ij.class.desiredAssertionStatus());
    private static final ij e = new ij("");
    private final kv[] b;
    private final int c;
    private final int d;

    public ij(String str) {
        String[] split = str.split("/");
        int i = 0;
        for (String length : split) {
            if (length.length() > 0) {
                i++;
            }
        }
        this.b = new kv[i];
        int length2 = split.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            String str2 = split[i2];
            if (str2.length() > 0) {
                i = i3 + 1;
                this.b[i3] = kv.a(str2);
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        this.c = 0;
        this.d = this.b.length;
    }

    public ij(List<String> list) {
        this.b = new kv[list.size()];
        int i = 0;
        for (String a : list) {
            int i2 = i + 1;
            this.b[i] = kv.a(a);
            i = i2;
        }
        this.c = 0;
        this.d = list.size();
    }

    public ij(kv... kvVarArr) {
        this.b = (kv[]) Arrays.copyOf(kvVarArr, kvVarArr.length);
        this.c = 0;
        this.d = kvVarArr.length;
        int length = kvVarArr.length;
        int i = 0;
        while (i < length) {
            kv kvVar = kvVarArr[i];
            if (a || kvVar != null) {
                i++;
            } else {
                throw new AssertionError("Can't construct a path with a null value!");
            }
        }
    }

    private ij(kv[] kvVarArr, int i, int i2) {
        this.b = kvVarArr;
        this.c = i;
        this.d = i2;
    }

    public static ij a() {
        return e;
    }

    public static ij a(ij ijVar, ij ijVar2) {
        kv d = ijVar.d();
        kv d2 = ijVar2.d();
        if (d == null) {
            return ijVar2;
        }
        if (d.equals(d2)) {
            return a(ijVar.e(), ijVar2.e());
        }
        String valueOf = String.valueOf(ijVar2);
        String valueOf2 = String.valueOf(ijVar);
        throw new d(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("INTERNAL ERROR: ").append(valueOf).append(" is not contained in ").append(valueOf2).toString());
    }

    public ij a(ij ijVar) {
        int i = i() + ijVar.i();
        Object obj = new kv[i];
        System.arraycopy(this.b, this.c, obj, 0, i());
        System.arraycopy(ijVar.b, ijVar.c, obj, i(), ijVar.i());
        return new ij(obj, 0, i);
    }

    public ij a(kv kvVar) {
        int i = i();
        Object obj = new kv[(i + 1)];
        System.arraycopy(this.b, this.c, obj, 0, i);
        obj[i] = kvVar;
        return new ij(obj, 0, i + 1);
    }

    public String b() {
        if (h()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.c; i < this.d; i++) {
            if (i > this.c) {
                stringBuilder.append("/");
            }
            stringBuilder.append(this.b[i].e());
        }
        return stringBuilder.toString();
    }

    public boolean b(ij ijVar) {
        if (i() > ijVar.i()) {
            return false;
        }
        int i = this.c;
        int i2 = ijVar.c;
        while (i < this.d) {
            if (!this.b[i].equals(ijVar.b[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public int c(ij ijVar) {
        int i = this.c;
        int i2 = ijVar.c;
        while (i < this.d && i2 < ijVar.d) {
            int a = this.b[i].a(ijVar.b[i2]);
            if (a != 0) {
                return a;
            }
            i++;
            i2++;
        }
        return (i == this.d && i2 == ijVar.d) ? 0 : i == this.d ? -1 : 1;
    }

    public List<String> c() {
        List<String> arrayList = new ArrayList(i());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((kv) it.next()).e());
        }
        return arrayList;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return c((ij) obj);
    }

    public kv d() {
        return h() ? null : this.b[this.c];
    }

    public ij e() {
        int i = this.c;
        if (!h()) {
            i++;
        }
        return new ij(this.b, i, this.d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ij)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ij ijVar = (ij) obj;
        if (i() != ijVar.i()) {
            return false;
        }
        int i = this.c;
        int i2 = ijVar.c;
        while (i < this.d && i2 < ijVar.d) {
            if (!this.b[i].equals(ijVar.b[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public ij f() {
        return h() ? null : new ij(this.b, this.c, this.d - 1);
    }

    public kv g() {
        return !h() ? this.b[this.d - 1] : null;
    }

    public boolean h() {
        return this.c >= this.d;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = this.c; i2 < this.d; i2++) {
            i = (i * 37) + this.b[i2].hashCode();
        }
        return i;
    }

    public int i() {
        return this.d - this.c;
    }

    public Iterator<kv> iterator() {
        return new Iterator<kv>(this) {
            int a = this.b.c;
            final /* synthetic */ ij b;

            {
                this.b = r2;
            }

            public kv a() {
                if (hasNext()) {
                    kv kvVar = this.b.b[this.a];
                    this.a++;
                    return kvVar;
                }
                throw new NoSuchElementException("No more elements.");
            }

            public boolean hasNext() {
                return this.a < this.b.d;
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
            }
        };
    }

    public String toString() {
        if (h()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.c; i < this.d; i++) {
            stringBuilder.append("/");
            stringBuilder.append(this.b[i].e());
        }
        return stringBuilder.toString();
    }
}
