package com.b.a.b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import com.b.a.b.a.g;
import com.b.a.b.c.e;
import com.b.a.c.d;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class a
{
  @TargetApi(11)
  private static int a(ActivityManager paramActivityManager)
  {
    return paramActivityManager.getLargeMemoryClass();
  }
  
  public static com.b.a.a.a.a a(Context paramContext, com.b.a.a.a.b.a parama, long paramLong, int paramInt)
  {
    File localFile = b(paramContext);
    if ((paramLong > 0L) || (paramInt > 0))
    {
      Object localObject = com.b.a.c.f.b(paramContext);
      try
      {
        localObject = new com.b.a.a.a.a.a.b((File)localObject, localFile, parama, paramLong, paramInt);
        return (com.b.a.a.a.a)localObject;
      }
      catch (IOException localIOException)
      {
        d.a(localIOException);
      }
    }
    return new com.b.a.a.a.a.c(com.b.a.c.f.a(paramContext), localFile, parama);
  }
  
  public static com.b.a.a.b.c a(Context paramContext, int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0)
    {
      ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
      paramInt = localActivityManager.getMemoryClass();
      if ((!d()) || (!c(paramContext))) {
        break label56;
      }
      paramInt = a(localActivityManager);
    }
    label56:
    for (;;)
    {
      i = paramInt * 1048576 / 8;
      return new com.b.a.a.b.a.f(i);
    }
  }
  
  public static com.b.a.b.b.b a(boolean paramBoolean)
  {
    return new com.b.a.b.b.a(paramBoolean);
  }
  
  public static com.b.a.b.d.b a(Context paramContext)
  {
    return new com.b.a.b.d.a(paramContext);
  }
  
  public static Executor a()
  {
    return Executors.newCachedThreadPool(a(5, "uil-pool-d-"));
  }
  
  public static Executor a(int paramInt1, int paramInt2, g paramg)
  {
    int i;
    if (paramg == g.b)
    {
      i = 1;
      if (i == 0) {
        break label52;
      }
    }
    label52:
    for (paramg = new com.b.a.b.a.a.c();; paramg = new LinkedBlockingQueue())
    {
      paramg = (BlockingQueue)paramg;
      return new ThreadPoolExecutor(paramInt1, paramInt1, 0L, TimeUnit.MILLISECONDS, paramg, a(paramInt2, "uil-pool-"));
      i = 0;
      break;
    }
  }
  
  private static ThreadFactory a(int paramInt, String paramString)
  {
    return new a(paramInt, paramString);
  }
  
  public static com.b.a.a.a.b.a b()
  {
    return new com.b.a.a.a.b.b();
  }
  
  private static File b(Context paramContext)
  {
    paramContext = com.b.a.c.f.a(paramContext, false);
    File localFile = new File(paramContext, "uil-images");
    if ((localFile.exists()) || (localFile.mkdir())) {
      paramContext = localFile;
    }
    return paramContext;
  }
  
  public static com.b.a.b.c.a c()
  {
    return new e();
  }
  
  @TargetApi(11)
  private static boolean c(Context paramContext)
  {
    return (paramContext.getApplicationInfo().flags & 0x100000) != 0;
  }
  
  private static boolean d()
  {
    return Build.VERSION.SDK_INT >= 11;
  }
  
  private static class a
    implements ThreadFactory
  {
    private static final AtomicInteger a = new AtomicInteger(1);
    private final ThreadGroup b;
    private final AtomicInteger c = new AtomicInteger(1);
    private final String d;
    private final int e;
    
    a(int paramInt, String paramString)
    {
      this.e = paramInt;
      this.b = Thread.currentThread().getThreadGroup();
      this.d = (paramString + a.getAndIncrement() + "-thread-");
    }
    
    public Thread newThread(Runnable paramRunnable)
    {
      paramRunnable = new Thread(this.b, paramRunnable, this.d + this.c.getAndIncrement(), 0L);
      if (paramRunnable.isDaemon()) {
        paramRunnable.setDaemon(false);
      }
      paramRunnable.setPriority(this.e);
      return paramRunnable;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */