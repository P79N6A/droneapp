package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class p
{
  private static volatile p a;
  private final Context b;
  private final List<q> c;
  private final k d;
  private final a e;
  private volatile ado f;
  private Thread.UncaughtExceptionHandler g;
  
  p(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    d.a(paramContext);
    this.b = paramContext;
    this.e = new a();
    this.c = new CopyOnWriteArrayList();
    this.d = new k();
  }
  
  public static p a(Context paramContext)
  {
    d.a(paramContext);
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new p(paramContext);
      }
      return a;
    }
    finally {}
  }
  
  private void b(l paraml)
  {
    d.c("deliver should be called from worker thread");
    d.b(paraml.f(), "Measurement must be submitted");
    Object localObject = paraml.c();
    if (((List)localObject).isEmpty()) {}
    for (;;)
    {
      return;
      HashSet localHashSet = new HashSet();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        r localr = (r)((Iterator)localObject).next();
        Uri localUri = localr.a();
        if (!localHashSet.contains(localUri))
        {
          localHashSet.add(localUri);
          localr.a(paraml);
        }
      }
    }
  }
  
  public static void d()
  {
    if (!(Thread.currentThread() instanceof c)) {
      throw new IllegalStateException("Call expected from worker thread");
    }
  }
  
  public ado a()
  {
    if (this.f == null) {}
    label202:
    for (;;)
    {
      try
      {
        ado localado;
        PackageManager localPackageManager;
        String str3;
        Object localObject5;
        Object localObject3;
        if (this.f == null)
        {
          localado = new ado();
          localPackageManager = this.b.getPackageManager();
          str3 = this.b.getPackageName();
          localado.c(str3);
          localado.d(localPackageManager.getInstallerPackageName(str3));
          localObject5 = null;
          localObject3 = str3;
        }
        try
        {
          PackageInfo localPackageInfo = localPackageManager.getPackageInfo(this.b.getPackageName(), 0);
          localObject4 = localObject5;
          String str1 = str3;
          if (localPackageInfo != null)
          {
            localObject3 = str3;
            localObject4 = localPackageManager.getApplicationLabel(localPackageInfo.applicationInfo);
            str1 = str3;
            localObject3 = str3;
            if (!TextUtils.isEmpty((CharSequence)localObject4))
            {
              localObject3 = str3;
              str1 = ((CharSequence)localObject4).toString();
            }
            localObject3 = str1;
            localObject4 = localPackageInfo.versionName;
          }
          localado.a(str1);
          localado.b((String)localObject4);
          this.f = localado;
          return this.f;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          localObject1 = String.valueOf(localObject3);
          if (((String)localObject1).length() == 0) {
            break label202;
          }
        }
        Object localObject1 = "Error retrieving package info: appName set to ".concat((String)localObject1);
        Log.e("GAv4", (String)localObject1);
        Object localObject4 = localObject5;
        localObject1 = localObject3;
        continue;
        String str2 = new String("Error retrieving package info: appName set to ");
      }
      finally {}
    }
  }
  
  public <V> Future<V> a(Callable<V> paramCallable)
  {
    d.a(paramCallable);
    if ((Thread.currentThread() instanceof c))
    {
      paramCallable = new FutureTask(paramCallable);
      paramCallable.run();
      return paramCallable;
    }
    return this.e.submit(paramCallable);
  }
  
  void a(final l paraml)
  {
    if (paraml.j()) {
      throw new IllegalStateException("Measurement prototype can't be submitted");
    }
    if (paraml.f()) {
      throw new IllegalStateException("Measurement can only be submitted once");
    }
    paraml = paraml.a();
    paraml.g();
    this.e.execute(new Runnable()
    {
      public void run()
      {
        paraml.h().a(paraml);
        Iterator localIterator = p.a(p.this).iterator();
        while (localIterator.hasNext()) {
          ((q)localIterator.next()).a(paraml);
        }
        p.a(p.this, paraml);
      }
    });
  }
  
  public void a(Runnable paramRunnable)
  {
    d.a(paramRunnable);
    this.e.submit(paramRunnable);
  }
  
  public void a(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.g = paramUncaughtExceptionHandler;
  }
  
  public adt b()
  {
    DisplayMetrics localDisplayMetrics = this.b.getResources().getDisplayMetrics();
    adt localadt = new adt();
    localadt.a(com.google.android.gms.analytics.internal.p.a(Locale.getDefault()));
    localadt.b(localDisplayMetrics.widthPixels);
    localadt.c(localDisplayMetrics.heightPixels);
    return localadt;
  }
  
  public Context c()
  {
    return this.b;
  }
  
  private class a
    extends ThreadPoolExecutor
  {
    public a()
    {
      super(1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
      setThreadFactory(new p.b(null));
      allowCoreThreadTimeOut(true);
    }
    
    protected <T> RunnableFuture<T> newTaskFor(Runnable paramRunnable, T paramT)
    {
      new FutureTask(paramRunnable, paramT)
      {
        protected void setException(Throwable paramAnonymousThrowable)
        {
          Object localObject = p.b(p.this);
          if (localObject != null) {
            ((Thread.UncaughtExceptionHandler)localObject).uncaughtException(Thread.currentThread(), paramAnonymousThrowable);
          }
          for (;;)
          {
            super.setException(paramAnonymousThrowable);
            return;
            if (Log.isLoggable("GAv4", 6))
            {
              localObject = String.valueOf(paramAnonymousThrowable);
              Log.e("GAv4", String.valueOf(localObject).length() + 37 + "MeasurementExecutor: job failed with " + (String)localObject);
            }
          }
        }
      };
    }
  }
  
  private static class b
    implements ThreadFactory
  {
    private static final AtomicInteger a = new AtomicInteger();
    
    public Thread newThread(Runnable paramRunnable)
    {
      int i = a.incrementAndGet();
      return new p.c(paramRunnable, 23 + "measurement-" + i);
    }
  }
  
  private static class c
    extends Thread
  {
    c(Runnable paramRunnable, String paramString)
    {
      super(paramString);
    }
    
    public void run()
    {
      Process.setThreadPriority(10);
      super.run();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */