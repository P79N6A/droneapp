package b.b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class j
  extends a
  implements i
{
  private String a;
  
  public j()
  {
    this.a = null;
  }
  
  public j(String paramString)
  {
    this.a = paramString;
  }
  
  public static void b(byte paramByte1, byte paramByte2)
  {
    a.a(paramByte1, paramByte2);
  }
  
  public static void b(char paramChar1, char paramChar2)
  {
    a.a(paramChar1, paramChar2);
  }
  
  public static void b(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    a.a(paramDouble1, paramDouble2, paramDouble3);
  }
  
  public static void b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    a.a(paramFloat1, paramFloat2, paramFloat3);
  }
  
  public static void b(int paramInt1, int paramInt2)
  {
    a.a(paramInt1, paramInt2);
  }
  
  public static void b(long paramLong1, long paramLong2)
  {
    a.a(paramLong1, paramLong2);
  }
  
  public static void b(String paramString, byte paramByte1, byte paramByte2)
  {
    a.a(paramString, paramByte1, paramByte2);
  }
  
  public static void b(String paramString, char paramChar1, char paramChar2)
  {
    a.a(paramString, paramChar1, paramChar2);
  }
  
  public static void b(String paramString, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    a.a(paramString, paramDouble1, paramDouble2, paramDouble3);
  }
  
  public static void b(String paramString, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    a.a(paramString, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public static void b(String paramString, int paramInt1, int paramInt2)
  {
    a.a(paramString, paramInt1, paramInt2);
  }
  
  public static void b(String paramString, long paramLong1, long paramLong2)
  {
    a.a(paramString, paramLong1, paramLong2);
  }
  
  public static void b(String paramString1, String paramString2)
  {
    a.a(paramString1, paramString2);
  }
  
  public static void b(String paramString1, String paramString2, String paramString3)
  {
    a.a(paramString1, paramString2, paramString3);
  }
  
  public static void b(String paramString, short paramShort1, short paramShort2)
  {
    a.a(paramString, paramShort1, paramShort2);
  }
  
  public static void b(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    a.a(paramString, paramBoolean1, paramBoolean2);
  }
  
  public static void b(short paramShort1, short paramShort2)
  {
    a.a(paramShort1, paramShort2);
  }
  
  public static void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    a.a(paramBoolean1, paramBoolean2);
  }
  
  public static void c(Object paramObject)
  {
    a.a(paramObject);
  }
  
  public static void c(String paramString)
  {
    a.a(paramString);
  }
  
  public static void c(String paramString, Object paramObject)
  {
    a.a(paramString, paramObject);
  }
  
  public static void c(String paramString, boolean paramBoolean)
  {
    a.a(paramString, paramBoolean);
  }
  
  public static void c(boolean paramBoolean)
  {
    a.a(paramBoolean);
  }
  
  public static void d(Object paramObject)
  {
    a.b(paramObject);
  }
  
  public static void d(Object paramObject1, Object paramObject2)
  {
    a.a(paramObject1, paramObject2);
  }
  
  public static void d(String paramString)
  {
    a.b(paramString);
  }
  
  public static void d(String paramString, Object paramObject)
  {
    a.b(paramString, paramObject);
  }
  
  public static void d(String paramString, boolean paramBoolean)
  {
    a.b(paramString, paramBoolean);
  }
  
  public static void d(boolean paramBoolean)
  {
    a.b(paramBoolean);
  }
  
  public static void e(Object paramObject1, Object paramObject2)
  {
    a.b(paramObject1, paramObject2);
  }
  
  public static void f(Object paramObject1, Object paramObject2)
  {
    a.c(paramObject1, paramObject2);
  }
  
  public static void g() {}
  
  public static void g(String paramString, Object paramObject1, Object paramObject2)
  {
    a.a(paramString, paramObject1, paramObject2);
  }
  
  public static void h(String paramString, Object paramObject1, Object paramObject2)
  {
    a.b(paramString, paramObject1, paramObject2);
  }
  
  public static void i(String paramString, Object paramObject1, Object paramObject2)
  {
    a.c(paramString, paramObject1, paramObject2);
  }
  
  public static void j(String paramString, Object paramObject1, Object paramObject2)
  {
    a.d(paramString, paramObject1, paramObject2);
  }
  
  public static void k(String paramString, Object paramObject1, Object paramObject2)
  {
    a.e(paramString, paramObject1, paramObject2);
  }
  
  public static String l(String paramString, Object paramObject1, Object paramObject2)
  {
    return a.f(paramString, paramObject1, paramObject2);
  }
  
  public int a()
  {
    return 1;
  }
  
  public void a(m paramm)
  {
    paramm.a(this);
  }
  
  protected m b()
  {
    return new m();
  }
  
  public m c()
  {
    m localm = b();
    a(localm);
    return localm;
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual 145	b/b/j:h	()V
    //   6: aload_0
    //   7: invokevirtual 147	b/b/j:f	()V
    //   10: aload_0
    //   11: invokevirtual 149	b/b/j:i	()V
    //   14: aload_1
    //   15: ifnull +46 -> 61
    //   18: aload_1
    //   19: athrow
    //   20: astore_1
    //   21: iconst_0
    //   22: ifne +43 -> 65
    //   25: goto -11 -> 14
    //   28: astore_1
    //   29: aload_0
    //   30: invokevirtual 149	b/b/j:i	()V
    //   33: goto -19 -> 14
    //   36: astore_2
    //   37: aload_1
    //   38: ifnonnull +24 -> 62
    //   41: aload_2
    //   42: astore_1
    //   43: goto -29 -> 14
    //   46: astore_1
    //   47: aload_0
    //   48: invokevirtual 149	b/b/j:i	()V
    //   51: aload_1
    //   52: athrow
    //   53: astore_2
    //   54: iconst_0
    //   55: ifne -4 -> 51
    //   58: goto -7 -> 51
    //   61: return
    //   62: goto -19 -> 43
    //   65: aconst_null
    //   66: astore_1
    //   67: goto -42 -> 25
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	j
    //   1	18	1	localObject1	Object
    //   20	1	1	localThrowable1	Throwable
    //   28	10	1	localThrowable2	Throwable
    //   42	1	1	localObject2	Object
    //   46	6	1	localObject3	Object
    //   66	1	1	localObject4	Object
    //   36	6	2	localThrowable3	Throwable
    //   53	1	2	localThrowable4	Throwable
    // Exception table:
    //   from	to	target	type
    //   10	14	20	java/lang/Throwable
    //   6	10	28	java/lang/Throwable
    //   29	33	36	java/lang/Throwable
    //   6	10	46	finally
    //   47	51	53	java/lang/Throwable
  }
  
  public void e(String paramString)
  {
    this.a = paramString;
  }
  
  protected void f()
  {
    c("TestCase.fName cannot be null", this.a);
    try
    {
      localMethod = getClass().getMethod(this.a, (Class[])null);
      if (!Modifier.isPublic(localMethod.getModifiers())) {
        c("Method \"" + this.a + "\" should be public");
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          Method localMethod;
          localMethod.invoke(this, new Object[0]);
          return;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          Object localObject;
          localInvocationTargetException.fillInStackTrace();
          throw localInvocationTargetException.getTargetException();
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localIllegalAccessException.fillInStackTrace();
          throw localIllegalAccessException;
        }
        localNoSuchMethodException = localNoSuchMethodException;
        c("Method \"" + this.a + "\" not found");
        localObject = null;
      }
    }
  }
  
  protected void h() {}
  
  protected void i() {}
  
  public String j()
  {
    return this.a;
  }
  
  public String toString()
  {
    return j() + "(" + getClass().getName() + ")";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */