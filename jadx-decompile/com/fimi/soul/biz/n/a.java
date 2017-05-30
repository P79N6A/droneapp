package com.fimi.soul.biz.n;

public class a {
    private boolean a = true;

    private static class a {
        private static final a a = new a();

        private a() {
        }
    }

    public static a a() {
        return a.a;
    }

    public void a(boolean z) {
        this.a = z;
    }

    public boolean b() {
        return this.a;
    }
}
