package m.framework.ui.widget.slidingmenu;

import java.util.ArrayList;
import java.util.Iterator;

final class d {
    int a;
    String b;
    private ArrayList<e> c = new ArrayList();

    d() {
    }

    int a() {
        return this.c == null ? 0 : this.c.size();
    }

    e a(int i) {
        if (this.c == null) {
            return null;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null && eVar.b == i) {
                return eVar;
            }
        }
        return null;
    }

    void a(e eVar) {
        if (eVar != null) {
            e a = a(eVar.b);
            eVar.a = this.a;
            if (a == null) {
                this.c.add(eVar);
                return;
            }
            int indexOf = this.c.indexOf(a);
            this.c.remove(indexOf);
            this.c.add(indexOf, eVar);
        }
    }

    e b(int i) {
        return (e) this.c.get(i);
    }
}
