package com.google.android.gms.internal;

import android.graphics.PointF;
import java.util.ArrayList;

public class fp {
    private static final com.google.android.gms.internal.fn.b b = new com.google.android.gms.internal.fn.b();
    private static final com.google.android.gms.internal.fn.a c = new com.google.android.gms.internal.fn.a();
    private ArrayList<d> a = new ArrayList();

    private static class a {
        a a;
        float b;
        PointF c;

        a(a aVar, float f, PointF pointF) {
            this.a = aVar;
            this.b = f;
            this.c = pointF;
        }
    }

    public interface d {
        void a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF);
    }

    public static class b implements d {
        final float a;
        final float b;
        final float c;
        final float d;
        final float e;
        final float f;
        private final boolean g;

        public b(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.g = z;
        }

        public void a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
            PointF[] pointFArr;
            PointF pointF2 = arrayList.isEmpty() ? new PointF(0.0f, 0.0f) : (PointF) arrayList.get(arrayList.size() - 1);
            if (this.g) {
                PointF[] pointFArr2 = new PointF[4];
                pointFArr2[0] = pointF2;
                pointFArr2[1] = new PointF(this.a + pointF2.x, this.b + pointF2.y);
                pointFArr2[2] = new PointF(this.c + pointF2.x, this.d + pointF2.y);
                pointFArr2[3] = new PointF(this.e + pointF2.x, pointF2.y + this.f);
                pointFArr = pointFArr2;
            } else {
                pointFArr = new PointF[]{pointF2, new PointF(this.a, this.b), new PointF(this.c, this.d), new PointF(this.e, this.f)};
            }
            fp.b(pointFArr, fp.c, true, arrayList, arrayList2, f, pointF);
        }
    }

    public static class c implements d {
        final float a;
        final float b;
        private final boolean c;

        public c(float f, float f2, boolean z) {
            this.a = f;
            this.b = f2;
            this.c = z;
        }

        public void a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
            PointF pointF2;
            if (arrayList2.isEmpty()) {
                arrayList2.add(Float.valueOf(0.0f));
            } else {
                arrayList2.add((Float) arrayList2.get(arrayList2.size() - 1));
            }
            if (!this.c || arrayList.isEmpty()) {
                pointF2 = new PointF(this.a, this.b);
            } else {
                pointF2 = (PointF) arrayList.get(arrayList.size() - 1);
                pointF2 = new PointF(pointF2.x + this.a, pointF2.y + this.b);
            }
            arrayList.add(pointF2);
            pointF.set(pointF2);
        }
    }

    static boolean a(PointF[] pointFArr, fn fnVar, float f, PointF pointF, float f2, PointF pointF2, float[] fArr, PointF pointF3, float f3) {
        fArr[0] = (f2 + f) / 2.0f;
        float f4 = (pointF2.x + pointF.x) / 2.0f;
        float f5 = (pointF2.y + pointF.y) / 2.0f;
        fnVar.a(fArr[0], pointFArr, pointF3);
        f4 = pointF3.x - f4;
        f5 = pointF3.y - f5;
        return (f4 * f4) + (f5 * f5) > f3;
    }

    private static void b(PointF[] pointFArr, fn fnVar, boolean z, ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
        a aVar = new a(null, 1.0f, fnVar.a(1.0f, pointFArr, new PointF()));
        a aVar2 = new a(aVar, 0.0f, fnVar.a(0.0f, pointFArr, new PointF()));
        float[] fArr = new float[1];
        a aVar3 = aVar2;
        boolean z2 = z;
        while (aVar != null) {
            boolean z3;
            do {
                a aVar4 = aVar;
                boolean z4 = z2;
                PointF pointF2 = new PointF();
                boolean a = a(pointFArr, fnVar, aVar3.b, aVar3.c, aVar4.b, aVar4.c, fArr, pointF2, f);
                if (!a && z4) {
                    float[] fArr2 = new float[1];
                    PointF[] pointFArr2 = pointFArr;
                    fn fnVar2 = fnVar;
                    a = a(pointFArr2, fnVar2, aVar3.b, aVar3.c, fArr[0], pointF2, fArr2, new PointF(), f);
                    if (a) {
                        z3 = a;
                        z2 = false;
                        if (z3) {
                            aVar = aVar4;
                            continue;
                        } else {
                            aVar = new a(aVar4, fArr[0], pointF2);
                            aVar3.a = aVar;
                            continue;
                        }
                    }
                }
                z3 = a;
                z2 = z4;
                if (z3) {
                    aVar = aVar4;
                    continue;
                } else {
                    aVar = new a(aVar4, fArr[0], pointF2);
                    aVar3.a = aVar;
                    continue;
                }
            } while (z3);
            aVar3 = aVar;
            aVar = aVar.a;
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new PointF(0.0f, 0.0f));
            arrayList2.add(Float.valueOf(0.0f));
            pointF.set(0.0f, 0.0f);
        }
        PointF pointF3 = (PointF) arrayList.get(arrayList.size() - 1);
        PointF pointF4 = pointF3;
        float floatValue = ((Float) arrayList2.get(arrayList2.size() - 1)).floatValue();
        PointF pointF5 = pointF4;
        for (a aVar5 = aVar2; aVar5 != null; aVar5 = aVar5.a) {
            arrayList.add(aVar5.c);
            floatValue += PointF.length(aVar5.c.x - pointF5.x, aVar5.c.y - pointF5.y);
            arrayList2.add(Float.valueOf(floatValue));
            pointF5 = aVar5.c;
        }
    }

    public void a(float f, float f2) {
        this.a.add(new c(f, f2, false));
    }

    public void a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new b(f, f2, f3, f4, f5, f6, false));
    }

    float[] a(float f) {
        float f2;
        int i = 0;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size + 1);
        ArrayList arrayList2 = new ArrayList(size + 1);
        float f3 = f * f;
        PointF pointF = new PointF();
        for (int i2 = 0; i2 < size; i2++) {
            ((d) this.a.get(i2)).a(arrayList, arrayList2, f3, pointF);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new PointF(0.0f, 0.0f));
            arrayList2.add(Float.valueOf(0.0f));
        }
        float floatValue = ((Float) arrayList2.get(arrayList2.size() - 1)).floatValue();
        if (floatValue == 0.0f) {
            arrayList.add((PointF) arrayList.get(arrayList.size() - 1));
            arrayList2.add(Float.valueOf(1.0f));
            f2 = 1.0f;
        } else {
            f2 = floatValue;
        }
        int size2 = arrayList.size();
        float[] fArr = new float[(size2 * 3)];
        size = 0;
        while (i < size2) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i3 = size + 1;
            fArr[size] = ((Float) arrayList2.get(i)).floatValue() / f2;
            size = i3 + 1;
            fArr[i3] = pointF2.x;
            int i4 = size + 1;
            fArr[size] = pointF2.y;
            i++;
            size = i4;
        }
        return fArr;
    }
}
