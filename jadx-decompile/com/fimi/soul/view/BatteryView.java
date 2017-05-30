package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;
import com.fimi.soul.view.photodraweeview.c;
import com.google.android.gms.maps.model.b;

public class BatteryView extends View {
    Paint a;
    Paint b;
    Rect c;
    double d;
    int e;
    double f;
    double g;
    int h;
    int i;
    int j;
    int k;
    private int l;
    private float m;

    public BatteryView(Context context) {
        super(context);
        this.l = 100;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 100.0d;
    }

    public BatteryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 100;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 100.0d;
        this.m = getContext().getResources().getDisplayMetrics().density;
    }

    public void a(int i, double d) {
        this.l = i;
        if (this.d > 0.0d) {
            this.d = d;
        }
        if (this.l < 0) {
            this.l = 0;
        }
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (float) (((double) this.l) / this.d);
        float f2 = f * 360.0f;
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.battery));
        paint.setAntiAlias(true);
        canvas.drawCircle(this.m * 12.0f, this.m * 12.0f, this.m * 12.0f, paint);
        paint = new Paint();
        paint.setColor(getResources().getColor(R.color.black));
        paint.setAntiAlias(true);
        canvas.drawCircle(this.m * 12.0f, this.m * 12.0f, 11.0f * this.m, paint);
        Paint paint2 = new Paint();
        if (((double) f) <= 0.25d) {
            paint2.setColor(getResources().getColor(R.color.battery_red));
        } else if (((double) f) > 0.25d && ((double) f) <= 0.5d) {
            paint2.setColor(getResources().getColor(R.color.battery_orange));
        } else if (((double) f) <= 0.5d || ((double) f) > 0.75d) {
            paint2.setColor(getResources().getColor(R.color.battery_green));
        } else {
            paint2.setColor(getResources().getColor(R.color.battery_yellow));
        }
        paint2.setAntiAlias(true);
        canvas.drawArc(new RectF(this.m * c.a, this.m * c.a, 21.0f * this.m, 21.0f * this.m), b.h - f2, f2, true, paint2);
    }
}
