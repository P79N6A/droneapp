package it.sephiroth.android.library.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnTouchModeChangeListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Checkable;
import android.widget.ListAdapter;
import it.sephiroth.android.library.R;
import it.sephiroth.android.library.a.b;
import it.sephiroth.android.library.a.b.a;
import java.util.ArrayList;
import java.util.List;

@TargetApi(11)
public abstract class AbsHListView extends AdapterView<ListAdapter> implements OnGlobalLayoutListener, OnTouchModeChangeListener {
    public static final int a = 0;
    private static final String aX = "AbsListView";
    protected static final int ak = 3;
    static final Interpolator aq = new LinearInterpolator();
    public static final int[] ar = new int[]{0};
    public static final int b = 1;
    private static final int be = 20;
    private static final int bf = -1;
    private static final int bg = 0;
    private static final int bh = 1;
    private static final int by = -1;
    public static final int c = 2;
    public static final int d = -1;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 6;
    protected a A;
    protected ListAdapter B;
    boolean C;
    boolean D;
    Drawable E;
    int F;
    protected Rect G;
    protected final j H;
    int I;
    int J;
    int K;
    int L;
    protected Rect M;
    protected int N;
    View O;
    View P;
    protected boolean Q;
    protected boolean R;
    protected int S;
    int T;
    int U;
    int V;
    int W;
    private VelocityTracker aY;
    private e aZ;
    protected int aa;
    int ab;
    int ac;
    protected i ad;
    protected int ae;
    protected boolean af;
    boolean ag;
    boolean ah;
    protected int ai;
    protected int aj;
    protected Runnable al;
    protected final boolean[] am;
    int an;
    int ao;
    protected boolean ap;
    private a bA;
    private int bB;
    private int bC;
    private int bD;
    private boolean bE;
    private int bF;
    private int bG;
    private f bH;
    private int bI;
    private int bJ;
    private int bK;
    private SavedState bL;
    private float bM;
    private g ba;
    private boolean bb;
    private Rect bc;
    private ContextMenuInfo bd;
    private int bi;
    private c bj;
    private Runnable bk;
    private b bl;
    private h bm;
    private Runnable bn;
    private int bo;
    private int bp;
    private boolean bq;
    private int br;
    private int bs;
    private Runnable bt;
    private int bu;
    private int bv;
    private float bw;
    private int bx;
    private a bz;
    a s;
    protected int t;
    public Object u;
    Object v;
    int w;
    protected SparseArrayCompat<Boolean> x;
    LongSparseArray<Integer> y;
    protected int z;

    public AbsHListView(Context context) {
        super(context);
        this.t = 0;
        this.z = 0;
        this.D = false;
        this.F = -1;
        this.G = new Rect();
        this.H = new j(this);
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = new Rect();
        this.N = 0;
        this.aa = -1;
        this.ae = 0;
        this.bb = true;
        this.ai = -1;
        this.bd = null;
        this.bi = -1;
        this.br = 0;
        this.bw = 1.0f;
        this.am = new boolean[1];
        this.bx = -1;
        this.bD = 0;
        B();
    }

    public AbsHListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hlv_absHListViewStyle);
    }

    public AbsHListView(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int color;
        boolean z4 = true;
        int i3 = 0;
        super(context, attributeSet, i);
        this.t = 0;
        this.z = 0;
        this.D = false;
        this.F = -1;
        this.G = new Rect();
        this.H = new j(this);
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = new Rect();
        this.N = 0;
        this.aa = -1;
        this.ae = 0;
        this.bb = true;
        this.ai = -1;
        this.bd = null;
        this.bi = -1;
        this.br = 0;
        this.bw = 1.0f;
        this.am = new boolean[1];
        this.bx = -1;
        this.bD = 0;
        B();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AbsHListView, i, 0);
        if (obtainStyledAttributes != null) {
            drawable = obtainStyledAttributes.getDrawable(0);
            z = obtainStyledAttributes.getBoolean(1, false);
            z2 = obtainStyledAttributes.getBoolean(6, false);
            z3 = obtainStyledAttributes.getBoolean(2, true);
            i2 = obtainStyledAttributes.getInt(7, 0);
            color = obtainStyledAttributes.getColor(3, 0);
            z4 = obtainStyledAttributes.getBoolean(5, true);
            i3 = obtainStyledAttributes.getInt(4, 0);
            obtainStyledAttributes.recycle();
        } else {
            i2 = 0;
            z3 = true;
            z2 = false;
            z = false;
            drawable = null;
            color = 0;
        }
        if (drawable != null) {
            setSelector(drawable);
        }
        this.D = z;
        setStackFromRight(z2);
        setScrollingCacheEnabled(z3);
        setTranscriptMode(i2);
        setCacheColorHint(color);
        setSmoothScrollbarEnabled(z4);
        setChoiceMode(i3);
    }

    private void B() {
        setClickable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setAlwaysDrawnWithCacheEnabled(false);
        setScrollingCacheEnabled(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.bs = viewConfiguration.getScaledTouchSlop();
        this.bu = viewConfiguration.getScaledMinimumFlingVelocity();
        this.bv = viewConfiguration.getScaledMaximumFlingVelocity();
        this.an = viewConfiguration.getScaledOverscrollDistance();
        this.ao = viewConfiguration.getScaledOverflingDistance();
        this.s = b.a(this);
    }

    private void C() {
        int i = this.aw;
        int childCount = getChildCount();
        boolean z = VERSION.SDK_INT >= 11;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int i3 = i + i2;
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(((Boolean) this.x.get(i3, Boolean.valueOf(false))).booleanValue());
            } else if (z) {
                childAt.setActivated(((Boolean) this.x.get(i3, Boolean.valueOf(false))).booleanValue());
            }
        }
    }

    private boolean D() {
        int childCount = getChildCount();
        return childCount == 0 ? true : childCount != this.aP ? false : getChildAt(0).getLeft() >= this.M.left && getChildAt(childCount - 1).getRight() <= getWidth() - this.M.right;
    }

    private void E() {
        setSelector(getResources().getDrawable(17301602));
    }

    private void F() {
        if (this.aY == null) {
            this.aY = VelocityTracker.obtain();
        } else {
            this.aY.clear();
        }
    }

    private void G() {
        if (this.aY == null) {
            this.aY = VelocityTracker.obtain();
        }
    }

    private void H() {
        if (this.aY != null) {
            this.aY.recycle();
            this.aY = null;
        }
    }

    private void I() {
        if (this.ag && !this.Q && !this.s.a()) {
            setChildrenDrawnWithCacheEnabled(true);
            setChildrenDrawingCacheEnabled(true);
            this.R = true;
            this.Q = true;
        }
    }

    private void J() {
        if (!this.s.a()) {
            if (this.bt == null) {
                this.bt = new 2(this);
            }
            post(this.bt);
        }
    }

    private void K() {
        if (this.bz != null) {
            this.bz.b();
            this.bA.b();
        }
    }

    public static int a(Rect rect, Rect rect2, int i) {
        int width;
        int height;
        int width2;
        int height2;
        switch (i) {
            case 1:
            case 2:
                width = rect.right + (rect.width() / 2);
                height = rect.top + (rect.height() / 2);
                width2 = (rect2.width() / 2) + rect2.left;
                height2 = rect2.top + (rect2.height() / 2);
                break;
            case 17:
                width = rect.left;
                height = rect.top + (rect.height() / 2);
                width2 = rect2.right;
                height2 = rect2.top + (rect2.height() / 2);
                break;
            case 33:
                width = rect.left + (rect.width() / 2);
                height = rect.top;
                width2 = (rect2.width() / 2) + rect2.left;
                height2 = rect2.bottom;
                break;
            case 66:
                width = rect.right;
                height = rect.top + (rect.height() / 2);
                width2 = rect2.left;
                height2 = rect2.top + (rect2.height() / 2);
                break;
            case 130:
                width = rect.left + (rect.width() / 2);
                height = rect.bottom;
                width2 = (rect2.width() / 2) + rect2.left;
                height2 = rect2.top;
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        width2 -= width;
        height2 -= height;
        return (height2 * height2) + (width2 * width2);
    }

    static View a(ArrayList<View> arrayList, int i) {
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
            if (((LayoutParams) view.getLayoutParams()).d == i) {
                arrayList.remove(i2);
                return view;
            }
        }
        return (View) arrayList.remove(size - 1);
    }

    private void a(int i, int i2, int i3, int i4) {
        this.G.set(i - this.I, i2 - this.J, this.K + i3, this.L + i4);
    }

    private void a(Canvas canvas) {
        if (!this.G.isEmpty()) {
            Drawable drawable = this.E;
            drawable.setBounds(this.G);
            drawable.draw(canvas);
        }
    }

    private void b(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (motionEvent.getPointerId(action) == this.bx) {
            action = action == 0 ? 1 : 0;
            this.V = (int) motionEvent.getX(action);
            this.W = (int) motionEvent.getY(action);
            this.ac = 0;
            this.bx = motionEvent.getPointerId(action);
        }
    }

    private boolean j(int i) {
        int i2 = i - this.V;
        int abs = Math.abs(i2);
        boolean z = getScrollX() != 0;
        if (!z && abs <= this.bs) {
            return false;
        }
        I();
        if (z) {
            this.aa = 5;
            this.ac = 0;
        } else {
            this.aa = 3;
            this.ac = i2 > 0 ? this.bs : -this.bs;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.bj);
        }
        setPressed(false);
        View childAt = getChildAt(this.S - this.aw);
        if (childAt != null) {
            childAt.setPressed(false);
        }
        b(1);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        k(i);
        return true;
    }

    private void k(int i) {
        int i2 = 0;
        int i3 = i - this.V;
        int i4 = i3 - this.ac;
        int i5 = this.ab != Integer.MIN_VALUE ? i - this.ab : i4;
        int childCount;
        int left;
        if (this.aa == 3) {
            if (i != this.ab) {
                if (Math.abs(i3) > this.bs) {
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
                childCount = this.S >= 0 ? this.S - this.aw : getChildCount() / 2;
                View childAt = getChildAt(childCount);
                left = childAt != null ? childAt.getLeft() : 0;
                boolean g = i5 != 0 ? g(i4, i5) : false;
                View childAt2 = getChildAt(childCount);
                if (childAt2 != null) {
                    childCount = childAt2.getLeft();
                    if (g) {
                        i4 = (-i5) - (childCount - left);
                        overScrollBy(i4, 0, getScrollX(), 0, 0, 0, this.an, 0, true);
                        if (Math.abs(this.an) == Math.abs(getScrollX()) && this.aY != null) {
                            this.aY.clear();
                        }
                        i5 = getOverScrollMode();
                        if (i5 == 0 || (i5 == 1 && !D())) {
                            this.bD = 0;
                            this.aa = 5;
                            if (i3 > 0) {
                                this.bz.a(((float) i4) / ((float) getWidth()));
                                if (!this.bA.a()) {
                                    this.bA.c();
                                }
                                invalidate(this.bz.a(false));
                            } else if (i3 < 0) {
                                this.bA.a(((float) i4) / ((float) getWidth()));
                                if (!this.bz.a()) {
                                    this.bz.c();
                                }
                                invalidate(this.bA.a(true));
                            }
                        }
                    }
                    this.V = i;
                }
                this.ab = i;
            }
        } else if (this.aa == 5 && i != this.ab) {
            int i6;
            childCount = getScrollX();
            left = childCount - i5;
            int i7 = i > this.ab ? 1 : -1;
            if (this.bD == 0) {
                this.bD = i7;
            }
            i4 = -i5;
            if ((left >= 0 || childCount < 0) && (left <= 0 || childCount > 0)) {
                i6 = 0;
            } else {
                i4 = -childCount;
                i6 = i5 + i4;
            }
            if (i4 != 0) {
                overScrollBy(i4, 0, getScrollX(), 0, 0, 0, this.an, 0, true);
                i5 = getOverScrollMode();
                if (i5 == 0 || (i5 == 1 && !D())) {
                    if (i3 > 0) {
                        this.bz.a(((float) i4) / ((float) getWidth()));
                        if (!this.bA.a()) {
                            this.bA.c();
                        }
                        invalidate(this.bz.a(false));
                    } else if (i3 < 0) {
                        this.bA.a(((float) i4) / ((float) getWidth()));
                        if (!this.bz.a()) {
                            this.bz.c();
                        }
                        invalidate(this.bA.a(true));
                    }
                }
            }
            if (i6 != 0) {
                if (getScrollX() != 0) {
                    this.s.a(0);
                    n();
                }
                g(i6, i6);
                this.aa = 3;
                i5 = g(i);
                this.ac = 0;
                View childAt3 = getChildAt(i5 - this.aw);
                if (childAt3 != null) {
                    i2 = childAt3.getLeft();
                }
                this.T = i2;
                this.V = i;
                this.S = i5;
            }
            this.ab = i;
            this.bD = i7;
        }
    }

    public int a(int i, int i2) {
        Rect rect = this.bc;
        if (rect == null) {
            this.bc = new Rect();
            rect = this.bc;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(rect);
                if (rect.contains(i, i2)) {
                    return this.aw + childCount;
                }
            }
        }
        return -1;
    }

    @SuppressLint({"NewApi"})
    protected View a(int i, boolean[] zArr) {
        zArr[0] = false;
        View d = this.H.d(i);
        if (d == null) {
            d = this.H.e(i);
            View view;
            if (d != null) {
                view = this.B.getView(i, d, this);
                if (VERSION.SDK_INT >= 16 && view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                if (view != d) {
                    this.H.a(d, i);
                    if (this.bp != 0) {
                        view.setDrawingCacheBackgroundColor(this.bp);
                        d = view;
                    }
                    d = view;
                } else {
                    zArr[0] = true;
                    view.onFinishTemporaryDetach();
                    d = view;
                }
            } else {
                view = this.B.getView(i, null, this);
                if (VERSION.SDK_INT >= 16 && view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                if (this.bp != 0) {
                    view.setDrawingCacheBackgroundColor(this.bp);
                }
                d = view;
            }
            if (this.C) {
                LayoutParams layoutParams = d.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = (LayoutParams) generateDefaultLayoutParams();
                } else {
                    LayoutParams layoutParams2 = !checkLayoutParams(layoutParams) ? (LayoutParams) generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
                }
                layoutParams.e = this.B.getItemId(i);
                d.setLayoutParams(layoutParams);
            }
            if (this.aR.isEnabled() && this.bH == null) {
                this.bH = new f(this);
            }
        }
        return d;
    }

    public LayoutParams a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void a() {
        if (this.x != null) {
            this.x.clear();
        }
        if (this.y != null) {
            this.y.clear();
        }
        this.w = 0;
    }

    public void a(int i, int i2, int i3) {
        if (this.ad == null) {
            this.ad = new i(this);
        }
        this.ad.a(i, i2, i3);
    }

    public void a(int i, int i2, boolean z) {
        if (this.aZ == null) {
            this.aZ = new e(this);
        }
        int i3 = this.aw;
        int childCount = getChildCount();
        int i4 = i3 + childCount;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        if (i == 0 || this.aP == 0 || childCount == 0 || ((i3 == 0 && getChildAt(0).getLeft() == paddingLeft && i < 0) || (i4 == this.aP && getChildAt(childCount - 1).getRight() == width && i > 0))) {
            this.aZ.b();
            if (this.ad != null) {
                this.ad.a();
                return;
            }
            return;
        }
        b(2);
        this.aZ.a(i, i2, z);
    }

    protected void a(int i, View view) {
        if (i != -1) {
            this.F = i;
        }
        Rect rect = this.G;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (view instanceof l) {
            ((l) view).a(rect);
        }
        a(rect.left, rect.top, rect.right, rect.bottom);
        boolean z = this.bq;
        if (view.isEnabled() != z) {
            this.bq = !z;
            if (getSelectedItemPosition() != -1) {
                refreshDrawableState();
            }
        }
    }

    public void a(int i, boolean z) {
        if (this.t != 0) {
            if (VERSION.SDK_INT >= 11 && z && this.t == 3 && this.u == null) {
                if (this.v == null || !((it.sephiroth.android.library.a.a.b) this.v).a()) {
                    throw new IllegalStateException("AbsListView: attempted to start selection mode for CHOICE_MODE_MULTIPLE_MODAL but no choice mode callback was supplied. Call setMultiChoiceModeListener to set a callback.");
                }
                this.u = startActionMode((it.sephiroth.android.library.a.a.b) this.v);
            }
            boolean booleanValue;
            if (this.t == 2 || (VERSION.SDK_INT >= 11 && this.t == 3)) {
                booleanValue = ((Boolean) this.x.get(i, Boolean.valueOf(false))).booleanValue();
                this.x.put(i, Boolean.valueOf(z));
                if (this.y != null && this.B.hasStableIds()) {
                    if (z) {
                        this.y.put(this.B.getItemId(i), Integer.valueOf(i));
                    } else {
                        this.y.delete(this.B.getItemId(i));
                    }
                }
                if (booleanValue != z) {
                    if (z) {
                        this.w++;
                    } else {
                        this.w--;
                    }
                }
                if (this.u != null) {
                    ((it.sephiroth.android.library.a.a.b) this.v).a((ActionMode) this.u, i, this.B.getItemId(i), z);
                }
            } else {
                booleanValue = this.y != null && this.B.hasStableIds();
                if (z || a(i)) {
                    this.x.clear();
                    if (booleanValue) {
                        this.y.clear();
                    }
                }
                if (z) {
                    this.x.put(i, Boolean.valueOf(true));
                    if (booleanValue) {
                        this.y.put(this.B.getItemId(i), Integer.valueOf(i));
                    }
                    this.w = 1;
                } else if (this.x.size() == 0 || !((Boolean) this.x.valueAt(0)).booleanValue()) {
                    this.w = 0;
                }
            }
            if (!this.aG && !this.aW) {
                this.aK = true;
                A();
                requestLayout();
            }
        }
    }

    public void a(View view, View view2) {
        this.O = view;
        this.P = view2;
    }

    @SuppressLint({"NewApi"})
    public void a(List<View> list) {
        int childCount = getChildCount();
        k a = j.a(this.H);
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams != null && this.H.b(layoutParams.a)) {
                list.add(childAt);
                if (VERSION.SDK_INT >= 14) {
                    childAt.setAccessibilityDelegate(null);
                }
                if (a != null) {
                    a.a(childAt);
                }
            }
        }
        this.H.a(list);
        removeAllViewsInLayout();
    }

    protected abstract void a(boolean z);

    public boolean a(float f, float f2, int i) {
        int a = a((int) f, (int) f2);
        if (a != -1) {
            long itemId = this.B.getItemId(a);
            View childAt = getChildAt(a - this.aw);
            if (childAt != null) {
                this.bd = b(childAt, a, itemId);
                return super.showContextMenuForChild(this);
            }
        }
        return a(f, f2, i);
    }

    public boolean a(int i) {
        return (this.t == 0 || this.x == null) ? false : ((Boolean) this.x.get(i, Boolean.valueOf(false))).booleanValue();
    }

    @TargetApi(14)
    protected boolean a(MotionEvent motionEvent) {
        return VERSION.SDK_INT >= 14 && (motionEvent.getButtonState() & 2) != 0 && a(motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
    }

    public boolean a(View view, int i, long j) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (this.t != 0) {
            if (this.t == 2 || (VERSION.SDK_INT >= 11 && this.t == 3 && this.u != null)) {
                boolean z4 = !((Boolean) this.x.get(i, Boolean.valueOf(false))).booleanValue();
                this.x.put(i, Boolean.valueOf(z4));
                if (this.y != null && this.B.hasStableIds()) {
                    if (z4) {
                        this.y.put(this.B.getItemId(i), Integer.valueOf(i));
                    } else {
                        this.y.delete(this.B.getItemId(i));
                    }
                }
                if (z4) {
                    this.w++;
                } else {
                    this.w--;
                }
                if (this.u != null) {
                    ((it.sephiroth.android.library.a.a.b) this.v).a((ActionMode) this.u, i, j, z4);
                } else {
                    z3 = true;
                }
                z = z3;
                z3 = true;
            } else if (this.t == 1) {
                if (!((Boolean) this.x.get(i, Boolean.valueOf(false))).booleanValue()) {
                    this.x.clear();
                    this.x.put(i, Boolean.valueOf(true));
                    if (this.y != null && this.B.hasStableIds()) {
                        this.y.clear();
                        this.y.put(this.B.getItemId(i), Integer.valueOf(i));
                    }
                    this.w = 1;
                } else if (this.x.size() == 0 || !((Boolean) this.x.valueAt(0)).booleanValue()) {
                    this.w = 0;
                }
                z3 = true;
                z = true;
            } else {
                z = true;
            }
            if (z3) {
                C();
            }
            boolean z5 = z;
            z = true;
            z2 = z5;
        } else {
            z = false;
        }
        return z2 ? z | super.a(view, i, j) : z;
    }

    public void addTouchables(ArrayList<View> arrayList) {
        int childCount = getChildCount();
        int i = this.aw;
        ListAdapter listAdapter = this.B;
        if (listAdapter != null) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (listAdapter.isEnabled(i + i2)) {
                    arrayList.add(childAt);
                }
                childAt.addTouchables(arrayList);
            }
        }
    }

    public long b(int i, int i2) {
        int a = a(i, i2);
        return a >= 0 ? this.B.getItemId(a) : Long.MIN_VALUE;
    }

    ContextMenuInfo b(View view, int i, long j) {
        return new AdapterView.a(view, i, j);
    }

    void b(int i) {
        if (i != this.br && this.ba != null) {
            this.br = i;
            this.ba.a(this, i);
        }
    }

    @ExportedProperty
    public boolean b() {
        return this.bb;
    }

    protected void c() {
        if (this.ba != null) {
            this.ba.a(this, this.aw, getChildCount(), this.aP);
        }
        onScrollChanged(0, 0, 0, 0);
    }

    public void c(int i) {
        if (this.ad == null) {
            this.ad = new i(this);
        }
        this.ad.a(i);
    }

    public void c(int i, int i2) {
        this.bF = i;
        this.bG = i2;
    }

    boolean c(View view, int i, long j) {
        if (VERSION.SDK_INT < 11 || this.t != 3) {
            boolean a = this.aJ != null ? this.aJ.a(this, view, i, j) : false;
            if (!a) {
                this.bd = b(view, i, j);
                a = super.showContextMenuForChild(this);
            }
            if (!a) {
                return a;
            }
            performHapticFeedback(0);
            return a;
        }
        if (this.u == null) {
            ActionMode startActionMode = startActionMode((it.sephiroth.android.library.a.a.b) this.v);
            this.u = startActionMode;
            if (startActionMode != null) {
                a(i, true);
                performHapticFeedback(0);
            }
        }
        return true;
    }

    public boolean checkInputConnectionProxy(View view) {
        return false;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    protected int computeHorizontalScrollExtent() {
        int childCount = getChildCount();
        if (childCount <= 0) {
            return 0;
        }
        if (!this.bb) {
            return 1;
        }
        int i = childCount * 100;
        View childAt = getChildAt(0);
        int left = childAt.getLeft();
        int width = childAt.getWidth();
        if (width > 0) {
            i += (left * 100) / width;
        }
        childAt = getChildAt(childCount - 1);
        childCount = childAt.getRight();
        width = childAt.getWidth();
        return width > 0 ? i - (((childCount - getWidth()) * 100) / width) : i;
    }

    protected int computeHorizontalScrollOffset() {
        int i = 0;
        int i2 = this.aw;
        int childCount = getChildCount();
        if (i2 < 0 || childCount <= 0) {
            return 0;
        }
        int width;
        if (this.bb) {
            View childAt = getChildAt(0);
            childCount = childAt.getLeft();
            width = childAt.getWidth();
            return width > 0 ? Math.max(((i2 * 100) - ((childCount * 100) / width)) + ((int) (((((float) getScrollX()) / ((float) getWidth())) * ((float) this.aP)) * 100.0f)), 0) : 0;
        } else {
            width = this.aP;
            if (i2 != 0) {
                i = i2 + childCount == width ? width : (childCount / 2) + i2;
            }
            return (int) (((((float) i) / ((float) width)) * ((float) childCount)) + ((float) i2));
        }
    }

    protected int computeHorizontalScrollRange() {
        if (!this.bb) {
            return this.aP;
        }
        int max = Math.max(this.aP * 100, 0);
        return getScrollX() != 0 ? max + Math.abs((int) (((((float) getScrollX()) / ((float) getWidth())) * ((float) this.aP)) * 100.0f)) : max;
    }

    protected void d(int i) {
        int firstVisiblePosition = i < 0 ? getFirstVisiblePosition() : i > 0 ? getLastVisiblePosition() : -1;
        if (firstVisiblePosition > -1) {
            View childAt = getChildAt(firstVisiblePosition - getFirstVisiblePosition());
            if (childAt != null) {
                Rect rect = new Rect();
                if (childAt.getGlobalVisibleRect(rect)) {
                    float height = ((float) (rect.height() * rect.width())) / ((float) (childAt.getHeight() * childAt.getWidth()));
                    if (i < 0 && height < 0.75f) {
                        firstVisiblePosition++;
                    } else if (i > 0 && height < 0.75f) {
                        firstVisiblePosition--;
                    }
                }
                c(Math.max(0, Math.min(getCount(), firstVisiblePosition + i)));
            }
        }
    }

    public void d(int i, int i2) {
        if (this.ad == null) {
            this.ad = new i(this);
        }
        this.ad.b(i, i2);
    }

    @ExportedProperty
    public boolean d() {
        return this.ag;
    }

    protected void dispatchDraw(Canvas canvas) {
        boolean z = this.D;
        if (!z) {
            a(canvas);
        }
        super.dispatchDraw(canvas);
        if (z) {
            a(canvas);
        }
    }

    protected void dispatchSetPressed(boolean z) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.bz != null) {
            int save;
            int i;
            int height;
            int scrollX = getScrollX();
            if (!this.bz.a()) {
                save = canvas.save();
                i = this.M.top + this.bF;
                height = (getHeight() - i) - (this.M.bottom + this.bG);
                int min = Math.min(0, this.bB + scrollX);
                canvas.rotate(-90.0f);
                canvas.translate((float) ((-getHeight()) + i), (float) min);
                this.bz.a(height, height);
                if (this.bz.a(canvas)) {
                    this.bz.b(min, i);
                    invalidate();
                }
                canvas.restoreToCount(save);
            }
            if (!this.bA.a()) {
                save = canvas.save();
                i = this.M.left + this.bF;
                height = (getHeight() - i) - (this.M.right + this.bG);
                scrollX = Math.max(getWidth(), scrollX + this.bC);
                canvas.rotate(90.0f);
                canvas.translate((float) (-i), (float) (-scrollX));
                this.bA.a(height, height);
                if (this.bA.a(canvas)) {
                    invalidate();
                }
                canvas.restoreToCount(save);
            }
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m();
    }

    public void e(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).offsetLeftAndRight(i);
        }
    }

    public void e(int i, int i2) {
        if (this.ad == null) {
            this.ad = new i(this);
        }
        this.ad.a(i, i2);
    }

    public boolean e() {
        return this.af;
    }

    protected abstract int f(int i);

    void f() {
        if (getChildCount() > 0) {
            g();
            requestLayout();
            invalidate();
        }
    }

    public void f(int i, int i2) {
        a(i, i2, false);
    }

    protected int g(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return -1;
        }
        int f = f(i);
        return f == -1 ? (this.aw + childCount) - 1 : f;
    }

    protected void g() {
        removeAllViewsInLayout();
        this.aw = 0;
        this.aK = false;
        this.al = null;
        this.aB = false;
        this.bL = null;
        this.aU = -1;
        this.aV = Long.MIN_VALUE;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        this.ae = 0;
        this.F = -1;
        this.G.setEmpty();
        invalidate();
    }

    boolean g(int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return true;
        }
        int left = getChildAt(0).getLeft();
        int right = getChildAt(childCount - 1).getRight();
        Rect rect = this.M;
        int i3 = 0 - left;
        int width = right - (getWidth() - 0);
        int width2 = (getWidth() - getPaddingRight()) - getPaddingLeft();
        int max = i < 0 ? Math.max(-(width2 - 1), i) : Math.min(width2 - 1, i);
        int max2 = i2 < 0 ? Math.max(-(width2 - 1), i2) : Math.min(width2 - 1, i2);
        int i4 = this.aw;
        if (i4 == 0) {
            this.bB = left - rect.left;
        } else {
            this.bB += max2;
        }
        if (i4 + childCount == this.aP) {
            this.bC = rect.right + right;
        } else {
            this.bC += max2;
        }
        Object obj = (i4 != 0 || left < rect.left || max2 < 0) ? null : 1;
        Object obj2 = (i4 + childCount != this.aP || right > getWidth() - rect.right || max2 > 0) ? null : 1;
        if (obj != null || obj2 != null) {
            return max2 != 0;
        } else {
            boolean z = max2 < 0;
            boolean isInTouchMode = isInTouchMode();
            if (isInTouchMode) {
                o();
            }
            int headerViewsCount = getHeaderViewsCount();
            int footerViewsCount = this.aP - getFooterViewsCount();
            int i5 = 0;
            int width3;
            if (!z) {
                width3 = getWidth() - max2;
                right = 0;
                for (width2 = childCount - 1; width2 >= 0; width2--) {
                    View childAt = getChildAt(width2);
                    if (childAt.getLeft() <= width3) {
                        break;
                    }
                    i5 = right + 1;
                    right = i4 + width2;
                    if (right >= headerViewsCount && right < footerViewsCount) {
                        this.H.a(childAt, right);
                    }
                    right = i5;
                    i5 = width2;
                }
            } else {
                int i6 = -max2;
                right = 0;
                width2 = 0;
                while (width2 < childCount) {
                    View childAt2 = getChildAt(width2);
                    if (childAt2.getRight() >= i6) {
                        break;
                    }
                    width3 = right + 1;
                    right = i4 + width2;
                    if (right >= headerViewsCount && right < footerViewsCount) {
                        this.H.a(childAt2, right);
                    }
                    width2++;
                    right = width3;
                }
            }
            this.U = this.T + max;
            this.aW = true;
            if (right > 0) {
                detachViewsFromParent(i5, right);
                this.H.d();
            }
            if (!awakenScrollBars()) {
                invalidate();
            }
            e(max2);
            if (z) {
                this.aw = right + this.aw;
            }
            max2 = Math.abs(max2);
            if (i3 < max2 || width < max2) {
                a(z);
            }
            if (!isInTouchMode && this.aN != -1) {
                max2 = this.aN - this.aw;
                if (max2 >= 0 && max2 < getChildCount()) {
                    a(this.aN, getChildAt(max2));
                }
            } else if (this.F != -1) {
                max2 = this.F - this.aw;
                if (max2 >= 0 && max2 < getChildCount()) {
                    a(-1, getChildAt(max2));
                }
            } else {
                this.G.setEmpty();
            }
            this.aW = false;
            c();
            return false;
        }
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -1, 0);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @ExportedProperty(category = "drawing")
    public int getCacheColorHint() {
        return this.bp;
    }

    public int getCheckedItemCount() {
        return this.w;
    }

    public long[] getCheckedItemIds() {
        int i = 0;
        if (this.t == 0 || this.y == null || this.B == null) {
            return new long[0];
        }
        LongSparseArray longSparseArray = this.y;
        int size = longSparseArray.size();
        long[] jArr = new long[size];
        while (i < size) {
            jArr[i] = longSparseArray.keyAt(i);
            i++;
        }
        return jArr;
    }

    public int getCheckedItemPosition() {
        return (this.t == 1 && this.x != null && this.x.size() == 1) ? this.x.keyAt(0) : -1;
    }

    public SparseArrayCompat<Boolean> getCheckedItemPositions() {
        return this.t != 0 ? this.x : null;
    }

    public int getChoiceMode() {
        return this.t;
    }

    protected ContextMenuInfo getContextMenuInfo() {
        return this.bd;
    }

    public void getFocusedRect(Rect rect) {
        View selectedView = getSelectedView();
        if (selectedView == null || selectedView.getParent() != this) {
            super.getFocusedRect(rect);
            return;
        }
        selectedView.getFocusedRect(rect);
        offsetDescendantRectToMyCoords(selectedView, rect);
    }

    protected int getFooterViewsCount() {
        return 0;
    }

    protected int getHeaderViewsCount() {
        return 0;
    }

    protected float getHorizontalScrollFactor() {
        if (this.bM == 0.0f) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.hlv_listPreferredItemWidth, typedValue, true)) {
                this.bM = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define hlv_listPreferredItemWidth.");
            }
        }
        return this.bM;
    }

    protected int getHorizontalScrollbarHeight() {
        return super.getHorizontalScrollbarHeight();
    }

    protected float getLeftFadingEdgeStrength() {
        int childCount = getChildCount();
        float leftFadingEdgeStrength = super.getLeftFadingEdgeStrength();
        if (childCount == 0) {
            return leftFadingEdgeStrength;
        }
        if (this.aw > 0) {
            return 1.0f;
        }
        childCount = getChildAt(0).getLeft();
        return childCount < getPaddingLeft() ? ((float) (-(childCount - getPaddingLeft()))) / ((float) getHorizontalFadingEdgeLength()) : leftFadingEdgeStrength;
    }

    public int getListPaddingBottom() {
        return this.M.bottom;
    }

    public int getListPaddingLeft() {
        return this.M.left;
    }

    public int getListPaddingRight() {
        return this.M.right;
    }

    public int getListPaddingTop() {
        return this.M.top;
    }

    protected float getRightFadingEdgeStrength() {
        int childCount = getChildCount();
        float rightFadingEdgeStrength = super.getRightFadingEdgeStrength();
        if (childCount == 0) {
            return rightFadingEdgeStrength;
        }
        if ((this.aw + childCount) - 1 < this.aP - 1) {
            return 1.0f;
        }
        childCount = getChildAt(childCount - 1).getRight();
        int width = getWidth();
        return childCount > width - getPaddingRight() ? ((float) ((childCount - width) + getPaddingRight())) / ((float) getHorizontalFadingEdgeLength()) : rightFadingEdgeStrength;
    }

    @ExportedProperty
    public View getSelectedView() {
        return (this.aP <= 0 || this.aN < 0) ? null : getChildAt(this.aN - this.aw);
    }

    public Drawable getSelector() {
        return this.E;
    }

    public int getSolidColor() {
        return this.bp;
    }

    public int getTranscriptMode() {
        return this.bo;
    }

    protected void h() {
    }

    protected void h(int i, int i2) {
    }

    protected void i() {
        int i;
        int i2 = 1;
        int i3 = 0;
        if (this.O != null) {
            i = this.aw > 0 ? 1 : 0;
            if (i == 0 && getChildCount() > 0) {
                i = getChildAt(0).getLeft() < this.M.left ? 1 : 0;
            }
            this.O.setVisibility(i != 0 ? 0 : 4);
        }
        if (this.P != null) {
            int childCount = getChildCount();
            i = this.aw + childCount < this.aP ? 1 : 0;
            if (i != 0 || childCount <= 0) {
                i2 = i;
            } else if (getChildAt(childCount - 1).getRight() <= getRight() - this.M.right) {
                i2 = 0;
            }
            View view = this.P;
            if (i2 == 0) {
                i3 = 4;
            }
            view.setVisibility(i3);
        }
    }

    boolean j() {
        switch (this.aa) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.E != null) {
            this.E.jumpToCurrentState();
        }
    }

    protected boolean k() {
        return (hasFocus() && !isInTouchMode()) || j();
    }

    protected void l() {
        if (isEnabled() && isClickable()) {
            Drawable drawable = this.E;
            Rect rect = this.G;
            if (drawable == null) {
                return;
            }
            if ((isFocused() || j()) && !rect.isEmpty()) {
                View childAt = getChildAt(this.aN - this.aw);
                if (childAt != null) {
                    if (!childAt.hasFocusable()) {
                        childAt.setPressed(true);
                    } else {
                        return;
                    }
                }
                setPressed(true);
                boolean isLongClickable = isLongClickable();
                drawable = drawable.getCurrent();
                if (drawable != null && (drawable instanceof TransitionDrawable)) {
                    if (isLongClickable) {
                        ((TransitionDrawable) drawable).startTransition(ViewConfiguration.getLongPressTimeout());
                    } else {
                        ((TransitionDrawable) drawable).resetTransition();
                    }
                }
                if (isLongClickable && !this.aK) {
                    if (this.bl == null) {
                        this.bl = new b(this, null);
                    }
                    this.bl.a();
                    postDelayed(this.bl, (long) ViewConfiguration.getLongPressTimeout());
                }
            }
        }
    }

    void m() {
        if (this.E == null) {
            return;
        }
        if (k()) {
            this.E.setState(getDrawableState());
        } else {
            this.E.setState(ar);
        }
    }

    @TargetApi(11)
    protected void n() {
        if (this.s.a() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
    }

    protected void o() {
        if (this.aN != -1) {
            if (this.z != 4) {
                this.ai = this.aN;
            }
            if (this.aL >= 0 && this.aL != this.aN) {
                this.ai = this.aL;
            }
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.ae = 0;
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (this.B != null && this.A == null) {
            this.A = new a(this);
            this.B.registerDataSetObserver(this.A);
            this.aK = true;
            this.aQ = this.aP;
            this.aP = this.B.getCount();
        }
        this.ap = true;
    }

    @SuppressLint({"Override"})
    protected int[] onCreateDrawableState(int i) {
        if (this.bq) {
            return super.onCreateDrawableState(i);
        }
        int i2 = ENABLED_STATE_SET[0];
        Object onCreateDrawableState = super.onCreateDrawableState(i + 1);
        int length = onCreateDrawableState.length - 1;
        while (length >= 0) {
            if (onCreateDrawableState[length] == i2) {
                break;
            }
            length--;
        }
        length = -1;
        if (length < 0) {
            return onCreateDrawableState;
        }
        System.arraycopy(onCreateDrawableState, length + 1, onCreateDrawableState, length, (onCreateDrawableState.length - length) - 1);
        return onCreateDrawableState;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.b();
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        if (!(this.B == null || this.A == null)) {
            this.B.unregisterDataSetObserver(this.A);
            this.A = null;
        }
        if (this.aZ != null) {
            removeCallbacks(this.aZ);
        }
        if (this.ad != null) {
            this.ad.a();
        }
        if (this.bt != null) {
            removeCallbacks(this.bt);
        }
        if (this.bm != null) {
            removeCallbacks(this.bm);
        }
        if (this.bn != null) {
            removeCallbacks(this.bn);
            this.bn = null;
        }
        this.ap = false;
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z && this.aN < 0 && !isInTouchMode()) {
            if (!(this.ap || this.B == null)) {
                this.aK = true;
                this.aQ = this.aP;
                this.aP = this.B.getCount();
            }
            s();
        }
    }

    @TargetApi(12)
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            switch (motionEvent.getAction()) {
                case 8:
                    if (this.aa == -1) {
                        float axisValue = motionEvent.getAxisValue(10);
                        if (axisValue != 0.0f) {
                            int horizontalScrollFactor = (int) (axisValue * getHorizontalScrollFactor());
                            if (!g(horizontalScrollFactor, horizontalScrollFactor)) {
                                return true;
                            }
                        }
                    }
                    break;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbsHListView.class.getName());
    }

    @SuppressLint({"Override"})
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbsHListView.class.getName());
        if (isEnabled()) {
            if (getFirstVisiblePosition() > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (getLastVisiblePosition() < getCount() - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.ad != null) {
            this.ad.a();
        }
        if (!this.ap) {
            return false;
        }
        switch (action & 255) {
            case 0:
                action = this.aa;
                if (action == 6 || action == 5) {
                    this.ac = 0;
                    return true;
                }
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.bx = motionEvent.getPointerId(0);
                int f = f(x);
                if (action != 4 && f >= 0) {
                    this.T = getChildAt(f - this.aw).getLeft();
                    this.V = x;
                    this.W = y;
                    this.S = f;
                    this.aa = 0;
                    J();
                }
                this.ab = Integer.MIN_VALUE;
                F();
                this.aY.addMovement(motionEvent);
                return action == 4;
            case 1:
            case 3:
                this.aa = -1;
                this.bx = -1;
                H();
                b(0);
                return false;
            case 2:
                switch (this.aa) {
                    case 0:
                        action = motionEvent.findPointerIndex(this.bx);
                        if (action == -1) {
                            this.bx = motionEvent.getPointerId(0);
                            action = 0;
                        }
                        action = (int) motionEvent.getX(action);
                        G();
                        this.aY.addMovement(motionEvent);
                        return j(action);
                    default:
                        return false;
                }
            case 6:
                b(motionEvent);
                return false;
            default:
                return false;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        switch (i) {
            case 23:
            case 66:
                if (!isEnabled()) {
                    return true;
                }
                if (isClickable() && isPressed() && this.aN >= 0 && this.B != null && this.aN < this.B.getCount()) {
                    View childAt = getChildAt(this.aN - this.aw);
                    if (childAt != null) {
                        a(childAt, this.aN, this.aO);
                        childAt.setPressed(false);
                    }
                    setPressed(false);
                    return true;
                }
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.aG = true;
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                getChildAt(i5).forceLayout();
            }
            this.H.a();
        }
        h();
        this.aG = false;
        this.aj = (i3 - i) / 3;
    }

    protected void onMeasure(int i, int i2) {
        if (this.E == null) {
            E();
        }
        Rect rect = this.M;
        rect.left = this.I + getPaddingLeft();
        rect.top = this.J + getPaddingTop();
        rect.right = this.K + getPaddingRight();
        rect.bottom = this.L + getPaddingBottom();
        if (this.bo == 1) {
            int childCount = getChildCount();
            int width = getWidth() - getPaddingRight();
            View childAt = getChildAt(childCount - 1);
            boolean z = childCount + this.aw >= this.bK && (childAt != null ? childAt.getRight() : width) <= width;
            this.bE = z;
        }
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollX() != i) {
            onScrollChanged(i, getScrollY(), getScrollX(), getScrollY());
            this.s.a(i);
            n();
            awakenScrollBars();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.aK = true;
        this.aA = (long) savedState.e;
        if (savedState.a >= 0) {
            this.aB = true;
            this.bL = savedState;
            this.az = savedState.a;
            this.ay = savedState.d;
            this.ax = savedState.c;
            this.aC = 0;
        } else if (savedState.b >= 0) {
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.F = -1;
            this.aB = true;
            this.bL = savedState;
            this.az = savedState.b;
            this.ay = savedState.d;
            this.ax = savedState.c;
            this.aC = 1;
        }
        if (savedState.i != null) {
            this.x = savedState.i;
        }
        if (savedState.j != null) {
            this.y = savedState.j;
        }
        this.w = savedState.h;
        if (VERSION.SDK_INT >= 11 && savedState.g && this.t == 3 && this.v != null) {
            this.u = startActionMode((it.sephiroth.android.library.a.a.b) this.v);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        boolean z = true;
        int i = 0;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.bL != null) {
            savedState.a = this.bL.a;
            savedState.b = this.bL.b;
            savedState.c = this.bL.c;
            savedState.d = this.bL.d;
            savedState.e = this.bL.e;
            savedState.f = this.bL.f;
            savedState.g = this.bL.g;
            savedState.h = this.bL.h;
            savedState.i = this.bL.i;
            savedState.j = this.bL.j;
            return savedState;
        }
        boolean z2 = getChildCount() > 0 && this.aP > 0;
        long selectedItemId = getSelectedItemId();
        savedState.a = selectedItemId;
        savedState.e = getWidth();
        if (selectedItemId >= 0) {
            savedState.c = this.ae;
            savedState.d = getSelectedItemPosition();
            savedState.b = -1;
        } else if (!z2 || this.aw <= 0) {
            savedState.c = 0;
            savedState.b = -1;
            savedState.d = 0;
        } else {
            savedState.c = getChildAt(0).getLeft();
            int i2 = this.aw;
            if (i2 >= this.aP) {
                i2 = this.aP - 1;
            }
            savedState.d = i2;
            savedState.b = this.B.getItemId(i2);
        }
        savedState.f = null;
        if (VERSION.SDK_INT < 11 || this.t != 3 || this.u == null) {
            z = false;
        }
        savedState.g = z;
        if (this.x != null) {
            try {
                savedState.i = this.x.clone();
            } catch (NoSuchMethodError e) {
                e.printStackTrace();
                savedState.i = new SparseArrayCompat();
            }
        }
        if (this.y != null) {
            LongSparseArray longSparseArray = new LongSparseArray();
            int size = this.y.size();
            while (i < size) {
                longSparseArray.put(this.y.keyAt(i), this.y.valueAt(i));
                i++;
            }
            savedState.j = longSparseArray;
        }
        savedState.h = this.w;
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            this.aK = true;
            A();
        }
    }

    @SuppressLint({"Override"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (isEnabled()) {
            if (this.ad != null) {
                this.ad.a();
            }
            if (!this.ap) {
                return false;
            }
            int action = motionEvent.getAction();
            G();
            this.aY.addMovement(motionEvent);
            int x;
            int y;
            int a;
            Handler handler;
            switch (action & 255) {
                case 0:
                    switch (this.aa) {
                        case 6:
                            this.aZ.b();
                            if (this.ad != null) {
                                this.ad.a();
                            }
                            this.aa = 5;
                            this.W = (int) motionEvent.getY();
                            action = (int) motionEvent.getX();
                            this.ab = action;
                            this.V = action;
                            this.ac = 0;
                            this.bx = motionEvent.getPointerId(0);
                            this.bD = 0;
                            break;
                        default:
                            this.bx = motionEvent.getPointerId(0);
                            x = (int) motionEvent.getX();
                            y = (int) motionEvent.getY();
                            a = a(x, y);
                            if (!this.aK) {
                                if (this.aa == 4 || a < 0 || !((ListAdapter) getAdapter()).isEnabled(a)) {
                                    if (this.aa == 4) {
                                        I();
                                        this.aa = 3;
                                        this.ac = 0;
                                        action = f(x);
                                        this.aZ.c();
                                        if (action >= 0) {
                                            this.T = getChildAt(action - this.aw).getLeft();
                                        }
                                        this.V = x;
                                        this.W = y;
                                        this.S = action;
                                        this.ab = Integer.MIN_VALUE;
                                        break;
                                    }
                                }
                                this.aa = 0;
                                if (this.bk == null) {
                                    this.bk = new d(this);
                                }
                                postDelayed(this.bk, (long) ViewConfiguration.getTapTimeout());
                                action = a;
                                if (action >= 0) {
                                    this.T = getChildAt(action - this.aw).getLeft();
                                }
                                this.V = x;
                                this.W = y;
                                this.S = action;
                                this.ab = Integer.MIN_VALUE;
                            }
                            action = a;
                            if (action >= 0) {
                                this.T = getChildAt(action - this.aw).getLeft();
                            }
                            this.V = x;
                            this.W = y;
                            this.S = action;
                            this.ab = Integer.MIN_VALUE;
                            break;
                    }
                    if (!a(motionEvent) || this.aa != 0) {
                        return true;
                    }
                    removeCallbacks(this.bk);
                    return true;
                case 1:
                    switch (this.aa) {
                        case 0:
                        case 1:
                        case 2:
                            a = this.S;
                            View childAt = getChildAt(a - this.aw);
                            float x2 = motionEvent.getX();
                            boolean z = x2 > ((float) this.M.left) && x2 < ((float) (getWidth() - this.M.right));
                            if (!(childAt == null || childAt.hasFocusable() || !z)) {
                                if (this.aa != 0) {
                                    childAt.setPressed(false);
                                }
                                if (this.bm == null) {
                                    this.bm = new h(this, null);
                                }
                                h hVar = this.bm;
                                hVar.a = a;
                                hVar.a();
                                this.ai = a;
                                if (this.aa == 0 || this.aa == 1) {
                                    Handler handler2 = getHandler();
                                    if (handler2 != null) {
                                        handler2.removeCallbacks(this.aa == 0 ? this.bk : this.bj);
                                    }
                                    this.z = 0;
                                    if (this.aK || !this.B.isEnabled(a)) {
                                        this.aa = -1;
                                        m();
                                        return true;
                                    }
                                    this.aa = 1;
                                    setSelectedPositionInt(this.S);
                                    h();
                                    childAt.setPressed(true);
                                    a(this.S, childAt);
                                    setPressed(true);
                                    if (this.E != null) {
                                        Drawable current = this.E.getCurrent();
                                        if (current != null && (current instanceof TransitionDrawable)) {
                                            ((TransitionDrawable) current).resetTransition();
                                        }
                                    }
                                    if (this.bn != null) {
                                        removeCallbacks(this.bn);
                                    }
                                    this.bn = new 1(this, childAt, hVar);
                                    postDelayed(this.bn, (long) ViewConfiguration.getPressedStateDuration());
                                    return true;
                                } else if (!this.aK && this.B.isEnabled(a)) {
                                    hVar.run();
                                }
                            }
                            this.aa = -1;
                            m();
                            break;
                        case 3:
                            action = getChildCount();
                            if (action <= 0) {
                                this.aa = -1;
                                b(0);
                                break;
                            }
                            a = getChildAt(0).getLeft();
                            x = getChildAt(action - 1).getRight();
                            y = this.M.left;
                            int width = getWidth() - this.M.right;
                            if (this.aw == 0 && a >= y && this.aw + action < this.aP && x <= getWidth() - width) {
                                this.aa = -1;
                                b(0);
                                break;
                            }
                            VelocityTracker velocityTracker = this.aY;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.bv);
                            int xVelocity = (int) (velocityTracker.getXVelocity(this.bx) * this.bw);
                            if (Math.abs(xVelocity) > this.bu && ((this.aw != 0 || a != y - this.an) && (action + this.aw != this.aP || x != this.an + width))) {
                                if (this.aZ == null) {
                                    this.aZ = new e(this);
                                }
                                b(2);
                                this.aZ.a(-xVelocity);
                                break;
                            }
                            this.aa = -1;
                            b(0);
                            if (this.aZ != null) {
                                this.aZ.b();
                            }
                            if (this.ad != null) {
                                this.ad.a();
                                break;
                            }
                            break;
                        case 5:
                            if (this.aZ == null) {
                                this.aZ = new e(this);
                            }
                            VelocityTracker velocityTracker2 = this.aY;
                            velocityTracker2.computeCurrentVelocity(1000, (float) this.bv);
                            action = (int) velocityTracker2.getXVelocity(this.bx);
                            b(2);
                            if (Math.abs(action) <= this.bu) {
                                this.aZ.a();
                                break;
                            }
                            this.aZ.b(-action);
                            break;
                    }
                    setPressed(false);
                    if (this.bz != null) {
                        this.bz.c();
                        this.bA.c();
                    }
                    invalidate();
                    handler = getHandler();
                    if (handler != null) {
                        handler.removeCallbacks(this.bj);
                    }
                    H();
                    this.bx = -1;
                    return true;
                case 2:
                    action = motionEvent.findPointerIndex(this.bx);
                    if (action == -1) {
                        this.bx = motionEvent.getPointerId(0);
                    } else {
                        i = action;
                    }
                    action = (int) motionEvent.getX(i);
                    if (this.aK) {
                        h();
                    }
                    switch (this.aa) {
                        case 0:
                        case 1:
                        case 2:
                            j(action);
                            return true;
                        case 3:
                        case 5:
                            k(action);
                            return true;
                        default:
                            return true;
                    }
                case 3:
                    switch (this.aa) {
                        case 5:
                            if (this.aZ == null) {
                                this.aZ = new e(this);
                            }
                            this.aZ.a();
                            break;
                        case 6:
                            break;
                        default:
                            this.aa = -1;
                            setPressed(false);
                            View childAt2 = getChildAt(this.S - this.aw);
                            if (childAt2 != null) {
                                childAt2.setPressed(false);
                            }
                            J();
                            handler = getHandler();
                            if (handler != null) {
                                handler.removeCallbacks(this.bj);
                            }
                            H();
                            break;
                    }
                    if (this.bz != null) {
                        this.bz.c();
                        this.bA.c();
                    }
                    this.bx = -1;
                    return true;
                case 5:
                    action = motionEvent.getActionIndex();
                    a = motionEvent.getPointerId(action);
                    x = (int) motionEvent.getX(action);
                    action = (int) motionEvent.getY(action);
                    this.ac = 0;
                    this.bx = a;
                    this.V = x;
                    this.W = action;
                    action = a(x, action);
                    if (action >= 0) {
                        this.T = getChildAt(action - this.aw).getLeft();
                        this.S = action;
                    }
                    this.ab = x;
                    return true;
                case 6:
                    b(motionEvent);
                    action = this.V;
                    i = a(action, this.W);
                    if (i >= 0) {
                        this.T = getChildAt(i - this.aw).getLeft();
                        this.S = i;
                    }
                    this.ab = action;
                    return true;
                default:
                    return true;
            }
        }
        z = isClickable() || isLongClickable();
        return z;
    }

    public void onTouchModeChanged(boolean z) {
        if (z) {
            o();
            if (getWidth() > 0 && getChildCount() > 0) {
                h();
            }
            m();
            return;
        }
        int i = this.aa;
        if (i == 5 || i == 6) {
            if (this.aZ != null) {
                this.aZ.b();
            }
            if (this.ad != null) {
                this.ad.a();
            }
            if (getScrollX() != 0) {
                this.s.a(0);
                K();
                invalidate();
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        int i = isInTouchMode() ? 0 : 1;
        if (!z) {
            setChildrenDrawingCacheEnabled(false);
            if (this.aZ != null) {
                removeCallbacks(this.aZ);
                this.aZ.b();
                if (this.ad != null) {
                    this.ad.a();
                }
                if (getScrollX() != 0) {
                    this.s.a(0);
                    K();
                    invalidate();
                }
            }
            if (i == 1) {
                this.ai = this.aN;
            }
        } else if (!(i == this.bi || this.bi == -1)) {
            if (i == 1) {
                s();
            } else {
                o();
                this.z = 0;
                h();
            }
        }
        this.bi = i;
    }

    protected int p() {
        int i = this.aN;
        if (i < 0) {
            i = this.ai;
        }
        return Math.min(Math.max(0, i), this.aP - 1);
    }

    @TargetApi(16)
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!isEnabled() || getLastVisiblePosition() >= getCount() - 1) {
                    return false;
                }
                f((getWidth() - this.M.left) - this.M.right, 200);
                return true;
            case 8192:
                if (!isEnabled() || this.aw <= 0) {
                    return false;
                }
                f(-((getWidth() - this.M.left) - this.M.right), 200);
                return true;
            default:
                return false;
        }
    }

    public void q() {
        this.aK = true;
        A();
        requestLayout();
        invalidate();
    }

    protected boolean r() {
        if (this.aN >= 0 || !s()) {
            return false;
        }
        m();
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            H();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (!this.aW && !this.aG) {
            super.requestLayout();
        }
    }

    boolean s() {
        boolean z = true;
        int childCount = getChildCount();
        if (childCount <= 0) {
            return false;
        }
        int left;
        int i;
        boolean z2;
        boolean z3 = this.M.left;
        int right = (getRight() - getLeft()) - this.M.right;
        int i2 = this.aw;
        int i3 = this.ai;
        if (i3 >= i2 && i3 < i2 + childCount) {
            View childAt = getChildAt(i3 - this.aw);
            left = childAt.getLeft();
            childCount = childAt.getRight();
            if (left < z3) {
                left = getHorizontalFadingEdgeLength() + z3;
            } else if (childCount > right) {
                left = (right - childAt.getMeasuredWidth()) - getHorizontalFadingEdgeLength();
            }
            i = left;
            z2 = true;
        } else if (i3 < i2) {
            boolean left2;
            right = 0;
            z2 = false;
            while (right < childCount) {
                boolean z4;
                left2 = getChildAt(right).getLeft();
                if (right != 0) {
                    z4 = z3;
                    z3 = z2;
                    z2 = z4;
                } else if (i2 > 0 || left2 < z3) {
                    z2 = getHorizontalFadingEdgeLength() + z3;
                    z3 = left2;
                } else {
                    z2 = z3;
                    z3 = left2;
                }
                if (left2 >= z2) {
                    left = i2 + right;
                    break;
                }
                right++;
                z4 = z2;
                z2 = z3;
                z3 = z4;
            }
            left2 = z2;
            left = i2;
            i = i3;
            i3 = left;
            z2 = true;
        } else {
            int i4 = this.aP;
            left = (i2 + childCount) - 1;
            int i5 = childCount - 1;
            i = 0;
            while (i5 >= 0) {
                int i6;
                View childAt2 = getChildAt(i5);
                i3 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                if (i5 != childCount - 1) {
                    i6 = right;
                    right = i;
                    i = i6;
                } else if (i2 + childCount < i4 || right2 > right) {
                    i = right - getHorizontalFadingEdgeLength();
                    right = i3;
                } else {
                    i = right;
                    right = i3;
                }
                if (right2 <= i) {
                    i = i3;
                    i3 = i2 + i5;
                    z2 = false;
                    break;
                }
                i5--;
                i6 = i;
                i = right;
                right = i6;
            }
            i3 = left;
            z2 = false;
        }
        this.ai = -1;
        removeCallbacks(this.aZ);
        if (this.ad != null) {
            this.ad.a();
        }
        this.aa = -1;
        J();
        this.ax = i;
        left = b(i3, z2);
        if (left < i2 || left > getLastVisiblePosition()) {
            left = -1;
        } else {
            this.z = 4;
            m();
            setSelectionInt(left);
            c();
        }
        b(0);
        if (left < 0) {
            z = false;
        }
        return z;
    }

    public void sendAccessibilityEvent(int i) {
        if (i == 4096) {
            int firstVisiblePosition = getFirstVisiblePosition();
            int lastVisiblePosition = getLastVisiblePosition();
            if (this.bI != firstVisiblePosition || this.bJ != lastVisiblePosition) {
                this.bI = firstVisiblePosition;
                this.bJ = lastVisiblePosition;
            } else {
                return;
            }
        }
        super.sendAccessibilityEvent(i);
    }

    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter != null) {
            this.C = this.B.hasStableIds();
            if (this.t != 0 && this.C && this.y == null) {
                this.y = new LongSparseArray();
            }
        }
        if (this.x != null) {
            this.x.clear();
        }
        if (this.y != null) {
            this.y.clear();
        }
    }

    public void setCacheColorHint(int i) {
        if (i != this.bp) {
            this.bp = i;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setDrawingCacheBackgroundColor(i);
            }
            this.H.f(i);
        }
    }

    @TargetApi(11)
    public void setChoiceMode(int i) {
        this.t = i;
        if (VERSION.SDK_INT >= 11 && this.u != null) {
            if (VERSION.SDK_INT >= 11) {
                ((ActionMode) this.u).finish();
            }
            this.u = null;
        }
        if (this.t != 0) {
            if (this.x == null) {
                this.x = new SparseArrayCompat();
            }
            if (this.y == null && this.B != null && this.B.hasStableIds()) {
                this.y = new LongSparseArray();
            }
            if (VERSION.SDK_INT >= 11 && this.t == 3) {
                a();
                setLongClickable(true);
            }
        }
    }

    public void setDrawSelectorOnTop(boolean z) {
        this.D = z;
    }

    public void setFriction(float f) {
        if (this.aZ == null) {
            this.aZ = new e(this);
        }
        e.a(this.aZ).b(f);
    }

    @TargetApi(11)
    public void setMultiChoiceModeListener(it.sephiroth.android.library.a.a.a aVar) {
        if (VERSION.SDK_INT >= 11) {
            if (this.v == null) {
                this.v = new it.sephiroth.android.library.a.a.b(this);
            }
            ((it.sephiroth.android.library.a.a.b) this.v).a(aVar);
            return;
        }
        Log.e(aX, "setMultiChoiceModeListener not supported for this version of Android");
    }

    public void setOnScrollListener(g gVar) {
        this.ba = gVar;
        c();
    }

    public void setOverScrollMode(int i) {
        if (i == 2) {
            this.bz = null;
            this.bA = null;
        } else if (this.bz == null) {
            Context context = getContext();
            this.bz = new a(context, 1);
            this.bA = new a(context, 1);
        }
        super.setOverScrollMode(i);
    }

    public void setRecyclerListener(k kVar) {
        j.a(this.H, kVar);
    }

    public void setScrollingCacheEnabled(boolean z) {
        if (this.ag && !z) {
            J();
        }
        this.ag = z;
    }

    public abstract void setSelectionInt(int i);

    public void setSelector(int i) {
        setSelector(getResources().getDrawable(i));
    }

    public void setSelector(Drawable drawable) {
        if (this.E != null) {
            this.E.setCallback(null);
            unscheduleDrawable(this.E);
        }
        this.E = drawable;
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.I = rect.left;
        this.J = rect.top;
        this.K = rect.right;
        this.L = rect.bottom;
        drawable.setCallback(this);
        m();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.bb = z;
    }

    public void setStackFromRight(boolean z) {
        if (this.af != z) {
            this.af = z;
            f();
        }
    }

    public void setTranscriptMode(int i) {
        this.bo = i;
    }

    public void setVelocityScale(float f) {
        this.bw = f;
    }

    public boolean showContextMenuForChild(View view) {
        boolean z = false;
        int a = a(view);
        if (a < 0) {
            return false;
        }
        long itemId = this.B.getItemId(a);
        if (this.aJ != null) {
            z = this.aJ.a(this, view, a, itemId);
        }
        if (z) {
            return z;
        }
        this.bd = b(getChildAt(a - this.aw), a, itemId);
        return super.showContextMenuForChild(view);
    }

    void t() {
        this.x.clear();
        int i = 0;
        boolean z = false;
        while (i < this.y.size()) {
            int max;
            boolean z2;
            long keyAt = this.y.keyAt(i);
            int intValue = ((Integer) this.y.valueAt(i)).intValue();
            if (keyAt != this.B.getItemId(intValue)) {
                boolean z3;
                int min = Math.min(intValue + 20, this.aP);
                for (max = Math.max(0, intValue - 20); max < min; max++) {
                    if (keyAt == this.B.getItemId(max)) {
                        this.x.put(max, Boolean.valueOf(true));
                        this.y.setValueAt(i, Integer.valueOf(max));
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
                if (!z3) {
                    this.y.delete(keyAt);
                    max = i - 1;
                    this.w--;
                    if (!(VERSION.SDK_INT <= 11 || this.u == null || this.v == null)) {
                        ((it.sephiroth.android.library.a.a.b) this.v).a((ActionMode) this.u, intValue, keyAt, false);
                    }
                    i = max;
                    z = true;
                }
                max = i;
                z2 = z;
            } else {
                this.x.put(intValue, Boolean.valueOf(true));
                max = i;
                z2 = z;
            }
            z = z2;
            i = max + 1;
        }
        if (z && this.u != null && VERSION.SDK_INT > 11) {
            ((ActionMode) this.u).invalidate();
        }
    }

    protected void u() {
        int i = this.aP;
        int i2 = this.bK;
        this.bK = this.aP;
        if (!(this.t == 0 || this.B == null || !this.B.hasStableIds())) {
            t();
        }
        this.H.c();
        if (i > 0) {
            int width;
            int bottom;
            if (this.aB) {
                this.aB = false;
                this.bL = null;
                if (this.bo == 2) {
                    this.z = 3;
                    return;
                }
                if (this.bo == 1) {
                    if (this.bE) {
                        this.bE = false;
                        this.z = 3;
                        return;
                    }
                    int childCount = getChildCount();
                    width = getWidth() - getPaddingRight();
                    View childAt = getChildAt(childCount - 1);
                    bottom = childAt != null ? childAt.getBottom() : width;
                    if (childCount + this.aw < i2 || bottom > width) {
                        awakenScrollBars();
                    } else {
                        this.z = 3;
                        return;
                    }
                }
                switch (this.aC) {
                    case 0:
                        if (isInTouchMode()) {
                            this.z = 5;
                            this.ay = Math.min(Math.max(0, this.ay), i - 1);
                            return;
                        }
                        bottom = z();
                        if (bottom >= 0 && b(bottom, true) == bottom) {
                            this.ay = bottom;
                            if (this.aA == ((long) getWidth())) {
                                this.z = 5;
                            } else {
                                this.z = 2;
                            }
                            setNextSelectedPositionInt(bottom);
                            return;
                        }
                    case 1:
                        this.z = 5;
                        this.ay = Math.min(Math.max(0, this.ay), i - 1);
                        return;
                }
            }
            if (!isInTouchMode()) {
                bottom = getSelectedItemPosition();
                if (bottom >= i) {
                    bottom = i - 1;
                }
                if (bottom < 0) {
                    bottom = 0;
                }
                width = b(bottom, true);
                if (width >= 0) {
                    setNextSelectedPositionInt(width);
                    return;
                }
                bottom = b(bottom, false);
                if (bottom >= 0) {
                    setNextSelectedPositionInt(bottom);
                    return;
                }
            } else if (this.ai >= 0) {
                return;
            }
        }
        this.z = this.af ? 3 : 1;
        this.aN = -1;
        this.aO = Long.MIN_VALUE;
        this.aL = -1;
        this.aM = Long.MIN_VALUE;
        this.aB = false;
        this.bL = null;
        this.F = -1;
        y();
    }

    public boolean verifyDrawable(Drawable drawable) {
        return this.E == drawable || super.verifyDrawable(drawable);
    }
}
