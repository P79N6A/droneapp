package org.c.e.a;

import java.util.Iterator;
import org.c.e.c;

class a$2 extends a {
    final /* synthetic */ c b;

    a$2(c cVar) {
        this.b = cVar;
    }

    public String a() {
        return String.format("Method %s", new Object[]{this.b.a()});
    }

    public boolean a(c cVar) {
        if (cVar.d()) {
            return this.b.equals(cVar);
        }
        Iterator it = cVar.b().iterator();
        while (it.hasNext()) {
            if (a((c) it.next())) {
                return true;
            }
        }
        return false;
    }
}
