package com.fimi.soul.view.cropimage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class a
{
  public static final String a = "RotateBitmap";
  private Bitmap b;
  private int c;
  
  public a(Bitmap paramBitmap)
  {
    this.b = paramBitmap;
    this.c = 0;
  }
  
  public a(Bitmap paramBitmap, int paramInt)
  {
    this.b = paramBitmap;
    this.c = (paramInt % 360);
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.b = paramBitmap;
  }
  
  public Bitmap b()
  {
    return this.b;
  }
  
  public Matrix c()
  {
    Matrix localMatrix = new Matrix();
    if (this.c != 0)
    {
      int i = this.b.getWidth() / 2;
      int j = this.b.getHeight() / 2;
      localMatrix.preTranslate(-i, -j);
      localMatrix.postRotate(this.c);
      localMatrix.postTranslate(f() / 2, e() / 2);
    }
    return localMatrix;
  }
  
  public boolean d()
  {
    return this.c / 90 % 2 != 0;
  }
  
  public int e()
  {
    if (d()) {
      return this.b.getWidth();
    }
    return this.b.getHeight();
  }
  
  public int f()
  {
    if (d()) {
      return this.b.getHeight();
    }
    return this.b.getWidth();
  }
  
  public void g()
  {
    if (this.b != null)
    {
      this.b.recycle();
      this.b = null;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/cropimage/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */