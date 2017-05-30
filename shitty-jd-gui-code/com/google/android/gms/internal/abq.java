package com.google.android.gms.internal;

import java.util.concurrent.Future;

@aaa
public abstract class abq
  implements abx<Future>
{
  private final Runnable a = new abq.1(this);
  private volatile Thread b;
  private boolean c;
  
  public abq()
  {
    this.c = false;
  }
  
  public abq(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public abstract void a();
  
  public abstract void b();
  
  public final void d()
  {
    b();
    if (this.b != null) {
      this.b.interrupt();
    }
  }
  
  public final Future h()
  {
    if (this.c) {
      return abu.a(1, this.a);
    }
    return abu.a(this.a);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/abq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */