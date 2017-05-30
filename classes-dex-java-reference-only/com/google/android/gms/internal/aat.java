package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.b.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;

@aaa
public class aat
  extends b.a
{
  private final Context a;
  private final Object b = new Object();
  private final VersionInfoParcel c;
  private final aau d;
  
  public aat(Context paramContext, com.google.android.gms.ads.internal.d paramd, xq paramxq, VersionInfoParcel paramVersionInfoParcel)
  {
    this(paramContext, paramVersionInfoParcel, new aau(paramContext, paramd, AdSizeParcel.a(), paramxq, paramVersionInfoParcel));
  }
  
  aat(Context paramContext, VersionInfoParcel paramVersionInfoParcel, aau paramaau)
  {
    this.a = paramContext;
    this.c = paramVersionInfoParcel;
    this.d = paramaau;
  }
  
  public void a()
  {
    synchronized (this.b)
    {
      this.d.E();
      return;
    }
  }
  
  public void a(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    synchronized (this.b)
    {
      this.d.a(paramRewardedVideoAdRequestParcel);
      return;
    }
  }
  
  public void a(com.google.android.gms.ads.internal.reward.client.d paramd)
  {
    synchronized (this.b)
    {
      this.d.a(paramd);
      return;
    }
  }
  
  public void a(e arg1)
  {
    synchronized (this.b)
    {
      this.d.d();
      return;
    }
  }
  
  public void a(String paramString)
  {
    abr.d("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
  }
  
  public void b(e parame)
  {
    Object localObject = this.b;
    if (parame == null) {
      parame = null;
    }
    for (;;)
    {
      if (parame != null) {}
      try
      {
        this.d.a(parame);
        this.d.c_();
        return;
        parame = (Context)f.a(parame);
      }
      catch (Exception parame)
      {
        for (;;)
        {
          abr.d("Unable to extract updated context.", parame);
        }
      }
      finally {}
    }
  }
  
  public boolean b()
  {
    synchronized (this.b)
    {
      boolean bool = this.d.F();
      return bool;
    }
  }
  
  public void c()
  {
    a(null);
  }
  
  public void c(e arg1)
  {
    synchronized (this.b)
    {
      this.d.b();
      return;
    }
  }
  
  public void d()
  {
    b(null);
  }
  
  public void e()
  {
    c(null);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */