package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class pg extends ps {
    private static final Writer a = new Writer() {
        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final od b = new od("closed");
    private final List<nx> c = new ArrayList();
    private String d;
    private nx e = nz.a;

    public pg() {
        super(a);
    }

    private void a(nx nxVar) {
        if (this.d != null) {
            if (!nxVar.k() || i()) {
                ((oa) j()).a(this.d, nxVar);
            }
            this.d = null;
        } else if (this.c.isEmpty()) {
            this.e = nxVar;
        } else {
            nx j = j();
            if (j instanceof nu) {
                ((nu) j).a(nxVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private nx j() {
        return (nx) this.c.get(this.c.size() - 1);
    }

    public nx a() {
        if (this.c.isEmpty()) {
            return this.e;
        }
        String valueOf = String.valueOf(this.c);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Expected one JSON element but was ").append(valueOf).toString());
    }

    public ps a(long j) {
        a(new od(Long.valueOf(j)));
        return this;
    }

    public ps a(Number number) {
        if (number == null) {
            return f();
        }
        if (!g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                String valueOf = String.valueOf(number);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("JSON forbids NaN and infinities: ").append(valueOf).toString());
            }
        }
        a(new od(number));
        return this;
    }

    public ps a(String str) {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        } else if (j() instanceof oa) {
            this.d = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public ps a(boolean z) {
        a(new od(Boolean.valueOf(z)));
        return this;
    }

    public ps b() {
        nx nuVar = new nu();
        a(nuVar);
        this.c.add(nuVar);
        return this;
    }

    public ps b(String str) {
        if (str == null) {
            return f();
        }
        a(new od(str));
        return this;
    }

    public ps c() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        } else if (j() instanceof nu) {
            this.c.remove(this.c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() {
        if (this.c.isEmpty()) {
            this.c.add(b);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public ps d() {
        nx oaVar = new oa();
        a(oaVar);
        this.c.add(oaVar);
        return this;
    }

    public ps e() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        } else if (j() instanceof oa) {
            this.c.remove(this.c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public ps f() {
        a(nz.a);
        return this;
    }

    public void flush() {
    }
}
