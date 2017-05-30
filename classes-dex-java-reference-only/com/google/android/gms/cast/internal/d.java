package com.google.android.gms.cast.internal;

import android.support.annotation.NonNull;
import android.text.TextUtils;

public abstract class d
{
  private final String a;
  private o b;
  protected final m f;
  
  protected d(String paramString1, String paramString2, String paramString3)
  {
    f.a(paramString1);
    this.a = paramString1;
    this.f = new m(paramString2);
    a(paramString3);
  }
  
  public void a() {}
  
  public void a(long paramLong, int paramInt) {}
  
  public final void a(o paramo)
  {
    this.b = paramo;
    if (this.b == null) {
      a();
    }
  }
  
  public void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.f.a(paramString);
    }
  }
  
  protected final void a(String paramString1, long paramLong, String paramString2)
  {
    this.f.a("Sending text message: %s to: %s", new Object[] { paramString1, paramString2 });
    this.b.a(this.a, paramString1, paramLong, paramString2);
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void b(@NonNull String paramString) {}
  
  protected final long c()
  {
    return this.b.a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */