package com.fimi.soul.view.myhorizontalseebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.fimi.overseas.soul.R;
import java.util.ArrayList;

public class ProgressBar extends View {
    private static final int a = 10000;
    private static final int b = 200;
    private boolean A;
    private Interpolator B;
    private c C;
    private long D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private final ArrayList<b> I;
    private a J;
    int c;
    int d;
    int e;
    int f;
    Bitmap g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private Transformation u;
    private AlphaAnimation v;
    private boolean w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public SavedState a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i) {
                return new SavedState[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }
        };
        int a;
        int b;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }
    }

    private class a implements Runnable {
        final /* synthetic */ ProgressBar a;

        private a(ProgressBar progressBar) {
            this.a = progressBar;
        }

        public void run() {
            this.a.sendAccessibilityEvent(4);
        }
    }

    private static class b implements c<b> {
        private static final int f = 24;
        private static final b<b> g = e.a(e.a(new d<b>() {
            public /* synthetic */ c a() {
                return b();
            }

            public void a(b bVar) {
            }

            public b b() {
                return new b();
            }

            public void b(b bVar) {
            }
        }, 24));
        public int a;
        public int b;
        public boolean c;
        private b d;
        private boolean e;

        private b() {
        }

        public static b a(int i, int i2, boolean z) {
            b bVar = (b) g.a();
            bVar.a = i;
            bVar.b = i2;
            bVar.c = z;
            return bVar;
        }

        public /* synthetic */ Object a() {
            return d();
        }

        public void a(b bVar) {
            this.d = bVar;
        }

        public void a(boolean z) {
            this.e = z;
        }

        public boolean b() {
            return this.e;
        }

        public void c() {
            g.a(this);
        }

        public b d() {
            return this.d;
        }
    }

    private class c implements Runnable {
        final /* synthetic */ ProgressBar a;

        private c(ProgressBar progressBar) {
            this.a = progressBar;
        }

        public void run() {
            synchronized (this.a) {
                int size = this.a.I.size();
                for (int i = 0; i < size; i++) {
                    b bVar = (b) this.a.I.get(i);
                    this.a.a(bVar.a, bVar.b, bVar.c, true);
                    bVar.c();
                }
                this.a.I.clear();
                this.a.H = false;
            }
        }
    }

    public ProgressBar(Context context) {
        this(context, null);
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842871);
    }

    public ProgressBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z = false;
        super(context, attributeSet, i);
        this.I = new ArrayList();
        this.D = Thread.currentThread().getId();
        a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ProgressBar, i, i2);
        this.A = true;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        if (drawable != null) {
            setProgressDrawable(a(drawable, false));
        }
        this.r = obtainStyledAttributes.getInt(7, this.r);
        this.c = obtainStyledAttributes.getDimensionPixelSize(4, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, this.d);
        this.e = obtainStyledAttributes.getDimensionPixelSize(5, this.e);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, this.f);
        this.q = obtainStyledAttributes.getInt(8, this.q);
        setMax(obtainStyledAttributes.getInt(2, this.p));
        setProgress(obtainStyledAttributes.getInt(3, this.n));
        setSecondaryProgress(obtainStyledAttributes.getInt(9, this.o));
        drawable = obtainStyledAttributes.getDrawable(10);
        if (drawable != null) {
            setIndeterminateDrawable(a(drawable));
        }
        this.t = obtainStyledAttributes.getBoolean(11, this.t);
        this.A = false;
        if (this.t || obtainStyledAttributes.getBoolean(12, this.s)) {
            z = true;
        }
        setIndeterminate(z);
        obtainStyledAttributes.recycle();
    }

    private Drawable a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        Drawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    private Drawable a(Drawable drawable, boolean z) {
        int i = 0;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                int id = layerDrawable.getId(i2);
                Drawable drawable2 = layerDrawable.getDrawable(i2);
                boolean z2 = id == 16908301 || id == 16908303;
                drawableArr[i2] = a(drawable2, z2);
            }
            Drawable layerDrawable2 = new LayerDrawable(drawableArr);
            while (i < numberOfLayers) {
                layerDrawable2.setId(i, layerDrawable.getId(i));
                i++;
            }
            return layerDrawable2;
        } else if (drawable instanceof StateListDrawable) {
            StateListDrawable stateListDrawable = (StateListDrawable) drawable;
            return new StateListDrawable();
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (this.g == null) {
                this.g = bitmap;
            }
            Drawable shapeDrawable = new ShapeDrawable(getDrawableShape());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
    }

    private void a() {
        this.p = 100;
        this.n = 0;
        this.o = 0;
        this.s = false;
        this.t = false;
        this.r = 4000;
        this.q = 1;
        this.c = 24;
        this.d = 48;
        this.e = 24;
        this.f = 48;
    }

    private void a(int i, int i2) {
        int i3;
        int i4 = i - (this.k + this.j);
        int i5 = i2 - (this.l + this.m);
        if (this.x != null) {
            int i6;
            if (this.t && !(this.x instanceof AnimationDrawable)) {
                float intrinsicWidth = ((float) this.x.getIntrinsicWidth()) / ((float) this.x.getIntrinsicHeight());
                float f = ((float) i4) / ((float) i5);
                if (intrinsicWidth != f) {
                    if (f > intrinsicWidth) {
                        i3 = (int) (intrinsicWidth * ((float) i5));
                        i6 = (i4 - i3) / 2;
                        i3 = i6 + i3;
                        i4 = i5;
                        i5 = 0;
                    } else {
                        i3 = (int) ((1.0f / intrinsicWidth) * ((float) i4));
                        i6 = (i5 - i3) / 2;
                        i5 = i6 + i3;
                        i3 = i4;
                        i4 = i5;
                        i5 = i6;
                        i6 = 0;
                    }
                    this.x.setBounds(i6, i5, i3, i4);
                }
            }
            i6 = 0;
            i3 = i4;
            i4 = i5;
            i5 = 0;
            this.x.setBounds(i6, i5, i3, i4);
        } else {
            i3 = i4;
            i4 = i5;
        }
        if (this.y != null) {
            this.y.setBounds(0, 0, i3, i4);
        }
    }

    private synchronized void a(int i, int i2, boolean z) {
        if (this.D == Thread.currentThread().getId()) {
            a(i, i2, z, true);
        } else {
            if (this.C == null) {
                this.C = new c();
            }
            this.I.add(b.a(i, i2, z));
            if (this.G && !this.H) {
                post(this.C);
                this.H = true;
            }
        }
    }

    private synchronized void a(int i, int i2, boolean z, boolean z2) {
        float f = this.p > 0 ? ((float) i2) / ((float) this.p) : 0.0f;
        Drawable drawable = this.z;
        if (drawable != null) {
            Drawable drawable2 = null;
            if (drawable instanceof LayerDrawable) {
                drawable2 = ((LayerDrawable) drawable).findDrawableByLayerId(i);
            }
            int i3 = (int) (10000.0f * f);
            if (drawable2 != null) {
                drawable = drawable2;
            }
            drawable.setLevel(i3);
        } else {
            invalidate();
        }
        if (z2 && i == 16908301) {
            a(f, z);
        }
    }

    private void b() {
        int[] drawableState = getDrawableState();
        if (this.y != null && this.y.isStateful()) {
            this.y.setState(drawableState);
        }
        if (this.x != null && this.x.isStateful()) {
            this.x.setState(drawableState);
        }
    }

    private void c() {
        if (this.J == null) {
            this.J = new a();
        } else {
            removeCallbacks(this.J);
        }
        postDelayed(this.J, 200);
    }

    void a(float f, boolean z) {
    }

    public void a(int i) {
        Drawable drawable = this.z;
    }

    synchronized void a(int i, boolean z) {
        if (!this.s) {
            int i2 = i < 0 ? 0 : i;
            if (i2 > this.p) {
                i2 = this.p;
            }
            if (i2 != this.n) {
                this.n = i2;
                a(16908301, this.n, z);
            }
        }
    }

    public void a(Context context, int i) {
        setInterpolator(AnimationUtils.loadInterpolator(context, i));
    }

    public final synchronized void b(int i) {
        setProgress(this.n + i);
    }

    public final synchronized void c(int i) {
        setSecondaryProgress(this.o + i);
    }

    @ExportedProperty(category = "progress")
    public synchronized boolean d() {
        return this.s;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        b();
    }

    void e() {
        if (getVisibility() == 0) {
            if (this.x instanceof Animatable) {
                this.E = true;
                this.w = false;
            } else {
                this.w = true;
                if (this.B == null) {
                    this.B = new LinearInterpolator();
                }
                if (this.u == null) {
                    this.u = new Transformation();
                } else {
                    this.u.clear();
                }
                if (this.v == null) {
                    this.v = new AlphaAnimation(0.0f, 1.0f);
                } else {
                    this.v.reset();
                }
                this.v.setRepeatMode(this.q);
                this.v.setRepeatCount(-1);
                this.v.setDuration((long) this.r);
                this.v.setInterpolator(this.B);
                this.v.setStartTime(-1);
            }
            postInvalidate();
        }
    }

    void f() {
        this.w = false;
        if (this.x instanceof Animatable) {
            ((Animatable) this.x).stop();
            this.E = false;
        }
        postInvalidate();
    }

    Drawable getCurrentDrawable() {
        return this.z;
    }

    Shape getDrawableShape() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Drawable getIndeterminateDrawable() {
        return this.x;
    }

    public Interpolator getInterpolator() {
        return this.B;
    }

    @ExportedProperty(category = "progress")
    public synchronized int getMax() {
        return this.p;
    }

    @ExportedProperty(category = "progress")
    public synchronized int getProgress() {
        return this.s ? 0 : this.n;
    }

    public Drawable getProgressDrawable() {
        return this.y;
    }

    @ExportedProperty(category = "progress")
    public synchronized int getSecondaryProgress() {
        return this.s ? 0 : this.o;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (!this.F) {
            if (verifyDrawable(drawable)) {
                Rect bounds = drawable.getBounds();
                int i = this.h + this.j;
                int i2 = this.i + this.l;
                invalidate(bounds.left + i, bounds.top + i2, i + bounds.right, bounds.bottom + i2);
                return;
            }
            super.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.y != null) {
            this.y.jumpToCurrentState();
        }
        if (this.x != null) {
            this.x.jumpToCurrentState();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            e();
        }
        if (this.I != null) {
            synchronized (this) {
                int size = this.I.size();
                for (int i = 0; i < size; i++) {
                    b bVar = (b) this.I.get(i);
                    a(bVar.a, bVar.b, bVar.c, true);
                    bVar.c();
                }
                this.I.clear();
            }
        }
        this.G = true;
    }

    protected void onDetachedFromWindow() {
        if (this.s) {
            f();
        }
        if (this.C != null) {
            removeCallbacks(this.C);
        }
        if (this.C != null && this.H) {
            removeCallbacks(this.C);
        }
        if (this.J != null) {
            removeCallbacks(this.J);
        }
        super.onDetachedFromWindow();
        this.G = false;
    }

    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.z;
        if (drawable != null) {
            canvas.save();
            canvas.translate((float) this.j, (float) this.l);
            long drawingTime = getDrawingTime();
            if (this.w) {
                this.v.getTransformation(drawingTime, this.u);
                float alpha = this.u.getAlpha();
                try {
                    this.F = true;
                    drawable.setLevel((int) (alpha * 10000.0f));
                    this.F = false;
                    postInvalidateOnAnimation();
                } catch (Throwable th) {
                    this.F = false;
                }
            }
            drawable.draw(canvas);
            canvas.restore();
            if (this.E && (drawable instanceof Animatable)) {
                ((Animatable) drawable).start();
                this.E = false;
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ProgressBar.class.getName());
        accessibilityEvent.setItemCount(this.p);
        accessibilityEvent.setCurrentItemIndex(this.n);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ProgressBar.class.getName());
    }

    protected synchronized void onMeasure(int i, int i2) {
        int i3 = 0;
        synchronized (this) {
            int max;
            Drawable drawable = this.z;
            if (drawable != null) {
                max = Math.max(this.c, Math.min(this.d, drawable.getIntrinsicWidth()));
                i3 = Math.max(this.e, Math.min(this.f, drawable.getIntrinsicHeight()));
            } else {
                max = 0;
            }
            b();
            setMeasuredDimension(resolveSizeAndState(max + (this.j + this.k), i, 0), resolveSizeAndState(i3 + (this.l + this.m), i2, 0));
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(savedState.a);
        setSecondaryProgress(savedState.b);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.n;
        savedState.b = this.o;
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        a(i, i2);
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (!this.s) {
            return;
        }
        if (i == 8 || i == 4) {
            f();
        } else {
            e();
        }
    }

    public void postInvalidate() {
        if (!this.A) {
            super.postInvalidate();
        }
    }

    public synchronized void setIndeterminate(boolean z) {
        if (!((this.t && this.s) || z == this.s)) {
            this.s = z;
            if (z) {
                this.z = this.x;
                e();
            } else {
                this.z = this.y;
                f();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (this.s) {
            this.z = drawable;
            postInvalidate();
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        this.B = interpolator;
    }

    public synchronized void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.p) {
            this.p = i;
            postInvalidate();
            if (this.n > i) {
                this.n = i;
            }
            a(16908301, this.n, false);
        }
    }

    public synchronized void setProgress(int i) {
        a(i, false);
    }

    public void setProgressDrawable(Drawable drawable) {
        boolean z;
        if (this.y == null || drawable == this.y) {
            z = false;
        } else {
            this.y.setCallback(null);
            z = true;
        }
        if (drawable != null) {
            drawable.setCallback(this);
            int minimumHeight = drawable.getMinimumHeight();
            if (this.f < minimumHeight) {
                this.f = minimumHeight;
                requestLayout();
            }
        }
        this.y = drawable;
        if (!this.s) {
            this.z = drawable;
            postInvalidate();
        }
        if (z) {
            a(getWidth(), getHeight());
            b();
            a(16908301, this.n, false, false);
            a(16908303, this.o, false, false);
        }
    }

    public synchronized void setSecondaryProgress(int i) {
        int i2 = 0;
        synchronized (this) {
            if (!this.s) {
                if (i >= 0) {
                    i2 = i;
                }
                if (i2 > this.p) {
                    i2 = this.p;
                }
                if (i2 != this.o) {
                    this.o = i2;
                    a(16908303, this.o, false);
                }
            }
        }
    }

    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            if (!this.s) {
                return;
            }
            if (i == 8 || i == 4) {
                f();
            } else {
                e();
            }
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.y || drawable == this.x || super.verifyDrawable(drawable);
    }
}
