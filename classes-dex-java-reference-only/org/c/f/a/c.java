package org.c.f.a;

import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

public abstract class c<T extends c<T>>
  implements a
{
  boolean a(List<T> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (a((c)paramList.next())) {
        return true;
      }
    }
    return false;
  }
  
  abstract boolean a(T paramT);
  
  public abstract String b();
  
  protected abstract int c();
  
  public abstract Class<?> e();
  
  public abstract Class<?> f();
  
  public boolean g()
  {
    return Modifier.isStatic(c());
  }
  
  public boolean h()
  {
    return Modifier.isPublic(c());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */