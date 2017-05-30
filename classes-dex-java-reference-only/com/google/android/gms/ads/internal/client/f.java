package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.i;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.us;
import com.google.android.gms.internal.xp;
import com.google.android.gms.internal.ze;
import com.google.android.gms.internal.zi;
import java.util.concurrent.atomic.AtomicBoolean;

@aaa
public class f
{
  final ae a = new ae()
  {
    public void a()
    {
      f.a(f.this).a(f.this.o());
      super.a();
    }
    
    public void a(int paramAnonymousInt)
    {
      f.a(f.this).a(f.this.o());
      super.a(paramAnonymousInt);
    }
  };
  private final xp b = new xp();
  private final y c;
  private final AtomicBoolean d;
  private final h e = new h();
  private a f;
  private com.google.android.gms.ads.a g;
  private com.google.android.gms.ads.d[] h;
  private com.google.android.gms.ads.doubleclick.a i;
  private com.google.android.gms.ads.e j;
  private ak k;
  private com.google.android.gms.ads.purchase.b l;
  private com.google.android.gms.ads.doubleclick.c m;
  private com.google.android.gms.ads.purchase.d n;
  private i o;
  private String p;
  private String q;
  private ViewGroup r;
  private boolean s;
  private boolean t;
  
  public f(ViewGroup paramViewGroup)
  {
    this(paramViewGroup, null, false, y.a(), false);
  }
  
  public f(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean, y.a(), false);
  }
  
  f(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, y paramy, ak paramak, boolean paramBoolean2)
  {
    this.r = paramViewGroup;
    this.c = paramy;
    this.k = paramak;
    this.d = new AtomicBoolean(false);
    this.s = paramBoolean2;
    if (paramAttributeSet != null) {
      paramy = paramViewGroup.getContext();
    }
    try
    {
      paramAttributeSet = new zzk(paramy, paramAttributeSet);
      this.h = paramAttributeSet.a(paramBoolean1);
      this.p = paramAttributeSet.a();
      if (paramViewGroup.isInEditMode()) {
        ac.a().a(paramViewGroup, a(paramy, this.h[0], this.s), "Ads by Google");
      }
      return;
    }
    catch (IllegalArgumentException paramAttributeSet)
    {
      ac.a().a(paramViewGroup, new AdSizeParcel(paramy, com.google.android.gms.ads.d.c), paramAttributeSet.getMessage(), paramAttributeSet.getMessage());
    }
  }
  
  f(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, y paramy, boolean paramBoolean2)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean1, paramy, null, paramBoolean2);
  }
  
  public f(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean1, y.a(), paramBoolean2);
  }
  
  public f(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this(paramViewGroup, null, false, y.a(), paramBoolean);
  }
  
  private static AdSizeParcel a(Context paramContext, com.google.android.gms.ads.d paramd, boolean paramBoolean)
  {
    paramContext = new AdSizeParcel(paramContext, paramd);
    paramContext.a(paramBoolean);
    return paramContext;
  }
  
  private static AdSizeParcel a(Context paramContext, com.google.android.gms.ads.d[] paramArrayOfd, boolean paramBoolean)
  {
    paramContext = new AdSizeParcel(paramContext, paramArrayOfd);
    paramContext.a(paramBoolean);
    return paramContext;
  }
  
  private void s()
  {
    try
    {
      com.google.android.gms.c.e locale = this.k.a();
      if (locale == null) {
        return;
      }
      this.r.addView((View)com.google.android.gms.c.f.a(locale));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to get an ad frame.", localRemoteException);
    }
  }
  
  public void a()
  {
    try
    {
      if (this.k != null) {
        this.k.b();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to destroy AdView.", localRemoteException);
    }
  }
  
  public void a(com.google.android.gms.ads.a parama)
  {
    this.g = parama;
    this.a.a(parama);
  }
  
  public void a(com.google.android.gms.ads.doubleclick.a parama)
  {
    try
    {
      this.i = parama;
      ak localak;
      if (this.k != null)
      {
        localak = this.k;
        if (parama == null) {
          break label38;
        }
      }
      label38:
      for (parama = new aa(parama);; parama = null)
      {
        localak.a(parama);
        return;
      }
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AppEventListener.", parama);
    }
  }
  
  public void a(com.google.android.gms.ads.doubleclick.c paramc)
  {
    this.m = paramc;
    try
    {
      ak localak;
      if (this.k != null)
      {
        localak = this.k;
        if (paramc == null) {
          break label38;
        }
      }
      label38:
      for (paramc = new us(paramc);; paramc = null)
      {
        localak.a(paramc);
        return;
      }
      return;
    }
    catch (RemoteException paramc)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the onCustomRenderedAdLoadedListener.", paramc);
    }
  }
  
  public void a(com.google.android.gms.ads.e parame)
  {
    this.j = parame;
    try
    {
      if (this.k != null)
      {
        ak localak = this.k;
        if (this.j == null) {}
        for (parame = null;; parame = this.j.b())
        {
          localak.a(parame);
          return;
        }
      }
      return;
    }
    catch (RemoteException parame)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set correlator.", parame);
    }
  }
  
  public void a(i parami)
  {
    this.o = parami;
    try
    {
      if (this.k != null)
      {
        ak localak = this.k;
        if (parami == null) {}
        for (parami = null;; parami = new VideoOptionsParcel(parami))
        {
          localak.a(parami);
          return;
        }
      }
      return;
    }
    catch (RemoteException parami)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set video options.", parami);
    }
  }
  
  public void a(a parama)
  {
    try
    {
      this.f = parama;
      ak localak;
      if (this.k != null)
      {
        localak = this.k;
        if (parama == null) {
          break label38;
        }
      }
      label38:
      for (parama = new s(parama);; parama = null)
      {
        localak.a(parama);
        return;
      }
      return;
    }
    catch (RemoteException parama)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the AdClickListener.", parama);
    }
  }
  
  public void a(e parame)
  {
    try
    {
      if (this.k == null) {
        q();
      }
      if (this.k.a(this.c.a(this.r.getContext(), parame))) {
        this.b.a(parame.j());
      }
      return;
    }
    catch (RemoteException parame)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to load ad.", parame);
    }
  }
  
  public void a(com.google.android.gms.ads.purchase.b paramb)
  {
    if (this.n != null) {
      throw new IllegalStateException("Play store purchase parameter has already been set.");
    }
    try
    {
      this.l = paramb;
      ak localak;
      if (this.k != null)
      {
        localak = this.k;
        if (paramb == null) {
          break label56;
        }
      }
      label56:
      for (paramb = new ze(paramb);; paramb = null)
      {
        localak.a(paramb);
        return;
      }
      return;
    }
    catch (RemoteException paramb)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the InAppPurchaseListener.", paramb);
    }
  }
  
  public void a(com.google.android.gms.ads.purchase.d paramd, String paramString)
  {
    if (this.l != null) {
      throw new IllegalStateException("InAppPurchaseListener has already been set.");
    }
    try
    {
      this.n = paramd;
      this.q = paramString;
      ak localak;
      if (this.k != null)
      {
        localak = this.k;
        if (paramd == null) {
          break label62;
        }
      }
      label62:
      for (paramd = new zi(paramd);; paramd = null)
      {
        localak.a(paramd, paramString);
        return;
      }
      return;
    }
    catch (RemoteException paramd)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set the play store purchase parameter.", paramd);
    }
  }
  
  public void a(String paramString)
  {
    if (this.p != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }
    this.p = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.t = paramBoolean;
    try
    {
      if (this.k != null) {
        this.k.a(this.t);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to set manual impressions.", localRemoteException);
    }
  }
  
  public void a(com.google.android.gms.ads.d... paramVarArgs)
  {
    if (this.h != null) {
      throw new IllegalStateException("The ad size can only be set once on AdView.");
    }
    b(paramVarArgs);
  }
  
  public boolean a(AdSizeParcel paramAdSizeParcel)
  {
    return "search_v2".equals(paramAdSizeParcel.b);
  }
  
  public com.google.android.gms.ads.a b()
  {
    return this.g;
  }
  
  public void b(com.google.android.gms.ads.d... paramVarArgs)
  {
    this.h = paramVarArgs;
    try
    {
      if (this.k != null) {
        this.k.a(a(this.r.getContext(), this.h, this.s));
      }
      this.r.requestLayout();
      return;
    }
    catch (RemoteException paramVarArgs)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Failed to set the ad size.", paramVarArgs);
      }
    }
  }
  
  public com.google.android.gms.ads.d c()
  {
    try
    {
      if (this.k != null)
      {
        Object localObject = this.k.i();
        if (localObject != null)
        {
          localObject = ((AdSizeParcel)localObject).b();
          return (com.google.android.gms.ads.d)localObject;
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to get the current AdSize.", localRemoteException);
      if (this.h != null) {
        return this.h[0];
      }
    }
    return null;
  }
  
  public com.google.android.gms.ads.d[] d()
  {
    return this.h;
  }
  
  public String e()
  {
    return this.p;
  }
  
  public com.google.android.gms.ads.doubleclick.a f()
  {
    return this.i;
  }
  
  public com.google.android.gms.ads.purchase.b g()
  {
    return this.l;
  }
  
  public com.google.android.gms.ads.doubleclick.c h()
  {
    return this.m;
  }
  
  public void i()
  {
    try
    {
      if (this.k != null) {
        this.k.d();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to call pause.", localRemoteException);
    }
  }
  
  public void j()
  {
    if (this.d.getAndSet(true)) {}
    for (;;)
    {
      return;
      try
      {
        if (this.k != null)
        {
          this.k.h();
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Failed to record impression.", localRemoteException);
      }
    }
  }
  
  public void k()
  {
    try
    {
      if (this.k != null) {
        this.k.c_();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to call resume.", localRemoteException);
    }
  }
  
  public String l()
  {
    try
    {
      if (this.k != null)
      {
        String str = this.k.j();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to get the mediation adapter class name.", localRemoteException);
    }
    return null;
  }
  
  public boolean m()
  {
    try
    {
      if (this.k != null)
      {
        boolean bool = this.k.k();
        return bool;
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }
  
  public h n()
  {
    return this.e;
  }
  
  public c o()
  {
    if (this.k == null) {
      return null;
    }
    try
    {
      c localc = this.k.l();
      return localc;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to retrieve VideoController.", localRemoteException);
    }
    return null;
  }
  
  public i p()
  {
    return this.o;
  }
  
  void q()
  {
    if (((this.h == null) || (this.p == null)) && (this.k == null)) {
      throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
    }
    this.k = r();
    this.k.a(new t(this.a));
    if (this.f != null) {
      this.k.a(new s(this.f));
    }
    if (this.i != null) {
      this.k.a(new aa(this.i));
    }
    if (this.l != null) {
      this.k.a(new ze(this.l));
    }
    if (this.n != null) {
      this.k.a(new zi(this.n), this.q);
    }
    if (this.m != null) {
      this.k.a(new us(this.m));
    }
    if (this.j != null) {
      this.k.a(this.j.b());
    }
    if (this.o != null) {
      this.k.a(new VideoOptionsParcel(this.o));
    }
    this.k.a(this.t);
    s();
  }
  
  protected ak r()
  {
    Context localContext = this.r.getContext();
    AdSizeParcel localAdSizeParcel = a(localContext, this.h, this.s);
    if (a(localAdSizeParcel)) {
      return ac.b().a(localContext, localAdSizeParcel, this.p);
    }
    return ac.b().a(localContext, localAdSizeParcel, this.p, this.b);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */