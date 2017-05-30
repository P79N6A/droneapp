package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.e;

@Deprecated
public class f
{
  private static volatile e a;
  
  static
  {
    a(new ai());
  }
  
  public static e a()
  {
    return a;
  }
  
  public static void a(e parame)
  {
    a = parame;
  }
  
  public static void a(String paramString)
  {
    Object localObject = g.b();
    if (localObject != null) {
      ((g)localObject).s(paramString);
    }
    for (;;)
    {
      localObject = a;
      if (localObject != null) {
        ((e)localObject).b(paramString);
      }
      return;
      if (a(1)) {
        Log.i((String)ao.c.a(), paramString);
      }
    }
  }
  
  public static void a(String paramString, Object paramObject)
  {
    g localg = g.b();
    if (localg != null) {
      localg.e(paramString, paramObject);
    }
    while (!a(3))
    {
      paramObject = a;
      if (paramObject != null) {
        ((e)paramObject).d(paramString);
      }
      return;
    }
    if (paramObject != null) {
      paramObject = String.valueOf(paramObject);
    }
    for (paramObject = String.valueOf(paramString).length() + 1 + String.valueOf(paramObject).length() + paramString + ":" + (String)paramObject;; paramObject = paramString)
    {
      Log.e((String)ao.c.a(), (String)paramObject);
      break;
    }
  }
  
  public static boolean a(int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (a() != null)
    {
      bool1 = bool2;
      if (a().a() <= paramInt) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static void b(String paramString)
  {
    Object localObject = g.b();
    if (localObject != null) {
      ((g)localObject).q(paramString);
    }
    for (;;)
    {
      localObject = a;
      if (localObject != null) {
        ((e)localObject).a(paramString);
      }
      return;
      if (a(0)) {
        Log.v((String)ao.c.a(), paramString);
      }
    }
  }
  
  public static void c(String paramString)
  {
    Object localObject = g.b();
    if (localObject != null) {
      ((g)localObject).t(paramString);
    }
    for (;;)
    {
      localObject = a;
      if (localObject != null) {
        ((e)localObject).c(paramString);
      }
      return;
      if (a(2)) {
        Log.w((String)ao.c.a(), paramString);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */