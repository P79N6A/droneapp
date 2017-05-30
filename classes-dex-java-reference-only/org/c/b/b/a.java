package org.c.b.b;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.b.g;
import org.b.i;
import org.b.k;
import org.b.p;

public class a<T extends Throwable>
  extends p<T>
{
  private final k<T> a;
  
  public a(k<T> paramk)
  {
    this.a = paramk;
  }
  
  @i
  public static <T extends Throwable> k<T> a(k<T> paramk)
  {
    return new a(paramk);
  }
  
  private String b(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }
  
  @i
  public static <T extends Exception> k<T> b(k<T> paramk)
  {
    return new a(paramk);
  }
  
  protected void a(T paramT, g paramg)
  {
    this.a.a(paramT, paramg);
    paramg.a("\nStacktrace was: ");
    paramg.a(b(paramT));
  }
  
  public void a(g paramg)
  {
    this.a.a(paramg);
  }
  
  protected boolean a(T paramT)
  {
    return this.a.a(paramT);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */