package a;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class h
{
  private static final h a = new h();
  private final ExecutorService b;
  private final Executor c;
  
  private h()
  {
    if (!c()) {}
    for (ExecutorService localExecutorService = Executors.newCachedThreadPool();; localExecutorService = b.a())
    {
      this.b = localExecutorService;
      this.c = new a(null);
      return;
    }
  }
  
  public static ExecutorService a()
  {
    return a.b;
  }
  
  static Executor b()
  {
    return a.c;
  }
  
  private static boolean c()
  {
    String str = System.getProperty("java.runtime.name");
    if (str == null) {
      return false;
    }
    return str.toLowerCase(Locale.US).contains("android");
  }
  
  private static class a
    implements Executor
  {
    private static final int a = 15;
    private ThreadLocal<Integer> b = new ThreadLocal();
    
    private int a()
    {
      Integer localInteger2 = (Integer)this.b.get();
      Integer localInteger1 = localInteger2;
      if (localInteger2 == null) {
        localInteger1 = Integer.valueOf(0);
      }
      int i = localInteger1.intValue() + 1;
      this.b.set(Integer.valueOf(i));
      return i;
    }
    
    private int b()
    {
      Integer localInteger2 = (Integer)this.b.get();
      Integer localInteger1 = localInteger2;
      if (localInteger2 == null) {
        localInteger1 = Integer.valueOf(0);
      }
      int i = localInteger1.intValue() - 1;
      if (i == 0)
      {
        this.b.remove();
        return i;
      }
      this.b.set(Integer.valueOf(i));
      return i;
    }
    
    public void execute(Runnable paramRunnable)
    {
      if (a() <= 15) {}
      for (;;)
      {
        try
        {
          paramRunnable.run();
          return;
        }
        finally
        {
          b();
        }
        h.a().execute(paramRunnable);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */