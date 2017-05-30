package it.sephiroth.android.library.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.Adapter;

public abstract class AdapterView<T extends Adapter> extends ViewGroup {
    static final int aD = 0;
    static final int aE = 1;
    static final int aF = 100;
    public static final int aS = -1;
    public static final long aT = Long.MIN_VALUE;
    public static final String as = "AdapterView";
    public static final boolean at = false;
    public static final int au = -1;
    public static final int av = -2;
    private int a;
    protected long aA;
    protected boolean aB = false;
    int aC;
    protected boolean aG = false;
    e aH;
    c aI;
    d aJ;
    public boolean aK;
    @ExportedProperty(category = "list")
    protected int aL = -1;
    protected long aM = Long.MIN_VALUE;
    @ExportedProperty(category = "list")
    protected int aN = -1;
    protected long aO = Long.MIN_VALUE;
    @ExportedProperty(category = "list")
    protected int aP;
    protected int aQ;
    AccessibilityManager aR;
    protected int aU = -1;
    protected long aV = Long.MIN_VALUE;
    protected boolean aW = false;
    @ExportedProperty(category = "scrolling")
    protected int aw = 0;
    protected int ax;
    protected int ay;
    protected long az = Long.MIN_VALUE;
    private View b;
    private boolean c;
    private boolean d;
    private f e;

    public AdapterView(Context context) {
        super(context);
    }

    public AdapterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @TargetApi(16)
    public AdapterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (VERSION.SDK_INT >= 16 && getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (!isInEditMode()) {
            this.aR = (AccessibilityManager) getContext().getSystemService("accessibility");
        }
    }

    private void a() {
        if (this.aH != null) {
            int selectedItemPosition = getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                View selectedView = getSelectedView();
                this.aH.a(this, selectedView, selectedItemPosition, getAdapter().getItemId(selectedItemPosition));
                return;
            }
            this.aH.a(this);
        }
    }

    @SuppressLint({"WrongCall"})
    private void a(boolean z) {
        if (v()) {
            z = false;
        }
        if (z) {
            if (this.b != null) {
                this.b.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.aK) {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                return;
            }
            return;
        }
        if (this.b != null) {
            this.b.setVisibility(8);
        }
        setVisibility(0);
    }

    private void b() {
        if (this.aR.isEnabled() && getSelectedItemPosition() >= 0) {
            sendAccessibilityEvent(4);
        }
    }

    private boolean c() {
        Adapter adapter = getAdapter();
        if (adapter == null) {
            return false;
        }
        int count = adapter.getCount();
        return count > 0 ? getFirstVisiblePosition() > 0 || getLastVisiblePosition() < count - 1 : false;
    }

    public void A() {
        if (getChildCount() > 0) {
            this.aB = true;
            this.aA = (long) this.a;
            View childAt;
            if (this.aN >= 0) {
                childAt = getChildAt(this.aN - this.aw);
                this.az = this.aM;
                this.ay = this.aL;
                if (childAt != null) {
                    this.ax = childAt.getLeft();
                }
                this.aC = 0;
                return;
            }
            childAt = getChildAt(0);
            Adapter adapter = getAdapter();
            if (this.aw < 0 || this.aw >= adapter.getCount()) {
                this.az = -1;
            } else {
                this.az = adapter.getItemId(this.aw);
            }
            this.ay = this.aw;
            if (childAt != null) {
                this.ax = childAt.getLeft();
            }
            this.aC = 1;
        }
    }

    public int a(View view) {
        while (true) {
            try {
                View view2 = (View) view.getParent();
                if (view2.equals(this)) {
                    break;
                }
                view = view2;
            } catch (ClassCastException e) {
                return -1;
            }
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).equals(view)) {
                return i + this.aw;
            }
        }
        return -1;
    }

    public boolean a(View view, int i, long j) {
        if (this.aI == null) {
            return false;
        }
        playSoundEffect(0);
        if (view != null) {
            view.sendAccessibilityEvent(1);
        }
        this.aI.a(this, view, i, j);
        return true;
    }

    public void addView(View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int i) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    protected int b(int i, boolean z) {
        return i;
    }

    protected boolean canAnimate() {
        return super.canAnimate() && this.aP > 0;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        View selectedView = getSelectedView();
        return selectedView != null && selectedView.getVisibility() == 0 && selectedView.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public abstract T getAdapter();

    @CapturedViewProperty
    public int getCount() {
        return this.aP;
    }

    public View getEmptyView() {
        return this.b;
    }

    public int getFirstVisiblePosition() {
        return this.aw;
    }

    public int getLastVisiblePosition() {
        return (this.aw + getChildCount()) - 1;
    }

    public final c getOnItemClickListener() {
        return this.aI;
    }

    public final d getOnItemLongClickListener() {
        return this.aJ;
    }

    public final e getOnItemSelectedListener() {
        return this.aH;
    }

    public Object getSelectedItem() {
        Adapter adapter = getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        return (adapter == null || adapter.getCount() <= 0 || selectedItemPosition < 0) ? null : adapter.getItem(selectedItemPosition);
    }

    @CapturedViewProperty
    public long getSelectedItemId() {
        return this.aM;
    }

    @CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.aL;
    }

    public abstract View getSelectedView();

    public Object h(int i) {
        Adapter adapter = getAdapter();
        return (adapter == null || i < 0) ? null : adapter.getItem(i);
    }

    public long i(int i) {
        Adapter adapter = getAdapter();
        return (adapter == null || i < 0) ? Long.MIN_VALUE : adapter.getItemId(i);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.e);
    }

    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AdapterView.class.getName());
        accessibilityEvent.setScrollable(c());
        View selectedView = getSelectedView();
        if (selectedView != null) {
            accessibilityEvent.setEnabled(selectedView.isEnabled());
        }
        accessibilityEvent.setCurrentItemIndex(getSelectedItemPosition());
        accessibilityEvent.setFromIndex(getFirstVisiblePosition());
        accessibilityEvent.setToIndex(getLastVisiblePosition());
        accessibilityEvent.setItemCount(getCount());
    }

    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AdapterView.class.getName());
        accessibilityNodeInfo.setScrollable(c());
        View selectedView = getSelectedView();
        if (selectedView != null) {
            accessibilityNodeInfo.setEnabled(selectedView.isEnabled());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a = getWidth();
    }

    @TargetApi(14)
    public boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (!super.onRequestSendAccessibilityEvent(view, accessibilityEvent)) {
            return false;
        }
        AccessibilityRecord obtain = AccessibilityEvent.obtain();
        onInitializeAccessibilityEvent(obtain);
        view.dispatchPopulateAccessibilityEvent(obtain);
        accessibilityEvent.appendRecord(obtain);
        return true;
    }

    public void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    public void removeView(View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public void removeViewAt(int i) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public abstract void setAdapter(T t);

    @TargetApi(16)
    public void setEmptyView(View view) {
        boolean z = true;
        this.b = view;
        if (VERSION.SDK_INT >= 16 && view != null && view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        Adapter adapter = getAdapter();
        if (!(adapter == null || adapter.isEmpty())) {
            z = false;
        }
        a(z);
    }

    public void setFocusable(boolean z) {
        boolean z2 = true;
        Adapter adapter = getAdapter();
        boolean z3 = adapter == null || adapter.getCount() == 0;
        this.c = z;
        if (!z) {
            this.d = false;
        }
        if (!z || (z3 && !v())) {
            z2 = false;
        }
        super.setFocusable(z2);
    }

    public void setFocusableInTouchMode(boolean z) {
        boolean z2 = true;
        Adapter adapter = getAdapter();
        boolean z3 = adapter == null || adapter.getCount() == 0;
        this.d = z;
        if (z) {
            this.c = true;
        }
        if (!z || (z3 && !v())) {
            z2 = false;
        }
        super.setFocusableInTouchMode(z2);
    }

    protected void setNextSelectedPositionInt(int i) {
        this.aL = i;
        this.aM = i(i);
        if (this.aB && this.aC == 0 && i >= 0) {
            this.ay = i;
            this.az = this.aM;
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemClickListener(c cVar) {
        this.aI = cVar;
    }

    public void setOnItemLongClickListener(d dVar) {
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.aJ = dVar;
    }

    public void setOnItemSelectedListener(e eVar) {
        this.aH = eVar;
    }

    protected void setSelectedPositionInt(int i) {
        this.aN = i;
        this.aO = i(i);
    }

    public abstract void setSelection(int i);

    void u() {
        boolean z;
        int i = this.aP;
        if (i > 0) {
            int z2;
            boolean z3;
            if (this.aB) {
                this.aB = false;
                z2 = z();
                if (z2 >= 0 && b(z2, true) == z2) {
                    setNextSelectedPositionInt(z2);
                    z3 = true;
                    if (!z3) {
                        z2 = getSelectedItemPosition();
                        if (z2 >= i) {
                            z2 = i - 1;
                        }
                        if (z2 < 0) {
                            z2 = 0;
                        }
                        i = b(z2, true);
                        z2 = i >= 0 ? b(z2, false) : i;
                        if (z2 >= 0) {
                            setNextSelectedPositionInt(z2);
                            y();
                            z = true;
                        }
                    }
                    z = z3;
                }
            }
            z3 = false;
            if (z3) {
                z2 = getSelectedItemPosition();
                if (z2 >= i) {
                    z2 = i - 1;
                }
                if (z2 < 0) {
                    z2 = 0;
                }
                i = b(z2, true);
                if (i >= 0) {
                }
                if (z2 >= 0) {
                    setNextSelectedPositionInt(z2);
                    y();
                    z = true;
                }
            }
            z = z3;
        } else {
            z = false;
        }
        if (!z) {
            this.aN = -1;
            this.aO = Long.MIN_VALUE;
            this.aL = -1;
            this.aM = Long.MIN_VALUE;
            this.aB = false;
            y();
        }
    }

    boolean v() {
        return false;
    }

    protected void w() {
        boolean z = false;
        Adapter adapter = getAdapter();
        boolean z2 = adapter == null || adapter.getCount() == 0;
        boolean z3 = !z2 || v();
        z2 = z3 && this.d;
        super.setFocusableInTouchMode(z2);
        z2 = z3 && this.c;
        super.setFocusable(z2);
        if (this.b != null) {
            if (adapter == null || adapter.isEmpty()) {
                z = true;
            }
            a(z);
        }
    }

    void x() {
        if (this.aH == null && !this.aR.isEnabled()) {
            return;
        }
        if (this.aG || this.aW) {
            if (this.e == null) {
                this.e = new f(this, null);
            }
            post(this.e);
            return;
        }
        a();
        b();
    }

    protected void y() {
        if (this.aN != this.aU || this.aO != this.aV) {
            x();
            this.aU = this.aN;
            this.aV = this.aO;
        }
    }

    int z() {
        int i = this.aP;
        if (i == 0) {
            return -1;
        }
        long j = this.az;
        int i2 = this.ay;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        int min = Math.min(i - 1, Math.max(0, i2));
        long uptimeMillis = SystemClock.uptimeMillis() + 100;
        Object obj = null;
        Adapter adapter = getAdapter();
        if (adapter == null) {
            return -1;
        }
        int i3 = min;
        int i4 = min;
        while (SystemClock.uptimeMillis() <= uptimeMillis) {
            if (adapter.getItemId(i4) != j) {
                Object obj2 = min == i + -1 ? 1 : null;
                Object obj3 = i3 == 0 ? 1 : null;
                if (obj2 != null && obj3 != null) {
                    break;
                } else if (obj3 != null || (r0 != null && obj2 == null)) {
                    min++;
                    obj = null;
                    i4 = min;
                } else if (obj2 != null || (r0 == null && obj3 == null)) {
                    i3--;
                    obj = 1;
                    i4 = i3;
                }
            } else {
                return i4;
            }
        }
        return -1;
    }
}
