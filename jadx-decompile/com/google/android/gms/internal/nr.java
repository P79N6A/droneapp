package com.google.android.gms.internal;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public final class nr {
    final nv a;
    final oe b;
    private final ThreadLocal<Map<po<?>, a<?>>> c;
    private final Map<po<?>, oj<?>> d;
    private final List<ok> e;
    private final os f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    static class a<T> extends oj<T> {
        private oj<T> a;

        a() {
        }

        public void a(oj<T> ojVar) {
            if (this.a != null) {
                throw new AssertionError();
            }
            this.a = ojVar;
        }

        public void a(ps psVar, T t) {
            if (this.a == null) {
                throw new IllegalStateException();
            }
            this.a.a(psVar, t);
        }

        public T b(pp ppVar) {
            if (this.a != null) {
                return this.a.b(ppVar);
            }
            throw new IllegalStateException();
        }
    }

    public nr() {
        this(ot.a, no.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, oh.DEFAULT, Collections.emptyList());
    }

    nr(ot otVar, nq nqVar, Map<Type, nt<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, oh ohVar, List<ok> list) {
        this.c = new ThreadLocal();
        this.d = Collections.synchronizedMap(new HashMap());
        this.a = new nv(this) {
            final /* synthetic */ nr a;

            {
                this.a = r1;
            }
        };
        this.b = new oe(this) {
            final /* synthetic */ nr a;

            {
                this.a = r1;
            }
        };
        this.f = new os(map);
        this.g = z;
        this.i = z3;
        this.h = z4;
        this.j = z5;
        List arrayList = new ArrayList();
        arrayList.add(pn.Q);
        arrayList.add(pi.a);
        arrayList.add(otVar);
        arrayList.addAll(list);
        arrayList.add(pn.x);
        arrayList.add(pn.m);
        arrayList.add(pn.g);
        arrayList.add(pn.i);
        arrayList.add(pn.k);
        arrayList.add(pn.a(Long.TYPE, Long.class, a(ohVar)));
        arrayList.add(pn.a(Double.TYPE, Double.class, a(z6)));
        arrayList.add(pn.a(Float.TYPE, Float.class, b(z6)));
        arrayList.add(pn.r);
        arrayList.add(pn.t);
        arrayList.add(pn.z);
        arrayList.add(pn.B);
        arrayList.add(pn.a(BigDecimal.class, pn.v));
        arrayList.add(pn.a(BigInteger.class, pn.w));
        arrayList.add(pn.D);
        arrayList.add(pn.F);
        arrayList.add(pn.J);
        arrayList.add(pn.O);
        arrayList.add(pn.H);
        arrayList.add(pn.d);
        arrayList.add(pd.a);
        arrayList.add(pn.M);
        arrayList.add(pl.a);
        arrayList.add(pk.a);
        arrayList.add(pn.K);
        arrayList.add(pb.a);
        arrayList.add(pn.b);
        arrayList.add(new pc(this.f));
        arrayList.add(new ph(this.f, z2));
        arrayList.add(new pe(this.f));
        arrayList.add(pn.R);
        arrayList.add(new pj(this.f, nqVar, otVar));
        this.e = Collections.unmodifiableList(arrayList);
    }

    private oj<Number> a(oh ohVar) {
        return ohVar == oh.DEFAULT ? pn.n : new oj<Number>(this) {
            final /* synthetic */ nr a;

            {
                this.a = r1;
            }

            public Number a(pp ppVar) {
                if (ppVar.f() != pq.NULL) {
                    return Long.valueOf(ppVar.l());
                }
                ppVar.j();
                return null;
            }

            public void a(ps psVar, Number number) {
                if (number == null) {
                    psVar.f();
                } else {
                    psVar.b(number.toString());
                }
            }

            public /* synthetic */ Object b(pp ppVar) {
                return a(ppVar);
            }
        };
    }

    private oj<Number> a(boolean z) {
        return z ? pn.p : new oj<Number>(this) {
            final /* synthetic */ nr a;

            {
                this.a = r1;
            }

            public Double a(pp ppVar) {
                if (ppVar.f() != pq.NULL) {
                    return Double.valueOf(ppVar.k());
                }
                ppVar.j();
                return null;
            }

            public void a(ps psVar, Number number) {
                if (number == null) {
                    psVar.f();
                    return;
                }
                this.a.a(number.doubleValue());
                psVar.a(number);
            }

            public /* synthetic */ Object b(pp ppVar) {
                return a(ppVar);
            }
        };
    }

    private void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(new StringBuilder(Opcodes.JSR).append(d).append(" is not a valid double value as per JSON specification. To override this").append(" behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        }
    }

    private static void a(Object obj, pp ppVar) {
        if (obj != null) {
            try {
                if (ppVar.f() != pq.END_DOCUMENT) {
                    throw new ny("JSON document was not fully consumed.");
                }
            } catch (Throwable e) {
                throw new og(e);
            } catch (Throwable e2) {
                throw new ny(e2);
            }
        }
    }

    private oj<Number> b(boolean z) {
        return z ? pn.o : new oj<Number>(this) {
            final /* synthetic */ nr a;

            {
                this.a = r1;
            }

            public Float a(pp ppVar) {
                if (ppVar.f() != pq.NULL) {
                    return Float.valueOf((float) ppVar.k());
                }
                ppVar.j();
                return null;
            }

            public void a(ps psVar, Number number) {
                if (number == null) {
                    psVar.f();
                    return;
                }
                this.a.a((double) number.floatValue());
                psVar.a(number);
            }

            public /* synthetic */ Object b(pp ppVar) {
                return a(ppVar);
            }
        };
    }

    public <T> oj<T> a(ok okVar, po<T> poVar) {
        Object obj = null;
        if (!this.e.contains(okVar)) {
            obj = 1;
        }
        Object obj2 = obj;
        for (ok okVar2 : this.e) {
            if (obj2 != null) {
                oj<T> a = okVar2.a(this, poVar);
                if (a != null) {
                    return a;
                }
            } else if (okVar2 == okVar) {
                obj2 = 1;
            }
        }
        String valueOf = String.valueOf(poVar);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("GSON cannot serialize ").append(valueOf).toString());
    }

    public <T> oj<T> a(po<T> poVar) {
        Map map;
        oj<T> ojVar = (oj) this.d.get(poVar);
        if (ojVar == null) {
            Map map2 = (Map) this.c.get();
            Object obj = null;
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                this.c.set(hashMap);
                map = hashMap;
                obj = 1;
            } else {
                map = map2;
            }
            a aVar = (a) map.get(poVar);
            if (aVar == null) {
                try {
                    a aVar2 = new a();
                    map.put(poVar, aVar2);
                    for (ok a : this.e) {
                        ojVar = a.a(this, poVar);
                        if (ojVar != null) {
                            aVar2.a(ojVar);
                            this.d.put(poVar, ojVar);
                            map.remove(poVar);
                            if (obj != null) {
                                this.c.remove();
                            }
                        }
                    }
                    String valueOf = String.valueOf(poVar);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("GSON cannot handle ").append(valueOf).toString());
                } catch (Throwable th) {
                    map.remove(poVar);
                    if (obj != null) {
                        this.c.remove();
                    }
                }
            }
        }
        return ojVar;
    }

    public <T> oj<T> a(Class<T> cls) {
        return a(po.b(cls));
    }

    public ps a(Writer writer) {
        if (this.i) {
            writer.write(")]}'\n");
        }
        ps psVar = new ps(writer);
        if (this.j) {
            psVar.c("  ");
        }
        psVar.d(this.g);
        return psVar;
    }

    public <T> T a(nx nxVar, Class<T> cls) {
        return oy.a((Class) cls).cast(a(nxVar, (Type) cls));
    }

    public <T> T a(nx nxVar, Type type) {
        return nxVar == null ? null : a(new pf(nxVar), type);
    }

    public <T> T a(pp ppVar, Type type) {
        boolean z = true;
        boolean p = ppVar.p();
        ppVar.a(true);
        try {
            ppVar.f();
            z = false;
            T b = a(po.a(type)).b(ppVar);
            ppVar.a(p);
            return b;
        } catch (Throwable e) {
            if (z) {
                ppVar.a(p);
                return null;
            }
            throw new og(e);
        } catch (Throwable e2) {
            throw new og(e2);
        } catch (Throwable e22) {
            throw new og(e22);
        } catch (Throwable th) {
            ppVar.a(p);
        }
    }

    public <T> T a(Reader reader, Type type) {
        pp ppVar = new pp(reader);
        Object a = a(ppVar, type);
        a(a, ppVar);
        return a;
    }

    public <T> T a(String str, Class<T> cls) {
        return oy.a((Class) cls).cast(a(str, (Type) cls));
    }

    public <T> T a(String str, Type type) {
        return str == null ? null : a(new StringReader(str), type);
    }

    public String a(nx nxVar) {
        Appendable stringWriter = new StringWriter();
        a(nxVar, stringWriter);
        return stringWriter.toString();
    }

    public String a(Object obj) {
        return obj == null ? a(nz.a) : a(obj, obj.getClass());
    }

    public String a(Object obj, Type type) {
        Appendable stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void a(nx nxVar, ps psVar) {
        boolean g = psVar.g();
        psVar.b(true);
        boolean h = psVar.h();
        psVar.c(this.h);
        boolean i = psVar.i();
        psVar.d(this.g);
        try {
            oz.a(nxVar, psVar);
            psVar.b(g);
            psVar.c(h);
            psVar.d(i);
        } catch (Throwable e) {
            throw new ny(e);
        } catch (Throwable th) {
            psVar.b(g);
            psVar.c(h);
            psVar.d(i);
        }
    }

    public void a(nx nxVar, Appendable appendable) {
        try {
            a(nxVar, a(oz.a(appendable)));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(Object obj, Type type, ps psVar) {
        oj a = a(po.a(type));
        boolean g = psVar.g();
        psVar.b(true);
        boolean h = psVar.h();
        psVar.c(this.h);
        boolean i = psVar.i();
        psVar.d(this.g);
        try {
            a.a(psVar, obj);
            psVar.b(g);
            psVar.c(h);
            psVar.d(i);
        } catch (Throwable e) {
            throw new ny(e);
        } catch (Throwable th) {
            psVar.b(g);
            psVar.c(h);
            psVar.d(i);
        }
    }

    public void a(Object obj, Type type, Appendable appendable) {
        try {
            a(obj, type, a(oz.a(appendable)));
        } catch (Throwable e) {
            throw new ny(e);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.g + "factories:" + this.e + ",instanceCreators:" + this.f + "}";
    }
}
