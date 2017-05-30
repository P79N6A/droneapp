package org.c.f.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.c.b.d.a.b;
import org.c.b.k;

public class f extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> a;

    public f(List<Throwable> list) {
        this.a = new ArrayList(list);
    }

    public static void a(List<Throwable> list) {
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                throw k.a((Throwable) list.get(0));
            }
            throw new b(list);
        }
    }

    public List<Throwable> a() {
        return Collections.unmodifiableList(this.a);
    }

    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder(String.format("There were %d errors:", new Object[]{Integer.valueOf(this.a.size())}));
        for (Throwable th : this.a) {
            stringBuilder.append(String.format("\n  %s(%s)", new Object[]{th.getClass().getName(), th.getMessage()}));
        }
        return stringBuilder.toString();
    }
}
