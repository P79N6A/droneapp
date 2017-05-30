package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

class k {
    int a;
    j b;
    j c;
    Interpolator d;
    ArrayList<j> e = new ArrayList();
    p f;

    public k(j... jVarArr) {
        this.a = jVarArr.length;
        this.e.addAll(Arrays.asList(jVarArr));
        this.b = (j) this.e.get(0);
        this.c = (j) this.e.get(this.a - 1);
        this.d = this.c.d();
    }

    public static k a(float... fArr) {
        int i = 1;
        int length = fArr.length;
        a[] aVarArr = new a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (a) j.b(0.0f);
            aVarArr[1] = (a) j.a(1.0f, fArr[0]);
        } else {
            aVarArr[0] = (a) j.a(0.0f, fArr[0]);
            while (i < length) {
                aVarArr[i] = (a) j.a(((float) i) / ((float) (length - 1)), fArr[i]);
                i++;
            }
        }
        return new g(aVarArr);
    }

    public static k a(int... iArr) {
        int i = 1;
        int length = iArr.length;
        b[] bVarArr = new b[Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = (b) j.a(0.0f);
            bVarArr[1] = (b) j.a(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (b) j.a(0.0f, iArr[0]);
            while (i < length) {
                bVarArr[i] = (b) j.a(((float) i) / ((float) (length - 1)), iArr[i]);
                i++;
            }
        }
        return new i(bVarArr);
    }

    public static k a(j... jVarArr) {
        int i = 0;
        int length = jVarArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (jVarArr[i5] instanceof a) {
                i4 = 1;
            } else if (jVarArr[i5] instanceof b) {
                i3 = 1;
            } else {
                i2 = 1;
            }
        }
        if (i4 != 0 && i3 == 0 && r0 == 0) {
            a[] aVarArr = new a[length];
            while (i < length) {
                aVarArr[i] = (a) jVarArr[i];
                i++;
            }
            return new g(aVarArr);
        } else if (i3 == 0 || i4 != 0 || r0 != 0) {
            return new k(jVarArr);
        } else {
            b[] bVarArr = new b[length];
            for (int i6 = 0; i6 < length; i6++) {
                bVarArr[i6] = (b) jVarArr[i6];
            }
            return new i(bVarArr);
        }
    }

    public static k a(Object... objArr) {
        int i = 1;
        int length = objArr.length;
        j[] jVarArr = new c[Math.max(length, 2)];
        if (length == 1) {
            jVarArr[0] = (c) j.c(0.0f);
            jVarArr[1] = (c) j.a(1.0f, objArr[0]);
        } else {
            jVarArr[0] = (c) j.a(0.0f, objArr[0]);
            while (i < length) {
                jVarArr[i] = (c) j.a(((float) i) / ((float) (length - 1)), objArr[i]);
                i++;
            }
        }
        return new k(jVarArr);
    }

    public Object a(float f) {
        if (this.a == 2) {
            if (this.d != null) {
                f = this.d.getInterpolation(f);
            }
            return this.f.a(f, this.b.b(), this.c.b());
        } else if (f <= 0.0f) {
            r0 = (j) this.e.get(1);
            r1 = r0.d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r1 = this.b.c();
            return this.f.a((f - r1) / (r0.c() - r1), this.b.b(), r0.b());
        } else if (f >= 1.0f) {
            r0 = (j) this.e.get(this.a - 2);
            r1 = this.c.d();
            if (r1 != null) {
                f = r1.getInterpolation(f);
            }
            r1 = r0.c();
            return this.f.a((f - r1) / (this.c.c() - r1), r0.b(), this.c.b());
        } else {
            j jVar = this.b;
            int i = 1;
            while (i < this.a) {
                r0 = (j) this.e.get(i);
                if (f < r0.c()) {
                    r1 = r0.d();
                    if (r1 != null) {
                        f = r1.getInterpolation(f);
                    }
                    r1 = jVar.c();
                    return this.f.a((f - r1) / (r0.c() - r1), jVar.b(), r0.b());
                }
                i++;
                jVar = r0;
            }
            return this.c.b();
        }
    }

    public void a(p pVar) {
        this.f = pVar;
    }

    public k b() {
        ArrayList arrayList = this.e;
        int size = this.e.size();
        j[] jVarArr = new j[size];
        for (int i = 0; i < size; i++) {
            jVarArr[i] = ((j) arrayList.get(i)).f();
        }
        return new k(jVarArr);
    }

    public /* synthetic */ Object clone() {
        return b();
    }

    public String toString() {
        String str = " ";
        int i = 0;
        while (i < this.a) {
            String str2 = str + ((j) this.e.get(i)).b() + "  ";
            i++;
            str = str2;
        }
        return str;
    }
}
