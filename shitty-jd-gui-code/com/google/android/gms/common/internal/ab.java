package com.google.android.gms.common.internal;

import android.util.Log;

public final class ab
{
  public static final int a = 23 - " PII_LOG".length();
  private static final String b = null;
  private final String c;
  private final String d;
  
  public ab(String paramString)
  {
    this(paramString, null);
  }
  
  public ab(String paramString1, String paramString2)
  {
    d.a(paramString1, "log tag cannot be null");
    if (paramString1.length() <= 23) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool, "tag \"%s\" is longer than the %d character maximum", new Object[] { paramString1, Integer.valueOf(23) });
      this.c = paramString1;
      if ((paramString2 != null) && (paramString2.length() > 0)) {
        break;
      }
      this.d = null;
      return;
    }
    this.d = paramString2;
  }
  
  private String a(String paramString)
  {
    if (this.d == null) {
      return paramString;
    }
    return this.d.concat(paramString);
  }
  
  public void a(String paramString1, String paramString2)
  {
    if (a(3)) {
      Log.d(paramString1, a(paramString2));
    }
  }
  
  public void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a(4)) {
      Log.i(paramString1, a(paramString2), paramThrowable);
    }
  }
  
  public boolean a(int paramInt)
  {
    return Log.isLoggable(this.c, paramInt);
  }
  
  public void b(String paramString1, String paramString2)
  {
    if (a(5)) {
      Log.w(paramString1, a(paramString2));
    }
  }
  
  public void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a(5)) {
      Log.w(paramString1, a(paramString2), paramThrowable);
    }
  }
  
  public void c(String paramString1, String paramString2)
  {
    if (a(6)) {
      Log.e(paramString1, a(paramString2));
    }
  }
  
  public void c(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a(6)) {
      Log.e(paramString1, a(paramString2), paramThrowable);
    }
  }
  
  public void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a(7))
    {
      Log.e(paramString1, a(paramString2), paramThrowable);
      Log.wtf(paramString1, a(paramString2), paramThrowable);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */