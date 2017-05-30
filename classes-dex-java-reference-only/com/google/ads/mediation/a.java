package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.d.a;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.adn;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

@aaa
public abstract class a
  implements com.google.android.gms.ads.b.a.a, com.google.android.gms.ads.mediation.c, g, adn
{
  public static final String AD_UNIT_ID_PARAMETER = "pubid";
  protected AdView zzfz;
  protected com.google.android.gms.ads.f zzga;
  private com.google.android.gms.ads.b zzgb;
  private Context zzgc;
  private com.google.android.gms.ads.f zzgd;
  private com.google.android.gms.ads.b.a.b zzge;
  final com.google.android.gms.ads.b.c zzgf = new com.google.android.gms.ads.b.c()
  {
    public void a()
    {
      a.zza(a.this).b(a.this);
    }
    
    public void a(int paramAnonymousInt)
    {
      a.zza(a.this).b(a.this, paramAnonymousInt);
    }
    
    public void a(com.google.android.gms.ads.b.a paramAnonymousa)
    {
      a.zza(a.this).a(a.this, paramAnonymousa);
    }
    
    public void b()
    {
      a.zza(a.this).c(a.this);
    }
    
    public void c()
    {
      a.zza(a.this).d(a.this);
    }
    
    public void d()
    {
      a.zza(a.this).e(a.this);
      a.zza(a.this, null);
    }
    
    public void e()
    {
      a.zza(a.this).g(a.this);
    }
  };
  
  public String getAdUnitId(Bundle paramBundle)
  {
    return paramBundle.getString("pubid");
  }
  
  public View getBannerView()
  {
    return this.zzfz;
  }
  
  public Bundle getInterstitialAdapterInfo()
  {
    return new com.google.android.gms.ads.mediation.b.a().a(1).a();
  }
  
  public void initialize(Context paramContext, com.google.android.gms.ads.mediation.a parama, String paramString, com.google.android.gms.ads.b.a.b paramb, Bundle paramBundle1, Bundle paramBundle2)
  {
    this.zzgc = paramContext.getApplicationContext();
    this.zzge = paramb;
    this.zzge.a(this);
  }
  
  public boolean isInitialized()
  {
    return this.zzge != null;
  }
  
  public void loadAd(com.google.android.gms.ads.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    if ((this.zzgc == null) || (this.zzge == null))
    {
      com.google.android.gms.ads.internal.util.client.b.b("AdMobAdapter.loadAd called before initialize.");
      return;
    }
    this.zzgd = new com.google.android.gms.ads.f(this.zzgc);
    this.zzgd.a(true);
    this.zzgd.a(getAdUnitId(paramBundle1));
    this.zzgd.a(this.zzgf);
    this.zzgd.a(zza(this.zzgc, parama, paramBundle2, paramBundle1));
  }
  
  public void onDestroy()
  {
    if (this.zzfz != null)
    {
      this.zzfz.d();
      this.zzfz = null;
    }
    if (this.zzga != null) {
      this.zzga = null;
    }
    if (this.zzgb != null) {
      this.zzgb = null;
    }
    if (this.zzgd != null) {
      this.zzgd = null;
    }
  }
  
  public void onPause()
  {
    if (this.zzfz != null) {
      this.zzfz.c();
    }
  }
  
  public void onResume()
  {
    if (this.zzfz != null) {
      this.zzfz.b();
    }
  }
  
  public void requestBannerAd(Context paramContext, com.google.android.gms.ads.mediation.d paramd, Bundle paramBundle1, com.google.android.gms.ads.d paramd1, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle2)
  {
    this.zzfz = new AdView(paramContext);
    this.zzfz.setAdSize(new com.google.android.gms.ads.d(paramd1.b(), paramd1.a()));
    this.zzfz.setAdUnitId(getAdUnitId(paramBundle1));
    this.zzfz.setAdListener(new c(this, paramd));
    this.zzfz.a(zza(paramContext, parama, paramBundle2, paramBundle1));
  }
  
  public void requestInterstitialAd(Context paramContext, com.google.android.gms.ads.mediation.f paramf, Bundle paramBundle1, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle2)
  {
    this.zzga = new com.google.android.gms.ads.f(paramContext);
    this.zzga.a(getAdUnitId(paramBundle1));
    this.zzga.a(new d(this, paramf));
    this.zzga.a(zza(paramContext, parama, paramBundle2, paramBundle1));
  }
  
  public void requestNativeAd(Context paramContext, h paramh, Bundle paramBundle1, l paraml, Bundle paramBundle2)
  {
    paramh = new e(this, paramh);
    com.google.android.gms.ads.b.a locala = zza(paramContext, paramBundle1.getString("pubid")).a(paramh);
    com.google.android.gms.ads.formats.b localb = paraml.h();
    if (localb != null) {
      locala.a(localb);
    }
    if (paraml.i()) {
      locala.a(paramh);
    }
    if (paraml.j()) {
      locala.a(paramh);
    }
    this.zzgb = locala.a();
    this.zzgb.a(zza(paramContext, paraml, paramBundle2, paramBundle1));
  }
  
  public void showInterstitial()
  {
    this.zzga.g();
  }
  
  public void showVideo()
  {
    this.zzgd.g();
  }
  
  protected abstract Bundle zza(Bundle paramBundle1, Bundle paramBundle2);
  
  com.google.android.gms.ads.b.a zza(Context paramContext, String paramString)
  {
    return new com.google.android.gms.ads.b.a(paramContext, paramString);
  }
  
  com.google.android.gms.ads.c zza(Context paramContext, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    com.google.android.gms.ads.c.a locala = new com.google.android.gms.ads.c.a();
    Object localObject = parama.a();
    if (localObject != null) {
      locala.a((Date)localObject);
    }
    int i = parama.b();
    if (i != 0) {
      locala.a(i);
    }
    localObject = parama.c();
    if (localObject != null)
    {
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        locala.a((String)((Iterator)localObject).next());
      }
    }
    localObject = parama.d();
    if (localObject != null) {
      locala.a((Location)localObject);
    }
    if (parama.f()) {
      locala.b(ac.a().a(paramContext));
    }
    if (parama.e() != -1) {
      if (parama.e() != 1) {
        break label210;
      }
    }
    label210:
    for (boolean bool = true;; bool = false)
    {
      locala.a(bool);
      locala.b(parama.g());
      locala.a(AdMobAdapter.class, zza(paramBundle1, paramBundle2));
      return locala.a();
    }
  }
  
  static class a
    extends j
  {
    private final com.google.android.gms.ads.formats.c d;
    
    public a(com.google.android.gms.ads.formats.c paramc)
    {
      this.d = paramc;
      a(paramc.b().toString());
      a(paramc.c());
      b(paramc.d().toString());
      a(paramc.e());
      c(paramc.f().toString());
      if (paramc.g() != null) {
        a(paramc.g().doubleValue());
      }
      if (paramc.h() != null) {
        d(paramc.h().toString());
      }
      if (paramc.i() != null) {
        e(paramc.i().toString());
      }
      a(true);
      b(true);
      a(paramc.j());
    }
    
    public void a(View paramView)
    {
      if ((paramView instanceof NativeAdView)) {
        ((NativeAdView)paramView).setNativeAd(this.d);
      }
    }
  }
  
  static class b
    extends k
  {
    private final com.google.android.gms.ads.formats.d d;
    
    public b(com.google.android.gms.ads.formats.d paramd)
    {
      this.d = paramd;
      a(paramd.b().toString());
      a(paramd.c());
      b(paramd.d().toString());
      if (paramd.e() != null) {
        a(paramd.e());
      }
      c(paramd.f().toString());
      d(paramd.g().toString());
      a(true);
      b(true);
    }
    
    public void a(View paramView)
    {
      if ((paramView instanceof NativeAdView)) {
        ((NativeAdView)paramView).setNativeAd(this.d);
      }
    }
  }
  
  static final class c
    extends com.google.android.gms.ads.a
    implements com.google.android.gms.ads.internal.client.a
  {
    final a a;
    final com.google.android.gms.ads.mediation.d b;
    
    public c(a parama, com.google.android.gms.ads.mediation.d paramd)
    {
      this.a = parama;
      this.b = paramd;
    }
    
    public void a()
    {
      this.b.a(this.a);
    }
    
    public void a(int paramInt)
    {
      this.b.a(this.a, paramInt);
    }
    
    public void b()
    {
      this.b.b(this.a);
    }
    
    public void c()
    {
      this.b.c(this.a);
    }
    
    public void d()
    {
      this.b.d(this.a);
    }
    
    public void e()
    {
      this.b.e(this.a);
    }
  }
  
  static final class d
    extends com.google.android.gms.ads.a
    implements com.google.android.gms.ads.internal.client.a
  {
    final a a;
    final com.google.android.gms.ads.mediation.f b;
    
    public d(a parama, com.google.android.gms.ads.mediation.f paramf)
    {
      this.a = parama;
      this.b = paramf;
    }
    
    public void a()
    {
      this.b.a(this.a);
    }
    
    public void a(int paramInt)
    {
      this.b.a(this.a, paramInt);
    }
    
    public void b()
    {
      this.b.b(this.a);
    }
    
    public void c()
    {
      this.b.c(this.a);
    }
    
    public void d()
    {
      this.b.d(this.a);
    }
    
    public void e()
    {
      this.b.e(this.a);
    }
  }
  
  static final class e
    extends com.google.android.gms.ads.a
    implements com.google.android.gms.ads.formats.c.a, d.a, com.google.android.gms.ads.internal.client.a
  {
    final a a;
    final h b;
    
    public e(a parama, h paramh)
    {
      this.a = parama;
      this.b = paramh;
    }
    
    public void a() {}
    
    public void a(int paramInt)
    {
      this.b.a(this.a, paramInt);
    }
    
    public void a(com.google.android.gms.ads.formats.c paramc)
    {
      this.b.a(this.a, new a.a(paramc));
    }
    
    public void a(com.google.android.gms.ads.formats.d paramd)
    {
      this.b.a(this.a, new a.b(paramd));
    }
    
    public void b()
    {
      this.b.a(this.a);
    }
    
    public void c()
    {
      this.b.b(this.a);
    }
    
    public void d()
    {
      this.b.c(this.a);
    }
    
    public void e()
    {
      this.b.d(this.a);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/ads/mediation/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */