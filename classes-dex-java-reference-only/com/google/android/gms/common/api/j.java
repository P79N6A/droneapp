package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ahn;
import com.google.android.gms.internal.aio;
import com.google.android.gms.internal.aiu;

public final class j
{
  public static <R extends m> h<R> a(R paramR)
  {
    d.a(paramR, "Result must not be null");
    c localc = new c(null);
    localc.b(paramR);
    return new aio(localc);
  }
  
  public static i<Status> a()
  {
    aiu localaiu = new aiu(Looper.getMainLooper());
    localaiu.a();
    return localaiu;
  }
  
  public static i<Status> a(Status paramStatus)
  {
    d.a(paramStatus, "Result must not be null");
    aiu localaiu = new aiu(Looper.getMainLooper());
    localaiu.b(paramStatus);
    return localaiu;
  }
  
  public static i<Status> a(Status paramStatus, g paramg)
  {
    d.a(paramStatus, "Result must not be null");
    paramg = new aiu(paramg);
    paramg.b(paramStatus);
    return paramg;
  }
  
  public static <R extends m> i<R> a(R paramR, g paramg)
  {
    d.a(paramR, "Result must not be null");
    if (!paramR.a().f()) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool, "Status code must not be SUCCESS");
      paramg = new b(paramg, paramR);
      paramg.b(paramR);
      return paramg;
    }
  }
  
  public static <R extends m> h<R> b(R paramR, g paramg)
  {
    d.a(paramR, "Result must not be null");
    paramg = new c(paramg);
    paramg.b(paramR);
    return new aio(paramg);
  }
  
  public static <R extends m> i<R> b(R paramR)
  {
    d.a(paramR, "Result must not be null");
    if (paramR.a().i() == 16) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool, "Status code must be CommonStatusCodes.CANCELED");
      paramR = new a(paramR);
      paramR.a();
      return paramR;
    }
  }
  
  private static final class a<R extends m>
    extends ahn<R>
  {
    private final R a;
    
    public a(R paramR)
    {
      super();
      this.a = paramR;
    }
    
    protected R b(Status paramStatus)
    {
      if (paramStatus.i() != this.a.a().i()) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
      }
      return this.a;
    }
  }
  
  private static final class b<R extends m>
    extends ahn<R>
  {
    private final R a;
    
    public b(g paramg, R paramR)
    {
      super();
      this.a = paramR;
    }
    
    protected R b(Status paramStatus)
    {
      return this.a;
    }
  }
  
  private static final class c<R extends m>
    extends ahn<R>
  {
    public c(g paramg)
    {
      super();
    }
    
    protected R b(Status paramStatus)
    {
      throw new UnsupportedOperationException("Creating failed results is not supported");
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */