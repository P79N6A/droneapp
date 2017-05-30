package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.u;

@aaa
public abstract class ub<T>
{
  private final int a;
  private final String b;
  private final T c;
  
  private ub(int paramInt, String paramString, T paramT)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramT;
    u.p().a(this);
  }
  
  public static ub<String> a(int paramInt, String paramString)
  {
    paramString = a(paramInt, paramString, null);
    u.p().b(paramString);
    return paramString;
  }
  
  public static ub<Integer> a(int paramInt1, String paramString, int paramInt2)
  {
    return new ub.2(paramInt1, paramString, Integer.valueOf(paramInt2));
  }
  
  public static ub<Long> a(int paramInt, String paramString, long paramLong)
  {
    return new ub.3(paramInt, paramString, Long.valueOf(paramLong));
  }
  
  public static ub<Boolean> a(int paramInt, String paramString, Boolean paramBoolean)
  {
    return new ub.1(paramInt, paramString, paramBoolean);
  }
  
  public static ub<String> a(int paramInt, String paramString1, String paramString2)
  {
    return new ub.4(paramInt, paramString1, paramString2);
  }
  
  public static ub<String> b(int paramInt, String paramString)
  {
    paramString = a(paramInt, paramString, null);
    u.p().c(paramString);
    return paramString;
  }
  
  protected abstract T a(SharedPreferences paramSharedPreferences);
  
  public String a()
  {
    return this.b;
  }
  
  public T b()
  {
    return (T)this.c;
  }
  
  public T c()
  {
    return (T)u.q().a(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */