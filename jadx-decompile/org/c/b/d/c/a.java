package org.c.b.d.c;

import org.c.b.b;
import org.c.f.a.j;

public class a extends j {
    private final j a;
    private final Class<? extends Throwable> b;

    public a(j jVar, Class<? extends Throwable> cls) {
        this.a = jVar;
        this.b = cls;
    }

    public void a() {
        Object obj;
        try {
            this.a.a();
            obj = 1;
        } catch (b e) {
            throw e;
        } catch (Throwable th) {
            if (this.b.isAssignableFrom(th.getClass())) {
                obj = null;
            } else {
                Exception exception = new Exception("Unexpected exception, expected<" + this.b.getName() + "> but was<" + th.getClass().getName() + ">", th);
            }
        }
        if (obj != null) {
            throw new AssertionError("Expected exception: " + this.b.getName());
        }
    }
}
