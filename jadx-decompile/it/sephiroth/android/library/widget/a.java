package it.sephiroth.android.library.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.AutoScrollHelper;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.fimi.soul.view.photodraweeview.c;
import com.google.android.gms.maps.model.b;
import it.sephiroth.android.library.R;

public class a {
    private static final int L = 0;
    private static final int M = 1;
    private static final int N = 2;
    private static final int O = 3;
    private static final int P = 4;
    private static final int Q = 7;
    private static final int R = 7;
    private static final float S = 1.1f;
    private static final int T = 8;
    private static final int U = 16;
    public static final int a = 0;
    public static final int b = 1;
    private static final String c = "EdgeEffect";
    private static final int d = 1000;
    private static final int e = 167;
    private static final int f = 1000;
    private static final float g = 1.0f;
    private static final float h = 0.5f;
    private static final float i = 4.0f;
    private static final float j = 1.0f;
    private static final float k = 0.6f;
    private static final int l = 100;
    private static final float m = 0.001f;
    private static final int u = 300;
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private long I;
    private float J;
    private final Interpolator K;
    private int V = 0;
    private float W;
    private final Rect X = new Rect();
    private final int Y;
    private final int Z;
    private final int aa;
    private final int ab;
    private final int n;
    private final Drawable o;
    private final Drawable p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int v;
    private float w;
    private float x;
    private float y;
    private float z;

    public a(Context context, int i) {
        Resources resources = context.getResources();
        this.o = resources.getDrawable(R.drawable.hlv_overscroll_edge);
        this.p = resources.getDrawable(R.drawable.hlv_overscroll_glow);
        this.n = i;
        this.Y = this.o.getIntrinsicHeight();
        this.Z = this.p.getIntrinsicHeight();
        this.aa = this.p.getIntrinsicWidth();
        this.ab = (int) (Math.min((((((float) this.Z) * i) * ((float) this.Z)) / ((float) this.aa)) * k, ((float) this.Z) * i) + h);
        this.v = (int) ((resources.getDisplayMetrics().density * b.i) + h);
        this.K = new DecelerateInterpolator();
    }

    private void d() {
        float min = Math.min(((float) (AnimationUtils.currentAnimationTimeMillis() - this.I)) / this.J, 1.0f);
        float interpolation = this.K.getInterpolation(min);
        this.w = this.A + ((this.B - this.A) * interpolation);
        this.x = this.C + ((this.D - this.C) * interpolation);
        this.y = this.E + ((this.F - this.E) * interpolation);
        this.z = this.G + ((this.H - this.G) * interpolation);
        if (min >= 0.999f) {
            switch (this.V) {
                case 1:
                    this.V = 4;
                    this.I = AnimationUtils.currentAnimationTimeMillis();
                    this.J = 1000.0f;
                    this.A = this.w;
                    this.C = this.x;
                    this.E = this.y;
                    this.G = this.z;
                    this.B = 0.0f;
                    this.D = 0.0f;
                    this.F = 0.0f;
                    this.H = 0.0f;
                    return;
                case 2:
                    this.V = 3;
                    this.I = AnimationUtils.currentAnimationTimeMillis();
                    this.J = 1000.0f;
                    this.A = this.w;
                    this.C = this.x;
                    this.E = this.y;
                    this.G = this.z;
                    this.B = 0.0f;
                    this.D = 0.0f;
                    this.F = 0.0f;
                    this.H = 0.0f;
                    return;
                case 3:
                    this.V = 0;
                    return;
                case 4:
                    this.x = ((this.H != 0.0f ? 1.0f / (this.H * this.H) : AutoScrollHelper.NO_MAX) * (interpolation * (this.D - this.C))) + this.C;
                    this.V = 3;
                    return;
                default:
                    return;
            }
        }
    }

    public Rect a(boolean z) {
        int i = 0;
        this.X.set(0, 0, this.q, this.ab);
        Rect rect = this.X;
        int i2 = this.s;
        int i3 = this.t;
        if (z) {
            i = this.ab;
        }
        rect.offset(i2, i3 - i);
        return this.X;
    }

    public void a(float f) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.V != 4 || ((float) (currentAnimationTimeMillis - this.I)) >= this.J) {
            if (this.V != 1) {
                this.z = 1.0f;
            }
            this.V = 1;
            this.I = currentAnimationTimeMillis;
            this.J = 167.0f;
            this.W += f;
            float abs = Math.abs(this.W);
            float max = Math.max(k, Math.min(abs, 1.0f));
            this.A = max;
            this.w = max;
            abs = Math.max(h, Math.min(abs * 7.0f, 1.0f));
            this.C = abs;
            this.x = abs;
            abs = Math.min(1.0f, this.y + (Math.abs(f) * S));
            this.E = abs;
            this.y = abs;
            abs = Math.abs(f);
            if (f > 0.0f && this.W < 0.0f) {
                abs = -abs;
            }
            if (this.W == 0.0f) {
                this.z = 0.0f;
            }
            abs = Math.min(i, Math.max(0.0f, (abs * 7.0f) + this.z));
            this.G = abs;
            this.z = abs;
            this.B = this.w;
            this.D = this.x;
            this.F = this.y;
            this.H = this.z;
        }
    }

    public void a(int i) {
        this.V = 2;
        int max = Math.max(100, Math.abs(i));
        this.I = AnimationUtils.currentAnimationTimeMillis();
        this.J = 0.1f + (((float) max) * 0.03f);
        this.A = 0.0f;
        this.C = 0.0f;
        this.x = 0.0f;
        this.E = h;
        this.G = 0.0f;
        this.B = (float) Math.max(0, Math.min(max * 8, 1));
        this.D = Math.max(h, Math.min((float) (max * 8), 1.0f));
        this.H = Math.min(0.025f + (((float) ((max / 100) * max)) * 1.5E-4f), c.b);
        this.F = Math.max(this.E, Math.min(((float) (max * 16)) * 1.0E-5f, 1.0f));
    }

    public void a(int i, int i2) {
        this.q = i;
        this.r = i2;
    }

    public boolean a() {
        return this.V == 0;
    }

    public boolean a(Canvas canvas) {
        d();
        this.p.setAlpha((int) (Math.max(0.0f, Math.min(this.y, 1.0f)) * 255.0f));
        int min = (int) Math.min((((((float) this.Z) * this.z) * ((float) this.Z)) / ((float) this.aa)) * k, ((float) this.Z) * i);
        if (this.n == 0) {
            this.p.setBounds(0, 0, this.q, min);
        } else {
            this.p.setBounds(0, 0, this.q, min);
        }
        this.p.draw(canvas);
        this.o.setAlpha((int) (Math.max(0.0f, Math.min(this.w, 1.0f)) * 255.0f));
        int i = (int) (((float) this.Y) * this.x);
        if (this.n == 0) {
            this.o.setBounds(0, 0, this.q, i);
        } else {
            this.o.setBounds(0, 0, this.q, i);
        }
        this.o.draw(canvas);
        if (this.V == 3 && min == 0 && i == 0) {
            this.V = 0;
        }
        return this.V != 0;
    }

    public void b() {
        this.V = 0;
    }

    public void b(int i, int i2) {
        this.s = i;
        this.t = i2;
    }

    public void c() {
        this.W = 0.0f;
        if (this.V == 1 || this.V == 4) {
            this.V = 3;
            this.A = this.w;
            this.C = this.x;
            this.E = this.y;
            this.G = this.z;
            this.B = 0.0f;
            this.D = 0.0f;
            this.F = 0.0f;
            this.H = 0.0f;
            this.I = AnimationUtils.currentAnimationTimeMillis();
            this.J = 1000.0f;
        }
    }
}
