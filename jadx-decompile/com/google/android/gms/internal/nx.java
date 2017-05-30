package com.google.android.gms.internal;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class nx {
    public Number b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean h() {
        return this instanceof nu;
    }

    public boolean i() {
        return this instanceof oa;
    }

    public boolean j() {
        return this instanceof od;
    }

    public boolean k() {
        return this instanceof nz;
    }

    public oa l() {
        if (i()) {
            return (oa) this;
        }
        String valueOf = String.valueOf(this);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Not a JSON Object: ").append(valueOf).toString());
    }

    public nu m() {
        if (h()) {
            return (nu) this;
        }
        throw new IllegalStateException("This is not a JSON Array.");
    }

    public od n() {
        if (j()) {
            return (od) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    Boolean o() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            Writer stringWriter = new StringWriter();
            ps psVar = new ps(stringWriter);
            psVar.b(true);
            oz.a(this, psVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
