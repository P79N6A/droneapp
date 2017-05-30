package org.c.f;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.c.b.d.c.c.a;
import org.c.b.d.c.e;
import org.c.d.h;
import org.c.f.a.j;
import org.c.m;
import org.c.m.a;

public class b
  extends f<org.c.f.a.d>
{
  private final ConcurrentHashMap<org.c.f.a.d, org.c.e.c> a = new ConcurrentHashMap();
  
  public b(Class<?> paramClass)
  {
    super(paramClass);
  }
  
  private Class<? extends Throwable> a(m paramm)
  {
    if ((paramm == null) || (paramm.a() == m.a.class)) {
      return null;
    }
    return paramm.a();
  }
  
  private j a(org.c.f.a.d paramd, List<org.c.d.l> paramList, Object paramObject, j paramj)
  {
    Iterator localIterator = e(paramObject).iterator();
    while (localIterator.hasNext())
    {
      org.c.d.f localf = (org.c.d.f)localIterator.next();
      if (!paramList.contains(localf)) {
        paramj = localf.a(paramj, paramd, paramObject);
      }
    }
    return paramj;
  }
  
  private j a(org.c.f.a.d paramd, List<org.c.d.l> paramList, j paramj)
  {
    if (paramList.isEmpty()) {
      return paramj;
    }
    return new h(paramj, paramList, c(paramd));
  }
  
  private boolean b(m paramm)
  {
    return a(paramm) != null;
  }
  
  private long c(m paramm)
  {
    if (paramm == null) {
      return 0L;
    }
    return paramm.b();
  }
  
  private List<org.c.d.f> e(Object paramObject)
  {
    return a(paramObject);
  }
  
  private j e(org.c.f.a.d paramd, Object paramObject, j paramj)
  {
    List localList = b(paramObject);
    return a(paramd, localList, a(paramd, localList, paramObject, paramj));
  }
  
  private void i(List<Throwable> paramList)
  {
    org.c.b.d.b.a.d.a(g(), paramList);
  }
  
  private boolean j()
  {
    return g().d().getConstructors().length == 1;
  }
  
  protected List<org.c.f.a.d> a()
  {
    return g().b(m.class);
  }
  
  protected List<org.c.d.f> a(Object paramObject)
  {
    List localList = g().b(paramObject, org.c.l.class, org.c.d.f.class);
    localList.addAll(g().a(paramObject, org.c.l.class, org.c.d.f.class));
    return localList;
  }
  
  protected j a(org.c.f.a.d paramd)
  {
    try
    {
      Object localObject = new b.1(this).a();
      return e(paramd, localObject, d(paramd, localObject, c(paramd, localObject, b(paramd, localObject, a(paramd, localObject, a(paramd, localObject))))));
    }
    catch (Throwable paramd) {}
    return new org.c.b.d.c.b(paramd);
  }
  
  protected j a(org.c.f.a.d paramd, Object paramObject)
  {
    return new org.c.b.d.c.d(paramd, paramObject);
  }
  
  protected j a(org.c.f.a.d paramd, Object paramObject, j paramj)
  {
    paramObject = (m)paramd.a(m.class);
    paramd = paramj;
    if (b((m)paramObject)) {
      paramd = new org.c.b.d.c.a(paramj, a((m)paramObject));
    }
    return paramd;
  }
  
  protected void a(List<Throwable> paramList)
  {
    super.a(paramList);
    d(paramList);
    b(paramList);
    g(paramList);
    h(paramList);
    i(paramList);
  }
  
  protected void a(org.c.f.a.d paramd, org.c.e.b.c paramc)
  {
    org.c.e.c localc = c(paramd);
    if (b(paramd))
    {
      paramc.c(localc);
      return;
    }
    a(a(paramd), localc, paramc);
  }
  
  protected Object b()
  {
    return g().f().newInstance(new Object[0]);
  }
  
  protected List<org.c.d.l> b(Object paramObject)
  {
    List localList = g().b(paramObject, org.c.l.class, org.c.d.l.class);
    localList.addAll(g().a(paramObject, org.c.l.class, org.c.d.l.class));
    return localList;
  }
  
  @Deprecated
  protected j b(org.c.f.a.d paramd, Object paramObject, j paramj)
  {
    long l = c((m)paramd.a(m.class));
    if (l <= 0L) {
      return paramj;
    }
    return org.c.b.d.c.c.b().a(l, TimeUnit.MILLISECONDS).a(paramj);
  }
  
  protected void b(List<Throwable> paramList)
  {
    e(paramList);
    f(paramList);
  }
  
  protected boolean b(org.c.f.a.d paramd)
  {
    return paramd.a(org.c.k.class) != null;
  }
  
  protected List<org.c.f.a.d> c()
  {
    return a();
  }
  
  protected org.c.e.c c(org.c.f.a.d paramd)
  {
    org.c.e.c localc2 = (org.c.e.c)this.a.get(paramd);
    org.c.e.c localc1 = localc2;
    if (localc2 == null)
    {
      localc1 = org.c.e.c.a(g().d(), d(paramd), paramd.a());
      this.a.putIfAbsent(paramd, localc1);
    }
    return localc1;
  }
  
  protected j c(org.c.f.a.d paramd, Object paramObject, j paramj)
  {
    paramd = g().b(org.c.f.class);
    if (paramd.isEmpty()) {
      return paramj;
    }
    return new org.c.b.d.c.f(paramj, paramd, paramObject);
  }
  
  protected void c(List<Throwable> paramList)
  {
    a(m.class, false, paramList);
  }
  
  protected String d(org.c.f.a.d paramd)
  {
    return paramd.b();
  }
  
  protected j d(org.c.f.a.d paramd, Object paramObject, j paramj)
  {
    paramd = g().b(org.c.a.class);
    if (paramd.isEmpty()) {
      return paramj;
    }
    return new e(paramj, paramd, paramObject);
  }
  
  protected void d(List<Throwable> paramList)
  {
    if (g().h()) {
      paramList.add(new Exception("The inner class " + g().e() + " is not static."));
    }
  }
  
  protected void e(List<Throwable> paramList)
  {
    if (!j()) {
      paramList.add(new Exception("Test class should have exactly one public constructor"));
    }
  }
  
  protected void f(List<Throwable> paramList)
  {
    if ((!g().h()) && (j()) && (g().f().getParameterTypes().length != 0)) {
      paramList.add(new Exception("Test class should have exactly one public zero-argument constructor"));
    }
  }
  
  @Deprecated
  protected void g(List<Throwable> paramList)
  {
    a(org.c.a.class, false, paramList);
    a(org.c.f.class, false, paramList);
    c(paramList);
    if (a().size() == 0) {
      paramList.add(new Exception("No runnable methods"));
    }
  }
  
  protected void h(List<Throwable> paramList)
  {
    org.c.b.d.b.a.b.a(g(), paramList);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */