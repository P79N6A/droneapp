package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import com.fimi.soul.view.photodraweeview.c;

public class FillBar extends View {
    SurfaceHolder a;
    private Paint b;
    private Paint c;
    private Path d = new Path();
    private Path e = new Path();
    private int f;
    private int g;
    private float h = 0.0f;
    private float i = 0.5f;
    private float j = 0.5f;
    private boolean k = false;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q = false;

    public FillBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    private void b() {
        this.l = Color.parseColor("#D6D6D6");
        this.m = Color.parseColor("#FFFFFF");
        this.n = Color.parseColor("#F49748");
        this.b = new Paint();
        this.b.setAntiAlias(false);
        this.b.setStyle(Style.STROKE);
        this.b.setStrokeWidth(c.a);
        this.c = new Paint(this.b);
        this.c.setStyle(Style.FILL);
    }

    public void a(int i, int i2) {
        this.o = i;
        this.p = i2;
    }

    public void a(boolean z) {
        this.q = z;
    }

    public boolean a() {
        return this.k;
    }

    public int getColorBar() {
        return this.n;
    }

    public int getColorMin() {
        return this.m;
    }

    public int getColorOutline() {
        return this.l;
    }

    public float getMax() {
        return this.j;
    }

    public int getMaxValue() {
        return this.p + ((int) (getMax() * ((float) (this.o - this.p))));
    }

    public float getMin() {
        return this.i;
    }

    public int getMinValue() {
        return this.p + ((int) (getMin() * ((float) (this.o - this.p))));
    }

    public float getPercentage() {
        return this.h;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f < this.g ? (float) this.f : ((float) this.f) * (1.0f - this.h);
        float f2 = this.f < this.g ? ((float) this.g) * this.h : (float) this.g;
        this.c.setColor(this.l);
        this.d.reset();
        this.d.moveTo(0.0f, 0.0f);
        this.d.lineTo(0.0f, (float) this.f);
        this.d.lineTo((float) this.g, (float) this.f);
        this.d.lineTo((float) this.g, 0.0f);
        this.d.lineTo(0.0f, 0.0f);
        canvas.drawPath(this.d, this.c);
        this.c.setColor(this.n);
        this.e.reset();
        if (this.q) {
            if (this.f > this.g) {
                this.e.moveTo(0.0f, 0.0f);
                this.e.lineTo(0.0f, ((float) this.f) - f);
                this.e.lineTo((float) this.g, ((float) this.f) - f);
                this.e.lineTo((float) this.g, 0.0f);
                this.e.lineTo(0.0f, 0.0f);
            } else {
                this.e.moveTo(0.0f, 0.0f);
                this.e.lineTo(0.0f, (float) this.f);
                this.e.lineTo(((float) this.g) - f2, (float) this.f);
                this.e.lineTo(((float) this.g) - f2, 0.0f);
                this.e.lineTo(0.0f, 0.0f);
            }
        } else if (this.f > this.g) {
            this.e.moveTo(0.0f, f);
            this.e.lineTo(0.0f, (float) this.f);
            this.e.lineTo(f2, (float) this.f);
            this.e.lineTo(f2, f);
            this.e.lineTo(0.0f, f);
        } else {
            this.e.moveTo(0.0f, 0.0f);
            this.e.lineTo(0.0f, (float) this.f);
            this.e.lineTo(f2, (float) this.f);
            this.e.lineTo(f2, 0.0f);
            this.e.lineTo(0.0f, 0.0f);
        }
        canvas.drawPath(this.e, this.c);
        this.b.setColor(this.m);
        if (a()) {
            this.d.reset();
            if (this.q) {
                if (this.f > this.g) {
                    f = ((float) this.f) * this.i;
                    this.d.reset();
                    this.d.moveTo(0.0f, f);
                    this.d.lineTo((float) this.g, f);
                    canvas.drawPath(this.d, this.b);
                    this.d.reset();
                    f = ((float) this.f) * this.j;
                    this.d.moveTo(0.0f, f);
                    this.d.lineTo((float) this.g, f);
                    canvas.drawPath(this.d, this.b);
                } else {
                    f = ((float) this.g) * this.j;
                    this.d.reset();
                    this.d.moveTo(f, 0.0f);
                    this.d.lineTo(f, (float) this.f);
                    canvas.drawPath(this.d, this.b);
                    f = ((float) this.g) * this.i;
                    this.d.reset();
                    this.d.moveTo(f, 0.0f);
                    this.d.lineTo(f, (float) this.f);
                    canvas.drawPath(this.d, this.b);
                }
            } else if (this.f > this.g) {
                f = ((float) this.f) * (1.0f - this.i);
                this.d.reset();
                this.d.moveTo(0.0f, f);
                this.d.lineTo((float) this.g, f);
                canvas.drawPath(this.d, this.b);
                this.d.reset();
                f = ((float) this.f) * (1.0f - this.j);
                this.d.moveTo(0.0f, f);
                this.d.lineTo((float) this.g, f);
                canvas.drawPath(this.d, this.b);
            } else {
                f = ((float) this.g) * this.i;
                this.d.reset();
                this.d.moveTo(f, 0.0f);
                this.d.lineTo(f, (float) this.f);
                canvas.drawPath(this.d, this.b);
                f = ((float) this.g) * this.j;
                this.d.reset();
                this.d.moveTo(f, 0.0f);
                this.d.lineTo(f, (float) this.f);
                canvas.drawPath(this.d, this.b);
            }
        }
        invalidate();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g = i - 1;
        this.f = i2 - 1;
    }

    public void setColorBar(int i) {
        this.n = i;
    }

    public void setColorMin(int i) {
        this.m = i;
    }

    public void setColorOutline(int i) {
        this.l = i;
    }

    public void setPercentage(float f) {
        this.h = f;
        this.i = this.i > f ? f : this.i;
        if (this.j >= f) {
            f = this.j;
        }
        this.j = f;
        invalidate();
    }

    public void setShowMinMax(boolean z) {
        this.k = z;
        if (z) {
            this.i = 0.5f;
            this.j = 0.5f;
        }
        invalidate();
    }

    public void setValue(int i) {
        setPercentage(((float) (i - this.p)) / ((float) (this.o - this.p)));
    }
}
