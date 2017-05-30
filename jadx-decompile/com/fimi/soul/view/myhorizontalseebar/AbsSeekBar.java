package com.fimi.soul.view.myhorizontalseebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fimi.overseas.soul.R;
import com.tencent.open.yyb.TitleBar;

public abstract class AbsSeekBar extends ProgressBar {
    private static final int q = 255;
    float a;
    boolean b = true;
    private Drawable n;
    private int o;
    private int p = 1;
    private float r;
    private int s;
    private float t;
    private boolean u;

    public AbsSeekBar(Context context) {
        super(context);
    }

    public AbsSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SeekBar, i, 0);
        setThumb(obtainStyledAttributes.getDrawable(0));
        setThumbOffset(obtainStyledAttributes.getDimensionPixelOffset(1, getThumbOffset()));
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Theme, 0, 0);
        this.r = obtainStyledAttributes.getFloat(0, 0.5f);
        obtainStyledAttributes.recycle();
        this.s = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private void a(int i, int i2) {
        Drawable currentDrawable = getCurrentDrawable();
        Drawable drawable = this.n;
        int intrinsicHeight = drawable == null ? 0 : drawable.getIntrinsicHeight();
        int min = Math.min(this.f, (i2 - this.l) - this.m);
        int max = getMax();
        float progress = max > 0 ? ((float) getProgress()) / ((float) max) : 0.0f;
        if (intrinsicHeight > min) {
            if (drawable != null) {
                a(i, drawable, progress, 0);
            }
            intrinsicHeight = (intrinsicHeight - min) / 2;
            if (currentDrawable != null) {
                currentDrawable.setBounds(0, intrinsicHeight, (i - this.k) - this.j, ((i2 - this.m) - intrinsicHeight) - this.l);
                return;
            }
            return;
        }
        if (currentDrawable != null) {
            currentDrawable.setBounds(0, 0, (i - this.k) - this.j, (i2 - this.m) - this.l);
        }
        intrinsicHeight = (min - intrinsicHeight) / 2;
        if (drawable != null) {
            a(i, drawable, progress, intrinsicHeight);
        }
    }

    private void a(int i, Drawable drawable, float f, int i2) {
        int i3 = (i - this.j) - this.k;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i4 = (int) (((float) ((i3 - intrinsicWidth) + (this.o * 2))) * f);
        if (i2 == Integer.MIN_VALUE) {
            Rect bounds = drawable.getBounds();
            i2 = bounds.top;
            i3 = bounds.bottom;
        } else {
            i3 = i2 + intrinsicHeight;
        }
        drawable.setBounds(i4, i2, intrinsicWidth + i4, i3);
    }

    private void a(MotionEvent motionEvent) {
        float f;
        float f2 = 0.0f;
        int width = getWidth();
        int i = (width - this.j) - this.k;
        int x = (int) motionEvent.getX();
        if (x < this.j) {
            f = 0.0f;
        } else if (x > width - this.k) {
            f = 1.0f;
        } else {
            f = ((float) (x - this.j)) / ((float) i);
            f2 = this.a;
        }
        a((int) (f2 + (f * ((float) getMax()))), true);
    }

    private void g() {
    }

    void a() {
        this.u = true;
    }

    void a(float f, boolean z) {
        super.a(f, z);
        Drawable drawable = this.n;
        if (drawable != null) {
            a(getWidth(), drawable, f, Integer.MIN_VALUE);
            invalidate();
        }
    }

    public void a(int i) {
        super.a(i);
    }

    void b() {
        this.u = false;
    }

    void c() {
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setAlpha(isEnabled() ? 255 : (int) (255.0f * this.r));
        }
        if (this.n != null && this.n.isStateful()) {
            this.n.setState(getDrawableState());
        }
    }

    public int getKeyProgressIncrement() {
        return this.p;
    }

    public Drawable getThumb() {
        return this.n;
    }

    public int getThumbOffset() {
        return this.o;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.n != null) {
            this.n.jumpToCurrentState();
        }
    }

    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.n != null) {
            canvas.save();
            canvas.translate((float) (this.j - this.o), (float) this.l);
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbsSeekBar.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbsSeekBar.class.getName());
        if (isEnabled()) {
            int progress = getProgress();
            if (progress > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (progress < getMax()) {
                accessibilityNodeInfo.addAction(4096);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            int progress = getProgress();
            switch (i) {
                case 21:
                    if (progress > 0) {
                        a(progress - this.p, true);
                        c();
                        return true;
                    }
                    break;
                case 22:
                    if (progress < getMax()) {
                        a(progress + this.p, true);
                        c();
                        return true;
                    }
                    break;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    protected synchronized void onMeasure(int i, int i2) {
        int i3 = 0;
        synchronized (this) {
            int max;
            Drawable currentDrawable = getCurrentDrawable();
            int intrinsicHeight = this.n == null ? 0 : this.n.getIntrinsicHeight();
            if (currentDrawable != null) {
                max = Math.max(this.c, Math.min(this.d, currentDrawable.getIntrinsicWidth()));
                i3 = Math.max(intrinsicHeight, Math.max(this.e, Math.min(this.f, currentDrawable.getIntrinsicHeight())));
            } else {
                max = 0;
            }
            setMeasuredDimension(resolveSizeAndState(max + (this.j + this.k), i, 0), resolveSizeAndState(i3 + (this.l + this.m), i2, 0));
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int max = getMax();
        float progress = max > 0 ? ((float) getProgress()) / ((float) max) : 0.0f;
        Drawable drawable = this.n;
        if (drawable != null) {
            a(getWidth(), drawable, progress, Integer.MIN_VALUE);
            invalidate();
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b || !isEnabled()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                setPressed(true);
                if (this.n != null) {
                    invalidate(this.n.getBounds());
                }
                a();
                a(motionEvent);
                g();
                return true;
            case 1:
                if (this.u) {
                    a(motionEvent);
                    b();
                    setPressed(false);
                } else {
                    a();
                    a(motionEvent);
                    b();
                }
                invalidate();
                return true;
            case 2:
                if (this.u) {
                    a(motionEvent);
                    return true;
                } else if (Math.abs(motionEvent.getX() - this.t) <= ((float) this.s)) {
                    return true;
                } else {
                    setPressed(true);
                    if (this.n != null) {
                        invalidate(this.n.getBounds());
                    }
                    a();
                    a(motionEvent);
                    g();
                    return true;
                }
            case 3:
                if (this.u) {
                    b();
                    setPressed(false);
                }
                invalidate();
                return true;
            default:
                return true;
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        int progress = getProgress();
        int max = Math.max(1, Math.round(((float) getMax()) / 5.0f));
        switch (i) {
            case 4096:
                if (progress >= getMax()) {
                    return false;
                }
                a(progress + max, true);
                c();
                return true;
            case 8192:
                if (progress <= 0) {
                    return false;
                }
                a(progress - max, true);
                c();
                return true;
            default:
                return false;
        }
    }

    public void setKeyProgressIncrement(int i) {
        if (i < 0) {
            i = -i;
        }
        this.p = i;
    }

    public synchronized void setMax(int i) {
        super.setMax(i);
        if (this.p == 0 || getMax() / this.p > 20) {
            setKeyProgressIncrement(Math.max(1, Math.round(((float) getMax()) / TitleBar.BACKBTN_LEFT_MARGIN)));
        }
    }

    public void setThumb(Drawable drawable) {
        Object obj;
        if (this.n == null || drawable == this.n) {
            obj = null;
        } else {
            this.n.setCallback(null);
            obj = 1;
        }
        if (drawable != null) {
            drawable.setCallback(this);
            this.o = drawable.getIntrinsicWidth() / 2;
            if (!(obj == null || (drawable.getIntrinsicWidth() == this.n.getIntrinsicWidth() && drawable.getIntrinsicHeight() == this.n.getIntrinsicHeight()))) {
                requestLayout();
            }
        }
        this.n = drawable;
        invalidate();
        if (obj != null) {
            a(getWidth(), getHeight());
            if (drawable != null && drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    public void setThumbOffset(int i) {
        this.o = i;
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }
}
