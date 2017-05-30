package com.fimi.soul.view;

import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
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

public class TranslationView
  extends View
{
  private static final float q = 0.25F;
  private Camera a;
  private Matrix b;
  private float c;
  private float d;
  private float e = 0.0F;
  private int f = 0;
  private Paint g;
  private Paint h;
  private Paint i;
  private Bitmap j;
  private int k = 500;
  private AnimatorSet l;
  private Bitmap m;
  private Bitmap n;
  private float o;
  private float p;
  
  public TranslationView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TranslationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.a = new Camera();
    this.b = new Matrix();
    new BitmapFactory.Options();
    if (p.b(paramContext) < p.a(paramContext)) {}
    for (float f1 = p.b(paramContext);; f1 = p.a(paramContext))
    {
      paramContext = BitmapFactory.decodeResource(getResources(), 2130838605);
      paramAttributeSet = BitmapFactory.decodeResource(getResources(), 2130838604);
      f1 = f1 * 1004.0F / 1080.0F / paramAttributeSet.getWidth();
      Matrix localMatrix = new Matrix();
      localMatrix.postScale(f1, f1);
      this.m = Bitmap.createBitmap(paramContext, 0, 0, paramContext.getWidth(), paramContext.getHeight(), localMatrix, true);
      this.n = Bitmap.createBitmap(paramAttributeSet, 0, 0, paramAttributeSet.getWidth(), paramAttributeSet.getHeight(), localMatrix, true);
      this.j = BitmapFactory.decodeResource(getResources(), 2130837823);
      this.a.save();
      this.a.translate(0.0F, 0.0F, 500.0F);
      this.a.getMatrix(this.b);
      this.a.restore();
      paramContext = Bitmap.createBitmap(this.m, 0, 0, this.m.getWidth(), this.m.getHeight(), this.b, true);
      this.o = paramContext.getWidth();
      this.p = (this.m.getWidth() / paramContext.getWidth());
      this.g = new Paint();
      this.i = new Paint();
      this.i.setAlpha(255);
      this.h = new Paint();
      return;
    }
  }
  
  public TranslationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a()
  {
    this.c = (-getMeasuredHeight() * 0.25F);
    this.d = 0.0F;
    this.e = 0.0F;
    this.f = 0;
    this.i.setAlpha(0);
    this.g.setAlpha(255);
    invalidate();
  }
  
  public void a(int paramInt)
  {
    this.k = paramInt;
    ValueAnimator localValueAnimator1 = ValueAnimator.ofFloat(new float[] { -getMeasuredHeight() * 0.25F, (getMeasuredWidth() / 2 - this.o / 2.0F) * this.p });
    localValueAnimator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        TranslationView.a(TranslationView.this, ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
        TranslationView.this.invalidate();
      }
    });
    ValueAnimator localValueAnimator2 = ValueAnimator.ofFloat(new float[] { 0.0F, -getHeight() * 0.2444F });
    localValueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        TranslationView.b(TranslationView.this, ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
      }
    });
    ValueAnimator localValueAnimator3 = ValueAnimator.ofFloat(new float[] { 0.0F, 500.0F });
    localValueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        TranslationView.c(TranslationView.this, ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
      }
    });
    ValueAnimator localValueAnimator4 = ValueAnimator.ofInt(new int[] { 0, 255 });
    localValueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        TranslationView.a(TranslationView.this, ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue());
        TranslationView.b(TranslationView.this).setAlpha(TranslationView.a(TranslationView.this) / 2);
        TranslationView.c(TranslationView.this).setAlpha(255 - TranslationView.a(TranslationView.this));
      }
    });
    this.l = new AnimatorSet();
    this.l.setDuration(this.k);
    this.l.play(localValueAnimator1).with(localValueAnimator2).with(localValueAnimator3).with(localValueAnimator4);
    this.l.start();
  }
  
  public void b()
  {
    if (this.l.isStarted())
    {
      this.l.cancel();
      a();
    }
  }
  
  public void c()
  {
    if ((this.n != null) && (!this.n.isRecycled())) {
      this.n = null;
    }
    if ((this.m != null) && (!this.m.isRecycled())) {
      this.m = null;
    }
    if ((this.j != null) && (!this.j.isRecycled())) {
      this.j = null;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.a.save();
    this.a.translate(this.c, this.d, this.e);
    this.a.getMatrix(this.b);
    this.a.restore();
    this.h.setAlpha(this.f);
    Rect localRect = new Rect(0, 0, getWidth(), getHeight());
    paramCanvas.drawBitmap(this.j, null, localRect, this.h);
    paramCanvas.drawBitmap(this.m, this.b, this.g);
    paramCanvas.drawBitmap(this.n, this.b, this.i);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.c = (-getMeasuredHeight() * 0.25F);
    this.d = 0.0F;
    this.e = 0.0F;
  }
  
  public void setDuration(int paramInt)
  {
    this.k = paramInt;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/TranslationView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */