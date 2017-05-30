package org.c.e.a;

import java.util.Comparator;
import org.c.e.c;

public class e implements Comparator<c> {
    public static final e a = new e(new 1());
    private final Comparator<c> b;

    public e(Comparator<c> comparator) {
        this.b = comparator;
    }

    public int a(c cVar, c cVar2) {
        return this.b.compare(cVar, cVar2);
    }

    public void a(Object obj) {
        if (obj instanceof d) {
            ((d) obj).a(this);
        }
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((c) obj, (c) obj2);
    }
}
