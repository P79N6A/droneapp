package com.b.a.b.c;

import android.graphics.Bitmap;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.b.a.b.a.f;
import com.b.a.b.e.a;
import com.b.a.b.e.b;

public class d
  extends c
{
  public d(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public void a(Bitmap paramBitmap, a parama, f paramf)
  {
    if (!(parama instanceof b)) {
      throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
    }
    parama.a(new a(paramBitmap, this.a, this.b));
  }
  
  protected static class a
    extends c.a
  {
    a(Bitmap paramBitmap, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
    }
    
    protected void onBoundsChange(Rect paramRect)
    {
      super.onBoundsChange(paramRect);
      float f1 = this.c.centerX();
      float f2 = this.c.centerY() * 1.0F / 0.7F;
      float f3 = this.c.centerX();
      paramRect = Shader.TileMode.CLAMP;
      paramRect = new RadialGradient(f1, f2, f3 * 1.3F, new int[] { 0, 0, 2130706432 }, new float[] { 0.0F, 0.7F, 1.0F }, paramRect);
      Matrix localMatrix = new Matrix();
      localMatrix.setScale(1.0F, 0.7F);
      paramRect.setLocalMatrix(localMatrix);
      this.f.setShader(new ComposeShader(this.e, paramRect, PorterDuff.Mode.SRC_OVER));
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */