package com.fimi.soul.view;

import android.graphics.Point;

class g
{
  public static double a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    paramInt1 = Math.abs((int)(paramFloat1 - paramInt1));
    paramInt2 = Math.abs((int)(paramFloat2 - paramInt2));
    double d = Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
    return Math.round((float)(Math.asin(paramInt2 / d) / 3.141592653589793D * 180.0D));
  }
  
  public static float a(Point paramPoint1, Point paramPoint2)
  {
    float f1 = paramPoint2.x - paramPoint1.x;
    float f2 = paramPoint2.y - paramPoint1.y;
    f1 = (float)Math.acos(f1 / (float)Math.sqrt(f2 * f2 + f1 * f1));
    if (paramPoint2.y < paramPoint1.y) {}
    for (int i = -1;; i = 1) {
      return i * f1;
    }
  }
  
  public static int a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (int)Math.sqrt(Math.pow(paramFloat1 - paramFloat3, 2.0D) + Math.pow(paramFloat2 - paramFloat4, 2.0D));
  }
  
  public static Point a(Point paramPoint1, Point paramPoint2, int paramInt)
  {
    float f = a(paramPoint1, paramPoint2);
    int i = paramPoint1.x;
    int j = (int)(paramInt * Math.cos(f));
    int k = paramPoint1.x;
    return new Point(i + j, (int)(paramInt * Math.sin(f)) + k);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */