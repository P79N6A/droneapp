package com.fimi.soul.view;

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

public class RemoteRocker extends View {
    private static final float h = 0.2373f;
    private static final float i = 0.228f;
    private Paint a;
    private Bitmap b;
    private Paint c;
    private RectF d;
    private RectF e;
    private RectF f;
    private RectF g;
    private float j = -90.0f;
    private a k;
    private float l = 0.0f;
    private float m = 0.0f;
    private float n = 0.0f;
    private float o = 0.0f;

    public enum a {
        LEFT,
        RIGHT
    }

    public RemoteRocker(Context context) {
        super(context);
        b();
    }

    public RemoteRocker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public RemoteRocker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        this.a = new Paint();
        this.c = new Paint();
    }

    public void a() {
        if (this.b != null) {
            this.b.recycle();
            this.b = null;
            System.gc();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        if (this.b == null) {
            setRemoteRocker(this.k);
        }
        canvas.drawBitmap(this.b, null, rectF, this.a);
        canvas.drawArc(this.d, this.j, this.l, false, this.c);
        canvas.drawArc(this.e, this.j, this.m, false, this.c);
        canvas.drawArc(this.f, this.j, this.o, false, this.c);
        canvas.drawArc(this.g, this.j, this.n, false, this.c);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c.setStrokeWidth(((float) getWidth()) * 0.0046499968f);
        this.c.setColor(-14172853);
        this.c.setAntiAlias(true);
        this.c.setStyle(Style.STROKE);
        this.d = new RectF(((float) (getWidth() / 2)) - ((((float) getWidth()) * i) / 2.0f), (((float) getWidth()) * 0.0092999935f) / 2.0f, ((float) (getWidth() / 2)) + ((((float) getWidth()) * i) / 2.0f), ((float) getWidth()) * 0.23265f);
        this.e = new RectF((((float) getWidth()) * 0.0092999935f) / 2.0f, ((float) (getWidth() / 2)) - ((((float) getWidth()) * i) / 2.0f), ((float) getWidth()) * 0.23265f, (((float) getWidth()) / 2.0f) + ((((float) getWidth()) * i) / 2.0f));
        this.f = new RectF(((float) getWidth()) - (((float) getWidth()) * 0.23265f), ((float) (getWidth() / 2)) - ((((float) getWidth()) * i) / 2.0f), ((float) getWidth()) - (((float) getWidth()) * 0.0046499968f), (((float) getWidth()) / 2.0f) + ((((float) getWidth()) * i) / 2.0f));
        this.g = new RectF(((float) (getWidth() / 2)) - ((((float) getWidth()) * i) / 2.0f), ((float) getWidth()) - (((float) getWidth()) * 0.23265f), ((float) (getWidth() / 2)) + ((((float) getWidth()) * i) / 2.0f), ((float) getWidth()) - ((((float) getWidth()) * 0.0092999935f) / 2.0f));
    }

    public void setBottomSweepAngle(float f) {
        this.o = f;
        if (this.m < 360.0f) {
            this.m = 0.0f;
        }
        if (this.n < 360.0f) {
            this.n = 0.0f;
        }
        if (this.l < 360.0f) {
            this.l = 0.0f;
        }
        invalidate();
    }

    public void setLeftSweepAngle(float f) {
        this.m = f;
        if (this.l < 360.0f) {
            this.l = 0.0f;
        }
        if (this.n < 360.0f) {
            this.n = 0.0f;
        }
        if (this.o < 360.0f) {
            this.o = 0.0f;
        }
        invalidate();
    }

    public void setRemoteRocker(a aVar) {
        this.k = aVar;
        switch (aVar) {
            case LEFT:
                this.b = BitmapFactory.decodeResource(getResources(), R.drawable.newbie_left_rocker_bg);
                return;
            case RIGHT:
                this.b = BitmapFactory.decodeResource(getResources(), R.drawable.newbie_right_rocker_bg);
                return;
            default:
                return;
        }
    }

    public void setRightSweepAngle(float f) {
        this.n = f;
        if (this.m < 360.0f) {
            this.m = 0.0f;
        }
        if (this.l < 360.0f) {
            this.l = 0.0f;
        }
        if (this.o < 360.0f) {
            this.o = 0.0f;
        }
        invalidate();
    }

    public void setTopSweepAngle(float f) {
        this.l = f;
        if (this.m < 360.0f) {
            this.m = 0.0f;
        }
        if (this.n < 360.0f) {
            this.n = 0.0f;
        }
        if (this.o < 360.0f) {
            this.o = 0.0f;
        }
        invalidate();
    }
}
