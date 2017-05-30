package b.c;

import b.b.b;
import b.b.i;
import b.b.l;
import b.b.n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Properties;

public abstract class a
  implements l
{
  public static final String a = "suite";
  static int b = a("maxmessage", b);
  static boolean c = true;
  private static Properties e;
  boolean d = true;
  
  public static int a(String paramString, int paramInt)
  {
    paramString = h(paramString);
    if (paramString == null) {
      return paramInt;
    }
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException paramString) {}
    return paramInt;
  }
  
  public static String a(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return i(localStringWriter.toString());
  }
  
  protected static Properties a()
  {
    if (e == null)
    {
      e = new Properties();
      e.put("loading", "true");
      e.put("filterstack", "true");
      g();
    }
    return e;
  }
  
  public static void a(String paramString1, String paramString2)
  {
    a().put(paramString1, paramString2);
  }
  
  protected static void a(Properties paramProperties)
  {
    e = paramProperties;
  }
  
  public static void b()
  {
    FileOutputStream localFileOutputStream = new FileOutputStream(f());
    try
    {
      a().store(localFileOutputStream, "");
      return;
    }
    finally
    {
      localFileOutputStream.close();
    }
  }
  
  public static String e(String paramString)
  {
    String str = paramString;
    if (b != -1)
    {
      str = paramString;
      if (paramString.length() > b) {
        str = paramString.substring(0, b) + "...";
      }
    }
    return str;
  }
  
  protected static boolean e()
  {
    return (!h("filterstack").equals("true")) || (!c);
  }
  
  private static File f()
  {
    return new File(System.getProperty("user.home"), "junit.properties");
  }
  
  /* Error */
  private static void g()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 151	java/io/FileInputStream
    //   5: dup
    //   6: invokestatic 97	b/c/a:f	()Ljava/io/File;
    //   9: invokespecial 152	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   12: astore_0
    //   13: new 73	java/util/Properties
    //   16: dup
    //   17: invokestatic 90	b/c/a:a	()Ljava/util/Properties;
    //   20: invokespecial 154	java/util/Properties:<init>	(Ljava/util/Properties;)V
    //   23: invokestatic 156	b/c/a:a	(Ljava/util/Properties;)V
    //   26: invokestatic 90	b/c/a:a	()Ljava/util/Properties;
    //   29: aload_0
    //   30: invokevirtual 160	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   33: aload_0
    //   34: ifnull +7 -> 41
    //   37: aload_0
    //   38: invokevirtual 163	java/io/InputStream:close	()V
    //   41: return
    //   42: astore_0
    //   43: aconst_null
    //   44: astore_0
    //   45: aload_0
    //   46: ifnull -5 -> 41
    //   49: aload_0
    //   50: invokevirtual 163	java/io/InputStream:close	()V
    //   53: return
    //   54: astore_0
    //   55: return
    //   56: astore_0
    //   57: aload_1
    //   58: ifnull +7 -> 65
    //   61: aload_1
    //   62: invokevirtual 163	java/io/InputStream:close	()V
    //   65: aload_0
    //   66: athrow
    //   67: astore_0
    //   68: return
    //   69: astore_1
    //   70: goto -5 -> 65
    //   73: astore_2
    //   74: aload_0
    //   75: astore_1
    //   76: aload_2
    //   77: astore_0
    //   78: goto -21 -> 57
    //   81: astore_1
    //   82: goto -37 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	26	0	localFileInputStream	java.io.FileInputStream
    //   42	1	0	localIOException1	java.io.IOException
    //   44	6	0	localObject1	Object
    //   54	1	0	localIOException2	java.io.IOException
    //   56	10	0	localObject2	Object
    //   67	8	0	localIOException3	java.io.IOException
    //   77	1	0	localObject3	Object
    //   1	61	1	localObject4	Object
    //   69	1	1	localIOException4	java.io.IOException
    //   75	1	1	localObject5	Object
    //   81	1	1	localIOException5	java.io.IOException
    //   73	4	2	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   2	13	42	java/io/IOException
    //   49	53	54	java/io/IOException
    //   2	13	56	finally
    //   37	41	67	java/io/IOException
    //   61	65	69	java/io/IOException
    //   13	33	73	finally
    //   13	33	81	java/io/IOException
  }
  
  public static String h(String paramString)
  {
    return a().getProperty(paramString);
  }
  
  public static String i(String paramString)
  {
    if (e()) {
      return paramString;
    }
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
    BufferedReader localBufferedReader = new BufferedReader(new StringReader(paramString));
    try
    {
      for (;;)
      {
        String str = localBufferedReader.readLine();
        if (str == null) {
          break;
        }
        if (!j(str)) {
          localPrintWriter.println(str);
        }
      }
      return localException.toString();
    }
    catch (Exception localException)
    {
      return paramString;
    }
  }
  
  static boolean j(String paramString)
  {
    boolean bool2 = false;
    String[] arrayOfString = new String[8];
    arrayOfString[0] = "junit.framework.TestCase";
    arrayOfString[1] = "junit.framework.TestResult";
    arrayOfString[2] = "junit.framework.TestSuite";
    arrayOfString[3] = "junit.framework.Assert.";
    arrayOfString[4] = "junit.swingui.TestRunner";
    arrayOfString[5] = "junit.awtui.TestRunner";
    arrayOfString[6] = "junit.textui.TestRunner";
    arrayOfString[7] = "java.lang.reflect.Method.invoke(";
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < arrayOfString.length)
      {
        if (paramString.indexOf(arrayOfString[i]) > 0) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public String a(long paramLong)
  {
    return NumberFormat.getInstance().format(paramLong / 1000.0D);
  }
  
  protected String a(String[] paramArrayOfString)
  {
    String str = null;
    int i = 0;
    if (i < paramArrayOfString.length)
    {
      if (paramArrayOfString[i].equals("-noloading")) {
        a(false);
      }
      for (;;)
      {
        i += 1;
        break;
        if (paramArrayOfString[i].equals("-nofilterstack"))
        {
          c = false;
        }
        else
        {
          if (paramArrayOfString[i].equals("-c"))
          {
            if (paramArrayOfString.length > i + 1) {
              str = d(paramArrayOfString[(i + 1)]);
            }
            for (;;)
            {
              i += 1;
              break;
              System.out.println("Missing Test class name");
            }
          }
          str = paramArrayOfString[i];
        }
      }
    }
    return str;
  }
  
  public abstract void a(int paramInt, i parami, Throwable paramThrowable);
  
  public void a(i parami)
  {
    try
    {
      b(parami.toString());
      return;
    }
    finally
    {
      parami = finally;
      throw parami;
    }
  }
  
  public void a(i parami, b paramb)
  {
    try
    {
      a(2, parami, paramb);
      return;
    }
    finally
    {
      parami = finally;
      throw parami;
    }
  }
  
  public void a(i parami, Throwable paramThrowable)
  {
    try
    {
      a(1, parami, paramThrowable);
      return;
    }
    finally
    {
      parami = finally;
      throw parami;
    }
  }
  
  public abstract void a(String paramString);
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public void b(i parami)
  {
    try
    {
      a(parami.toString());
      return;
    }
    finally
    {
      parami = finally;
      throw parami;
    }
  }
  
  public abstract void b(String paramString);
  
  public i c(String paramString)
  {
    if (paramString.length() <= 0)
    {
      c();
      paramString = null;
      return paramString;
    }
    for (;;)
    {
      Object localObject;
      try
      {
        Class localClass = g(paramString);
        try
        {
          localObject = (i)paramString.invoke(null, new Object[0]);
          paramString = (String)localObject;
          if (localObject == null) {
            break;
          }
          c();
          return (i)localObject;
        }
        catch (InvocationTargetException paramString)
        {
          f("Failed to invoke suite():" + paramString.getTargetException().toString());
          return null;
        }
        catch (IllegalAccessException paramString)
        {
          f("Failed to invoke suite():" + paramString.toString());
          return null;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        try
        {
          paramString = localClass.getMethod("suite", new Class[0]);
          if (Modifier.isStatic(paramString.getModifiers())) {
            break label137;
          }
          f("Suite() method must be static");
          return null;
        }
        catch (Exception paramString)
        {
          c();
          return new n((Class)localObject);
        }
        localClassNotFoundException = localClassNotFoundException;
        localObject = localClassNotFoundException.getMessage();
        if (localObject == null)
        {
          f("Class not found \"" + paramString + "\"");
          return null;
        }
      }
      catch (Exception paramString)
      {
        f("Error: " + paramString.toString());
        return null;
      }
      label137:
      paramString = (String)localObject;
    }
  }
  
  protected void c() {}
  
  public String d(String paramString)
  {
    String str = paramString;
    if (paramString.startsWith("Default package for")) {
      str = paramString.substring(paramString.lastIndexOf(".") + 1);
    }
    return str;
  }
  
  protected boolean d()
  {
    return (h("loading").equals("true")) && (this.d);
  }
  
  protected abstract void f(String paramString);
  
  protected Class<?> g(String paramString)
  {
    return Class.forName(paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */