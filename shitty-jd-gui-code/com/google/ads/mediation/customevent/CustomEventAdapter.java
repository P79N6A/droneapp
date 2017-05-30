package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.a.a;
import com.google.ads.mediation.f;
import com.google.ads.mediation.h;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter
  implements com.google.ads.mediation.e<com.google.android.gms.ads.mediation.customevent.d, g>, com.google.ads.mediation.g<com.google.android.gms.ads.mediation.customevent.d, g>
{
  b a;
  d b;
  private View c;
  
  private static <T> T a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return (T)localObject;
    }
    catch (Throwable localThrowable)
    {
      String str = String.valueOf(localThrowable.getMessage());
      com.google.android.gms.ads.internal.util.client.b.d(String.valueOf(paramString).length() + 46 + String.valueOf(str).length() + "Could not instantiate custom event adapter: " + paramString + ". " + str);
    }
    return null;
  }
  
  private void a(View paramView)
  {
    this.c = paramView;
  }
  
  b a(h paramh)
  {
    return new b(this, paramh);
  }
  
  public void a()
  {
    if (this.a != null) {
      this.a.a();
    }
    if (this.b != null) {
      this.b.a();
    }
  }
  
  public void a(f paramf, Activity paramActivity, g paramg, com.google.ads.b paramb, com.google.ads.mediation.c paramc, com.google.android.gms.ads.mediation.customevent.d paramd)
  {
    this.a = ((b)a(paramg.b));
    if (this.a == null)
    {
      paramf.a(this, a.a.d);
      return;
    }
    if (paramd == null) {}
    for (paramd = null;; paramd = paramd.a(paramg.a))
    {
      this.a.a(new a(this, paramf), paramActivity, paramg.a, paramg.c, paramb, paramc, paramd);
      return;
    }
  }
  
  public void a(h paramh, Activity paramActivity, g paramg, com.google.ads.mediation.c paramc, com.google.android.gms.ads.mediation.customevent.d paramd)
  {
    this.b = ((d)a(paramg.b));
    if (this.b == null)
    {
      paramh.a(this, a.a.d);
      return;
    }
    if (paramd == null) {}
    for (paramd = null;; paramd = paramd.a(paramg.a))
    {
      this.b.a(a(paramh), paramActivity, paramg.a, paramg.c, paramc, paramd);
      return;
    }
  }
  
  public Class<com.google.android.gms.ads.mediation.customevent.d> b()
  {
    return com.google.android.gms.ads.mediation.customevent.d.class;
  }
  
  public Class<g> c()
  {
    return g.class;
  }
  
  public View d()
  {
    return this.c;
  }
  
  public void e()
  {
    this.b.b();
  }
  
  static final class a
    implements c
  {
    private final CustomEventAdapter a;
    private final f b;
    
    public a(CustomEventAdapter paramCustomEventAdapter, f paramf)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramf;
    }
    
    public void a()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.a(this.a, a.a.b);
    }
    
    public void a(View paramView)
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onReceivedAd.");
      CustomEventAdapter.a(this.a, paramView);
      this.b.a(this.a);
    }
    
    public void b()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.e(this.a);
    }
    
    public void c()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.b(this.a);
    }
    
    public void d()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.c(this.a);
    }
    
    public void e()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.d(this.a);
    }
  }
  
  class b
    implements e
  {
    private final CustomEventAdapter b;
    private final h c;
    
    public b(CustomEventAdapter paramCustomEventAdapter, h paramh)
    {
      this.b = paramCustomEventAdapter;
      this.c = paramh;
    }
    
    public void a()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
      this.c.a(this.b, a.a.b);
    }
    
    public void b()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onReceivedAd.");
      this.c.a(CustomEventAdapter.this);
    }
    
    public void c()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onPresentScreen.");
      this.c.b(this.b);
    }
    
    public void d()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onDismissScreen.");
      this.c.c(this.b);
    }
    
    public void e()
    {
      com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onLeaveApplication.");
      this.c.d(this.b);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */