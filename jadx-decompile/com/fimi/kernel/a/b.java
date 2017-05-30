package com.fimi.kernel.a;

import com.fimi.kernel.utils.j;

public class b {
    public static final int a = 0;
    public static final int b = -1;
    private int c;
    private String d;

    public b(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public b(String str) {
        b bVar = (b) j.a(str, getClass());
        this.c = bVar.a();
        this.d = bVar.b();
    }

    public int a() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(String str) {
        this.d = str;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return j.a((Object) this);
    }
}
