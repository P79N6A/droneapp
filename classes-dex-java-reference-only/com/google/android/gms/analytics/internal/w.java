package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;

public class w
{
  private final Context a;
  private final Context b;
  
  public w(Context paramContext)
  {
    d.a(paramContext);
    paramContext = paramContext.getApplicationContext();
    d.a(paramContext, "Application context can't be null");
    this.a = paramContext;
    this.b = paramContext;
  }
  
  public Context a()
  {
    return this.a;
  }
  
  protected ak a(v paramv)
  {
    return new ak(paramv);
  }
  
  protected p a(Context paramContext)
  {
    return p.a(paramContext);
  }
  
  public Context b()
  {
    return this.b;
  }
  
  protected aa b(v paramv)
  {
    return new aa(paramv);
  }
  
  protected a c(v paramv)
  {
    return new a(paramv);
  }
  
  protected ad d(v paramv)
  {
    return new ad(paramv);
  }
  
  protected q e(v paramv)
  {
    return new q(paramv);
  }
  
  protected g f(v paramv)
  {
    return new g(paramv);
  }
  
  protected ah g(v paramv)
  {
    return new ah(paramv);
  }
  
  protected e h(v paramv)
  {
    return com.google.android.gms.common.util.h.d();
  }
  
  protected c i(v paramv)
  {
    return new c(paramv);
  }
  
  ab j(v paramv)
  {
    return new ab(paramv, this);
  }
  
  h k(v paramv)
  {
    return new h(paramv);
  }
  
  protected r l(v paramv)
  {
    return new r(paramv, this);
  }
  
  public z m(v paramv)
  {
    return new z(paramv);
  }
  
  public i n(v paramv)
  {
    return new i(paramv);
  }
  
  public y o(v paramv)
  {
    return new y(paramv);
  }
  
  public al p(v paramv)
  {
    return new al(paramv);
  }
  
  public j q(v paramv)
  {
    return new j(paramv);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */