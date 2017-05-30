package com.fimi.kernel.view.percent;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.fimi.kernel.view.percent.a.a;
import com.fimi.kernel.view.percent.a.b;

public class PercentLinearLayout extends LinearLayout {
    private static final String a = "PercentLinearLayout";
    private a b = new a(this);

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams implements b {
        private a a;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = a.a(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a a() {
            return this.a;
        }

        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            a.a((android.view.ViewGroup.LayoutParams) this, typedArray, i, i2);
        }
    }

    public PercentLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getScreenHeight() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public LayoutParams a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    public /* synthetic */ android.widget.LinearLayout.LayoutParams m1generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.a();
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i2);
        size = MeasureSpec.makeMeasureSpec(size, mode);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), MeasureSpec.getMode(i));
        Log.d(a, MeasureSpec.toString(i2));
        if (mode == 0 && getParent() != null && (getParent() instanceof ScrollView)) {
            Context context = getContext();
            if (context instanceof Activity) {
                size = ((Activity) context).findViewById(16908290).getMeasuredHeight();
                Log.d(a, "measuredHeight = " + size);
            } else {
                size = getScreenHeight();
                Log.d(a, "scHeight = " + size);
            }
            size = MeasureSpec.makeMeasureSpec(size, mode);
        }
        this.b.a(makeMeasureSpec, size);
        super.onMeasure(i, i2);
        if (this.b.b()) {
            super.onMeasure(i, i2);
        }
    }
}
