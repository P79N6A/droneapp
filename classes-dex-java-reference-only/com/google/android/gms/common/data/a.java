package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

public abstract class a<T>
  implements b<T>
{
  protected final DataHolder a;
  
  protected a(DataHolder paramDataHolder)
  {
    this.a = paramDataHolder;
    if (this.a != null) {}
  }
  
  public abstract T a(int paramInt);
  
  public void b()
  {
    if (this.a != null) {
      this.a.close();
    }
  }
  
  public int c()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.g();
  }
  
  @Deprecated
  public final void d()
  {
    b();
  }
  
  @Deprecated
  public boolean e()
  {
    return (this.a == null) || (this.a.h());
  }
  
  public Bundle f()
  {
    return this.a.f();
  }
  
  public Iterator<T> g()
  {
    return new n(this);
  }
  
  public Iterator<T> iterator()
  {
    return new i(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/data/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */