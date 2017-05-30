package org.c.d;

import java.util.ArrayList;
import java.util.List;
import org.c.b.b;
import org.c.e.c;
import org.c.f.a.f;
import org.c.f.a.j;

class m$1 extends j {
    final /* synthetic */ c a;
    final /* synthetic */ j b;
    final /* synthetic */ m c;

    m$1(m mVar, c cVar, j jVar) {
        this.c = mVar;
        this.a = cVar;
        this.b = jVar;
    }

    public void a() {
        List arrayList = new ArrayList();
        m.a(this.c, this.a, arrayList);
        try {
            this.b.a();
            m.b(this.c, this.a, arrayList);
        } catch (b e) {
            arrayList.add(e);
            m.a(this.c, e, this.a, arrayList);
        } catch (Throwable th) {
            arrayList.add(th);
            m.a(this.c, th, this.a, arrayList);
        } finally {
            m.c(this.c, this.a, arrayList);
        }
        f.a(arrayList);
    }
}
