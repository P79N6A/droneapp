package it.sephiroth.android.library.a;

import java.util.Random;

public final class a {
    private static final Random a = new Random();
    private static final float b = 0.017453292f;
    private static final float c = 57.295784f;

    private a() {
    }

    public static float a(float f) {
        return f > 0.0f ? f : -f;
    }

    public static float a(float f, float f2) {
        return (float) Math.pow((double) f, (double) f2);
    }

    public static float a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static float a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    public static float a(float f, float f2, float f3, float f4, float f5) {
        return ((f3 - f4) * ((f5 - f) / (f2 - f))) + f3;
    }

    public static float a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float f9 = f6 - f3;
        return (float) Math.sqrt((double) (((f7 * f7) + (f8 * f8)) + (f9 * f9)));
    }

    public static float a(int i, int i2) {
        return i > i2 ? (float) i : (float) i2;
    }

    public static int a(int i) {
        return (int) (a.nextFloat() * ((float) i));
    }

    public static int a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static long a(long j, long j2, long j3) {
        return j < j2 ? j2 : j > j3 ? j3 : j;
    }

    public static void a(long j) {
        a.setSeed(j);
    }

    public static float b(float f) {
        return (float) Math.log((double) f);
    }

    public static float b(float f, float f2) {
        return f > f2 ? f : f2;
    }

    public static float b(float f, float f2, float f3) {
        return f > f2 ? f > f3 ? f : f3 : f2 > f3 ? f2 : f3;
    }

    public static float b(int i, int i2) {
        return i < i2 ? (float) i : (float) i2;
    }

    public static float b(int i, int i2, int i3) {
        if (i > i2) {
            if (i <= i3) {
                i = i3;
            }
            return (float) i;
        }
        if (i2 <= i3) {
            i2 = i3;
        }
        return (float) i2;
    }

    public static float c(float f) {
        return (float) Math.exp((double) f);
    }

    public static float c(float f, float f2) {
        return f < f2 ? f : f2;
    }

    public static float c(float f, float f2, float f3) {
        return f < f2 ? f < f3 ? f : f3 : f2 < f3 ? f2 : f3;
    }

    public static float c(int i, int i2, int i3) {
        if (i < i2) {
            if (i >= i3) {
                i = i3;
            }
            return (float) i;
        }
        if (i2 >= i3) {
            i2 = i3;
        }
        return (float) i2;
    }

    public static int c(int i, int i2) {
        return i >= i2 ? i : (int) ((a.nextFloat() * ((float) (i2 - i))) + ((float) i));
    }

    public static float d(float f) {
        return f * f;
    }

    public static float d(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public static float d(float f, float f2, float f3) {
        return (float) Math.sqrt((double) (((f * f) + (f2 * f2)) + (f3 * f3)));
    }

    public static float e(float f) {
        return b * f;
    }

    public static float e(float f, float f2) {
        return (float) Math.atan2((double) f, (double) f2);
    }

    public static float e(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float f(float f) {
        return c * f;
    }

    public static float f(float f, float f2) {
        return f >= f2 ? f : f + (a.nextFloat() * (f2 - f));
    }

    public static float f(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public static float g(float f) {
        return (float) Math.acos((double) f);
    }

    public static float h(float f) {
        return (float) Math.asin((double) f);
    }

    public static float i(float f) {
        return (float) Math.atan((double) f);
    }

    public static float j(float f) {
        return (float) Math.tan((double) f);
    }

    public static float k(float f) {
        return a.nextFloat() * f;
    }
}
