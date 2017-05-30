package com.fimi.soul.biz.h;

import com.fimi.soul.base.LoadKey;

public class c {
    private String a;

    public static class a {
        private static c a = new c();
    }

    private c() {
        this.a = LoadKey.getKeyToken();
    }

    public static c a() {
        return a.a;
    }

    public String b() {
        return this.a;
    }
}
