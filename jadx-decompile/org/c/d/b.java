package org.c.d;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.b.k;
import org.c.c;
import org.c.f.a.f;

public class b extends p {
    private List<Throwable> a = new ArrayList();

    public <T> T a(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            a(th);
            return null;
        }
    }

    protected void a() {
        f.a(this.a);
    }

    public <T> void a(T t, k<T> kVar) {
        a("", t, kVar);
    }

    public <T> void a(final String str, final T t, final k<T> kVar) {
        a(new Callable<Object>(this) {
            final /* synthetic */ b d;

            public Object call() {
                c.a(str, t, kVar);
                return t;
            }
        });
    }

    public void a(Throwable th) {
        this.a.add(th);
    }
}
