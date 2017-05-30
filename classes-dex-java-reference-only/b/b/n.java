package b.b;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.c.b.h;

public class n
  implements i
{
  private String a;
  private Vector<i> b = new Vector(10);
  
  public n() {}
  
  public n(Class<?> paramClass)
  {
    c(paramClass);
  }
  
  public n(Class<? extends j> paramClass, String paramString)
  {
    this(paramClass);
    b(paramString);
  }
  
  public n(String paramString)
  {
    b(paramString);
  }
  
  public n(Class<?>... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      a(d(paramVarArgs[i]));
      i += 1;
    }
  }
  
  public n(Class<? extends j>[] paramArrayOfClass, String paramString)
  {
    this(paramArrayOfClass);
    b(paramString);
  }
  
  /* Error */
  public static i a(Class<?> paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 63	b/b/n:a	(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 69	java/lang/reflect/Constructor:getParameterTypes	()[Ljava/lang/Class;
    //   9: arraylength
    //   10: ifne +64 -> 74
    //   13: aload_2
    //   14: iconst_0
    //   15: anewarray 4	java/lang/Object
    //   18: invokevirtual 73	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   21: astore_0
    //   22: aload_0
    //   23: instanceof 75
    //   26: ifeq +190 -> 216
    //   29: aload_0
    //   30: checkcast 75	b/b/j
    //   33: aload_1
    //   34: invokevirtual 78	b/b/j:e	(Ljava/lang/String;)V
    //   37: aload_0
    //   38: checkcast 6	b/b/i
    //   41: areturn
    //   42: astore_1
    //   43: new 80	java/lang/StringBuilder
    //   46: dup
    //   47: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   50: ldc 83
    //   52: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: aload_0
    //   56: invokevirtual 93	java/lang/Class:getName	()Ljava/lang/String;
    //   59: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc 95
    //   64: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokestatic 101	b/b/n:a	(Ljava/lang/String;)Lb/b/i;
    //   73: areturn
    //   74: aload_2
    //   75: iconst_1
    //   76: anewarray 4	java/lang/Object
    //   79: dup
    //   80: iconst_0
    //   81: aload_1
    //   82: aastore
    //   83: invokevirtual 73	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   86: astore_0
    //   87: goto -50 -> 37
    //   90: astore_0
    //   91: new 80	java/lang/StringBuilder
    //   94: dup
    //   95: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   98: ldc 103
    //   100: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload_1
    //   104: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: ldc 105
    //   109: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: aload_0
    //   113: invokestatic 108	b/b/n:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   116: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: ldc 110
    //   121: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: invokestatic 101	b/b/n:a	(Ljava/lang/String;)Lb/b/i;
    //   130: areturn
    //   131: astore_0
    //   132: new 80	java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   139: ldc 112
    //   141: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: aload_1
    //   145: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: ldc 105
    //   150: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: aload_0
    //   154: invokevirtual 116	java/lang/reflect/InvocationTargetException:getTargetException	()Ljava/lang/Throwable;
    //   157: invokestatic 108	b/b/n:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   160: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: ldc 110
    //   165: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 101	b/b/n:a	(Ljava/lang/String;)Lb/b/i;
    //   174: areturn
    //   175: astore_0
    //   176: new 80	java/lang/StringBuilder
    //   179: dup
    //   180: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   183: ldc 118
    //   185: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: aload_1
    //   189: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: ldc 105
    //   194: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload_0
    //   198: invokestatic 108	b/b/n:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   201: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: ldc 110
    //   206: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokestatic 101	b/b/n:a	(Ljava/lang/String;)Lb/b/i;
    //   215: areturn
    //   216: goto -179 -> 37
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	paramClass	Class<?>
    //   0	219	1	paramString	String
    //   4	71	2	localConstructor	Constructor
    // Exception table:
    //   from	to	target	type
    //   0	5	42	java/lang/NoSuchMethodException
    //   5	37	90	java/lang/InstantiationException
    //   74	87	90	java/lang/InstantiationException
    //   5	37	131	java/lang/reflect/InvocationTargetException
    //   74	87	131	java/lang/reflect/InvocationTargetException
    //   5	37	175	java/lang/IllegalAccessException
    //   74	87	175	java/lang/IllegalAccessException
  }
  
  public static i a(final String paramString)
  {
    new j("warning")
    {
      protected void f()
      {
        c(paramString);
      }
    };
  }
  
  private static String a(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }
  
  public static Constructor<?> a(Class<?> paramClass)
  {
    try
    {
      Constructor localConstructor = paramClass.getConstructor(new Class[] { String.class });
      return localConstructor;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    return paramClass.getConstructor(new Class[0]);
  }
  
  private void a(Method paramMethod, List<String> paramList, Class<?> paramClass)
  {
    String str = paramMethod.getName();
    if (paramList.contains(str)) {}
    do
    {
      return;
      if (a(paramMethod)) {
        break;
      }
    } while (!b(paramMethod));
    a(a("Test method isn't public: " + paramMethod.getName() + "(" + paramClass.getCanonicalName() + ")"));
    return;
    paramList.add(str);
    a(a(paramClass, str));
  }
  
  private boolean a(Method paramMethod)
  {
    return (b(paramMethod)) && (Modifier.isPublic(paramMethod.getModifiers()));
  }
  
  private boolean b(Method paramMethod)
  {
    return (paramMethod.getParameterTypes().length == 0) && (paramMethod.getName().startsWith("test")) && (paramMethod.getReturnType().equals(Void.TYPE));
  }
  
  private void c(Class<?> paramClass)
  {
    this.a = paramClass.getName();
    do
    {
      try
      {
        a(paramClass);
        if (!Modifier.isPublic(paramClass.getModifiers()))
        {
          a(a("Class " + paramClass.getName() + " is not public"));
          return;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        a(a("Class " + paramClass.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        return;
      }
      ArrayList localArrayList = new ArrayList();
      for (Object localObject = paramClass; i.class.isAssignableFrom((Class)localObject); localObject = ((Class)localObject).getSuperclass())
      {
        Method[] arrayOfMethod = h.a((Class)localObject);
        int j = arrayOfMethod.length;
        int i = 0;
        while (i < j)
        {
          a(arrayOfMethod[i], localArrayList, paramClass);
          i += 1;
        }
      }
    } while (this.b.size() != 0);
    a(a("No tests found in " + paramClass.getName()));
  }
  
  private i d(Class<?> paramClass)
  {
    if (j.class.isAssignableFrom(paramClass)) {
      return new n(paramClass.asSubclass(j.class));
    }
    return a(paramClass.getCanonicalName() + " does not extend TestCase");
  }
  
  public int a()
  {
    Iterator localIterator = this.b.iterator();
    for (int i = 0; localIterator.hasNext(); i = ((i)localIterator.next()).a() + i) {}
    return i;
  }
  
  public i a(int paramInt)
  {
    return (i)this.b.get(paramInt);
  }
  
  public void a(i parami)
  {
    this.b.add(parami);
  }
  
  public void a(i parami, m paramm)
  {
    parami.a(paramm);
  }
  
  public void a(m paramm)
  {
    Iterator localIterator = this.b.iterator();
    for (;;)
    {
      i locali;
      if (localIterator.hasNext())
      {
        locali = (i)localIterator.next();
        if (!paramm.f()) {}
      }
      else
      {
        return;
      }
      a(locali, paramm);
    }
  }
  
  public void b(Class<? extends j> paramClass)
  {
    a(new n(paramClass));
  }
  
  public void b(String paramString)
  {
    this.a = paramString;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.b.size();
  }
  
  public Enumeration<i> e()
  {
    return this.b.elements();
  }
  
  public String toString()
  {
    if (c() != null) {
      return c();
    }
    return super.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */