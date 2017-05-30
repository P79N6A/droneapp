package org.c.b.d.c;

import java.util.ArrayList;
import java.util.List;
import org.c.f.a.d;
import org.c.f.a.f;
import org.c.f.a.j;

public class e extends j {
    private final j a;
    private final Object b;
    private final List<d> c;

    public e(j jVar, List<d> list, Object obj) {
        this.a = jVar;
        this.c = list;
        this.b = obj;
    }

    public void a() {
        List arrayList = new ArrayList();
        try {
            this.a.a();
            for (d a : this.c) {
                try {
                    a.a(this.b, new Object[0]);
                } catch (Throwable th) {
                    arrayList.add(th);
                }
            }
        } catch (Throwable th2) {
            arrayList.add(th2);
        }
        f.a(arrayList);
    }
}
