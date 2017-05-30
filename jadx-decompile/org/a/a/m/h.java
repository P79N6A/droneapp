package org.a.a.m;

import org.a.a.a.b;

@b
public class h {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public h(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[leased: ");
        stringBuilder.append(this.a);
        stringBuilder.append("; pending: ");
        stringBuilder.append(this.b);
        stringBuilder.append("; available: ");
        stringBuilder.append(this.c);
        stringBuilder.append("; max: ");
        stringBuilder.append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
