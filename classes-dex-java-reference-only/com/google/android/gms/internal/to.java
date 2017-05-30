package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@aaa
public class to
{
  private final Object a = new Object();
  private int b;
  private List<tn> c = new LinkedList();
  
  @Nullable
  public tn a()
  {
    Object localObject1 = null;
    label146:
    label149:
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.c.size() == 0)
        {
          abr.a("Queue empty");
          return null;
        }
        if (this.c.size() >= 2)
        {
          int i = Integer.MIN_VALUE;
          Iterator localIterator = this.c.iterator();
          if (localIterator.hasNext())
          {
            tn localtn2 = (tn)localIterator.next();
            int j = localtn2.h();
            if (j <= i) {
              break label146;
            }
            localObject1 = localtn2;
            i = j;
            break label149;
          }
          this.c.remove(localObject1);
          return (tn)localObject1;
        }
      }
      tn localtn1 = (tn)this.c.get(0);
      localtn1.d();
      return localtn1;
    }
  }
  
  public boolean a(tn paramtn)
  {
    synchronized (this.a)
    {
      return this.c.contains(paramtn);
    }
  }
  
  public boolean b(tn paramtn)
  {
    synchronized (this.a)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        tn localtn = (tn)localIterator.next();
        if ((paramtn != localtn) && (localtn.b().equals(paramtn.b())))
        {
          localIterator.remove();
          return true;
        }
      }
      return false;
    }
  }
  
  public void c(tn paramtn)
  {
    synchronized (this.a)
    {
      if (this.c.size() >= 10)
      {
        i = this.c.size();
        abr.a(41 + "Queue is full, current size = " + i);
        this.c.remove(0);
      }
      int i = this.b;
      this.b = (i + 1);
      paramtn.a(i);
      this.c.add(paramtn);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/to.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */