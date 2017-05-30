package com.fimi.soul.view.circle;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

public class a
  extends Drawable
{
  public static final String a = "CircleDrawable";
  protected final Paint b;
  protected final int c;
  protected final BitmapShader d;
  protected float e;
  protected Bitmap f;
  
  public a(Bitmap paramBitmap)
  {
    this(paramBitmap, 0);
  }
  
  public a(Bitmap paramBitmap, int paramInt)
  {
    this.c = paramInt;
    this.f = paramBitmap;
    this.d = new BitmapShader(paramBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.b = new Paint();
    this.b.setAntiAlias(true);
    this.b.setShader(this.d);
  }
  
  public void a()
  {
    Rect localRect = getBounds();
    if (localRect == null) {
      return;
    }
    Matrix localMatrix = new Matrix();
    float f1 = localRect.width() / this.f.getWidth();
    float f2 = localRect.height() / this.f.getHeight();
    if (f1 > f2) {}
    for (;;)
    {
      localMatrix.postScale(f1, f1);
      this.d.setLocalMatrix(localMatrix);
      return;
      f1 = f2;
    }
  }
  
  public void b()
  {
    Rect localRect = getBounds();
    if (localRect.width() < localRect.height()) {}
    for (float f1 = localRect.width() / 2.0F - this.c;; f1 = localRect.height() / 2.0F - this.c)
    {
      this.e = f1;
      return;
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    paramCanvas.drawCircle(localRect.width() / 2.0F, localRect.height() / 2.0F, this.e, this.b);
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    a();
    b();
  }
  
  public void setAlpha(int paramInt)
  {
    this.b.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.b.setColorFilter(paramColorFilter);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/circle/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */