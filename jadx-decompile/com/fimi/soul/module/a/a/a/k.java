package com.fimi.soul.module.a.a.a;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;

public class k extends ImageView {
    private float a;

    public k(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas) {
        canvas.rotate(this.a, (float) (getWidth() / 2), (float) (getHeight() / 2));
        super.onDraw(canvas);
    }

    public void setRotation(float f) {
        this.a = f;
        invalidate();
    }
}
