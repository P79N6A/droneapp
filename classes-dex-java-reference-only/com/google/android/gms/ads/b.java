package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.formats.c.a;
import com.google.android.gms.ads.formats.d.a;
import com.google.android.gms.ads.formats.e.a;
import com.google.android.gms.ads.formats.e.b;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.ah;
import com.google.android.gms.ads.internal.client.ai;
import com.google.android.gms.ads.internal.client.t;
import com.google.android.gms.ads.internal.client.y;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.internal.vk;
import com.google.android.gms.internal.vl;
import com.google.android.gms.internal.vm;
import com.google.android.gms.internal.vn;
import com.google.android.gms.internal.xp;

public class b
{
  private final y a;
  private final Context b;
  private final ah c;
  
  b(Context paramContext, ah paramah)
  {
    this(paramContext, paramah, y.a());
  }
  
  b(Context paramContext, ah paramah, y paramy)
  {
    this.b = paramContext;
    this.c = paramah;
    this.a = paramy;
  }
  
  private void a(com.google.android.gms.ads.internal.client.e parame)
  {
    try
    {
      this.c.a(this.a.a(this.b, parame));
      return;
    }
    catch (RemoteException parame)
    {
      com.google.android.gms.ads.internal.util.client.b.b("Failed to load ad.", parame);
    }
  }
  
  public String a()
  {
    try
    {
      String str = this.c.b();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to get the mediation adapter class name.", localRemoteException);
    }
    return null;
  }
  
  @RequiresPermission("android.permission.INTERNET")
  public void a(c paramc)
  {
    a(paramc.f());
  }
  
  public void a(com.google.android.gms.ads.doubleclick.d paramd)
  {
    a(paramd.j());
  }
  
  public boolean b()
  {
    try
    {
      boolean bool = this.c.a();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }
  
  public static class a
  {
    private final Context a;
    private final ai b;
    
    a(Context paramContext, ai paramai)
    {
      this.a = paramContext;
      this.b = paramai;
    }
    
    public a(Context paramContext, String paramString)
    {
      this((Context)com.google.android.gms.common.internal.d.a(paramContext, "context cannot be null"), ac.b().a(paramContext, paramString, new xp()));
    }
    
    public a a(a parama)
    {
      try
      {
        this.b.a(new t(parama));
        return this;
      }
      catch (RemoteException parama)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Failed to set AdListener.", parama);
      }
      return this;
    }
    
    public a a(@NonNull e parame)
    {
      com.google.android.gms.common.internal.d.a(parame);
      try
      {
        this.b.a(parame.b());
        return this;
      }
      catch (RemoteException parame)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Failed to set correlator.", parame);
      }
      return this;
    }
    
    public a a(com.google.android.gms.ads.formats.b paramb)
    {
      try
      {
        this.b.a(new NativeAdOptionsParcel(paramb));
        return this;
      }
      catch (RemoteException paramb)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Failed to specify native ad options", paramb);
      }
      return this;
    }
    
    public a a(c.a parama)
    {
      try
      {
        this.b.a(new vk(parama));
        return this;
      }
      catch (RemoteException parama)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Failed to add app install ad listener", parama);
      }
      return this;
    }
    
    public a a(d.a parama)
    {
      try
      {
        this.b.a(new vl(parama));
        return this;
      }
      catch (RemoteException parama)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Failed to add content ad listener", parama);
      }
      return this;
    }
    
    public a a(String paramString, e.b paramb, e.a parama)
    {
      try
      {
        ai localai = this.b;
        vn localvn = new vn(paramb);
        if (parama == null) {}
        for (paramb = null;; paramb = new vm(parama))
        {
          localai.a(paramString, localvn, paramb);
          return this;
        }
        return this;
      }
      catch (RemoteException paramString)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Failed to add custom template ad listener", paramString);
      }
    }
    
    public b a()
    {
      try
      {
        b localb = new b(this.a, this.b.a());
        return localb;
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.b.b("Failed to build AdLoader.", localRemoteException);
      }
      return null;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */