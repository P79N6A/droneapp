package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.p;
import com.google.android.gms.internal.ado;

public class aa
  extends t
{
  private final ado a = new ado();
  
  aa(v paramv)
  {
    super(paramv);
  }
  
  protected void a()
  {
    r().a().a(this.a);
    b();
  }
  
  public void b()
  {
    Object localObject = v();
    String str = ((q)localObject).c();
    if (str != null) {
      this.a.a(str);
    }
    localObject = ((q)localObject).b();
    if (localObject != null) {
      this.a.b((String)localObject);
    }
  }
  
  public ado c()
  {
    D();
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */