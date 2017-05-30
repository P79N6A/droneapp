package org.c.a.e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.c.a.e.a.e;
import org.c.c;
import org.c.f.a.d;
import org.c.f.a.j;
import org.c.f.a.k;
import org.c.f.b;

public class h extends b {

    public static class a extends j {
        private int a = 0;
        private final d b;
        private final k c;
        private List<org.c.b.b> d = new ArrayList();

        public a(d dVar, k kVar) {
            this.b = dVar;
            this.c = kVar;
        }

        private j a(final d dVar, final org.c.a.e.a.b bVar, final Object obj) {
            return new j(this) {
                final /* synthetic */ a d;

                public void a() {
                    Object[] e = bVar.e();
                    if (!this.d.d()) {
                        org.c.d.a(e);
                    }
                    dVar.a(obj, e);
                }
            };
        }

        private k c() {
            return this.c;
        }

        private boolean d() {
            i iVar = (i) this.b.d().getAnnotation(i.class);
            return iVar == null ? false : iVar.a();
        }

        public void a() {
            a(org.c.a.e.a.b.a(this.b.d(), c()));
            Object obj = this.b.a(i.class) != null ? 1 : null;
            if (this.a == 0 && obj != null) {
                c.a("Never found parameters that satisfied method assumptions.  Violated assumptions: " + this.d);
            }
        }

        protected void a(Throwable th, Object... objArr) {
            if (objArr.length == 0) {
                throw th;
            }
            throw new e(th, this.b.b(), objArr);
        }

        protected void a(org.c.a.e.a.b bVar) {
            if (bVar.a()) {
                c(bVar);
            } else {
                b(bVar);
            }
        }

        protected void a(org.c.b.b bVar) {
            this.d.add(bVar);
        }

        protected void b() {
            this.a++;
        }

        protected void b(org.c.a.e.a.b bVar) {
            for (g a : bVar.c()) {
                a(bVar.a(a));
            }
        }

        protected void c(final org.c.a.e.a.b bVar) {
            new b(this, c().d()) {
                final /* synthetic */ a b;

                public j a(d dVar) {
                    final j a = super.a(dVar);
                    return new j(this) {
                        final /* synthetic */ AnonymousClass1 b;

                        public void a() {
                            try {
                                a.a();
                                this.b.b.b();
                            } catch (org.c.b.b e) {
                                this.b.b.a(e);
                            } catch (Throwable th) {
                                this.b.b.a(th, bVar.a(this.b.b.d()));
                            }
                        }
                    };
                }

                protected j a(d dVar, Object obj) {
                    return this.b.a(dVar, bVar, obj);
                }

                protected void a(List<Throwable> list) {
                }

                public Object b() {
                    Object[] d = bVar.d();
                    if (!this.b.d()) {
                        org.c.d.a(d);
                    }
                    return g().f().newInstance(d);
                }
            }.a(this.b).a();
        }
    }

    public h(Class<?> cls) {
        super(cls);
    }

    private void a(Class<? extends e> cls, List<Throwable> list) {
        Constructor[] constructors = cls.getConstructors();
        if (constructors.length != 1) {
            list.add(new Error("ParameterSupplier " + cls.getName() + " must have only one constructor (either empty or taking only a TestClass)"));
            return;
        }
        Class[] parameterTypes = constructors[0].getParameterTypes();
        if (parameterTypes.length != 0 && !parameterTypes[0].equals(k.class)) {
            list.add(new Error("ParameterSupplier " + cls.getName() + " constructor must take either nothing or a single TestClass instance"));
        }
    }

    private void i(List<Throwable> list) {
        for (Field field : g().d().getDeclaredFields()) {
            if (field.getAnnotation(a.class) != null || field.getAnnotation(b.class) != null) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be static"));
                }
                if (!Modifier.isPublic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be public"));
                }
            }
        }
    }

    private void j(List<Throwable> list) {
        for (Method method : g().d().getDeclaredMethods()) {
            if (method.getAnnotation(a.class) != null || method.getAnnotation(b.class) != null) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be static"));
                }
                if (!Modifier.isPublic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be public"));
                }
            }
        }
    }

    protected List<d> a() {
        List<d> arrayList = new ArrayList(super.a());
        Collection b = g().b(i.class);
        arrayList.removeAll(b);
        arrayList.addAll(b);
        return arrayList;
    }

    public j a(d dVar) {
        return new a(dVar, g());
    }

    protected void a(List<Throwable> list) {
        super.a(list);
        i(list);
        j(list);
    }

    protected void b(List<Throwable> list) {
        e(list);
    }

    protected void c(List<Throwable> list) {
        for (d dVar : a()) {
            if (dVar.a(i.class) != null) {
                dVar.b(false, list);
                dVar.b(list);
            } else {
                dVar.a(false, list);
            }
            Iterator it = d.a(dVar.d()).iterator();
            while (it.hasNext()) {
                f fVar = (f) ((d) it.next()).d(f.class);
                if (fVar != null) {
                    a(fVar.a(), list);
                }
            }
        }
    }
}
