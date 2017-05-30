package com.google.android.gms.internal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;

public final class pn {
    public static final oj<StringBuffer> A = new oj<StringBuffer>() {
        public StringBuffer a(pp ppVar) {
            if (ppVar.f() != pq.NULL) {
                return new StringBuffer(ppVar.h());
            }
            ppVar.j();
            return null;
        }

        public void a(ps psVar, StringBuffer stringBuffer) {
            psVar.b(stringBuffer == null ? null : stringBuffer.toString());
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok B = a(StringBuffer.class, A);
    public static final oj<URL> C = new oj<URL>() {
        public URL a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            String h = ppVar.h();
            return !"null".equals(h) ? new URL(h) : null;
        }

        public void a(ps psVar, URL url) {
            psVar.b(url == null ? null : url.toExternalForm());
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok D = a(URL.class, C);
    public static final oj<URI> E = new oj<URI>() {
        public URI a(pp ppVar) {
            URI uri = null;
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
            } else {
                try {
                    String h = ppVar.h();
                    if (!"null".equals(h)) {
                        uri = new URI(h);
                    }
                } catch (Throwable e) {
                    throw new ny(e);
                }
            }
            return uri;
        }

        public void a(ps psVar, URI uri) {
            psVar.b(uri == null ? null : uri.toASCIIString());
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok F = a(URI.class, E);
    public static final oj<InetAddress> G = new oj<InetAddress>() {
        public InetAddress a(pp ppVar) {
            if (ppVar.f() != pq.NULL) {
                return InetAddress.getByName(ppVar.h());
            }
            ppVar.j();
            return null;
        }

        public void a(ps psVar, InetAddress inetAddress) {
            psVar.b(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok H = b(InetAddress.class, G);
    public static final oj<UUID> I = new oj<UUID>() {
        public UUID a(pp ppVar) {
            if (ppVar.f() != pq.NULL) {
                return UUID.fromString(ppVar.h());
            }
            ppVar.j();
            return null;
        }

        public void a(ps psVar, UUID uuid) {
            psVar.b(uuid == null ? null : uuid.toString());
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok J = a(UUID.class, I);
    public static final ok K = new ok() {
        public <T> oj<T> a(nr nrVar, po<T> poVar) {
            if (poVar.a() != Timestamp.class) {
                return null;
            }
            final oj a = nrVar.a(Date.class);
            return new oj<Timestamp>(this) {
                final /* synthetic */ AnonymousClass7 b;

                public Timestamp a(pp ppVar) {
                    Date date = (Date) a.b(ppVar);
                    return date != null ? new Timestamp(date.getTime()) : null;
                }

                public void a(ps psVar, Timestamp timestamp) {
                    a.a(psVar, timestamp);
                }

                public /* synthetic */ Object b(pp ppVar) {
                    return a(ppVar);
                }
            };
        }
    };
    public static final oj<Calendar> L = new oj<Calendar>() {
        public Calendar a(pp ppVar) {
            int i = 0;
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            ppVar.c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (ppVar.f() != pq.END_OBJECT) {
                String g = ppVar.g();
                int m = ppVar.m();
                if ("year".equals(g)) {
                    i6 = m;
                } else if ("month".equals(g)) {
                    i5 = m;
                } else if ("dayOfMonth".equals(g)) {
                    i4 = m;
                } else if ("hourOfDay".equals(g)) {
                    i3 = m;
                } else if ("minute".equals(g)) {
                    i2 = m;
                } else if ("second".equals(g)) {
                    i = m;
                }
            }
            ppVar.d();
            return new GregorianCalendar(i6, i5, i4, i3, i2, i);
        }

        public void a(ps psVar, Calendar calendar) {
            if (calendar == null) {
                psVar.f();
                return;
            }
            psVar.d();
            psVar.a("year");
            psVar.a((long) calendar.get(1));
            psVar.a("month");
            psVar.a((long) calendar.get(2));
            psVar.a("dayOfMonth");
            psVar.a((long) calendar.get(5));
            psVar.a("hourOfDay");
            psVar.a((long) calendar.get(11));
            psVar.a("minute");
            psVar.a((long) calendar.get(12));
            psVar.a("second");
            psVar.a((long) calendar.get(13));
            psVar.e();
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok M = b(Calendar.class, GregorianCalendar.class, L);
    public static final oj<Locale> N = new oj<Locale>() {
        public Locale a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(ppVar.h(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        public void a(ps psVar, Locale locale) {
            psVar.b(locale == null ? null : locale.toString());
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok O = a(Locale.class, N);
    public static final oj<nx> P = new oj<nx>() {
        public nx a(pp ppVar) {
            nx nuVar;
            switch (ppVar.f()) {
                case NUMBER:
                    return new od(new ov(ppVar.h()));
                case BOOLEAN:
                    return new od(Boolean.valueOf(ppVar.i()));
                case STRING:
                    return new od(ppVar.h());
                case NULL:
                    ppVar.j();
                    return nz.a;
                case BEGIN_ARRAY:
                    nuVar = new nu();
                    ppVar.a();
                    while (ppVar.e()) {
                        nuVar.a((nx) b(ppVar));
                    }
                    ppVar.b();
                    return nuVar;
                case BEGIN_OBJECT:
                    nuVar = new oa();
                    ppVar.c();
                    while (ppVar.e()) {
                        nuVar.a(ppVar.g(), (nx) b(ppVar));
                    }
                    ppVar.d();
                    return nuVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public void a(ps psVar, nx nxVar) {
            if (nxVar == null || nxVar.k()) {
                psVar.f();
            } else if (nxVar.j()) {
                od n = nxVar.n();
                if (n.p()) {
                    psVar.a(n.b());
                } else if (n.a()) {
                    psVar.a(n.g());
                } else {
                    psVar.b(n.c());
                }
            } else if (nxVar.h()) {
                psVar.b();
                Iterator it = nxVar.m().iterator();
                while (it.hasNext()) {
                    a(psVar, (nx) it.next());
                }
                psVar.c();
            } else if (nxVar.i()) {
                psVar.d();
                for (Entry entry : nxVar.l().a()) {
                    psVar.a((String) entry.getKey());
                    a(psVar, (nx) entry.getValue());
                }
                psVar.e();
            } else {
                String valueOf = String.valueOf(nxVar.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Couldn't write ").append(valueOf).toString());
            }
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok Q = b(nx.class, P);
    public static final ok R = new ok() {
        public <T> oj<T> a(nr nrVar, po<T> poVar) {
            Class a = poVar.a();
            if (!Enum.class.isAssignableFrom(a) || a == Enum.class) {
                return null;
            }
            if (!a.isEnum()) {
                a = a.getSuperclass();
            }
            return new a(a);
        }
    };
    public static final oj<Class> a = new oj<Class>() {
        public Class a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void a(ps psVar, Class cls) {
            if (cls == null) {
                psVar.f();
            } else {
                String valueOf = String.valueOf(cls.getName());
                throw new UnsupportedOperationException(new StringBuilder(String.valueOf(valueOf).length() + 76).append("Attempted to serialize java.lang.Class: ").append(valueOf).append(". Forgot to register a type adapter?").toString());
            }
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok b = a(Class.class, a);
    public static final oj<BitSet> c = new oj<BitSet>() {
        public BitSet a(pp ppVar) {
            String valueOf;
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            BitSet bitSet = new BitSet();
            ppVar.a();
            pq f = ppVar.f();
            int i = 0;
            while (f != pq.END_ARRAY) {
                boolean z;
                switch (f) {
                    case NUMBER:
                        if (ppVar.m() == 0) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    case BOOLEAN:
                        z = ppVar.i();
                        break;
                    case STRING:
                        Object h = ppVar.h();
                        try {
                            if (Integer.parseInt(h) == 0) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        } catch (NumberFormatException e) {
                            String str = "Error: Expecting: bitset number value (1, 0), Found: ";
                            valueOf = String.valueOf(h);
                            throw new og(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        }
                    default:
                        valueOf = String.valueOf(f);
                        throw new og(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Invalid bitset value type: ").append(valueOf).toString());
                }
                if (z) {
                    bitSet.set(i);
                }
                i++;
                f = ppVar.f();
            }
            ppVar.b();
            return bitSet;
        }

        public void a(ps psVar, BitSet bitSet) {
            if (bitSet == null) {
                psVar.f();
                return;
            }
            psVar.b();
            for (int i = 0; i < bitSet.length(); i++) {
                psVar.a((long) (bitSet.get(i) ? 1 : 0));
            }
            psVar.c();
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok d = a(BitSet.class, c);
    public static final oj<Boolean> e = new oj<Boolean>() {
        public Boolean a(pp ppVar) {
            if (ppVar.f() != pq.NULL) {
                return ppVar.f() == pq.STRING ? Boolean.valueOf(Boolean.parseBoolean(ppVar.h())) : Boolean.valueOf(ppVar.i());
            } else {
                ppVar.j();
                return null;
            }
        }

        public void a(ps psVar, Boolean bool) {
            if (bool == null) {
                psVar.f();
            } else {
                psVar.a(bool.booleanValue());
            }
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final oj<Boolean> f = new oj<Boolean>() {
        public Boolean a(pp ppVar) {
            if (ppVar.f() != pq.NULL) {
                return Boolean.valueOf(ppVar.h());
            }
            ppVar.j();
            return null;
        }

        public void a(ps psVar, Boolean bool) {
            psVar.b(bool == null ? "null" : bool.toString());
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok g = a(Boolean.TYPE, Boolean.class, e);
    public static final oj<Number> h = new oj<Number>() {
        public Number a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            try {
                return Byte.valueOf((byte) ppVar.m());
            } catch (Throwable e) {
                throw new og(e);
            }
        }

        public void a(ps psVar, Number number) {
            psVar.a(number);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok i = a(Byte.TYPE, Byte.class, h);
    public static final oj<Number> j = new oj<Number>() {
        public Number a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            try {
                return Short.valueOf((short) ppVar.m());
            } catch (Throwable e) {
                throw new og(e);
            }
        }

        public void a(ps psVar, Number number) {
            psVar.a(number);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok k = a(Short.TYPE, Short.class, j);
    public static final oj<Number> l = new oj<Number>() {
        public Number a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            try {
                return Integer.valueOf(ppVar.m());
            } catch (Throwable e) {
                throw new og(e);
            }
        }

        public void a(ps psVar, Number number) {
            psVar.a(number);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok m = a(Integer.TYPE, Integer.class, l);
    public static final oj<Number> n = new oj<Number>() {
        public Number a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            try {
                return Long.valueOf(ppVar.l());
            } catch (Throwable e) {
                throw new og(e);
            }
        }

        public void a(ps psVar, Number number) {
            psVar.a(number);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final oj<Number> o = new oj<Number>() {
        public Number a(pp ppVar) {
            if (ppVar.f() != pq.NULL) {
                return Float.valueOf((float) ppVar.k());
            }
            ppVar.j();
            return null;
        }

        public void a(ps psVar, Number number) {
            psVar.a(number);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final oj<Number> p = new oj<Number>() {
        public Number a(pp ppVar) {
            if (ppVar.f() != pq.NULL) {
                return Double.valueOf(ppVar.k());
            }
            ppVar.j();
            return null;
        }

        public void a(ps psVar, Number number) {
            psVar.a(number);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final oj<Number> q = new oj<Number>() {
        public Number a(pp ppVar) {
            pq f = ppVar.f();
            switch (f) {
                case NUMBER:
                    return new ov(ppVar.h());
                case NULL:
                    ppVar.j();
                    return null;
                default:
                    String valueOf = String.valueOf(f);
                    throw new og(new StringBuilder(String.valueOf(valueOf).length() + 23).append("Expecting number, got: ").append(valueOf).toString());
            }
        }

        public void a(ps psVar, Number number) {
            psVar.a(number);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok r = a(Number.class, q);
    public static final oj<Character> s = new oj<Character>() {
        public Character a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            String h = ppVar.h();
            if (h.length() == 1) {
                return Character.valueOf(h.charAt(0));
            }
            String str = "Expecting character, got: ";
            h = String.valueOf(h);
            throw new og(h.length() != 0 ? str.concat(h) : new String(str));
        }

        public void a(ps psVar, Character ch) {
            psVar.b(ch == null ? null : String.valueOf(ch));
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok t = a(Character.TYPE, Character.class, s);
    public static final oj<String> u = new oj<String>() {
        public String a(pp ppVar) {
            pq f = ppVar.f();
            if (f != pq.NULL) {
                return f == pq.BOOLEAN ? Boolean.toString(ppVar.i()) : ppVar.h();
            } else {
                ppVar.j();
                return null;
            }
        }

        public void a(ps psVar, String str) {
            psVar.b(str);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final oj<BigDecimal> v = new oj<BigDecimal>() {
        public BigDecimal a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            try {
                return new BigDecimal(ppVar.h());
            } catch (Throwable e) {
                throw new og(e);
            }
        }

        public void a(ps psVar, BigDecimal bigDecimal) {
            psVar.a((Number) bigDecimal);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final oj<BigInteger> w = new oj<BigInteger>() {
        public BigInteger a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            try {
                return new BigInteger(ppVar.h());
            } catch (Throwable e) {
                throw new og(e);
            }
        }

        public void a(ps psVar, BigInteger bigInteger) {
            psVar.a((Number) bigInteger);
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok x = a(String.class, u);
    public static final oj<StringBuilder> y = new oj<StringBuilder>() {
        public StringBuilder a(pp ppVar) {
            if (ppVar.f() != pq.NULL) {
                return new StringBuilder(ppVar.h());
            }
            ppVar.j();
            return null;
        }

        public void a(ps psVar, StringBuilder stringBuilder) {
            psVar.b(stringBuilder == null ? null : stringBuilder.toString());
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    };
    public static final ok z = a(StringBuilder.class, y);

    private static final class a<T extends Enum<T>> extends oj<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        public a(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    om omVar = (om) cls.getField(name).getAnnotation(om.class);
                    if (omVar != null) {
                        name = omVar.a();
                        for (Object put : omVar.b()) {
                            this.a.put(put, enumR);
                        }
                    }
                    String str = name;
                    this.a.put(str, enumR);
                    this.b.put(enumR, str);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError();
            }
        }

        public T a(pp ppVar) {
            if (ppVar.f() != pq.NULL) {
                return (Enum) this.a.get(ppVar.h());
            }
            ppVar.j();
            return null;
        }

        public void a(ps psVar, T t) {
            psVar.b(t == null ? null : (String) this.b.get(t));
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    }

    public static <TT> ok a(final po<TT> poVar, final oj<TT> ojVar) {
        return new ok() {
            public <T> oj<T> a(nr nrVar, po<T> poVar) {
                return poVar.equals(poVar) ? ojVar : null;
            }
        };
    }

    public static <TT> ok a(final Class<TT> cls, final oj<TT> ojVar) {
        return new ok() {
            public <T> oj<T> a(nr nrVar, po<T> poVar) {
                return poVar.a() == cls ? ojVar : null;
            }

            public String toString() {
                String valueOf = String.valueOf(cls.getName());
                String valueOf2 = String.valueOf(ojVar);
                return new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append("Factory[type=").append(valueOf).append(",adapter=").append(valueOf2).append("]").toString();
            }
        };
    }

    public static <TT> ok a(final Class<TT> cls, final Class<TT> cls2, final oj<? super TT> ojVar) {
        return new ok() {
            public <T> oj<T> a(nr nrVar, po<T> poVar) {
                Class a = poVar.a();
                return (a == cls || a == cls2) ? ojVar : null;
            }

            public String toString() {
                String valueOf = String.valueOf(cls2.getName());
                String valueOf2 = String.valueOf(cls.getName());
                String valueOf3 = String.valueOf(ojVar);
                return new StringBuilder(((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Factory[type=").append(valueOf).append("+").append(valueOf2).append(",adapter=").append(valueOf3).append("]").toString();
            }
        };
    }

    public static <TT> ok b(final Class<TT> cls, final oj<TT> ojVar) {
        return new ok() {
            public <T> oj<T> a(nr nrVar, po<T> poVar) {
                return cls.isAssignableFrom(poVar.a()) ? ojVar : null;
            }

            public String toString() {
                String valueOf = String.valueOf(cls.getName());
                String valueOf2 = String.valueOf(ojVar);
                return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("Factory[typeHierarchy=").append(valueOf).append(",adapter=").append(valueOf2).append("]").toString();
            }
        };
    }

    public static <TT> ok b(final Class<TT> cls, final Class<? extends TT> cls2, final oj<? super TT> ojVar) {
        return new ok() {
            public <T> oj<T> a(nr nrVar, po<T> poVar) {
                Class a = poVar.a();
                return (a == cls || a == cls2) ? ojVar : null;
            }

            public String toString() {
                String valueOf = String.valueOf(cls.getName());
                String valueOf2 = String.valueOf(cls2.getName());
                String valueOf3 = String.valueOf(ojVar);
                return new StringBuilder(((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Factory[type=").append(valueOf).append("+").append(valueOf2).append(",adapter=").append(valueOf3).append("]").toString();
            }
        };
    }
}
