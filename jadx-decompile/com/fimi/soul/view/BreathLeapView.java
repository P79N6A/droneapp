package com.fimi.soul.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.kernel.utils.p;
import com.fimi.overseas.soul.R;
import com.fimi.soul.view.photodraweeview.c;
import com.google.android.gms.maps.model.b;
import com.tencent.open.yyb.TitleBar;
import it.a.a.e;

public class BreathLeapView extends View {
    private float a;
    private float b;
    private Paint c;
    private Paint d;
    private Paint e;
    private Paint f;
    private Paint g;
    private Paint h;
    private Paint i;
    private Paint j;
    private Paint k;
    private Paint l;
    private Bitmap m;
    private Bitmap n;
    private Bitmap o;
    private int p;
    private float q;

    public BreathLeapView(Context context) {
        super(context, null);
        this.p = 0;
        this.q = 0.0f;
    }

    public BreathLeapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.c = new Paint();
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = new Paint();
        this.h = new Paint();
        this.i = new Paint();
        this.j = new Paint();
        this.k = new Paint();
        this.l = new Paint();
        setBackgroundResource(R.drawable.check_connect_bg);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.connent_on);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.round);
        Bitmap decodeResource3 = BitmapFactory.decodeResource(getResources(), R.drawable.connent);
        float b = ((p.b(context) < ((float) p.a(context)) ? p.b(context) : (float) p.a(context)) * 0.4925f) / ((float) decodeResource3.getHeight());
        Matrix matrix = new Matrix();
        matrix.postScale(b, b);
        this.m = Bitmap.createBitmap(decodeResource3, 0, 0, decodeResource3.getWidth(), decodeResource3.getWidth(), matrix, true);
        this.n = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getWidth(), matrix, true);
        this.o = Bitmap.createBitmap(decodeResource2, 0, 0, decodeResource2.getWidth(), decodeResource2.getWidth(), matrix, true);
        this.q = context.getResources().getDimension(R.dimen.unit);
        if (!(decodeResource == null || decodeResource.isRecycled())) {
            decodeResource.isRecycled();
        }
        if (!(decodeResource2 == null || decodeResource2.isRecycled())) {
            decodeResource2.isRecycled();
        }
        if (decodeResource3 != null && !decodeResource3.isRecycled()) {
            decodeResource3.isRecycled();
        }
    }

    public BreathLeapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = 0;
        this.q = 0.0f;
    }

    private void b() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255, 0});
        ofInt.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ BreathLeapView a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.p = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.invalidate();
            }
        });
        ofInt.setDuration(400);
        ofInt.start();
    }

    private void c() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{255, 255, 50});
        ofInt.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ BreathLeapView a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = 50;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.g.setAlpha(intValue + -155 > 50 ? intValue - 155 : 50);
                this.a.h.setAlpha(intValue + -105 > 50 ? intValue - 100 : 50);
                this.a.i.setAlpha(intValue + -55 > 50 ? intValue - 50 : 50);
                Paint d = this.a.j;
                if (intValue > 50) {
                    i = intValue;
                }
                d.setAlpha(i);
                this.a.invalidate();
            }
        });
        ofInt.setDuration(300);
        ofInt.start();
    }

    public void a() {
        if (!(this.n == null || this.n.isRecycled())) {
            this.n.recycle();
            this.n = null;
        }
        if (!(this.o == null || this.o.isRecycled())) {
            this.o.recycle();
            this.o = null;
        }
        if (this.m != null && !this.m.isRecycled()) {
            this.m.recycle();
            this.m = null;
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.l.setAlpha(this.p);
        canvas.drawBitmap(this.n, (this.a / 2.0f) - ((float) (this.n.getWidth() / 2)), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.n.getHeight() / 2)), this.l);
        canvas.drawBitmap(this.m, (this.a / 2.0f) - ((float) (this.m.getWidth() / 2)), this.b * 0.15f, this.k);
        canvas.drawBitmap(this.o, ((this.a / 2.0f) - ((float) (this.n.getWidth() / 2))) - (this.q * 8.0f), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.j);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) - ((float) (this.n.getWidth() / 2))) - (this.q * 8.0f)) - (this.q * TitleBar.SHAREBTN_RIGHT_MARGIN), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.i);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) - ((float) (this.n.getWidth() / 2))) - (this.q * 8.0f)) - (this.q * TitleBar.BACKBTN_LEFT_MARGIN), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.h);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) - ((float) (this.n.getWidth() / 2))) - (this.q * 8.0f)) - (this.q * b.b), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.g);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) - ((float) (this.n.getWidth() / 2))) - (this.q * 8.0f)) - (this.q * 40.0f), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.f);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) - ((float) (this.n.getWidth() / 2))) - (this.q * 8.0f)) - (this.q * 50.0f), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.e);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) - ((float) (this.n.getWidth() / 2))) - (this.q * 8.0f)) - (this.q * b.c), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.d);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) - ((float) (this.n.getWidth() / 2))) - (this.q * 8.0f)) - (this.q * 70.0f), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.c);
        canvas.drawBitmap(this.o, ((this.a / 2.0f) + ((float) (this.n.getWidth() / 2))) + (this.q * c.a), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.j);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) + ((float) (this.n.getWidth() / 2))) + (this.q * c.a)) + (this.q * TitleBar.SHAREBTN_RIGHT_MARGIN), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.i);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) + ((float) (this.n.getWidth() / 2))) + (this.q * c.a)) + (this.q * TitleBar.BACKBTN_LEFT_MARGIN), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.h);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) + ((float) (this.n.getWidth() / 2))) + (this.q * c.a)) + (this.q * b.b), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.g);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) + ((float) (this.n.getWidth() / 2))) + (this.q * c.a)) + (this.q * 40.0f), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.f);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) + ((float) (this.n.getWidth() / 2))) + (this.q * c.a)) + (this.q * 50.0f), ((this.b * 0.15f) + (((float) this.m.getHeight()) / 2.0f)) - ((float) (this.o.getHeight() / 2)), this.e);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) + ((float) (this.n.getWidth() / 2))) + (this.q * c.a)) + (this.q * b.c), ((this.b * 0.15f) + (((float) this.m.getHeight()) / 2.0f)) - ((float) (this.o.getHeight() / 2)), this.d);
        canvas.drawBitmap(this.o, (((this.a / 2.0f) + ((float) (this.n.getWidth() / 2))) + (this.q * c.a)) + (this.q * 70.0f), ((this.b * 0.15f) + ((float) (this.m.getHeight() / 2))) - ((float) (this.o.getHeight() / 2)), this.c);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a = (float) getMeasuredWidth();
        this.b = (float) getMeasuredHeight();
    }

    public void setting(int i) {
        switch (i) {
            case 0:
                this.c.setAlpha(255);
                this.d.setAlpha(50);
                this.e.setAlpha(50);
                this.f.setAlpha(50);
                this.g.setAlpha(50);
                this.h.setAlpha(50);
                this.i.setAlpha(50);
                this.j.setAlpha(50);
                break;
            case 1:
                this.c.setAlpha(200);
                this.d.setAlpha(255);
                this.e.setAlpha(50);
                this.f.setAlpha(50);
                this.g.setAlpha(50);
                this.h.setAlpha(50);
                this.i.setAlpha(50);
                this.j.setAlpha(50);
                break;
            case 2:
                this.c.setAlpha(150);
                this.d.setAlpha(200);
                this.e.setAlpha(255);
                this.f.setAlpha(50);
                this.g.setAlpha(50);
                this.h.setAlpha(50);
                this.i.setAlpha(50);
                this.j.setAlpha(50);
                break;
            case 3:
                this.c.setAlpha(100);
                this.d.setAlpha(150);
                this.e.setAlpha(200);
                this.f.setAlpha(255);
                this.g.setAlpha(50);
                this.h.setAlpha(50);
                this.i.setAlpha(50);
                this.j.setAlpha(50);
                break;
            case 4:
                this.c.setAlpha(50);
                this.d.setAlpha(100);
                this.e.setAlpha(150);
                this.f.setAlpha(200);
                this.g.setAlpha(255);
                this.h.setAlpha(50);
                this.i.setAlpha(50);
                this.j.setAlpha(50);
                break;
            case 5:
                this.c.setAlpha(50);
                this.d.setAlpha(50);
                this.e.setAlpha(100);
                this.f.setAlpha(150);
                this.g.setAlpha(200);
                this.h.setAlpha(e.G);
                this.i.setAlpha(50);
                this.j.setAlpha(50);
                break;
            case 6:
                this.c.setAlpha(50);
                this.d.setAlpha(50);
                this.e.setAlpha(50);
                this.f.setAlpha(100);
                this.g.setAlpha(150);
                this.h.setAlpha(200);
                this.i.setAlpha(255);
                this.j.setAlpha(50);
                break;
            case 7:
                this.c.setAlpha(50);
                this.d.setAlpha(50);
                this.e.setAlpha(50);
                this.f.setAlpha(50);
                this.g.setAlpha(100);
                this.h.setAlpha(150);
                this.i.setAlpha(200);
                this.j.setAlpha(255);
                b();
                c();
                break;
        }
        invalidate();
    }
}
