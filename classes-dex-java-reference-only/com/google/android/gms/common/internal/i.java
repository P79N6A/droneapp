package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.a.h;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;

public class i<T extends IInterface>
  extends w<T>
{
  private final a.h<T> a;
  
  public i(Context paramContext, Looper paramLooper, int paramInt, g.b paramb, g.c paramc, s params, a.h<T> paramh)
  {
    super(paramContext, paramLooper, paramInt, params, paramb, paramc);
    this.a = paramh;
  }
  
  protected String a()
  {
    return this.a.a();
  }
  
  protected void a(int paramInt, T paramT)
  {
    this.a.a(paramInt, paramT);
  }
  
  protected T b(IBinder paramIBinder)
  {
    return this.a.a(paramIBinder);
  }
  
  protected String b()
  {
    return this.a.b();
  }
  
  public a.h<T> h()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */