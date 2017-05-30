package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TabWidget;
import android.widget.TextView;

public class BadgeView extends TextView {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 10;
    private static final int g = 5;
    private static final int h = 5;
    private static final int i = 8;
    private static final int j = 2;
    private static final int k = Color.parseColor("#CCFF0000");
    private static final int l = -1;
    private static Animation m;
    private static Animation n;
    private Context o;
    private View p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private ShapeDrawable v;
    private int w;

    public BadgeView(Context context) {
        this(context, (AttributeSet) null, 16842884);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 0);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i, View view, int i2) {
        super(context, attributeSet, i);
        a(context, view, i2);
    }

    public BadgeView(Context context, View view) {
        this(context, null, 16842884, view, 0);
    }

    public BadgeView(Context context, TabWidget tabWidget, int i) {
        this(context, null, 16842884, tabWidget, i);
    }

    private void a(Context context, View view, int i) {
        this.o = context;
        this.p = view;
        this.w = i;
        this.q = 2;
        this.r = c(5);
        this.s = this.r;
        this.t = k;
        setTypeface(Typeface.DEFAULT_BOLD);
        int c = c(5);
        setPadding(c, 0, c, 0);
        setTextColor(-1);
        m = new AlphaAnimation(0.0f, 1.0f);
        m.setInterpolator(new DecelerateInterpolator());
        m.setDuration(500);
        n = new AlphaAnimation(1.0f, 0.0f);
        n.setInterpolator(new AccelerateInterpolator());
        n.setDuration(500);
        this.u = false;
        if (this.p != null) {
            a(this.p);
        } else {
            a();
        }
    }

    private void a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        ViewParent parent = view.getParent();
        View frameLayout = new FrameLayout(this.o);
        if (view instanceof TabWidget) {
            View childTabViewAt = ((TabWidget) view).getChildTabViewAt(this.w);
            this.p = childTabViewAt;
            ((ViewGroup) childTabViewAt).addView(frameLayout, new LayoutParams(-1, -1));
            setVisibility(8);
            frameLayout.addView(this);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeView(view);
        viewGroup.addView(frameLayout, indexOfChild, layoutParams);
        frameLayout.addView(view);
        setVisibility(8);
        frameLayout.addView(this);
        viewGroup.invalidate();
    }

    private void a(boolean z, Animation animation) {
        if (getBackground() == null) {
            if (this.v == null) {
                this.v = getDefaultBackground();
            }
            setBackgroundDrawable(this.v);
        }
        d();
        if (z) {
            startAnimation(animation);
        }
        setVisibility(0);
        this.u = true;
    }

    private void a(boolean z, Animation animation, Animation animation2) {
        boolean z2 = true;
        if (this.u) {
            if (!z || animation2 == null) {
                z2 = false;
            }
            b(z2, animation2);
            return;
        }
        if (!z || animation == null) {
            z2 = false;
        }
        a(z2, animation);
    }

    private void b(boolean z, Animation animation) {
        setVisibility(8);
        if (z) {
            startAnimation(animation);
        }
        this.u = false;
    }

    private int c(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    private void d() {
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        switch (this.q) {
            case 1:
                layoutParams.gravity = 51;
                layoutParams.setMargins(this.r, this.s, 0, 0);
                break;
            case 2:
                layoutParams.gravity = 53;
                layoutParams.setMargins(0, this.s, this.r, 0);
                break;
            case 3:
                layoutParams.gravity = 83;
                layoutParams.setMargins(this.r, 0, 0, this.s);
                break;
            case 4:
                layoutParams.gravity = 85;
                layoutParams.setMargins(0, 0, this.r, this.s);
                break;
            case 5:
                layoutParams.gravity = 17;
                layoutParams.setMargins(0, 0, 0, 0);
                break;
            case 10:
                layoutParams.gravity = 17;
                layoutParams.setMargins(this.r, 0, 0, 0);
                break;
        }
        setLayoutParams(layoutParams);
    }

    private ShapeDrawable getDefaultBackground() {
        int c = c(8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{(float) c, (float) c, (float) c, (float) c, (float) c, (float) c, (float) c, (float) c}, null, null));
        shapeDrawable.getPaint().setColor(this.t);
        return shapeDrawable;
    }

    public int a(int i) {
        int i2 = 0;
        CharSequence text = getText();
        if (text != null) {
            try {
                i2 = Integer.parseInt(text.toString());
            } catch (NumberFormatException e) {
            }
        }
        i2 += i;
        setText(String.valueOf(i2));
        return i2;
    }

    public void a() {
        a(false, null);
    }

    public void a(int i, int i2) {
        this.r = i;
        this.s = i2;
    }

    public void a(Animation animation) {
        a(true, animation);
    }

    public void a(Animation animation, Animation animation2) {
        a(true, animation, animation2);
    }

    public void a(boolean z) {
        a(z, m);
    }

    public int b(int i) {
        return a(-i);
    }

    public void b() {
        b(false, null);
    }

    public void b(Animation animation) {
        b(true, animation);
    }

    public void b(boolean z) {
        b(z, n);
    }

    public void c() {
        a(false, null, null);
    }

    public void c(boolean z) {
        a(z, m, n);
    }

    public int getBadgeBackgroundColor() {
        return this.t;
    }

    public int getBadgePosition() {
        return this.q;
    }

    public int getHorizontalBadgeMargin() {
        return this.r;
    }

    public View getTarget() {
        return this.p;
    }

    public int getVerticalBadgeMargin() {
        return this.s;
    }

    public boolean isShown() {
        return this.u;
    }

    public void setBadgeBackgroundColor(int i) {
        this.t = i;
        this.v = getDefaultBackground();
    }

    public void setBadgeMargin(int i) {
        this.r = i;
        this.s = i;
    }

    public void setBadgePosition(int i) {
        this.q = i;
    }
}
