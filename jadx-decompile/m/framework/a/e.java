package m.framework.a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class e extends c {
    private ArrayList<c> a = new ArrayList();

    protected InputStream a() {
        InputStream fVar = new f();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            fVar.a(((c) it.next()).a());
        }
        return fVar;
    }

    public e a(c cVar) {
        this.a.add(cVar);
        return this;
    }

    protected long b() {
        Iterator it = this.a.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = ((c) it.next()).b() + j;
        }
        return j;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuilder.append(((c) it.next()).toString());
        }
        return stringBuilder.toString();
    }
}
