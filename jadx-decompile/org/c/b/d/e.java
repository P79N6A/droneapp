package org.c.b.d;

import b.b.i;
import b.b.j;
import b.b.m;
import b.b.n;
import java.lang.annotation.Annotation;
import org.c.e.a.b;
import org.c.e.a.d;
import org.c.e.b.c;
import org.c.e.l;

public class e extends l implements b, d {
    private volatile i a;

    private static final class a implements b.b.l {
        private final c a;

        private a(c cVar) {
            this.a = cVar;
        }

        private org.c.e.c c(i iVar) {
            return iVar instanceof org.c.e.b ? ((org.c.e.b) iVar).d() : org.c.e.c.a(d(iVar), e(iVar));
        }

        private Class<? extends i> d(i iVar) {
            return iVar.getClass();
        }

        private String e(i iVar) {
            return iVar instanceof j ? ((j) iVar).j() : iVar.toString();
        }

        public void a(i iVar) {
            this.a.d(c(iVar));
        }

        public void a(i iVar, b.b.b bVar) {
            a(iVar, (Throwable) bVar);
        }

        public void a(i iVar, Throwable th) {
            this.a.a(new org.c.e.b.a(c(iVar), th));
        }

        public void b(i iVar) {
            this.a.b(c(iVar));
        }
    }

    public e(i iVar) {
        b(iVar);
    }

    public e(Class<?> cls) {
        this(new n(cls.asSubclass(j.class)));
    }

    private i a() {
        return this.a;
    }

    private static String a(n nVar) {
        String str;
        if (nVar.a() == 0) {
            str = "";
        } else {
            str = String.format(" [example: %s]", new Object[]{nVar.a(0)});
        }
        return String.format("TestSuite with %s tests%s", new Object[]{Integer.valueOf(r1), str});
    }

    private static org.c.e.c a(i iVar) {
        int i = 0;
        if (iVar instanceof j) {
            j jVar = (j) iVar;
            return org.c.e.c.a(jVar.getClass(), jVar.j(), a(jVar));
        } else if (!(iVar instanceof n)) {
            return iVar instanceof org.c.e.b ? ((org.c.e.b) iVar).d() : iVar instanceof b.a.c ? a(((b.a.c) iVar).b()) : org.c.e.c.a(iVar.getClass());
        } else {
            n nVar = (n) iVar;
            org.c.e.c a = org.c.e.c.a(nVar.c() == null ? a(nVar) : nVar.c(), new Annotation[0]);
            int d = nVar.d();
            while (i < d) {
                a.a(a(nVar.a(i)));
                i++;
            }
            return a;
        }
    }

    private static Annotation[] a(j jVar) {
        try {
            return jVar.getClass().getMethod(jVar.j(), new Class[0]).getDeclaredAnnotations();
        } catch (SecurityException e) {
            return new Annotation[0];
        } catch (NoSuchMethodException e2) {
            return new Annotation[0];
        }
    }

    private void b(i iVar) {
        this.a = iVar;
    }

    public void a(org.c.e.a.a aVar) {
        if (a() instanceof b) {
            ((b) a()).a(aVar);
        } else if (a() instanceof n) {
            n nVar = (n) a();
            i nVar2 = new n(nVar.c());
            int d = nVar.d();
            for (int i = 0; i < d; i++) {
                i a = nVar.a(i);
                if (aVar.a(a(a))) {
                    nVar2.a(a);
                }
            }
            b(nVar2);
            if (nVar2.d() == 0) {
                throw new org.c.e.a.c();
            }
        }
    }

    public void a(org.c.e.a.e eVar) {
        if (a() instanceof d) {
            ((d) a()).a(eVar);
        }
    }

    public void a(c cVar) {
        m mVar = new m();
        mVar.a(b(cVar));
        a().a(mVar);
    }

    public b.b.l b(c cVar) {
        return new a(cVar);
    }

    public org.c.e.c d() {
        return a(a());
    }
}
