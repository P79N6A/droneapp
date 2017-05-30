package com.fimi.soul.view.myhorizontalseebar;

class f<T extends c<T>>
  implements b<T>
{
  private final b<T> a;
  private final Object b;
  
  public f(b<T> paramb)
  {
    this.a = paramb;
    this.b = this;
  }
  
  public f(b<T> paramb, Object paramObject)
  {
    this.a = paramb;
    this.b = paramObject;
  }
  
  public T a()
  {
    synchronized (this.b)
    {
      c localc = this.a.a();
      return localc;
    }
  }
  
  public void a(T paramT)
  {
    synchronized (this.b)
    {
      this.a.a(paramT);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/myhorizontalseebar/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */