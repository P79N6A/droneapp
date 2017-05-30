package org.c.b;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.List;
import org.c.e.b.a;
import org.c.e.b.b;
import org.c.e.c;

public class j extends b {
    private final PrintStream a;

    public j(PrintStream printStream) {
        this.a = printStream;
    }

    public j(g gVar) {
        this(gVar.a());
    }

    private PrintStream a() {
        return this.a;
    }

    protected void a(long j) {
        a().println();
        a().println("Time: " + b(j));
    }

    public void a(a aVar) {
        this.a.append('E');
    }

    protected void a(a aVar, String str) {
        a().println(str + ") " + aVar.a());
        a().print(aVar.d());
    }

    public void a(org.c.e.j jVar) {
        a(jVar.c());
        b(jVar);
        c(jVar);
    }

    protected String b(long j) {
        return NumberFormat.getInstance().format(((double) j) / 1000.0d);
    }

    public void b(c cVar) {
        this.a.append('.');
    }

    protected void b(org.c.e.j jVar) {
        List<a> d = jVar.d();
        if (d.size() != 0) {
            if (d.size() == 1) {
                a().println("There was " + d.size() + " failure:");
            } else {
                a().println("There were " + d.size() + " failures:");
            }
            int i = 1;
            for (a aVar : d) {
                StringBuilder append = new StringBuilder().append("");
                int i2 = i + 1;
                a(aVar, append.append(i).toString());
                i = i2;
            }
        }
    }

    public void c(c cVar) {
        this.a.append('I');
    }

    protected void c(org.c.e.j jVar) {
        if (jVar.f()) {
            a().println();
            a().print("OK");
            a().println(" (" + jVar.a() + " test" + (jVar.a() == 1 ? "" : "s") + ")");
        } else {
            a().println();
            a().println("FAILURES!!!");
            a().println("Tests run: " + jVar.a() + ",  Failures: " + jVar.b());
        }
        a().println();
    }
}
