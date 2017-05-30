package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

public final class n
{
  public static void a(Object paramObject)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("null reference");
    }
  }
  
  public static void a(String paramString)
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      String str1 = String.valueOf(Thread.currentThread());
      String str2 = String.valueOf(Looper.getMainLooper().getThread());
      Log.e("Asserts", String.valueOf(str1).length() + 57 + String.valueOf(str2).length() + "checkMainThread: current thread " + str1 + " IS NOT the main thread " + str2 + "!");
      throw new IllegalStateException(paramString);
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean) {
      throw new IllegalStateException();
    }
  }
  
  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalStateException(String.valueOf(paramObject));
    }
  }
  
  public static void b(String paramString)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      String str1 = String.valueOf(Thread.currentThread());
      String str2 = String.valueOf(Looper.getMainLooper().getThread());
      Log.e("Asserts", String.valueOf(str1).length() + 56 + String.valueOf(str2).length() + "checkNotMainThread: current thread " + str1 + " IS the main thread " + str2 + "!");
      throw new IllegalStateException(paramString);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */