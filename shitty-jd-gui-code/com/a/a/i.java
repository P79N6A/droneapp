package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

class i
  extends k
{
  private int g;
  private int h;
  private int i;
  private boolean j = true;
  
  public i(j.b... paramVarArgs)
  {
    super(paramVarArgs);
  }
  
  public i a()
  {
    ArrayList localArrayList = this.e;
    int m = this.e.size();
    j.b[] arrayOfb = new j.b[m];
    int k = 0;
    while (k < m)
    {
      arrayOfb[k] = ((j.b)((j)localArrayList.get(k)).f());
      k += 1;
    }
    return new i(arrayOfb);
  }
  
  public Object a(float paramFloat)
  {
    return Integer.valueOf(b(paramFloat));
  }
  
  public int b(float paramFloat)
  {
    int k = 1;
    float f1;
    if (this.a == 2)
    {
      if (this.j)
      {
        this.j = false;
        this.g = ((j.b)this.e.get(0)).g();
        this.h = ((j.b)this.e.get(1)).g();
        this.i = (this.h - this.g);
      }
      f1 = paramFloat;
      if (this.d != null) {
        f1 = this.d.getInterpolation(paramFloat);
      }
      if (this.f == null) {
        return this.g + (int)(this.i * f1);
      }
      return ((Number)this.f.a(f1, Integer.valueOf(this.g), Integer.valueOf(this.h))).intValue();
    }
    j.b localb;
    int m;
    float f2;
    float f3;
    if (paramFloat <= 0.0F)
    {
      localObject = (j.b)this.e.get(0);
      localb = (j.b)this.e.get(1);
      k = ((j.b)localObject).g();
      m = localb.g();
      f2 = ((j.b)localObject).c();
      f3 = localb.c();
      localObject = localb.d();
      f1 = paramFloat;
      if (localObject != null) {
        f1 = ((Interpolator)localObject).getInterpolation(paramFloat);
      }
      paramFloat = (f1 - f2) / (f3 - f2);
      if (this.f == null) {
        return (int)(paramFloat * (m - k)) + k;
      }
      return ((Number)this.f.a(paramFloat, Integer.valueOf(k), Integer.valueOf(m))).intValue();
    }
    if (paramFloat >= 1.0F)
    {
      localObject = (j.b)this.e.get(this.a - 2);
      localb = (j.b)this.e.get(this.a - 1);
      k = ((j.b)localObject).g();
      m = localb.g();
      f2 = ((j.b)localObject).c();
      f3 = localb.c();
      localObject = localb.d();
      f1 = paramFloat;
      if (localObject != null) {
        f1 = ((Interpolator)localObject).getInterpolation(paramFloat);
      }
      paramFloat = (f1 - f2) / (f3 - f2);
      if (this.f == null) {
        return (int)(paramFloat * (m - k)) + k;
      }
      return ((Number)this.f.a(paramFloat, Integer.valueOf(k), Integer.valueOf(m))).intValue();
    }
    for (Object localObject = (j.b)this.e.get(0); k < this.a; localObject = localb)
    {
      localb = (j.b)this.e.get(k);
      if (paramFloat < localb.c())
      {
        Interpolator localInterpolator = localb.d();
        f1 = paramFloat;
        if (localInterpolator != null) {
          f1 = localInterpolator.getInterpolation(paramFloat);
        }
        paramFloat = (f1 - ((j.b)localObject).c()) / (localb.c() - ((j.b)localObject).c());
        k = ((j.b)localObject).g();
        m = localb.g();
        if (this.f == null) {
          return (int)((m - k) * paramFloat) + k;
        }
        return ((Number)this.f.a(paramFloat, Integer.valueOf(k), Integer.valueOf(m))).intValue();
      }
      k += 1;
    }
    return ((Number)((j)this.e.get(this.a - 1)).b()).intValue();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */