package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class ProgressBarDrawable extends Drawable {
    private int mBackgroundColor = Integer.MIN_VALUE;
    private int mBarWidth = 20;
    private int mColor = -2147450625;
    private boolean mHideWhenZero = false;
    private int mLevel = 0;
    private int mPadding = 10;
    private final Paint mPaint = new Paint(1);

    private void drawBar(Canvas canvas, int i, int i2) {
        Rect bounds = getBounds();
        int width = ((bounds.width() - (this.mPadding * 2)) * i) / 10000;
        int i3 = bounds.left + this.mPadding;
        int i4 = (bounds.bottom - this.mPadding) - this.mBarWidth;
        this.mPaint.setColor(i2);
        canvas.drawRect((float) i3, (float) i4, (float) (width + i3), (float) (i4 + this.mBarWidth), this.mPaint);
    }

    public void draw(Canvas canvas) {
        if (!this.mHideWhenZero || this.mLevel != 0) {
            drawBar(canvas, 10000, this.mBackgroundColor);
            drawBar(canvas, this.mLevel, this.mColor);
        }
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getBarWidth() {
        return this.mBarWidth;
    }

    public int getColor() {
        return this.mColor;
    }

    public boolean getHideWhenZero() {
        return this.mHideWhenZero;
    }

    public int getOpacity() {
        return DrawableUtils.getOpacityFromColor(this.mPaint.getColor());
    }

    public boolean getPadding(Rect rect) {
        rect.set(this.mPadding, this.mPadding, this.mPadding, this.mPadding);
        return this.mPadding != 0;
    }

    protected boolean onLevelChange(int i) {
        this.mLevel = i;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public void setBackgroundColor(int i) {
        if (this.mBackgroundColor != i) {
            this.mBackgroundColor = i;
            invalidateSelf();
        }
    }

    public void setBarWidth(int i) {
        if (this.mBarWidth != i) {
            this.mBarWidth = i;
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        if (this.mColor != i) {
            this.mColor = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public void setHideWhenZero(boolean z) {
        this.mHideWhenZero = z;
    }

    public void setPadding(int i) {
        if (this.mPadding != i) {
            this.mPadding = i;
            invalidateSelf();
        }
    }
}
