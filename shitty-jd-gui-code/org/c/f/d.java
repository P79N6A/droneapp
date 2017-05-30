package org.c.f;

import java.lang.reflect.Method;
import java.util.Comparator;
import org.c.b.h;

public enum d
{
  private final Comparator<Method> d;
  
  private d(Comparator<Method> paramComparator)
  {
    this.d = paramComparator;
  }
  
  public Comparator<Method> a()
  {
    return this.d;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */