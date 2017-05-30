package com.fimi.soul.view.circle;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

public class a extends Drawable {
    public static final String a = "CircleDrawable";
    protected final Paint b;
    protected final int c;
    protected final BitmapShader d;
    protected float e;
    protected Bitmap f;

    public a(Bitmap bitmap) {
        this(bitmap, 0);
    }

    public a(Bitmap bitmap, int i) {
        this.c = i;
        this.f = bitmap;
        this.d = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
        this.b = new Paint();
        this.b.setAntiAlias(true);
        this.b.setShader(this.d);
    }

    public void a() {
        Rect bounds = getBounds();
        if (bounds != null) {
            Matrix matrix = new Matrix();
            float width = ((float) bounds.width()) / ((float) this.f.getWidth());
            float height = ((float) bounds.height()) / ((float) this.f.getHeight());
            if (width <= height) {
                width = height;
            }
            matrix.postScale(width, width);
            this.d.setLocalMatrix(matrix);
        }
    }

    public void b() {
        Rect bounds = getBounds();
        this.e = bounds.width() < bounds.height() ? (((float) bounds.width()) / 2.0f) - ((float) this.c) : (((float) bounds.height()) / 2.0f) - ((float) this.c);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(((float) bounds.width()) / 2.0f, ((float) bounds.height()) / 2.0f, this.e, this.b);
    }

    public int getOpacity() {
        return -3;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
        b();
    }

    public void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
