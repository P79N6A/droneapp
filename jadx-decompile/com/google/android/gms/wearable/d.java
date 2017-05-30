package com.google.android.gms.wearable;

import java.io.IOException;

public class d extends IOException {
    private final int a;
    private final int b;

    public d(String str, int i, int i2) {
        super(str);
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}
