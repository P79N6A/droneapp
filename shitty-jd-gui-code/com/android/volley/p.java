package com.android.volley;

public class p<T>
{
  public final T a;
  public final b.a b;
  public final u c;
  public boolean d = false;
  
  private p(u paramu)
  {
    this.a = null;
    this.b = null;
    this.c = paramu;
  }
  
  private p(T paramT, b.a parama)
  {
    this.a = paramT;
    this.b = parama;
    this.c = null;
  }
  
  public static <T> p<T> a(u paramu)
  {
    return new p(paramu);
  }
  
  public static <T> p<T> a(T paramT, b.a parama)
  {
    return new p(paramT, parama);
  }
  
  public boolean a()
  {
    return this.c == null;
  }
  
  public static abstract interface a
  {
    public abstract void a(u paramu);
  }
  
  public static abstract interface b<T>
  {
    public abstract void a(T paramT);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */