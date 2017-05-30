package org.b.a;

import org.b.b;
import org.b.i;
import org.b.k;

public class g<T>
  extends b<T>
{
  private final String a;
  
  public g()
  {
    this("ANYTHING");
  }
  
  public g(String paramString)
  {
    this.a = paramString;
  }
  
  @i
  public static k<Object> a(String paramString)
  {
    return new g(paramString);
  }
  
  @i
  public static k<Object> b()
  {
    return new g();
  }
  
  public void a(org.b.g paramg)
  {
    paramg.a(this.a);
  }
  
  public boolean a(Object paramObject)
  {
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */