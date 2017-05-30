package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class BatteryCapacityView extends View {
    private static final int i = -90;
    private static final int j = Color.parseColor("#19ffffff");
    private static final int k = Color.parseColor("#30b0e5");
    private static final int l = Color.parseColor("#fe5400");
    private static final int m = Color.parseColor("#f62f14");
    private static final int n = Color.parseColor("#FFFFFFFF");
    private static final int o = Color.parseColor("#7fFFFFFF");
    float a;
    private Paint b;
    private Paint c;
    private int d;
    private int e;
    private Context f;
    private int g = -1;
    private Rect h;

    public BatteryCapacityView(Context context) {
        super(context);
        a(context);
    }

    public BatteryCapacityView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public BatteryCapacityView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        this.f = context;
        this.a = this.f.getResources().getDimension(R.dimen.battery_capacity);
        this.b = new Paint();
        this.b.setAntiAlias(true);
        this.b.setColor(j);
        this.b.setStyle(Style.STROKE);
        this.b.setStrokeWidth(this.a);
        this.b.setStrokeCap(Cap.ROUND);
        this.h = new Rect();
        this.c = new Paint();
        this.c.setStrokeWidth(this.a);
        this.c.setAntiAlias(true);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.setColor(j);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), ((float) (getWidth() / 2)) - this.a, this.b);
        if (this.g == -1) {
            this.b.setColor(k);
            this.c.setColor(n);
        } else if (this.g < 15) {
            this.b.setColor(m);
            this.c.setColor(m);
        } else if (this.g < 30) {
            this.b.setColor(l);
            this.c.setColor(l);
        } else {
            this.b.setColor(k);
            this.c.setColor(n);
        }
        RectF rectF = new RectF();
        rectF.left = this.a;
        rectF.top = this.a;
        rectF.right = ((float) getWidth()) - this.a;
        rectF.bottom = ((float) getHeight()) - this.a;
        canvas.drawArc(rectF, -90.0f, this.g == -1 ? 0.0f : (float) ((this.g * 360) / 100), false, this.b);
        String string = this.g == -1 ? this.f.getResources().getString(R.string.no_use) : String.valueOf(this.g + "%");
        this.c.setTextSize(this.f.getResources().getDimension(R.dimen.battery_capacity_font));
        this.c.setTypeface(ao.b(this.f.getAssets()));
        this.c.getTextBounds(string, 0, string.length(), this.h);
        float height = (float) this.h.height();
        canvas.drawText(string, ((float) (getWidth() / 2)) - (((float) this.h.width()) / 2.0f), (((float) getHeight()) * 0.32f) + height, this.c);
        string = this.f.getString(R.string.battery_remaining);
        this.c.setTypeface(ao.a(this.f.getAssets()));
        this.c.setColor(o);
        this.c.setTextSize(this.f.getResources().getDimension(R.dimen.battery_capacity_font_child));
        this.c.getTextBounds(string, 0, string.length(), this.h);
        canvas.drawText(string, ((float) (getWidth() / 2)) - (((float) this.h.width()) / 2.0f), ((height + (((float) getHeight()) * 0.32f)) + ((float) this.h.height())) + (((float) getHeight()) * 0.06f), this.c);
    }

    public void setPercent(int i) {
        this.g = i;
        invalidate();
    }
}
