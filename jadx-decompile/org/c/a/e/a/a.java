package org.c.a.e.a;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.c.a.e.b;
import org.c.a.e.e;
import org.c.a.e.g;
import org.c.f.a.d;
import org.c.f.a.k;

public class a extends e {
    private final k a;

    static class a extends g {
        private final d a;

        private a(d dVar) {
            this.a = dVar;
        }

        public Object a() {
            try {
                return this.a.a(null, new Object[0]);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException("unexpected: argument length is checked");
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
            } catch (Throwable th) {
                Object obj = th;
                org.c.a.e.a aVar = (org.c.a.e.a) this.a.a(org.c.a.e.a.class);
                boolean z = aVar == null || !a.b(aVar.b(), obj);
                org.c.d.a(z);
                org.c.a.e.g.a aVar2 = new org.c.a.e.g.a(obj);
            }
        }

        public String b() {
            return this.a.b();
        }
    }

    public a(k kVar) {
        this.a = kVar;
    }

    private Object a(Field field) {
        try {
            return field.get(null);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("unexpected: getFields returned an inaccessible field");
        }
    }

    private void a(Class<?> cls, org.c.a.e.d dVar, String str, List<g> list, Object obj) {
        if (cls.isArray()) {
            a(dVar, str, (List) list, obj);
        } else if (Iterable.class.isAssignableFrom(cls)) {
            a(dVar, str, (List) list, (Iterable) obj);
        }
    }

    private void a(org.c.a.e.d dVar, String str, List<g> list, Iterable<?> iterable) {
        int i = 0;
        for (Object next : iterable) {
            if (dVar.a(next)) {
                list.add(g.a(str + "[" + i + "]", next));
            }
            i++;
        }
    }

    private void a(org.c.a.e.d dVar, String str, List<g> list, Object obj) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            Object obj2 = Array.get(obj, i);
            if (dVar.a(obj2)) {
                list.add(g.a(str + "[" + i + "]", obj2));
            }
        }
    }

    private void a(org.c.a.e.d dVar, List<g> list) {
        for (d dVar2 : b(dVar)) {
            Class i = dVar2.i();
            if ((i.isArray() && dVar.b(i.getComponentType())) || Iterable.class.isAssignableFrom(i)) {
                try {
                    a(i, dVar, dVar2.b(), list, dVar2.a(null, new Object[0]));
                } catch (Throwable th) {
                    Object obj = th;
                    b bVar = (b) dVar2.a(b.class);
                    if (bVar != null && b(bVar.b(), obj)) {
                        return;
                    }
                }
            }
        }
    }

    private void b(org.c.a.e.d dVar, List<g> list) {
        for (d dVar2 : e(dVar)) {
            if (dVar.a(dVar2.e())) {
                list.add(new a(dVar2));
            }
        }
    }

    private static boolean b(Class<?>[] clsArr, Object obj) {
        for (Class isAssignableFrom : clsArr) {
            if (isAssignableFrom.isAssignableFrom(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    private void c(org.c.a.e.d dVar, List<g> list) {
        for (Field field : d(dVar)) {
            a(field.getType(), dVar, field.getName(), list, a(field));
        }
    }

    private void d(org.c.a.e.d dVar, List<g> list) {
        for (Field field : c(dVar)) {
            Object a = a(field);
            if (dVar.a(a)) {
                list.add(g.a(field.getName(), a));
            }
        }
    }

    public List<g> a(org.c.a.e.d dVar) {
        List arrayList = new ArrayList();
        d(dVar, arrayList);
        c(dVar, arrayList);
        b(dVar, arrayList);
        a(dVar, arrayList);
        return arrayList;
    }

    protected Collection<d> b(org.c.a.e.d dVar) {
        return this.a.b(b.class);
    }

    protected Collection<Field> c(org.c.a.e.d dVar) {
        List<org.c.f.a.b> c = this.a.c(org.c.a.e.a.class);
        Collection<Field> arrayList = new ArrayList();
        for (org.c.f.a.b d : c) {
            arrayList.add(d.d());
        }
        return arrayList;
    }

    protected Collection<Field> d(org.c.a.e.d dVar) {
        List<org.c.f.a.b> c = this.a.c(b.class);
        Collection<Field> arrayList = new ArrayList();
        for (org.c.f.a.b d : c) {
            arrayList.add(d.d());
        }
        return arrayList;
    }

    protected Collection<d> e(org.c.a.e.d dVar) {
        return this.a.b(org.c.a.e.a.class);
    }
}
