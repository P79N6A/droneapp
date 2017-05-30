package org.b.a;

import org.b.g;
import org.b.p;

public abstract class r extends p<String> {
    protected final String a;

    protected r(String str) {
        this.a = str;
    }

    public void a(String str, g gVar) {
        gVar.a("was \"").a(str).a("\"");
    }

    public void a(g gVar) {
        gVar.a("a string ").a(b()).a(" ").a(this.a);
    }

    protected abstract boolean a(String str);

    protected abstract String b();

    public /* synthetic */ void b(Object obj, g gVar) {
        a((String) obj, gVar);
    }

    public /* synthetic */ boolean b(Object obj) {
        return c((String) obj);
    }

    public boolean c(String str) {
        return a(str);
    }
}
