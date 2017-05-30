package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class qy<M extends qx<M>, T> {
    protected final int a;
    protected final Class<T> b;
    public final int c;
    protected final boolean d;

    private qy(int i, Class<T> cls, int i2, boolean z) {
        this.a = i;
        this.b = cls;
        this.c = i2;
        this.d = z;
    }

    public static <M extends qx<M>, T extends rd> qy<M, T> a(int i, Class<T> cls, long j) {
        return new qy(i, cls, (int) j, false);
    }

    private T b(List<rf> list) {
        int i;
        int i2 = 0;
        List arrayList = new ArrayList();
        for (i = 0; i < list.size(); i++) {
            rf rfVar = (rf) list.get(i);
            if (rfVar.b.length != 0) {
                a(rfVar, arrayList);
            }
        }
        i = arrayList.size();
        if (i == 0) {
            return null;
        }
        T cast = this.b.cast(Array.newInstance(this.b.getComponentType(), i));
        while (i2 < i) {
            Array.set(cast, i2, arrayList.get(i2));
            i2++;
        }
        return cast;
    }

    private T c(List<rf> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.b.cast(a(qv.a(((rf) list.get(list.size() - 1)).b)));
    }

    int a(Object obj) {
        return this.d ? b(obj) : c(obj);
    }

    protected Object a(qv qvVar) {
        String valueOf;
        Class componentType = this.d ? this.b.getComponentType() : this.b;
        try {
            rd rdVar;
            switch (this.a) {
                case 10:
                    rdVar = (rd) componentType.newInstance();
                    qvVar.a(rdVar, rg.b(this.c));
                    return rdVar;
                case 11:
                    rdVar = (rd) componentType.newInstance();
                    qvVar.a(rdVar);
                    return rdVar;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            valueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Error creating instance of class ").append(valueOf).toString(), e);
        } catch (Throwable e2) {
            valueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Error creating instance of class ").append(valueOf).toString(), e2);
        } catch (Throwable e22) {
            throw new IllegalArgumentException("Error reading extension field", e22);
        }
    }

    final T a(List<rf> list) {
        return list == null ? null : this.d ? b((List) list) : c((List) list);
    }

    protected void a(rf rfVar, List<Object> list) {
        list.add(a(qv.a(rfVar.b)));
    }

    void a(Object obj, qw qwVar) {
        if (this.d) {
            c(obj, qwVar);
        } else {
            b(obj, qwVar);
        }
    }

    protected int b(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += c(Array.get(obj, i2));
            }
        }
        return i;
    }

    protected void b(Object obj, qw qwVar) {
        try {
            qwVar.g(this.c);
            switch (this.a) {
                case 10:
                    rd rdVar = (rd) obj;
                    int b = rg.b(this.c);
                    qwVar.a(rdVar);
                    qwVar.e(b, 4);
                    return;
                case 11:
                    qwVar.b((rd) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    protected int c(Object obj) {
        int b = rg.b(this.c);
        switch (this.a) {
            case 10:
                return qw.b(b, (rd) obj);
            case 11:
                return qw.c(b, (rd) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.a);
        }
    }

    protected void c(Object obj, qw qwVar) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                b(obj2, qwVar);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy)) {
            return false;
        }
        qy qyVar = (qy) obj;
        return this.a == qyVar.a && this.b == qyVar.b && this.c == qyVar.c && this.d == qyVar.d;
    }

    public int hashCode() {
        return (this.d ? 1 : 0) + ((((((this.a + 1147) * 31) + this.b.hashCode()) * 31) + this.c) * 31);
    }
}
