package b.b;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class k {
    protected i a;
    protected Throwable b;

    public k(i iVar, Throwable th) {
        this.a = iVar;
        this.b = th;
    }

    public i a() {
        return this.a;
    }

    public Throwable b() {
        return this.b;
    }

    public String c() {
        Writer stringWriter = new StringWriter();
        b().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public String d() {
        return b().getMessage();
    }

    public boolean e() {
        return b() instanceof b;
    }

    public String toString() {
        return this.a + ": " + this.b.getMessage();
    }
}
