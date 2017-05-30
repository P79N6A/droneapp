package com.fimi.kernel.b.d;

import com.fimi.kernel.b.f;

public class d extends f {
    public static final String a = "UTF-8";
    public static final int b = 10240;
    private String c = "UTF-8";
    private int d = 10240;
    private boolean e = false;
    private boolean f = false;

    public void a(boolean z) {
        this.f = z;
    }

    public void b(int i) {
        this.d = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public int e() {
        return this.d;
    }

    public String f() {
        return this.c;
    }
}
