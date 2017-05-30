package com.google.android.gms.cast.framework.media.a;

import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.c;

public abstract class a
{
  private c a;
  
  protected c a()
  {
    return this.a;
  }
  
  public void a(d paramd)
  {
    if (paramd != null)
    {
      this.a = paramd.a();
      return;
    }
    this.a = null;
  }
  
  public void b()
  {
    this.a = null;
  }
  
  public void c() {}
  
  public void d() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */