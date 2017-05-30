package com.fimi.soul.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;

public class MidView extends View {
    public static final int c = 1;
    public static final int d = 2;
    private int A;
    float a = 50.0f;
    float b = 50.0f;
    private Bitmap e;
    private Bitmap f;
    private Bitmap g;
    private Bitmap h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float o;
    private float p;
    private float q;
    private Point r;
    private Point s;
    private Point t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public MidView(Context context) {
        super(context);
    }

    public MidView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.mycircleView);
        this.u = obtainStyledAttributes.getInteger(0, 0);
        setType(this.u);
        obtainStyledAttributes.recycle();
    }

    public MidView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(float f, float f2) {
        if (this.a != f || this.b != f2) {
            this.o = ((float) ((this.i / 2) - (this.k / 2))) / 50.0f;
            this.a = f;
            this.b = f2;
            invalidate();
        }
    }

    public void a(Bitmap... bitmapArr) {
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null && bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(-1);
        canvas.drawBitmap(this.e, 0.0f, 0.0f, paint);
        canvas.drawBitmap(this.g, (float) ((this.i / 2) - (this.m / 2)), (float) ((this.j / 2) - (this.n / 2)), paint);
        this.x = g.a((float) (this.i / 2), (float) (this.i / 2), (this.a * this.p) + ((float) this.k), (this.b * this.q) + ((float) this.k));
        if (this.x <= this.y) {
            canvas.drawBitmap(this.f, ((this.a * this.p) + ((float) (this.i / 2))) - ((float) (this.h.getWidth() / 2)), ((this.b * this.q) + ((float) (this.i / 2))) - ((float) (this.h.getHeight() / 2)), paint);
            return;
        }
        this.s = g.a(this.r, new Point((int) ((this.a * this.p) + ((float) this.k)), (int) ((this.b * this.q) + ((float) this.k))), this.y);
        if (this.s.x < (this.i / 2) - (this.h.getWidth() / 2)) {
            this.s.x = (this.i / 2) - (this.h.getWidth() / 2);
        }
        if (this.u == 1 && this.s.x > this.h.getWidth() - (this.k / 2)) {
            this.s.x = this.h.getWidth() - (this.k / 2);
        }
        if (this.s.y < (this.i / 2) - (this.h.getHeight() / 2)) {
            this.s.y = (this.i / 2) - (this.h.getHeight() / 2);
        }
        canvas.drawBitmap(this.f, (float) this.s.x, (float) this.s.y, paint);
        a(this.e, this.f, this.g, this.h);
    }

    public void setType(int i) {
        if (i == 1) {
            this.e = BitmapFactory.decodeResource(getResources(), R.drawable.icon_calibration_remote_control_samll);
            this.f = BitmapFactory.decodeResource(getResources(), R.drawable.icon_calibration_annulus_samll);
            this.g = BitmapFactory.decodeResource(getResources(), R.drawable.icon_calibration_circle_samll);
            this.h = BitmapFactory.decodeResource(getResources(), R.drawable.bg_calibration_remote_control_square_samll);
        } else if (i == 2) {
            this.e = BitmapFactory.decodeResource(getResources(), R.drawable.bg_calibration_remote_control_square_line);
            this.f = BitmapFactory.decodeResource(getResources(), R.drawable.calibration_annulus);
            this.g = BitmapFactory.decodeResource(getResources(), R.drawable.calibration_circle);
            this.h = BitmapFactory.decodeResource(getResources(), R.drawable.remoterocefbg);
        }
        this.m = this.g.getWidth();
        this.n = this.g.getHeight();
        this.i = this.e.getWidth();
        this.j = this.e.getHeight();
        this.k = this.f.getWidth();
        this.l = this.f.getHeight();
        this.y = ((int) Math.sqrt(Math.pow((double) (this.h.getWidth() / 2), 2.0d) + Math.pow((double) (this.h.getHeight() / 2), 2.0d))) - (this.k / 2);
        this.r = new Point((this.i / 2) - (this.k / 2), (this.j / 2) - (this.k / 2));
        this.z = g.a((float) (this.k / 2), (float) (this.l / 2), (float) (this.i / 2), (float) (this.j / 2));
        this.p = ((float) ((this.h.getWidth() / 2) - (this.k / 2))) / 50.0f;
        this.q = ((float) ((this.h.getHeight() / 2) - (this.k / 2))) / 50.0f;
    }
}
