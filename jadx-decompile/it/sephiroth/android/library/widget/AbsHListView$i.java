package it.sephiroth.android.library.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;

public class AbsHListView$i implements Runnable {
    private static final int b = 200;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    final /* synthetic */ AbsHListView a;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final int m;
    private int n;

    AbsHListView$i(AbsHListView absHListView) {
        this.a = absHListView;
        this.m = ViewConfiguration.get(absHListView.getContext()).getScaledFadingEdgeLength();
    }

    public void a() {
        this.a.removeCallbacks(this);
    }

    void a(final int i) {
        a();
        if (this.a.aK) {
            this.a.al = new Runnable(this) {
                final /* synthetic */ AbsHListView$i b;

                public void run() {
                    this.b.a(i);
                }
            };
            return;
        }
        int childCount = this.a.getChildCount();
        if (childCount != 0) {
            int i2 = this.a.aw;
            childCount = (childCount + i2) - 1;
            int max = Math.max(0, Math.min(this.a.getCount() - 1, i));
            if (max < i2) {
                childCount = (i2 - max) + 1;
                this.h = 2;
            } else if (max > childCount) {
                childCount = (max - childCount) + 1;
                this.h = 1;
            } else {
                b(max, -1, 200);
                return;
            }
            if (childCount > 0) {
                this.l = 200 / childCount;
            } else {
                this.l = 200;
            }
            this.i = max;
            this.j = -1;
            this.k = -1;
            this.a.s.a((Runnable) this);
        }
    }

    void a(final int i, final int i2) {
        a();
        if (i2 == -1) {
            a(i);
        } else if (this.a.aK) {
            this.a.al = new Runnable(this) {
                final /* synthetic */ AbsHListView$i c;

                public void run() {
                    this.c.a(i, i2);
                }
            };
        } else {
            int childCount = this.a.getChildCount();
            if (childCount != 0) {
                int i3 = this.a.aw;
                childCount = (childCount + i3) - 1;
                int max = Math.max(0, Math.min(this.a.getCount() - 1, i));
                if (max < i3) {
                    childCount -= i2;
                    if (childCount >= 1) {
                        i3 = (i3 - max) + 1;
                        childCount--;
                        if (childCount < i3) {
                            this.h = 4;
                        } else {
                            this.h = 2;
                            childCount = i3;
                        }
                    } else {
                        return;
                    }
                } else if (max > childCount) {
                    int i4 = i2 - i3;
                    if (i4 >= 1) {
                        i3 = (max - childCount) + 1;
                        childCount = i4 - 1;
                        if (childCount < i3) {
                            this.h = 3;
                        } else {
                            this.h = 1;
                            childCount = i3;
                        }
                    } else {
                        return;
                    }
                } else {
                    b(max, i2, 200);
                    return;
                }
                if (childCount > 0) {
                    this.l = 200 / childCount;
                } else {
                    this.l = 200;
                }
                this.i = max;
                this.j = i2;
                this.k = -1;
                this.a.s.a((Runnable) this);
            }
        }
    }

    void a(final int i, final int i2, final int i3) {
        a();
        if (this.a.aK) {
            this.a.al = new Runnable(this) {
                final /* synthetic */ AbsHListView$i d;

                public void run() {
                    this.d.a(i, i2, i3);
                }
            };
            return;
        }
        int childCount = this.a.getChildCount();
        if (childCount != 0) {
            int paddingLeft = this.a.getPaddingLeft() + i2;
            this.i = Math.max(0, Math.min(this.a.getCount() - 1, i));
            this.n = paddingLeft;
            this.j = -1;
            this.k = -1;
            this.h = 5;
            int i4 = this.a.aw;
            int i5 = (i4 + childCount) - 1;
            if (this.i < i4) {
                paddingLeft = i4 - this.i;
            } else if (this.i > i5) {
                paddingLeft = this.i - i5;
            } else {
                this.a.a(this.a.getChildAt(this.i - i4).getLeft() - paddingLeft, i3, false);
                return;
            }
            float f = ((float) paddingLeft) / ((float) childCount);
            if (f >= 1.0f) {
                i3 = (int) (((float) i3) / f);
            }
            this.l = i3;
            this.k = -1;
            this.a.s.a((Runnable) this);
        }
    }

    void b(int i, int i2) {
        a(i, i2, 200);
    }

    void b(int i, int i2, int i3) {
        int i4 = this.a.aw;
        int childCount = (this.a.getChildCount() + i4) - 1;
        int i5 = this.a.M.left;
        int width = this.a.getWidth() - this.a.M.right;
        if (i < i4 || i > childCount) {
            Log.w("AbsListView", "scrollToVisible called with targetPos " + i + " not visible [" + i4 + ", " + childCount + "]");
        }
        if (i2 < i4 || i2 > childCount) {
            i2 = -1;
        }
        View childAt = this.a.getChildAt(i - i4);
        int left = childAt.getLeft();
        childCount = childAt.getRight();
        childCount = childCount > width ? childCount - width : 0;
        if (left < i5) {
            childCount = left - i5;
        }
        if (childCount != 0) {
            if (i2 >= 0) {
                View childAt2 = this.a.getChildAt(i2 - i4);
                left = childAt2.getLeft();
                i4 = childAt2.getRight();
                int abs = Math.abs(childCount);
                if (childCount < 0 && i4 + abs > width) {
                    childCount = Math.max(0, i4 - width);
                } else if (childCount > 0 && left - abs < i5) {
                    childCount = Math.min(0, left - i5);
                }
            }
            this.a.f(childCount, i3);
        }
    }

    public void run() {
        int i = 0;
        int width = this.a.getWidth();
        int i2 = this.a.aw;
        View childAt;
        int width2;
        int max;
        switch (this.h) {
            case 1:
                i = this.a.getChildCount() - 1;
                i2 += i;
                if (i < 0) {
                    return;
                }
                if (i2 == this.k) {
                    this.a.s.a((Runnable) this);
                    return;
                }
                childAt = this.a.getChildAt(i);
                this.a.a((i2 < this.a.aP + -1 ? Math.max(this.a.M.right, this.m) : this.a.M.right) + (childAt.getWidth() - (width - childAt.getLeft())), this.l, true);
                this.k = i2;
                if (i2 < this.i) {
                    this.a.s.a((Runnable) this);
                    return;
                }
                return;
            case 2:
                if (i2 == this.k) {
                    this.a.s.a((Runnable) this);
                    return;
                }
                childAt = this.a.getChildAt(0);
                if (childAt != null) {
                    this.a.a(childAt.getLeft() - (i2 > 0 ? Math.max(this.m, this.a.M.left) : this.a.M.left), this.l, true);
                    this.k = i2;
                    if (i2 > this.i) {
                        this.a.s.a((Runnable) this);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                width = this.a.getChildCount();
                if (i2 != this.j && width > 1 && width + i2 < this.a.aP) {
                    width = i2 + 1;
                    if (width == this.k) {
                        this.a.s.a((Runnable) this);
                        return;
                    }
                    View childAt2 = this.a.getChildAt(1);
                    width2 = childAt2.getWidth();
                    i2 = childAt2.getLeft();
                    max = Math.max(this.a.M.right, this.m);
                    if (width < this.j) {
                        this.a.a(Math.max(0, (i2 + width2) - max), this.l, true);
                        this.k = width;
                        this.a.s.a((Runnable) this);
                        return;
                    } else if (i2 > max) {
                        this.a.a(i2 - max, this.l, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                i = this.a.getChildCount() - 2;
                if (i >= 0) {
                    i2 += i;
                    if (i2 == this.k) {
                        this.a.s.a((Runnable) this);
                        return;
                    }
                    childAt = this.a.getChildAt(i);
                    width2 = childAt.getWidth();
                    i = childAt.getLeft();
                    max = width - i;
                    int max2 = Math.max(this.a.M.left, this.m);
                    this.k = i2;
                    if (i2 > this.j) {
                        this.a.a(-(max - max2), this.l, true);
                        this.a.s.a((Runnable) this);
                        return;
                    }
                    width -= max2;
                    i += width2;
                    if (width > i) {
                        this.a.a(-(width - i), this.l, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.k == i2) {
                    this.a.s.a((Runnable) this);
                    return;
                }
                this.k = i2;
                width = this.a.getChildCount();
                width2 = this.i;
                max = (i2 + width) - 1;
                if (width2 < i2) {
                    i = (i2 - width2) + 1;
                } else if (width2 > max) {
                    i = width2 - max;
                }
                float min = Math.min(Math.abs(((float) i) / ((float) width)), 1.0f);
                if (width2 < i2) {
                    this.a.a((int) (((float) (-this.a.getWidth())) * min), (int) (min * ((float) this.l)), true);
                    this.a.s.a((Runnable) this);
                    return;
                } else if (width2 > max) {
                    this.a.a((int) (((float) this.a.getWidth()) * min), (int) (min * ((float) this.l)), true);
                    this.a.s.a((Runnable) this);
                    return;
                } else {
                    i = this.a.getChildAt(width2 - i2).getLeft() - this.n;
                    this.a.a(i, (int) (((float) this.l) * (((float) Math.abs(i)) / ((float) this.a.getWidth()))), true);
                    return;
                }
            default:
                return;
        }
    }
}
