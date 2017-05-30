package it.sephiroth.android.library.widget;

import android.view.VelocityTracker;
import android.view.View;

class AbsHListView$e implements Runnable {
    private static final int e = 40;
    final /* synthetic */ AbsHListView a;
    private final d b;
    private int c;
    private final Runnable d = new Runnable(this) {
        final /* synthetic */ AbsHListView$e a;

        {
            this.a = r1;
        }

        public void run() {
            int d = AbsHListView.d(this.a.a);
            VelocityTracker e = AbsHListView.e(this.a.a);
            d a = this.a.b;
            if (e != null && d != -1) {
                e.computeCurrentVelocity(1000, (float) AbsHListView.f(this.a.a));
                float f = -e.getXVelocity(d);
                if (Math.abs(f) < ((float) AbsHListView.g(this.a.a)) || !a.a(f, 0.0f)) {
                    this.a.b();
                    this.a.a.aa = 3;
                    this.a.a.b(1);
                    return;
                }
                this.a.a.postDelayed(this, 40);
            }
        }
    };

    AbsHListView$e(AbsHListView absHListView) {
        this.a = absHListView;
        this.b = new d(absHListView.getContext());
    }

    void a() {
        if (this.b.a(this.a.getScrollX(), 0, 0, 0, 0, 0)) {
            this.a.aa = 6;
            this.a.invalidate();
            this.a.s.a((Runnable) this);
            return;
        }
        this.a.aa = -1;
        this.a.b(0);
    }

    void a(int i) {
        int i2 = i < 0 ? Integer.MAX_VALUE : 0;
        this.c = i2;
        this.b.a(null);
        this.b.a(i2, 0, i, 0, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.a.aa = 4;
        this.a.s.a((Runnable) this);
    }

    void a(int i, int i2, boolean z) {
        int i3 = i < 0 ? Integer.MAX_VALUE : 0;
        this.c = i3;
        this.b.a(z ? AbsHListView.aq : null);
        this.b.a(i3, 0, i, 0, i2);
        this.a.aa = 4;
        this.a.s.a((Runnable) this);
    }

    void b() {
        this.a.aa = -1;
        this.a.removeCallbacks(this);
        this.a.removeCallbacks(this.d);
        this.a.b(0);
        AbsHListView.k(this.a);
        this.b.l();
        AbsHListView.a(this.a, 0, 0, 0, 0, 0, 0, 0, 0, false);
    }

    void b(int i) {
        this.b.a(null);
        this.b.a(this.a.getScrollX(), 0, i, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, this.a.getWidth(), 0);
        this.a.aa = 6;
        this.a.invalidate();
        this.a.s.a((Runnable) this);
    }

    void c() {
        this.a.postDelayed(this.d, 40);
    }

    void c(int i) {
        this.b.a(this.a.getScrollX(), 0, this.a.ao);
        int overScrollMode = this.a.getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && !AbsHListView.h(this.a))) {
            this.a.aa = 6;
            overScrollMode = (int) this.b.d();
            if (i > 0) {
                AbsHListView.i(this.a).a(overScrollMode);
            } else {
                AbsHListView.j(this.a).a(overScrollMode);
            }
        } else {
            this.a.aa = -1;
            if (this.a.ad != null) {
                this.a.ad.a();
            }
        }
        this.a.invalidate();
        this.a.s.a((Runnable) this);
    }

    public void run() {
        int scrollX;
        int i;
        int i2 = 1;
        int i3 = 0;
        switch (this.a.aa) {
            case 3:
                if (this.b.a()) {
                    return;
                }
                break;
            case 4:
                break;
            case 6:
                d dVar = this.b;
                if (dVar.j()) {
                    scrollX = this.a.getScrollX();
                    int b = dVar.b();
                    if (AbsHListView.c(this.a, b - scrollX, 0, scrollX, 0, 0, 0, this.a.ao, 0, false)) {
                        i = (scrollX > 0 || b <= 0) ? 0 : 1;
                        if (scrollX >= 0 && b < 0) {
                            i3 = 1;
                        }
                        if (i == 0 && i3 == 0) {
                            a();
                            return;
                        }
                        i = (int) dVar.d();
                        if (i3 != 0) {
                            i = -i;
                        }
                        dVar.l();
                        a(i);
                        return;
                    }
                    this.a.invalidate();
                    this.a.s.a((Runnable) this);
                    return;
                }
                b();
                return;
            default:
                b();
                return;
        }
        if (this.a.aK) {
            this.a.h();
        }
        if (this.a.aP == 0 || this.a.getChildCount() == 0) {
            b();
            return;
        }
        int min;
        d dVar2 = this.b;
        boolean j = dVar2.j();
        int b2 = dVar2.b();
        i = this.c - b2;
        if (i > 0) {
            this.a.S = this.a.aw;
            this.a.T = this.a.getChildAt(0).getLeft();
            min = Math.min(((this.a.getWidth() - this.a.getPaddingRight()) - this.a.getPaddingLeft()) - 1, i);
        } else {
            scrollX = this.a.getChildCount() - 1;
            this.a.S = this.a.aw + scrollX;
            this.a.T = this.a.getChildAt(scrollX).getLeft();
            min = Math.max(-(((this.a.getWidth() - this.a.getPaddingRight()) - this.a.getPaddingLeft()) - 1), i);
        }
        View childAt = this.a.getChildAt(this.a.S - this.a.aw);
        i = childAt != null ? childAt.getLeft() : 0;
        boolean g = this.a.g(min, min);
        if (!g || min == 0) {
            i2 = 0;
        }
        if (i2 != 0) {
            if (childAt != null) {
                AbsHListView.b(this.a, -(min - (childAt.getLeft() - i)), 0, this.a.getScrollX(), 0, 0, 0, this.a.ao, 0, false);
            }
            if (j) {
                c(min);
            }
        } else if (j && i2 == 0) {
            if (g) {
                this.a.invalidate();
            }
            this.c = b2;
            this.a.s.a((Runnable) this);
        } else {
            b();
        }
    }
}
