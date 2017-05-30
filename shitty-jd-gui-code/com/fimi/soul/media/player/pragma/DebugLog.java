package com.fimi.soul.media.player.pragma;

import android.util.Log;
import java.util.Locale;

public class DebugLog
{
  public static final boolean ENABLE_DEBUG = true;
  public static final boolean ENABLE_ERROR = true;
  public static final boolean ENABLE_INFO = true;
  public static final boolean ENABLE_VERBOSE = true;
  public static final boolean ENABLE_WARN = true;
  
  public static int d(String paramString1, String paramString2)
  {
    return Log.d(paramString1, paramString2);
  }
  
  public static int d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    return Log.d(paramString1, paramString2, paramThrowable);
  }
  
  public static int dfmt(String paramString1, String paramString2, Object... paramVarArgs)
  {
    return Log.d(paramString1, String.format(Locale.US, paramString2, paramVarArgs));
  }
  
  public static int e(String paramString1, String paramString2)
  {
    return Log.e(paramString1, paramString2);
  }
  
  public static int e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    return Log.e(paramString1, paramString2, paramThrowable);
  }
  
  public static int efmt(String paramString1, String paramString2, Object... paramVarArgs)
  {
    return Log.e(paramString1, String.format(Locale.US, paramString2, paramVarArgs));
  }
  
  public static int i(String paramString1, String paramString2)
  {
    return Log.i(paramString1, paramString2);
  }
  
  public static int i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    return Log.i(paramString1, paramString2, paramThrowable);
  }
  
  public static int ifmt(String paramString1, String paramString2, Object... paramVarArgs)
  {
    return Log.i(paramString1, String.format(Locale.US, paramString2, paramVarArgs));
  }
  
  public static void printCause(Throwable paramThrowable)
  {
    Throwable localThrowable = paramThrowable.getCause();
    if (localThrowable != null) {
      paramThrowable = localThrowable;
    }
    printStackTrace(paramThrowable);
  }
  
  public static void printStackTrace(Throwable paramThrowable)
  {
    paramThrowable.printStackTrace();
  }
  
  public static int v(String paramString1, String paramString2)
  {
    return Log.v(paramString1, paramString2);
  }
  
  public static int v(String paramString1, String paramString2, Throwable paramThrowable)
  {
    return Log.v(paramString1, paramString2, paramThrowable);
  }
  
  public static int vfmt(String paramString1, String paramString2, Object... paramVarArgs)
  {
    return Log.v(paramString1, String.format(Locale.US, paramString2, paramVarArgs));
  }
  
  public static int w(String paramString1, String paramString2)
  {
    return Log.w(paramString1, paramString2);
  }
  
  public static int w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    return Log.w(paramString1, paramString2, paramThrowable);
  }
  
  public static int wfmt(String paramString1, String paramString2, Object... paramVarArgs)
  {
    return Log.w(paramString1, String.format(Locale.US, paramString2, paramVarArgs));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/pragma/DebugLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */