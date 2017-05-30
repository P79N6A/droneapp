package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;

public class MediaImageLoadingView extends View {
    private Paint a;
    private float b;

    public MediaImageLoadingView(Context context) {
        this(context, null);
        c();
    }

    public MediaImageLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        c();
    }

    public MediaImageLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    private void c() {
        setBackgroundResource(R.drawable.download_circle_bg);
        this.a = new Paint();
        this.a.setAntiAlias(true);
        this.a.setStrokeWidth(2.0f);
        this.a.setStyle(Style.STROKE);
    }

    public void a() {
        this.a.setColor(getResources().getColor(R.color.loading_blue));
        invalidate();
    }

    public void b() {
        this.a.setColor(getResources().getColor(R.color.loading_hot));
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(new RectF(2.0f, 2.0f, (float) (getWidth() - 2), (float) (getWidth() - 2)), -90.0f, this.b, false, this.a);
    }

    public void setPaintColor(int i) {
        this.a.setColor(i);
    }

    public void setSweepAngle(float f) {
        this.b = 3.6f * f;
        invalidate();
    }
}
