package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.internal.client.h;
import com.google.android.gms.ads.internal.client.i;

public class g
{
  public static void a(float paramFloat)
  {
    h.a().a(paramFloat);
  }
  
  @Deprecated
  public static void a(Context paramContext)
  {
    a(paramContext, null, null);
  }
  
  @RequiresPermission("android.permission.INTERNET")
  public static void a(Context paramContext, String paramString)
  {
    a(paramContext, paramString, null);
  }
  
  @Deprecated
  @RequiresPermission("android.permission.INTERNET")
  public static void a(Context paramContext, String paramString, a parama)
  {
    h localh = h.a();
    if (parama == null) {}
    for (parama = null;; parama = parama.c())
    {
      localh.a(paramContext, paramString, parama);
      return;
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    h.a().a(paramBoolean);
  }
  
  public static b b(Context paramContext)
  {
    return h.a().a(paramContext);
  }
  
  public static void b(Context paramContext, String paramString)
  {
    h.a().a(paramContext, paramString);
  }
  
  public static final class a
  {
    private final i a = new i();
    
    @Deprecated
    public a a(String paramString)
    {
      this.a.a(paramString);
      return this;
    }
    
    @Deprecated
    public a a(boolean paramBoolean)
    {
      this.a.a(paramBoolean);
      return this;
    }
    
    @Deprecated
    public String a()
    {
      return this.a.a();
    }
    
    @Deprecated
    public boolean b()
    {
      return this.a.b();
    }
    
    i c()
    {
      return this.a;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */