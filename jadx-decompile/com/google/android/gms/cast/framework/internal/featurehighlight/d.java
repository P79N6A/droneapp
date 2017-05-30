package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.R;
import com.google.android.gms.internal.fq;

class d {
    private final Rect a = new Rect();
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final a f;

    d(a aVar) {
        this.f = (a) fq.a(aVar);
        Resources resources = aVar.getResources();
        this.b = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_inner_radius);
        this.c = resources.getDimensionPixelOffset(R.dimen.cast_libraries_material_featurehighlight_inner_margin);
        this.d = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_text_max_width);
        this.e = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_text_horizontal_offset);
    }

    private int a(Rect rect) {
        Drawable b = this.f.b();
        return Math.max(this.b * 2, b != null ? b.getBounds().height() : rect.height());
    }

    private int a(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = i3 / 2;
        int i6 = (i4 - i <= i2 - i4 ? 1 : null) != null ? (i4 - i5) + this.e : (i4 - i5) - this.e;
        return i6 - marginLayoutParams.leftMargin < i ? i + marginLayoutParams.leftMargin : (i6 + i3) + marginLayoutParams.rightMargin > i2 ? (i2 - i3) - marginLayoutParams.rightMargin : i6;
    }

    private void a(View view, int i, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(MeasureSpec.makeMeasureSpec(Math.min((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, this.d), 1073741824), MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }

    private void a(View view, Rect rect) {
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private void b(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    private void c(View view, int i, int i2) {
        view.layout(i, i2 - view.getMeasuredHeight(), view.getMeasuredWidth() + i, i2);
    }

    void a(Rect rect, Rect rect2) {
        int i = 0;
        View c = this.f.c();
        if (rect.isEmpty() || rect2.isEmpty()) {
            c.layout(0, 0, 0, 0);
        } else {
            int centerY = rect.centerY();
            int centerX = rect.centerX();
            if (centerY < rect2.centerY()) {
                i = 1;
            }
            int a = a(rect);
            int i2 = this.c + ((a / 2) + centerY);
            if (i != 0) {
                a(c, rect2.width(), rect2.bottom - i2);
                b(c, a(c, rect2.left, rect2.right, c.getMeasuredWidth(), centerX), i2);
            } else {
                i2 = (centerY - (a / 2)) - this.c;
                a(c, rect2.width(), i2 - rect2.top);
                c(c, a(c, rect2.left, rect2.right, c.getMeasuredWidth(), centerX), i2);
            }
        }
        a(c, this.a);
        this.f.d().a(rect, this.a);
        this.f.e().a(rect);
    }
}
