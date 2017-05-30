package com.fimi.soul.module.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
  implements c
{
  private List<b> a = new ArrayList();
  
  public static b a()
  {
    return a.a();
  }
  
  public void a(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).a(paramInt);
    }
  }
  
  public void a(b paramb)
  {
    this.a.add(paramb);
  }
  
  public void b(b paramb)
  {
    this.a.add(paramb);
  }
  
  static class a
  {
    private static b a = new b();
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */