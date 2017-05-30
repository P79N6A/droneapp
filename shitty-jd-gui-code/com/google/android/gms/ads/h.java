package com.google.android.gms.ads;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;

@aaa
public final class h
{
  private final Object a = new Object();
  @Nullable
  private c b;
  @Nullable
  private a c;
  
  public c a()
  {
    synchronized (this.a)
    {
      c localc = this.b;
      return localc;
    }
  }
  
  public void a(a parama)
  {
    d.a(parama, "VideoLifecycleCallbacks may not be null.");
    synchronized (this.a)
    {
      this.c = parama;
      if (this.b == null) {
        return;
      }
    }
    try
    {
      this.b.a(new q(parama));
      return;
      parama = finally;
      throw parama;
    }
    catch (RemoteException parama)
    {
      for (;;)
      {
        b.b("Unable to call setVideoLifecycleCallbacks on video controller.", parama);
      }
    }
  }
  
  public void a(c paramc)
  {
    synchronized (this.a)
    {
      this.b = paramc;
      if (this.c != null) {
        a(this.c);
      }
      return;
    }
  }
  
  @Nullable
  public a b()
  {
    synchronized (this.a)
    {
      a locala = this.c;
      return locala;
    }
  }
  
  public boolean c()
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.b != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public float d()
  {
    float f;
    synchronized (this.a)
    {
      if (this.b == null) {
        return 0.0F;
      }
    }
    return 0.0F;
  }
  
  public static abstract class a
  {
    public void a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */