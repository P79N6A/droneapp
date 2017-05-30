package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.e;
import com.google.android.gms.ads.mediation.m;

public final class a
{
  private final b a;
  
  private a(a parama)
  {
    this.a = a.a(parama).a();
  }
  
  @Deprecated
  public <T extends m> T a(Class<T> paramClass)
  {
    return this.a.a(paramClass);
  }
  
  public String a()
  {
    return this.a.o();
  }
  
  public boolean a(Context paramContext)
  {
    return this.a.a(paramContext);
  }
  
  public <T extends com.google.android.gms.ads.mediation.b> Bundle b(Class<T> paramClass)
  {
    return this.a.b(paramClass);
  }
  
  e b()
  {
    return this.a.p();
  }
  
  public <T extends com.google.android.gms.ads.mediation.customevent.a> Bundle c(Class<T> paramClass)
  {
    return this.a.c(paramClass);
  }
  
  public static final class a
  {
    private final b.a a = new b.a();
    private final Bundle b = new Bundle();
    
    public a a(int paramInt)
    {
      this.b.putString("csa_adPage", Integer.toString(paramInt));
      return this;
    }
    
    public a a(m paramm)
    {
      this.a.a(paramm);
      return this;
    }
    
    public a a(Class<? extends com.google.android.gms.ads.mediation.b> paramClass, Bundle paramBundle)
    {
      this.a.a(paramClass, paramBundle);
      return this;
    }
    
    public a a(String paramString)
    {
      this.b.putString("csa_channel", paramString);
      return this;
    }
    
    public a a(String paramString1, String paramString2)
    {
      this.b.putString(paramString1, paramString2);
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      Bundle localBundle = this.b;
      if (paramBoolean) {}
      for (String str = "on";; str = "off")
      {
        localBundle.putString("csa_adtest", str);
        return this;
      }
    }
    
    public a a()
    {
      this.a.a(AdMobAdapter.class, this.b);
      return new a(this, null);
    }
    
    public a b(int paramInt)
    {
      this.b.putString("csa_number", Integer.toString(paramInt));
      return this;
    }
    
    public a b(Class<? extends com.google.android.gms.ads.mediation.customevent.a> paramClass, Bundle paramBundle)
    {
      this.a.b(paramClass, paramBundle);
      return this;
    }
    
    public a b(String paramString)
    {
      this.b.putString("csa_hl", paramString);
      return this;
    }
    
    public a b(boolean paramBoolean)
    {
      this.b.putString("csa_clickToCall", Boolean.toString(paramBoolean));
      return this;
    }
    
    public a c(int paramInt)
    {
      this.b.putString("csa_fontSizeLocation", Integer.toString(paramInt));
      return this;
    }
    
    public a c(String paramString)
    {
      this.b.putString("csa_colorLocation", paramString);
      return this;
    }
    
    public a c(boolean paramBoolean)
    {
      this.b.putString("csa_location", Boolean.toString(paramBoolean));
      return this;
    }
    
    public a d(int paramInt)
    {
      this.b.putString("csa_width", Integer.toString(paramInt));
      return this;
    }
    
    public a d(String paramString)
    {
      this.b.putString("csa_fontFamily", paramString);
      return this;
    }
    
    public a d(boolean paramBoolean)
    {
      this.b.putString("csa_plusOnes", Boolean.toString(paramBoolean));
      return this;
    }
    
    @Deprecated
    public a e(int paramInt)
    {
      return d(Integer.toString(paramInt));
    }
    
    public a e(String paramString)
    {
      this.b.putString("csa_fontFamilyAttribution", paramString);
      return this;
    }
    
    public a e(boolean paramBoolean)
    {
      this.b.putString("csa_sellerRatings", Boolean.toString(paramBoolean));
      return this;
    }
    
    public a f(int paramInt)
    {
      this.b.putString("csa_fontSizeAnnotation", Integer.toString(paramInt));
      return this;
    }
    
    public a f(String paramString)
    {
      this.b.putString("csa_colorAdBorder", paramString);
      return this;
    }
    
    public a f(boolean paramBoolean)
    {
      this.b.putString("csa_siteLinks", Boolean.toString(paramBoolean));
      return this;
    }
    
    public a g(int paramInt)
    {
      this.b.putString("csa_fontSizeAttribution", Integer.toString(paramInt));
      return this;
    }
    
    public a g(String paramString)
    {
      this.b.putString("csa_colorAdSeparator", paramString);
      return this;
    }
    
    public a g(boolean paramBoolean)
    {
      Bundle localBundle = this.b;
      if (!paramBoolean) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        localBundle.putString("csa_noTitleUnderline", Boolean.toString(paramBoolean));
        return this;
      }
    }
    
    public a h(int paramInt)
    {
      this.b.putString("csa_fontSizeDescription", Integer.toString(paramInt));
      return this;
    }
    
    public a h(String paramString)
    {
      this.b.putString("csa_colorAnnotation", paramString);
      return this;
    }
    
    public a h(boolean paramBoolean)
    {
      this.b.putString("csa_titleBold", Boolean.toString(paramBoolean));
      return this;
    }
    
    public a i(int paramInt)
    {
      this.b.putString("csa_fontSizeDomainLink", Integer.toString(paramInt));
      return this;
    }
    
    public a i(String paramString)
    {
      this.b.putString("csa_colorAttribution", paramString);
      return this;
    }
    
    public a i(boolean paramBoolean)
    {
      this.b.putString("csa_detailedAttribution", Boolean.toString(paramBoolean));
      return this;
    }
    
    public a j(int paramInt)
    {
      this.b.putString("csa_fontSizeTitle", Integer.toString(paramInt));
      return this;
    }
    
    public a j(String paramString)
    {
      this.b.putString("csa_colorBackground", paramString);
      return this;
    }
    
    public a j(boolean paramBoolean)
    {
      this.b.putString("csa_longerHeadlines", Boolean.toString(paramBoolean));
      return this;
    }
    
    public a k(int paramInt)
    {
      this.b.putString("csa_adjustableLineHeight", Integer.toString(paramInt));
      return this;
    }
    
    public a k(String paramString)
    {
      this.b.putString("csa_colorBorder", paramString);
      return this;
    }
    
    public a l(int paramInt)
    {
      this.b.putString("csa_attributionSpacingBelow", Integer.toString(paramInt));
      return this;
    }
    
    public a l(String paramString)
    {
      this.b.putString("csa_colorDomainLink", paramString);
      return this;
    }
    
    public a m(int paramInt)
    {
      this.b.putString("csa_verticalSpacing", Integer.toString(paramInt));
      return this;
    }
    
    public a m(String paramString)
    {
      this.b.putString("csa_colorText", paramString);
      return this;
    }
    
    public a n(String paramString)
    {
      this.b.putString("csa_colorTitleLink", paramString);
      return this;
    }
    
    public a o(String paramString)
    {
      this.b.putString("csa_adBorderSelectors", paramString);
      return this;
    }
    
    public a p(String paramString)
    {
      this.b.putString("csa_borderSelections", paramString);
      return this;
    }
    
    public a q(String paramString)
    {
      this.a.d(paramString);
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/search/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */