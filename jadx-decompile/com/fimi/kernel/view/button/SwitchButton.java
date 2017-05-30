package com.fimi.kernel.view.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import com.facebook.rebound.SimpleSpringListener;
import com.facebook.rebound.Spring;
import com.facebook.rebound.SpringConfig;
import com.facebook.rebound.SpringSystem;
import com.facebook.rebound.SpringUtil;
import com.fimi.kernel.R;
import com.fimi.kernel.utils.p;
import com.google.android.gms.maps.model.b;

public class SwitchButton extends View {
    SimpleSpringListener a = new SimpleSpringListener(this) {
        final /* synthetic */ SwitchButton a;

        {
            this.a = r1;
        }

        public void onSpringUpdate(Spring spring) {
            this.a.a(spring.getCurrentValue());
        }
    };
    private SpringSystem b;
    private Spring c;
    private float d;
    private int e = 0;
    private int f = Color.parseColor("#ffffff");
    private int g = Color.parseColor("#bcbcbd");
    private int h = Color.parseColor("#bcbcbd");
    private int i = Color.parseColor("#ff5400");
    private Paint j;
    private boolean k = false;
    private int l = 1;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private int r;
    private float s;
    private RectF t = new RectF();
    private boolean u = true;
    private a v;

    public interface a {
        void a(View view, boolean z);
    }

    private SwitchButton(Context context) {
        super(context);
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup(attributeSet);
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setup(attributeSet);
    }

    private int a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void a(double d) {
        this.s = (float) SpringUtil.mapValueFromRangeToRange(d, 0.0d, 1.0d, (double) this.p, (double) this.q);
        float mapValueFromRangeToRange = (float) SpringUtil.mapValueFromRangeToRange(1.0d - d, 0.0d, 1.0d, 10.0d, (double) this.r);
        int blue = Color.blue(this.i);
        int red = Color.red(this.i);
        int green = Color.green(this.i);
        int blue2 = Color.blue(this.h);
        int red2 = Color.red(this.h);
        red = (int) SpringUtil.mapValueFromRangeToRange(1.0d - d, 0.0d, 1.0d, (double) red, (double) red2);
        int mapValueFromRangeToRange2 = (int) SpringUtil.mapValueFromRangeToRange(1.0d - d, 0.0d, 1.0d, (double) green, (double) Color.green(this.h));
        this.g = Color.rgb(a(red, 0, 255), a(mapValueFromRangeToRange2, 0, 255), a((int) SpringUtil.mapValueFromRangeToRange(1.0d - d, 0.0d, 1.0d, (double) blue, (double) blue2), 0, 255));
        postInvalidate();
    }

    private void a(boolean z) {
        double d = 1.0d;
        if (z) {
            Spring spring = this.c;
            if (!this.k) {
                d = 0.0d;
            }
            spring.setEndValue(d);
            return;
        }
        this.c.setCurrentValue(this.k ? 1.0d : 0.0d);
        if (!this.k) {
            d = 0.0d;
        }
        a(d);
    }

    private void b() {
        this.k = !this.k;
        a(true);
        setSwitchState(this.k);
        if (this.v != null) {
            this.v.a(this, this.k);
        }
    }

    public void a(boolean z, boolean z2) {
        this.k = z;
        a(z2);
    }

    public boolean a() {
        return this.u;
    }

    public void draw(Canvas canvas) {
        this.j.setStyle(Style.STROKE);
        this.j.setAntiAlias(true);
        float a = p.a(getContext(), 0.5f);
        this.t.set(a, a, ((float) getWidth()) - a, ((float) getHeight()) - a);
        this.j.setColor(603979775);
        this.j.setStrokeWidth(p.a(getContext(), 0.7f));
        canvas.drawRoundRect(this.t, this.d, this.d, this.j);
        this.j.setStyle(Style.FILL);
        this.j.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
        this.t.set((this.s - 1.0f) - this.d, this.m - this.d, (this.s + 1.1f) + this.d, this.m + this.d);
        this.j.setColor(0);
        canvas.drawRoundRect(this.t, this.d, this.d, this.j);
        a = ((float) this.r) * 0.45f;
        this.t.set(this.s - a, this.m - a, this.s + a, this.m + a);
        this.j.setColor(this.g);
        canvas.drawRoundRect(this.t, a, a, this.j);
    }

    public boolean getToggleOn() {
        return this.k;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.addListener(this.a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.removeListener(this.a);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        this.d = ((float) Math.min(width, height)) * 0.5f;
        this.m = this.d;
        this.n = this.d;
        this.o = ((float) width) - this.d;
        this.p = this.n + ((float) this.l);
        this.q = this.o - ((float) this.l);
        this.r = height - (this.l * 4);
        this.s = this.k ? this.q : this.p;
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        MeasureSpec.getMode(i2);
        MeasureSpec.getSize(i);
        int size = MeasureSpec.getSize(i2);
        Resources system = Resources.getSystem();
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            i = MeasureSpec.makeMeasureSpec((int) TypedValue.applyDimension(1, 50.0f, system.getDisplayMetrics()), 1073741824);
        }
        if (size == 0 || size == Integer.MIN_VALUE) {
            i2 = MeasureSpec.makeMeasureSpec((int) TypedValue.applyDimension(1, b.b, system.getDisplayMetrics()), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setAnimate(boolean z) {
        this.u = z;
    }

    public void setOnSwitchListener(a aVar) {
        this.v = aVar;
    }

    public void setSwitchState(boolean z) {
        a(z, true);
    }

    public void setup(AttributeSet attributeSet) {
        this.j = new Paint(1);
        this.j.setStyle(Style.STROKE);
        this.j.setStrokeCap(Cap.ROUND);
        this.b = SpringSystem.create();
        this.c = this.b.createSpring();
        this.c.setSpringConfig(SpringConfig.fromOrigamiTensionAndFriction(50.0d, 7.0d));
        setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SwitchButton a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.b();
            }
        });
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SwitchButton);
        this.e = obtainStyledAttributes.getColor(R.styleable.SwitchButton_onColor, this.e);
        this.h = obtainStyledAttributes.getColor(R.styleable.SwitchButton_spotColor, this.h);
        this.l = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchButton_borderWidth, (int) p.a(getContext(), (float) this.l));
        this.u = obtainStyledAttributes.getBoolean(R.styleable.SwitchButton_animate, this.u);
        obtainStyledAttributes.recycle();
    }
}
