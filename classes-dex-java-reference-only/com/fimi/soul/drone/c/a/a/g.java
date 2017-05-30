package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a;
import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class g<T extends a>
  extends b
{
  private static final long serialVersionUID = 1L;
  private T b;
  
  public g(T paramT)
  {
    this.b = paramT;
  }
  
  @Deprecated
  public c a()
  {
    return null;
  }
  
  public void a(d paramd)
  {
    if (this.b != null) {
      this.b.a(paramd);
    }
  }
  
  public void a(T paramT)
  {
    this.b = paramT;
  }
  
  public T b()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */