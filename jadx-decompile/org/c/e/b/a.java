package org.c.e.b;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import org.c.e.c;

public class a implements Serializable {
    private static final long serialVersionUID = 1;
    private final c a;
    private final Throwable b;

    public a(c cVar, Throwable th) {
        this.b = th;
        this.a = cVar;
    }

    public String a() {
        return this.a.a();
    }

    public c b() {
        return this.a;
    }

    public Throwable c() {
        return this.b;
    }

    public String d() {
        Writer stringWriter = new StringWriter();
        c().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public String e() {
        return c().getMessage();
    }

    public String toString() {
        return a() + ": " + this.b.getMessage();
    }
}
