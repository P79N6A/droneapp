package com.android.volley;

public class d implements r {
    public static final int a = 2500;
    public static final int b = 0;
    public static final float c = 1.0f;
    private int d;
    private int e;
    private final int f;
    private final float g;

    public d() {
        this(a, 0, 1.0f);
    }

    public d(int i, int i2, float f) {
        this.d = i;
        this.f = i2;
        this.g = f;
    }

    public int a() {
        return this.d;
    }

    public void a(u uVar) {
        this.e++;
        this.d = (int) (((float) this.d) + (((float) this.d) * this.g));
        if (!d()) {
            throw uVar;
        }
    }

    public int b() {
        return this.e;
    }

    public float c() {
        return this.g;
    }

    protected boolean d() {
        return this.e <= this.f;
    }
}
