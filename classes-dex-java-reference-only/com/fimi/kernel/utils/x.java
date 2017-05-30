package com.fimi.kernel.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class x
{
  private static ExecutorService a;
  
  public static ExecutorService a()
  {
    try
    {
      if (a == null) {
        a = Executors.newCachedThreadPool();
      }
      ExecutorService localExecutorService = a;
      return localExecutorService;
    }
    finally {}
  }
  
  public static void a(Runnable paramRunnable)
  {
    a().execute(paramRunnable);
  }
  
  public static void b()
  {
    if (a != null)
    {
      a.shutdownNow();
      a = null;
    }
  }
  
  public static void b(Runnable paramRunnable)
  {
    a().execute(paramRunnable);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */