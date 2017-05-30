package b.b;

import java.util.Iterator;
import java.util.List;
import org.c.e.a.a;
import org.c.e.a.b;
import org.c.e.a.d;
import org.c.e.c;
import org.c.e.i;
import org.c.e.l;
import org.c.k;

public class e implements i, b, d, org.c.e.b {
    private final Class<?> a;
    private final l b;
    private final f c;

    public e(Class<?> cls) {
        this(cls, f.a());
    }

    public e(Class<?> cls, f fVar) {
        this.c = fVar;
        this.a = cls;
        this.b = i.b(cls).a();
    }

    private c a(c cVar) {
        if (b(cVar)) {
            return c.a;
        }
        c g = cVar.g();
        Iterator it = cVar.b().iterator();
        while (it.hasNext()) {
            c a = a((c) it.next());
            if (!a.f()) {
                g.a(a);
            }
        }
        return g;
    }

    private boolean b(c cVar) {
        return cVar.b(k.class) != null;
    }

    public int a() {
        return this.b.h();
    }

    public void a(m mVar) {
        this.b.a(this.c.a(mVar, this));
    }

    public void a(a aVar) {
        aVar.a(this.b);
    }

    public void a(org.c.e.a.e eVar) {
        eVar.a(this.b);
    }

    public List<i> b() {
        return this.c.c(d());
    }

    public Class<?> c() {
        return this.a;
    }

    public c d() {
        return a(this.b.d());
    }

    public String toString() {
        return this.a.getName();
    }
}
