package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import com.google.android.gms.R;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.fl;

class c extends Drawable {
    private final Paint a = new Paint();
    private final Paint b = new Paint();
    private final Rect c = new Rect();
    private final int d;
    private final int e;
    private float f;
    private float g = 1.0f;
    private float h;
    private float i;

    public c(Context context) {
        Resources resources = context.getResources();
        this.d = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_inner_radius);
        this.e = resources.getInteger(R.integer.cast_libraries_material_featurehighlight_pulse_base_alpha);
        this.a.setAntiAlias(true);
        this.a.setStyle(Style.FILL);
        this.b.setAntiAlias(true);
        this.b.setStyle(Style.FILL);
        a(-1);
    }

    public Animator a() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scale", new float[]{0.0f, 1.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2});
        ofPropertyValuesHolder.setInterpolator(fl.a());
        return ofPropertyValuesHolder.setDuration(350);
    }

    public void a(@ColorInt int i) {
        this.a.setColor(i);
        this.b.setColor(i);
        invalidateSelf();
    }

    public void a(Rect rect) {
        this.c.set(rect);
        this.h = this.c.exactCenterX();
        this.i = this.c.exactCenterY();
        this.f = Math.max((float) this.d, Math.max(((float) this.c.width()) / 2.0f, ((float) this.c.height()) / 2.0f));
        invalidateSelf();
    }

    public Animator b() {
        Animator animatorSet = new AnimatorSet();
        Animator duration = ObjectAnimator.ofFloat(this, "scale", new float[]{1.0f, 1.1f}).setDuration(500);
        Animator duration2 = ObjectAnimator.ofFloat(this, "scale", new float[]{1.1f, 1.0f}).setDuration(500);
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("pulseScale", new float[]{1.1f, 2.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("pulseAlpha", new float[]{1.0f, 0.0f});
        Animator duration3 = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2}).setDuration(500);
        animatorSet.play(duration);
        animatorSet.play(duration2).with(duration3).after(duration);
        animatorSet.setInterpolator(fl.c());
        animatorSet.setStartDelay(500);
        animatorSet.addListener(fj.b(animatorSet));
        return animatorSet;
    }

    public Animator c() {
        return d();
    }

    public Animator d() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scale", new float[]{0.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f});
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("pulseScale", new float[]{0.0f});
        PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("pulseAlpha", new float[]{0.0f});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        ofPropertyValuesHolder.setInterpolator(fl.b());
        return ofPropertyValuesHolder.setDuration(200);
    }

    public void draw(Canvas canvas) {
        int i = (0.0f > 0.0f ? 1 : (0.0f == 0.0f ? 0 : -1));
        canvas.drawCircle(this.h, this.i, this.f * this.g, this.a);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
