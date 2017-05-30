package com.google.android.gms.internal;

import android.support.annotation.Nullable;

@aaa
public final class xj
  extends xs.a
{
  private final Object a = new Object();
  private xl.a b;
  private xi c;
  
  public void a()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.v();
      }
      return;
    }
  }
  
  public void a(int paramInt)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.b != null)
        {
          if (paramInt == 3)
          {
            paramInt = 1;
            this.b.a(paramInt);
            this.b = null;
          }
        }
        else {
          return;
        }
      }
      paramInt = 2;
    }
  }
  
  public void a(@Nullable xi paramxi)
  {
    synchronized (this.a)
    {
      this.c = paramxi;
      return;
    }
  }
  
  public void a(xl.a parama)
  {
    synchronized (this.a)
    {
      this.b = parama;
      return;
    }
  }
  
  public void a(xt paramxt)
  {
    synchronized (this.a)
    {
      if (this.b != null)
      {
        this.b.a(0, paramxt);
        this.b = null;
        return;
      }
      if (this.c != null) {
        this.c.z();
      }
      return;
    }
  }
  
  public void b()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.w();
      }
      return;
    }
  }
  
  public void c()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.x();
      }
      return;
    }
  }
  
  public void d()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.y();
      }
      return;
    }
  }
  
  public void e()
  {
    synchronized (this.a)
    {
      if (this.b != null)
      {
        this.b.a(0);
        this.b = null;
        return;
      }
      if (this.c != null) {
        this.c.z();
      }
      return;
    }
  }
  
  public void f()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.A();
      }
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */