package com.fimi.soul.view.cropimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public abstract class CropViewBase
  extends ImageView
{
  public static final int g = 0;
  public static final int h = 1;
  public static final int i = 2;
  static final float n = 1.25F;
  private static final String o = "ImageViewTouchBase";
  protected Matrix a = new Matrix();
  protected Matrix b = new Matrix();
  public final a c = new a(null);
  int d = -1;
  int e = -1;
  float f;
  protected int j = 0;
  protected Handler k = new Handler();
  protected int l;
  protected int m;
  private final Matrix p = new Matrix();
  private final float[] q = new float[9];
  private a r;
  private Runnable s = null;
  
  public CropViewBase(Context paramContext)
  {
    super(paramContext);
    e();
  }
  
  public CropViewBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    e();
  }
  
  private void a(Bitmap paramBitmap, int paramInt)
  {
    super.setImageBitmap(paramBitmap);
    Object localObject = getDrawable();
    if (localObject != null) {
      ((Drawable)localObject).setDither(true);
    }
    localObject = this.c.b();
    this.c.a(paramBitmap);
    this.c.a(paramInt);
    if ((localObject != null) && (localObject != paramBitmap) && (this.r != null)) {
      this.r.a((Bitmap)localObject);
    }
  }
  
  private void a(a parama, Matrix paramMatrix)
  {
    float f1 = getWidth();
    float f2 = getHeight();
    float f3 = parama.f();
    float f4 = parama.e();
    paramMatrix.reset();
    float f5 = Math.min(Math.min(f1 / f3, 2.0F), Math.min(f2 / f4, 2.0F));
    paramMatrix.postConcat(parama.c());
    paramMatrix.postScale(f5, f5);
    paramMatrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
  }
  
  private void e()
  {
    setScaleType(ImageView.ScaleType.MATRIX);
  }
  
  protected float a(Matrix paramMatrix)
  {
    return a(paramMatrix, 0);
  }
  
  protected float a(Matrix paramMatrix, int paramInt)
  {
    paramMatrix.getValues(this.q);
    return this.q[paramInt];
  }
  
  public void a()
  {
    a(null, true);
  }
  
  protected void a(float paramFloat)
  {
    a(paramFloat, getWidth() / 2.0F, getHeight() / 2.0F);
  }
  
  protected void a(float paramFloat1, float paramFloat2)
  {
    this.b.postTranslate(paramFloat1, paramFloat2);
  }
  
  protected void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = paramFloat1;
    if (paramFloat1 > this.f) {
      f1 = this.f;
    }
    paramFloat1 = f1 / getScale();
    this.b.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
    setImageMatrix(getImageViewMatrix());
    a(true, true);
  }
  
  protected void a(final float paramFloat1, final float paramFloat2, final float paramFloat3, final float paramFloat4)
  {
    paramFloat1 = (paramFloat1 - getScale()) / paramFloat4;
    float f1 = getScale();
    final long l1 = System.currentTimeMillis();
    this.k.post(new Runnable()
    {
      public void run()
      {
        long l = System.currentTimeMillis();
        float f1 = Math.min(paramFloat4, (float)(l - l1));
        float f2 = paramFloat1;
        float f3 = paramFloat2;
        CropViewBase.this.a(f2 + f3 * f1, paramFloat3, this.f);
        if (f1 < paramFloat4) {
          CropViewBase.this.k.post(this);
        }
      }
    });
  }
  
  public void a(Bitmap paramBitmap, boolean paramBoolean)
  {
    a(new a(paramBitmap), paramBoolean);
  }
  
  public void a(final a parama, final boolean paramBoolean)
  {
    if (getWidth() <= 0)
    {
      this.s = new Runnable()
      {
        public void run()
        {
          CropViewBase.this.a(parama, paramBoolean);
        }
      };
      return;
    }
    if (parama.b() != null)
    {
      a(parama, this.a);
      a(parama.b(), parama.a());
    }
    for (;;)
    {
      if (paramBoolean) {
        this.b.reset();
      }
      setImageMatrix(getImageViewMatrix());
      this.f = b();
      return;
      this.a.reset();
      setImageBitmap(null);
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    float f3 = 0.0F;
    if (this.c.b() == null) {
      return;
    }
    Matrix localMatrix = getImageViewMatrix();
    RectF localRectF = new RectF(0.0F, 0.0F, this.c.b().getWidth(), this.c.b().getHeight());
    localMatrix.mapRect(localRectF);
    float f1 = localRectF.height();
    float f4 = localRectF.width();
    int i1;
    if (paramBoolean2)
    {
      i1 = getHeight();
      if (f1 < i1) {
        f1 = (i1 - f1) / 2.0F - localRectF.top;
      }
    }
    for (;;)
    {
      float f2 = f3;
      if (paramBoolean1)
      {
        i1 = getWidth();
        if (f4 >= i1) {
          break label208;
        }
        f2 = (i1 - f4) / 2.0F - localRectF.left;
      }
      for (;;)
      {
        a(f2, f1);
        setImageMatrix(getImageViewMatrix());
        return;
        if (localRectF.top > 0.0F)
        {
          f1 = -localRectF.top;
          break;
        }
        if (localRectF.bottom >= i1) {
          break label259;
        }
        f1 = getHeight() - localRectF.bottom;
        break;
        label208:
        if (localRectF.left > 0.0F)
        {
          f2 = -localRectF.left;
        }
        else
        {
          f2 = f3;
          if (localRectF.right < i1) {
            f2 = i1 - localRectF.right;
          }
        }
      }
      label259:
      f1 = 0.0F;
    }
  }
  
  protected float b()
  {
    if (this.c.b() == null) {}
    float f1;
    do
    {
      return 1.0F;
      f1 = Math.max(this.c.f() / this.d, this.c.e() / this.e) * 4.0F;
    } while (f1 < 1.0F);
    return f1;
  }
  
  protected void b(float paramFloat)
  {
    if (getScale() >= this.f) {}
    while (this.c.b() == null) {
      return;
    }
    float f1 = getWidth() / 2.0F;
    float f2 = getHeight() / 2.0F;
    this.b.postScale(paramFloat, paramFloat, f1, f2);
    setImageMatrix(getImageViewMatrix());
  }
  
  protected void b(float paramFloat1, float paramFloat2)
  {
    a(paramFloat1, paramFloat2);
    setImageMatrix(getImageViewMatrix());
  }
  
  protected void c()
  {
    b(1.25F);
  }
  
  protected void c(float paramFloat)
  {
    if (this.c.b() == null) {
      return;
    }
    float f1 = getWidth() / 2.0F;
    float f2 = getHeight() / 2.0F;
    Matrix localMatrix = new Matrix(this.b);
    localMatrix.postScale(1.0F / paramFloat, 1.0F / paramFloat, f1, f2);
    if (a(localMatrix) < 1.0F) {
      this.b.setScale(1.0F, 1.0F, f1, f2);
    }
    for (;;)
    {
      setImageMatrix(getImageViewMatrix());
      a(true, true);
      return;
      this.b.postScale(1.0F / paramFloat, 1.0F / paramFloat, f1, f2);
    }
  }
  
  protected void d()
  {
    c(1.25F);
  }
  
  protected Matrix getImageViewMatrix()
  {
    this.p.set(this.a);
    this.p.postConcat(this.b);
    return this.p;
  }
  
  public float getScale()
  {
    return a(this.b);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (getScale() > 1.0F))
    {
      a(1.0F);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.d = (paramInt3 - paramInt1);
    this.e = (paramInt4 - paramInt2);
    Runnable localRunnable = this.s;
    if (localRunnable != null)
    {
      this.s = null;
      localRunnable.run();
    }
    if (this.c.b() != null)
    {
      a(this.c, this.a);
      setImageMatrix(getImageViewMatrix());
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    a(paramBitmap, 0);
  }
  
  public void setRecycler(a parama)
  {
    this.r = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a(Bitmap paramBitmap);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/cropimage/CropViewBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */