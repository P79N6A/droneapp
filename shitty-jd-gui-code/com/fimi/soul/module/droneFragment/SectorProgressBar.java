package com.fimi.soul.module.droneFragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.fimi.soul.utils.g;
import java.util.ArrayList;
import java.util.Iterator;

public class SectorProgressBar
  extends View
{
  private static int d = 944;
  private static final int e = 10;
  boolean a = true;
  float b = 0.0F;
  ObjectAnimator c;
  private Bitmap f = null;
  private float g = 0.0F;
  private float h = 40.0F;
  private RectF i = null;
  private PorterDuffXfermode j = null;
  private Paint k;
  private a l = a.b;
  private int m;
  private int n;
  private boolean o = false;
  private Context p;
  private float q = 0.0F;
  private float r = 0.0F;
  private AnimatorSet s;
  
  public SectorProgressBar(Context paramContext)
  {
    super(paramContext);
    this.p = paramContext;
    c();
  }
  
  public SectorProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.p = paramContext;
    c();
  }
  
  public SectorProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.p = paramContext;
    c();
  }
  
  private void c()
  {
    this.r = getResources().getDisplayMetrics().density;
    this.k = new Paint();
    this.k.setAntiAlias(true);
    setLayerType(2, this.k);
    d = getResources().getDisplayMetrics().widthPixels / 2 - g.b(this.p, 16.0F);
    setSectorProgressBarType(this.l);
  }
  
  public void a()
  {
    if (this.s != null)
    {
      Iterator localIterator = this.s.getChildAnimations().iterator();
      while (localIterator.hasNext()) {
        ((Animator)localIterator.next()).cancel();
      }
      this.s.cancel();
      this.s = null;
    }
  }
  
  public void a(float paramFloat)
  {
    if (this.c == null)
    {
      this.c = new ObjectAnimator();
      this.c.setTarget(this);
      this.c.setPropertyName("float");
      this.c.setEvaluator(new FloatEvaluator());
      this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          SectorProgressBar.a(SectorProgressBar.this, ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
          SectorProgressBar.this.postInvalidate();
        }
      });
    }
    if (!this.c.isRunning())
    {
      this.c.setObjectValues(new Object[] { Float.valueOf(this.b), Float.valueOf(paramFloat) });
      this.b = paramFloat;
      this.c.setDuration(200L);
      this.c.start();
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofObject(this, "float", new FloatEvaluator(), new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(100) });
    this.b = this.q;
    localObjectAnimator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        SectorProgressBar.a(SectorProgressBar.this, ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
        SectorProgressBar.this.invalidate();
      }
    });
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofObject(this, "float", new FloatEvaluator(), new Object[] { Integer.valueOf(100), Integer.valueOf(paramInt2) });
    localObjectAnimator2.setInterpolator(new OvershootInterpolator());
    localObjectAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        SectorProgressBar.a(SectorProgressBar.this, ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
        SectorProgressBar.this.invalidate();
      }
    });
    this.s = new AnimatorSet();
    this.s.play(localObjectAnimator2).after(localObjectAnimator1);
    this.s.setDuration(paramInt1);
    this.s.start();
  }
  
  public void b()
  {
    if (this.c != null)
    {
      this.c.cancel();
      this.c = null;
    }
  }
  
  public float getProgress()
  {
    return this.q;
  }
  
  public a getSectorProgressBarType()
  {
    return this.l;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    this.m = paramCanvas.getWidth();
    this.n = paramCanvas.getHeight();
    if (!this.o)
    {
      c();
      this.o = true;
    }
    float f1;
    switch (4.a[this.l.ordinal()])
    {
    default: 
      f1 = 0.0F;
    }
    for (;;)
    {
      RectF localRectF = new RectF(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight());
      paramCanvas.drawArc(this.i, this.g, this.h + f1, true, this.k);
      this.k.setXfermode(this.j);
      paramCanvas.drawBitmap(this.f, null, localRectF, this.k);
      if ((this.f != null) && (this.f.isRecycled())) {
        this.f.recycle();
      }
      this.k.setXfermode(null);
      if (this.a)
      {
        this.a = false;
        a(100.0F);
      }
      return;
      this.j = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
      f1 = -this.q / 100.0F * 50.0F + 50.0F;
      continue;
      this.j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
      f1 = this.q / 100.0F * 50.0F;
      continue;
      this.j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
      f1 = this.q / 100.0F * 50.0F;
      continue;
      this.j = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
      f1 = -this.q / 100.0F * 50.0F + 50.0F;
      continue;
      this.j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
      f1 = this.q / 100.0F * 50.0F;
      continue;
      this.j = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
      f1 = -this.q / 100.0F * 50.0F + 50.0F;
    }
  }
  
  public void setProgress(float paramFloat)
  {
    this.q = paramFloat;
  }
  
  public void setSectorProgressBarType(a parama)
  {
    switch (4.a[parama.ordinal()])
    {
    }
    for (;;)
    {
      this.l = parama;
      return;
      this.i = new RectF(this.m - 10 - d * 2, -d + this.n, this.m - 10, d + this.n);
      this.f = BitmapFactory.decodeResource(getResources(), 2130838275);
      this.g = -90.0F;
      this.h = 40.0F;
      continue;
      this.i = new RectF(10.0F, -d, d * 2 + 10, d);
      this.f = BitmapFactory.decodeResource(getResources(), 2130837876);
      this.g = 90.0F;
      this.h = 40.0F;
      continue;
      this.i = new RectF(this.m - 10 - d * 2, -d, this.m - 10, d);
      this.f = BitmapFactory.decodeResource(getResources(), 2130837966);
      this.g = 0.0F;
      this.h = 0.0F;
      continue;
      this.i = new RectF(this.m - 10 - d * 2, -d, this.m - 10, d);
      this.f = BitmapFactory.decodeResource(getResources(), 2130838520);
      this.g = 0.0F;
      this.h = 0.0F;
      continue;
      this.i = new RectF(this.m - 10 - d * 2, -d + this.n, this.m - 10, d + this.n);
      this.f = BitmapFactory.decodeResource(getResources(), 2130837956);
      this.g = -90.0F;
      this.h = 40.0F;
      continue;
      this.i = new RectF(10.0F, -d + this.n, d * 2 + 10, this.n + d);
      this.f = BitmapFactory.decodeResource(getResources(), 2130837975);
      this.g = 180.0F;
      this.h = 0.0F;
    }
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/SectorProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */