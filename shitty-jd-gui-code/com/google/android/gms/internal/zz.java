package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

@aaa
public class zz
  implements Thread.UncaughtExceptionHandler
{
  @Nullable
  private Thread.UncaughtExceptionHandler a;
  @Nullable
  private Thread.UncaughtExceptionHandler b;
  private Context c;
  private VersionInfoParcel d;
  
  public zz(Context paramContext, VersionInfoParcel paramVersionInfoParcel, @Nullable Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler1, @Nullable Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler2)
  {
    this.a = paramUncaughtExceptionHandler1;
    this.b = paramUncaughtExceptionHandler2;
    this.c = paramContext;
    this.d = paramVersionInfoParcel;
  }
  
  public static zz a(Context paramContext, Thread paramThread, VersionInfoParcel paramVersionInfoParcel)
  {
    if ((paramContext == null) || (paramThread == null) || (paramVersionInfoParcel == null)) {
      return null;
    }
    if (!a(paramContext)) {
      return null;
    }
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = paramThread.getUncaughtExceptionHandler();
    paramContext = new zz(paramContext, paramVersionInfoParcel, localUncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
    if ((localUncaughtExceptionHandler == null) || (!(localUncaughtExceptionHandler instanceof zz))) {
      try
      {
        paramThread.setUncaughtExceptionHandler(paramContext);
        return paramContext;
      }
      catch (SecurityException paramContext)
      {
        abr.c("Fail to set UncaughtExceptionHandler.", paramContext);
        return null;
      }
    }
    return (zz)localUncaughtExceptionHandler;
  }
  
  private static boolean a(Context paramContext)
  {
    return ((Boolean)uf.g.c()).booleanValue();
  }
  
  private Throwable c(Throwable paramThrowable)
  {
    if (((Boolean)uf.h.c()).booleanValue()) {
      return paramThrowable;
    }
    LinkedList localLinkedList = new LinkedList();
    while (paramThrowable != null)
    {
      localLinkedList.push(paramThrowable);
      paramThrowable = paramThrowable.getCause();
    }
    paramThrowable = null;
    Throwable localThrowable;
    if (!localLinkedList.isEmpty())
    {
      localThrowable = (Throwable)localLinkedList.pop();
      StackTraceElement[] arrayOfStackTraceElement = localThrowable.getStackTrace();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new StackTraceElement(localThrowable.getClass().getName(), "<filtered>", "<filtered>", 1));
      int k = arrayOfStackTraceElement.length;
      int i = 0;
      int j = 0;
      if (i < k)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
        if (a(localStackTraceElement.getClassName()))
        {
          localArrayList.add(localStackTraceElement);
          j = 1;
        }
        for (;;)
        {
          i += 1;
          break;
          if (b(localStackTraceElement.getClassName())) {
            localArrayList.add(localStackTraceElement);
          } else {
            localArrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
          }
        }
      }
      if (j == 0) {
        break label261;
      }
      if (paramThrowable == null)
      {
        paramThrowable = new Throwable(localThrowable.getMessage());
        label223:
        paramThrowable.setStackTrace((StackTraceElement[])localArrayList.toArray(new StackTraceElement[0]));
      }
    }
    label261:
    for (;;)
    {
      break;
      paramThrowable = new Throwable(localThrowable.getMessage(), paramThrowable);
      break label223;
      return paramThrowable;
    }
  }
  
  String a(Class paramClass, Throwable paramThrowable, String paramString)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("device", u.e().e()).appendQueryParameter("js", this.d.b).appendQueryParameter("appid", this.c.getApplicationContext().getPackageName()).appendQueryParameter("exceptiontype", paramClass.getName()).appendQueryParameter("stacktrace", localStringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", uf.a())).appendQueryParameter("exceptionkey", paramString).appendQueryParameter("cl", "133155058").appendQueryParameter("rc", "dev").toString();
  }
  
  public void a(Throwable paramThrowable, String paramString)
  {
    if (!a(this.c)) {}
    Throwable localThrowable;
    do
    {
      return;
      localThrowable = c(paramThrowable);
    } while (localThrowable == null);
    paramThrowable = paramThrowable.getClass();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(a(paramThrowable, localThrowable, paramString));
    u.e().a(localArrayList, u.i().h());
  }
  
  protected boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    if (paramString.startsWith((String)uf.i.c())) {
      return true;
    }
    try
    {
      boolean bool = Class.forName(paramString).isAnnotationPresent(aaa.class);
      return bool;
    }
    catch (Exception localException)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() == 0) {}
    }
    for (paramString = "Fail to check class type for class ".concat(paramString);; paramString = new String("Fail to check class type for class "))
    {
      abr.a(paramString, localException);
      return false;
    }
  }
  
  protected boolean a(Throwable paramThrowable)
  {
    boolean bool = true;
    if (paramThrowable == null) {
      return false;
    }
    int j = 0;
    int k = 0;
    while (paramThrowable != null)
    {
      StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
      int m = arrayOfStackTraceElement.length;
      int i = 0;
      while (i < m)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
        if (a(localStackTraceElement.getClassName())) {
          k = 1;
        }
        if (getClass().getName().equals(localStackTraceElement.getClassName())) {
          j = 1;
        }
        i += 1;
      }
      paramThrowable = paramThrowable.getCause();
    }
    if ((k != 0) && (j == 0)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public void b(Throwable paramThrowable)
  {
    a(paramThrowable, "");
  }
  
  protected boolean b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while ((!paramString.startsWith("android.")) && (!paramString.startsWith("java."))) {
      return false;
    }
    return true;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (a(paramThrowable)) {
      if (Looper.getMainLooper().getThread() != paramThread) {
        a(paramThrowable, "AdMobExceptionReporter.uncaughtException");
      }
    }
    do
    {
      return;
      b(paramThrowable);
      if (this.a != null)
      {
        this.a.uncaughtException(paramThread, paramThrowable);
        return;
      }
    } while (this.b == null);
    this.b.uncaughtException(paramThread, paramThrowable);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */