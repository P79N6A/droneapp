package b.d;

import b.b.i;
import b.b.j;
import b.b.m;
import b.b.n;
import b.c.c;
import java.io.InputStream;
import java.io.PrintStream;

public class b
  extends b.c.a
{
  public static final int e = 0;
  public static final int f = 1;
  public static final int g = 2;
  private a h;
  
  public b()
  {
    this(System.out);
  }
  
  public b(a parama)
  {
    this.h = parama;
  }
  
  public b(PrintStream paramPrintStream)
  {
    this(new a(paramPrintStream));
  }
  
  public static void a(Class<? extends j> paramClass)
  {
    c(new n(paramClass));
  }
  
  public static void b(String[] paramArrayOfString)
  {
    b localb = new b();
    try
    {
      if (!localb.c(paramArrayOfString).h()) {
        System.exit(1);
      }
      System.exit(0);
      return;
    }
    catch (Exception paramArrayOfString)
    {
      System.err.println(paramArrayOfString.getMessage());
      System.exit(2);
    }
  }
  
  public static m c(i parami)
  {
    return new b().e(parami);
  }
  
  public static void d(i parami)
  {
    new b().a(parami, true);
  }
  
  public m a(i parami, boolean paramBoolean)
  {
    m localm = f();
    localm.a(this.h);
    long l1 = System.currentTimeMillis();
    parami.a(localm);
    long l2 = System.currentTimeMillis();
    this.h.a(localm, l2 - l1);
    b(paramBoolean);
    return localm;
  }
  
  protected m a(String paramString1, String paramString2, boolean paramBoolean)
  {
    return a(n.a(g(paramString1).asSubclass(j.class), paramString2), paramBoolean);
  }
  
  public void a(int paramInt, i parami, Throwable paramThrowable) {}
  
  public void a(a parama)
  {
    this.h = parama;
  }
  
  public void a(String paramString) {}
  
  public void b(String paramString) {}
  
  protected void b(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    this.h.a();
    try
    {
      System.in.read();
      return;
    }
    catch (Exception localException) {}
  }
  
  public m c(String[] paramArrayOfString)
  {
    String str1 = "";
    String str2 = "";
    int i = 0;
    boolean bool = false;
    if (i < paramArrayOfString.length)
    {
      if (paramArrayOfString[i].equals("-wait")) {
        bool = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (paramArrayOfString[i].equals("-c"))
        {
          i += 1;
          str1 = d(paramArrayOfString[i]);
        }
        else if (paramArrayOfString[i].equals("-m"))
        {
          i += 1;
          str2 = paramArrayOfString[i];
          int j = str2.lastIndexOf('.');
          str1 = str2.substring(0, j);
          str2 = str2.substring(j + 1);
        }
        else if (paramArrayOfString[i].equals("-v"))
        {
          System.err.println("JUnit " + c.a() + " by Kent Beck and Erich Gamma");
        }
        else
        {
          str1 = paramArrayOfString[i];
        }
      }
    }
    if (str1.equals("")) {
      throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
    }
    try
    {
      if (!str2.equals("")) {
        return a(str1, str2, bool);
      }
      paramArrayOfString = a(c(str1), bool);
      return paramArrayOfString;
    }
    catch (Exception paramArrayOfString)
    {
      throw new Exception("Could not create and run test suite: " + paramArrayOfString);
    }
  }
  
  public m e(i parami)
  {
    return a(parami, false);
  }
  
  protected m f()
  {
    return new m();
  }
  
  protected void f(String paramString)
  {
    System.err.println(paramString);
    System.exit(1);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */