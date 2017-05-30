package com.google.android.gms.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public final class os {
    private final Map<Type, nt<?>> a;

    public os(Map<Type, nt<?>> map) {
        this.a = map;
    }

    private <T> ox<T> a(Class<? super T> cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new ox<T>(this) {
                final /* synthetic */ os b;

                public T a() {
                    String valueOf;
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (Throwable e) {
                        valueOf = String.valueOf(declaredConstructor);
                        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to invoke ").append(valueOf).append(" with no args").toString(), e);
                    } catch (InvocationTargetException e2) {
                        valueOf = String.valueOf(declaredConstructor);
                        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to invoke ").append(valueOf).append(" with no args").toString(), e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    private <T> ox<T> a(final Type type, Class<? super T> cls) {
        return Collection.class.isAssignableFrom(cls) ? SortedSet.class.isAssignableFrom(cls) ? new ox<T>(this) {
            final /* synthetic */ os a;

            {
                this.a = r1;
            }

            public T a() {
                return new TreeSet();
            }
        } : EnumSet.class.isAssignableFrom(cls) ? new ox<T>(this) {
            final /* synthetic */ os b;

            public T a() {
                if (type instanceof ParameterizedType) {
                    Type type = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type instanceof Class) {
                        return EnumSet.noneOf((Class) type);
                    }
                    String str = "Invalid EnumSet type: ";
                    String valueOf = String.valueOf(type.toString());
                    throw new ny(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
                str = "Invalid EnumSet type: ";
                valueOf = String.valueOf(type.toString());
                throw new ny(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } : Set.class.isAssignableFrom(cls) ? new ox<T>(this) {
            final /* synthetic */ os a;

            {
                this.a = r1;
            }

            public T a() {
                return new LinkedHashSet();
            }
        } : Queue.class.isAssignableFrom(cls) ? new ox<T>(this) {
            final /* synthetic */ os a;

            {
                this.a = r1;
            }

            public T a() {
                return new LinkedList();
            }
        } : new ox<T>(this) {
            final /* synthetic */ os a;

            {
                this.a = r1;
            }

            public T a() {
                return new ArrayList();
            }
        } : Map.class.isAssignableFrom(cls) ? SortedMap.class.isAssignableFrom(cls) ? new ox<T>(this) {
            final /* synthetic */ os a;

            {
                this.a = r1;
            }

            public T a() {
                return new TreeMap();
            }
        } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(po.a(((ParameterizedType) type).getActualTypeArguments()[0]).a())) ? new ox<T>(this) {
            final /* synthetic */ os a;

            {
                this.a = r1;
            }

            public T a() {
                return new ow();
            }
        } : new ox<T>(this) {
            final /* synthetic */ os a;

            {
                this.a = r1;
            }

            public T a() {
                return new LinkedHashMap();
            }
        } : null;
    }

    private <T> ox<T> b(final Type type, final Class<? super T> cls) {
        return new ox<T>(this) {
            final /* synthetic */ os c;
            private final pa d = pa.a();

            public T a() {
                try {
                    return this.d.a(cls);
                } catch (Throwable e) {
                    String valueOf = String.valueOf(type);
                    throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + Opcodes.INEG).append("Unable to invoke no-args constructor for ").append(valueOf).append(". ").append("Register an InstanceCreator with Gson for this type may fix this problem.").toString(), e);
                }
            }
        };
    }

    public <T> ox<T> a(po<T> poVar) {
        final Type b = poVar.b();
        Class a = poVar.a();
        final nt ntVar = (nt) this.a.get(b);
        if (ntVar != null) {
            return new ox<T>(this) {
                final /* synthetic */ os c;

                public T a() {
                    return ntVar.a(b);
                }
            };
        }
        ntVar = (nt) this.a.get(a);
        if (ntVar != null) {
            return new ox<T>(this) {
                final /* synthetic */ os c;

                public T a() {
                    return ntVar.a(b);
                }
            };
        }
        ox<T> a2 = a(a);
        if (a2 != null) {
            return a2;
        }
        a2 = a(b, a);
        return a2 == null ? b(b, a) : a2;
    }

    public String toString() {
        return this.a.toString();
    }
}
