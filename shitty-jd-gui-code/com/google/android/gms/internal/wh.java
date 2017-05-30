package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@aaa
public class wh
  implements Iterable<wg>
{
  private final List<wg> a = new LinkedList();
  
  private wg c(acy paramacy)
  {
    Iterator localIterator = u.B().iterator();
    while (localIterator.hasNext())
    {
      wg localwg = (wg)localIterator.next();
      if (localwg.a == paramacy) {
        return localwg;
      }
    }
    return null;
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public void a(wg paramwg)
  {
    this.a.add(paramwg);
  }
  
  public boolean a(acy paramacy)
  {
    paramacy = c(paramacy);
    if (paramacy != null)
    {
      paramacy.b.a();
      return true;
    }
    return false;
  }
  
  public void b(wg paramwg)
  {
    this.a.remove(paramwg);
  }
  
  public boolean b(acy paramacy)
  {
    return c(paramacy) != null;
  }
  
  public Iterator<wg> iterator()
  {
    return this.a.iterator();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */