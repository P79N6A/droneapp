package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.a;
import com.google.android.gms.internal.aaa;

@aaa
public class ae
  extends a
{
  private final Object a = new Object();
  private a b;
  
  public void a()
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.a();
      }
      return;
    }
  }
  
  public void a(int paramInt)
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.a(paramInt);
      }
      return;
    }
  }
  
  public void a(a parama)
  {
    synchronized (this.a)
    {
      this.b = parama;
      return;
    }
  }
  
  public void b()
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.b();
      }
      return;
    }
  }
  
  public void c()
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.c();
      }
      return;
    }
  }
  
  public void d()
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.d();
      }
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */