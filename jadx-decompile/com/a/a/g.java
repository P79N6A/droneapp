package com.a.a;

import java.util.ArrayList;

class g extends k {
    private float g;
    private float h;
    private float i;
    private boolean j = true;

    public g(a... aVarArr) {
        super(aVarArr);
    }

    public g a() {
        ArrayList arrayList = this.e;
        int size = this.e.size();
        a[] aVarArr = new a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = (a) ((j) arrayList.get(i)).f();
        }
        return new g(aVarArr);
    }

    public Object a(float f) {
        return Float.valueOf(b(f));
    }

    public float b(float f) {
        int i = 1;
        if (this.a == 2) {
            if (this.j) {
                this.j = false;
                this.g = ((a) this.e.get(0)).g();
                this.h = ((a) this.e.get(1)).g();
                this.i = this.h - this.g;
            }
            if (this.d != null) {
                f = this.d.getInterpolation(f);
            }
            return this.f == null ? this.g + (this.i * f) : ((Number) this.f.a(f, Float.valueOf(this.g), Float.valueOf(this.h))).floatValue();
        } else if (f <= 0.0f) {
            r0 = (a) this.e.get(0);
            r1 = (a) this.e.get(1);
            r2 = r0.g();
            r3 = r1.g();
            r0 = r0.c();
            r4 = r1.c();
            r1 = r1.d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r0 = (f - r0) / (r4 - r0);
            return this.f == null ? (r0 * (r3 - r2)) + r2 : ((Number) this.f.a(r0, Float.valueOf(r2), Float.valueOf(r3))).floatValue();
        } else if (f >= 1.0f) {
            r0 = (a) this.e.get(this.a - 2);
            r1 = (a) this.e.get(this.a - 1);
            r2 = r0.g();
            r3 = r1.g();
            r0 = r0.c();
            r4 = r1.c();
            r1 = r1.d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r0 = (f - r0) / (r4 - r0);
            return this.f == null ? (r0 * (r3 - r2)) + r2 : ((Number) this.f.a(r0, Float.valueOf(r2), Float.valueOf(r3))).floatValue();
        } else {
            a aVar = (a) this.e.get(0);
            while (i < this.a) {
                r0 = (a) this.e.get(i);
                if (f < r0.c()) {
                    r1 = r0.d();
                    if (r1 != null) {
                        f = r1.getInterpolation(f);
                    }
                    float c = (f - aVar.c()) / (r0.c() - aVar.c());
                    r2 = aVar.g();
                    r0 = r0.g();
                    return this.f == null ? ((r0 - r2) * c) + r2 : ((Number) this.f.a(c, Float.valueOf(r2), Float.valueOf(r0))).floatValue();
                } else {
                    i++;
                    aVar = r0;
                }
            }
            return ((Number) ((j) this.e.get(this.a - 1)).b()).floatValue();
        }
    }

    public /* synthetic */ k b() {
        return a();
    }

    public /* synthetic */ Object clone() {
        return a();
    }
}
