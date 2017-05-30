package com.fimi.kernel.view.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.internal.view.SupportMenu;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class ProgressView extends View {
    private static final int[] a = new int[]{-16711936, -256, SupportMenu.CATEGORY_MASK};
    private float b;
    private float c;
    private Paint d;
    private int e;
    private int f;
    private int g = 0;
    private int h = 0;

    public ProgressView(Context context) {
        super(context);
        a(context);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private int a(int i) {
        return (int) ((((float) (i >= 0 ? 1 : -1)) * 0.5f) + (((float) i) * getContext().getResources().getDisplayMetrics().density));
    }

    private void a(Context context) {
    }

    public float getCurrentCount() {
        return this.c;
    }

    public float getMaxCount() {
        return this.b;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.d = new Paint();
        this.d.setAntiAlias(true);
        int i = this.f / 2;
        if (this.h == 0) {
            this.d.setColor(771751935);
        } else {
            this.d.setColor(this.h);
        }
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) this.e, (float) this.f), (float) i, (float) i, this.d);
        RectF rectF = new RectF(0.0f, 0.0f, (this.c / this.b) * ((float) this.e), (float) this.f);
        if (this.g == 0) {
            this.d.setColor(1895825407);
        } else {
            this.d.setColor(this.g);
        }
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.d);
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            this.e = size;
        } else {
            this.e = 0;
        }
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            this.f = a(15);
        } else {
            this.f = size2;
        }
        setMeasuredDimension(this.e, this.f);
    }

    public void setBackColor(int i) {
        this.h = i;
    }

    public void setCurrentCount(float f) {
        if (f > this.b) {
            f = this.b;
        }
        this.c = f;
        invalidate();
    }

    public void setFrontColor(int i) {
        this.g = i;
    }

    public void setMaxCount(float f) {
        this.b = f;
    }
}
