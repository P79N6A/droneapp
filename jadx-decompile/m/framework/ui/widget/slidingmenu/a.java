package m.framework.ui.widget.slidingmenu;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;

public class a extends HorizontalScrollView {
    private static final int a = 500;
    private static final int b = 230;
    private float c = 2.14748365E9f;
    private SlidingMenu d;
    private int e;
    private VelocityTracker f;

    public a(SlidingMenu slidingMenu) {
        super(slidingMenu.getContext());
        this.d = slidingMenu;
        this.e = ViewConfiguration.get(slidingMenu.getContext()).getScaledMaximumFlingVelocity();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.c = motionEvent.getX();
                if (this.d.e() && this.c > ((float) this.d.getMenuWidth()) && motionEvent.getY() > ((float) this.d.getMenuConfig().i)) {
                    super.onInterceptTouchEvent(motionEvent);
                    return true;
                }
            case 1:
            case 3:
                this.c = 2.14748365E9f;
                break;
            case 2:
                if (!this.d.e() && this.c > ((float) this.d.getShowMenuWidth())) {
                    super.onInterceptTouchEvent(motionEvent);
                    return false;
                }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.d.getMenuCover().setBackgroundColor(Color.argb((i * 230) / this.d.getMenuWidth(), 0, 0, 0));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f == null) {
            this.f = VelocityTracker.obtain();
        }
        this.f.addMovement(motionEvent);
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (this.d.e() && this.c < ((float) this.d.getMenuWidth())) {
                    return false;
                }
                this.c = 2.14748365E9f;
                this.f.computeCurrentVelocity(1000, (float) this.e);
                float xVelocity = this.f.getXVelocity();
                this.f.recycle();
                this.f = null;
                int scrollX = getScrollX();
                if (xVelocity - 500.0f > 0.0f) {
                    this.d.c();
                } else if (xVelocity + 500.0f < 0.0f) {
                    this.d.d();
                } else if (scrollX > this.d.getMenuWidth() / 2) {
                    this.d.d();
                } else {
                    this.d.c();
                }
                return true;
            default:
                return (!this.d.e() || this.c >= ((float) this.d.getMenuWidth())) ? super.onTouchEvent(motionEvent) : false;
        }
    }
}
