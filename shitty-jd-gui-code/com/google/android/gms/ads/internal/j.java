package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.ah.a;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;
import com.google.android.gms.internal.xq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@aaa
public class j
  extends ah.a
{
  private final Context a;
  private final ag b;
  private final xq c;
  @Nullable
  private final vf d;
  @Nullable
  private final vg e;
  private final SimpleArrayMap<String, vi> f;
  private final SimpleArrayMap<String, vh> g;
  private final NativeAdOptionsParcel h;
  private final List<String> i;
  private final ao j;
  private final String k;
  private final VersionInfoParcel l;
  @Nullable
  private WeakReference<q> m;
  private final d n;
  private final Object o = new Object();
  
  j(Context paramContext, String paramString, xq paramxq, VersionInfoParcel paramVersionInfoParcel, ag paramag, vf paramvf, vg paramvg, SimpleArrayMap<String, vi> paramSimpleArrayMap, SimpleArrayMap<String, vh> paramSimpleArrayMap1, NativeAdOptionsParcel paramNativeAdOptionsParcel, ao paramao, d paramd)
  {
    this.a = paramContext;
    this.k = paramString;
    this.c = paramxq;
    this.l = paramVersionInfoParcel;
    this.b = paramag;
    this.e = paramvg;
    this.d = paramvf;
    this.f = paramSimpleArrayMap;
    this.g = paramSimpleArrayMap1;
    this.h = paramNativeAdOptionsParcel;
    this.i = d();
    this.j = paramao;
    this.n = paramd;
  }
  
  private List<String> d()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.e != null) {
      localArrayList.add("1");
    }
    if (this.d != null) {
      localArrayList.add("2");
    }
    if (this.f.size() > 0) {
      localArrayList.add("3");
    }
    return localArrayList;
  }
  
  public void a(final AdRequestParcel paramAdRequestParcel)
  {
    a(new Runnable()
    {
      public void run()
      {
        synchronized (j.a(j.this))
        {
          q localq = j.this.c();
          j.a(j.this, new WeakReference(localq));
          localq.a(j.b(j.this));
          localq.a(j.c(j.this));
          localq.a(j.d(j.this));
          localq.a(j.e(j.this));
          localq.b(j.f(j.this));
          localq.a(j.g(j.this));
          localq.a(j.h(j.this));
          localq.a(j.i(j.this));
          localq.a(paramAdRequestParcel);
          return;
        }
      }
    });
  }
  
  protected void a(Runnable paramRunnable)
  {
    abv.a.post(paramRunnable);
  }
  
  public boolean a()
  {
    for (;;)
    {
      synchronized (this.o)
      {
        if (this.m != null)
        {
          q localq = (q)this.m.get();
          if (localq != null)
          {
            bool = localq.k();
            return bool;
          }
        }
        else
        {
          return false;
        }
      }
      boolean bool = false;
    }
  }
  
  @Nullable
  public String b()
  {
    for (;;)
    {
      synchronized (this.o)
      {
        if (this.m != null)
        {
          Object localObject1 = (q)this.m.get();
          if (localObject1 != null)
          {
            localObject1 = ((q)localObject1).j();
            return (String)localObject1;
          }
        }
        else
        {
          return null;
        }
      }
      Object localObject3 = null;
    }
  }
  
  protected q c()
  {
    return new q(this.a, this.n, AdSizeParcel.a(this.a), this.k, this.c, this.l);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */