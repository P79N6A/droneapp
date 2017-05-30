package com.a.a;

import android.util.Log;
import com.a.b.a;
import com.a.b.b;
import com.a.b.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class n
  implements Cloneable
{
  private static final p i = new h();
  private static final p j = new f();
  private static Class[] k = { Float.TYPE, Float.class, Double.TYPE, Integer.TYPE, Double.class, Integer.class };
  private static Class[] l = { Integer.TYPE, Integer.class, Float.TYPE, Double.TYPE, Float.class, Double.class };
  private static Class[] m = { Double.TYPE, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class };
  private static final HashMap<Class, HashMap<String, Method>> n = new HashMap();
  private static final HashMap<Class, HashMap<String, Method>> o = new HashMap();
  String a;
  protected d b;
  Method c = null;
  Class d;
  k e = null;
  final ReentrantReadWriteLock f = new ReentrantReadWriteLock();
  final Object[] g = new Object[1];
  private Method h = null;
  private p p;
  private Object q;
  
  private n(d paramd)
  {
    this.b = paramd;
    if (paramd != null) {
      this.a = paramd.b();
    }
  }
  
  private n(String paramString)
  {
    this.a = paramString;
  }
  
  public static <V> n a(d paramd, p<V> paramp, V... paramVarArgs)
  {
    paramd = new n(paramd);
    paramd.a(paramVarArgs);
    paramd.a(paramp);
    return paramd;
  }
  
  public static n a(d<?, Float> paramd, float... paramVarArgs)
  {
    return new a(paramd, paramVarArgs);
  }
  
  public static n a(d<?, Integer> paramd, int... paramVarArgs)
  {
    return new b(paramd, paramVarArgs);
  }
  
  public static n a(d paramd, j... paramVarArgs)
  {
    k localk = k.a(paramVarArgs);
    if ((localk instanceof i)) {
      return new b(paramd, (i)localk);
    }
    if ((localk instanceof g)) {
      return new a(paramd, (g)localk);
    }
    paramd = new n(paramd);
    paramd.e = localk;
    paramd.d = paramVarArgs[0].e();
    return paramd;
  }
  
  public static n a(String paramString, p paramp, Object... paramVarArgs)
  {
    paramString = new n(paramString);
    paramString.a(paramVarArgs);
    paramString.a(paramp);
    return paramString;
  }
  
  public static n a(String paramString, float... paramVarArgs)
  {
    return new a(paramString, paramVarArgs);
  }
  
  public static n a(String paramString, int... paramVarArgs)
  {
    return new b(paramString, paramVarArgs);
  }
  
  public static n a(String paramString, j... paramVarArgs)
  {
    k localk = k.a(paramVarArgs);
    if ((localk instanceof i)) {
      return new b(paramString, (i)localk);
    }
    if ((localk instanceof g)) {
      return new a(paramString, (g)localk);
    }
    paramString = new n(paramString);
    paramString.e = localk;
    paramString.d = paramVarArgs[0].e();
    return paramString;
  }
  
  static String a(String paramString1, String paramString2)
  {
    if ((paramString2 == null) || (paramString2.length() == 0)) {
      return paramString1;
    }
    char c1 = Character.toUpperCase(paramString2.charAt(0));
    paramString2 = paramString2.substring(1);
    return paramString1 + c1 + paramString2;
  }
  
  private Method a(Class paramClass1, String paramString, Class paramClass2)
  {
    Method localMethod1 = null;
    String str = a(paramString, this.a);
    if (paramClass2 == null) {
      try
      {
        paramString = paramClass1.getMethod(str, null);
        return paramString;
      }
      catch (NoSuchMethodException paramString) {}
    }
    try
    {
      paramClass1 = paramClass1.getDeclaredMethod(str, null);
      try
      {
        paramClass1.setAccessible(true);
        return paramClass1;
      }
      catch (NoSuchMethodException paramClass2) {}
    }
    catch (NoSuchMethodException paramClass1)
    {
      for (;;)
      {
        Class[] arrayOfClass;
        int i2;
        int i1;
        Class localClass;
        paramClass1 = null;
      }
    }
    Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.a + ": " + paramString);
    return paramClass1;
    arrayOfClass = new Class[1];
    if (this.d.equals(Float.class))
    {
      paramString = k;
      i2 = paramString.length;
      i1 = 0;
      paramClass2 = localMethod1;
    }
    for (;;)
    {
      if (i1 >= i2) {
        break label253;
      }
      localClass = paramString[i1];
      arrayOfClass[0] = localClass;
      try
      {
        localMethod1 = paramClass1.getMethod(str, arrayOfClass);
        paramClass2 = localMethod1;
        this.d = localClass;
        return localMethod1;
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        try
        {
          Method localMethod2 = paramClass1.getDeclaredMethod(str, arrayOfClass);
          paramClass2 = localMethod2;
          localMethod2.setAccessible(true);
          paramClass2 = localMethod2;
          this.d = localClass;
          return localMethod2;
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          i1 += 1;
        }
      }
      if (this.d.equals(Integer.class))
      {
        paramString = l;
        break;
      }
      if (this.d.equals(Double.class))
      {
        paramString = m;
        break;
      }
      paramString = new Class[1];
      paramString[0] = this.d;
      break;
    }
    label253:
    Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.a + " with value type " + this.d);
    return paramClass2;
  }
  
  private Method a(Class paramClass1, HashMap<Class, HashMap<String, Method>> paramHashMap, String paramString, Class paramClass2)
  {
    Method localMethod1 = null;
    try
    {
      this.f.writeLock().lock();
      HashMap localHashMap = (HashMap)paramHashMap.get(paramClass1);
      if (localHashMap != null) {
        localMethod1 = (Method)localHashMap.get(this.a);
      }
      Method localMethod2 = localMethod1;
      if (localMethod1 == null)
      {
        localMethod2 = a(paramClass1, paramString, paramClass2);
        paramString = localHashMap;
        if (localHashMap == null)
        {
          paramString = new HashMap();
          paramHashMap.put(paramClass1, paramString);
        }
        paramString.put(this.a, localMethod2);
      }
      return localMethod2;
    }
    finally
    {
      this.f.writeLock().unlock();
    }
  }
  
  private void a(Object paramObject, j paramj)
  {
    if (this.b != null) {
      paramj.a(this.b.a(paramObject));
    }
    try
    {
      if (this.h == null) {
        b(paramObject.getClass());
      }
      paramj.a(this.h.invoke(paramObject, new Object[0]));
      return;
    }
    catch (InvocationTargetException paramObject)
    {
      Log.e("PropertyValuesHolder", ((InvocationTargetException)paramObject).toString());
      return;
    }
    catch (IllegalAccessException paramObject)
    {
      Log.e("PropertyValuesHolder", ((IllegalAccessException)paramObject).toString());
    }
  }
  
  private void b(Class paramClass)
  {
    this.h = a(paramClass, o, "get", null);
  }
  
  public n a()
  {
    try
    {
      n localn = (n)super.clone();
      localn.a = this.a;
      localn.b = this.b;
      localn.e = this.e.b();
      localn.p = this.p;
      return localn;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
  
  void a(float paramFloat)
  {
    this.q = this.e.a(paramFloat);
  }
  
  public void a(p paramp)
  {
    this.p = paramp;
    this.e.a(paramp);
  }
  
  public void a(d paramd)
  {
    this.b = paramd;
  }
  
  void a(Class paramClass)
  {
    this.c = a(paramClass, n, "set", this.d);
  }
  
  void a(Object paramObject)
  {
    Object localObject;
    if (this.b != null)
    {
      try
      {
        this.b.a(paramObject);
        Iterator localIterator = this.e.e.iterator();
        while (localIterator.hasNext())
        {
          localObject = (j)localIterator.next();
          if (!((j)localObject).a()) {
            ((j)localObject).a(this.b.a(paramObject));
          }
        }
        localClass = paramObject.getClass();
      }
      catch (ClassCastException localClassCastException)
      {
        Log.e("PropertyValuesHolder", "No such property (" + this.b.b() + ") on target object " + paramObject + ". Trying reflection instead");
        this.b = null;
      }
    }
    else
    {
      Class localClass;
      if (this.c == null) {
        a(localClass);
      }
      localObject = this.e.e.iterator();
      while (((Iterator)localObject).hasNext())
      {
        j localj = (j)((Iterator)localObject).next();
        if (!localj.a())
        {
          if (this.h == null) {
            b(localClass);
          }
          try
          {
            localj.a(this.h.invoke(paramObject, new Object[0]));
          }
          catch (InvocationTargetException localInvocationTargetException)
          {
            Log.e("PropertyValuesHolder", localInvocationTargetException.toString());
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            Log.e("PropertyValuesHolder", localIllegalAccessException.toString());
          }
        }
      }
    }
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(float... paramVarArgs)
  {
    this.d = Float.TYPE;
    this.e = k.a(paramVarArgs);
  }
  
  public void a(int... paramVarArgs)
  {
    this.d = Integer.TYPE;
    this.e = k.a(paramVarArgs);
  }
  
  public void a(j... paramVarArgs)
  {
    int i1 = 0;
    int i2 = paramVarArgs.length;
    j[] arrayOfj = new j[Math.max(i2, 2)];
    this.d = paramVarArgs[0].e();
    while (i1 < i2)
    {
      arrayOfj[i1] = paramVarArgs[i1];
      i1 += 1;
    }
    this.e = new k(arrayOfj);
  }
  
  public void a(Object... paramVarArgs)
  {
    this.d = paramVarArgs[0].getClass();
    this.e = k.a(paramVarArgs);
  }
  
  void b()
  {
    p localp;
    if (this.p == null)
    {
      if (this.d != Integer.class) {
        break label44;
      }
      localp = i;
    }
    for (;;)
    {
      this.p = localp;
      if (this.p != null) {
        this.e.a(this.p);
      }
      return;
      label44:
      if (this.d == Float.class) {
        localp = j;
      } else {
        localp = null;
      }
    }
  }
  
  void b(Object paramObject)
  {
    a(paramObject, (j)this.e.e.get(0));
  }
  
  public String c()
  {
    return this.a;
  }
  
  void c(Object paramObject)
  {
    a(paramObject, (j)this.e.e.get(this.e.e.size() - 1));
  }
  
  Object d()
  {
    return this.q;
  }
  
  void d(Object paramObject)
  {
    if (this.b != null) {
      this.b.a(paramObject, d());
    }
    if (this.c != null) {}
    try
    {
      this.g[0] = d();
      this.c.invoke(paramObject, this.g);
      return;
    }
    catch (InvocationTargetException paramObject)
    {
      Log.e("PropertyValuesHolder", ((InvocationTargetException)paramObject).toString());
      return;
    }
    catch (IllegalAccessException paramObject)
    {
      Log.e("PropertyValuesHolder", ((IllegalAccessException)paramObject).toString());
    }
  }
  
  public String toString()
  {
    return this.a + ": " + this.e.toString();
  }
  
  static class a
    extends n
  {
    g h;
    float i;
    private a j;
    
    public a(d paramd, g paramg)
    {
      super(null);
      this.d = Float.TYPE;
      this.e = paramg;
      this.h = ((g)this.e);
      if ((paramd instanceof a)) {
        this.j = ((a)this.b);
      }
    }
    
    public a(d paramd, float... paramVarArgs)
    {
      super(null);
      a(paramVarArgs);
      if ((paramd instanceof a)) {
        this.j = ((a)this.b);
      }
    }
    
    public a(String paramString, g paramg)
    {
      super(null);
      this.d = Float.TYPE;
      this.e = paramg;
      this.h = ((g)this.e);
    }
    
    public a(String paramString, float... paramVarArgs)
    {
      super(null);
      a(paramVarArgs);
    }
    
    void a(float paramFloat)
    {
      this.i = this.h.b(paramFloat);
    }
    
    void a(Class paramClass)
    {
      if (this.b != null) {
        return;
      }
      super.a(paramClass);
    }
    
    public void a(float... paramVarArgs)
    {
      super.a(paramVarArgs);
      this.h = ((g)this.e);
    }
    
    Object d()
    {
      return Float.valueOf(this.i);
    }
    
    void d(Object paramObject)
    {
      if (this.j != null) {
        this.j.a(paramObject, this.i);
      }
      do
      {
        return;
        if (this.b != null)
        {
          this.b.a(paramObject, Float.valueOf(this.i));
          return;
        }
      } while (this.c == null);
      try
      {
        this.g[0] = Float.valueOf(this.i);
        this.c.invoke(paramObject, this.g);
        return;
      }
      catch (InvocationTargetException paramObject)
      {
        Log.e("PropertyValuesHolder", ((InvocationTargetException)paramObject).toString());
        return;
      }
      catch (IllegalAccessException paramObject)
      {
        Log.e("PropertyValuesHolder", ((IllegalAccessException)paramObject).toString());
      }
    }
    
    public a e()
    {
      a locala = (a)super.a();
      locala.h = ((g)locala.e);
      return locala;
    }
  }
  
  static class b
    extends n
  {
    i h;
    int i;
    private b j;
    
    public b(d paramd, i parami)
    {
      super(null);
      this.d = Integer.TYPE;
      this.e = parami;
      this.h = ((i)this.e);
      if ((paramd instanceof b)) {
        this.j = ((b)this.b);
      }
    }
    
    public b(d paramd, int... paramVarArgs)
    {
      super(null);
      a(paramVarArgs);
      if ((paramd instanceof b)) {
        this.j = ((b)this.b);
      }
    }
    
    public b(String paramString, i parami)
    {
      super(null);
      this.d = Integer.TYPE;
      this.e = parami;
      this.h = ((i)this.e);
    }
    
    public b(String paramString, int... paramVarArgs)
    {
      super(null);
      a(paramVarArgs);
    }
    
    void a(float paramFloat)
    {
      this.i = this.h.b(paramFloat);
    }
    
    void a(Class paramClass)
    {
      if (this.b != null) {
        return;
      }
      super.a(paramClass);
    }
    
    public void a(int... paramVarArgs)
    {
      super.a(paramVarArgs);
      this.h = ((i)this.e);
    }
    
    Object d()
    {
      return Integer.valueOf(this.i);
    }
    
    void d(Object paramObject)
    {
      if (this.j != null) {
        this.j.a(paramObject, this.i);
      }
      do
      {
        return;
        if (this.b != null)
        {
          this.b.a(paramObject, Integer.valueOf(this.i));
          return;
        }
      } while (this.c == null);
      try
      {
        this.g[0] = Integer.valueOf(this.i);
        this.c.invoke(paramObject, this.g);
        return;
      }
      catch (InvocationTargetException paramObject)
      {
        Log.e("PropertyValuesHolder", ((InvocationTargetException)paramObject).toString());
        return;
      }
      catch (IllegalAccessException paramObject)
      {
        Log.e("PropertyValuesHolder", ((IllegalAccessException)paramObject).toString());
      }
    }
    
    public b e()
    {
      b localb = (b)super.a();
      localb.h = ((i)localb.e);
      return localb;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/a/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */