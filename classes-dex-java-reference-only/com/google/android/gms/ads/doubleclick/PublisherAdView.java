package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.internal.client.f;
import com.google.android.gms.ads.internal.util.client.b;

public final class PublisherAdView
  extends ViewGroup
{
  private final f a;
  
  public PublisherAdView(Context paramContext)
  {
    super(paramContext);
    this.a = new f(this);
  }
  
  public PublisherAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new f(this, paramAttributeSet, true);
  }
  
  public PublisherAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new f(this, paramAttributeSet, true);
  }
  
  public void a()
  {
    this.a.a();
  }
  
  @RequiresPermission("android.permission.INTERNET")
  public void a(d paramd)
  {
    this.a.a(paramd.j());
  }
  
  public void b()
  {
    this.a.i();
  }
  
  public void c()
  {
    this.a.j();
  }
  
  public void d()
  {
    this.a.k();
  }
  
  public boolean e()
  {
    return this.a.m();
  }
  
  public com.google.android.gms.ads.a getAdListener()
  {
    return this.a.b();
  }
  
  public com.google.android.gms.ads.d getAdSize()
  {
    return this.a.c();
  }
  
  public com.google.android.gms.ads.d[] getAdSizes()
  {
    return this.a.d();
  }
  
  public String getAdUnitId()
  {
    return this.a.e();
  }
  
  public a getAppEventListener()
  {
    return this.a.f();
  }
  
  public String getMediationAdapterClassName()
  {
    return this.a.l();
  }
  
  public c getOnCustomRenderedAdLoadedListener()
  {
    return this.a.h();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - i) / 2;
      paramInt2 = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(paramInt1, paramInt2, i + paramInt1, j + paramInt2);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject1 = getChildAt(0);
    int j;
    if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8))
    {
      measureChild((View)localObject1, paramInt1, paramInt2);
      j = ((View)localObject1).getMeasuredWidth();
      i = ((View)localObject1).getMeasuredHeight();
    }
    for (;;)
    {
      j = Math.max(j, getSuggestedMinimumWidth());
      i = Math.max(i, getSuggestedMinimumHeight());
      setMeasuredDimension(View.resolveSize(j, paramInt1), View.resolveSize(i, paramInt2));
      return;
      try
      {
        localObject1 = getAdSize();
        if (localObject1 != null)
        {
          Context localContext = getContext();
          j = ((com.google.android.gms.ads.d)localObject1).b(localContext);
          i = ((com.google.android.gms.ads.d)localObject1).a(localContext);
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          b.b("Unable to retrieve ad size.", localNullPointerException);
          Object localObject2 = null;
        }
        j = 0;
      }
    }
  }
  
  public void setAdListener(com.google.android.gms.ads.a parama)
  {
    this.a.a(parama);
  }
  
  public void setAdSizes(com.google.android.gms.ads.d... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length < 1)) {
      throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }
    this.a.b(paramVarArgs);
  }
  
  public void setAdUnitId(String paramString)
  {
    this.a.a(paramString);
  }
  
  public void setAppEventListener(a parama)
  {
    this.a.a(parama);
  }
  
  public void setCorrelator(e parame)
  {
    this.a.a(parame);
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public void setOnCustomRenderedAdLoadedListener(c paramc)
  {
    this.a.a(paramc);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/doubleclick/PublisherAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */