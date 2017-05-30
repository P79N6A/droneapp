package b.a;

import b.b.h;
import b.b.i;
import b.b.m;

public class d
  extends c
{
  public d(i parami)
  {
    super(parami);
  }
  
  public void a(final m paramm)
  {
    paramm.a(this, new h()
    {
      public void a()
      {
        d.this.c();
        d.this.b(paramm);
        d.this.d();
      }
    });
  }
  
  protected void c() {}
  
  protected void d() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */