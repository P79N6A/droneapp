package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import java.util.Locale;

public class m
{
  private static boolean b = false;
  protected final String a;
  private final boolean c;
  private boolean d;
  private boolean e;
  private String f;
  
  public m(String paramString)
  {
    this(paramString, c());
  }
  
  public m(String paramString, boolean paramBoolean)
  {
    d.a(paramString, "The log tag cannot be null or empty.");
    this.a = paramString;
    if (paramString.length() <= 23) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      this.d = paramBoolean;
      this.e = false;
      return;
    }
  }
  
  public static boolean c()
  {
    return false;
  }
  
  public void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (paramString = null;; paramString = String.format("[%s] ", new Object[] { paramString }))
    {
      this.f = paramString;
      return;
    }
  }
  
  public void a(String paramString, Object... paramVarArgs)
  {
    if (b()) {
      Log.v(this.a, f(paramString, paramVarArgs));
    }
  }
  
  public void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    if (!a()) {
      return;
    }
    Log.d(this.a, f(paramString, paramVarArgs), paramThrowable);
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public boolean a()
  {
    return (this.d) || ((this.c) && (Log.isLoggable(this.a, 3)));
  }
  
  public void b(String paramString, Object... paramVarArgs)
  {
    if (!a()) {
      return;
    }
    Log.d(this.a, f(paramString, paramVarArgs));
  }
  
  public void b(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    Log.w(this.a, f(paramString, paramVarArgs), paramThrowable);
  }
  
  public boolean b()
  {
    return false;
  }
  
  public void c(String paramString, Object... paramVarArgs)
  {
    Log.i(this.a, f(paramString, paramVarArgs));
  }
  
  public void c(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    Log.e(this.a, f(paramString, paramVarArgs), paramThrowable);
  }
  
  public void d(String paramString, Object... paramVarArgs)
  {
    Log.w(this.a, f(paramString, paramVarArgs));
  }
  
  public void e(String paramString, Object... paramVarArgs)
  {
    Log.e(this.a, f(paramString, paramVarArgs));
  }
  
  protected String f(String paramString, Object... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {}
    while (!TextUtils.isEmpty(this.f))
    {
      paramVarArgs = String.valueOf(this.f);
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0)
      {
        return paramVarArgs.concat(paramString);
        paramString = String.format(Locale.ROOT, paramString, paramVarArgs);
      }
      else
      {
        return new String(paramVarArgs);
      }
    }
    return paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */