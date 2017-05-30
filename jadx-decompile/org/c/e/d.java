package org.c.e;

import org.c.b.c;
import org.c.e.a.a;

class d {
    d() {
    }

    public static a a(Class<? extends e> cls, f fVar) {
        return a((Class) cls).a(fVar);
    }

    public static a a(String str, f fVar) {
        return a(str).a(fVar);
    }

    public static a a(i iVar, String str) {
        c d = iVar.a().d();
        String[] split = str.contains("=") ? str.split("=", 2) : new String[]{str, ""};
        return a(split[0], new f(d, split[1]));
    }

    static e a(Class<? extends e> cls) {
        try {
            return (e) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new e.a(e);
        }
    }

    static e a(String str) {
        try {
            return a(c.a(str).asSubclass(e.class));
        } catch (Exception e) {
            throw new e.a(e);
        }
    }
}
