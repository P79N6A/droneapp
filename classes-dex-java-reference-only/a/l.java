package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class l<TResult>
{
  public static final ExecutorService a = ;
  public static final Executor b = b.b();
  private static final Executor c = h.b();
  private final Object d = new Object();
  private boolean e;
  private boolean f;
  private TResult g;
  private Exception h;
  private List<j<TResult, Void>> i = new ArrayList();
  
  public static <TResult> l<TResult>.a a()
  {
    l locall = new l();
    locall.getClass();
    return new a(null);
  }
  
  public static <TResult> l<TResult> a(Exception paramException)
  {
    a locala = a();
    locala.b(paramException);
    return locala.a();
  }
  
  public static <TResult> l<TResult> a(TResult paramTResult)
  {
    a locala = a();
    locala.b(paramTResult);
    return locala.a();
  }
  
  public static l<Void> a(Collection<? extends l<?>> paramCollection)
  {
    if (paramCollection.size() == 0) {
      return a(null);
    }
    final a locala = a();
    final ArrayList localArrayList = new ArrayList();
    Object localObject = new Object();
    final AtomicInteger localAtomicInteger = new AtomicInteger(paramCollection.size());
    final AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      ((l)paramCollection.next()).a(new j()
      {
        public Void a(l<Object> paramAnonymousl)
        {
          if (paramAnonymousl.d()) {}
          synchronized (this.a)
          {
            localArrayList.add(paramAnonymousl.f());
            if (paramAnonymousl.c()) {
              localAtomicBoolean.set(true);
            }
            if (localAtomicInteger.decrementAndGet() == 0)
            {
              if (localArrayList.size() == 0) {
                break label161;
              }
              if (localArrayList.size() == 1) {
                locala.b((Exception)localArrayList.get(0));
              }
            }
            else
            {
              return null;
            }
          }
          paramAnonymousl = (Throwable[])localArrayList.toArray(new Throwable[localArrayList.size()]);
          paramAnonymousl = new a(String.format("There were %d exceptions.", new Object[] { Integer.valueOf(localArrayList.size()) }), paramAnonymousl);
          locala.b(paramAnonymousl);
          return null;
          label161:
          if (localAtomicBoolean.get())
          {
            locala.c();
            return null;
          }
          locala.b(null);
          return null;
        }
      });
    }
    return locala.a();
  }
  
  public static <TResult> l<TResult> a(Callable<TResult> paramCallable)
  {
    return a(paramCallable, a);
  }
  
  public static <TResult> l<TResult> a(final Callable<TResult> paramCallable, Executor paramExecutor)
  {
    a locala = a();
    paramExecutor.execute(new Runnable()
    {
      public void run()
      {
        try
        {
          this.a.b(paramCallable.call());
          return;
        }
        catch (Exception localException)
        {
          this.a.b(localException);
        }
      }
    });
    return locala.a();
  }
  
  public static <TResult> l<TResult> b(Callable<TResult> paramCallable)
  {
    return a(paramCallable, c);
  }
  
  private static <TContinuationResult, TResult> void c(final l<TContinuationResult>.a paraml, j<TResult, TContinuationResult> paramj, final l<TResult> paraml1, Executor paramExecutor)
  {
    paramExecutor.execute(new Runnable()
    {
      public void run()
      {
        try
        {
          Object localObject = this.a.then(paraml1);
          paraml.b(localObject);
          return;
        }
        catch (Exception localException)
        {
          paraml.b(localException);
        }
      }
    });
  }
  
  private static <TContinuationResult, TResult> void d(final l<TContinuationResult>.a paraml, j<TResult, l<TContinuationResult>> paramj, final l<TResult> paraml1, Executor paramExecutor)
  {
    paramExecutor.execute(new Runnable()
    {
      public void run()
      {
        try
        {
          l locall = (l)this.a.then(paraml1);
          if (locall == null)
          {
            paraml.b(null);
            return;
          }
          locall.a(new j()
          {
            public Void a(l<TContinuationResult> paramAnonymous2l)
            {
              if (paramAnonymous2l.c()) {
                l.2.this.c.c();
              }
              for (;;)
              {
                return null;
                if (paramAnonymous2l.d()) {
                  l.2.this.c.b(paramAnonymous2l.f());
                } else {
                  l.2.this.c.b(paramAnonymous2l.e());
                }
              }
            }
          });
          return;
        }
        catch (Exception localException)
        {
          paraml.b(localException);
        }
      }
    });
  }
  
  public static <TResult> l<TResult> h()
  {
    a locala = a();
    locala.c();
    return locala.a();
  }
  
  private void k()
  {
    for (;;)
    {
      j localj;
      synchronized (this.d)
      {
        Iterator localIterator = this.i.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localj = (j)localIterator.next();
      }
      try
      {
        localj.then(this);
      }
      catch (RuntimeException localRuntimeException)
      {
        throw localRuntimeException;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
    }
    this.i = null;
  }
  
  public <TContinuationResult> l<TContinuationResult> a(j<TResult, TContinuationResult> paramj)
  {
    return a(paramj, c);
  }
  
  public <TContinuationResult> l<TContinuationResult> a(final j<TResult, TContinuationResult> paramj, final Executor paramExecutor)
  {
    final a locala = a();
    synchronized (this.d)
    {
      boolean bool = b();
      if (!bool) {
        this.i.add(new j()
        {
          public Void a(l<TResult> paramAnonymousl)
          {
            l.a(locala, paramj, paramAnonymousl, paramExecutor);
            return null;
          }
        });
      }
      if (bool) {
        c(locala, paramj, this, paramExecutor);
      }
      return locala.a();
    }
  }
  
  public l<Void> a(Callable<Boolean> paramCallable, j<Void, l<Void>> paramj)
  {
    return a(paramCallable, paramj, c);
  }
  
  public l<Void> a(final Callable<Boolean> paramCallable, final j<Void, l<Void>> paramj, final Executor paramExecutor)
  {
    final i locali = new i();
    locali.a(new j()
    {
      public l<Void> a(l<Void> paramAnonymousl)
      {
        if (((Boolean)paramCallable.call()).booleanValue()) {
          return l.a(null).d(paramj, paramExecutor).d((j)locali.a(), paramExecutor);
        }
        return l.a(null);
      }
    });
    return j().b((j)locali.a(), paramExecutor);
  }
  
  public <TContinuationResult> l<TContinuationResult> b(j<TResult, l<TContinuationResult>> paramj)
  {
    return b(paramj, c);
  }
  
  public <TContinuationResult> l<TContinuationResult> b(final j<TResult, l<TContinuationResult>> paramj, final Executor paramExecutor)
  {
    final a locala = a();
    synchronized (this.d)
    {
      boolean bool = b();
      if (!bool) {
        this.i.add(new j()
        {
          public Void a(l<TResult> paramAnonymousl)
          {
            l.b(locala, paramj, paramAnonymousl, paramExecutor);
            return null;
          }
        });
      }
      if (bool) {
        d(locala, paramj, this, paramExecutor);
      }
      return locala.a();
    }
  }
  
  public boolean b()
  {
    synchronized (this.d)
    {
      boolean bool = this.e;
      return bool;
    }
  }
  
  public <TContinuationResult> l<TContinuationResult> c(j<TResult, TContinuationResult> paramj)
  {
    return c(paramj, c);
  }
  
  public <TContinuationResult> l<TContinuationResult> c(final j<TResult, TContinuationResult> paramj, Executor paramExecutor)
  {
    b(new j()
    {
      public l<TContinuationResult> a(l<TResult> paramAnonymousl)
      {
        if (paramAnonymousl.d()) {
          return l.a(paramAnonymousl.f());
        }
        if (paramAnonymousl.c()) {
          return l.h();
        }
        return paramAnonymousl.a(paramj);
      }
    }, paramExecutor);
  }
  
  public boolean c()
  {
    synchronized (this.d)
    {
      boolean bool = this.f;
      return bool;
    }
  }
  
  public <TContinuationResult> l<TContinuationResult> d(j<TResult, l<TContinuationResult>> paramj)
  {
    return d(paramj, c);
  }
  
  public <TContinuationResult> l<TContinuationResult> d(final j<TResult, l<TContinuationResult>> paramj, Executor paramExecutor)
  {
    b(new j()
    {
      public l<TContinuationResult> a(l<TResult> paramAnonymousl)
      {
        if (paramAnonymousl.d()) {
          return l.a(paramAnonymousl.f());
        }
        if (paramAnonymousl.c()) {
          return l.h();
        }
        return paramAnonymousl.b(paramj);
      }
    }, paramExecutor);
  }
  
  public boolean d()
  {
    for (;;)
    {
      synchronized (this.d)
      {
        if (this.h != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public TResult e()
  {
    synchronized (this.d)
    {
      Object localObject2 = this.g;
      return (TResult)localObject2;
    }
  }
  
  public Exception f()
  {
    synchronized (this.d)
    {
      Exception localException = this.h;
      return localException;
    }
  }
  
  public void g()
  {
    synchronized (this.d)
    {
      if (!b()) {
        this.d.wait();
      }
      return;
    }
  }
  
  public <TOut> l<TOut> i()
  {
    return this;
  }
  
  public l<Void> j()
  {
    b(new j()
    {
      public l<Void> a(l<TResult> paramAnonymousl)
      {
        if (paramAnonymousl.c()) {
          return l.h();
        }
        if (paramAnonymousl.d()) {
          return l.a(paramAnonymousl.f());
        }
        return l.a(null);
      }
    });
  }
  
  public class a
  {
    private a() {}
    
    public l<TResult> a()
    {
      return l.this;
    }
    
    public boolean a(Exception paramException)
    {
      synchronized (l.a(l.this))
      {
        if (l.b(l.this)) {
          return false;
        }
        l.a(l.this, true);
        l.a(l.this, paramException);
        l.a(l.this).notifyAll();
        l.c(l.this);
        return true;
      }
    }
    
    public boolean a(TResult paramTResult)
    {
      synchronized (l.a(l.this))
      {
        if (l.b(l.this)) {
          return false;
        }
        l.a(l.this, true);
        l.a(l.this, paramTResult);
        l.a(l.this).notifyAll();
        l.c(l.this);
        return true;
      }
    }
    
    public void b(Exception paramException)
    {
      if (!a(paramException)) {
        throw new IllegalStateException("Cannot set the error on a completed task.");
      }
    }
    
    public void b(TResult paramTResult)
    {
      if (!a(paramTResult)) {
        throw new IllegalStateException("Cannot set the result of a completed task.");
      }
    }
    
    public boolean b()
    {
      synchronized (l.a(l.this))
      {
        if (l.b(l.this)) {
          return false;
        }
        l.a(l.this, true);
        l.b(l.this, true);
        l.a(l.this).notifyAll();
        l.c(l.this);
        return true;
      }
    }
    
    public void c()
    {
      if (!b()) {
        throw new IllegalStateException("Cannot cancel a completed task.");
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */