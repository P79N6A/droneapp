package it.sephiroth.android.library.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Gravity;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ExpandableListAdapter;
import android.widget.ListAdapter;
import it.sephiroth.android.library.R;
import java.util.ArrayList;

public class ExpandableHListView extends HListView {
    public static final int aX = 0;
    public static final int aY = 1;
    public static final int aZ = 2;
    private static final int[] bA = new int[0];
    private static final int[] bB = new int[]{16842920};
    private static final int[] bC = new int[]{16842921};
    private static final int[] bD = new int[]{16842920, 16842921};
    private static final int[][] bE = new int[][]{bA, bB, bC, bD};
    private static final int[] bF = new int[]{16842918};
    public static final long ba = 4294967295L;
    public static final int bb = -1;
    private static final long bi = 4294967295L;
    private static final long bj = 9223372032559808512L;
    private static final long bk = Long.MIN_VALUE;
    private static final long bl = 32;
    private static final long bm = 63;
    private static final long bn = -1;
    private static final long bo = 2147483647L;
    private static final int bx = -2;
    private Drawable bG;
    private final Rect bH;
    private final Rect bI;
    private int bJ;
    private int bK;
    private int bL;
    private int bM;
    private d bN;
    private e bO;
    private c bP;
    private b bQ;
    private ExpandableHListConnector bp;
    private ExpandableListAdapter bq;
    private int br;
    private int bs;
    private int bt;
    private int bu;
    private int bv;
    private int bw;
    private Drawable by;
    private Drawable bz;

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
        ArrayList<GroupMetadata> a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = new ArrayList();
            parcel.readList(this.a, ExpandableHListConnector.class.getClassLoader());
        }

        SavedState(Parcelable parcelable, ArrayList<GroupMetadata> arrayList) {
            super(parcelable);
            this.a = arrayList;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeList(this.a);
        }
    }

    public static class a implements ContextMenuInfo {
        public View a;
        public long b;
        public long c;

        public a(View view, long j, long j2) {
            this.a = view;
            this.b = j;
            this.c = j2;
        }
    }

    public interface b {
        boolean a(ExpandableHListView expandableHListView, View view, int i, int i2, long j);
    }

    public interface c {
        boolean a(ExpandableHListView expandableHListView, View view, int i, long j);
    }

    public interface d {
        void a(int i);
    }

    public interface e {
        void a(int i);
    }

    public ExpandableHListView(Context context) {
        this(context, null);
    }

    public ExpandableHListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hlv_expandableListViewStyle);
    }

    public ExpandableHListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bH = new Rect();
        this.bI = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExpandableHListView, i, 0);
        setGroupIndicator(obtainStyledAttributes.getDrawable(3));
        setChildIndicator(obtainStyledAttributes.getDrawable(4));
        this.bs = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.br = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.bt = obtainStyledAttributes.getInt(0, 0);
        this.bu = obtainStyledAttributes.getInt(1, 0);
        this.bw = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.bv = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.bG = obtainStyledAttributes.getDrawable(2);
        obtainStyledAttributes.recycle();
    }

    private void D() {
        if (this.by != null) {
            this.bJ = this.by.getIntrinsicWidth();
            this.bK = this.by.getIntrinsicHeight();
            return;
        }
        this.bJ = 0;
        this.bK = 0;
    }

    private void E() {
        if (this.bz != null) {
            this.bL = this.bz.getIntrinsicWidth();
            this.bM = this.bz.getIntrinsicHeight();
            return;
        }
        this.bL = 0;
        this.bM = 0;
    }

    private long a(b bVar) {
        return bVar.f == 1 ? this.bq.getChildId(bVar.c, bVar.d) : this.bq.getGroupId(bVar.c);
    }

    private Drawable a(it.sephiroth.android.library.widget.ExpandableHListConnector.b bVar) {
        int i = 1;
        int i2 = 0;
        if (bVar.a.f == 2) {
            Drawable drawable = this.by;
            if (drawable == null || !drawable.isStateful()) {
                return drawable;
            }
            int i3 = (bVar.b == null || bVar.b.c == bVar.b.b) ? 1 : 0;
            if (!bVar.b()) {
                i = 0;
            }
            if (i3 != 0) {
                i2 = 2;
            }
            drawable.setState(bE[i | i2]);
            return drawable;
        }
        Drawable drawable2 = this.bz;
        if (drawable2 != null && drawable2.isStateful()) {
            drawable2.setState(bVar.a.e == bVar.b.c ? bF : bA);
        }
        return drawable2;
    }

    public static int b(long j) {
        return j == 4294967295L ? 2 : (j & Long.MIN_VALUE) == Long.MIN_VALUE ? 1 : 0;
    }

    public static int c(long j) {
        return j == 4294967295L ? -1 : (int) ((bj & j) >> 32);
    }

    public static int d(long j) {
        return (j != 4294967295L && (j & Long.MIN_VALUE) == Long.MIN_VALUE) ? (int) (j & 4294967295L) : -1;
    }

    public static long i(int i, int i2) {
        return (Long.MIN_VALUE | ((((long) i) & bo) << 32)) | (((long) i2) & -1);
    }

    public static long n(int i) {
        return (((long) i) & bo) << 32;
    }

    private boolean r(int i) {
        return i < getHeaderViewsCount() || i >= this.aP - getFooterViewsCount();
    }

    private int s(int i) {
        return i - getHeaderViewsCount();
    }

    private int t(int i) {
        return getHeaderViewsCount() + i;
    }

    public int a(long j) {
        b a = b.a(j);
        it.sephiroth.android.library.widget.ExpandableHListConnector.b a2 = this.bp.a(a);
        a.b();
        int i = a2.a.e;
        a2.a();
        return t(i);
    }

    void a(Canvas canvas, Rect rect, int i) {
        int i2 = this.aw + i;
        if (i2 >= 0) {
            it.sephiroth.android.library.widget.ExpandableHListConnector.b a = this.bp.a(s(i2));
            if (a.a.f == 1 || (a.b() && a.b.c != a.b.b)) {
                Drawable drawable = this.bG;
                drawable.setBounds(rect);
                drawable.draw(canvas);
                a.a();
                return;
            }
            a.a();
        }
        super.a(canvas, rect, i2);
    }

    public boolean a(View view, int i, long j) {
        return r(i) ? super.a(view, i, j) : d(view, s(i), j);
    }

    ContextMenuInfo b(View view, int i, long j) {
        if (r(i)) {
            return new AdapterView$a(view, i, j);
        }
        it.sephiroth.android.library.widget.ExpandableHListConnector.b a = this.bp.a(s(i));
        b bVar = a.a;
        long a2 = a(bVar);
        long a3 = bVar.a();
        a.a();
        return new a(view, a3, a2);
    }

    public boolean b(int i, int i2, boolean z) {
        b a = b.a(i, i2);
        it.sephiroth.android.library.widget.ExpandableHListConnector.b a2 = this.bp.a(a);
        if (a2 == null) {
            if (!z) {
                return false;
            }
            j(i);
            a2 = this.bp.a(a);
            if (a2 == null) {
                throw new IllegalStateException("Could not find child");
            }
        }
        super.setSelection(t(a2.a.e));
        a.b();
        a2.a();
        return true;
    }

    public boolean c(int i, boolean z) {
        b a = b.a(2, i, -1, -1);
        it.sephiroth.android.library.widget.ExpandableHListConnector.b a2 = this.bp.a(a);
        a.b();
        boolean b = this.bp.b(a2);
        if (this.bO != null) {
            this.bO.a(i);
        }
        if (z) {
            int headerViewsCount = a2.a.e + getHeaderViewsCount();
            e(this.bq.getChildrenCount(i) + headerViewsCount, headerViewsCount);
        }
        a2.a();
        return b;
    }

    boolean d(View view, int i, long j) {
        boolean z;
        it.sephiroth.android.library.widget.ExpandableHListConnector.b a = this.bp.a(i);
        long a2 = a(a.a);
        if (a.a.f == 2) {
            if (this.bP != null) {
                if (this.bP.a(this, view, a.a.c, a2)) {
                    a.a();
                    return true;
                }
            }
            if (a.b()) {
                this.bp.a(a);
                playSoundEffect(0);
                if (this.bN != null) {
                    this.bN.a(a.a.c);
                }
            } else {
                this.bp.b(a);
                playSoundEffect(0);
                if (this.bO != null) {
                    this.bO.a(a.a.c);
                }
                int headerViewsCount = a.a.e + getHeaderViewsCount();
                e(this.bq.getChildrenCount(a.a.c) + headerViewsCount, headerViewsCount);
            }
            z = true;
        } else if (this.bQ != null) {
            playSoundEffect(0);
            return this.bQ.a(this, view, a.a.c, a.a.d, a2);
        } else {
            z = false;
        }
        a.a();
        return z;
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.bz != null || this.by != null) {
            int headerViewsCount = getHeaderViewsCount();
            int footerViewsCount = ((this.aP - getFooterViewsCount()) - headerViewsCount) - 1;
            int right = getRight();
            Rect rect = this.bH;
            int childCount = getChildCount();
            int i = this.aw - headerViewsCount;
            headerViewsCount = -4;
            int i2 = 0;
            int i3 = i;
            while (i2 < childCount) {
                if (i3 >= 0) {
                    if (i3 <= footerViewsCount) {
                        View childAt = getChildAt(i2);
                        int left = childAt.getLeft();
                        int right2 = childAt.getRight();
                        if (right2 >= 0 && left <= right) {
                            it.sephiroth.android.library.widget.ExpandableHListConnector.b a = this.bp.a(i3);
                            if (a.a.f != headerViewsCount) {
                                if (a.a.f == 1) {
                                    rect.top = childAt.getTop() + this.bv;
                                    rect.bottom = childAt.getBottom() + this.bv;
                                } else {
                                    rect.top = childAt.getTop() + this.br;
                                    rect.bottom = childAt.getBottom() + this.br;
                                }
                                headerViewsCount = a.a.f;
                            }
                            if (rect.top != rect.bottom) {
                                if (a.a.f == 1) {
                                    rect.left = this.bw + left;
                                    rect.right = this.bw + right2;
                                } else {
                                    rect.left = this.bs + left;
                                    rect.right = this.bs + right2;
                                }
                                Drawable a2 = a(a);
                                if (a2 != null) {
                                    if (a.a.f == 1) {
                                        Gravity.apply(this.bu, this.bL, this.bM, rect, this.bI);
                                    } else {
                                        Gravity.apply(this.bt, this.bJ, this.bK, rect, this.bI);
                                    }
                                    a2.setBounds(this.bI);
                                    a2.draw(canvas);
                                }
                            }
                            a.a();
                        }
                    } else {
                        return;
                    }
                }
                i2++;
                i3++;
            }
        }
    }

    public ListAdapter getAdapter() {
        return super.getAdapter();
    }

    public ExpandableListAdapter getExpandableListAdapter() {
        return this.bq;
    }

    public long getSelectedId() {
        long selectedPosition = getSelectedPosition();
        if (selectedPosition == 4294967295L) {
            return -1;
        }
        int c = c(selectedPosition);
        return b(selectedPosition) == 0 ? this.bq.getGroupId(c) : this.bq.getChildId(c, d(selectedPosition));
    }

    public long getSelectedPosition() {
        return l(getSelectedItemPosition());
    }

    public boolean j(int i) {
        return c(i, false);
    }

    public boolean k(int i) {
        boolean b = this.bp.b(i);
        if (this.bN != null) {
            this.bN.a(i);
        }
        return b;
    }

    public long l(int i) {
        if (r(i)) {
            return 4294967295L;
        }
        it.sephiroth.android.library.widget.ExpandableHListConnector.b a = this.bp.a(s(i));
        long a2 = a.a.a();
        a.a();
        return a2;
    }

    public boolean m(int i) {
        return this.bp.d(i);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ExpandableHListView.class.getName());
    }

    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ExpandableHListView.class.getName());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.bp != null && savedState.a != null) {
                this.bp.a(savedState.a);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        D();
        E();
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.bp != null ? this.bp.b() : null);
    }

    public void setAdapter(ExpandableListAdapter expandableListAdapter) {
        this.bq = expandableListAdapter;
        if (expandableListAdapter != null) {
            this.bp = new ExpandableHListConnector(expandableListAdapter);
        } else {
            this.bp = null;
        }
        super.setAdapter(this.bp);
    }

    public void setAdapter(ListAdapter listAdapter) {
        throw new RuntimeException("For ExpandableListView, use setAdapter(ExpandableListAdapter) instead of setAdapter(ListAdapter)");
    }

    public void setChildDivider(Drawable drawable) {
        this.bG = drawable;
    }

    public void setChildIndicator(Drawable drawable) {
        this.bz = drawable;
        E();
    }

    public void setGroupIndicator(Drawable drawable) {
        this.by = drawable;
        D();
    }

    public void setOnChildClickListener(b bVar) {
        this.bQ = bVar;
    }

    public void setOnGroupClickListener(c cVar) {
        this.bP = cVar;
    }

    public void setOnGroupCollapseListener(d dVar) {
        this.bN = dVar;
    }

    public void setOnGroupExpandListener(e eVar) {
        this.bO = eVar;
    }

    public void setOnItemClickListener(AdapterView$c adapterView$c) {
        super.setOnItemClickListener(adapterView$c);
    }

    public void setSelectedGroup(int i) {
        b a = b.a(i);
        it.sephiroth.android.library.widget.ExpandableHListConnector.b a2 = this.bp.a(a);
        a.b();
        super.setSelection(t(a2.a.e));
        a2.a();
    }
}
