package com.fimi.kernel.a;

import android.graphics.drawable.Drawable;

public class c implements Comparable<c> {
    public String a;
    public String b;
    public int c;
    public int d;
    public Drawable e;
    public long f;
    public String g;
    public String h;
    public String i;

    public c(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public int a(c cVar) {
        return this.b.compareTo(cVar.b) == 0 ? this.f < cVar.f ? 1 : this.f == cVar.f ? 0 : -1 : this.b.compareTo(cVar.b);
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((c) obj);
    }
}
