package org.c.d;

import org.b.d;
import org.b.k;
import org.b.n;
import org.c.b.b.b;
import org.c.f.a.j;

public class c implements l {
    private final d a = new d();
    private String b = "Expected test to throw %s";

    private c() {
    }

    public static c a() {
        return new c();
    }

    private void a(Throwable th) {
        if (d()) {
            org.c.c.a((Object) th, this.a.b());
            return;
        }
        throw th;
    }

    private boolean d() {
        return this.a.a();
    }

    private void e() {
        org.c.c.a(f());
    }

    private String f() {
        String b = n.b(this.a.b());
        return String.format(this.b, new Object[]{b});
    }

    public c a(String str) {
        this.b = str;
        return this;
    }

    public j a(j jVar, org.c.e.c cVar) {
        return new a(this, jVar);
    }

    public void a(Class<? extends Throwable> cls) {
        a(d.d(cls));
    }

    public void a(k<?> kVar) {
        this.a.a(kVar);
    }

    @Deprecated
    public c b() {
        return this;
    }

    public void b(String str) {
        b(d.b(str));
    }

    public void b(k<String> kVar) {
        a(org.c.b.b.c.a((k) kVar));
    }

    @Deprecated
    public c c() {
        return this;
    }

    public void c(k<? extends Throwable> kVar) {
        a(b.a((k) kVar));
    }
}
