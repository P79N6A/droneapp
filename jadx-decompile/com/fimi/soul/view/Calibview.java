package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.soul.utils.g;
import com.fimi.soul.view.photodraweeview.c;
import com.google.android.gms.maps.model.b;
import com.tencent.open.yyb.TitleBar;

public class Calibview extends View {
    Context a;
    RectF b;
    private float c;
    private int d = 10;
    private int e = 100;
    private int f = 60;
    private int g;
    private int h;
    private int i;
    private int j;

    public Calibview(Context context) {
        super(context);
        this.a = context;
    }

    public Calibview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        this.c = getResources().getDisplayMetrics().density;
        if (((double) this.c) == 1.5d) {
            this.e = g.a(context, 65.0f);
            this.d = g.a(context, 5.0f);
            this.f = g.a(context, 40.0f);
        } else if (this.c == 2.0f) {
            this.e = g.a(context, 50.0f);
            this.d = g.a(context, 5.0f);
            this.f = g.a(context, b.b);
        } else if (this.c == c.a) {
            this.e = g.a(context, 33.0f);
            this.d = g.a(context, c.a);
            this.f = g.a(context, TitleBar.BACKBTN_LEFT_MARGIN);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Paint paint = new Paint();
        paint.setStrokeWidth(c.a);
        paint.setStyle(Style.STROKE);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        canvas.drawCircle(((float) this.e) * this.c, ((float) this.e) * this.c, ((float) this.f) * this.c, paint);
        paint.setStyle(Style.FILL);
        canvas.drawCircle(((float) this.e) * this.c, ((float) this.e) * this.c, ((float) this.d) * this.c, paint);
        paint.setStyle(Style.STROKE);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(c.a);
        this.b = new RectF(((float) (this.e - this.f)) * this.c, ((float) (this.e - this.d)) * this.c, ((float) (this.e - this.d)) * this.c, ((float) (this.e + this.d)) * this.c);
        canvas.drawRoundRect(this.b, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, paint);
        this.b = new RectF(((float) (this.e - this.d)) * this.c, ((float) (this.e - this.f)) * this.c, ((float) (this.e + this.d)) * this.c, ((float) (this.e - this.d)) * this.c);
        canvas.drawRoundRect(this.b, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, paint);
        this.b = new RectF(((float) (this.e + this.d)) * this.c, ((float) (this.e - this.d)) * this.c, ((float) (this.e + this.f)) * this.c, ((float) (this.e + this.d)) * this.c);
        canvas.drawRoundRect(this.b, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, paint);
        this.b = new RectF(((float) (this.e - this.d)) * this.c, ((float) (this.e + this.d)) * this.c, ((float) (this.e + this.d)) * this.c, ((float) (this.e + this.f)) * this.c);
        canvas.drawRoundRect(this.b, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, paint);
        Paint paint2 = new Paint();
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint2.setTextSize(15.0f * this.c);
        paint2.setTextAlign(Align.CENTER);
        paint.setStrokeWidth(1.0f);
        paint2.setAntiAlias(true);
        canvas.drawText((this.h * 2) + "%", ((float) ((this.e - this.f) - 20)) * this.c, ((float) (this.e + 2)) * this.c, paint2);
        canvas.drawText((this.g * 2) + "%", ((float) this.e) * this.c, ((float) ((this.e - this.f) - 5)) * this.c, paint2);
        canvas.drawText((this.i * 2) + "%", ((float) ((this.e + this.f) + 20)) * this.c, ((float) (this.e + 2)) * this.c, paint2);
        canvas.drawText((this.j * 2) + "%", ((float) this.e) * this.c, ((float) ((this.e + this.f) + 15)) * this.c, paint2);
        paint.setStyle(Style.FILL);
        paint.setColor(-16711936);
        this.b = new RectF(((float) ((this.e - this.d) - this.h)) * this.c, ((float) (this.e - this.d)) * this.c, ((float) (this.e - this.d)) * this.c, ((float) (this.e + this.d)) * this.c);
        canvas.drawRoundRect(this.b, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, paint);
        this.b = new RectF(((float) (this.e - this.d)) * this.c, ((float) ((this.e - this.d) - this.g)) * this.c, ((float) (this.e + this.d)) * this.c, ((float) (this.e - this.d)) * this.c);
        canvas.drawRoundRect(this.b, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, paint);
        this.b = new RectF(((float) (this.e + this.d)) * this.c, ((float) (this.e - this.d)) * this.c, ((float) ((this.e + this.d) + this.i)) * this.c, ((float) (this.e + this.d)) * this.c);
        canvas.drawRoundRect(this.b, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, paint);
        this.b = new RectF(((float) (this.e - this.d)) * this.c, ((float) (this.e + this.d)) * this.c, ((float) (this.e + this.d)) * this.c, ((float) ((this.e + this.d) + this.j)) * this.c);
        canvas.drawRoundRect(this.b, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, this.c * TitleBar.SHAREBTN_RIGHT_MARGIN, paint);
    }
}
