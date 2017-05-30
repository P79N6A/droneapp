package org.c.b;

import org.b.g;
import org.b.k;
import org.b.m;
import org.b.n;

public class b
  extends RuntimeException
  implements m
{
  private static final long serialVersionUID = 2L;
  private final String a;
  private final boolean b;
  private final Object c;
  private final k<?> d;
  
  @Deprecated
  public b(Object paramObject, k<?> paramk)
  {
    this(null, true, paramObject, paramk);
  }
  
  @Deprecated
  public b(String paramString)
  {
    this(paramString, false, null, null);
  }
  
  @Deprecated
  public b(String paramString, Object paramObject, k<?> paramk)
  {
    this(paramString, true, paramObject, paramk);
  }
  
  @Deprecated
  public b(String paramString, Throwable paramThrowable)
  {
    this(paramString, false, null, null);
    initCause(paramThrowable);
  }
  
  @Deprecated
  public b(String paramString, boolean paramBoolean, Object paramObject, k<?> paramk)
  {
    this.a = paramString;
    this.c = paramObject;
    this.d = paramk;
    this.b = paramBoolean;
    if ((paramObject instanceof Throwable)) {
      initCause((Throwable)paramObject);
    }
  }
  
  public void a(g paramg)
  {
    if (this.a != null) {
      paramg.a(this.a);
    }
    if (this.b)
    {
      if (this.a != null) {
        paramg.a(": ");
      }
      paramg.a("got: ");
      paramg.a(this.c);
      if (this.d != null)
      {
        paramg.a(", expected: ");
        paramg.a(this.d);
      }
    }
  }
  
  public String getMessage()
  {
    return n.c(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */