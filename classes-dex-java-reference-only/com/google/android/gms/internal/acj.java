package com.google.android.gms.internal;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.android.gms.ads.internal.u;
import java.util.concurrent.Callable;

@aaa
public class acj
{
  public static <T> T a(Callable<T> paramCallable)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.getThreadPolicy();
    try
    {
      StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(localThreadPolicy).permitDiskReads().permitDiskWrites().build());
      paramCallable = paramCallable.call();
      return paramCallable;
    }
    catch (Throwable paramCallable)
    {
      abr.b("Unexpected exception.", paramCallable);
      u.i().a(paramCallable, "StrictModeUtil.runWithLaxStrictMode");
      return null;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/acj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */