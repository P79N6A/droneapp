package com.google.android.gms.vision.face;

import android.graphics.PointF;
import java.util.Arrays;
import java.util.List;

public class a {
    public static final float a = -1.0f;
    private int b;
    private PointF c;
    private float d;
    private float e;
    private float f;
    private float g;
    private List<c> h;
    private float i;
    private float j;
    private float k;

    public a(int i, PointF pointF, float f, float f2, float f3, float f4, c[] cVarArr, float f5, float f6, float f7) {
        this.b = i;
        this.c = pointF;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = Arrays.asList(cVarArr);
        if (f5 < 0.0f || f5 > 1.0f) {
            this.i = -1.0f;
        } else {
            this.i = f5;
        }
        if (f6 < 0.0f || f6 > 1.0f) {
            this.j = -1.0f;
        } else {
            this.j = f6;
        }
        if (f7 < 0.0f || f7 > 1.0f) {
            this.k = -1.0f;
        } else {
            this.k = f7;
        }
    }

    public PointF a() {
        return new PointF(this.c.x - (this.d / 2.0f), this.c.y - (this.e / 2.0f));
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }

    public float d() {
        return this.f;
    }

    public float e() {
        return this.g;
    }

    public List<c> f() {
        return this.h;
    }

    public float g() {
        return this.i;
    }

    public float h() {
        return this.j;
    }

    public float i() {
        return this.k;
    }

    public int j() {
        return this.b;
    }
}
