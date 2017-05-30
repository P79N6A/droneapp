package com.google.android.gms.cast.internal;

import com.google.android.gms.common.util.e;

public final class q
{
  public static final Object a = new Object();
  private static final m g = new m("RequestTracker");
  private long b;
  private long c;
  private long d;
  private p e;
  private final e f;
  
  public q(e parame, long paramLong)
  {
    this.f = parame;
    this.b = paramLong;
    this.c = -1L;
    this.d = 0L;
  }
  
  private void c()
  {
    this.c = -1L;
    this.e = null;
    this.d = 0L;
  }
  
  public void a()
  {
    synchronized (a)
    {
      if (this.c != -1L) {
        c();
      }
      return;
    }
  }
  
  public void a(long paramLong, p paramp)
  {
    synchronized (a)
    {
      p localp = this.e;
      long l = this.c;
      this.c = paramLong;
      this.e = paramp;
      this.d = this.f.b();
      if (localp != null) {
        localp.a(l);
      }
      return;
    }
  }
  
  public boolean a(long paramLong)
  {
    for (;;)
    {
      synchronized (a)
      {
        if ((this.c != -1L) && (this.c == paramLong))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean a(long paramLong, int paramInt)
  {
    return a(paramLong, paramInt, null);
  }
  
  public boolean a(long paramLong, int paramInt, Object paramObject)
  {
    boolean bool = true;
    p localp = null;
    for (;;)
    {
      synchronized (a)
      {
        if ((this.c != -1L) && (this.c == paramLong))
        {
          g.b("request %d completed", new Object[] { Long.valueOf(this.c) });
          localp = this.e;
          c();
          if (localp != null) {
            localp.a(paramLong, paramInt, paramObject);
          }
          return bool;
        }
      }
      bool = false;
    }
  }
  
  public boolean b()
  {
    for (;;)
    {
      synchronized (a)
      {
        if (this.c != -1L)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean b(long paramLong, int paramInt)
  {
    boolean bool = true;
    long l = 0L;
    for (;;)
    {
      synchronized (a)
      {
        if ((this.c != -1L) && (paramLong - this.d >= this.b))
        {
          g.b("request %d timed out", new Object[] { Long.valueOf(this.c) });
          paramLong = this.c;
          p localp = this.e;
          c();
          if (localp != null) {
            localp.a(paramLong, paramInt, null);
          }
          return bool;
        }
      }
      bool = false;
      Object localObject2 = null;
      paramLong = l;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */