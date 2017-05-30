package org.c.e.b;

import java.util.ArrayList;
import java.util.List;
import org.c.e.c;

abstract class c$a {
    private final List<b> a;
    final /* synthetic */ c c;

    c$a(c cVar) {
        this(cVar, c.a(cVar));
    }

    c$a(c cVar, List<b> list) {
        this.c = cVar;
        this.a = list;
    }

    void a() {
        int size = this.a.size();
        List arrayList = new ArrayList(size);
        List arrayList2 = new ArrayList(size);
        for (b bVar : this.a) {
            try {
                a(bVar);
                arrayList.add(bVar);
            } catch (Throwable e) {
                arrayList2.add(new a(c.b, e));
            }
        }
        c.a(this.c, arrayList, arrayList2);
    }

    protected abstract void a(b bVar);
}
