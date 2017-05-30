package com.a.b;

public abstract class b<T>
  extends d<T, Integer>
{
  public b(String paramString)
  {
    super(Integer.class, paramString);
  }
  
  public abstract void a(T paramT, int paramInt);
  
  public final void a(T paramT, Integer paramInteger)
  {
    a(paramT, Integer.valueOf(paramInteger.intValue()));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */