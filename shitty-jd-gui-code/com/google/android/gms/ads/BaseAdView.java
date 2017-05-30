package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.f;

class BaseAdView
  extends ViewGroup
{
  protected final f a;
  
  public BaseAdView(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a = new f(this, a(paramInt));
  }
  
  public BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.a = new f(this, paramAttributeSet, false, a(paramInt));
  }
  
  public BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    this.a = new f(this, paramAttributeSet, false, a(paramInt2));
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 2;
  }
  
  @RequiresPermission("android.permission.INTERNET")
  public void a(c paramc)
  {
    this.a.a(paramc.f());
  }
  
  public void a(com.google.android.gms.ads.purchase.d paramd, String paramString)
  {
    this.a.a(paramd, paramString);
  }
  
  public boolean a()
  {
    return this.a.m();
  }
  
  public void b()
  {
    this.a.k();
  }
  
  public void c()
  {
    this.a.i();
  }
  
  public void d()
  {
    this.a.a();
  }
  
  public a getAdListener()
  {
    return this.a.b();
  }
  
  public d getAdSize()
  {
    return this.a.c();
  }
  
  public String getAdUnitId()
  {
    return this.a.e();
  }
  
  public com.google.android.gms.ads.purchase.b getInAppPurchaseListener()
  {
    return this.a.g();
  }
  
  public String getMediationAdapterClassName()
  {
    return this.a.l();
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
          j = ((d)localObject1).b(localContext);
          i = ((d)localObject1).a(localContext);
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          com.google.android.gms.ads.internal.util.client.b.b("Unable to retrieve ad size.", localNullPointerException);
          Object localObject2 = null;
        }
        j = 0;
      }
    }
  }
  
  public void setAdListener(a parama)
  {
    this.a.a(parama);
    if ((parama != null) && ((parama instanceof com.google.android.gms.ads.internal.client.a))) {
      this.a.a((com.google.android.gms.ads.internal.client.a)parama);
    }
    while (parama != null) {
      return;
    }
    this.a.a(null);
  }
  
  public void setAdSize(d paramd)
  {
    this.a.a(new d[] { paramd });
  }
  
  public void setAdUnitId(String paramString)
  {
    this.a.a(paramString);
  }
  
  public void setInAppPurchaseListener(com.google.android.gms.ads.purchase.b paramb)
  {
    this.a.a(paramb);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/BaseAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */