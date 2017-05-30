package com.fimi.soul.biz.l;

import java.io.Serializable;

public class f implements Serializable {
    private String a;
    private String b;
    private String c;
    private boolean d = false;
    private String e;

    public void a(String str) {
        this.e = str;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public boolean a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public void b(String str) {
        this.a = str;
    }

    public String c() {
        return this.a;
    }

    public void c(String str) {
        this.c = str;
    }

    public String d() {
        return this.c;
    }
}
