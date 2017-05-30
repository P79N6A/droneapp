package it.sephiroth.android.library.widget;

import android.content.Context;
import android.util.FloatMath;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class d {
    private static final int f = 250;
    private static final int g = 0;
    private static final int h = 1;
    private static float i = 8.0f;
    private static float j;
    private int a;
    private final a b;
    private final a c;
    private Interpolator d;
    private final boolean e;

    static {
        j = 1.0f;
        j = 1.0f / a(1.0f);
    }

    public d(Context context) {
        this(context, null);
    }

    public d(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public d(Context context, Interpolator interpolator, float f, float f2) {
        this(context, interpolator, true);
    }

    public d(Context context, Interpolator interpolator, float f, float f2, boolean z) {
        this(context, interpolator, z);
    }

    public d(Context context, Interpolator interpolator, boolean z) {
        this.d = interpolator;
        this.e = z;
        this.b = new a(context);
        this.c = new a(context);
    }

    public static float a(float f) {
        float f2 = i * f;
        return (f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp((double) (-f2)))) : ((1.0f - ((float) Math.exp((double) (1.0f - f2)))) * (1.0f - 0.36787945f)) + 0.36787945f) * j;
    }

    @Deprecated
    public void a(int i) {
        this.b.b(i);
        this.c.b(i);
    }

    public void a(int i, int i2, int i3) {
        this.b.c(i, i2, i3);
    }

    public void a(int i, int i2, int i3, int i4) {
        a(i, i2, i3, i4, 250);
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        this.a = 0;
        this.b.a(i, i3, i5);
        this.c.a(i2, i4, i5);
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        if (this.e && !a()) {
            float c = a.c(this.b);
            float c2 = a.c(this.c);
            if (Math.signum((float) i3) == Math.signum(c) && Math.signum((float) i4) == Math.signum(c2)) {
                i4 = (int) (((float) i4) + c2);
                i11 = (int) (c + ((float) i3));
                this.a = 1;
                this.b.a(i, i11, i5, i6, i9);
                this.c.a(i2, i4, i7, i8, i10);
            }
        }
        i11 = i3;
        this.a = 1;
        this.b.a(i, i11, i5, i6, i9);
        this.c.a(i2, i4, i7, i8, i10);
    }

    void a(Interpolator interpolator) {
        this.d = interpolator;
    }

    public final void a(boolean z) {
        a.a(this.b, a.a(this.c, z));
    }

    public final boolean a() {
        return a.a(this.b) && a.a(this.c);
    }

    public boolean a(float f, float f2) {
        return !a() && Math.signum(f) == Math.signum((float) (a.e(this.b) - a.d(this.b))) && Math.signum(f2) == Math.signum((float) (a.e(this.c) - a.d(this.c)));
    }

    public boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = 1;
        return this.b.b(i, i3, i4) || this.c.b(i2, i5, i6);
    }

    public final int b() {
        return a.b(this.b);
    }

    public final void b(float f) {
        this.b.a(f);
        this.c.a(f);
    }

    @Deprecated
    public void b(int i) {
        this.b.a(i);
    }

    public void b(int i, int i2, int i3) {
        this.c.c(i, i2, i3);
    }

    public final int c() {
        return a.b(this.c);
    }

    @Deprecated
    public void c(int i) {
        this.c.a(i);
    }

    public float d() {
        return FloatMath.sqrt((a.c(this.b) * a.c(this.b)) + (a.c(this.c) * a.c(this.c)));
    }

    public final int e() {
        return a.d(this.b);
    }

    public final int f() {
        return a.d(this.c);
    }

    public final int g() {
        return a.e(this.b);
    }

    public final int h() {
        return a.e(this.c);
    }

    @Deprecated
    public final int i() {
        return Math.max(a.f(this.b), a.f(this.c));
    }

    public boolean j() {
        if (a()) {
            return false;
        }
        switch (this.a) {
            case 0:
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - a.g(this.b);
                int f = a.f(this.b);
                if (currentAnimationTimeMillis >= ((long) f)) {
                    l();
                    break;
                }
                float f2 = ((float) currentAnimationTimeMillis) / ((float) f);
                f2 = this.d == null ? a(f2) : this.d.getInterpolation(f2);
                this.b.b(f2);
                this.c.b(f2);
                break;
            case 1:
                if (!(a.a(this.b) || this.b.c() || this.b.b())) {
                    this.b.a();
                }
                if (!(a.a(this.c) || this.c.c() || this.c.b())) {
                    this.c.a();
                    break;
                }
        }
        return true;
    }

    public boolean k() {
        return ((a.a(this.b) || a.h(this.b) == 0) && (a.a(this.c) || a.h(this.c) == 0)) ? false : true;
    }

    public void l() {
        this.b.a();
        this.c.a();
    }

    public int m() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - Math.min(a.g(this.b), a.g(this.c)));
    }
}
