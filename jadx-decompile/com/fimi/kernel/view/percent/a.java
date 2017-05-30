package com.fimi.kernel.view.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.fimi.kernel.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a {
    private static final String a = "PercentLayout";
    private static final String c = "^(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)%([wh]?)$";
    private final ViewGroup b;

    public interface b {
        a a();
    }

    public static class a {
        public a a;
        public a b;
        public a c;
        public a d;
        public a e;
        public a f;
        public a g;
        public a h;
        public a i;
        public a j;
        public a k;
        public a l;
        public a m;
        public a n;
        public a o;
        public a p;
        public a q;
        final MarginLayoutParams r = new MarginLayoutParams(0, 0);

        public static class a {
            public float a = -1.0f;
            public boolean b;

            public a(float f, boolean z) {
                this.a = f;
                this.b = z;
            }

            public String toString() {
                return "PercentVal{percent=" + this.a + ", isBaseWidth=" + this.b + '}';
            }
        }

        public void a(LayoutParams layoutParams) {
            layoutParams.width = this.r.width;
            layoutParams.height = this.r.height;
        }

        public void a(LayoutParams layoutParams, int i, int i2) {
            this.r.width = layoutParams.width;
            this.r.height = layoutParams.height;
            if (this.a != null) {
                layoutParams.width = (int) (((float) (this.a.b ? i : i2)) * this.a.a);
            }
            if (this.b != null) {
                if (!this.b.b) {
                    i = i2;
                }
                layoutParams.height = (int) (((float) i) * this.b.a);
            }
        }

        public void a(MarginLayoutParams marginLayoutParams) {
            a((LayoutParams) marginLayoutParams);
            marginLayoutParams.leftMargin = this.r.leftMargin;
            marginLayoutParams.topMargin = this.r.topMargin;
            marginLayoutParams.rightMargin = this.r.rightMargin;
            marginLayoutParams.bottomMargin = this.r.bottomMargin;
            MarginLayoutParamsCompat.setMarginStart(marginLayoutParams, MarginLayoutParamsCompat.getMarginStart(this.r));
            MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, MarginLayoutParamsCompat.getMarginEnd(this.r));
        }

        public void a(MarginLayoutParams marginLayoutParams, int i, int i2) {
            a((LayoutParams) marginLayoutParams, i, i2);
            this.r.leftMargin = marginLayoutParams.leftMargin;
            this.r.topMargin = marginLayoutParams.topMargin;
            this.r.rightMargin = marginLayoutParams.rightMargin;
            this.r.bottomMargin = marginLayoutParams.bottomMargin;
            MarginLayoutParamsCompat.setMarginStart(this.r, MarginLayoutParamsCompat.getMarginStart(marginLayoutParams));
            MarginLayoutParamsCompat.setMarginEnd(this.r, MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams));
            if (this.c != null) {
                marginLayoutParams.leftMargin = (int) (((float) (this.c.b ? i : i2)) * this.c.a);
            }
            if (this.d != null) {
                marginLayoutParams.topMargin = (int) (((float) (this.d.b ? i : i2)) * this.d.a);
            }
            if (this.e != null) {
                marginLayoutParams.rightMargin = (int) (((float) (this.e.b ? i : i2)) * this.e.a);
            }
            if (this.f != null) {
                marginLayoutParams.bottomMargin = (int) (((float) (this.f.b ? i : i2)) * this.f.a);
            }
            if (this.g != null) {
                MarginLayoutParamsCompat.setMarginStart(marginLayoutParams, (int) (((float) (this.g.b ? i : i2)) * this.g.a));
            }
            if (this.h != null) {
                if (!this.h.b) {
                    i = i2;
                }
                MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, (int) (((float) i) * this.h.a));
            }
            if (Log.isLoggable(a.a, 3)) {
                Log.d(a.a, "after fillMarginLayoutParams: (" + marginLayoutParams.width + ", " + marginLayoutParams.height + ")");
            }
        }

        public String toString() {
            return "PercentLayoutInfo{widthPercent=" + this.a + ", heightPercent=" + this.b + ", leftMarginPercent=" + this.c + ", topMarginPercent=" + this.d + ", rightMarginPercent=" + this.e + ", bottomMarginPercent=" + this.f + ", startMarginPercent=" + this.g + ", endMarginPercent=" + this.h + ", textSizePercent=" + this.i + ", maxWidthPercent=" + this.j + ", maxHeightPercent=" + this.k + ", minWidthPercent=" + this.l + ", minHeightPercent=" + this.m + ", paddingLeftPercent=" + this.n + ", paddingRightPercent=" + this.o + ", paddingTopPercent=" + this.p + ", paddingBottomPercent=" + this.q + ", mPreservedParams=" + this.r + '}';
        }
    }

    public a(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    private static a a(TypedArray typedArray, int i, boolean z) {
        return a(typedArray.getString(i), z);
    }

    private static a a(String str, boolean z) {
        boolean z2 = true;
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(c).matcher(str);
        if (matcher.matches()) {
            int length = str.length();
            String group = matcher.group(1);
            String substring = str.substring(length - 1);
            float parseFloat = Float.parseFloat(group) / 100.0f;
            if ((!z || substring.equals("h")) && !substring.equals("w")) {
                z2 = false;
            }
            return new a(parseFloat, z2);
        }
        throw new RuntimeException("the value of layout_xxxPercent invalid! ==>" + str);
    }

    public static a a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PercentLayout_Layout);
        a e = e(obtainStyledAttributes, c(obtainStyledAttributes, b(obtainStyledAttributes, d(obtainStyledAttributes, a(obtainStyledAttributes, null)))));
        Log.d(a, "constructed: " + e);
        obtainStyledAttributes.recycle();
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "constructed: " + e);
        }
        return e;
    }

    private static a a(TypedArray typedArray, a aVar) {
        a a = a(typedArray, R.styleable.PercentLayout_Layout_layout_widthPercent, true);
        if (a != null) {
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "percent width: " + a.a);
            }
            aVar = a(aVar);
            aVar.a = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_heightPercent, false);
        if (a == null) {
            return aVar;
        }
        if (Log.isLoggable(a, 2)) {
            Log.v(a, "percent height: " + a.a);
        }
        aVar = a(aVar);
        aVar.b = a;
        return aVar;
    }

    @NonNull
    private static a a(a aVar) {
        return aVar != null ? aVar : new a();
    }

    private void a(int i, int i2, View view, a aVar) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        a aVar2 = aVar.n;
        if (aVar2 != null) {
            paddingLeft = (int) (((float) (aVar2.b ? i : i2)) * aVar2.a);
        }
        aVar2 = aVar.o;
        if (aVar2 != null) {
            paddingRight = (int) (((float) (aVar2.b ? i : i2)) * aVar2.a);
        }
        aVar2 = aVar.p;
        if (aVar2 != null) {
            paddingTop = (int) (((float) (aVar2.b ? i : i2)) * aVar2.a);
        }
        aVar2 = aVar.q;
        if (aVar2 != null) {
            if (!aVar2.b) {
                i = i2;
            }
            paddingBottom = (int) (((float) i) * aVar2.a);
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public static void a(LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    private void a(String str, int i, int i2, View view, Class cls, a aVar) {
        if (aVar != null) {
            Method method = cls.getMethod(str, new Class[]{Integer.TYPE});
            method.setAccessible(true);
            if (!aVar.b) {
                i = i2;
            }
            method.invoke(view, new Object[]{Integer.valueOf((int) (((float) i) * aVar.a))});
        }
    }

    private static boolean a(View view, a aVar) {
        return aVar != null && aVar.a != null && aVar.r != null && (ViewCompat.getMeasuredWidthAndState(view) & ViewCompat.MEASURED_STATE_MASK) == ViewCompat.MEASURED_STATE_TOO_SMALL && aVar.a.a >= 0.0f && aVar.r.width == -2;
    }

    private static a b(TypedArray typedArray, a aVar) {
        a a = a(typedArray, R.styleable.PercentLayout_Layout_layout_textSizePercent, false);
        if (a == null) {
            return aVar;
        }
        if (Log.isLoggable(a, 2)) {
            Log.v(a, "percent text size: " + a.a);
        }
        aVar = a(aVar);
        aVar.i = a;
        return aVar;
    }

    private void b(int i, int i2, View view, a aVar) {
        try {
            Class cls = view.getClass();
            a("setMaxWidth", i, i2, view, cls, aVar.j);
            a("setMaxHeight", i, i2, view, cls, aVar.k);
            a("setMinWidth", i, i2, view, cls, aVar.l);
            a("setMinHeight", i, i2, view, cls, aVar.m);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
    }

    private static boolean b(View view, a aVar) {
        return aVar != null && aVar.b != null && aVar.r != null && (ViewCompat.getMeasuredHeightAndState(view) & ViewCompat.MEASURED_STATE_MASK) == ViewCompat.MEASURED_STATE_TOO_SMALL && aVar.b.a >= 0.0f && aVar.r.height == -2;
    }

    private static a c(TypedArray typedArray, a aVar) {
        a a = a(typedArray, R.styleable.PercentLayout_Layout_layout_maxWidthPercent, true);
        if (a != null) {
            a(aVar);
            aVar.j = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_maxHeightPercent, false);
        if (a != null) {
            a(aVar);
            aVar.k = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_minWidthPercent, true);
        if (a != null) {
            a(aVar);
            aVar.l = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_minHeightPercent, false);
        if (a != null) {
            a(aVar);
            aVar.m = a;
        }
        return aVar;
    }

    private void c(int i, int i2, View view, a aVar) {
        a aVar2 = aVar.i;
        if (aVar2 != null) {
            if (!aVar2.b) {
                i = i2;
            }
            float f = (float) ((int) (aVar2.a * ((float) i)));
            if (view instanceof TextView) {
                ((TextView) view).setTextSize(0, f);
            }
        }
    }

    private static a d(TypedArray typedArray, a aVar) {
        a a = a(typedArray, R.styleable.PercentLayout_Layout_layout_marginPercent, true);
        if (a != null) {
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "percent margin: " + a.a);
            }
            aVar = a(aVar);
            aVar.c = a;
            aVar.d = a;
            aVar.e = a;
            aVar.f = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_marginLeftPercent, true);
        if (a != null) {
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "percent left margin: " + a.a);
            }
            aVar = a(aVar);
            aVar.c = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_marginTopPercent, false);
        if (a != null) {
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "percent top margin: " + a.a);
            }
            aVar = a(aVar);
            aVar.d = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_marginRightPercent, true);
        if (a != null) {
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "percent right margin: " + a.a);
            }
            aVar = a(aVar);
            aVar.e = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_marginBottomPercent, false);
        if (a != null) {
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "percent bottom margin: " + a.a);
            }
            aVar = a(aVar);
            aVar.f = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_marginStartPercent, true);
        if (a != null) {
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "percent start margin: " + a.a);
            }
            aVar = a(aVar);
            aVar.g = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_marginEndPercent, true);
        if (a == null) {
            return aVar;
        }
        if (Log.isLoggable(a, 2)) {
            Log.v(a, "percent end margin: " + a.a);
        }
        aVar = a(aVar);
        aVar.h = a;
        return aVar;
    }

    private static a e(TypedArray typedArray, a aVar) {
        a a = a(typedArray, R.styleable.PercentLayout_Layout_layout_paddingPercent, true);
        if (a != null) {
            aVar = a(aVar);
            aVar.n = a;
            aVar.o = a;
            aVar.q = a;
            aVar.p = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_paddingLeftPercent, true);
        if (a != null) {
            aVar = a(aVar);
            aVar.n = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_paddingRightPercent, true);
        if (a != null) {
            aVar = a(aVar);
            aVar.o = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_paddingTopPercent, true);
        if (a != null) {
            aVar = a(aVar);
            aVar.p = a;
        }
        a = a(typedArray, R.styleable.PercentLayout_Layout_layout_paddingBottomPercent, true);
        if (a == null) {
            return aVar;
        }
        aVar = a(aVar);
        aVar.q = a;
        return aVar;
    }

    public void a() {
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "should restore " + childAt + " " + layoutParams);
            }
            if (layoutParams instanceof b) {
                a a = ((b) layoutParams).a();
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "using " + a);
                }
                if (a != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        a.a((MarginLayoutParams) layoutParams);
                    } else {
                        a.a(layoutParams);
                    }
                }
            }
        }
    }

    public void a(int i, int i2) {
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "adjustChildren: " + this.b + " widthMeasureSpec: " + MeasureSpec.toString(i) + " heightMeasureSpec: " + MeasureSpec.toString(i2));
        }
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "widthHint = " + size + " , heightHint = " + size2);
        }
        int childCount = this.b.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.b.getChildAt(i3);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "should adjust " + childAt + " " + layoutParams);
            }
            if (layoutParams instanceof b) {
                a a = ((b) layoutParams).a();
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "using " + a);
                }
                if (a != null) {
                    c(size, size2, childAt, a);
                    a(size, size2, childAt, a);
                    b(size, size2, childAt, a);
                    if (layoutParams instanceof MarginLayoutParams) {
                        a.a((MarginLayoutParams) layoutParams, size, size2);
                    } else {
                        a.a(layoutParams, size, size2);
                    }
                }
            }
        }
    }

    public boolean b() {
        int childCount = this.b.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof b) {
                a a = ((b) layoutParams).a();
                if (a != null) {
                    boolean z2;
                    if (a(childAt, a)) {
                        layoutParams.width = -2;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (b(childAt, a)) {
                        layoutParams.height = -2;
                        z = true;
                    } else {
                        z = z2;
                    }
                }
            }
        }
        return z;
    }
}
