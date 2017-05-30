package com.android.volley;

public class d
  implements r
{
  public static final int a = 2500;
  public static final int b = 0;
  public static final float c = 1.0F;
  private int d;
  private int e;
  private final int f;
  private final float g;
  
  public d()
  {
    this(2500, 0, 1.0F);
  }
  
  public d(int paramInt1, int paramInt2, float paramFloat)
  {
    this.d = paramInt1;
    this.f = paramInt2;
    this.g = paramFloat;
  }
  
  public int a()
  {
    return this.d;
  }
  
  public void a(u paramu)
  {
    this.e += 1;
    this.d = ((int)(this.d + this.d * this.g));
    if (!d()) {
      throw paramu;
    }
  }
  
  public int b()
  {
    return this.e;
  }
  
  public float c()
  {
    return this.g;
  }
  
  protected boolean d()
  {
    return this.e <= this.f;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */