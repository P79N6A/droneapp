package b.d;

import b.b.b;
import b.b.i;
import b.b.k;
import b.b.l;
import b.b.m;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Enumeration;

public class a implements l {
    PrintStream a;
    int b = 0;

    public a(PrintStream printStream) {
        this.a = printStream;
    }

    void a() {
        b().println();
        b().println("<RETURN> to continue");
    }

    protected void a(long j) {
        b().println();
        b().println("Time: " + b(j));
    }

    public void a(i iVar) {
    }

    public void a(i iVar, b bVar) {
        b().print("F");
    }

    public void a(i iVar, Throwable th) {
        b().print("E");
    }

    protected void a(k kVar) {
        b().print(b.c.a.i(kVar.c()));
    }

    public void a(k kVar, int i) {
        b(kVar, i);
        a(kVar);
    }

    protected void a(m mVar) {
        a(mVar.b(), mVar.a(), "error");
    }

    synchronized void a(m mVar, long j) {
        a(j);
        a(mVar);
        b(mVar);
        c(mVar);
    }

    protected void a(Enumeration<k> enumeration, int i, String str) {
        if (i != 0) {
            if (i == 1) {
                b().println("There was " + i + " " + str + ":");
            } else {
                b().println("There were " + i + " " + str + "s:");
            }
            int i2 = 1;
            while (enumeration.hasMoreElements()) {
                a((k) enumeration.nextElement(), i2);
                i2++;
            }
        }
    }

    public PrintStream b() {
        return this.a;
    }

    protected String b(long j) {
        return NumberFormat.getInstance().format(((double) j) / 1000.0d);
    }

    public void b(i iVar) {
        b().print(".");
        int i = this.b;
        this.b = i + 1;
        if (i >= 40) {
            b().println();
            this.b = 0;
        }
    }

    protected void b(k kVar, int i) {
        b().print(i + ") " + kVar.a());
    }

    protected void b(m mVar) {
        a(mVar.d(), mVar.c(), "failure");
    }

    protected void c(m mVar) {
        if (mVar.h()) {
            b().println();
            b().print("OK");
            b().println(" (" + mVar.e() + " test" + (mVar.e() == 1 ? "" : "s") + ")");
        } else {
            b().println();
            b().println("FAILURES!!!");
            b().println("Tests run: " + mVar.e() + ",  Failures: " + mVar.c() + ",  Errors: " + mVar.a());
        }
        b().println();
    }
}
