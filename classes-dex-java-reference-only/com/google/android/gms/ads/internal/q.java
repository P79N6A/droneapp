package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.e;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.formats.g;
import com.google.android.gms.ads.internal.formats.h;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.ads.internal.formats.i.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.add;
import com.google.android.gms.internal.ti;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.xr;
import com.google.android.gms.internal.xu;
import com.google.android.gms.internal.xv;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zn;
import java.util.List;

@aaa
public class q
  extends b
{
  private acy l;
  
  public q(Context paramContext, d paramd, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, VersionInfoParcel paramVersionInfoParcel)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramxq, paramVersionInfoParcel, paramd);
  }
  
  private static com.google.android.gms.ads.internal.formats.d a(xu paramxu)
  {
    String str1 = paramxu.a();
    List localList = paramxu.b();
    String str2 = paramxu.c();
    if (paramxu.d() != null) {}
    for (uu localuu = paramxu.d();; localuu = null) {
      return new com.google.android.gms.ads.internal.formats.d(str1, localList, str2, localuu, paramxu.e(), paramxu.f(), paramxu.g(), paramxu.h(), null, paramxu.l(), paramxu.m(), null);
    }
  }
  
  private static e a(xv paramxv)
  {
    String str1 = paramxv.a();
    List localList = paramxv.b();
    String str2 = paramxv.c();
    if (paramxv.d() != null) {}
    for (uu localuu = paramxv.d();; localuu = null) {
      return new e(str1, localList, str2, localuu, paramxv.e(), paramxv.f(), null, paramxv.j());
    }
  }
  
  private void a(final com.google.android.gms.ads.internal.formats.d paramd)
  {
    abv.a.post(new Runnable()
    {
      public void run()
      {
        try
        {
          if (q.this.f.s != null) {
            q.this.f.s.a(paramd);
          }
          return;
        }
        catch (RemoteException localRemoteException)
        {
          abr.d("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", localRemoteException);
        }
      }
    });
  }
  
  private void a(final e parame)
  {
    abv.a.post(new Runnable()
    {
      public void run()
      {
        try
        {
          if (q.this.f.t != null) {
            q.this.f.t.a(parame);
          }
          return;
        }
        catch (RemoteException localRemoteException)
        {
          abr.d("Could not call OnContentAdLoadedListener.onContentAdLoaded().", localRemoteException);
        }
      }
    });
  }
  
  private void a(final abi paramabi, final String paramString)
  {
    abv.a.post(new Runnable()
    {
      public void run()
      {
        try
        {
          ((vi)q.this.f.v.get(paramString)).a((f)paramabi.E);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          abr.d("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", localRemoteException);
        }
      }
    });
  }
  
  public void E()
  {
    if ((this.f.j != null) && (this.l != null))
    {
      u.i().p().a(this.f.i, this.f.j, this.l.b(), this.l);
      return;
    }
    abr.d("Request to enable ActiveView before adState is available.");
  }
  
  public SimpleArrayMap<String, vi> F()
  {
    com.google.android.gms.common.internal.d.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    return this.f.v;
  }
  
  public void G()
  {
    if (this.l != null)
    {
      this.l.destroy();
      this.l = null;
    }
  }
  
  public void H()
  {
    if ((this.l != null) && (this.l.z() != null) && (this.f.w != null) && (this.f.w.f != null)) {
      this.l.z().b(this.f.w.f.b);
    }
  }
  
  public void a(SimpleArrayMap<String, vi> paramSimpleArrayMap)
  {
    com.google.android.gms.common.internal.d.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    this.f.v = paramSimpleArrayMap;
  }
  
  public void a(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    com.google.android.gms.common.internal.d.b("setNativeAdOptions must be called on the main UI thread.");
    this.f.w = paramNativeAdOptionsParcel;
  }
  
  public void a(g paramg)
  {
    if (this.l != null) {
      this.l.a(paramg);
    }
  }
  
  public void a(i parami)
  {
    if (this.f.j.j != null) {
      u.i().p().a(this.f.i, this.f.j, parami);
    }
  }
  
  public void a(final abi.a parama, un paramun)
  {
    if (parama.d != null) {
      this.f.i = parama.d;
    }
    if (parama.e != -2)
    {
      abv.a.post(new Runnable()
      {
        public void run()
        {
          q.this.b(new abi(parama, null, null, null, null, null, null, null));
        }
      });
      return;
    }
    this.f.E = 0;
    this.f.h = u.d().a(this.f.c, this, parama, this.f.d, null, this.j, this, paramun);
    parama = String.valueOf(this.f.h.getClass().getName());
    if (parama.length() != 0) {}
    for (parama = "AdRenderer: ".concat(parama);; parama = new String("AdRenderer: "))
    {
      abr.a(parama);
      return;
    }
  }
  
  public void a(acy paramacy)
  {
    this.l = paramacy;
  }
  
  public void a(ur paramur)
  {
    throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
  }
  
  public void a(vf paramvf)
  {
    com.google.android.gms.common.internal.d.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
    this.f.s = paramvf;
  }
  
  public void a(vg paramvg)
  {
    com.google.android.gms.common.internal.d.b("setOnContentAdLoadedListener must be called on the main UI thread.");
    this.f.t = paramvg;
  }
  
  public void a(yy paramyy)
  {
    throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
  }
  
  public void a(@Nullable List<String> paramList)
  {
    com.google.android.gms.common.internal.d.b("setNativeTemplates must be called on the main UI thread.");
    this.f.A = paramList;
  }
  
  protected boolean a(AdRequestParcel paramAdRequestParcel, abi paramabi, boolean paramBoolean)
  {
    return this.e.d();
  }
  
  protected boolean a(abi paramabi1, abi paramabi2)
  {
    a(null);
    if (!this.f.e()) {
      throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }
    if (paramabi2.n) {}
    for (;;)
    {
      try
      {
        if (paramabi2.p == null) {
          continue;
        }
        localObject1 = paramabi2.p.h();
        if (paramabi2.p == null) {
          continue;
        }
        localObject2 = paramabi2.p.i();
        if ((localObject1 == null) || (this.f.s == null)) {
          continue;
        }
        localObject2 = a((xu)localObject1);
        ((com.google.android.gms.ads.internal.formats.d)localObject2).a(new h(this.f.c, this, this.f.d, (xu)localObject1, (i.a)localObject2));
        a((com.google.android.gms.ads.internal.formats.d)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2;
        abr.d("Failed to get native ad mapper", localRemoteException);
        continue;
        abr.d("No matching mapper/listener for retrieved native ad template.");
        a(0);
        return false;
      }
      return super.a(paramabi1, paramabi2);
      localObject1 = null;
      continue;
      localObject2 = null;
      continue;
      if ((localObject2 != null) && (this.f.t != null))
      {
        localObject1 = a((xv)localObject2);
        ((e)localObject1).a(new h(this.f.c, this, this.f.d, (xv)localObject2, (i.a)localObject1));
        a((e)localObject1);
      }
      else
      {
        i.a locala = paramabi2.E;
        if (((locala instanceof e)) && (this.f.t != null))
        {
          a((e)paramabi2.E);
        }
        else if (((locala instanceof com.google.android.gms.ads.internal.formats.d)) && (this.f.s != null))
        {
          a((com.google.android.gms.ads.internal.formats.d)paramabi2.E);
        }
        else
        {
          if ((!(locala instanceof f)) || (this.f.v == null) || (this.f.v.get(((f)locala).l()) == null)) {
            break;
          }
          a(paramabi2, ((f)locala).l());
        }
      }
    }
    abr.d("No matching listener for retrieved native ad template.");
    a(0);
    return false;
  }
  
  public void b(SimpleArrayMap<String, vh> paramSimpleArrayMap)
  {
    com.google.android.gms.common.internal.d.b("setOnCustomClickListener must be called on the main UI thread.");
    this.f.u = paramSimpleArrayMap;
  }
  
  @Nullable
  public vh c(String paramString)
  {
    com.google.android.gms.common.internal.d.b("getOnCustomClickListener must be called on the main UI thread.");
    return (vh)this.f.u.get(paramString);
  }
  
  public void c_()
  {
    throw new IllegalStateException("Native Ad DOES NOT support resume().");
  }
  
  public void d()
  {
    throw new IllegalStateException("Native Ad DOES NOT support pause().");
  }
  
  public void f()
  {
    throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */