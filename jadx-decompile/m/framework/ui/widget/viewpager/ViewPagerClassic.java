package m.framework.ui.widget.viewpager;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import m.framework.b.f;

public class ViewPagerClassic extends ViewGroup {
    private static final int a = 500;
    private static final int g = 0;
    private static final int h = 1;
    private int b;
    private Scroller c;
    private VelocityTracker d;
    private float e;
    private float f;
    private int i;
    private int j;
    private int k;
    private a l;

    public ViewPagerClassic(Context context) {
        this(context, null);
    }

    public ViewPagerClassic(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerClassic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        a(context);
    }

    private void a(int i, boolean z) {
        int i2 = i != this.b ? 1 : 0;
        View focusedChild = getFocusedChild();
        if (!(focusedChild == null || i2 == 0 || focusedChild != getChildAt(this.b))) {
            focusedChild.clearFocus();
        }
        int width = (getWidth() * i) - getScrollX();
        this.c.startScroll(getScrollX(), 0, width, 0, z ? 0 : Math.abs(width) / 2);
        invalidate();
    }

    private void a(Context context) {
        this.c = new Scroller(getContext(), new Interpolator(this) {
            float[] a = new float[]{0.0f, 0.0157073f, 0.0314108f, 0.0471065f, 0.0627905f, 0.0784591f, 0.0941083f, 0.109734f, 0.125333f, 0.140901f, 0.156434f, 0.171929f, 0.187381f, 0.202787f, 0.218143f, 0.233445f, 0.24869f, 0.263873f, 0.278991f, 0.29404f, 0.309017f, 0.323917f, 0.338738f, 0.353475f, 0.368125f, 0.382683f, 0.397148f, 0.411514f, 0.425779f, 0.439939f, 0.45399f, 0.46793f, 0.481754f, 0.495459f, 0.509041f, 0.522499f, 0.535827f, 0.549023f, 0.562083f, 0.575005f, 0.587785f, 0.60042f, 0.612907f, 0.625243f, 0.637424f, 0.649448f, 0.661312f, 0.673013f, 0.684547f, 0.695913f, 0.707107f, 0.718126f, 0.728969f, 0.739631f, 0.750111f, 0.760406f, 0.770513f, 0.78043f, 0.790155f, 0.799685f, 0.809017f, 0.81815f, 0.827081f, 0.835807f, 0.844328f, 0.85264f, 0.860742f, 0.868632f, 0.876307f, 0.883766f, 0.891007f, 0.898028f, 0.904827f, 0.911403f, 0.917755f, 0.92388f, 0.929776f, 0.935444f, 0.940881f, 0.946085f, 0.951057f, 0.955793f, 0.960294f, 0.964557f, 0.968583f, 0.97237f, 0.975917f, 0.979223f, 0.982287f, 0.985109f, 0.987688f, 0.990024f, 0.992115f, 0.993961f, 0.995562f, 0.996917f, 0.998027f, 0.99889f, 0.999507f, 0.999877f, 1.0f};
            final /* synthetic */ ViewPagerClassic b;

            {
                this.b = r2;
            }

            public float getInterpolation(float f) {
                return this.a[(int) (100.0f * f)];
            }
        });
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.j = viewConfiguration.getScaledTouchSlop();
        this.k = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void a(MotionEvent motionEvent) {
        int i = 0;
        float x = motionEvent.getX();
        int abs = (int) Math.abs(motionEvent.getY() - this.f);
        int i2 = ((int) Math.abs(x - this.e)) > this.j ? 1 : 0;
        if (abs > this.j) {
            i = 1;
        }
        if ((i2 != 0 || r2 != 0) && i2 != 0) {
            this.i = 1;
            this.e = x;
        }
    }

    private void b(MotionEvent motionEvent) {
        if (this.l != null) {
            float x = motionEvent.getX();
            int i = (int) (this.e - x);
            this.e = x;
            if (i < 0) {
                if (getScrollX() > 0) {
                    scrollBy(Math.max(-getScrollX(), i), 0);
                }
            } else if (i > 0 && getChildCount() != 0) {
                int right = (getChildAt(getChildCount() - 1).getRight() - getScrollX()) - getWidth();
                if (right > 0) {
                    scrollBy(Math.min(right, i), 0);
                }
            }
        }
    }

    public void a() {
        if (this.l != null && this.b > 0 && this.c.isFinished()) {
            a(this.b - 1);
        }
    }

    public void a(int i) {
        a(i, false);
    }

    public void b() {
        if (this.l != null && this.b < getChildCount() - 1 && this.c.isFinished()) {
            a(this.b + 1);
        }
    }

    public void computeScroll() {
        if (this.l != null) {
            if (this.c.computeScrollOffset()) {
                scrollTo(this.c.getCurrX(), this.c.getCurrY());
                postInvalidate();
                return;
            }
            int i = this.b;
            int currX = this.c.getCurrX();
            int width = getWidth();
            int i2 = currX / width;
            if (currX % width > width / 2) {
                i2++;
            }
            this.b = Math.max(0, Math.min(i2, getChildCount() - 1));
            if (i != this.b && this.l != null) {
                this.l.a(this.b, i);
            }
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        if (this.l != null && getChildCount() > 0) {
            long drawingTime = getDrawingTime();
            if (this.b > 0) {
                drawChild(canvas, getChildAt(this.b - 1), drawingTime);
            }
            drawChild(canvas, getChildAt(this.b), drawingTime);
            if (this.b < getChildCount() - 1) {
                drawChild(canvas, getChildAt(this.b + 1), drawingTime);
            }
        }
    }

    public boolean dispatchUnhandledMove(View view, int i) {
        if (this.l == null) {
            return super.dispatchUnhandledMove(view, i);
        }
        if (i == 17) {
            if (this.b > 0) {
                a(this.b - 1);
                return true;
            }
        } else if (i == 66 && this.b < getChildCount() - 1) {
            a(this.b + 1);
            return true;
        }
        return super.dispatchUnhandledMove(view, i);
    }

    public int getCurrentScreen() {
        return this.b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.i != 0) {
            return true;
        }
        if (this.d == null) {
            this.d = VelocityTracker.obtain();
        }
        this.d.addMovement(motionEvent);
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.e = x;
                this.f = y;
                this.i = this.c.isFinished() ? 0 : 1;
                break;
            case 1:
            case 3:
                if (this.d != null) {
                    this.d.recycle();
                    this.d = null;
                }
                this.i = 0;
                break;
            case 2:
                a(motionEvent);
                break;
        }
        return this.i != 0;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.l != null) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int childCount = getChildCount();
            int i7 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    childAt.layout(i7, 0, i7 + i5, i6);
                    i7 += i5;
                }
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.l == null) {
            super.onMeasure(i, i2);
            return;
        }
        int childCount = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(f.a(getContext()), 1073741824);
        int i3 = 0;
        int i4 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            childAt.measure(makeMeasureSpec, 0);
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight <= i4) {
                measuredHeight = i4;
            }
            i3++;
            i4 = measuredHeight;
        }
        i4 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
        super.onMeasure(makeMeasureSpec, i4);
        for (measuredHeight = 0; measuredHeight < childCount; measuredHeight++) {
            getChildAt(measuredHeight).measure(makeMeasureSpec, i4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.l == null) {
            return false;
        }
        if (this.d == null) {
            this.d = VelocityTracker.obtain();
        }
        this.d.addMovement(motionEvent);
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        switch (action) {
            case 0:
                if (this.i != 0) {
                    if (!this.c.isFinished()) {
                        this.c.abortAnimation();
                    }
                    this.e = x;
                    break;
                }
                break;
            case 1:
                if (this.i == 1) {
                    VelocityTracker velocityTracker = this.d;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.k);
                    action = (int) velocityTracker.getXVelocity();
                    if (action > 500 && this.b > 0) {
                        a(this.b - 1);
                    } else if (action >= -500 || this.b >= getChildCount() - 1) {
                        action = getWidth();
                        a((getScrollX() + (action / 2)) / action);
                    } else {
                        a(this.b + 1);
                    }
                    if (this.d != null) {
                        this.d.recycle();
                        this.d = null;
                    }
                }
                this.i = 0;
                break;
            case 2:
                if (this.i != 1) {
                    if (onInterceptTouchEvent(motionEvent) && this.i == 1) {
                        b(motionEvent);
                        break;
                    }
                }
                b(motionEvent);
                break;
            case 3:
                this.i = 0;
                break;
        }
        return true;
    }

    public void setAdapter(a aVar) {
        int i = 0;
        this.l = aVar;
        removeAllViews();
        this.b = 0;
        if (this.l != null) {
            int a = aVar.a();
            while (i < a) {
                addView(aVar.a(i, (ViewGroup) this));
                i++;
            }
        }
    }

    public void setCurrentScreen(int i) {
        if (this.l != null) {
            if (!this.c.isFinished()) {
                this.c.abortAnimation();
            }
            int i2 = this.b;
            this.b = Math.max(0, Math.min(i, getChildCount()));
            this.l.a(this.b, i2);
            i2 = f.a(getContext()) * this.b;
            this.c.startScroll(0, 0, i2, 0);
            scrollTo(i2, 0);
        }
    }
}
