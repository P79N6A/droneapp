package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class x
  implements Handler.Callback
{
  final ArrayList<g.b> a = new ArrayList();
  private final a b;
  private final ArrayList<g.b> c = new ArrayList();
  private final ArrayList<g.c> d = new ArrayList();
  private volatile boolean e = false;
  private final AtomicInteger f = new AtomicInteger(0);
  private boolean g = false;
  private final Handler h;
  private final Object i = new Object();
  
  public x(Looper paramLooper, a parama)
  {
    this.b = parama;
    this.h = new Handler(paramLooper, this);
  }
  
  public void a()
  {
    this.e = false;
    this.f.incrementAndGet();
  }
  
  public void a(int paramInt)
  {
    boolean bool = false;
    if (Looper.myLooper() == this.h.getLooper()) {
      bool = true;
    }
    d.a(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
    this.h.removeMessages(1);
    synchronized (this.i)
    {
      this.g = true;
      Object localObject2 = new ArrayList(this.c);
      int j = this.f.get();
      localObject2 = ((ArrayList)localObject2).iterator();
      g.b localb;
      do
      {
        if (((Iterator)localObject2).hasNext())
        {
          localb = (g.b)((Iterator)localObject2).next();
          if ((this.e) && (this.f.get() == j)) {}
        }
        else
        {
          this.a.clear();
          this.g = false;
          return;
        }
      } while (!this.c.contains(localb));
      localb.a(paramInt);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    boolean bool2 = true;
    boolean bool1;
    if (Looper.myLooper() == this.h.getLooper())
    {
      bool1 = true;
      d.a(bool1, "onConnectionSuccess must only be called on the Handler thread");
    }
    for (;;)
    {
      synchronized (this.i)
      {
        if (this.g) {
          break label206;
        }
        bool1 = true;
        d.a(bool1);
        this.h.removeMessages(1);
        this.g = true;
        if (this.a.size() != 0) {
          break label211;
        }
        bool1 = bool2;
        d.a(bool1);
        Object localObject2 = new ArrayList(this.c);
        int j = this.f.get();
        localObject2 = ((ArrayList)localObject2).iterator();
        g.b localb;
        if (((Iterator)localObject2).hasNext())
        {
          localb = (g.b)((Iterator)localObject2).next();
          if ((this.e) && (this.b.t()) && (this.f.get() == j)) {}
        }
        else
        {
          this.a.clear();
          this.g = false;
          return;
        }
        if (this.a.contains(localb)) {
          continue;
        }
        localb.a(paramBundle);
      }
      bool1 = false;
      break;
      label206:
      bool1 = false;
      continue;
      label211:
      bool1 = false;
    }
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    if (Looper.myLooper() == this.h.getLooper()) {}
    for (boolean bool = true;; bool = false)
    {
      d.a(bool, "onConnectionFailure must only be called on the Handler thread");
      this.h.removeMessages(1);
      synchronized (this.i)
      {
        Object localObject2 = new ArrayList(this.d);
        int j = this.f.get();
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          g.c localc = (g.c)((Iterator)localObject2).next();
          if ((!this.e) || (this.f.get() != j)) {
            return;
          }
          if (this.d.contains(localc)) {
            localc.a(paramConnectionResult);
          }
        }
      }
      return;
    }
  }
  
  public void a(g.b paramb)
  {
    d.a(paramb);
    synchronized (this.i)
    {
      if (this.c.contains(paramb))
      {
        String str = String.valueOf(paramb);
        Log.w("GmsClientEvents", String.valueOf(str).length() + 62 + "registerConnectionCallbacks(): listener " + str + " is already registered");
        if (this.b.t()) {
          this.h.sendMessage(this.h.obtainMessage(1, paramb));
        }
        return;
      }
      this.c.add(paramb);
    }
  }
  
  public void a(g.c paramc)
  {
    d.a(paramc);
    synchronized (this.i)
    {
      if (this.d.contains(paramc))
      {
        paramc = String.valueOf(paramc);
        Log.w("GmsClientEvents", String.valueOf(paramc).length() + 67 + "registerConnectionFailedListener(): listener " + paramc + " is already registered");
        return;
      }
      this.d.add(paramc);
    }
  }
  
  public void b()
  {
    this.e = true;
  }
  
  public boolean b(g.b paramb)
  {
    d.a(paramb);
    synchronized (this.i)
    {
      boolean bool = this.c.contains(paramb);
      return bool;
    }
  }
  
  public boolean b(g.c paramc)
  {
    d.a(paramc);
    synchronized (this.i)
    {
      boolean bool = this.d.contains(paramc);
      return bool;
    }
  }
  
  public void c(g.b paramb)
  {
    d.a(paramb);
    synchronized (this.i)
    {
      if (!this.c.remove(paramb))
      {
        paramb = String.valueOf(paramb);
        Log.w("GmsClientEvents", String.valueOf(paramb).length() + 52 + "unregisterConnectionCallbacks(): listener " + paramb + " not found");
      }
      while (!this.g) {
        return;
      }
      this.a.add(paramb);
    }
  }
  
  public void c(g.c paramc)
  {
    d.a(paramc);
    synchronized (this.i)
    {
      if (!this.d.remove(paramc))
      {
        paramc = String.valueOf(paramc);
        Log.w("GmsClientEvents", String.valueOf(paramc).length() + 57 + "unregisterConnectionFailedListener(): listener " + paramc + " not found");
      }
      return;
    }
  }
  
  public boolean handleMessage(Message arg1)
  {
    if (???.what == 1)
    {
      g.b localb = (g.b)???.obj;
      synchronized (this.i)
      {
        if ((this.e) && (this.b.t()) && (this.c.contains(localb))) {
          localb.a(this.b.g());
        }
        return true;
      }
    }
    int j = ???.what;
    Log.wtf("GmsClientEvents", 45 + "Don't know how to handle message: " + j, new Exception());
    return false;
  }
  
  public static abstract interface a
  {
    public abstract Bundle g();
    
    public abstract boolean t();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */