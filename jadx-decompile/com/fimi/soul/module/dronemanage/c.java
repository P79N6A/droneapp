package com.fimi.soul.module.dronemanage;

public class c {
    private static c a = null;
    private a b = a.NONEXECUTE;

    public enum a {
        EXECUTE,
        NONEXECUTE
    }

    private c() {
    }

    public static c a() {
        if (a == null) {
            a = new c();
        }
        return a;
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public a b() {
        return this.b;
    }
}
