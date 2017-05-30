package com.google.android.gms.analytics;

import android.content.Context;
import java.util.ArrayList;

public class b
  implements Thread.UncaughtExceptionHandler
{
  private final Thread.UncaughtExceptionHandler a;
  private final g b;
  private final Context c;
  private a d;
  private c e;
  
  public b(g paramg, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, Context paramContext)
  {
    if (paramg == null) {
      throw new NullPointerException("tracker cannot be null");
    }
    if (paramContext == null) {
      throw new NullPointerException("context cannot be null");
    }
    this.a = paramUncaughtExceptionHandler;
    this.b = paramg;
    this.d = new f(paramContext, new ArrayList());
    this.c = paramContext.getApplicationContext();
    if (paramUncaughtExceptionHandler == null)
    {
      paramg = "null";
      paramg = String.valueOf(paramg);
      if (paramg.length() == 0) {
        break label111;
      }
    }
    label111:
    for (paramg = "ExceptionReporter created, original handler is ".concat(paramg);; paramg = new String("ExceptionReporter created, original handler is "))
    {
      com.google.android.gms.analytics.internal.f.b(paramg);
      return;
      paramg = paramUncaughtExceptionHandler.getClass().getName();
      break;
    }
  }
  
  public a a()
  {
    return this.d;
  }
  
  public void a(a parama)
  {
    this.d = parama;
  }
  
  c b()
  {
    if (this.e == null) {
      this.e = c.a(this.c);
    }
    return this.e;
  }
  
  Thread.UncaughtExceptionHandler c()
  {
    return this.a;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Object localObject = "UncaughtException";
    if (this.d != null)
    {
      if (paramThread != null)
      {
        localObject = paramThread.getName();
        localObject = this.d.a((String)localObject, paramThrowable);
      }
    }
    else
    {
      str = String.valueOf(localObject);
      if (str.length() == 0) {
        break label126;
      }
    }
    label126:
    for (String str = "Reporting uncaught exception: ".concat(str);; str = new String("Reporting uncaught exception: "))
    {
      com.google.android.gms.analytics.internal.f.b(str);
      this.b.a(new d.c().a((String)localObject).a(true).a());
      localObject = b();
      ((c)localObject).i();
      ((c)localObject).j();
      if (this.a != null)
      {
        com.google.android.gms.analytics.internal.f.b("Passing exception to the original handler");
        this.a.uncaughtException(paramThread, paramThrowable);
      }
      return;
      localObject = null;
      break;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */