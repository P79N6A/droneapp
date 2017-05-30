package com.fimi.kernel.view.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.fimi.kernel.view.percent.a.a;
import com.fimi.kernel.view.percent.a.b;

public class PercentRelativeLayout extends RelativeLayout {
    private final a a = new a(this);

    public static class LayoutParams extends android.widget.RelativeLayout.LayoutParams implements b {
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

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LayoutParams a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    public /* synthetic */ android.widget.RelativeLayout.LayoutParams m2generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.a();
    }

    protected void onMeasure(int i, int i2) {
        this.a.a(i, i2);
        super.onMeasure(i, i2);
        if (this.a.b()) {
            super.onMeasure(i, i2);
        }
    }
}
