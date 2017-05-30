package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.R;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.fq;

public final class a extends ViewGroup {
    private final int[] a = new int[2];
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final e d;
    private final c e;
    private b f;
    private View g;
    @Nullable
    private View h;
    @Nullable
    private Animator i;
    private final d j;
    private final GestureDetectorCompat k;
    @Nullable
    private GestureDetectorCompat l;
    private a m;
    private boolean n;

    public interface a {
        void a();

        void b();
    }

    public a(Context context) {
        super(context);
        setId(R.id.cast_featurehighlight_view);
        setWillNotDraw(false);
        this.e = new c(context);
        this.e.setCallback(this);
        this.d = new e(context);
        this.d.setCallback(this);
        this.j = new d(this);
        this.k = new GestureDetectorCompat(context, new SimpleOnGestureListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!(this.a.a(x, y) && this.a.d.a(x, y))) {
                    this.a.m.b();
                }
                return true;
            }
        });
        this.k.setIsLongpressEnabled(false);
        setVisibility(8);
    }

    private void a(Animator animator) {
        if (this.i != null) {
            this.i.cancel();
        }
        this.i = animator;
        this.i.start();
    }

    private void a(int[] iArr, View view) {
        getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
    }

    private boolean a(float f, float f2) {
        return this.c.contains(Math.round(f), Math.round(f2));
    }

    private Animator d(@Nullable final Runnable runnable) {
        ObjectAnimator.ofFloat(this.f.asView(), "alpha", new float[]{0.0f}).setDuration(200).setInterpolator(fl.b());
        Animator d = this.d.d();
        Animator c = this.e.c();
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r0, d, c});
        animatorSet.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ a b;

            public void onAnimationEnd(Animator animator) {
                this.b.setVisibility(8);
                this.b.i = null;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        return animatorSet;
    }

    private Animator e(@Nullable final Runnable runnable) {
        ObjectAnimator.ofFloat(this.f.asView(), "alpha", new float[]{0.0f}).setDuration(200).setInterpolator(fl.b());
        Animator c = this.d.c(this.b.exactCenterX() - this.d.b(), this.b.exactCenterY() - this.d.c());
        Animator d = this.e.d();
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r0, c, d});
        animatorSet.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ a b;

            public void onAnimationEnd(Animator animator) {
                this.b.setVisibility(8);
                this.b.i = null;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        return animatorSet;
    }

    private Animator f() {
        ObjectAnimator.ofFloat(this.f.asView(), "alpha", new float[]{0.0f, 1.0f}).setDuration(350).setInterpolator(fl.a());
        Animator b = this.d.b(this.b.exactCenterX() - this.d.b(), this.b.exactCenterY() - this.d.c());
        Animator a = this.e.a();
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r0, b, a});
        animatorSet.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.i = this.a.g();
                this.a.i.start();
            }
        });
        return animatorSet;
    }

    private Animator g() {
        return this.e.b();
    }

    public void a() {
        if (this.g == null) {
            throw new IllegalStateException("Target view must be set before animation");
        }
        setVisibility(0);
        a(f());
    }

    public void a(@ColorInt int i) {
        this.d.a(i);
    }

    public void a(final View view, @Nullable View view2, final boolean z, final a aVar) {
        this.g = (View) fq.a(view);
        this.h = view2;
        this.m = (a) fq.a(aVar);
        this.l = new GestureDetectorCompat(getContext(), new SimpleOnGestureListener(this) {
            final /* synthetic */ a d;

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (view.getParent() != null) {
                    view.performClick();
                }
                if (z) {
                    aVar.a();
                }
                return true;
            }
        });
        this.l.setIsLongpressEnabled(false);
        setVisibility(4);
    }

    public void a(b bVar) {
        this.f = (b) fq.a(bVar);
        addView(bVar.asView(), 0);
    }

    public void a(@Nullable final Runnable runnable) {
        addOnLayoutChangeListener(new OnLayoutChangeListener(this) {
            final /* synthetic */ a b;

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (runnable != null) {
                    runnable.run();
                }
                this.b.a();
                this.b.removeOnLayoutChangeListener(this);
            }
        });
    }

    @Nullable
    Drawable b() {
        return null;
    }

    public void b(@Nullable Runnable runnable) {
        a(e(runnable));
    }

    View c() {
        return this.f.asView();
    }

    public void c(@Nullable Runnable runnable) {
        a(d(runnable));
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams;
    }

    e d() {
        return this.d;
    }

    c e() {
        return this.e;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new MarginLayoutParams(layoutParams);
    }

    protected void onDraw(Canvas canvas) {
        canvas.save();
        if (this.h != null) {
            canvas.clipRect(this.c);
        }
        this.d.draw(canvas);
        this.e.draw(canvas);
        if (this.g != null) {
            if (this.g.getParent() != null) {
                Bitmap createBitmap = Bitmap.createBitmap(this.g.getWidth(), this.g.getHeight(), Config.ARGB_8888);
                this.g.draw(new Canvas(createBitmap));
                int a = this.d.a();
                int red = Color.red(a);
                int green = Color.green(a);
                int blue = Color.blue(a);
                for (a = 0; a < createBitmap.getHeight(); a++) {
                    for (int i = 0; i < createBitmap.getWidth(); i++) {
                        int pixel = createBitmap.getPixel(i, a);
                        if (Color.alpha(pixel) != 0) {
                            createBitmap.setPixel(i, a, Color.argb(Color.alpha(pixel), red, green, blue));
                        }
                    }
                }
                canvas.drawBitmap(createBitmap, (float) this.b.left, (float) this.b.top, null);
            }
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Neither target view nor drawable was set");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.g == null) {
            throw new IllegalStateException("Target view must be set before layout");
        }
        if (this.g.getParent() != null) {
            a(this.a, this.g);
        }
        this.b.set(this.a[0], this.a[1], this.a[0] + this.g.getWidth(), this.a[1] + this.g.getHeight());
        if (this.h != null) {
            a(this.a, this.h);
            this.c.set(this.a[0], this.a[1], this.a[0] + this.h.getMeasuredWidth(), this.a[1] + this.h.getMeasuredHeight());
        } else {
            this.c.set(i, i2, i3, i4);
        }
        this.d.setBounds(this.c);
        this.e.setBounds(this.c);
        this.j.a(this.b, this.c);
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(MeasureSpec.getSize(i), i), resolveSize(MeasureSpec.getSize(i2), i2));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.n = this.b.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.n) {
            if (this.l != null) {
                this.l.onTouchEvent(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            if (this.g.getParent() != null) {
                this.g.onTouchEvent(motionEvent);
            }
        } else {
            this.k.onTouchEvent(motionEvent);
        }
        return true;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.d || drawable == this.e || drawable == null;
    }
}
