package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.c;

@aaa
public final class acg
  extends abq
{
  private final c a;
  private final String b;
  
  public acg(Context paramContext, String paramString1, String paramString2)
  {
    this(paramString2, u.e().a(paramContext, paramString1));
  }
  
  public acg(String paramString1, String paramString2)
  {
    this.a = new c(paramString2);
    this.b = paramString1;
  }
  
  public void a()
  {
    this.a.a(this.b);
  }
  
  public void b() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/acg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */