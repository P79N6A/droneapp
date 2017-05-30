package com.fimi.soul.view.photodraweeview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.widget.ScrollerCompat;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeView;
import java.lang.ref.WeakReference;

public class a implements OnTouchListener, c, f {
    private static final int e = -1;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private g A;
    private OnLongClickListener B;
    private e C;
    private final float[] i = new float[9];
    private final RectF j = new RectF();
    private final Interpolator k = new AccelerateDecelerateInterpolator();
    private float l = 1.0f;
    private float m = c.b;
    private float n = c.a;
    private long o = 200;
    private h p;
    private GestureDetectorCompat q;
    private boolean r = false;
    private boolean s = true;
    private int t = 2;
    private final Matrix u = new Matrix();
    private int v = -1;
    private int w = -1;
    private b x;
    private WeakReference<DraweeView<GenericDraweeHierarchy>> y;
    private d z;

    private class a implements Runnable {
        final /* synthetic */ a a;
        private final float b;
        private final float c;
        private final long d = System.currentTimeMillis();
        private final float e;
        private final float f;

        public a(a aVar, float f, float f2, float f3, float f4) {
            this.a = aVar;
            this.b = f3;
            this.c = f4;
            this.e = f;
            this.f = f2;
        }

        private float a() {
            return this.a.k.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.d)) * 1.0f) / ((float) this.a.o)));
        }

        public void run() {
            View a = this.a.a();
            if (a != null) {
                float a2 = a();
                this.a.a((this.e + ((this.f - this.e) * a2)) / this.a.getScale(), this.b, this.c);
                if (a2 < 1.0f) {
                    this.a.a(a, (Runnable) this);
                }
            }
        }
    }

    private class b implements Runnable {
        final /* synthetic */ a a;
        private final ScrollerCompat b;
        private int c;
        private int d;

        public b(a aVar, Context context) {
            this.a = aVar;
            this.b = ScrollerCompat.create(context);
        }

        public void a() {
            this.b.abortAnimation();
        }

        public void a(int i, int i2, int i3, int i4) {
            RectF c = this.a.c();
            if (c != null) {
                int round;
                int i5;
                int round2;
                int i6;
                int round3 = Math.round(-c.left);
                if (((float) i) < c.width()) {
                    round = Math.round(c.width() - ((float) i));
                    i5 = 0;
                } else {
                    round = round3;
                    i5 = round3;
                }
                int round4 = Math.round(-c.top);
                if (((float) i2) < c.height()) {
                    round2 = Math.round(c.height() - ((float) i2));
                    i6 = 0;
                } else {
                    round2 = round4;
                    i6 = round4;
                }
                this.c = round3;
                this.d = round4;
                if (round3 != round || round4 != round2) {
                    this.b.fling(round3, round4, i3, i4, i5, round, i6, round2, 0, 0);
                }
            }
        }

        public void run() {
            if (!this.b.isFinished()) {
                View a = this.a.a();
                if (a != null && this.b.computeScrollOffset()) {
                    int currX = this.b.getCurrX();
                    int currY = this.b.getCurrY();
                    this.a.u.postTranslate((float) (this.c - currX), (float) (this.d - currY));
                    a.invalidate();
                    this.c = currX;
                    this.d = currY;
                    this.a.a(a, (Runnable) this);
                }
            }
        }
    }

    public a(DraweeView<GenericDraweeHierarchy> draweeView) {
        this.y = new WeakReference(draweeView);
        ((GenericDraweeHierarchy) draweeView.getHierarchy()).setActualImageScaleType(ScaleType.FIT_CENTER);
        draweeView.setOnTouchListener(this);
        this.p = new h(draweeView.getContext(), this);
        this.q = new GestureDetectorCompat(draweeView.getContext(), new SimpleOnGestureListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                if (this.a.B != null) {
                    this.a.B.onLongClick(this.a.a());
                }
            }
        });
        this.q.setOnDoubleTapListener(new b(this));
    }

    private float a(Matrix matrix, int i) {
        matrix.getValues(this.i);
        return this.i[i];
    }

    private RectF a(Matrix matrix) {
        DraweeView a = a();
        if (a == null || (this.w == -1 && this.v == -1)) {
            return null;
        }
        this.j.set(0.0f, 0.0f, (float) this.w, (float) this.v);
        ((GenericDraweeHierarchy) a.getHierarchy()).getActualImageBounds(this.j);
        matrix.mapRect(this.j);
        return this.j;
    }

    private void a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    private static void b(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    private int h() {
        DraweeView a = a();
        return a != null ? (a.getWidth() - a.getPaddingLeft()) - a.getPaddingRight() : 0;
    }

    private int i() {
        DraweeView a = a();
        return a != null ? (a.getHeight() - a.getPaddingTop()) - a.getPaddingBottom() : 0;
    }

    private void j() {
        if (this.w != -1 || this.v != -1) {
            k();
        }
    }

    private void k() {
        this.u.reset();
        e();
        DraweeView a = a();
        if (a != null) {
            a.invalidate();
        }
    }

    private void l() {
        DraweeView a = a();
        if (a != null && getScale() < this.l) {
            RectF c = c();
            if (c != null) {
                a.post(new a(this, getScale(), this.l, c.centerX(), c.centerY()));
            }
        }
    }

    private void m() {
        if (this.x != null) {
            this.x.a();
            this.x = null;
        }
    }

    @Nullable
    public DraweeView<GenericDraweeHierarchy> a() {
        return (DraweeView) this.y.get();
    }

    public void a(float f, float f2) {
        DraweeView a = a();
        if (a != null && !this.p.a()) {
            this.u.postTranslate(f, f2);
            d();
            ViewParent parent = a.getParent();
            if (parent != null) {
                if (!this.s || this.p.a() || this.r) {
                    parent.requestDisallowInterceptTouchEvent(true);
                } else if (this.t == 2 || ((this.t == 0 && f >= 1.0f) || (this.t == 1 && f <= -1.0f))) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    public void a(float f, float f2, float f3) {
        if (getScale() < this.n || f < 1.0f) {
            if (this.C != null) {
                this.C.a(f, f2, f3);
            }
            this.u.postScale(f, f, f2, f3);
            d();
        }
    }

    public void a(float f, float f2, float f3, float f4) {
        DraweeView a = a();
        if (a != null) {
            this.x = new b(this, a.getContext());
            this.x.a(h(), i(), (int) f3, (int) f4);
            a.post(this.x);
        }
    }

    public void a(float f, float f2, float f3, boolean z) {
        DraweeView a = a();
        if (a != null && f >= this.l && f <= this.n) {
            if (z) {
                a.post(new a(this, getScale(), f, f2, f3));
                return;
            }
            this.u.setScale(f, f, f2, f3);
            d();
        }
    }

    public void a(float f, boolean z) {
        DraweeView a = a();
        if (a != null) {
            a(f, (float) (a.getRight() / 2), (float) (a.getBottom() / 2), false);
        }
    }

    public void a(int i, int i2) {
        this.w = i;
        this.v = i2;
        j();
    }

    public Matrix b() {
        return this.u;
    }

    public RectF c() {
        e();
        return a(b());
    }

    public void d() {
        DraweeView a = a();
        if (a != null && e()) {
            a.invalidate();
        }
    }

    public boolean e() {
        float f = 0.0f;
        RectF a = a(b());
        if (a == null) {
            return false;
        }
        float height = a.height();
        float width = a.width();
        int i = i();
        height = height <= ((float) i) ? ((((float) i) - height) / 2.0f) - a.top : a.top > 0.0f ? -a.top : a.bottom < ((float) i) ? ((float) i) - a.bottom : 0.0f;
        i = h();
        if (width <= ((float) i)) {
            f = ((((float) i) - width) / 2.0f) - a.left;
            this.t = 2;
        } else if (a.left > 0.0f) {
            f = -a.left;
            this.t = 0;
        } else if (a.right < ((float) i)) {
            f = ((float) i) - a.right;
            this.t = 1;
        } else {
            this.t = -1;
        }
        this.u.postTranslate(f, height);
        return true;
    }

    public void f() {
        l();
    }

    protected void g() {
        m();
    }

    public float getMaximumScale() {
        return this.n;
    }

    public float getMediumScale() {
        return this.m;
    }

    public float getMinimumScale() {
        return this.l;
    }

    public d getOnPhotoTapListener() {
        return this.z;
    }

    public g getOnViewTapListener() {
        return this.A;
    }

    public float getScale() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) a(this.u, 0), 2.0d)) + ((float) Math.pow((double) a(this.u, 3), 2.0d))));
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        ViewParent parent;
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            case 0:
                parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                m();
                break;
            case 1:
            case 3:
                parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
        }
        boolean a = this.p.a();
        boolean b = this.p.b();
        boolean a2 = this.p.a(motionEvent);
        boolean z2 = (a || this.p.a()) ? false : true;
        a = (b || this.p.b()) ? false : true;
        if (z2 && a) {
            z = true;
        }
        this.r = z;
        return this.q.onTouchEvent(motionEvent) ? true : a2;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.s = z;
    }

    public void setMaximumScale(float f) {
        b(this.l, this.m, f);
        this.n = f;
    }

    public void setMediumScale(float f) {
        b(this.l, f, this.n);
        this.m = f;
    }

    public void setMinimumScale(float f) {
        b(f, this.m, this.n);
        this.l = f;
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.q.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.q.setOnDoubleTapListener(new b(this));
        }
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.B = onLongClickListener;
    }

    public void setOnPhotoTapListener(d dVar) {
        this.z = dVar;
    }

    public void setOnScaleChangeListener(e eVar) {
        this.C = eVar;
    }

    public void setOnViewTapListener(g gVar) {
        this.A = gVar;
    }

    public void setScale(float f) {
        a(f, false);
    }

    public void setZoomTransitionDuration(long j) {
        if (j < 0) {
            j = 200;
        }
        this.o = j;
    }
}
