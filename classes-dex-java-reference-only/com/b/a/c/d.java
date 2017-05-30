package com.b.a.c;

import android.util.Log;

public final class d
{
  private static final String a = "%1$s\n%2$s";
  private static volatile boolean b = false;
  private static volatile boolean c = true;
  
  @Deprecated
  public static void a()
  {
    b(true);
  }
  
  private static void a(int paramInt, Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    if (!c) {
      return;
    }
    if (paramVarArgs.length > 0) {
      paramString = String.format(paramString, paramVarArgs);
    }
    for (;;)
    {
      if (paramThrowable == null) {}
      for (;;)
      {
        Log.println(paramInt, com.b.a.b.d.a, paramString);
        return;
        paramVarArgs = paramString;
        if (paramString == null) {
          paramVarArgs = paramThrowable.getMessage();
        }
        paramString = String.format("%1$s\n%2$s", new Object[] { paramVarArgs, Log.getStackTraceString(paramThrowable) });
      }
    }
  }
  
  public static void a(String paramString, Object... paramVarArgs)
  {
    if (b) {
      a(3, null, paramString, paramVarArgs);
    }
  }
  
  public static void a(Throwable paramThrowable)
  {
    a(6, paramThrowable, null, new Object[0]);
  }
  
  public static void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    a(6, paramThrowable, paramString, paramVarArgs);
  }
  
  public static void a(boolean paramBoolean)
  {
    b = paramBoolean;
  }
  
  @Deprecated
  public static void b()
  {
    b(false);
  }
  
  public static void b(String paramString, Object... paramVarArgs)
  {
    a(4, null, paramString, paramVarArgs);
  }
  
  public static void b(boolean paramBoolean)
  {
    c = paramBoolean;
  }
  
  public static void c(String paramString, Object... paramVarArgs)
  {
    a(5, null, paramString, paramVarArgs);
  }
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    a(6, null, paramString, paramVarArgs);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */