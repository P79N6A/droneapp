package com.fimi.soul.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.kernel.utils.p;
import com.fimi.overseas.soul.R;

public class TranslationView extends View {
    private static final float q = 0.25f;
    private Camera a;
    private Matrix b;
    private float c;
    private float d;
    private float e;
    private int f;
    private Paint g;
    private Paint h;
    private Paint i;
    private Bitmap j;
    private int k;
    private AnimatorSet l;
    private Bitmap m;
    private Bitmap n;
    private float o;
    private float p;

    public TranslationView(Context context) {
        this(context, null);
    }

    public TranslationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.a = new Camera();
        this.b = new Matrix();
        Options options = new Options();
        float b = p.b(context) < ((float) p.a(context)) ? p.b(context) : (float) p.a(context);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.usb_plane_start);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.usb_plane_end);
        b = ((b * 1004.0f) / 1080.0f) / ((float) decodeResource2.getWidth());
        Matrix matrix = new Matrix();
        matrix.postScale(b, b);
        this.m = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true);
        this.n = Bitmap.createBitmap(decodeResource2, 0, 0, decodeResource2.getWidth(), decodeResource2.getHeight(), matrix, true);
        this.j = BitmapFactory.decodeResource(getResources(), R.drawable.check_connect_bg);
        this.a.save();
        this.a.translate(0.0f, 0.0f, 500.0f);
        this.a.getMatrix(this.b);
        this.a.restore();
        decodeResource = Bitmap.createBitmap(this.m, 0, 0, this.m.getWidth(), this.m.getHeight(), this.b, true);
        this.o = (float) decodeResource.getWidth();
        this.p = ((float) this.m.getWidth()) / ((float) decodeResource.getWidth());
        this.g = new Paint();
        this.i = new Paint();
        this.i.setAlpha(255);
        this.h = new Paint();
    }

    public TranslationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0.0f;
        this.f = 0;
        this.k = 500;
    }

    public void a() {
        this.c = ((float) (-getMeasuredHeight())) * q;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0;
        this.i.setAlpha(0);
        this.g.setAlpha(255);
        invalidate();
    }

    public void a(int i) {
        this.k = i;
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{((float) (-getMeasuredHeight())) * q, (((float) (getMeasuredWidth() / 2)) - (this.o / 2.0f)) * this.p});
        ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ TranslationView a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.a.invalidate();
            }
        });
        Animator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (-getHeight())) * 0.2444f});
        ofFloat2.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ TranslationView a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        Animator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 500.0f});
        ofFloat3.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ TranslationView a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        Animator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
        ofInt.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ TranslationView a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.i.setAlpha(this.a.f / 2);
                this.a.g.setAlpha(255 - this.a.f);
            }
        });
        this.l = new AnimatorSet();
        this.l.setDuration((long) this.k);
        this.l.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofInt);
        this.l.start();
    }

    public void b() {
        if (this.l.isStarted()) {
            this.l.cancel();
            a();
        }
    }

    public void c() {
        if (!(this.n == null || this.n.isRecycled())) {
            this.n = null;
        }
        if (!(this.m == null || this.m.isRecycled())) {
            this.m = null;
        }
        if (this.j != null && !this.j.isRecycled()) {
            this.j = null;
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.save();
        this.a.translate(this.c, this.d, this.e);
        this.a.getMatrix(this.b);
        this.a.restore();
        this.h.setAlpha(this.f);
        canvas.drawBitmap(this.j, null, new Rect(0, 0, getWidth(), getHeight()), this.h);
        canvas.drawBitmap(this.m, this.b, this.g);
        canvas.drawBitmap(this.n, this.b, this.i);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = ((float) (-getMeasuredHeight())) * q;
        this.d = 0.0f;
        this.e = 0.0f;
    }

    public void setDuration(int i) {
        this.k = i;
    }
}
