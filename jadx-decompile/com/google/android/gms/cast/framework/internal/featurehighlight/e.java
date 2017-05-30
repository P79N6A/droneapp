package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.v4.graphics.ColorUtils;
import android.util.TypedValue;
import com.google.android.gms.R;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.fm;

class e extends Drawable {
    private final int a;
    private final int b;
    private final int c;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Paint f = new Paint();
    private float g;
    private float h = 1.0f;
    private float i;
    private float j;
    private float k = 0.0f;
    private float l = 0.0f;
    private int m = 244;

    public e(Context context) {
        if (s.k()) {
            a(a(context));
        } else {
            a(context.getResources().getColor(R.color.cast_libraries_material_featurehighlight_outer_highlight_default_color));
        }
        this.f.setAntiAlias(true);
        this.f.setStyle(Style.FILL);
        Resources resources = context.getResources();
        this.a = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_center_threshold);
        this.b = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_center_horizontal_offset);
        this.c = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_outer_padding);
    }

    private float a(float f, float f2, Rect rect) {
        return (float) Math.ceil((double) fm.a(f, f2, (float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom));
    }

    @TargetApi(21)
    private static int a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843827, typedValue, true);
        return ColorUtils.setAlphaComponent(typedValue.data, 244);
    }

    @ColorInt
    public int a() {
        return this.f.getColor();
    }

    public void a(@ColorInt int i) {
        this.f.setColor(i);
        this.m = this.f.getAlpha();
        invalidateSelf();
    }

    public void a(Rect rect, Rect rect2) {
        this.d.set(rect);
        this.e.set(rect2);
        float exactCenterX = rect.exactCenterX();
        float exactCenterY = rect.exactCenterY();
        Rect bounds = getBounds();
        if (Math.min(exactCenterY - ((float) bounds.top), ((float) bounds.bottom) - exactCenterY) < ((float) this.a)) {
            this.i = exactCenterX;
            this.j = exactCenterY;
        } else {
            this.i = ((exactCenterX > bounds.exactCenterX() ? 1 : (exactCenterX == bounds.exactCenterX() ? 0 : -1)) <= 0 ? 1 : null) != null ? rect2.exactCenterX() + ((float) this.b) : rect2.exactCenterX() - ((float) this.b);
            this.j = rect2.exactCenterY();
        }
        this.g = ((float) this.c) + Math.max(a(this.i, this.j, rect), a(this.i, this.j, rect2));
        invalidateSelf();
    }

    public boolean a(float f, float f2) {
        return fm.b(f, f2, this.i, this.j) < this.g;
    }

    public float b() {
        return this.i;
    }

    public Animator b(float f, float f2) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scale", new float[]{0.0f, 1.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationX", new float[]{f, 0.0f});
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("translationY", new float[]{f2, 0.0f});
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("alpha", new int[]{0, this.m});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2, ofFloat3, ofInt});
        ofPropertyValuesHolder.setInterpolator(fl.a());
        return ofPropertyValuesHolder.setDuration(350);
    }

    public float c() {
        return this.j;
    }

    public Animator c(float f, float f2) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scale", new float[]{0.0f});
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("alpha", new int[]{0});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f, f});
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f, f2});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2, ofFloat3, ofInt});
        ofPropertyValuesHolder.setInterpolator(fl.b());
        return ofPropertyValuesHolder.setDuration(200);
    }

    public Animator d() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scale", new float[]{1.125f});
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("alpha", new int[]{0});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofInt});
        ofPropertyValuesHolder.setInterpolator(fl.b());
        return ofPropertyValuesHolder.setDuration(200);
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(this.i + 0.0f, this.j + 0.0f, this.g * this.h, this.f);
    }

    public int getAlpha() {
        return this.f.getAlpha();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
