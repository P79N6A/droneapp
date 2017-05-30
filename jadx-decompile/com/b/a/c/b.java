package com.b.a.c;

import android.opengl.GLES10;
import com.b.a.b.a.e;
import com.b.a.b.a.h;
import com.b.a.b.e.a;

public final class b {
    private static final int a = 2048;
    private static e b;

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        b = new e(max, max);
    }

    private b() {
    }

    private static int a(int i, int i2, int i3, boolean z) {
        int a = b.a();
        int b = b.b();
        while (true) {
            if (i / i3 <= a && i2 / i3 <= b) {
                return i3;
            }
            i3 = z ? i3 * 2 : i3 + 1;
        }
    }

    public static int a(e eVar) {
        int a = eVar.a();
        int b = eVar.b();
        return Math.max((int) Math.ceil((double) (((float) a) / ((float) b.a()))), (int) Math.ceil((double) (((float) b) / ((float) b.b()))));
    }

    public static int a(e eVar, e eVar2, h hVar, boolean z) {
        int max;
        int i = 1;
        int a = eVar.a();
        int b = eVar.b();
        int a2 = eVar2.a();
        int b2 = eVar2.b();
        int i2;
        int i3;
        switch (hVar) {
            case FIT_INSIDE:
                if (!z) {
                    max = Math.max(a / a2, b / b2);
                    break;
                }
                i2 = a / 2;
                i3 = b / 2;
                max = 1;
                while (true) {
                    if (i2 / max <= a2 && i3 / max <= b2) {
                        break;
                    }
                    max *= 2;
                }
                break;
            case CROP:
                if (!z) {
                    max = Math.min(a / a2, b / b2);
                    break;
                }
                i2 = a / 2;
                i3 = b / 2;
                max = 1;
                while (i2 / max > a2 && i3 / max > b2) {
                    max *= 2;
                }
                break;
            default:
                max = 1;
                break;
        }
        if (max >= 1) {
            i = max;
        }
        return a(a, b, i, z);
    }

    public static e a(a aVar, e eVar) {
        int a = aVar.a();
        if (a <= 0) {
            a = eVar.a();
        }
        int b = aVar.b();
        if (b <= 0) {
            b = eVar.b();
        }
        return new e(a, b);
    }

    public static float b(e eVar, e eVar2, h hVar, boolean z) {
        int i;
        int a = eVar.a();
        int b = eVar.b();
        int a2 = eVar2.a();
        int b2 = eVar2.b();
        float f = ((float) a) / ((float) a2);
        float f2 = ((float) b) / ((float) b2);
        if ((hVar != h.FIT_INSIDE || f < f2) && (hVar != h.CROP || f >= f2)) {
            i = (int) (((float) a) / f2);
            a2 = b2;
        } else {
            i = a2;
            a2 = (int) (((float) b) / f);
        }
        return ((z || i >= a || a2 >= b) && (!z || i == a || a2 == b)) ? 1.0f : ((float) i) / ((float) a);
    }
}
