package com.fimi.osoul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;
import com.fimi.soul.view.photodraweeview.c;
import com.tencent.open.yyb.TitleBar;

public class Vjampan extends View {
    int a = this.f.getHeight();
    int b = this.f.getWidth();
    float c = getResources().getDisplayMetrics().density;
    private int d = 0;
    private Bitmap e;
    private Bitmap f = BitmapFactory.decodeResource(getResources(), R.drawable.jampan);
    private int g;
    private float h = 1.0f;

    public Vjampan(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(this.f, 0.0f, 0.0f, null);
        Paint paint = new Paint();
        paint.setColor(-256);
        paint.setStyle(Style.FILL);
        paint.setAlpha(100);
        if (this.d >= this.a / 2) {
            canvas.drawRoundRect(new RectF(0.0f, (float) (this.a - this.d), (float) this.b, (float) (this.a / 2)), TitleBar.BACKBTN_LEFT_MARGIN, TitleBar.BACKBTN_LEFT_MARGIN, paint);
        } else if (this.d >= 0 && this.d < this.a / 2) {
            canvas.drawRoundRect(new RectF(0.0f, (float) (this.a / 2), (float) this.b, (float) (this.a - this.d)), TitleBar.BACKBTN_LEFT_MARGIN, TitleBar.BACKBTN_LEFT_MARGIN, paint);
        }
        super.onDraw(canvas);
    }

    public void setScale(int i) {
        if (((double) this.c) == 1.5d) {
            this.d = i * 2;
        } else if (this.c == 2.0f) {
            this.d = i * 3;
        } else if (this.c == c.a) {
            this.d = (int) (((double) i) * 4.5d);
        }
        invalidate();
    }
}
