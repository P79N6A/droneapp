package com.fimi.soul.module.calibcompass;

import java.util.concurrent.ConcurrentHashMap;

public class a {
    private static a a;
    private volatile ConcurrentHashMap<String, com.fimi.soul.module.b.a> b = new ConcurrentHashMap();

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public void a(String str) {
        com.fimi.soul.module.b.a aVar = (com.fimi.soul.module.b.a) this.b.get(str);
        if (aVar != null) {
            aVar.b();
        }
        this.b.remove(str);
    }

    public void a(String str, com.fimi.soul.module.b.a aVar) {
        if (aVar != null) {
            this.b.put(str, aVar);
        }
    }
}
