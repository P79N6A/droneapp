package com.google.android.gms.common.data;

import java.util.HashSet;
import java.util.Iterator;

public final class d
  implements c, c.a
{
  private HashSet<c> a = new HashSet();
  
  public void a()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((c)localIterator.next()).a();
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((c)localIterator.next()).a(paramInt1, paramInt2);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((c)localIterator.next()).a(paramInt1, paramInt2, paramInt3);
    }
  }
  
  public void a(c paramc)
  {
    this.a.add(paramc);
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((c)localIterator.next()).b(paramInt1, paramInt2);
    }
  }
  
  public void b(c paramc)
  {
    this.a.remove(paramc);
  }
  
  public boolean b()
  {
    return !this.a.isEmpty();
  }
  
  public void c()
  {
    this.a.clear();
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((c)localIterator.next()).c(paramInt1, paramInt2);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/data/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */