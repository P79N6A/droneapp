package com.google.android.gms.internal;

import com.android.volley.d;

public class tw implements afg {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public tw() {
        this(d.a, 1, 1.0f);
    }

    public tw(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.d = f;
    }

    public int a() {
        return this.a;
    }

    public void a(aii com_google_android_gms_internal_aii) {
        this.b++;
        this.a = (int) (((float) this.a) + (((float) this.a) * this.d));
        if (!c()) {
            throw com_google_android_gms_internal_aii;
        }
    }

    public int b() {
        return this.b;
    }

    protected boolean c() {
        return this.b <= this.c;
    }
}
