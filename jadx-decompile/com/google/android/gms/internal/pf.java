package com.google.android.gms.internal;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class pf extends pp {
    private static final Reader a = new Reader() {
        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final Object b = new Object();
    private final List<Object> c = new ArrayList();

    public pf(nx nxVar) {
        super(a);
        this.c.add(nxVar);
    }

    private void a(pq pqVar) {
        if (f() != pqVar) {
            String valueOf = String.valueOf(pqVar);
            String valueOf2 = String.valueOf(f());
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
        }
    }

    private Object r() {
        return this.c.get(this.c.size() - 1);
    }

    private Object s() {
        return this.c.remove(this.c.size() - 1);
    }

    public void a() {
        a(pq.BEGIN_ARRAY);
        this.c.add(((nu) r()).iterator());
    }

    public void b() {
        a(pq.END_ARRAY);
        s();
        s();
    }

    public void c() {
        a(pq.BEGIN_OBJECT);
        this.c.add(((oa) r()).a().iterator());
    }

    public void close() {
        this.c.clear();
        this.c.add(b);
    }

    public void d() {
        a(pq.END_OBJECT);
        s();
        s();
    }

    public boolean e() {
        pq f = f();
        return (f == pq.END_OBJECT || f == pq.END_ARRAY) ? false : true;
    }

    public pq f() {
        if (this.c.isEmpty()) {
            return pq.END_DOCUMENT;
        }
        Object r = r();
        if (r instanceof Iterator) {
            boolean z = this.c.get(this.c.size() - 2) instanceof oa;
            Iterator it = (Iterator) r;
            if (!it.hasNext()) {
                return z ? pq.END_OBJECT : pq.END_ARRAY;
            } else {
                if (z) {
                    return pq.NAME;
                }
                this.c.add(it.next());
                return f();
            }
        } else if (r instanceof oa) {
            return pq.BEGIN_OBJECT;
        } else {
            if (r instanceof nu) {
                return pq.BEGIN_ARRAY;
            }
            if (r instanceof od) {
                od odVar = (od) r;
                if (odVar.q()) {
                    return pq.STRING;
                }
                if (odVar.a()) {
                    return pq.BOOLEAN;
                }
                if (odVar.p()) {
                    return pq.NUMBER;
                }
                throw new AssertionError();
            } else if (r instanceof nz) {
                return pq.NULL;
            } else {
                if (r == b) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public String g() {
        a(pq.NAME);
        Entry entry = (Entry) ((Iterator) r()).next();
        this.c.add(entry.getValue());
        return (String) entry.getKey();
    }

    public String h() {
        pq f = f();
        if (f == pq.STRING || f == pq.NUMBER) {
            return ((od) s()).c();
        }
        String valueOf = String.valueOf(pq.STRING);
        String valueOf2 = String.valueOf(f);
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    public boolean i() {
        a(pq.BOOLEAN);
        return ((od) s()).g();
    }

    public void j() {
        a(pq.NULL);
        s();
    }

    public double k() {
        pq f = f();
        if (f == pq.NUMBER || f == pq.STRING) {
            double d = ((od) r()).d();
            if (p() || !(Double.isNaN(d) || Double.isInfinite(d))) {
                s();
                return d;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + d);
        }
        String valueOf = String.valueOf(pq.NUMBER);
        String valueOf2 = String.valueOf(f);
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    public long l() {
        pq f = f();
        if (f == pq.NUMBER || f == pq.STRING) {
            long e = ((od) r()).e();
            s();
            return e;
        }
        String valueOf = String.valueOf(pq.NUMBER);
        String valueOf2 = String.valueOf(f);
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    public int m() {
        pq f = f();
        if (f == pq.NUMBER || f == pq.STRING) {
            int f2 = ((od) r()).f();
            s();
            return f2;
        }
        String valueOf = String.valueOf(pq.NUMBER);
        String valueOf2 = String.valueOf(f);
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    public void n() {
        if (f() == pq.NAME) {
            g();
        } else {
            s();
        }
    }

    public void o() {
        a(pq.NAME);
        Entry entry = (Entry) ((Iterator) r()).next();
        this.c.add(entry.getValue());
        this.c.add(new od((String) entry.getKey()));
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
