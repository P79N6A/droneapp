package m.framework.ui.widget.pulltorefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;

public class PullToRefreshView extends RelativeLayout {
    private static final long a = 1000;
    private d b;
    private View c;
    private View d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private long k;

    public PullToRefreshView(Context context) {
        super(context);
        d();
    }

    public PullToRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public PullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }

    private MotionEvent a(MotionEvent motionEvent) {
        return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
    }

    private void d() {
        this.j = new Runnable(this) {
            final /* synthetic */ PullToRefreshView a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.g();
                this.a.f();
            }
        };
    }

    private void e() {
        this.k = System.currentTimeMillis();
        this.h = true;
        if (this.b != null) {
            this.b.g();
        }
    }

    private void f() {
        this.h = false;
    }

    private void g() {
        this.f = 0;
        scrollTo(0, 0);
        if (this.b != null) {
            this.b.h();
        }
    }

    private boolean h() {
        return !this.i && this.b.f();
    }

    public void a() {
        long currentTimeMillis = System.currentTimeMillis() - this.k;
        if (currentTimeMillis < 1000) {
            postDelayed(this.j, 1000 - currentTimeMillis);
        } else {
            post(this.j);
        }
    }

    public void a(boolean z) {
        this.f = this.e;
        scrollTo(0, -this.f);
        if (z) {
            e();
        }
    }

    public void b() {
        this.i = true;
    }

    public void c() {
        this.i = false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.g = motionEvent.getY();
                break;
            case 1:
            case 3:
                if (!this.h) {
                    if (this.f <= this.e) {
                        if (this.f != 0) {
                            g();
                            if (this.b != null) {
                                this.b.a(0);
                                break;
                            }
                        }
                    }
                    this.f = this.e;
                    scrollTo(0, -this.f);
                    if (this.b != null) {
                        this.b.a(100);
                    }
                    e();
                    motionEvent = a(motionEvent);
                    break;
                }
                this.f = this.e;
                scrollTo(0, -this.f);
                break;
                break;
            case 2:
                float y = motionEvent.getY();
                if (this.h || h()) {
                    this.f = (int) (((float) this.f) + ((y - this.g) / 2.0f));
                    if (this.f > 0) {
                        scrollTo(0, -this.f);
                        if (!(this.h || this.b == null)) {
                            this.b.a((this.f * 100) / this.e);
                        }
                        motionEvent = a(motionEvent);
                    } else {
                        this.f = 0;
                        scrollTo(0, 0);
                    }
                }
                this.g = y;
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setAdapter(d dVar) {
        this.b = dVar;
        removeAllViews();
        this.d = (View) dVar.e();
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(11, -1);
        layoutParams.addRule(10, -1);
        addView(this.d, layoutParams);
        this.c = dVar.d();
        this.c.measure(0, 0);
        this.e = this.c.getMeasuredHeight();
        layoutParams = new RelativeLayout.LayoutParams(-2, this.e);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(11, -1);
        layoutParams.addRule(10, -1);
        layoutParams.topMargin = -this.e;
        addView(this.c, layoutParams);
    }
}
