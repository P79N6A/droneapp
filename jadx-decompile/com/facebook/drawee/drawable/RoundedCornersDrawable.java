package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;

public class RoundedCornersDrawable extends ForwardingDrawable implements Rounded {
    @VisibleForTesting
    int mBorderColor = 0;
    @VisibleForTesting
    float mBorderWidth = 0.0f;
    @VisibleForTesting
    boolean mIsCircle = false;
    @VisibleForTesting
    int mOverlayColor = 0;
    @VisibleForTesting
    final Paint mPaint = new Paint(1);
    private final Path mPath = new Path();
    @VisibleForTesting
    final float[] mRadii = new float[8];
    private final RectF mTempRectangle = new RectF();
    @VisibleForTesting
    Type mType = Type.OVERLAY_COLOR;

    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) Preconditions.checkNotNull(drawable));
    }

    private void updatePath() {
        this.mPath.reset();
        this.mTempRectangle.set(getBounds());
        this.mTempRectangle.inset(this.mBorderWidth / 2.0f, this.mBorderWidth / 2.0f);
        if (this.mIsCircle) {
            this.mPath.addCircle(this.mTempRectangle.centerX(), this.mTempRectangle.centerY(), Math.min(this.mTempRectangle.width(), this.mTempRectangle.height()) / 2.0f, Direction.CW);
        } else {
            this.mPath.addRoundRect(this.mTempRectangle, this.mRadii, Direction.CW);
        }
        this.mTempRectangle.inset((-this.mBorderWidth) / 2.0f, (-this.mBorderWidth) / 2.0f);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        switch (this.mType) {
            case CLIPPING:
                int save = canvas.save();
                this.mPath.setFillType(FillType.EVEN_ODD);
                canvas.clipPath(this.mPath);
                super.draw(canvas);
                canvas.restoreToCount(save);
                break;
            case OVERLAY_COLOR:
                super.draw(canvas);
                this.mPaint.setColor(this.mOverlayColor);
                this.mPaint.setStyle(Style.FILL);
                this.mPath.setFillType(FillType.INVERSE_EVEN_ODD);
                canvas.drawPath(this.mPath, this.mPaint);
                if (this.mIsCircle) {
                    float width = (((float) (bounds.width() - bounds.height())) + this.mBorderWidth) / 2.0f;
                    float height = (((float) (bounds.height() - bounds.width())) + this.mBorderWidth) / 2.0f;
                    if (width > 0.0f) {
                        canvas.drawRect((float) bounds.left, (float) bounds.top, ((float) bounds.left) + width, (float) bounds.bottom, this.mPaint);
                        canvas.drawRect(((float) bounds.right) - width, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.mPaint);
                    }
                    if (height > 0.0f) {
                        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, ((float) bounds.top) + height, this.mPaint);
                        canvas.drawRect((float) bounds.left, ((float) bounds.bottom) - height, (float) bounds.right, (float) bounds.bottom, this.mPaint);
                        break;
                    }
                }
                break;
        }
        if (this.mBorderColor != 0) {
            this.mPaint.setStyle(Style.STROKE);
            this.mPaint.setColor(this.mBorderColor);
            this.mPaint.setStrokeWidth(this.mBorderWidth);
            this.mPath.setFillType(FillType.EVEN_ODD);
            canvas.drawPath(this.mPath, this.mPaint);
        }
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updatePath();
    }

    public void setBorder(int i, float f) {
        this.mBorderColor = i;
        this.mBorderWidth = f;
        updatePath();
        invalidateSelf();
    }

    public void setCircle(boolean z) {
        this.mIsCircle = z;
        updatePath();
        invalidateSelf();
    }

    public void setOverlayColor(int i) {
        this.mOverlayColor = i;
        invalidateSelf();
    }

    public void setRadii(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.mRadii, 0.0f);
        } else {
            Preconditions.checkArgument(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.mRadii, 0, 8);
        }
        updatePath();
        invalidateSelf();
    }

    public void setRadius(float f) {
        Arrays.fill(this.mRadii, f);
        updatePath();
        invalidateSelf();
    }

    public void setType(Type type) {
        this.mType = type;
        invalidateSelf();
    }
}
