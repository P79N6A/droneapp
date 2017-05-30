package com.a.b;

public abstract class d<T, V>
{
  private final String a;
  private final Class<V> b;
  
  public d(Class<V> paramClass, String paramString)
  {
    this.a = paramString;
    this.b = paramClass;
  }
  
  public static <T, V> d<T, V> a(Class<T> paramClass, Class<V> paramClass1, String paramString)
  {
    return new e(paramClass, paramClass1, paramString);
  }
  
  public abstract V a(T paramT);
  
  public void a(T paramT, V paramV)
  {
    throw new UnsupportedOperationException("Property " + b() + " is read-only");
  }
  
  public boolean a()
  {
    return false;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public Class<V> c()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */