package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class pj implements ok {
    private final os a;
    private final nq b;
    private final ot c;

    static abstract class b {
        final String g;
        final boolean h;
        final boolean i;

        protected b(String str, boolean z, boolean z2) {
            this.g = str;
            this.h = z;
            this.i = z2;
        }

        abstract void a(pp ppVar, Object obj);

        abstract void a(ps psVar, Object obj);

        abstract boolean a(Object obj);
    }

    public static final class a<T> extends oj<T> {
        private final ox<T> a;
        private final Map<String, b> b;

        private a(ox<T> oxVar, Map<String, b> map) {
            this.a = oxVar;
            this.b = map;
        }

        public void a(ps psVar, T t) {
            if (t == null) {
                psVar.f();
                return;
            }
            psVar.d();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.a(t)) {
                        psVar.a(bVar.g);
                        bVar.a(psVar, (Object) t);
                    }
                }
                psVar.e();
            } catch (IllegalAccessException e) {
                throw new AssertionError();
            }
        }

        public T b(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            T a = this.a.a();
            try {
                ppVar.c();
                while (ppVar.e()) {
                    b bVar = (b) this.b.get(ppVar.g());
                    if (bVar == null || !bVar.i) {
                        ppVar.n();
                    } else {
                        bVar.a(ppVar, (Object) a);
                    }
                }
                ppVar.d();
                return a;
            } catch (Throwable e) {
                throw new og(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public pj(os osVar, nq nqVar, ot otVar) {
        this.a = osVar;
        this.b = nqVar;
        this.c = otVar;
    }

    private oj<?> a(nr nrVar, Field field, po<?> poVar) {
        ol olVar = (ol) field.getAnnotation(ol.class);
        if (olVar != null) {
            oj<?> a = pe.a(this.a, nrVar, poVar, olVar);
            if (a != null) {
                return a;
            }
        }
        return nrVar.a((po) poVar);
    }

    private b a(nr nrVar, Field field, String str, po<?> poVar, boolean z, boolean z2) {
        final boolean a = oy.a(poVar.a());
        final nr nrVar2 = nrVar;
        final Field field2 = field;
        final po<?> poVar2 = poVar;
        return new b(this, str, z, z2) {
            final oj<?> a = this.f.a(nrVar2, field2, poVar2);
            final /* synthetic */ pj f;

            void a(pp ppVar, Object obj) {
                Object b = this.a.b(ppVar);
                if (b != null || !a) {
                    field2.set(obj, b);
                }
            }

            void a(ps psVar, Object obj) {
                new pm(nrVar2, this.a, poVar2.b()).a(psVar, field2.get(obj));
            }

            public boolean a(Object obj) {
                return this.h && field2.get(obj) != obj;
            }
        };
    }

    static List<String> a(nq nqVar, Field field) {
        om omVar = (om) field.getAnnotation(om.class);
        List<String> linkedList = new LinkedList();
        if (omVar == null) {
            linkedList.add(nqVar.a(field));
        } else {
            linkedList.add(omVar.a());
            for (Object add : omVar.b()) {
                linkedList.add(add);
            }
        }
        return linkedList;
    }

    private List<String> a(Field field) {
        return a(this.b, field);
    }

    private Map<String, b> a(nr nrVar, po<?> poVar, Class<?> cls) {
        Map<String, b> linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = poVar.b();
        Class a;
        while (a != Object.class) {
            for (Field field : a.getDeclaredFields()) {
                boolean a2 = a(field, true);
                boolean a3 = a(field, false);
                if (a2 || a3) {
                    field.setAccessible(true);
                    Type a4 = or.a(r19.b(), a, field.getGenericType());
                    List a5 = a(field);
                    b bVar = null;
                    int i = 0;
                    while (i < a5.size()) {
                        String str = (String) a5.get(i);
                        if (i != 0) {
                            a2 = false;
                        }
                        b bVar2 = (b) linkedHashMap.put(str, a(nrVar, field, str, po.a(a4), a2, a3));
                        if (bVar != null) {
                            bVar2 = bVar;
                        }
                        i++;
                        bVar = bVar2;
                    }
                    if (bVar != null) {
                        String valueOf = String.valueOf(b);
                        String str2 = bVar.g;
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(str2).length()).append(valueOf).append(" declares multiple JSON fields named ").append(str2).toString());
                    }
                }
            }
            po a6 = po.a(or.a(a6.b(), a, a.getGenericSuperclass()));
            a = a6.a();
        }
        return linkedHashMap;
    }

    static boolean a(Field field, boolean z, ot otVar) {
        return (otVar.a(field.getType(), z) || otVar.a(field, z)) ? false : true;
    }

    public <T> oj<T> a(nr nrVar, po<T> poVar) {
        Class a = poVar.a();
        return !Object.class.isAssignableFrom(a) ? null : new a(this.a.a((po) poVar), a(nrVar, (po) poVar, a));
    }

    public boolean a(Field field, boolean z) {
        return a(field, z, this.c);
    }
}
