package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@aaa
public class uc
{
  private final Collection<ub> a = new ArrayList();
  private final Collection<ub<String>> b = new ArrayList();
  private final Collection<ub<String>> c = new ArrayList();
  
  public List<String> a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)((ub)localIterator.next()).c();
      if (str != null) {
        localArrayList.add(str);
      }
    }
    return localArrayList;
  }
  
  public void a(ub paramub)
  {
    this.a.add(paramub);
  }
  
  public List<String> b()
  {
    List localList = a();
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)((ub)localIterator.next()).c();
      if (str != null) {
        localList.add(str);
      }
    }
    return localList;
  }
  
  public void b(ub<String> paramub)
  {
    this.b.add(paramub);
  }
  
  public void c(ub<String> paramub)
  {
    this.c.add(paramub);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/uc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */