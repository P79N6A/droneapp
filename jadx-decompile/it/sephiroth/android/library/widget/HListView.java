package it.sephiroth.android.library.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.RemoteViews.RemoteView;
import it.sephiroth.android.library.R;
import it.sephiroth.android.library.widget.AbsHListView.LayoutParams;
import it.sephiroth.android.library.widget.AbsHListView.a;
import it.sephiroth.android.library.widget.AbsHListView.j;
import java.util.ArrayList;

@RemoteView
public class HListView extends AbsHListView {
    private static final float aX = 0.33f;
    private static final int aY = 2;
    private static final String aZ = "HListView";
    static final int bc = -1;
    private ArrayList<b> ba;
    private ArrayList<b> bb;
    Drawable bd;
    int be;
    int bf;
    Drawable bg;
    Drawable bh;
    private boolean bi;
    private boolean bj;
    private boolean bk;
    private boolean bl;
    private boolean bm;
    private boolean bn;
    private final Rect bo;
    private Paint bp;
    private final a bq;
    private c br;

    public HListView(Context context) {
        this(context, null);
    }

    public HListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hlv_listViewStyle);
    }

    public HListView(Context context, AttributeSet attributeSet, int i) {
        Object[] textArray;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        int dimensionPixelSize;
        boolean z;
        int i2 = -1;
        boolean z2 = true;
        super(context, attributeSet, i);
        this.ba = new ArrayList();
        this.bb = new ArrayList();
        this.bm = true;
        this.bn = false;
        this.bo = new Rect();
        this.bq = new a(null);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.HListView, i, 0);
        if (obtainStyledAttributes != null) {
            textArray = obtainStyledAttributes.getTextArray(0);
            drawable = obtainStyledAttributes.getDrawable(1);
            drawable2 = obtainStyledAttributes.getDrawable(5);
            drawable3 = obtainStyledAttributes.getDrawable(6);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            z = obtainStyledAttributes.getBoolean(3, true);
            z2 = obtainStyledAttributes.getBoolean(4, true);
            i2 = obtainStyledAttributes.getInteger(7, -1);
            obtainStyledAttributes.recycle();
        } else {
            drawable3 = null;
            drawable2 = null;
            drawable = null;
            textArray = null;
            dimensionPixelSize = 0;
            z = true;
        }
        if (textArray != null) {
            setAdapter(new ArrayAdapter(context, 17367043, textArray));
        }
        if (drawable != null) {
            setDivider(drawable);
        }
        if (drawable2 != null) {
            setOverscrollHeader(drawable2);
        }
        if (drawable3 != null) {
            setOverscrollFooter(drawable3);
        }
        if (dimensionPixelSize != 0) {
            setDividerWidth(dimensionPixelSize);
        }
        this.bk = z;
        this.bl = z2;
        this.bf = i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void D() {
        /*
        r5 = this;
        r0 = 0;
        r2 = r5.getChildCount();
        if (r2 <= 0) goto L_0x0027;
    L_0x0007:
        r1 = r5.af;
        if (r1 != 0) goto L_0x0028;
    L_0x000b:
        r1 = r5.getChildAt(r0);
        r1 = r1.getLeft();
        r2 = r5.M;
        r2 = r2.left;
        r1 = r1 - r2;
        r2 = r5.aw;
        if (r2 == 0) goto L_0x001f;
    L_0x001c:
        r2 = r5.be;
        r1 = r1 - r2;
    L_0x001f:
        if (r1 >= 0) goto L_0x0048;
    L_0x0021:
        if (r0 == 0) goto L_0x0027;
    L_0x0023:
        r0 = -r0;
        r5.e(r0);
    L_0x0027:
        return;
    L_0x0028:
        r1 = r2 + -1;
        r1 = r5.getChildAt(r1);
        r1 = r1.getRight();
        r3 = r5.getWidth();
        r4 = r5.M;
        r4 = r4.right;
        r3 = r3 - r4;
        r1 = r1 - r3;
        r3 = r5.aw;
        r2 = r2 + r3;
        r3 = r5.aP;
        if (r2 >= r3) goto L_0x0046;
    L_0x0043:
        r2 = r5.be;
        r1 = r1 + r2;
    L_0x0046:
        if (r1 > 0) goto L_0x0021;
    L_0x0048:
        r0 = r1;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.D():void");
    }

    private boolean E() {
        return this.aw > 0 || getChildAt(0).getLeft() > getScrollX() + this.M.left;
    }

    private boolean F() {
        int childCount = getChildCount();
        return (childCount + this.aw) + -1 < this.aP + -1 || getChildAt(childCount - 1).getRight() < (getScrollX() + getWidth()) - this.M.right;
    }

    private int a(int i, View view, int i2) {
        view.getDrawingRect(this.bo);
        offsetDescendantRectToMyCoords(view, this.bo);
        int i3;
        if (i != 33) {
            int width = getWidth() - this.M.right;
            if (this.bo.bottom <= width) {
                return 0;
            }
            i3 = this.bo.right - width;
            return i2 < this.aP + -1 ? i3 + getArrowScrollPreviewLength() : i3;
        } else if (this.bo.left >= this.M.left) {
            return 0;
        } else {
            i3 = this.M.left - this.bo.left;
            return i2 > 0 ? i3 + getArrowScrollPreviewLength() : i3;
        }
    }

    private View a(int i, int i2, boolean z, int i3, boolean z2) {
        View c;
        if (!this.aK) {
            c = this.H.c(i);
            if (c != null) {
                a(c, i, i2, z, i3, z2, true);
                return c;
            }
        }
        c = a(i, this.am);
        a(c, i, i2, z, i3, z2, this.am[0]);
        return c;
    }

    private View a(View view, View view2, int i, int i2, int i3) {
        View a;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i4 = this.aN;
        int d = d(i2, horizontalFadingEdgeLength, i4);
        int c = c(i2, horizontalFadingEdgeLength, i4);
        if (i > 0) {
            View a2 = a(i4 - 1, view.getLeft(), true, this.M.top, false);
            int i5 = this.be;
            a = a(i4, a2.getRight() + i5, true, this.M.top, true);
            if (a.getRight() > c) {
                int min = Math.min(Math.min(a.getLeft() - d, a.getRight() - c), (i3 - i2) / 2);
                a2.offsetLeftAndRight(-min);
                a.offsetLeftAndRight(-min);
            }
            if (this.af) {
                i(this.aN + 1, a.getRight() + i5);
                D();
                k(this.aN - 2, a.getLeft() - i5);
            } else {
                k(this.aN - 2, a.getLeft() - i5);
                D();
                i(this.aN + 1, a.getRight() + i5);
            }
        } else if (i < 0) {
            if (view2 != null) {
                a = a(i4, view2.getLeft(), true, this.M.top, true);
            } else {
                a = a(i4, view.getLeft(), false, this.M.top, true);
            }
            if (a.getLeft() < d) {
                a.offsetLeftAndRight(Math.min(Math.min(d - a.getLeft(), c - a.getRight()), (i3 - i2) / 2));
            }
            a(a, i4);
        } else {
            int left = view.getLeft();
            a = a(i4, left, true, this.M.top, true);
            if (left < i2 && a.getRight() < i2 + 20) {
                a.offsetLeftAndRight(i2 - a.getLeft());
            }
            a(a, i4);
        }
        return a;
    }

    private void a(View view, int i) {
        int i2 = this.be;
        if (this.af) {
            i(i + 1, view.getRight() + i2);
            D();
            k(i - 1, view.getLeft() - i2);
            return;
        }
        k(i - 1, view.getLeft() - i2);
        D();
        i(i + 1, i2 + view.getRight());
    }

    private void a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = (LayoutParams) generateDefaultLayoutParams();
            view.setLayoutParams(layoutParams);
        }
        layoutParams.a = this.B.getItemViewType(i);
        layoutParams.c = true;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, this.M.top + this.M.bottom, layoutParams.height);
        int i3 = layoutParams.width;
        view.measure(i3 > 0 ? MeasureSpec.makeMeasureSpec(i3, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    private void a(View view, int i, int i2, boolean z) {
        boolean z2 = true;
        if (i2 == -1) {
            throw new IllegalArgumentException("newSelectedPosition needs to be valid");
        }
        View childAt;
        int i3;
        boolean z3;
        int i4 = this.aN - this.aw;
        int i5 = i2 - this.aw;
        if (i == 33) {
            childAt = getChildAt(i5);
            i3 = i5;
            i5 = i4;
            z3 = true;
        } else {
            childAt = view;
            view = getChildAt(i5);
            i3 = i4;
            z3 = false;
        }
        int childCount = getChildCount();
        if (childAt != null) {
            boolean z4 = !z && z3;
            childAt.setSelected(z4);
            b(childAt, i3, childCount);
        }
        if (view != null) {
            if (z || z3) {
                z2 = false;
            }
            view.setSelected(z2);
            b(view, i5, childCount);
        }
    }

    @TargetApi(11)
    private void a(View view, int i, int i2, boolean z, int i3, boolean z2, boolean z3) {
        int childMeasureSpec;
        boolean z4 = z2 && k();
        Object obj = z4 != view.isSelected() ? 1 : null;
        int i4 = this.aa;
        boolean z5 = i4 > 0 && i4 < 3 && this.S == i;
        Object obj2 = z5 != view.isPressed() ? 1 : null;
        Object obj3 = (z3 && obj == null && !view.isLayoutRequested()) ? null : 1;
        ViewGroup.LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = layoutParams == null ? (LayoutParams) generateDefaultLayoutParams() : layoutParams;
        layoutParams2.a = this.B.getItemViewType(i);
        if ((!z3 || layoutParams2.c) && !(layoutParams2.b && layoutParams2.a == -2)) {
            layoutParams2.c = false;
            if (layoutParams2.a == -2) {
                layoutParams2.b = true;
            }
            addViewInLayout(view, z ? -1 : 0, layoutParams2, true);
        } else {
            attachViewToParent(view, z ? -1 : 0, layoutParams2);
        }
        if (obj != null) {
            view.setSelected(z4);
        }
        if (obj2 != null) {
            view.setPressed(z5);
        }
        if (!(this.t == 0 || this.x == null)) {
            if (view instanceof Checkable) {
                ((Checkable) view).setChecked(((Boolean) this.x.get(i, Boolean.valueOf(false))).booleanValue());
            } else if (VERSION.SDK_INT >= 11) {
                view.setActivated(((Boolean) this.x.get(i, Boolean.valueOf(false))).booleanValue());
            }
        }
        if (obj3 != null) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(this.N, this.M.top + this.M.bottom, layoutParams2.height);
            i4 = layoutParams2.width;
            view.measure(i4 > 0 ? MeasureSpec.makeMeasureSpec(i4, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
        } else {
            cleanupLayoutState(view);
        }
        i4 = view.getMeasuredWidth();
        childMeasureSpec = view.getMeasuredHeight();
        if (!z) {
            i2 -= i4;
        }
        if (obj3 != null) {
            view.layout(i2, i3, i4 + i2, childMeasureSpec + i3);
        } else {
            view.offsetLeftAndRight(i2 - view.getLeft());
            view.offsetTopAndBottom(i3 - view.getTop());
        }
        if (this.Q && !view.isDrawingCacheEnabled()) {
            view.setDrawingCacheEnabled(true);
        }
        if (VERSION.SDK_INT >= 11 && z3 && ((LayoutParams) view.getLayoutParams()).d != i) {
            view.jumpDrawablesToCurrentState();
        }
    }

    private void a(View view, ArrayList<b> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((b) arrayList.get(i)).a == view) {
                arrayList.remove(i);
                return;
            }
        }
    }

    private void a(ArrayList<b> arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) ((b) arrayList.get(i)).a.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.b = false;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(11)
    private boolean a(int r9, int r10, android.view.KeyEvent r11) {
        /*
        r8 = this;
        r7 = 2;
        r6 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r5 = 33;
        r1 = 0;
        r2 = 1;
        r0 = r8.B;
        if (r0 == 0) goto L_0x000f;
    L_0x000b:
        r0 = r8.ap;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r0 = r8.aK;
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        r8.h();
    L_0x0017:
        r0 = android.os.Build.VERSION.SDK_INT;
        r3 = 11;
        if (r0 < r3) goto L_0x000f;
    L_0x001d:
        r4 = r11.getAction();
        if (r4 == r2) goto L_0x0026;
    L_0x0023:
        switch(r9) {
            case 19: goto L_0x002b;
            case 20: goto L_0x005b;
            case 21: goto L_0x008b;
            case 22: goto L_0x0098;
            case 23: goto L_0x00a5;
            case 62: goto L_0x00c3;
            case 66: goto L_0x00a5;
            case 92: goto L_0x00eb;
            case 93: goto L_0x011b;
            case 122: goto L_0x014b;
            case 123: goto L_0x0163;
            default: goto L_0x0026;
        };
    L_0x0026:
        r0 = r1;
    L_0x0027:
        if (r0 == 0) goto L_0x017b;
    L_0x0029:
        r1 = r2;
        goto L_0x000f;
    L_0x002b:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x0045;
    L_0x0031:
        r0 = r8.r();
        if (r0 != 0) goto L_0x0027;
    L_0x0037:
        r3 = r10;
    L_0x0038:
        r10 = r3 + -1;
        if (r3 <= 0) goto L_0x0027;
    L_0x003c:
        r3 = r8.q(r5);
        if (r3 == 0) goto L_0x0027;
    L_0x0042:
        r0 = r2;
        r3 = r10;
        goto L_0x0038;
    L_0x0045:
        r0 = r11.hasModifiers(r7);
        if (r0 == 0) goto L_0x0026;
    L_0x004b:
        r0 = r8.r();
        if (r0 != 0) goto L_0x0057;
    L_0x0051:
        r0 = r8.p(r5);
        if (r0 == 0) goto L_0x0059;
    L_0x0057:
        r0 = r2;
        goto L_0x0027;
    L_0x0059:
        r0 = r1;
        goto L_0x0027;
    L_0x005b:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x0075;
    L_0x0061:
        r0 = r8.r();
        if (r0 != 0) goto L_0x0027;
    L_0x0067:
        r3 = r10;
    L_0x0068:
        r10 = r3 + -1;
        if (r3 <= 0) goto L_0x0027;
    L_0x006c:
        r3 = r8.q(r6);
        if (r3 == 0) goto L_0x0027;
    L_0x0072:
        r0 = r2;
        r3 = r10;
        goto L_0x0068;
    L_0x0075:
        r0 = r11.hasModifiers(r7);
        if (r0 == 0) goto L_0x0026;
    L_0x007b:
        r0 = r8.r();
        if (r0 != 0) goto L_0x0087;
    L_0x0081:
        r0 = r8.p(r6);
        if (r0 == 0) goto L_0x0089;
    L_0x0087:
        r0 = r2;
        goto L_0x0027;
    L_0x0089:
        r0 = r1;
        goto L_0x0027;
    L_0x008b:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x0026;
    L_0x0091:
        r0 = 17;
        r0 = r8.m(r0);
        goto L_0x0027;
    L_0x0098:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x0026;
    L_0x009e:
        r0 = 66;
        r0 = r8.m(r0);
        goto L_0x0027;
    L_0x00a5:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x0026;
    L_0x00ab:
        r0 = r8.r();
        if (r0 != 0) goto L_0x0027;
    L_0x00b1:
        r3 = r11.getRepeatCount();
        if (r3 != 0) goto L_0x0027;
    L_0x00b7:
        r3 = r8.getChildCount();
        if (r3 <= 0) goto L_0x0027;
    L_0x00bd:
        r8.l();
        r0 = r2;
        goto L_0x0027;
    L_0x00c3:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x00d8;
    L_0x00c9:
        r0 = r8.r();
        if (r0 != 0) goto L_0x00d5;
    L_0x00cf:
        r0 = r8.o(r6);
        if (r0 == 0) goto L_0x00d5;
    L_0x00d5:
        r0 = r2;
        goto L_0x0027;
    L_0x00d8:
        r0 = r11.hasModifiers(r2);
        if (r0 == 0) goto L_0x00d5;
    L_0x00de:
        r0 = r8.r();
        if (r0 != 0) goto L_0x00d5;
    L_0x00e4:
        r0 = r8.o(r5);
        if (r0 == 0) goto L_0x00d5;
    L_0x00ea:
        goto L_0x00d5;
    L_0x00eb:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x0103;
    L_0x00f1:
        r0 = r8.r();
        if (r0 != 0) goto L_0x00fd;
    L_0x00f7:
        r0 = r8.o(r5);
        if (r0 == 0) goto L_0x0100;
    L_0x00fd:
        r0 = r2;
        goto L_0x0027;
    L_0x0100:
        r0 = r1;
        goto L_0x0027;
    L_0x0103:
        r0 = r11.hasModifiers(r7);
        if (r0 == 0) goto L_0x0026;
    L_0x0109:
        r0 = r8.r();
        if (r0 != 0) goto L_0x0115;
    L_0x010f:
        r0 = r8.p(r5);
        if (r0 == 0) goto L_0x0118;
    L_0x0115:
        r0 = r2;
        goto L_0x0027;
    L_0x0118:
        r0 = r1;
        goto L_0x0027;
    L_0x011b:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x0133;
    L_0x0121:
        r0 = r8.r();
        if (r0 != 0) goto L_0x012d;
    L_0x0127:
        r0 = r8.o(r6);
        if (r0 == 0) goto L_0x0130;
    L_0x012d:
        r0 = r2;
        goto L_0x0027;
    L_0x0130:
        r0 = r1;
        goto L_0x0027;
    L_0x0133:
        r0 = r11.hasModifiers(r7);
        if (r0 == 0) goto L_0x0026;
    L_0x0139:
        r0 = r8.r();
        if (r0 != 0) goto L_0x0145;
    L_0x013f:
        r0 = r8.p(r6);
        if (r0 == 0) goto L_0x0148;
    L_0x0145:
        r0 = r2;
        goto L_0x0027;
    L_0x0148:
        r0 = r1;
        goto L_0x0027;
    L_0x014b:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x0026;
    L_0x0151:
        r0 = r8.r();
        if (r0 != 0) goto L_0x015d;
    L_0x0157:
        r0 = r8.p(r5);
        if (r0 == 0) goto L_0x0160;
    L_0x015d:
        r0 = r2;
        goto L_0x0027;
    L_0x0160:
        r0 = r1;
        goto L_0x0027;
    L_0x0163:
        r0 = r11.hasNoModifiers();
        if (r0 == 0) goto L_0x0026;
    L_0x0169:
        r0 = r8.r();
        if (r0 != 0) goto L_0x0175;
    L_0x016f:
        r0 = r8.p(r6);
        if (r0 == 0) goto L_0x0178;
    L_0x0175:
        r0 = r2;
        goto L_0x0027;
    L_0x0178:
        r0 = r1;
        goto L_0x0027;
    L_0x017b:
        switch(r4) {
            case 0: goto L_0x0180;
            case 1: goto L_0x0186;
            case 2: goto L_0x018c;
            default: goto L_0x017e;
        };
    L_0x017e:
        goto L_0x000f;
    L_0x0180:
        r1 = super.onKeyDown(r9, r11);
        goto L_0x000f;
    L_0x0186:
        r1 = super.onKeyUp(r9, r11);
        goto L_0x000f;
    L_0x018c:
        r1 = super.onKeyMultiple(r9, r10, r11);
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.a(int, int, android.view.KeyEvent):boolean");
    }

    private View b(int i, int i2, int i3) {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i4 = this.aN;
        int d = d(i2, horizontalFadingEdgeLength, i4);
        int c = c(i3, horizontalFadingEdgeLength, i4);
        View a = a(i4, i, true, this.M.top, true);
        if (a.getRight() > c) {
            a.offsetLeftAndRight(-Math.min(a.getLeft() - d, a.getRight() - c));
        } else if (a.getLeft() < d) {
            a.offsetLeftAndRight(Math.min(d - a.getLeft(), c - a.getRight()));
        }
        a(a, i4);
        if (this.af) {
            l(getChildCount());
        } else {
            k(getChildCount());
        }
        return a;
    }

    private View b(View view, int i) {
        int i2 = i - 1;
        View a = a(i2, this.am);
        a(a, i2, view.getLeft() - this.be, false, this.M.top, false, this.am[0]);
        return a;
    }

    private void b(View view, int i, int i2) {
        int width = view.getWidth();
        i(view);
        if (view.getMeasuredWidth() != width) {
            j(view);
            int measuredWidth = view.getMeasuredWidth() - width;
            for (width = i + 1; width < i2; width++) {
                getChildAt(width).offsetLeftAndRight(measuredWidth);
            }
        }
    }

    private boolean b(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        boolean z = (parent instanceof ViewGroup) && b((View) parent, view2);
        return z;
    }

    private int c(int i, int i2, int i3) {
        return i3 != this.aP + -1 ? i - i2 : i;
    }

    private View c(View view, int i) {
        int i2 = i + 1;
        View a = a(i2, this.am);
        a(a, i2, this.be + view.getRight(), true, this.M.top, false, this.am[0]);
        return a;
    }

    private int d(int i, int i2, int i3) {
        return i3 > 0 ? i + i2 : i;
    }

    private View g(View view) {
        HListView parent = view.getParent();
        while ((parent instanceof View) && parent != this) {
            View view2 = parent;
            parent = parent.getParent();
            view = view2;
        }
        return !(parent instanceof View) ? null : view;
    }

    private int getArrowScrollPreviewLength() {
        return Math.max(2, getHorizontalFadingEdgeLength());
    }

    private boolean h(View view) {
        int i;
        ArrayList arrayList = this.ba;
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            if (view == ((b) arrayList.get(i)).a) {
                return true;
            }
        }
        arrayList = this.bb;
        size = arrayList.size();
        for (i = 0; i < size; i++) {
            if (view == ((b) arrayList.get(i)).a) {
                return true;
            }
        }
        return false;
    }

    private View i(int i, int i2) {
        View view = null;
        int right = getRight() - getLeft();
        int i3 = i2;
        int i4 = i;
        while (i3 < right && i4 < this.aP) {
            boolean z = i4 == this.aN;
            View a = a(i4, i3, true, this.M.top, z);
            i3 = a.getRight() + this.be;
            if (!z) {
                a = view;
            }
            i4++;
            view = a;
        }
        h(this.aw, (this.aw + getChildCount()) - 1);
        return view;
    }

    private void i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -1);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.N, this.M.top + this.M.bottom, layoutParams.height);
        int i = layoutParams.width;
        view.measure(i > 0 ? MeasureSpec.makeMeasureSpec(i, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    private View j(int i) {
        this.aw = Math.min(this.aw, this.aN);
        this.aw = Math.min(this.aw, this.aP - 1);
        if (this.aw < 0) {
            this.aw = 0;
        }
        return i(this.aw, i);
    }

    private void j(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i = this.M.top;
        measuredHeight += i;
        int left = view.getLeft();
        view.layout(left, i, measuredWidth + left, measuredHeight);
    }

    private int k(View view) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (b(view, getChildAt(i))) {
                return i + this.aw;
            }
        }
        throw new IllegalArgumentException("newFocus is not a child of any of the children of the list!");
    }

    private View k(int i, int i2) {
        View view = null;
        int i3 = i2;
        int i4 = i;
        while (i3 > 0 && i4 >= 0) {
            boolean z = i4 == this.aN;
            View a = a(i4, i3, false, this.M.top, z);
            i3 = a.getLeft() - this.be;
            if (!z) {
                a = view;
            }
            i4--;
            view = a;
        }
        this.aw = i4 + 1;
        h(this.aw, (this.aw + getChildCount()) - 1);
        return view;
    }

    private void k(int i) {
        if ((this.aw + i) - 1 == this.aP - 1 && i > 0) {
            int right = ((getRight() - getLeft()) - this.M.right) - getChildAt(i - 1).getRight();
            View childAt = getChildAt(0);
            int left = childAt.getLeft();
            if (right <= 0) {
                return;
            }
            if (this.aw > 0 || left < this.M.top) {
                if (this.aw == 0) {
                    right = Math.min(right, this.M.top - left);
                }
                e(right);
                if (this.aw > 0) {
                    k(this.aw - 1, childAt.getLeft() - this.be);
                    D();
                }
            }
        }
    }

    private int l(View view) {
        view.getDrawingRect(this.bo);
        offsetDescendantRectToMyCoords(view, this.bo);
        int right = (getRight() - getLeft()) - this.M.right;
        return this.bo.right < this.M.left ? this.M.left - this.bo.right : this.bo.left > right ? this.bo.left - right : 0;
    }

    private View l(int i, int i2) {
        int i3 = i2 - i;
        int p = p();
        View a = a(p, i, true, this.M.top, true);
        this.aw = p;
        int measuredWidth = a.getMeasuredWidth();
        if (measuredWidth <= i3) {
            a.offsetLeftAndRight((i3 - measuredWidth) / 2);
        }
        a(a, p);
        if (this.af) {
            l(getChildCount());
        } else {
            k(getChildCount());
        }
        return a;
    }

    private void l(int i) {
        if (this.aw == 0 && i > 0) {
            int right = (getRight() - getLeft()) - this.M.right;
            int left = getChildAt(0).getLeft() - this.M.left;
            View childAt = getChildAt(i - 1);
            int right2 = childAt.getRight();
            int i2 = (this.aw + i) - 1;
            if (left <= 0) {
                return;
            }
            if (i2 < this.aP - 1 || right2 > right) {
                if (i2 == this.aP - 1) {
                    left = Math.min(left, right2 - right);
                }
                e(-left);
                if (i2 < this.aP - 1) {
                    i(i2 + 1, childAt.getRight() + this.be);
                    D();
                }
            } else if (i2 == this.aP - 1) {
                D();
            }
        }
    }

    private View m(int i, int i2) {
        View i3;
        View k;
        boolean z = i == this.aN;
        View a = a(i, i2, true, this.M.top, z);
        this.aw = i;
        int i4 = this.be;
        if (this.af) {
            i3 = i(i + 1, a.getRight() + i4);
            D();
            k = k(i - 1, a.getLeft() - i4);
            i4 = getChildCount();
            if (i4 > 0) {
                l(i4);
            }
        } else {
            k = k(i - 1, a.getLeft() - i4);
            D();
            i3 = i(i + 1, i4 + a.getRight());
            i4 = getChildCount();
            if (i4 > 0) {
                k(i4);
            }
        }
        return z ? a : k != null ? k : i3;
    }

    private boolean m(int i) {
        if (i == 17 || i == 66) {
            int childCount = getChildCount();
            if (this.bn && childCount > 0 && this.aN != -1) {
                View selectedView = getSelectedView();
                if (selectedView != null && selectedView.hasFocus() && (selectedView instanceof ViewGroup)) {
                    View findFocus = selectedView.findFocus();
                    selectedView = FocusFinder.getInstance().findNextFocus((ViewGroup) selectedView, findFocus, i);
                    if (selectedView != null) {
                        findFocus.getFocusedRect(this.bo);
                        offsetDescendantRectToMyCoords(findFocus, this.bo);
                        offsetRectIntoDescendantCoords(selectedView, this.bo);
                        if (selectedView.requestFocus(i, this.bo)) {
                            return true;
                        }
                    }
                    selectedView = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus, i);
                    if (selectedView != null) {
                        return b(selectedView, (View) this);
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("direction must be one of {View.FOCUS_LEFT, View.FOCUS_RIGHT}");
    }

    private int n(int i, int i2) {
        int width = getWidth() - this.M.right;
        int i3 = this.M.left;
        int childCount = getChildCount();
        int i4;
        if (i == 130) {
            i4 = childCount - 1;
            if (i2 != -1) {
                i4 = i2 - this.aw;
            }
            i3 = this.aw + i4;
            View childAt = getChildAt(i4);
            i4 = i3 < this.aP + -1 ? width - getArrowScrollPreviewLength() : width;
            if (childAt.getRight() <= i4) {
                return 0;
            }
            if (i2 != -1 && i4 - childAt.getLeft() >= getMaxScrollAmount()) {
                return 0;
            }
            i4 = childAt.getRight() - i4;
            if (this.aw + childCount == this.aP) {
                i4 = Math.min(i4, getChildAt(childCount - 1).getRight() - width);
            }
            return Math.min(i4, getMaxScrollAmount());
        }
        i4 = i2 != -1 ? i2 - this.aw : 0;
        width = this.aw + i4;
        View childAt2 = getChildAt(i4);
        i4 = width > 0 ? getArrowScrollPreviewLength() + i3 : i3;
        if (childAt2.getLeft() >= i4) {
            return 0;
        }
        if (i2 != -1 && childAt2.getRight() - i4 >= getMaxScrollAmount()) {
            return 0;
        }
        i4 -= childAt2.getLeft();
        if (this.aw == 0) {
            i4 = Math.min(i4, i3 - getChildAt(0).getLeft());
        }
        return Math.min(i4, getMaxScrollAmount());
    }

    private boolean n(int i) {
        if (getChildCount() <= 0) {
            return false;
        }
        View selectedView;
        int i2;
        View findFocus;
        View selectedView2 = getSelectedView();
        int i3 = this.aN;
        int r = r(i);
        int n = n(i, r);
        a s = this.bn ? s(i) : null;
        if (s != null) {
            r = s.a();
            n = s.b();
        }
        boolean z = s != null;
        if (r != -1) {
            a(selectedView2, i, r, s != null);
            setSelectedPositionInt(r);
            setNextSelectedPositionInt(r);
            selectedView = getSelectedView();
            if (this.bn && s == null) {
                View focusedChild = getFocusedChild();
                if (focusedChild != null) {
                    focusedChild.clearFocus();
                }
            }
            y();
            z = true;
            i2 = r;
        } else {
            int i4 = i3;
            selectedView = selectedView2;
            i2 = i4;
        }
        if (n > 0) {
            t(i == 33 ? n : -n);
            z = true;
        }
        if (this.bn && s == null && selectedView != null && selectedView.hasFocus()) {
            findFocus = selectedView.findFocus();
            if (!b(findFocus, (View) this) || l(findFocus) > 0) {
                findFocus.clearFocus();
            }
        }
        if (r != -1 || selectedView == null || b(selectedView, (View) this)) {
            findFocus = selectedView;
        } else {
            o();
            this.ai = -1;
            findFocus = null;
        }
        if (!z) {
            return false;
        }
        if (findFocus != null) {
            a(i2, findFocus);
            this.ae = findFocus.getLeft();
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        c();
        return true;
    }

    private int r(int i) {
        int i2 = this.aw;
        int i3;
        int lastVisiblePosition;
        if (i == 130) {
            i3 = this.aN != -1 ? this.aN + 1 : i2;
            if (i3 >= this.B.getCount()) {
                return -1;
            }
            if (i3 < i2) {
                i3 = i2;
            }
            lastVisiblePosition = getLastVisiblePosition();
            ListAdapter adapter = getAdapter();
            while (i3 <= lastVisiblePosition) {
                if (adapter.isEnabled(i3) && getChildAt(i3 - i2).getVisibility() == 0) {
                    return i3;
                }
                i3++;
            }
        } else {
            i3 = (getChildCount() + i2) - 1;
            lastVisiblePosition = this.aN != -1 ? this.aN - 1 : (getChildCount() + i2) - 1;
            if (lastVisiblePosition < 0 || lastVisiblePosition >= this.B.getCount()) {
                return -1;
            }
            if (lastVisiblePosition <= i3) {
                i3 = lastVisiblePosition;
            }
            ListAdapter adapter2 = getAdapter();
            while (i3 >= i2) {
                if (adapter2.isEnabled(i3) && getChildAt(i3 - i2).getVisibility() == 0) {
                    return i3;
                }
                i3--;
            }
        }
        return -1;
    }

    private a s(int i) {
        View findNextFocusFromRect;
        int i2 = 1;
        View selectedView = getSelectedView();
        if (selectedView == null || !selectedView.hasFocus()) {
            if (i == 130) {
                if (this.aw <= 0) {
                    i2 = 0;
                }
                i2 = (i2 != 0 ? getArrowScrollPreviewLength() : 0) + this.M.left;
                if (selectedView != null && selectedView.getLeft() > i2) {
                    i2 = selectedView.getLeft();
                }
                this.bo.set(i2, 0, i2, 0);
            } else {
                if ((this.aw + getChildCount()) - 1 >= this.aP) {
                    i2 = 0;
                }
                i2 = (getWidth() - this.M.right) - (i2 != 0 ? getArrowScrollPreviewLength() : 0);
                if (selectedView != null && selectedView.getRight() < i2) {
                    i2 = selectedView.getRight();
                }
                this.bo.set(i2, 0, i2, 0);
            }
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, this.bo, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, selectedView.findFocus(), i);
        }
        if (findNextFocusFromRect != null) {
            int r;
            int k = k(findNextFocusFromRect);
            if (!(this.aN == -1 || k == this.aN)) {
                r = r(i);
                if (r != -1 && ((i == 130 && r < k) || (i == 33 && r > k))) {
                    return null;
                }
            }
            r = a(i, findNextFocusFromRect, k);
            int maxScrollAmount = getMaxScrollAmount();
            if (r < maxScrollAmount) {
                findNextFocusFromRect.requestFocus(i);
                this.bq.a(k, r);
                return this.bq;
            } else if (l(findNextFocusFromRect) < maxScrollAmount) {
                findNextFocusFromRect.requestFocus(i);
                this.bq.a(k, maxScrollAmount);
                return this.bq;
            }
        }
        return null;
    }

    private void t(int i) {
        e(i);
        int width = getWidth() - this.M.right;
        int i2 = this.M.left;
        j jVar = this.H;
        int childCount;
        View childAt;
        View childAt2;
        if (i < 0) {
            childCount = getChildCount();
            childAt = getChildAt(childCount - 1);
            while (childAt.getRight() < width) {
                int i3 = (this.aw + childCount) - 1;
                if (i3 >= this.aP - 1) {
                    break;
                }
                childAt = c(childAt, i3);
                childCount++;
            }
            if (childAt.getBottom() < width) {
                e(width - childAt.getRight());
            }
            childAt2 = getChildAt(0);
            while (childAt2.getRight() < i2) {
                if (jVar.b(((LayoutParams) childAt2.getLayoutParams()).a)) {
                    detachViewFromParent(childAt2);
                    jVar.a(childAt2, this.aw);
                } else {
                    removeViewInLayout(childAt2);
                }
                childAt = getChildAt(0);
                this.aw++;
                childAt2 = childAt;
            }
            return;
        }
        childAt = getChildAt(0);
        while (childAt.getLeft() > i2 && this.aw > 0) {
            childAt = b(childAt, this.aw);
            this.aw--;
        }
        if (childAt.getLeft() > i2) {
            e(i2 - childAt.getLeft());
        }
        childCount = getChildCount() - 1;
        i2 = childCount;
        childAt2 = getChildAt(childCount);
        while (childAt2.getLeft() > width) {
            if (jVar.b(((LayoutParams) childAt2.getLayoutParams()).a)) {
                detachViewFromParent(childAt2);
                jVar.a(childAt2, this.aw + i2);
            } else {
                removeViewInLayout(childAt2);
            }
            childCount = i2 - 1;
            i2 = childCount;
            childAt2 = getChildAt(childCount);
        }
    }

    @ExportedProperty(category = "list")
    protected boolean B() {
        return true;
    }

    public void C() {
        int size = this.ba.size();
        if (size > 0) {
            this.aL = 0;
        } else if (this.B != null) {
            setSelection(size);
        } else {
            this.aL = size;
            this.z = 2;
        }
    }

    final int a(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        ListAdapter listAdapter = this.B;
        if (listAdapter == null) {
            return this.M.left + this.M.right;
        }
        int i7 = this.M.left + this.M.right;
        int i8 = (this.be <= 0 || this.bd == null) ? 0 : this.be;
        if (i3 == -1) {
            i3 = listAdapter.getCount() - 1;
        }
        j jVar = this.H;
        boolean B = B();
        boolean[] zArr = this.am;
        while (i2 <= i3) {
            View a = a(i2, zArr);
            a(a, i2, i);
            int i9 = i2 > 0 ? i7 + i8 : i7;
            if (B && jVar.b(((LayoutParams) a.getLayoutParams()).a)) {
                jVar.a(a, -1);
            }
            i7 = a.getMeasuredWidth() + i9;
            if (i7 >= i4) {
                return (i5 < 0 || i2 <= i5 || i6 <= 0 || i7 == i4) ? i4 : i6;
            } else {
                if (i5 >= 0 && i2 >= i5) {
                    i6 = i7;
                }
                i2++;
            }
        }
        return i7;
    }

    void a(Canvas canvas, Rect rect, int i) {
        Drawable drawable = this.bd;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }

    void a(Canvas canvas, Drawable drawable, Rect rect) {
        int minimumWidth = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        if (rect.right - rect.left < minimumWidth) {
            rect.left = rect.right - minimumWidth;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    public void a(View view, Object obj, boolean z) {
        if (this.B == null || (this.B instanceof c)) {
            b bVar = new b();
            bVar.a = view;
            bVar.b = obj;
            bVar.c = z;
            this.ba.add(bVar);
            if (this.B != null && this.A != null) {
                this.A.onChanged();
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot add header view to list -- setAdapter has already been called.");
    }

    protected void a(boolean z) {
        int i = 0;
        int childCount = getChildCount();
        if (z) {
            if (childCount > 0) {
                i = getChildAt(childCount - 1).getRight() + this.be;
            }
            i(childCount + this.aw, i);
            k(getChildCount());
            return;
        }
        k(this.aw - 1, childCount > 0 ? getChildAt(0).getLeft() - this.be : getWidth() - 0);
        l(getChildCount());
    }

    final int[] a(int i, int i2, int i3, int i4, int i5, int i6) {
        ListAdapter listAdapter = this.B;
        if (listAdapter == null) {
            return new int[]{this.M.left + this.M.right, this.M.top + this.M.bottom};
        }
        int i7 = this.M.left + this.M.right;
        int i8 = this.M.top + this.M.bottom;
        int i9 = (this.be <= 0 || this.bd == null) ? 0 : this.be;
        if (i3 == -1) {
            i3 = listAdapter.getCount() - 1;
        }
        j jVar = this.H;
        boolean B = B();
        boolean[] zArr = this.am;
        int i10 = 0;
        int i11 = 0;
        while (i2 <= i3) {
            View a = a(i2, zArr);
            a(a, i2, i);
            if (B && jVar.b(((LayoutParams) a.getLayoutParams()).a)) {
                jVar.a(a, -1);
            }
            i10 = Math.max(i10, a.getMeasuredWidth() + i9);
            i2++;
            i11 = Math.max(i11, a.getMeasuredHeight());
        }
        i11 += i8;
        return new int[]{Math.min(i10 + i7, i4), Math.min(i11, i5)};
    }

    protected int b(int i, boolean z) {
        ListAdapter listAdapter = this.B;
        if (listAdapter == null || isInTouchMode()) {
            return -1;
        }
        int count = listAdapter.getCount();
        if (this.bm) {
            return (i < 0 || i >= count) ? -1 : i;
        } else {
            if (z) {
                i = Math.max(0, i);
                while (i < count && !listAdapter.isEnabled(i)) {
                    i++;
                }
            } else {
                i = Math.min(i, count - 1);
                while (i >= 0 && !listAdapter.isEnabled(i)) {
                    i--;
                }
            }
            return (i < 0 || i >= count) ? -1 : i;
        }
    }

    void b(Canvas canvas, Drawable drawable, Rect rect) {
        int minimumWidth = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        if (rect.right - rect.left < minimumWidth) {
            rect.right = minimumWidth + rect.left;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    public void b(View view) {
        a(view, null, true);
    }

    public void b(View view, Object obj, boolean z) {
        b bVar = new b();
        bVar.a = view;
        bVar.b = obj;
        bVar.c = z;
        this.bb.add(bVar);
        if (this.B != null && this.A != null) {
            this.A.onChanged();
        }
    }

    public void c(int i) {
        super.c(i);
    }

    public boolean c(View view) {
        if (this.ba.size() <= 0) {
            return false;
        }
        boolean z;
        if (this.B == null || !((c) this.B).a(view)) {
            z = false;
        } else {
            if (this.A != null) {
                this.A.onChanged();
            }
            z = true;
        }
        a(view, this.ba);
        return z;
    }

    protected boolean canAnimate() {
        return super.canAnimate() && this.aP > 0;
    }

    public void d(int i) {
        super.d(i);
    }

    public void d(View view) {
        b(view, null, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void dispatchDraw(android.graphics.Canvas r26) {
        /*
        r25 = this;
        r0 = r25;
        r2 = r0.Q;
        if (r2 == 0) goto L_0x000b;
    L_0x0006:
        r2 = 1;
        r0 = r25;
        r0.R = r2;
    L_0x000b:
        r0 = r25;
        r8 = r0.be;
        r0 = r25;
        r9 = r0.bg;
        r0 = r25;
        r10 = r0.bh;
        if (r9 == 0) goto L_0x0140;
    L_0x0019:
        r2 = 1;
        r7 = r2;
    L_0x001b:
        if (r10 == 0) goto L_0x0144;
    L_0x001d:
        r2 = 1;
        r6 = r2;
    L_0x001f:
        if (r8 <= 0) goto L_0x0148;
    L_0x0021:
        r0 = r25;
        r2 = r0.bd;
        if (r2 == 0) goto L_0x0148;
    L_0x0027:
        r2 = 1;
        r5 = r2;
    L_0x0029:
        if (r5 != 0) goto L_0x002f;
    L_0x002b:
        if (r7 != 0) goto L_0x002f;
    L_0x002d:
        if (r6 == 0) goto L_0x018d;
    L_0x002f:
        r0 = r25;
        r11 = r0.bo;
        r2 = r25.getPaddingTop();
        r11.top = r2;
        r2 = r25.getBottom();
        r3 = r25.getTop();
        r2 = r2 - r3;
        r3 = r25.getPaddingBottom();
        r2 = r2 - r3;
        r11.bottom = r2;
        r12 = r25.getChildCount();
        r0 = r25;
        r2 = r0.ba;
        r13 = r2.size();
        r0 = r25;
        r14 = r0.aP;
        r0 = r25;
        r2 = r0.bb;
        r2 = r2.size();
        r2 = r14 - r2;
        r15 = r2 + -1;
        r0 = r25;
        r0 = r0.bk;
        r16 = r0;
        r0 = r25;
        r0 = r0.bl;
        r17 = r0;
        r0 = r25;
        r0 = r0.aw;
        r18 = r0;
        r0 = r25;
        r0 = r0.bm;
        r19 = r0;
        r0 = r25;
        r0 = r0.B;
        r20 = r0;
        r2 = r25.isOpaque();
        if (r2 == 0) goto L_0x014c;
    L_0x0089:
        r2 = super.isOpaque();
        if (r2 != 0) goto L_0x014c;
    L_0x008f:
        r2 = 1;
        r4 = r2;
    L_0x0091:
        if (r4 == 0) goto L_0x00b3;
    L_0x0093:
        r0 = r25;
        r2 = r0.bp;
        if (r2 != 0) goto L_0x00b3;
    L_0x0099:
        r0 = r25;
        r2 = r0.bi;
        if (r2 == 0) goto L_0x00b3;
    L_0x009f:
        r2 = new android.graphics.Paint;
        r2.<init>();
        r0 = r25;
        r0.bp = r2;
        r0 = r25;
        r2 = r0.bp;
        r3 = r25.getCacheColorHint();
        r2.setColor(r3);
    L_0x00b3:
        r0 = r25;
        r0 = r0.bp;
        r21 = r0;
        r3 = 0;
        r2 = 0;
        r22 = r25.getRight();
        r23 = r25.getLeft();
        r22 = r22 - r23;
        r2 = r22 - r2;
        r22 = r25.getScrollX();
        r22 = r22 + r2;
        r0 = r25;
        r2 = r0.af;
        if (r2 != 0) goto L_0x0191;
    L_0x00d3:
        r3 = 0;
        r2 = r25.getScrollX();
        if (r12 <= 0) goto L_0x00ea;
    L_0x00da:
        if (r2 >= 0) goto L_0x00ea;
    L_0x00dc:
        if (r7 == 0) goto L_0x0150;
    L_0x00de:
        r7 = 0;
        r11.right = r7;
        r11.left = r2;
        r0 = r25;
        r1 = r26;
        r0.a(r1, r9, r11);
    L_0x00ea:
        r2 = 0;
        r24 = r2;
        r2 = r3;
        r3 = r24;
    L_0x00f0:
        if (r3 >= r12) goto L_0x0171;
    L_0x00f2:
        if (r16 != 0) goto L_0x00f8;
    L_0x00f4:
        r7 = r18 + r3;
        if (r7 < r13) goto L_0x013d;
    L_0x00f8:
        if (r17 != 0) goto L_0x00fe;
    L_0x00fa:
        r7 = r18 + r3;
        if (r7 >= r15) goto L_0x013d;
    L_0x00fe:
        r0 = r25;
        r2 = r0.getChildAt(r3);
        r2 = r2.getRight();
        if (r5 == 0) goto L_0x013d;
    L_0x010a:
        r0 = r22;
        if (r2 >= r0) goto L_0x013d;
    L_0x010e:
        if (r6 == 0) goto L_0x0114;
    L_0x0110:
        r7 = r12 + -1;
        if (r3 == r7) goto L_0x013d;
    L_0x0114:
        if (r19 != 0) goto L_0x0130;
    L_0x0116:
        r7 = r18 + r3;
        r0 = r20;
        r7 = r0.isEnabled(r7);
        if (r7 == 0) goto L_0x0161;
    L_0x0120:
        r7 = r12 + -1;
        if (r3 == r7) goto L_0x0130;
    L_0x0124:
        r7 = r18 + r3;
        r7 = r7 + 1;
        r0 = r20;
        r7 = r0.isEnabled(r7);
        if (r7 == 0) goto L_0x0161;
    L_0x0130:
        r11.left = r2;
        r7 = r2 + r8;
        r11.right = r7;
        r0 = r25;
        r1 = r26;
        r0.a(r1, r11, r3);
    L_0x013d:
        r3 = r3 + 1;
        goto L_0x00f0;
    L_0x0140:
        r2 = 0;
        r7 = r2;
        goto L_0x001b;
    L_0x0144:
        r2 = 0;
        r6 = r2;
        goto L_0x001f;
    L_0x0148:
        r2 = 0;
        r5 = r2;
        goto L_0x0029;
    L_0x014c:
        r2 = 0;
        r4 = r2;
        goto L_0x0091;
    L_0x0150:
        if (r5 == 0) goto L_0x00ea;
    L_0x0152:
        r2 = 0;
        r11.right = r2;
        r2 = -r8;
        r11.left = r2;
        r2 = -1;
        r0 = r25;
        r1 = r26;
        r0.a(r1, r11, r2);
        goto L_0x00ea;
    L_0x0161:
        if (r4 == 0) goto L_0x013d;
    L_0x0163:
        r11.left = r2;
        r7 = r2 + r8;
        r11.right = r7;
        r0 = r26;
        r1 = r21;
        r0.drawRect(r11, r1);
        goto L_0x013d;
    L_0x0171:
        r3 = r25.getRight();
        r4 = r25.getScrollX();
        r3 = r3 + r4;
        if (r6 == 0) goto L_0x018d;
    L_0x017c:
        r4 = r18 + r12;
        if (r4 != r14) goto L_0x018d;
    L_0x0180:
        if (r3 <= r2) goto L_0x018d;
    L_0x0182:
        r11.left = r2;
        r11.right = r3;
        r0 = r25;
        r1 = r26;
        r0.b(r1, r10, r11);
    L_0x018d:
        super.dispatchDraw(r26);
        return;
    L_0x0191:
        r14 = r25.getScrollX();
        if (r12 <= 0) goto L_0x01af;
    L_0x0197:
        if (r7 == 0) goto L_0x01af;
    L_0x0199:
        r11.left = r14;
        r2 = 0;
        r0 = r25;
        r2 = r0.getChildAt(r2);
        r2 = r2.getLeft();
        r11.right = r2;
        r0 = r25;
        r1 = r26;
        r0.a(r1, r9, r11);
    L_0x01af:
        if (r7 == 0) goto L_0x01fa;
    L_0x01b1:
        r2 = 1;
    L_0x01b2:
        if (r2 >= r12) goto L_0x020c;
    L_0x01b4:
        if (r16 != 0) goto L_0x01ba;
    L_0x01b6:
        r7 = r18 + r2;
        if (r7 < r13) goto L_0x01f7;
    L_0x01ba:
        if (r17 != 0) goto L_0x01c0;
    L_0x01bc:
        r7 = r18 + r2;
        if (r7 >= r15) goto L_0x01f7;
    L_0x01c0:
        r0 = r25;
        r7 = r0.getChildAt(r2);
        r7 = r7.getLeft();
        if (r7 <= r3) goto L_0x01f7;
    L_0x01cc:
        if (r19 != 0) goto L_0x01e8;
    L_0x01ce:
        r9 = r18 + r2;
        r0 = r20;
        r9 = r0.isEnabled(r9);
        if (r9 == 0) goto L_0x01fc;
    L_0x01d8:
        r9 = r12 + -1;
        if (r2 == r9) goto L_0x01e8;
    L_0x01dc:
        r9 = r18 + r2;
        r9 = r9 + 1;
        r0 = r20;
        r9 = r0.isEnabled(r9);
        if (r9 == 0) goto L_0x01fc;
    L_0x01e8:
        r9 = r7 - r8;
        r11.left = r9;
        r11.right = r7;
        r7 = r2 + -1;
        r0 = r25;
        r1 = r26;
        r0.a(r1, r11, r7);
    L_0x01f7:
        r2 = r2 + 1;
        goto L_0x01b2;
    L_0x01fa:
        r2 = 0;
        goto L_0x01b2;
    L_0x01fc:
        if (r4 == 0) goto L_0x01f7;
    L_0x01fe:
        r9 = r7 - r8;
        r11.left = r9;
        r11.right = r7;
        r0 = r26;
        r1 = r21;
        r0.drawRect(r11, r1);
        goto L_0x01f7;
    L_0x020c:
        if (r12 <= 0) goto L_0x018d;
    L_0x020e:
        if (r14 <= 0) goto L_0x018d;
    L_0x0210:
        if (r6 == 0) goto L_0x0224;
    L_0x0212:
        r2 = r25.getRight();
        r11.left = r2;
        r2 = r2 + r14;
        r11.right = r2;
        r0 = r25;
        r1 = r26;
        r0.b(r1, r10, r11);
        goto L_0x018d;
    L_0x0224:
        if (r5 == 0) goto L_0x018d;
    L_0x0226:
        r0 = r22;
        r11.left = r0;
        r2 = r22 + r8;
        r11.right = r2;
        r2 = -1;
        r0 = r25;
        r1 = r26;
        r0.a(r1, r11, r2);
        goto L_0x018d;
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.dispatchDraw(android.graphics.Canvas):void");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        return (dispatchKeyEvent || getFocusedChild() == null || keyEvent.getAction() != 0) ? dispatchKeyEvent : onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.R) {
            this.R = false;
        }
        return drawChild;
    }

    public boolean e(View view) {
        if (this.bb.size() <= 0) {
            return false;
        }
        boolean z;
        if (this.B == null || !((c) this.B).b(view)) {
            z = false;
        } else {
            if (this.A != null) {
                this.A.onChanged();
            }
            z = true;
        }
        a(view, this.bb);
        return z;
    }

    protected int f(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i2;
            if (this.af) {
                for (i2 = childCount - 1; i2 >= 0; i2--) {
                    if (i >= getChildAt(i2).getLeft()) {
                        return i2 + this.aw;
                    }
                }
            } else {
                for (i2 = 0; i2 < childCount; i2++) {
                    if (i <= getChildAt(i2).getRight()) {
                        return i2 + this.aw;
                    }
                }
            }
        }
        return -1;
    }

    public int[] f(View view) {
        i(view);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        return new int[]{measuredWidth, measuredHeight};
    }

    protected void g() {
        a(this.ba);
        a(this.bb);
        super.g();
        this.z = 0;
    }

    public ListAdapter getAdapter() {
        return this.B;
    }

    @Deprecated
    public long[] getCheckItemIds() {
        if (this.B != null && this.B.hasStableIds()) {
            return getCheckedItemIds();
        }
        if (this.t == 0 || this.x == null || this.B == null) {
            return new long[0];
        }
        SparseArrayCompat sparseArrayCompat = this.x;
        int size = sparseArrayCompat.size();
        Object obj = new long[size];
        ListAdapter listAdapter = this.B;
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3;
            if (((Boolean) sparseArrayCompat.valueAt(i)).booleanValue()) {
                i3 = i2 + 1;
                obj[i2] = listAdapter.getItemId(sparseArrayCompat.keyAt(i));
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        if (i2 == size) {
            return obj;
        }
        Object obj2 = new long[i2];
        System.arraycopy(obj, 0, obj2, 0, i2);
        return obj2;
    }

    public Drawable getDivider() {
        return this.bd;
    }

    public int getDividerWidth() {
        return this.be;
    }

    public int getFooterViewsCount() {
        return this.bb.size();
    }

    public int getHeaderViewsCount() {
        return this.ba.size();
    }

    public boolean getItemsCanFocus() {
        return this.bn;
    }

    public int getMaxScrollAmount() {
        return (int) (aX * ((float) (getRight() - getLeft())));
    }

    public Drawable getOverscrollFooter() {
        return this.bh;
    }

    public Drawable getOverscrollHeader() {
        return this.bg;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void h() {
        /*
        r17 = this;
        r0 = r17;
        r10 = r0.aW;
        if (r10 != 0) goto L_0x0024;
    L_0x0006:
        r1 = 1;
        r0 = r17;
        r0.aW = r1;
        super.h();	 Catch:{ all -> 0x0103 }
        r17.invalidate();	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.B;	 Catch:{ all -> 0x0103 }
        if (r1 != 0) goto L_0x0025;
    L_0x0017:
        r17.g();	 Catch:{ all -> 0x0103 }
        r17.c();	 Catch:{ all -> 0x0103 }
        if (r10 != 0) goto L_0x0024;
    L_0x001f:
        r1 = 0;
        r0 = r17;
        r0.aW = r1;
    L_0x0024:
        return;
    L_0x0025:
        r0 = r17;
        r1 = r0.M;	 Catch:{ all -> 0x0103 }
        r5 = r1.left;	 Catch:{ all -> 0x0103 }
        r1 = r17.getRight();	 Catch:{ all -> 0x0103 }
        r2 = r17.getLeft();	 Catch:{ all -> 0x0103 }
        r1 = r1 - r2;
        r0 = r17;
        r2 = r0.M;	 Catch:{ all -> 0x0103 }
        r2 = r2.right;	 Catch:{ all -> 0x0103 }
        r6 = r1 - r2;
        r11 = r17.getChildCount();	 Catch:{ all -> 0x0103 }
        r4 = 0;
        r2 = 0;
        r1 = 0;
        r3 = 0;
        r7 = 0;
        r0 = r17;
        r8 = r0.z;	 Catch:{ all -> 0x0103 }
        switch(r8) {
            case 1: goto L_0x00b0;
            case 2: goto L_0x009b;
            case 3: goto L_0x00b0;
            case 4: goto L_0x00b0;
            case 5: goto L_0x00b0;
            default: goto L_0x004c;
        };	 Catch:{ all -> 0x0103 }
    L_0x004c:
        r0 = r17;
        r1 = r0.aN;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r3 = r0.aw;	 Catch:{ all -> 0x0103 }
        r3 = r1 - r3;
        if (r3 < 0) goto L_0x0060;
    L_0x0058:
        if (r3 >= r11) goto L_0x0060;
    L_0x005a:
        r0 = r17;
        r2 = r0.getChildAt(r3);	 Catch:{ all -> 0x0103 }
    L_0x0060:
        r1 = 0;
        r0 = r17;
        r1 = r0.getChildAt(r1);	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r8 = r0.aL;	 Catch:{ all -> 0x0103 }
        if (r8 < 0) goto L_0x0076;
    L_0x006d:
        r0 = r17;
        r4 = r0.aL;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r8 = r0.aN;	 Catch:{ all -> 0x0103 }
        r4 = r4 - r8;
    L_0x0076:
        r3 = r3 + r4;
        r0 = r17;
        r3 = r0.getChildAt(r3);	 Catch:{ all -> 0x0103 }
        r9 = r1;
    L_0x007e:
        r0 = r17;
        r12 = r0.aK;	 Catch:{ all -> 0x0103 }
        if (r12 == 0) goto L_0x0087;
    L_0x0084:
        r17.u();	 Catch:{ all -> 0x0103 }
    L_0x0087:
        r0 = r17;
        r1 = r0.aP;	 Catch:{ all -> 0x0103 }
        if (r1 != 0) goto L_0x00b2;
    L_0x008d:
        r17.g();	 Catch:{ all -> 0x0103 }
        r17.c();	 Catch:{ all -> 0x0103 }
        if (r10 != 0) goto L_0x0024;
    L_0x0095:
        r1 = 0;
        r0 = r17;
        r0.aW = r1;
        goto L_0x0024;
    L_0x009b:
        r0 = r17;
        r8 = r0.aL;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r9 = r0.aw;	 Catch:{ all -> 0x0103 }
        r8 = r8 - r9;
        if (r8 < 0) goto L_0x033c;
    L_0x00a6:
        if (r8 >= r11) goto L_0x033c;
    L_0x00a8:
        r0 = r17;
        r3 = r0.getChildAt(r8);	 Catch:{ all -> 0x0103 }
        r9 = r1;
        goto L_0x007e;
    L_0x00b0:
        r9 = r1;
        goto L_0x007e;
    L_0x00b2:
        r0 = r17;
        r1 = r0.aP;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r8 = r0.B;	 Catch:{ all -> 0x0103 }
        r8 = r8.getCount();	 Catch:{ all -> 0x0103 }
        if (r1 == r8) goto L_0x010c;
    L_0x00c0:
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0103 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0103 }
        r2.<init>();	 Catch:{ all -> 0x0103 }
        r3 = "The content of the adapter has changed but ListView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in ListView(";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0103 }
        r3 = r17.getId();	 Catch:{ all -> 0x0103 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0103 }
        r3 = ", ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0103 }
        r3 = r17.getClass();	 Catch:{ all -> 0x0103 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0103 }
        r3 = ") with Adapter(";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r3 = r0.B;	 Catch:{ all -> 0x0103 }
        r3 = r3.getClass();	 Catch:{ all -> 0x0103 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0103 }
        r3 = ")]";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0103 }
        r2 = r2.toString();	 Catch:{ all -> 0x0103 }
        r1.<init>(r2);	 Catch:{ all -> 0x0103 }
        throw r1;	 Catch:{ all -> 0x0103 }
    L_0x0103:
        r1 = move-exception;
        if (r10 != 0) goto L_0x010b;
    L_0x0106:
        r2 = 0;
        r0 = r17;
        r0.aW = r2;
    L_0x010b:
        throw r1;
    L_0x010c:
        r0 = r17;
        r1 = r0.aL;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r0.setSelectedPositionInt(r1);	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r13 = r0.aw;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r14 = r0.H;	 Catch:{ all -> 0x0103 }
        r1 = 0;
        if (r12 == 0) goto L_0x0131;
    L_0x0120:
        r8 = 0;
    L_0x0121:
        if (r8 >= r11) goto L_0x0134;
    L_0x0123:
        r0 = r17;
        r15 = r0.getChildAt(r8);	 Catch:{ all -> 0x0103 }
        r16 = r13 + r8;
        r14.a(r15, r16);	 Catch:{ all -> 0x0103 }
        r8 = r8 + 1;
        goto L_0x0121;
    L_0x0131:
        r14.a(r11, r13);	 Catch:{ all -> 0x0103 }
    L_0x0134:
        r8 = r17.getFocusedChild();	 Catch:{ all -> 0x0103 }
        if (r8 == 0) goto L_0x0338;
    L_0x013a:
        if (r12 == 0) goto L_0x0144;
    L_0x013c:
        r0 = r17;
        r12 = r0.h(r8);	 Catch:{ all -> 0x0103 }
        if (r12 == 0) goto L_0x014e;
    L_0x0144:
        r7 = r17.findFocus();	 Catch:{ all -> 0x0103 }
        if (r7 == 0) goto L_0x014d;
    L_0x014a:
        r7.onStartTemporaryDetach();	 Catch:{ all -> 0x0103 }
    L_0x014d:
        r1 = r8;
    L_0x014e:
        r17.requestFocus();	 Catch:{ all -> 0x0103 }
        r8 = r7;
        r7 = r1;
    L_0x0153:
        r17.detachAllViewsFromParent();	 Catch:{ all -> 0x0103 }
        r14.d();	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.z;	 Catch:{ all -> 0x0103 }
        switch(r1) {
            case 1: goto L_0x0247;
            case 2: goto L_0x020c;
            case 3: goto L_0x0235;
            case 4: goto L_0x0258;
            case 5: goto L_0x0224;
            case 6: goto L_0x0269;
            default: goto L_0x0160;
        };	 Catch:{ all -> 0x0103 }
    L_0x0160:
        if (r11 != 0) goto L_0x0293;
    L_0x0162:
        r0 = r17;
        r1 = r0.af;	 Catch:{ all -> 0x0103 }
        if (r1 != 0) goto L_0x0272;
    L_0x0168:
        r1 = 0;
        r2 = 1;
        r0 = r17;
        r1 = r0.b(r1, r2);	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r0.setSelectedPositionInt(r1);	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.j(r5);	 Catch:{ all -> 0x0103 }
        r2 = r1;
    L_0x017c:
        r14.e();	 Catch:{ all -> 0x0103 }
        if (r2 == 0) goto L_0x02f7;
    L_0x0181:
        r0 = r17;
        r1 = r0.bn;	 Catch:{ all -> 0x0103 }
        if (r1 == 0) goto L_0x02ef;
    L_0x0187:
        r1 = r17.hasFocus();	 Catch:{ all -> 0x0103 }
        if (r1 == 0) goto L_0x02ef;
    L_0x018d:
        r1 = r2.hasFocus();	 Catch:{ all -> 0x0103 }
        if (r1 != 0) goto L_0x02ef;
    L_0x0193:
        if (r2 != r7) goto L_0x019d;
    L_0x0195:
        if (r8 == 0) goto L_0x019d;
    L_0x0197:
        r1 = r8.requestFocus();	 Catch:{ all -> 0x0103 }
        if (r1 != 0) goto L_0x01a3;
    L_0x019d:
        r1 = r2.requestFocus();	 Catch:{ all -> 0x0103 }
        if (r1 == 0) goto L_0x02df;
    L_0x01a3:
        r1 = 1;
    L_0x01a4:
        if (r1 != 0) goto L_0x02e2;
    L_0x01a6:
        r1 = r17.getFocusedChild();	 Catch:{ all -> 0x0103 }
        if (r1 == 0) goto L_0x01af;
    L_0x01ac:
        r1.clearFocus();	 Catch:{ all -> 0x0103 }
    L_0x01af:
        r1 = -1;
        r0 = r17;
        r0.a(r1, r2);	 Catch:{ all -> 0x0103 }
    L_0x01b5:
        r1 = r2.getLeft();	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r0.ae = r1;	 Catch:{ all -> 0x0103 }
    L_0x01bd:
        if (r8 == 0) goto L_0x01c8;
    L_0x01bf:
        r1 = r8.getWindowToken();	 Catch:{ all -> 0x0103 }
        if (r1 == 0) goto L_0x01c8;
    L_0x01c5:
        r8.onFinishTemporaryDetach();	 Catch:{ all -> 0x0103 }
    L_0x01c8:
        r1 = 0;
        r0 = r17;
        r0.z = r1;	 Catch:{ all -> 0x0103 }
        r1 = 0;
        r0 = r17;
        r0.aK = r1;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.al;	 Catch:{ all -> 0x0103 }
        if (r1 == 0) goto L_0x01e6;
    L_0x01d8:
        r0 = r17;
        r1 = r0.al;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r0.post(r1);	 Catch:{ all -> 0x0103 }
        r1 = 0;
        r0 = r17;
        r0.al = r1;	 Catch:{ all -> 0x0103 }
    L_0x01e6:
        r1 = 0;
        r0 = r17;
        r0.aB = r1;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.aN;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r0.setNextSelectedPositionInt(r1);	 Catch:{ all -> 0x0103 }
        r17.i();	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.aP;	 Catch:{ all -> 0x0103 }
        if (r1 <= 0) goto L_0x0200;
    L_0x01fd:
        r17.y();	 Catch:{ all -> 0x0103 }
    L_0x0200:
        r17.c();	 Catch:{ all -> 0x0103 }
        if (r10 != 0) goto L_0x0024;
    L_0x0205:
        r1 = 0;
        r0 = r17;
        r0.aW = r1;
        goto L_0x0024;
    L_0x020c:
        if (r3 == 0) goto L_0x021b;
    L_0x020e:
        r1 = r3.getLeft();	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.b(r1, r5, r6);	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x021b:
        r0 = r17;
        r1 = r0.l(r5, r6);	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x0224:
        r0 = r17;
        r1 = r0.ay;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r2 = r0.ax;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.m(r1, r2);	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x0235:
        r0 = r17;
        r1 = r0.aP;	 Catch:{ all -> 0x0103 }
        r1 = r1 + -1;
        r0 = r17;
        r1 = r0.k(r1, r6);	 Catch:{ all -> 0x0103 }
        r17.D();	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x0247:
        r1 = 0;
        r0 = r17;
        r0.aw = r1;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.j(r5);	 Catch:{ all -> 0x0103 }
        r17.D();	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x0258:
        r1 = r17.p();	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r2 = r0.ax;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.m(r1, r2);	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x0269:
        r1 = r17;
        r1 = r1.a(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x0272:
        r0 = r17;
        r1 = r0.aP;	 Catch:{ all -> 0x0103 }
        r1 = r1 + -1;
        r2 = 0;
        r0 = r17;
        r1 = r0.b(r1, r2);	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r0.setSelectedPositionInt(r1);	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.aP;	 Catch:{ all -> 0x0103 }
        r1 = r1 + -1;
        r0 = r17;
        r1 = r0.k(r1, r6);	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x0293:
        r0 = r17;
        r1 = r0.aN;	 Catch:{ all -> 0x0103 }
        if (r1 < 0) goto L_0x02b7;
    L_0x0299:
        r0 = r17;
        r1 = r0.aN;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r3 = r0.aP;	 Catch:{ all -> 0x0103 }
        if (r1 >= r3) goto L_0x02b7;
    L_0x02a3:
        r0 = r17;
        r1 = r0.aN;	 Catch:{ all -> 0x0103 }
        if (r2 != 0) goto L_0x02b2;
    L_0x02a9:
        r0 = r17;
        r1 = r0.m(r1, r5);	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x02b2:
        r5 = r2.getLeft();	 Catch:{ all -> 0x0103 }
        goto L_0x02a9;
    L_0x02b7:
        r0 = r17;
        r1 = r0.aw;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r2 = r0.aP;	 Catch:{ all -> 0x0103 }
        if (r1 >= r2) goto L_0x02d5;
    L_0x02c1:
        r0 = r17;
        r1 = r0.aw;	 Catch:{ all -> 0x0103 }
        if (r9 != 0) goto L_0x02d0;
    L_0x02c7:
        r0 = r17;
        r1 = r0.m(r1, r5);	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x02d0:
        r5 = r9.getLeft();	 Catch:{ all -> 0x0103 }
        goto L_0x02c7;
    L_0x02d5:
        r1 = 0;
        r0 = r17;
        r1 = r0.m(r1, r5);	 Catch:{ all -> 0x0103 }
        r2 = r1;
        goto L_0x017c;
    L_0x02df:
        r1 = 0;
        goto L_0x01a4;
    L_0x02e2:
        r1 = 0;
        r2.setSelected(r1);	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.G;	 Catch:{ all -> 0x0103 }
        r1.setEmpty();	 Catch:{ all -> 0x0103 }
        goto L_0x01b5;
    L_0x02ef:
        r1 = -1;
        r0 = r17;
        r0.a(r1, r2);	 Catch:{ all -> 0x0103 }
        goto L_0x01b5;
    L_0x02f7:
        r0 = r17;
        r1 = r0.aa;	 Catch:{ all -> 0x0103 }
        if (r1 <= 0) goto L_0x032b;
    L_0x02fd:
        r0 = r17;
        r1 = r0.aa;	 Catch:{ all -> 0x0103 }
        r2 = 3;
        if (r1 >= r2) goto L_0x032b;
    L_0x0304:
        r0 = r17;
        r1 = r0.S;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r2 = r0.aw;	 Catch:{ all -> 0x0103 }
        r1 = r1 - r2;
        r0 = r17;
        r1 = r0.getChildAt(r1);	 Catch:{ all -> 0x0103 }
        if (r1 == 0) goto L_0x031e;
    L_0x0315:
        r0 = r17;
        r2 = r0.S;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r0.a(r2, r1);	 Catch:{ all -> 0x0103 }
    L_0x031e:
        r1 = r17.hasFocus();	 Catch:{ all -> 0x0103 }
        if (r1 == 0) goto L_0x01bd;
    L_0x0324:
        if (r8 == 0) goto L_0x01bd;
    L_0x0326:
        r8.requestFocus();	 Catch:{ all -> 0x0103 }
        goto L_0x01bd;
    L_0x032b:
        r1 = 0;
        r0 = r17;
        r0.ae = r1;	 Catch:{ all -> 0x0103 }
        r0 = r17;
        r1 = r0.G;	 Catch:{ all -> 0x0103 }
        r1.setEmpty();	 Catch:{ all -> 0x0103 }
        goto L_0x031e;
    L_0x0338:
        r8 = r7;
        r7 = r1;
        goto L_0x0153;
    L_0x033c:
        r9 = r1;
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.h():void");
    }

    public boolean isOpaque() {
        boolean z = (this.R && this.bi && this.bj) || super.isOpaque();
        if (z) {
            int paddingLeft = this.M != null ? this.M.left : getPaddingLeft();
            View childAt = getChildAt(0);
            if (childAt == null || childAt.getLeft() > paddingLeft) {
                return false;
            }
            paddingLeft = getWidth() - (this.M != null ? this.M.right : getPaddingRight());
            childAt = getChildAt(getChildCount() - 1);
            if (childAt == null || childAt.getRight() < paddingLeft) {
                return false;
            }
        }
        return z;
    }

    public void j(int i, int i2) {
        if (this.B != null) {
            if (isInTouchMode()) {
                this.ai = i;
            } else {
                i = b(i, true);
                if (i >= 0) {
                    setNextSelectedPositionInt(i);
                }
            }
            if (i >= 0) {
                this.z = 4;
                this.ax = this.M.left + i2;
                if (this.aB) {
                    this.ay = i;
                    this.az = this.B.getItemId(i);
                }
                if (this.ad != null) {
                    this.ad.a();
                }
                requestLayout();
            }
        }
    }

    boolean o(int i) {
        int max;
        boolean z;
        if (i == 33) {
            max = Math.max(0, (this.aN - getChildCount()) - 1);
            z = false;
        } else if (i == 130) {
            max = Math.min(this.aP - 1, (this.aN + getChildCount()) - 1);
            z = true;
        } else {
            max = -1;
            z = false;
        }
        if (max >= 0) {
            max = b(max, z);
            if (max >= 0) {
                this.z = 4;
                this.ax = getPaddingLeft() + getHorizontalFadingEdgeLength();
                if (z && max > this.aP - getChildCount()) {
                    this.z = 3;
                }
                if (!z && max < getChildCount()) {
                    this.z = 1;
                }
                setSelectionInt(max);
                c();
                if (awakenScrollBars()) {
                    return true;
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                b(getChildAt(i));
            }
            removeAllViews();
        }
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = 0;
        super.onFocusChanged(z, i, rect);
        ListAdapter listAdapter = this.B;
        int i3 = -1;
        if (!(listAdapter == null || !z || rect == null)) {
            rect.offset(getScrollX(), getScrollY());
            if (listAdapter.getCount() < getChildCount() + this.aw) {
                this.z = 0;
                h();
            }
            Rect rect2 = this.bo;
            int i4 = Integer.MAX_VALUE;
            int childCount = getChildCount();
            int i5 = this.aw;
            int i6 = 0;
            while (i6 < childCount) {
                int a;
                if (listAdapter.isEnabled(i5 + i6)) {
                    View childAt = getChildAt(i6);
                    childAt.getDrawingRect(rect2);
                    offsetDescendantRectToMyCoords(childAt, rect2);
                    a = AbsHListView.a(rect, rect2, i);
                    if (a < i4) {
                        i2 = i6;
                        i4 = a;
                        a = childAt.getLeft();
                    } else {
                        a = i2;
                        i2 = i3;
                    }
                } else {
                    a = i2;
                    i2 = i3;
                }
                i6++;
                i3 = i2;
                i2 = a;
            }
        }
        if (i3 >= 0) {
            j(this.aw + i3, i2);
        } else {
            requestLayout();
        }
    }

    public void onGlobalLayout() {
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(HListView.class.getName());
    }

    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(HListView.class.getName());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return a(i, 1, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return a(i, i2, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return a(i, 1, keyEvent);
    }

    @TargetApi(11)
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        this.aP = this.B == null ? 0 : this.B.getCount();
        if (this.aP > 0 && (mode == 0 || mode2 == 0)) {
            View a = a(0, this.am);
            a(a, 0, i2);
            i3 = a.getMeasuredWidth();
            i4 = a.getMeasuredHeight();
            if (VERSION.SDK_INT >= 11) {
                i5 = combineMeasuredStates(0, a.getMeasuredState());
            }
            if (B() && this.H.b(((LayoutParams) a.getLayoutParams()).a)) {
                this.H.a(a, -1);
            }
        }
        int i6 = i3;
        mode2 = mode2 == 0 ? (i4 + (this.M.top + this.M.bottom)) + getHorizontalScrollbarHeight() : (mode2 != Integer.MIN_VALUE || this.aP <= 0 || this.bf <= -1) ? VERSION.SDK_INT >= 11 ? size2 | (ViewCompat.MEASURED_STATE_MASK & i5) : size2 : a(i2, this.bf, this.bf, size, size2, -1)[1];
        if (mode == 0) {
            size = ((this.M.left + this.M.right) + i6) + (getHorizontalFadingEdgeLength() * 2);
        }
        if (mode == Integer.MIN_VALUE) {
            size = a(i2, 0, -1, size, -1);
        }
        setMeasuredDimension(size, mode2);
        this.N = i2;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                int indexOfChild = this.aw + indexOfChild(focusedChild);
                int left = focusedChild.getLeft() - Math.max(0, focusedChild.getRight() - (i - getPaddingLeft()));
                if (this.br == null) {
                    this.br = new c(this, null);
                }
                post(this.br.a(indexOfChild, left));
            }
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    boolean p(int i) {
        boolean z = true;
        int b;
        if (i == 33) {
            if (this.aN != 0) {
                b = b(0, true);
                if (b >= 0) {
                    this.z = 1;
                    setSelectionInt(b);
                    c();
                }
            }
            z = false;
        } else {
            if (i == 130 && this.aN < this.aP - 1) {
                b = b(this.aP - 1, true);
                if (b >= 0) {
                    this.z = 3;
                    setSelectionInt(b);
                    c();
                }
            }
            z = false;
        }
        if (z && !awakenScrollBars()) {
            awakenScrollBars();
            invalidate();
        }
        return z;
    }

    boolean q(int i) {
        try {
            this.aG = true;
            boolean n = n(i);
            if (n) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            this.aG = false;
            return n;
        } catch (Throwable th) {
            this.aG = false;
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        int i = rect.left;
        rect.offset(view.getLeft(), view.getTop());
        rect.offset(-view.getScrollX(), -view.getScrollY());
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = scrollX + width;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (E() && (this.aN > 0 || i > horizontalFadingEdgeLength)) {
            scrollX += horizontalFadingEdgeLength;
        }
        i = getChildAt(getChildCount() - 1).getRight();
        if (F() && (this.aN < this.aP - 1 || rect.right < i - horizontalFadingEdgeLength)) {
            i2 -= horizontalFadingEdgeLength;
        }
        if (rect.right > i2 && rect.left > scrollX) {
            i2 = Math.min(rect.width() > width ? (rect.left - scrollX) + 0 : (rect.right - i2) + 0, i - i2);
        } else if (rect.left >= scrollX || rect.right >= i2) {
            i2 = 0;
        } else {
            i2 = Math.max(rect.width() > width ? 0 - (i2 - rect.right) : 0 - (scrollX - rect.left), getChildAt(0).getLeft() - scrollX);
        }
        boolean z2 = i2 != 0;
        if (z2) {
            t(-i2);
            a(-1, view);
            this.ae = view.getTop();
            invalidate();
        }
        return z2;
    }

    public void setAdapter(ListAdapter listAdapter) {
        if (!(this.B == null || this.A == null)) {
            this.B.unregisterDataSetObserver(this.A);
        }
        g();
        this.H.b();
        if (this.ba.size() > 0 || this.bb.size() > 0) {
            this.B = new c(this.ba, this.bb, listAdapter);
        } else {
            this.B = listAdapter;
        }
        this.aU = -1;
        this.aV = Long.MIN_VALUE;
        super.setAdapter(listAdapter);
        if (this.B != null) {
            this.bm = this.B.areAllItemsEnabled();
            this.aQ = this.aP;
            this.aP = this.B.getCount();
            w();
            this.A = new a(this);
            this.B.registerDataSetObserver(this.A);
            this.H.a(this.B.getViewTypeCount());
            int b = this.af ? b(this.aP - 1, false) : b(0, true);
            setSelectedPositionInt(b);
            setNextSelectedPositionInt(b);
            if (this.aP == 0) {
                y();
            }
        } else {
            this.bm = true;
            w();
            y();
        }
        requestLayout();
    }

    public void setCacheColorHint(int i) {
        boolean z = (i >>> 24) == 255;
        this.bi = z;
        if (z) {
            if (this.bp == null) {
                this.bp = new Paint();
            }
            this.bp.setColor(i);
        }
        super.setCacheColorHint(i);
    }

    public void setDivider(Drawable drawable) {
        boolean z = false;
        if (drawable != null) {
            this.be = drawable.getIntrinsicWidth();
        } else {
            this.be = 0;
        }
        this.bd = drawable;
        if (drawable == null || drawable.getOpacity() == -1) {
            z = true;
        }
        this.bj = z;
        requestLayout();
        invalidate();
    }

    public void setDividerWidth(int i) {
        this.be = i;
        requestLayout();
        invalidate();
    }

    public void setFooterDividersEnabled(boolean z) {
        this.bl = z;
        invalidate();
    }

    public void setHeaderDividersEnabled(boolean z) {
        this.bk = z;
        invalidate();
    }

    public void setItemsCanFocus(boolean z) {
        this.bn = z;
        if (!z) {
            setDescendantFocusability(393216);
        }
    }

    public void setOverscrollFooter(Drawable drawable) {
        this.bh = drawable;
        invalidate();
    }

    public void setOverscrollHeader(Drawable drawable) {
        this.bg = drawable;
        if (getScrollX() < 0) {
            invalidate();
        }
    }

    public void setSelection(int i) {
        j(i, 0);
    }

    public void setSelectionInt(int i) {
        Object obj = 1;
        setNextSelectedPositionInt(i);
        int i2 = this.aN;
        if (i2 < 0 || !(i == i2 - 1 || i == i2 + 1)) {
            obj = null;
        }
        if (this.ad != null) {
            this.ad.a();
        }
        h();
        if (obj != null) {
            awakenScrollBars();
        }
    }
}
