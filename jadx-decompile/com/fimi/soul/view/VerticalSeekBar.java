package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;

public class VerticalSeekBar extends View {
    private int a = 1;
    private Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.gimbal_measure);
    private Bitmap c = BitmapFactory.decodeResource(getResources(), R.drawable.gimbal_measure_bg);
    private int d;
    private float e = 1.0f;

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(this.c, 0.0f, 0.0f, null);
        canvas.drawBitmap(this.b, 0.0f, this.e, null);
        super.onDraw(canvas);
    }

    public void setScale(int i) {
        int i2 = 100;
        this.a = i;
        this.d = this.c.getHeight() - this.b.getHeight();
        if (this.a < 1) {
            this.a = 1;
            this.e = 1.0f;
        } else {
            if (this.a <= 100) {
                i2 = this.a;
            }
            this.e = (float) ((i2 * this.d) / 100);
        }
        invalidate();
    }
}
