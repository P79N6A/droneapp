package b.b;

import java.io.PrintWriter;
import java.io.StringWriter;

public class k
{
  protected i a;
  protected Throwable b;
  
  public k(i parami, Throwable paramThrowable)
  {
    this.a = parami;
    this.b = paramThrowable;
  }
  
  public i a()
  {
    return this.a;
  }
  
  public Throwable b()
  {
    return this.b;
  }
  
  public String c()
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
    b().printStackTrace(localPrintWriter);
    return localStringWriter.toString();
  }
  
  public String d()
  {
    return b().getMessage();
  }
  
  public boolean e()
  {
    return b() instanceof b;
  }
  
  public String toString()
  {
    return this.a + ": " + this.b.getMessage();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */