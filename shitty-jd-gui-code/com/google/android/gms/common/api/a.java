package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.p.f;
import com.google.android.gms.common.internal.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class a<O extends a>
{
  private final b<?, O> a;
  private final i<?, O> b;
  private final g<?> c;
  private final j<?> d;
  private final String e;
  
  public <C extends f> a(String paramString, b<C, O> paramb, g<C> paramg)
  {
    d.a(paramb, "Cannot construct an Api with a null ClientBuilder");
    d.a(paramg, "Cannot construct an Api with a null ClientKey");
    this.e = paramString;
    this.a = paramb;
    this.b = null;
    this.c = paramg;
    this.d = null;
  }
  
  public e<?, O> a()
  {
    if (e()) {
      return null;
    }
    return this.a;
  }
  
  public b<?, O> b()
  {
    if (this.a != null) {}
    for (boolean bool = true;; bool = false)
    {
      d.a(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return this.a;
    }
  }
  
  public i<?, O> c()
  {
    d.a(false, "This API was constructed with a ClientBuilder. Use getClientBuilder");
    return null;
  }
  
  public d<?> d()
  {
    if (this.c != null) {
      return this.c;
    }
    throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
  }
  
  public boolean e()
  {
    return false;
  }
  
  public String f()
  {
    return this.e;
  }
  
  public static abstract interface a
  {
    public static abstract interface a
      extends a.a
    {}
    
    public static final class b
      implements a.a.c
    {}
    
    public static abstract interface c
      extends a.a
    {}
    
    public static abstract interface d
      extends a.a.a, a.a.c
    {}
  }
  
  public static abstract class b<T extends a.f, O>
    extends a.e<T, O>
  {
    public abstract T a(Context paramContext, Looper paramLooper, s params, O paramO, g.b paramb, g.c paramc);
  }
  
  public static abstract interface c {}
  
  public static class d<C extends a.c> {}
  
  public static abstract class e<T extends a.c, O>
  {
    public int a()
    {
      return Integer.MAX_VALUE;
    }
    
    public List<Scope> a(O paramO)
    {
      return Collections.emptyList();
    }
  }
  
  public static abstract interface f
    extends a.c
  {
    public abstract void a(ac paramac, Set<Scope> paramSet);
    
    public abstract void a(p.f paramf);
    
    public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
    
    public abstract Intent e();
    
    public abstract void f();
    
    public abstract boolean h_();
    
    public abstract boolean t();
    
    public abstract boolean u();
    
    public abstract boolean v();
    
    public abstract boolean w();
    
    @Nullable
    public abstract IBinder x();
  }
  
  public static final class g<C extends a.f>
    extends a.d<C>
  {}
  
  public static abstract interface h<T extends IInterface>
    extends a.c
  {
    public abstract T a(IBinder paramIBinder);
    
    public abstract String a();
    
    public abstract void a(int paramInt, T paramT);
    
    public abstract String b();
  }
  
  public static abstract class i<T extends a.h, O>
    extends a.e<T, O>
  {
    public abstract int b();
    
    public abstract T b(O paramO);
  }
  
  public static final class j<C extends a.h>
    extends a.d<C>
  {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */