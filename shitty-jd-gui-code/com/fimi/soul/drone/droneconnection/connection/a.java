package com.fimi.soul.drone.droneconnection.connection;

import android.content.Context;

public abstract class a
  extends d
{
  private static final String h = a.class.getSimpleName();
  protected final Context a;
  private boolean i = true;
  
  public a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  protected abstract int a(byte[] paramArrayOfByte);
  
  protected abstract void a();
  
  public void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  protected int b(byte[] paramArrayOfByte)
  {
    if (this.i) {
      return a(paramArrayOfByte);
    }
    return 0;
  }
  
  protected abstract void b();
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.e = true;
      return;
    }
    this.e = false;
  }
  
  public boolean c()
  {
    return this.i;
  }
  
  protected final void d()
  {
    b();
  }
  
  public final void e()
  {
    a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/droneconnection/connection/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */