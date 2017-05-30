package org.c.f.a;

import java.util.Arrays;
import java.util.List;

public class e
  extends Exception
{
  private static final long serialVersionUID = 1L;
  private final List<Throwable> a;
  
  public e(String paramString)
  {
    this(new Exception(paramString));
  }
  
  public e(Throwable paramThrowable)
  {
    this(Arrays.asList(new Throwable[] { paramThrowable }));
  }
  
  public e(List<Throwable> paramList)
  {
    this.a = paramList;
  }
  
  public List<Throwable> a()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */