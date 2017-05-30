package com.fimi.soul.view.myhorizontalseebar;

import android.util.Log;

class a<T extends c<T>>
  implements b<T>
{
  private static final String a = "FinitePool";
  private final d<T> b;
  private final int c;
  private final boolean d;
  private T e;
  private int f;
  
  a(d<T> paramd)
  {
    this.b = paramd;
    this.c = 0;
    this.d = true;
  }
  
  a(d<T> paramd, int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("The pool limit must be > 0");
    }
    this.b = paramd;
    this.c = paramInt;
    this.d = false;
  }
  
  public T a()
  {
    c localc;
    if (this.e != null)
    {
      localc = this.e;
      this.e = ((c)localc.a());
      this.f -= 1;
    }
    for (;;)
    {
      if (localc != null)
      {
        localc.a(null);
        localc.a(false);
        this.b.a(localc);
      }
      return localc;
      localc = this.b.a();
    }
  }
  
  public void a(T paramT)
  {
    if (!paramT.b())
    {
      if ((this.d) || (this.f < this.c))
      {
        this.f += 1;
        paramT.a(this.e);
        paramT.a(true);
        this.e = paramT;
      }
      this.b.b(paramT);
      return;
    }
    Log.w("FinitePool", "Element is already in pool: " + paramT);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/myhorizontalseebar/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */