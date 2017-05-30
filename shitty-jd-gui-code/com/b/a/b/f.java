package com.b.a.b;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

class f
{
  final e a;
  private Executor b;
  private Executor c;
  private Executor d;
  private final Map<Integer, String> e = Collections.synchronizedMap(new HashMap());
  private final Map<String, ReentrantLock> f = new WeakHashMap();
  private final AtomicBoolean g = new AtomicBoolean(false);
  private final AtomicBoolean h = new AtomicBoolean(false);
  private final AtomicBoolean i = new AtomicBoolean(false);
  private final Object j = new Object();
  
  f(e parame)
  {
    this.a = parame;
    this.b = parame.g;
    this.c = parame.h;
    this.d = a.a();
  }
  
  private void h()
  {
    if ((!this.a.i) && (((ExecutorService)this.b).isShutdown())) {
      this.b = i();
    }
    if ((!this.a.j) && (((ExecutorService)this.c).isShutdown())) {
      this.c = i();
    }
  }
  
  private Executor i()
  {
    return a.a(this.a.k, this.a.l, this.a.m);
  }
  
  String a(com.b.a.b.e.a parama)
  {
    return (String)this.e.get(Integer.valueOf(parama.f()));
  }
  
  ReentrantLock a(String paramString)
  {
    ReentrantLock localReentrantLock2 = (ReentrantLock)this.f.get(paramString);
    ReentrantLock localReentrantLock1 = localReentrantLock2;
    if (localReentrantLock2 == null)
    {
      localReentrantLock1 = new ReentrantLock();
      this.f.put(paramString, localReentrantLock1);
    }
    return localReentrantLock1;
  }
  
  void a()
  {
    this.g.set(true);
  }
  
  void a(com.b.a.b.e.a parama, String paramString)
  {
    this.e.put(Integer.valueOf(parama.f()), paramString);
  }
  
  void a(final h paramh)
  {
    this.d.execute(new Runnable()
    {
      public void run()
      {
        File localFile = f.this.a.o.a(paramh.a());
        if ((localFile != null) && (localFile.exists())) {}
        for (int i = 1;; i = 0)
        {
          f.a(f.this);
          if (i == 0) {
            break;
          }
          f.b(f.this).execute(paramh);
          return;
        }
        f.c(f.this).execute(paramh);
      }
    });
  }
  
  void a(i parami)
  {
    h();
    this.c.execute(parami);
  }
  
  void a(Runnable paramRunnable)
  {
    this.d.execute(paramRunnable);
  }
  
  void a(boolean paramBoolean)
  {
    this.h.set(paramBoolean);
  }
  
  void b()
  {
    this.g.set(false);
    synchronized (this.j)
    {
      this.j.notifyAll();
      return;
    }
  }
  
  void b(com.b.a.b.e.a parama)
  {
    this.e.remove(Integer.valueOf(parama.f()));
  }
  
  void b(boolean paramBoolean)
  {
    this.i.set(paramBoolean);
  }
  
  void c()
  {
    if (!this.a.i) {
      ((ExecutorService)this.b).shutdownNow();
    }
    if (!this.a.j) {
      ((ExecutorService)this.c).shutdownNow();
    }
    this.e.clear();
    this.f.clear();
  }
  
  AtomicBoolean d()
  {
    return this.g;
  }
  
  Object e()
  {
    return this.j;
  }
  
  boolean f()
  {
    return this.h.get();
  }
  
  boolean g()
  {
    return this.i.get();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */