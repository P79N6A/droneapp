package b.d;

import b.b.b;
import b.b.i;
import b.b.k;
import b.b.l;
import b.b.m;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Enumeration;

public class a
  implements l
{
  PrintStream a;
  int b = 0;
  
  public a(PrintStream paramPrintStream)
  {
    this.a = paramPrintStream;
  }
  
  void a()
  {
    b().println();
    b().println("<RETURN> to continue");
  }
  
  protected void a(long paramLong)
  {
    b().println();
    b().println("Time: " + b(paramLong));
  }
  
  public void a(i parami) {}
  
  public void a(i parami, b paramb)
  {
    b().print("F");
  }
  
  public void a(i parami, Throwable paramThrowable)
  {
    b().print("E");
  }
  
  protected void a(k paramk)
  {
    b().print(b.c.a.i(paramk.c()));
  }
  
  public void a(k paramk, int paramInt)
  {
    b(paramk, paramInt);
    a(paramk);
  }
  
  protected void a(m paramm)
  {
    a(paramm.b(), paramm.a(), "error");
  }
  
  void a(m paramm, long paramLong)
  {
    try
    {
      a(paramLong);
      a(paramm);
      b(paramm);
      c(paramm);
      return;
    }
    finally
    {
      paramm = finally;
      throw paramm;
    }
  }
  
  protected void a(Enumeration<k> paramEnumeration, int paramInt, String paramString)
  {
    if (paramInt == 0) {
      return;
    }
    if (paramInt == 1) {
      b().println("There was " + paramInt + " " + paramString + ":");
    }
    for (;;)
    {
      paramInt = 1;
      while (paramEnumeration.hasMoreElements())
      {
        a((k)paramEnumeration.nextElement(), paramInt);
        paramInt += 1;
      }
      break;
      b().println("There were " + paramInt + " " + paramString + "s:");
    }
  }
  
  public PrintStream b()
  {
    return this.a;
  }
  
  protected String b(long paramLong)
  {
    return NumberFormat.getInstance().format(paramLong / 1000.0D);
  }
  
  public void b(i parami)
  {
    b().print(".");
    int i = this.b;
    this.b = (i + 1);
    if (i >= 40)
    {
      b().println();
      this.b = 0;
    }
  }
  
  protected void b(k paramk, int paramInt)
  {
    b().print(paramInt + ") " + paramk.a());
  }
  
  protected void b(m paramm)
  {
    a(paramm.d(), paramm.c(), "failure");
  }
  
  protected void c(m paramm)
  {
    if (paramm.h())
    {
      b().println();
      b().print("OK");
      PrintStream localPrintStream = b();
      StringBuilder localStringBuilder = new StringBuilder().append(" (").append(paramm.e()).append(" test");
      if (paramm.e() == 1)
      {
        paramm = "";
        localPrintStream.println(paramm + ")");
      }
    }
    for (;;)
    {
      b().println();
      return;
      paramm = "s";
      break;
      b().println();
      b().println("FAILURES!!!");
      b().println("Tests run: " + paramm.e() + ",  Failures: " + paramm.c() + ",  Errors: " + paramm.a());
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */