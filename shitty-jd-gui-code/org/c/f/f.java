package org.c.f;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.c.f.a.i;
import org.c.f.a.j;
import org.c.f.a.k;
import org.c.g;

public abstract class f<T>
  extends org.c.e.l
  implements org.c.e.a.b, org.c.e.a.d
{
  private static final List<org.c.g.e> a = Arrays.asList(new org.c.g.e[] { new org.c.g.c(), new org.c.g.d() });
  private final Object b = new Object();
  private final k c = a(paramClass);
  private volatile Collection<T> d = null;
  private volatile i e = new i()
  {
    public void a() {}
    
    public void a(Runnable paramAnonymousRunnable)
    {
      paramAnonymousRunnable.run();
    }
  };
  
  protected f(Class<?> paramClass)
  {
    b();
  }
  
  private boolean a()
  {
    Iterator localIterator = j().iterator();
    while (localIterator.hasNext()) {
      if (!c(localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  private boolean a(org.c.e.a.a parama, T paramT)
  {
    return parama.a(d(paramT));
  }
  
  private Comparator<? super T> b(final org.c.e.a.e parame)
  {
    new Comparator()
    {
      public int compare(T paramAnonymousT1, T paramAnonymousT2)
      {
        return parame.a(f.this.d(paramAnonymousT1), f.this.d(paramAnonymousT2));
      }
    };
  }
  
  private void b()
  {
    ArrayList localArrayList = new ArrayList();
    a(localArrayList);
    if (!localArrayList.isEmpty()) {
      throw new org.c.f.a.e(localArrayList);
    }
  }
  
  private void b(List<Throwable> paramList)
  {
    if (g().d() != null)
    {
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext()) {
        paramList.addAll(((org.c.g.e)localIterator.next()).a(g()));
      }
    }
  }
  
  private j c(j paramj)
  {
    List localList = e();
    if (localList.isEmpty()) {
      return paramj;
    }
    return new org.c.d.h(paramj, localList, d());
  }
  
  private void c(List<Throwable> paramList)
  {
    org.c.b.d.b.a.a.a(g(), paramList);
    org.c.b.d.b.a.c.a(g(), paramList);
  }
  
  private void d(final org.c.e.b.c paramc)
  {
    i locali = this.e;
    try
    {
      Iterator localIterator = j().iterator();
      while (localIterator.hasNext()) {
        locali.a(new Runnable()
        {
          public void run()
          {
            f.this.a(this.a, paramc);
          }
        });
      }
    }
    finally
    {
      locali.a();
    }
  }
  
  private Collection<T> j()
  {
    if (this.d == null) {}
    synchronized (this.b)
    {
      if (this.d == null) {
        this.d = Collections.unmodifiableCollection(c());
      }
      return this.d;
    }
  }
  
  protected j a(j paramj)
  {
    List localList = this.c.b(g.class);
    if (localList.isEmpty()) {
      return paramj;
    }
    return new org.c.b.d.c.f(paramj, localList, null);
  }
  
  protected k a(Class<?> paramClass)
  {
    return new k(paramClass);
  }
  
  protected void a(Class<? extends Annotation> paramClass, boolean paramBoolean, List<Throwable> paramList)
  {
    paramClass = g().b(paramClass).iterator();
    while (paramClass.hasNext()) {
      ((org.c.f.a.d)paramClass.next()).a(paramBoolean, paramList);
    }
  }
  
  protected abstract void a(T paramT, org.c.e.b.c paramc);
  
  protected void a(List<Throwable> paramList)
  {
    a(g.class, true, paramList);
    a(org.c.b.class, true, paramList);
    c(paramList);
    b(paramList);
  }
  
  public void a(org.c.e.a.a parama)
  {
    ArrayList localArrayList;
    for (;;)
    {
      Iterator localIterator;
      synchronized (this.b)
      {
        localArrayList = new ArrayList(j());
        localIterator = localArrayList.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        Object localObject2 = localIterator.next();
        boolean bool = a(parama, localObject2);
        if (bool) {
          try
          {
            parama.a(localObject2);
          }
          catch (org.c.e.a.c localc)
          {
            localIterator.remove();
          }
        }
      }
      localIterator.remove();
    }
    this.d = Collections.unmodifiableCollection(localArrayList);
    if (this.d.isEmpty()) {
      throw new org.c.e.a.c();
    }
  }
  
  public void a(org.c.e.a.e parame)
  {
    synchronized (this.b)
    {
      localObject2 = j().iterator();
      if (((Iterator)localObject2).hasNext()) {
        parame.a(((Iterator)localObject2).next());
      }
    }
    Object localObject2 = new ArrayList(j());
    Collections.sort((List)localObject2, b(parame));
    this.d = Collections.unmodifiableCollection((Collection)localObject2);
  }
  
  public void a(org.c.e.b.c paramc)
  {
    org.c.b.d.a.a locala = new org.c.b.d.a.a(paramc, d());
    try
    {
      b(paramc).a();
      return;
    }
    catch (org.c.b.b paramc)
    {
      locala.a(paramc);
      return;
    }
    catch (org.c.e.b.d paramc)
    {
      throw paramc;
    }
    catch (Throwable paramc)
    {
      locala.a(paramc);
    }
  }
  
  public void a(i parami)
  {
    this.e = parami;
  }
  
  protected final void a(j paramj, org.c.e.c paramc, org.c.e.b.c paramc1)
  {
    paramc = new org.c.b.d.a.a(paramc1, paramc);
    paramc.b();
    try
    {
      paramj.a();
      return;
    }
    catch (org.c.b.b paramj)
    {
      paramc.a(paramj);
      return;
    }
    catch (Throwable paramj)
    {
      paramc.a(paramj);
      return;
    }
    finally
    {
      paramc.a();
    }
  }
  
  protected j b(org.c.e.b.c paramc)
  {
    j localj = c(paramc);
    paramc = localj;
    if (!a()) {
      paramc = c(b(a(localj)));
    }
    return paramc;
  }
  
  protected j b(j paramj)
  {
    List localList = this.c.b(org.c.b.class);
    if (localList.isEmpty()) {
      return paramj;
    }
    return new org.c.b.d.c.e(paramj, localList, null);
  }
  
  protected abstract List<T> c();
  
  protected j c(final org.c.e.b.c paramc)
  {
    new j()
    {
      public void a()
      {
        f.a(f.this, paramc);
      }
    };
  }
  
  protected boolean c(T paramT)
  {
    return false;
  }
  
  public org.c.e.c d()
  {
    org.c.e.c localc = org.c.e.c.a(f(), i());
    Iterator localIterator = j().iterator();
    while (localIterator.hasNext()) {
      localc.a(d(localIterator.next()));
    }
    return localc;
  }
  
  protected abstract org.c.e.c d(T paramT);
  
  protected List<org.c.d.l> e()
  {
    List localList = this.c.b(null, org.c.h.class, org.c.d.l.class);
    localList.addAll(this.c.a(null, org.c.h.class, org.c.d.l.class));
    return localList;
  }
  
  protected String f()
  {
    return this.c.e();
  }
  
  public final k g()
  {
    return this.c;
  }
  
  protected Annotation[] i()
  {
    return this.c.a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */