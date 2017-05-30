package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

public class n<T>
  extends i<T>
{
  private T c;
  
  public n(b<T> paramb)
  {
    super(paramb);
  }
  
  public T next()
  {
    if (!hasNext())
    {
      int i = this.b;
      throw new NoSuchElementException(46 + "Cannot advance the iterator beyond " + i);
    }
    this.b += 1;
    if (this.b == 0)
    {
      this.c = this.a.a(0);
      if (!(this.c instanceof j))
      {
        String str = String.valueOf(this.c.getClass());
        throw new IllegalStateException(String.valueOf(str).length() + 44 + "DataBuffer reference of type " + str + " is not movable");
      }
    }
    else
    {
      ((j)this.c).a(this.b);
    }
    return (T)this.c;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/data/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */