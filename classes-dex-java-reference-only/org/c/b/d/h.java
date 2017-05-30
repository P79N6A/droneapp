package org.c.b.d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.c.a;
import org.c.b;
import org.c.f;
import org.c.g;
import org.c.m;

@Deprecated
public class h
{
  private final List<Throwable> a = new ArrayList();
  private j b;
  
  public h(j paramj)
  {
    this.b = paramj;
  }
  
  private void a(Class<? extends Annotation> paramClass, boolean paramBoolean)
  {
    Iterator localIterator = this.b.a(paramClass).iterator();
    if (localIterator.hasNext())
    {
      Method localMethod = (Method)localIterator.next();
      if (Modifier.isStatic(localMethod.getModifiers()) != paramBoolean) {
        if (!paramBoolean) {
          break label338;
        }
      }
      label338:
      for (paramClass = "should";; paramClass = "should not")
      {
        this.a.add(new Exception("Method " + localMethod.getName() + "() " + paramClass + " be static"));
        if (!Modifier.isPublic(localMethod.getDeclaringClass().getModifiers())) {
          this.a.add(new Exception("Class " + localMethod.getDeclaringClass().getName() + " should be public"));
        }
        if (!Modifier.isPublic(localMethod.getModifiers())) {
          this.a.add(new Exception("Method " + localMethod.getName() + " should be public"));
        }
        if (localMethod.getReturnType() != Void.TYPE) {
          this.a.add(new Exception("Method " + localMethod.getName() + " should be void"));
        }
        if (localMethod.getParameterTypes().length == 0) {
          break;
        }
        this.a.add(new Exception("Method " + localMethod.getName() + " should have no parameters"));
        break;
      }
    }
  }
  
  public void a()
  {
    a(a.class, false);
    a(f.class, false);
    a(m.class, false);
    if (this.b.a(m.class).size() == 0) {
      this.a.add(new Exception("No runnable methods"));
    }
  }
  
  public void b()
  {
    a(g.class, true);
    a(b.class, true);
  }
  
  public List<Throwable> c()
  {
    e();
    b();
    a();
    return this.a;
  }
  
  public void d()
  {
    if (!this.a.isEmpty()) {
      throw new d(this.a);
    }
  }
  
  public void e()
  {
    try
    {
      this.b.d();
      return;
    }
    catch (Exception localException)
    {
      this.a.add(new Exception("Test class should have public zero-argument constructor", localException));
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */