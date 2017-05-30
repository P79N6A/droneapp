package com.fimi.soul.module.droneFragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.g;
import com.google.android.gms.maps.model.b;
import com.tencent.open.yyb.TitleBar;
import java.util.Iterator;

public class SectorProgressBar extends View {
    private static int d = 944;
    private static final int e = 10;
    boolean a = true;
    float b = 0.0f;
    ObjectAnimator c;
    private Bitmap f = null;
    private float g = 0.0f;
    private float h = 40.0f;
    private RectF i = null;
    private PorterDuffXfermode j = null;
    private Paint k;
    private a l = a.LeftBottom;
    private int m;
    private int n;
    private boolean o = false;
    private Context p;
    private float q = 0.0f;
    private float r = 0.0f;
    private AnimatorSet s;

    public enum a {
        LeftTop,
        LeftBottom,
        RightTop,
        RightBottom,
        RightToplow,
        RightBottomSatt
    }

    public SectorProgressBar(Context context) {
        super(context);
        this.p = context;
        c();
    }

    public SectorProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = context;
        c();
    }

    public SectorProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = context;
        c();
    }

    private void c() {
        this.r = getResources().getDisplayMetrics().density;
        this.k = new Paint();
        this.k.setAntiAlias(true);
        setLayerType(2, this.k);
        d = (getResources().getDisplayMetrics().widthPixels / 2) - g.b(this.p, 16.0f);
        setSectorProgressBarType(this.l);
    }

    public void a() {
        if (this.s != null) {
            Iterator it = this.s.getChildAnimations().iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).cancel();
            }
            this.s.cancel();
            this.s = null;
        }
    }

    public void a(float f) {
        if (this.c == null) {
            this.c = new ObjectAnimator();
            this.c.setTarget(this);
            this.c.setPropertyName("float");
            this.c.setEvaluator(new FloatEvaluator());
            this.c.addUpdateListener(new AnimatorUpdateListener(this) {
                final /* synthetic */ SectorProgressBar a;

                {
                    this.a = r1;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.a.postInvalidate();
                }
            });
        }
        if (!this.c.isRunning()) {
            this.c.setObjectValues(new Object[]{Float.valueOf(this.b), Float.valueOf(f)});
            this.b = f;
            this.c.setDuration(200);
            this.c.start();
        }
    }

    public void a(int i, int i2) {
        Animator ofObject = ObjectAnimator.ofObject(this, "float", new FloatEvaluator(), new Object[]{Integer.valueOf(i2), Integer.valueOf(100)});
        this.b = this.q;
        ofObject.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ SectorProgressBar a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.a.invalidate();
            }
        });
        Animator ofObject2 = ObjectAnimator.ofObject(this, "float", new FloatEvaluator(), new Object[]{Integer.valueOf(100), Integer.valueOf(i2)});
        ofObject2.setInterpolator(new OvershootInterpolator());
        ofObject2.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ SectorProgressBar a;

            {
                this.a = r1;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.a.invalidate();
            }
        });
        this.s = new AnimatorSet();
        this.s.play(ofObject2).after(ofObject);
        this.s.setDuration((long) i);
        this.s.start();
    }

    public void b() {
        if (this.c != null) {
            this.c.cancel();
            this.c = null;
        }
    }

    public float getProgress() {
        return this.q;
    }

    public a getSectorProgressBarType() {
        return this.l;
    }

    protected void onDraw(Canvas canvas) {
        float f;
        this.m = canvas.getWidth();
        this.n = canvas.getHeight();
        if (!this.o) {
            c();
            this.o = true;
        }
        switch (this.l) {
            case RightToplow:
                this.j = new PorterDuffXfermode(Mode.SRC_OUT);
                f = (((-this.q) / 100.0f) * 50.0f) + 50.0f;
                break;
            case LeftBottom:
                this.j = new PorterDuffXfermode(Mode.SRC_OUT);
                f = (((-this.q) / 100.0f) * 50.0f) + 50.0f;
                break;
            case RightBottomSatt:
                this.j = new PorterDuffXfermode(Mode.SRC_IN);
                f = (this.q / 100.0f) * 50.0f;
                break;
            case RightBottom:
                this.j = new PorterDuffXfermode(Mode.SRC_IN);
                f = (this.q / 100.0f) * 50.0f;
                break;
            case RightTop:
                this.j = new PorterDuffXfermode(Mode.SRC_OUT);
                f = (((-this.q) / 100.0f) * 50.0f) + 50.0f;
                break;
            case LeftTop:
                this.j = new PorterDuffXfermode(Mode.SRC_IN);
                f = (this.q / 100.0f) * 50.0f;
                break;
            default:
                f = 0.0f;
                break;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        canvas.drawArc(this.i, this.g, this.h + f, true, this.k);
        this.k.setXfermode(this.j);
        canvas.drawBitmap(this.f, null, rectF, this.k);
        if (this.f != null && this.f.isRecycled()) {
            this.f.recycle();
        }
        this.k.setXfermode(null);
        if (this.a) {
            this.a = false;
            a(100.0f);
        }
    }

    public void setProgress(float f) {
        this.q = f;
    }

    public void setSectorProgressBarType(a aVar) {
        switch (aVar) {
            case RightToplow:
                this.i = new RectF((float) ((this.m - 10) - (d * 2)), (float) ((-d) + this.n), (float) (this.m - 10), (float) (d + this.n));
                this.f = BitmapFactory.decodeResource(getResources(), R.drawable.lowpower);
                this.g = -90.0f;
                this.h = 40.0f;
                break;
            case LeftBottom:
                this.i = new RectF(TitleBar.SHAREBTN_RIGHT_MARGIN, (float) (-d), (float) ((d * 2) + 10), (float) d);
                this.f = BitmapFactory.decodeResource(getResources(), R.drawable.distance);
                this.g = 90.0f;
                this.h = 40.0f;
                break;
            case RightBottomSatt:
                this.i = new RectF((float) ((this.m - 10) - (d * 2)), (float) (-d), (float) (this.m - 10), (float) d);
                this.f = BitmapFactory.decodeResource(getResources(), R.drawable.gpssign);
                this.g = 0.0f;
                this.h = 0.0f;
                break;
            case RightBottom:
                this.i = new RectF((float) ((this.m - 10) - (d * 2)), (float) (-d), (float) (this.m - 10), (float) d);
                this.f = BitmapFactory.decodeResource(getResources(), R.drawable.sign);
                this.g = 0.0f;
                this.h = 0.0f;
                break;
            case RightTop:
                this.i = new RectF((float) ((this.m - 10) - (d * 2)), (float) ((-d) + this.n), (float) (this.m - 10), (float) (d + this.n));
                this.f = BitmapFactory.decodeResource(getResources(), R.drawable.fullpower);
                this.g = -90.0f;
                this.h = 40.0f;
                break;
            case LeftTop:
                this.i = new RectF(TitleBar.SHAREBTN_RIGHT_MARGIN, (float) ((-d) + this.n), (float) ((d * 2) + 10), (float) (this.n + d));
                this.f = BitmapFactory.decodeResource(getResources(), R.drawable.hight);
                this.g = b.e;
                this.h = 0.0f;
                break;
        }
        this.l = aVar;
    }
}
