package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.cache.a;
import com.google.android.gms.ads.internal.client.ap.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.aby;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;

@aaa
public class o
  extends ap.a
{
  private static final Object b = new Object();
  @Nullable
  private static o c;
  private final Context a;
  private final Object d = new Object();
  private boolean e;
  private boolean f;
  private float g = -1.0F;
  private VersionInfoParcel h;
  
  o(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    this.a = paramContext;
    this.h = paramVersionInfoParcel;
    this.e = false;
  }
  
  public static o a(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    synchronized (b)
    {
      if (c == null) {
        c = new o(paramContext.getApplicationContext(), paramVersionInfoParcel);
      }
      paramContext = c;
      return paramContext;
    }
  }
  
  @Nullable
  public static o b()
  {
    synchronized (b)
    {
      o localo = c;
      return localo;
    }
  }
  
  public void a()
  {
    synchronized (b)
    {
      if (this.e)
      {
        abr.d("Mobile ads is initialized already.");
        return;
      }
      this.e = true;
      u.i().a(this.a, this.h);
      u.j().a(this.a);
      return;
    }
  }
  
  public void a(float paramFloat)
  {
    synchronized (this.d)
    {
      this.g = paramFloat;
      return;
    }
  }
  
  public void a(e parame, String paramString)
  {
    parame = b(parame, paramString);
    if (parame == null)
    {
      abr.b("Context is null. Failed to open debug menu.");
      return;
    }
    parame.a();
  }
  
  public void a(String paramString)
  {
    uf.a(this.a);
    if ((!TextUtils.isEmpty(paramString)) && (((Boolean)uf.cd.c()).booleanValue())) {
      u.A().a(this.a, this.h, true, null, paramString, null);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    synchronized (this.d)
    {
      this.f = paramBoolean;
      return;
    }
  }
  
  @Nullable
  protected aby b(e parame, String paramString)
  {
    if (parame == null) {
      return null;
    }
    parame = (Context)f.a(parame);
    if (parame == null) {
      return null;
    }
    parame = new aby(parame);
    parame.a(paramString);
    return parame;
  }
  
  public float c()
  {
    synchronized (this.d)
    {
      float f1 = this.g;
      return f1;
    }
  }
  
  public boolean d()
  {
    for (;;)
    {
      synchronized (this.d)
      {
        if (this.g >= 0.0F)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean e()
  {
    synchronized (this.d)
    {
      boolean bool = this.f;
      return bool;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */