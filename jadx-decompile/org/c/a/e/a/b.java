package org.c.a.e.a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.c.a.e.d;
import org.c.a.e.e;
import org.c.a.e.f;
import org.c.a.e.g;
import org.c.f.a.k;

public class b {
    private final List<g> a;
    private final List<d> b;
    private final k c;

    private b(List<g> list, List<d> list2, k kVar) {
        this.b = list2;
        this.a = list;
        this.c = kVar;
    }

    private List<g> a(d dVar) {
        Class a = dVar.a();
        return a.isEnum() ? new d(a).a(dVar) : (a.equals(Boolean.class) || a.equals(Boolean.TYPE)) ? new c().a(dVar) : Collections.emptyList();
    }

    public static b a(Method method, k kVar) {
        List a = d.a(kVar.f());
        a.addAll(d.a(method));
        return new b(new ArrayList(), a, kVar);
    }

    private e a(Class<? extends e> cls) {
        for (Constructor constructor : cls.getConstructors()) {
            Class[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(k.class)) {
                return (e) constructor.newInstance(new Object[]{this.c});
            }
        }
        return (e) cls.newInstance();
    }

    private e b(d dVar) {
        f fVar = (f) dVar.d(f.class);
        return fVar != null ? a(fVar.a()) : new a(this.c);
    }

    private int g() {
        return d.a(this.c.f()).size();
    }

    public b a(g gVar) {
        List arrayList = new ArrayList(this.a);
        arrayList.add(gVar);
        return new b(arrayList, this.b.subList(1, this.b.size()), this.c);
    }

    public boolean a() {
        return this.b.size() == 0;
    }

    public Object[] a(int i, int i2) {
        Object[] objArr = new Object[(i2 - i)];
        for (int i3 = i; i3 < i2; i3++) {
            objArr[i3 - i] = ((g) this.a.get(i3)).a();
        }
        return objArr;
    }

    public Object[] a(boolean z) {
        Object[] objArr = new Object[this.a.size()];
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = ((g) this.a.get(i)).b();
        }
        return objArr;
    }

    public d b() {
        return (d) this.b.get(0);
    }

    public List<g> c() {
        d b = b();
        List<g> a = b(b).a(b);
        return a.size() == 0 ? a(b) : a;
    }

    public Object[] d() {
        return a(0, g());
    }

    public Object[] e() {
        return a(g(), this.a.size());
    }

    public Object[] f() {
        return a(0, this.a.size());
    }
}
