package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@aaa
public final class abu
{
  private static final ThreadPoolExecutor a = new ThreadPoolExecutor(10, 10, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Default"));
  private static final ThreadPoolExecutor b = new ThreadPoolExecutor(5, 5, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Loader"));
  
  static
  {
    a.allowCoreThreadTimeOut(true);
    b.allowCoreThreadTimeOut(true);
  }
  
  public static aco<Void> a(int paramInt, Runnable paramRunnable)
  {
    if (paramInt == 1) {
      return a(b, new abu.1(paramRunnable));
    }
    return a(a, new abu.2(paramRunnable));
  }
  
  public static aco<Void> a(Runnable paramRunnable)
  {
    return a(0, paramRunnable);
  }
  
  public static <T> aco<T> a(Callable<T> paramCallable)
  {
    return a(a, paramCallable);
  }
  
  public static <T> aco<T> a(ExecutorService paramExecutorService, Callable<T> paramCallable)
  {
    acl localacl = new acl();
    try
    {
      localacl.b(new abu.4(localacl, paramExecutorService.submit(new abu.3(localacl, paramCallable))));
      return localacl;
    }
    catch (RejectedExecutionException paramExecutorService)
    {
      abr.d("Thread execution is rejected.", paramExecutorService);
      localacl.cancel(true);
    }
    return localacl;
  }
  
  private static ThreadFactory a(String paramString)
  {
    return new abu.5(paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/abu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */