package com.fimi.soul.module.a.a.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class f extends View {
    private static final int a = 6;
    private static final int b = 14;
    private static final int c = 52;
    private int d;
    private int e;

    public f(Context context) {
        super(context);
    }

    public void a(int i, int i2) {
        if (i != this.e) {
            this.e = i;
            postInvalidate();
        }
    }

    protected void onDraw(Canvas canvas) {
        if (this.d <= 1) {
            setVisibility(8);
            return;
        }
        float height = (float) getHeight();
        float f = (6.0f * height) / 52.0f;
        float f2 = (14.0f * height) / 52.0f;
        float width = (((float) getWidth()) - (((f * 2.0f) * ((float) this.d)) + (((float) (this.d - 1)) * f2))) / 2.0f;
        float f3 = height / 2.0f;
        canvas.drawColor(-1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        for (int i = 0; i < this.d; i++) {
            if (i == this.e) {
                paint.setColor(-10653280);
            } else {
                paint.setColor(-5262921);
            }
            canvas.drawCircle((((f * 2.0f) + f2) * ((float) i)) + width, f3, f, paint);
        }
    }

    public void setScreenCount(int i) {
        this.d = i;
    }
}
