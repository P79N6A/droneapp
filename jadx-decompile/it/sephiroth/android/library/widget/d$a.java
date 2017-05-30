package it.sephiroth.android.library.widget;

import android.content.Context;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import com.fimi.soul.view.photodraweeview.c;

class d$a {
    private static final int A = 1;
    private static final int B = 2;
    private static final float o = 2000.0f;
    private static float q = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    private static final float r = 0.35f;
    private static final float s = 0.5f;
    private static final float t = 1.0f;
    private static final float u = 0.175f;
    private static final float v = 0.35000002f;
    private static final int w = 100;
    private static final float[] x = new float[101];
    private static final float[] y = new float[101];
    private static final int z = 0;
    private int a;
    private int b;
    private int c;
    private int d;
    private float e;
    private float f;
    private long g;
    private int h;
    private int i;
    private int j;
    private boolean k = true;
    private int l;
    private float m = ViewConfiguration.getScrollFriction();
    private int n = 0;
    private float p;

    static {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (i < 100) {
            float f3;
            float f4 = ((float) i) / 100.0f;
            float f5 = 1.0f;
            float f6 = f2;
            while (true) {
                f2 = ((f5 - f6) / 2.0f) + f6;
                f3 = (c.a * f2) * (1.0f - f2);
                float f7 = ((((1.0f - f2) * u) + (v * f2)) * f3) + ((f2 * f2) * f2);
                if (((double) Math.abs(f7 - f4)) < 1.0E-5d) {
                    break;
                } else if (f7 > f4) {
                    f5 = f2;
                } else {
                    f6 = f2;
                }
            }
            x[i] = (f2 * (f2 * f2)) + (f3 * (((1.0f - f2) * s) + f2));
            f5 = 1.0f;
            while (true) {
                f2 = ((f5 - f) / 2.0f) + f;
                f3 = (c.a * f2) * (1.0f - f2);
                f7 = ((((1.0f - f2) * s) + f2) * f3) + ((f2 * f2) * f2);
                if (((double) Math.abs(f7 - f4)) < 1.0E-5d) {
                    break;
                } else if (f7 > f4) {
                    f5 = f2;
                } else {
                    f = f2;
                }
            }
            y[i] = (f2 * (f2 * f2)) + ((((1.0f - f2) * u) + (v * f2)) * f3);
            i++;
            f2 = f6;
        }
        float[] fArr = x;
        y[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    d$a(Context context) {
        this.p = ((context.getResources().getDisplayMetrics().density * 160.0f) * 386.0878f) * 0.84f;
    }

    private void a(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i <= i2 || i >= i3) {
            boolean z2 = i > i3;
            int i5 = z2 ? i3 : i2;
            int i6 = i - i5;
            if (i6 * i4 < 0) {
                z = false;
            }
            if (z) {
                g(i, i5, i4);
                return;
            } else if (e(i4) > ((double) Math.abs(i6))) {
                a(i, i4, z2 ? i2 : i, z2 ? i : i3, this.l);
                return;
            } else {
                e(i, i5, i4);
                return;
            }
        }
        Log.e("OverScroller", "startAfterEdge called from a valid position");
        this.k = true;
    }

    private static float c(int i) {
        return i > 0 ? -2000.0f : o;
    }

    private double d(int i) {
        return Math.log((double) ((r * ((float) Math.abs(i))) / (this.m * this.p)));
    }

    private void d() {
        float abs = ((float) (this.d * this.d)) / (Math.abs(this.f) * 2.0f);
        float signum = Math.signum((float) this.d);
        if (abs > ((float) this.l)) {
            this.f = (((-signum) * ((float) this.d)) * ((float) this.d)) / (((float) this.l) * 2.0f);
            abs = (float) this.l;
        }
        this.l = (int) abs;
        this.n = 2;
        int i = this.a;
        if (this.d <= 0) {
            abs = -abs;
        }
        this.c = ((int) abs) + i;
        this.h = -((int) ((1000.0f * ((float) this.d)) / this.f));
    }

    private void d(int i, int i2, int i3) {
        float abs = Math.abs(((float) (i3 - i)) / ((float) (i2 - i)));
        int i4 = (int) (100.0f * abs);
        if (i4 < 100) {
            float f = ((float) i4) / 100.0f;
            float f2 = ((float) (i4 + 1)) / 100.0f;
            float f3 = y[i4];
            this.h = (int) (((((abs - f) / (f2 - f)) * (y[i4 + 1] - f3)) + f3) * ((float) this.h));
        }
    }

    private double e(int i) {
        return Math.exp(d(i) * (((double) q) / (((double) q) - 1.0d))) * ((double) (this.m * this.p));
    }

    private void e(int i, int i2, int i3) {
        this.k = false;
        this.n = 1;
        this.a = i;
        this.c = i2;
        int i4 = i - i2;
        this.f = c(i4);
        this.d = -i4;
        this.l = Math.abs(i4);
        this.h = (int) (Math.sqrt((((double) i4) * -2.0d) / ((double) this.f)) * 1000.0d);
    }

    private int f(int i) {
        return (int) (Math.exp(d(i) / (((double) q) - 1.0d)) * 1000.0d);
    }

    private void f(int i, int i2, int i3) {
        float sqrt = (float) Math.sqrt((((double) (((((float) (i3 * i3)) / 2.0f) / Math.abs(this.f)) + ((float) Math.abs(i2 - i)))) * 2.0d) / ((double) Math.abs(this.f)));
        this.g -= (long) ((int) ((sqrt - (((float) (-i3)) / this.f)) * 1000.0f));
        this.a = i2;
        this.d = (int) ((-this.f) * sqrt);
    }

    private void g(int i, int i2, int i3) {
        this.f = c(i3 == 0 ? i - i2 : i3);
        f(i, i2, i3);
        d();
    }

    void a() {
        this.b = this.c;
        this.k = true;
    }

    void a(float f) {
        this.m = f;
    }

    void a(int i) {
        this.c = i;
        this.k = false;
    }

    void a(int i, int i2, int i3) {
        this.k = false;
        this.a = i;
        this.c = i + i2;
        this.g = AnimationUtils.currentAnimationTimeMillis();
        this.h = i3;
        this.f = 0.0f;
        this.d = 0;
    }

    void a(int i, int i2, int i3, int i4, int i5) {
        this.l = i5;
        this.k = false;
        this.d = i2;
        this.e = (float) i2;
        this.i = 0;
        this.h = 0;
        this.g = AnimationUtils.currentAnimationTimeMillis();
        this.a = i;
        this.b = i;
        if (i > i4 || i < i3) {
            a(i, i3, i4, i2);
            return;
        }
        this.n = 0;
        double d = 0.0d;
        if (i2 != 0) {
            int f = f(i2);
            this.i = f;
            this.h = f;
            d = e(i2);
        }
        this.j = (int) (d * ((double) Math.signum((float) i2)));
        this.c = this.j + i;
        if (this.c < i3) {
            d(this.a, this.c, i3);
            this.c = i3;
        }
        if (this.c > i4) {
            d(this.a, this.c, i4);
            this.c = i4;
        }
    }

    void b(float f) {
        this.b = this.a + Math.round(((float) (this.c - this.a)) * f);
    }

    void b(int i) {
        this.h = ((int) (AnimationUtils.currentAnimationTimeMillis() - this.g)) + i;
        this.k = false;
    }

    boolean b() {
        switch (this.n) {
            case 0:
                if (this.h < this.i) {
                    this.a = this.c;
                    this.d = (int) this.e;
                    this.f = c(this.d);
                    this.g += (long) this.h;
                    d();
                    break;
                }
                return false;
            case 1:
                return false;
            case 2:
                this.g += (long) this.h;
                e(this.c, this.a, 0);
                break;
        }
        c();
        return true;
    }

    boolean b(int i, int i2, int i3) {
        this.k = true;
        this.c = i;
        this.a = i;
        this.d = 0;
        this.g = AnimationUtils.currentAnimationTimeMillis();
        this.h = 0;
        if (i < i2) {
            e(i, i2, 0);
        } else if (i > i3) {
            e(i, i3, 0);
        }
        return !this.k;
    }

    void c(int i, int i2, int i3) {
        if (this.n == 0) {
            this.l = i3;
            this.g = AnimationUtils.currentAnimationTimeMillis();
            a(i, i2, i2, (int) this.e);
        }
    }

    boolean c() {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.g;
        if (currentAnimationTimeMillis > ((long) this.h)) {
            return false;
        }
        double d = 0.0d;
        float f;
        float f2;
        float f3;
        switch (this.n) {
            case 0:
                f = ((float) currentAnimationTimeMillis) / ((float) this.i);
                int i = (int) (100.0f * f);
                float f4 = 1.0f;
                f2 = 0.0f;
                if (i < 100) {
                    f4 = ((float) i) / 100.0f;
                    f2 = ((float) (i + 1)) / 100.0f;
                    f3 = x[i];
                    f2 = (x[i + 1] - f3) / (f2 - f4);
                    f4 = ((f - f4) * f2) + f3;
                }
                double d2 = (double) (f4 * ((float) this.j));
                this.e = ((f2 * ((float) this.j)) / ((float) this.i)) * 1000.0f;
                d = d2;
                break;
            case 1:
                f = ((float) currentAnimationTimeMillis) / ((float) this.h);
                float f5 = f * f;
                f3 = Math.signum((float) this.d);
                d = (double) ((((float) this.l) * f3) * ((c.a * f5) - ((2.0f * f) * f5)));
                this.e = ((-f) + f5) * ((f3 * ((float) this.l)) * 6.0f);
                break;
            case 2:
                f2 = ((float) currentAnimationTimeMillis) / 1000.0f;
                this.e = ((float) this.d) + (this.f * f2);
                d = (double) (((f2 * (this.f * f2)) / 2.0f) + (((float) this.d) * f2));
                break;
        }
        this.b = ((int) Math.round(d)) + this.a;
        return true;
    }
}
