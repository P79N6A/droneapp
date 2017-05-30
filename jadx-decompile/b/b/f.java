package b.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.c.e.b.a;
import org.c.e.b.b;
import org.c.e.c;

public class f extends HashMap<c, i> {
    private static final f a = new f();
    private static final long serialVersionUID = 1;

    public static f a() {
        return a;
    }

    public i a(c cVar) {
        if (cVar.c()) {
            return b(cVar);
        }
        if (!containsKey(cVar)) {
            put(cVar, b(cVar));
        }
        return (i) get(cVar);
    }

    public org.c.e.b.c a(final m mVar, e eVar) {
        org.c.e.b.c cVar = new org.c.e.b.c();
        cVar.a(new b(this) {
            final /* synthetic */ f b;

            public void a(a aVar) {
                mVar.a(this.b.a(aVar.b()), aVar.c());
            }

            public void a(c cVar) {
                mVar.a(this.b.a(cVar));
            }

            public void b(c cVar) {
                mVar.b(this.b.a(cVar));
            }
        });
        return cVar;
    }

    i b(c cVar) {
        if (cVar.d()) {
            return new g(cVar);
        }
        n nVar = new n(cVar.a());
        Iterator it = cVar.b().iterator();
        while (it.hasNext()) {
            nVar.a(a((c) it.next()));
        }
        return nVar;
    }

    public List<i> c(c cVar) {
        if (cVar.d()) {
            return Arrays.asList(new i[]{a(cVar)});
        }
        List<i> arrayList = new ArrayList();
        Iterator it = cVar.b().iterator();
        while (it.hasNext()) {
            arrayList.add(a((c) it.next()));
        }
        return arrayList;
    }
}
