package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ot implements ok, Cloneable {
    public static final ot a = new ot();
    private double b = -1.0d;
    private int c = 136;
    private boolean d = true;
    private List<nm> e = Collections.emptyList();
    private List<nm> f = Collections.emptyList();

    private boolean a(on onVar) {
        return onVar == null || onVar.a() <= this.b;
    }

    private boolean a(on onVar, oo ooVar) {
        return a(onVar) && a(ooVar);
    }

    private boolean a(oo ooVar) {
        return ooVar == null || ooVar.a() > this.b;
    }

    private boolean a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean b(Class<?> cls) {
        return cls.isMemberClass() && !c(cls);
    }

    private boolean c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public <T> oj<T> a(nr nrVar, po<T> poVar) {
        Class a = poVar.a();
        final boolean a2 = a(a, true);
        final boolean a3 = a(a, false);
        if (!a2 && !a3) {
            return null;
        }
        final nr nrVar2 = nrVar;
        final po<T> poVar2 = poVar;
        return new oj<T>(this) {
            final /* synthetic */ ot e;
            private oj<T> f;

            private oj<T> a() {
                oj<T> ojVar = this.f;
                if (ojVar != null) {
                    return ojVar;
                }
                ojVar = nrVar2.a(this.e, poVar2);
                this.f = ojVar;
                return ojVar;
            }

            public void a(ps psVar, T t) {
                if (a2) {
                    psVar.f();
                } else {
                    a().a(psVar, t);
                }
            }

            public T b(pp ppVar) {
                if (!a3) {
                    return a().b(ppVar);
                }
                ppVar.n();
                return null;
            }
        };
    }

    protected ot a() {
        try {
            return (ot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public ot a(nm nmVar, boolean z, boolean z2) {
        ot a = a();
        if (z) {
            a.e = new ArrayList(this.e);
            a.e.add(nmVar);
        }
        if (z2) {
            a.f = new ArrayList(this.f);
            a.f.add(nmVar);
        }
        return a;
    }

    public ot a(int... iArr) {
        int i = 0;
        ot a = a();
        a.c = 0;
        int length = iArr.length;
        while (i < length) {
            a.c = iArr[i] | a.c;
            i++;
        }
        return a;
    }

    public boolean a(Class<?> cls, boolean z) {
        if (this.b != -1.0d && !a((on) cls.getAnnotation(on.class), (oo) cls.getAnnotation(oo.class))) {
            return true;
        }
        if (!this.d && b(cls)) {
            return true;
        }
        if (a((Class) cls)) {
            return true;
        }
        for (nm a : z ? this.e : this.f) {
            if (a.a((Class) cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(Field field, boolean z) {
        if ((this.c & field.getModifiers()) != 0) {
            return true;
        }
        if (this.b != -1.0d && !a((on) field.getAnnotation(on.class), (oo) field.getAnnotation(oo.class))) {
            return true;
        }
        if (field.isSynthetic()) {
            return true;
        }
        if (!this.d && b(field.getType())) {
            return true;
        }
        if (a(field.getType())) {
            return true;
        }
        List<nm> list = z ? this.e : this.f;
        if (!list.isEmpty()) {
            nn nnVar = new nn(field);
            for (nm a : list) {
                if (a.a(nnVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected /* synthetic */ Object clone() {
        return a();
    }
}
