package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class o
{
  private static final int f = 4;
  private AtomicInteger a = new AtomicInteger();
  private final Map<String, Queue<n<?>>> b = new HashMap();
  private final Set<n<?>> c = new HashSet();
  private final PriorityBlockingQueue<n<?>> d = new PriorityBlockingQueue();
  private final PriorityBlockingQueue<n<?>> e = new PriorityBlockingQueue();
  private final b g;
  private final g h;
  private final q i;
  private h[] j;
  private c k;
  private List<b> l = new ArrayList();
  
  public o(b paramb, g paramg)
  {
    this(paramb, paramg, 4);
  }
  
  public o(b paramb, g paramg, int paramInt)
  {
    this(paramb, paramg, paramInt, new e(new Handler(Looper.getMainLooper())));
  }
  
  public o(b paramb, g paramg, int paramInt, q paramq)
  {
    this.g = paramb;
    this.h = paramg;
    this.j = new h[paramInt];
    this.i = paramq;
  }
  
  public <T> n<T> a(n<T> paramn)
  {
    paramn.a(this);
    synchronized (this.c)
    {
      this.c.add(paramn);
      paramn.a(c());
      paramn.a("add-to-queue");
      if (!paramn.w())
      {
        this.e.add(paramn);
        return paramn;
      }
    }
    for (;;)
    {
      String str;
      synchronized (this.b)
      {
        str = paramn.j();
        if (this.b.containsKey(str))
        {
          Queue localQueue = (Queue)this.b.get(str);
          ??? = localQueue;
          if (localQueue == null) {
            ??? = new LinkedList();
          }
          ((Queue)???).add(paramn);
          this.b.put(str, ???);
          if (v.b) {
            v.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] { str });
          }
          return paramn;
        }
      }
      this.b.put(str, null);
      this.d.add(paramn);
    }
  }
  
  public void a()
  {
    b();
    this.k = new c(this.d, this.e, this.g, this.i);
    this.k.start();
    int m = 0;
    while (m < this.j.length)
    {
      h localh = new h(this.e, this.h, this.g, this.i);
      this.j[m] = localh;
      localh.start();
      m += 1;
    }
  }
  
  public void a(a parama)
  {
    synchronized (this.c)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        n localn = (n)localIterator.next();
        if (parama.a(localn)) {
          localn.l();
        }
      }
    }
  }
  
  public <T> void a(b<T> paramb)
  {
    synchronized (this.l)
    {
      this.l.add(paramb);
      return;
    }
  }
  
  public void a(final Object paramObject)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }
    a(new a()
    {
      public boolean a(n<?> paramAnonymousn)
      {
        return paramAnonymousn.b() == paramObject;
      }
    });
  }
  
  public void b()
  {
    if (this.k != null) {
      this.k.a();
    }
    int m = 0;
    while (m < this.j.length)
    {
      if (this.j[m] != null) {
        this.j[m].a();
      }
      m += 1;
    }
  }
  
  <T> void b(n<T> paramn)
  {
    Object localObject2;
    synchronized (this.c)
    {
      this.c.remove(paramn);
      synchronized (this.l)
      {
        localObject2 = this.l.iterator();
        if (((Iterator)localObject2).hasNext()) {
          ((b)((Iterator)localObject2).next()).a(paramn);
        }
      }
    }
    if (paramn.w()) {
      synchronized (this.b)
      {
        paramn = paramn.j();
        localObject2 = (Queue)this.b.remove(paramn);
        if (localObject2 != null)
        {
          if (v.b) {
            v.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] { Integer.valueOf(((Queue)localObject2).size()), paramn });
          }
          this.d.addAll((Collection)localObject2);
        }
        return;
      }
    }
  }
  
  public <T> void b(b<T> paramb)
  {
    synchronized (this.l)
    {
      this.l.remove(paramb);
      return;
    }
  }
  
  public int c()
  {
    return this.a.incrementAndGet();
  }
  
  public b d()
  {
    return this.g;
  }
  
  public static abstract interface a
  {
    public abstract boolean a(n<?> paramn);
  }
  
  public static abstract interface b<T>
  {
    public abstract void a(n<T> paramn);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */