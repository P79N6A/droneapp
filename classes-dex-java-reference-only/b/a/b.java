package b.a;

import b.b.i;
import b.b.m;

public class b
  extends c
{
  private int b;
  
  public b(i parami, int paramInt)
  {
    super(parami);
    if (paramInt < 0) {
      throw new IllegalArgumentException("Repetition count must be >= 0");
    }
    this.b = paramInt;
  }
  
  public int a()
  {
    return super.a() * this.b;
  }
  
  public void a(m paramm)
  {
    int i = 0;
    for (;;)
    {
      if ((i >= this.b) || (paramm.f())) {
        return;
      }
      super.a(paramm);
      i += 1;
    }
  }
  
  public String toString()
  {
    return super.toString() + "(repeated)";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */