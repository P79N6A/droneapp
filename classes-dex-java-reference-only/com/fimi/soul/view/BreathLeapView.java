package com.fimi.soul.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.kernel.utils.p;

public class BreathLeapView
  extends View
{
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
  private int p = 0;
  private float q = 0.0F;
  
  public BreathLeapView(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public BreathLeapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
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
    setBackgroundResource(2130837823);
    paramAttributeSet = BitmapFactory.decodeResource(getResources(), 2130837857);
    Bitmap localBitmap1 = BitmapFactory.decodeResource(getResources(), 2130838465);
    Bitmap localBitmap2 = BitmapFactory.decodeResource(getResources(), 2130837856);
    if (p.b(paramContext) < p.a(paramContext)) {}
    for (float f1 = p.b(paramContext);; f1 = p.a(paramContext))
    {
      f1 = f1 * 0.4925F / localBitmap2.getHeight();
      Matrix localMatrix = new Matrix();
      localMatrix.postScale(f1, f1);
      this.m = Bitmap.createBitmap(localBitmap2, 0, 0, localBitmap2.getWidth(), localBitmap2.getWidth(), localMatrix, true);
      this.n = Bitmap.createBitmap(paramAttributeSet, 0, 0, paramAttributeSet.getWidth(), paramAttributeSet.getWidth(), localMatrix, true);
      this.o = Bitmap.createBitmap(localBitmap1, 0, 0, localBitmap1.getWidth(), localBitmap1.getWidth(), localMatrix, true);
      this.q = paramContext.getResources().getDimension(2131296517);
      if ((paramAttributeSet != null) && (!paramAttributeSet.isRecycled())) {
        paramAttributeSet.isRecycled();
      }
      if ((localBitmap1 != null) && (!localBitmap1.isRecycled())) {
        localBitmap1.isRecycled();
      }
      if ((localBitmap2 != null) && (!localBitmap2.isRecycled())) {
        localBitmap2.isRecycled();
      }
      return;
    }
  }
  
  public BreathLeapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void b()
  {
    ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { 0, 255, 0 });
    localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        BreathLeapView.a(BreathLeapView.this, ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue());
        BreathLeapView.this.invalidate();
      }
    });
    localValueAnimator.setDuration(400L);
    localValueAnimator.start();
  }
  
  private void c()
  {
    ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { 255, 255, 50 });
    localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        int k = 50;
        int j = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
        paramAnonymousValueAnimator = BreathLeapView.a(BreathLeapView.this);
        if (j - 155 > 50)
        {
          i = j - 155;
          paramAnonymousValueAnimator.setAlpha(i);
          paramAnonymousValueAnimator = BreathLeapView.b(BreathLeapView.this);
          if (j - 105 <= 50) {
            break label136;
          }
          i = j - 100;
          label66:
          paramAnonymousValueAnimator.setAlpha(i);
          paramAnonymousValueAnimator = BreathLeapView.c(BreathLeapView.this);
          if (j - 55 <= 50) {
            break label142;
          }
        }
        label136:
        label142:
        for (int i = j - 50;; i = 50)
        {
          paramAnonymousValueAnimator.setAlpha(i);
          paramAnonymousValueAnimator = BreathLeapView.d(BreathLeapView.this);
          i = k;
          if (j > 50) {
            i = j;
          }
          paramAnonymousValueAnimator.setAlpha(i);
          BreathLeapView.this.invalidate();
          return;
          i = 50;
          break;
          i = 50;
          break label66;
        }
      }
    });
    localValueAnimator.setDuration(300L);
    localValueAnimator.start();
  }
  
  public void a()
  {
    if ((this.n != null) && (!this.n.isRecycled()))
    {
      this.n.recycle();
      this.n = null;
    }
    if ((this.o != null) && (!this.o.isRecycled()))
    {
      this.o.recycle();
      this.o = null;
    }
    if ((this.m != null) && (!this.m.isRecycled()))
    {
      this.m.recycle();
      this.m = null;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.l.setAlpha(this.p);
    paramCanvas.drawBitmap(this.n, this.a / 2.0F - this.n.getWidth() / 2, this.b * 0.15F + this.m.getHeight() / 2 - this.n.getHeight() / 2, this.l);
    paramCanvas.drawBitmap(this.m, this.a / 2.0F - this.m.getWidth() / 2, this.b * 0.15F, this.k);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F - this.n.getWidth() / 2 - this.q * 8.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.j);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F - this.n.getWidth() / 2 - this.q * 8.0F - this.q * 10.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.i);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F - this.n.getWidth() / 2 - this.q * 8.0F - this.q * 20.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.h);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F - this.n.getWidth() / 2 - this.q * 8.0F - this.q * 30.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.g);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F - this.n.getWidth() / 2 - this.q * 8.0F - this.q * 40.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.f);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F - this.n.getWidth() / 2 - this.q * 8.0F - this.q * 50.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.e);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F - this.n.getWidth() / 2 - this.q * 8.0F - this.q * 60.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.d);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F - this.n.getWidth() / 2 - this.q * 8.0F - this.q * 70.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.c);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F + this.n.getWidth() / 2 + this.q * 3.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.j);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F + this.n.getWidth() / 2 + this.q * 3.0F + this.q * 10.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.i);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F + this.n.getWidth() / 2 + this.q * 3.0F + this.q * 20.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.h);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F + this.n.getWidth() / 2 + this.q * 3.0F + this.q * 30.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.g);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F + this.n.getWidth() / 2 + this.q * 3.0F + this.q * 40.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.f);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F + this.n.getWidth() / 2 + this.q * 3.0F + this.q * 50.0F, this.b * 0.15F + this.m.getHeight() / 2.0F - this.o.getHeight() / 2, this.e);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F + this.n.getWidth() / 2 + this.q * 3.0F + this.q * 60.0F, this.b * 0.15F + this.m.getHeight() / 2.0F - this.o.getHeight() / 2, this.d);
    paramCanvas.drawBitmap(this.o, this.a / 2.0F + this.n.getWidth() / 2 + this.q * 3.0F + this.q * 70.0F, this.b * 0.15F + this.m.getHeight() / 2 - this.o.getHeight() / 2, this.c);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.a = getMeasuredWidth();
    this.b = getMeasuredHeight();
  }
  
  public void setting(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      invalidate();
      return;
      this.c.setAlpha(255);
      this.d.setAlpha(50);
      this.e.setAlpha(50);
      this.f.setAlpha(50);
      this.g.setAlpha(50);
      this.h.setAlpha(50);
      this.i.setAlpha(50);
      this.j.setAlpha(50);
      continue;
      this.c.setAlpha(200);
      this.d.setAlpha(255);
      this.e.setAlpha(50);
      this.f.setAlpha(50);
      this.g.setAlpha(50);
      this.h.setAlpha(50);
      this.i.setAlpha(50);
      this.j.setAlpha(50);
      continue;
      this.c.setAlpha(150);
      this.d.setAlpha(200);
      this.e.setAlpha(255);
      this.f.setAlpha(50);
      this.g.setAlpha(50);
      this.h.setAlpha(50);
      this.i.setAlpha(50);
      this.j.setAlpha(50);
      continue;
      this.c.setAlpha(100);
      this.d.setAlpha(150);
      this.e.setAlpha(200);
      this.f.setAlpha(255);
      this.g.setAlpha(50);
      this.h.setAlpha(50);
      this.i.setAlpha(50);
      this.j.setAlpha(50);
      continue;
      this.c.setAlpha(50);
      this.d.setAlpha(100);
      this.e.setAlpha(150);
      this.f.setAlpha(200);
      this.g.setAlpha(255);
      this.h.setAlpha(50);
      this.i.setAlpha(50);
      this.j.setAlpha(50);
      continue;
      this.c.setAlpha(50);
      this.d.setAlpha(50);
      this.e.setAlpha(100);
      this.f.setAlpha(150);
      this.g.setAlpha(200);
      this.h.setAlpha(250);
      this.i.setAlpha(50);
      this.j.setAlpha(50);
      continue;
      this.c.setAlpha(50);
      this.d.setAlpha(50);
      this.e.setAlpha(50);
      this.f.setAlpha(100);
      this.g.setAlpha(150);
      this.h.setAlpha(200);
      this.i.setAlpha(255);
      this.j.setAlpha(50);
      continue;
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
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/BreathLeapView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */