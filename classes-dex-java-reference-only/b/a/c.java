package b.a;

import b.b.a;
import b.b.i;
import b.b.m;

public class c
  extends a
  implements i
{
  protected i a;
  
  public c(i parami)
  {
    this.a = parami;
  }
  
  public int a()
  {
    return this.a.a();
  }
  
  public void a(m paramm)
  {
    b(paramm);
  }
  
  public i b()
  {
    return this.a;
  }
  
  public void b(m paramm)
  {
    this.a.a(paramm);
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */