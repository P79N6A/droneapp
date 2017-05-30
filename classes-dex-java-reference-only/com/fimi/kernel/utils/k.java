package com.fimi.kernel.utils;

import android.content.Context;
import android.util.Log;
import java.util.Calendar;

public class k
{
  public static boolean a = false;
  public static boolean b = false;
  public static boolean c = false;
  public static long d = 0L;
  
  public static void a()
  {
    a = true;
    b = true;
    c = true;
  }
  
  public static void a(Context paramContext)
  {
    a(paramContext.getClass().getSimpleName());
  }
  
  public static void a(Context paramContext, String paramString)
  {
    a(paramContext.getClass().getSimpleName(), paramString);
  }
  
  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    a(paramContext.getClass().getSimpleName(), paramString, paramBoolean);
  }
  
  public static void a(Class<?> paramClass)
  {
    a(paramClass.getSimpleName());
  }
  
  public static void a(Class<?> paramClass, String paramString)
  {
    a(paramClass.getSimpleName(), paramString);
  }
  
  public static void a(Class<?> paramClass, String paramString, boolean paramBoolean)
  {
    a(paramClass.getSimpleName(), paramString, paramBoolean);
  }
  
  public static void a(String paramString)
  {
    d = Calendar.getInstance().getTimeInMillis();
    Log.d(paramString, "日志计时开始：" + d);
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (a) {
      Log.d(paramString1, paramString2);
    }
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    long l = Calendar.getInstance().getTimeInMillis();
    Log.d(paramString1, paramString2 + ":" + (l - d) + "ms");
  }
  
  public static void a(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public static void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    a = paramBoolean1;
    b = paramBoolean2;
    c = paramBoolean3;
  }
  
  public static void b()
  {
    a = false;
    b = false;
    c = false;
  }
  
  public static void b(Context paramContext, String paramString)
  {
    b(paramContext.getClass().getSimpleName(), paramString);
  }
  
  public static void b(Class<?> paramClass, String paramString)
  {
    b(paramClass.getSimpleName(), paramString);
  }
  
  public static void b(String paramString1, String paramString2)
  {
    Log.i(paramString1, paramString2);
  }
  
  public static void b(boolean paramBoolean)
  {
    b = paramBoolean;
  }
  
  public static void c(Context paramContext, String paramString)
  {
    c(paramContext.getClass().getSimpleName(), paramString);
  }
  
  public static void c(Class<?> paramClass, String paramString)
  {
    c(paramClass.getSimpleName(), paramString);
  }
  
  public static void c(String paramString1, String paramString2)
  {
    Log.e(paramString1, paramString2);
  }
  
  public static void c(boolean paramBoolean)
  {
    c = paramBoolean;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */