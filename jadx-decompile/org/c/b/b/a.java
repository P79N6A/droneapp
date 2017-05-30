package org.c.b.b;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.b.g;
import org.b.i;
import org.b.k;
import org.b.p;

public class a<T extends Throwable> extends p<T> {
    private final k<T> a;

    public a(k<T> kVar) {
        this.a = kVar;
    }

    @i
    public static <T extends Throwable> k<T> a(k<T> kVar) {
        return new a(kVar);
    }

    private String b(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @i
    public static <T extends Exception> k<T> b(k<T> kVar) {
        return new a(kVar);
    }

    protected void a(T t, g gVar) {
        this.a.a(t, gVar);
        gVar.a("\nStacktrace was: ");
        gVar.a(b((Throwable) t));
    }

    public void a(g gVar) {
        this.a.a(gVar);
    }

    protected boolean a(T t) {
        return this.a.a(t);
    }

    protected /* synthetic */ void b(Object obj, g gVar) {
        a((Throwable) obj, gVar);
    }

    protected /* synthetic */ boolean b(Object obj) {
        return a((Throwable) obj);
    }
}
