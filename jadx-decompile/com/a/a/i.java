package com.a.a;

import java.util.ArrayList;

class i extends k {
    private int g;
    private int h;
    private int i;
    private boolean j = true;

    public i(b... bVarArr) {
        super(bVarArr);
    }

    public i a() {
        ArrayList arrayList = this.e;
        int size = this.e.size();
        b[] bVarArr = new b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = (b) ((j) arrayList.get(i)).f();
        }
        return new i(bVarArr);
    }

    public Object a(float f) {
        return Integer.valueOf(b(f));
    }

    public int b(float f) {
        int i = 1;
        if (this.a == 2) {
            if (this.j) {
                this.j = false;
                this.g = ((b) this.e.get(0)).g();
                this.h = ((b) this.e.get(1)).g();
                this.i = this.h - this.g;
            }
            if (this.d != null) {
                f = this.d.getInterpolation(f);
            }
            return this.f == null ? this.g + ((int) (((float) this.i) * f)) : ((Number) this.f.a(f, Integer.valueOf(this.g), Integer.valueOf(this.h))).intValue();
        } else if (f <= 0.0f) {
            r0 = (b) this.e.get(0);
            r1 = (b) this.e.get(1);
            r2 = r0.g();
            r3 = r1.g();
            r0 = r0.c();
            r4 = r1.c();
            r1 = r1.d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r0 = (f - r0) / (r4 - r0);
            return this.f == null ? ((int) (r0 * ((float) (r3 - r2)))) + r2 : ((Number) this.f.a(r0, Integer.valueOf(r2), Integer.valueOf(r3))).intValue();
        } else if (f >= 1.0f) {
            r0 = (b) this.e.get(this.a - 2);
            r1 = (b) this.e.get(this.a - 1);
            r2 = r0.g();
            r3 = r1.g();
            r0 = r0.c();
            r4 = r1.c();
            r1 = r1.d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r0 = (f - r0) / (r4 - r0);
            return this.f == null ? ((int) (r0 * ((float) (r3 - r2)))) + r2 : ((Number) this.f.a(r0, Integer.valueOf(r2), Integer.valueOf(r3))).intValue();
        } else {
            b bVar = (b) this.e.get(0);
            while (i < this.a) {
                r0 = (b) this.e.get(i);
                if (f < r0.c()) {
                    r1 = r0.d();
                    if (r1 != null) {
                        f = r1.getInterpolation(f);
                    }
                    float c = (f - bVar.c()) / (r0.c() - bVar.c());
                    r2 = bVar.g();
                    int g = r0.g();
                    return this.f == null ? ((int) (((float) (g - r2)) * c)) + r2 : ((Number) this.f.a(c, Integer.valueOf(r2), Integer.valueOf(g))).intValue();
                } else {
                    i++;
                    bVar = r0;
                }
            }
            return ((Number) ((j) this.e.get(this.a - 1)).b()).intValue();
        }
    }

    public /* synthetic */ k b() {
        return a();
    }

    public /* synthetic */ Object clone() {
        return a();
    }
}
