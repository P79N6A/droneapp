package com.fimi.soul.module.a;

import com.fimi.soul.module.a.a.a.a;

public enum d {
    CLASSIC(0, new a());
    
    private final int b;
    private final e c;

    private d(int i, e eVar) {
        this.b = i;
        this.c = eVar;
    }

    public static d a(int i) {
        for (d dVar : values()) {
            if (dVar.b == i) {
                return dVar;
            }
        }
        return CLASSIC;
    }

    public int a() {
        return this.b;
    }

    public e b() {
        return this.c;
    }
}
