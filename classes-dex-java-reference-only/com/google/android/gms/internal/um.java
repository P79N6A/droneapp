package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@aaa
public class um
{
  private final Map<String, ul> a;
  @Nullable
  private final un b;
  
  public um(@Nullable un paramun)
  {
    this.b = paramun;
    this.a = new HashMap();
  }
  
  @Nullable
  public un a()
  {
    return this.b;
  }
  
  public void a(String paramString, ul paramul)
  {
    this.a.put(paramString, paramul);
  }
  
  public void a(String paramString1, String paramString2, long paramLong)
  {
    uj.a(this.b, (ul)this.a.get(paramString2), paramLong, new String[] { paramString1 });
    this.a.put(paramString1, uj.a(this.b, paramLong));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/um.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */