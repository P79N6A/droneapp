package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
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
import com.fimi.kernel.utils.p;
import com.google.android.gms.maps.model.b;

public class SwitchButtonStoke extends View {
    SimpleSpringListener a = new SimpleSpringListener(this) {
        final /* synthetic */ SwitchButtonStoke a;

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
    private int f = Color.parseColor("#63000000");
    private int g = Color.parseColor("#51000000");
    private int h = Color.parseColor("#ededed");
    private int i = Color.parseColor("#ededed");
    private int j = Color.parseColor("#ff4f00");
    private Paint k;
    private boolean l = false;
    private int m = 1;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private int s;
    private float t;
    private RectF u = new RectF();
    private boolean v = true;
    private a w;

    public interface a {
        void a(View view, boolean z);
    }

    private SwitchButtonStoke(Context context) {
        super(context);
    }

    public SwitchButtonStoke(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup(attributeSet);
    }

    public SwitchButtonStoke(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setup(attributeSet);
    }

    private int a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void a(double d) {
        this.t = (float) SpringUtil.mapValueFromRangeToRange(d, 0.0d, 1.0d, (double) this.q, (double) this.r);
        float mapValueFromRangeToRange = (float) SpringUtil.mapValueFromRangeToRange(1.0d - d, 0.0d, 1.0d, 10.0d, (double) this.s);
        int blue = Color.blue(this.j);
        int red = Color.red(this.j);
        int green = Color.green(this.j);
        int blue2 = Color.blue(this.i);
        int red2 = Color.red(this.i);
        red = (int) SpringUtil.mapValueFromRangeToRange(1.0d - d, 0.0d, 1.0d, (double) red, (double) red2);
        int mapValueFromRangeToRange2 = (int) SpringUtil.mapValueFromRangeToRange(1.0d - d, 0.0d, 1.0d, (double) green, (double) Color.green(this.i));
        this.h = Color.rgb(a(red, 0, 255), a(mapValueFromRangeToRange2, 0, 255), a((int) SpringUtil.mapValueFromRangeToRange(1.0d - d, 0.0d, 1.0d, (double) blue, (double) blue2), 0, 255));
        postInvalidate();
    }

    private void a(boolean z) {
        double d = 1.0d;
        if (z) {
            Spring spring = this.c;
            if (!this.l) {
                d = 0.0d;
            }
            spring.setEndValue(d);
            return;
        }
        this.c.setCurrentValue(this.l ? 1.0d : 0.0d);
        if (!this.l) {
            d = 0.0d;
        }
        a(d);
    }

    private void b() {
        this.l = !this.l;
        a(true);
        setSwitchState(this.l);
        if (this.w != null) {
            this.w.a(this, this.l);
        }
    }

    public void a(boolean z, boolean z2) {
        this.l = z;
        a(z2);
    }

    public boolean a() {
        return this.v;
    }

    public void draw(Canvas canvas) {
        this.k.setStyle(Style.STROKE);
        this.k.setAntiAlias(true);
        float a = p.a(getContext(), 0.5f);
        this.u.set(a, a, ((float) getWidth()) - a, ((float) getHeight()) - a);
        this.k.setColor(this.f);
        this.k.setStrokeWidth(p.a(getContext(), 0.7f));
        canvas.drawRoundRect(this.u, this.d, this.d, this.k);
        this.k.setStyle(Style.FILL);
        this.k.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
        this.u.set((this.t - this.d) + 4.0f, (this.n - this.d) + 4.0f, (this.t - 4.0f) + this.d, (this.n + this.d) - 4.0f);
        if (this.l) {
            this.k.setColor(this.j);
        } else {
            this.k.setColor(this.g);
        }
        canvas.drawRoundRect(this.u, this.d, this.d, this.k);
        a = ((float) this.s) * 0.45f;
        this.u.set(this.t - a, this.n - a, this.t + a, this.n + a);
        this.k.setColor(this.h);
        canvas.drawRoundRect(this.u, a, a, this.k);
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
        this.n = this.d;
        this.o = this.d;
        this.p = ((float) width) - this.d;
        this.q = this.o + ((float) this.m);
        this.r = this.p - ((float) this.m);
        this.s = height - (this.m * 4);
        this.t = this.l ? this.r : this.q;
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
        this.v = z;
    }

    public void setOnSwitchListener(a aVar) {
        this.w = aVar;
    }

    public void setSwitchState(boolean z) {
        a(z, true);
    }

    public void setup(AttributeSet attributeSet) {
        this.k = new Paint(1);
        this.k.setStyle(Style.STROKE);
        this.k.setStrokeCap(Cap.ROUND);
        this.b = SpringSystem.create();
        this.c = this.b.createSpring();
        this.c.setSpringConfig(SpringConfig.fromOrigamiTensionAndFriction(50.0d, 7.0d));
        setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SwitchButtonStoke a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.b();
            }
        });
    }
}
