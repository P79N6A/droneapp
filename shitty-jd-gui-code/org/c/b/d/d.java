package org.c.b.d;

import java.util.Arrays;
import java.util.List;

@Deprecated
public class d
  extends Exception
{
  private static final long serialVersionUID = 1L;
  private final List<Throwable> a;
  
  public d(String paramString)
  {
    this(new Throwable[] { new Exception(paramString) });
  }
  
  public d(List<Throwable> paramList)
  {
    this.a = paramList;
  }
  
  public d(Throwable... paramVarArgs)
  {
    this(Arrays.asList(paramVarArgs));
  }
  
  public List<Throwable> a()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */