package com.b.a.b.c;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.b.a.b.a.f;
import com.b.a.b.e.b;

public class c
  implements a
{
  protected final int a;
  protected final int b;
  
  public c(int paramInt)
  {
    this(paramInt, 0);
  }
  
  public c(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void a(Bitmap paramBitmap, com.b.a.b.e.a parama, f paramf)
  {
    if (!(parama instanceof b)) {
      throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
    }
    parama.a(new a(paramBitmap, this.a, this.b));
  }
  
  public static class a
    extends Drawable
  {
    protected final float a;
    protected final int b;
    protected final RectF c = new RectF();
    protected final RectF d;
    protected final BitmapShader e;
    protected final Paint f;
    
    public a(Bitmap paramBitmap, int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.e = new BitmapShader(paramBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
      this.d = new RectF(paramInt2, paramInt2, paramBitmap.getWidth() - paramInt2, paramBitmap.getHeight() - paramInt2);
      this.f = new Paint();
      this.f.setAntiAlias(true);
      this.f.setShader(this.e);
    }
    
    public void draw(Canvas paramCanvas)
    {
      paramCanvas.drawRoundRect(this.c, this.a, this.a, this.f);
    }
    
    public int getOpacity()
    {
      return -3;
    }
    
    protected void onBoundsChange(Rect paramRect)
    {
      super.onBoundsChange(paramRect);
      this.c.set(this.b, this.b, paramRect.width() - this.b, paramRect.height() - this.b);
      paramRect = new Matrix();
      paramRect.setRectToRect(this.d, this.c, Matrix.ScaleToFit.FILL);
      this.e.setLocalMatrix(paramRect);
    }
    
    public void setAlpha(int paramInt)
    {
      this.f.setAlpha(paramInt);
    }
    
    public void setColorFilter(ColorFilter paramColorFilter)
    {
      this.f.setColorFilter(paramColorFilter);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */