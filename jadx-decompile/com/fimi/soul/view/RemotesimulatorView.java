package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.g;

public class RemotesimulatorView extends View {
    private Bitmap a;
    private Bitmap b;
    private Bitmap c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k = 512;
    private RectF l;
    private int m;
    private int n;
    private float o;
    private float p;
    private int q = 8;
    private Context r;
    private int[] s = new int[]{Color.parseColor("#00FE5400"), Color.parseColor("#FE5400")};
    private Paint t;
    private int u;
    private int v;

    public RemotesimulatorView(Context context) {
        super(context);
    }

    public RemotesimulatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = context;
        this.a = BitmapFactory.decodeResource(getResources(), R.drawable.img_playback_rc_bg);
        this.b = BitmapFactory.decodeResource(getResources(), R.drawable.img_playback_rc_scale);
        this.c = BitmapFactory.decodeResource(getResources(), R.drawable.img_palyback_rc_focus);
        this.q = g.a(context, (float) this.q);
        this.d = (float) this.q;
        this.g = (this.d + ((float) (this.b.getWidth() / 2))) - ((float) (this.c.getWidth() / 2));
        this.e = (float) ((this.a.getHeight() / 2) - (this.b.getWidth() / 2));
        this.f = ((float) (this.a.getWidth() - this.b.getWidth())) - this.d;
        this.i = (float) ((this.a.getHeight() / 2) - (this.c.getWidth() / 2));
        this.h = (((float) (this.a.getWidth() - (this.b.getWidth() / 2))) - this.d) - ((float) (this.c.getWidth() / 2));
        this.t = new Paint();
        this.t.setAntiAlias(true);
        this.t.setColor(-1);
    }

    public RemotesimulatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static double a(float f, float f2, int i, int i2) {
        int abs = Math.abs((int) (f - ((float) i)));
        int abs2 = Math.abs((int) (f2 - ((float) i2)));
        return (double) Math.round((float) ((Math.acos(((double) abs2) / Math.sqrt((double) ((abs * abs) + (abs2 * abs2)))) / 3.141592653589793d) * 180.0d));
    }

    private void a(Bitmap... bitmapArr) {
        for (Bitmap bitmap : bitmapArr) {
            if (!(bitmap == null || bitmap.isRecycled())) {
                bitmap.recycle();
            }
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        int sqrt;
        double d = 0.0d;
        if (i2 <= this.k && i4 >= this.k) {
            sqrt = (int) Math.sqrt(Math.pow((double) (i4 - this.k), 2.0d) + Math.pow((double) (this.k - i2), 2.0d));
            if (sqrt != 0) {
                d = a(0.0f, 0.0f, i4 - this.k, this.k - i2);
            }
        } else if (i2 <= this.k && i4 < this.k) {
            sqrt = (int) Math.sqrt(Math.pow((double) (this.k - i4), 2.0d) + Math.pow((double) (this.k - i2), 2.0d));
            if (sqrt != 0) {
                d = 360.0d - a(0.0f, 0.0f, this.k - i4, this.k - i2);
            }
        } else if (i2 <= this.k || i4 < this.k) {
            sqrt = (int) Math.sqrt(Math.pow((double) (this.k - i4), 2.0d) + Math.pow((double) (i2 - this.k), 2.0d));
            if (sqrt != 0) {
                d = 180.0d + a(0.0f, 0.0f, this.k - i4, i2 - this.k);
            }
        } else {
            sqrt = (int) Math.sqrt(Math.pow((double) (i4 - this.k), 2.0d) + Math.pow((double) (i2 - this.k), 2.0d));
            if (sqrt != 0) {
                d = 180.0d - a(0.0f, 0.0f, i4 - this.k, i2 - this.k);
            }
        }
        if (sqrt > this.k) {
            sqrt = this.k;
        }
        this.m = sqrt;
        this.o = (float) d;
        d = 0.0d;
        if (i3 <= this.k && i >= this.k) {
            sqrt = (int) Math.sqrt(Math.pow((double) (i - this.k), 2.0d) + Math.pow((double) (this.k - i3), 2.0d));
            if (sqrt != 0) {
                d = -a(0.0f, 0.0f, i - this.k, this.k - i3);
            }
        } else if (i3 <= this.k && i < this.k) {
            sqrt = (int) Math.sqrt(Math.pow((double) (this.k - i), 2.0d) + Math.pow((double) (this.k - i3), 2.0d));
            if (sqrt != 0) {
                d = a(0.0f, 0.0f, this.k - i, this.k - i3);
            }
        } else if (i3 <= this.k || i < this.k) {
            sqrt = (int) Math.sqrt(Math.pow((double) (this.k - i), 2.0d) + Math.pow((double) (i3 - this.k), 2.0d));
            if (sqrt != 0) {
                d = 180.0d + a(0.0f, 0.0f, this.k - i, i3 - this.k);
            }
        } else {
            sqrt = (int) Math.sqrt(Math.pow((double) (i - this.k), 2.0d) + Math.pow((double) (i3 - this.k), 2.0d));
            if (sqrt != 0) {
                d = 180.0d + a(0.0f, 0.0f, i - this.k, i3 - this.k);
            }
        }
        if (sqrt > this.k) {
            sqrt = this.k;
        }
        this.n = sqrt;
        this.p = (float) d;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.j = (float) ((((double) getHeight()) * 0.06111d) / ((double) this.k));
        this.u = (int) (((double) getHeight()) * 0.74074d);
        this.v = (int) (((double) getWidth()) * 0.73229d);
        canvas.drawBitmap(this.a, (float) this.v, (float) this.u, this.t);
        canvas.drawBitmap(this.b, this.d + ((float) this.v), this.e + ((float) this.u), this.t);
        canvas.drawBitmap(this.b, this.f + ((float) this.v), this.e + ((float) this.u), this.t);
        this.t.setColor(Color.parseColor("#FE5400"));
        this.t.setShader(new LinearGradient(this.g + ((float) this.v), (float) ((this.a.getHeight() / 2) + this.u), (this.g + ((float) this.c.getWidth())) + ((float) this.v), (((float) (this.a.getHeight() / 2)) - (((float) this.m) * this.j)) + ((float) this.u), this.s, null, TileMode.MIRROR));
        this.l = new RectF(this.g + ((float) this.v), (((float) (this.a.getHeight() / 2)) - (((float) this.m) * this.j)) + ((float) this.u), (this.g + ((float) this.c.getWidth())) + ((float) this.v), (float) ((this.a.getHeight() / 2) + this.u));
        Matrix matrix = new Matrix();
        matrix.postRotate(this.o, (this.g + ((float) (this.c.getWidth() / 2))) + ((float) this.v), (this.i + ((float) (this.c.getWidth() / 2))) + ((float) this.u));
        canvas.setMatrix(matrix);
        canvas.drawRoundRect(this.l, (float) (this.c.getWidth() / 2), (float) (this.c.getWidth() / 2), this.t);
        matrix.setRotate(0.0f);
        canvas.setMatrix(matrix);
        this.t.setShader(new LinearGradient(this.h + ((float) this.v), (float) ((this.a.getHeight() / 2) + this.u), (this.h + ((float) this.c.getWidth())) + ((float) this.v), (((float) (this.a.getHeight() / 2)) - (((float) this.n) * this.j)) + ((float) this.u), this.s, null, TileMode.MIRROR));
        this.l = new RectF(this.h + ((float) this.v), (((float) (this.a.getHeight() / 2)) - (((float) this.n) * this.j)) + ((float) this.u), (this.h + ((float) this.c.getWidth())) + ((float) this.v), (float) ((this.a.getHeight() / 2) + this.u));
        matrix.postRotate(this.p, (this.h + ((float) (this.c.getWidth() / 2))) + ((float) this.v), (this.i + ((float) (this.c.getWidth() / 2))) + ((float) this.u));
        canvas.setMatrix(matrix);
        canvas.drawRoundRect(this.l, (float) (this.c.getWidth() / 2), (float) (this.c.getWidth() / 2), this.t);
        matrix.setRotate(0.0f);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(this.c, this.g + ((float) this.v), this.i + ((float) this.u), this.t);
        canvas.drawBitmap(this.c, this.h + ((float) this.v), this.i + ((float) this.u), this.t);
    }
}
