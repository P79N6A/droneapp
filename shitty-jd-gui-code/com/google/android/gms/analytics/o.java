package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class o<T extends o>
{
  protected final l a;
  private final p b;
  private final List<m> c;
  
  protected o(p paramp, e parame)
  {
    d.a(paramp);
    this.b = paramp;
    this.c = new ArrayList();
    paramp = new l(this, parame);
    paramp.k();
    this.a = paramp;
  }
  
  protected void a(l paraml) {}
  
  protected void b(l paraml)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((m)localIterator.next()).a(this, paraml);
    }
  }
  
  public l l()
  {
    l locall = this.a.a();
    b(locall);
    return locall;
  }
  
  public l m()
  {
    return this.a;
  }
  
  public List<r> n()
  {
    return this.a.c();
  }
  
  protected p o()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */