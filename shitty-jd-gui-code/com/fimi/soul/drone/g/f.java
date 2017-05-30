package com.fimi.soul.drone.g;

import android.os.Handler;

public class f
{
  public boolean a;
  public boolean b;
  private int c;
  private Handler d;
  private Runnable e;
  private Runnable f;
  
  public f(int paramInt)
  {
    this.c = paramInt;
    this.d = new Handler();
  }
  
  public f(int paramInt, Runnable paramRunnable)
  {
    this.c = paramInt;
    a(paramRunnable);
    this.d = new Handler();
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(int paramInt, Runnable paramRunnable)
  {
    this.b = true;
    if (this.a) {
      return;
    }
    this.c = paramInt;
    a(paramRunnable);
    this.d.postDelayed(this.f, this.c);
    this.a = true;
  }
  
  public void a(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return;
    }
    this.e = paramRunnable;
    this.f = new Runnable()
    {
      public void run()
      {
        if (f.a(f.this) == null) {
          return;
        }
        f.a(f.this).run();
        f.d(f.this).postDelayed(f.b(f.this), f.c(f.this));
      }
    };
  }
  
  public boolean b()
  {
    return this.a;
  }
  
  public void c()
  {
    this.d.removeCallbacks(this.f);
    this.a = false;
    this.d.postDelayed(this.f, this.c);
    this.a = true;
  }
  
  public void d()
  {
    if (this.a) {
      return;
    }
    this.d.postDelayed(this.f, this.c);
    this.a = true;
  }
  
  public void e()
  {
    this.d.removeCallbacks(this.f);
    this.a = false;
  }
  
  public void f()
  {
    this.d.removeCallbacks(this.e);
    this.d.removeCallbacks(this.f);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */