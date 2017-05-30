package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.uw;

public abstract class NativeAdView
  extends FrameLayout
{
  private final FrameLayout a = b(paramContext);
  private final uw b = b();
  
  public NativeAdView(Context paramContext)
  {
    super(paramContext);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  @TargetApi(21)
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private FrameLayout b(Context paramContext)
  {
    paramContext = a(paramContext);
    paramContext.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(paramContext);
    return paramContext;
  }
  
  private uw b()
  {
    d.a(this.a, "createDelegate must be called after mOverlayFrame has been created");
    return ac.b().a(this.a.getContext(), this, this.a);
  }
  
  protected View a(String paramString)
  {
    try
    {
      paramString = this.b.a(paramString);
      if (paramString != null)
      {
        paramString = (View)f.a(paramString);
        return paramString;
      }
    }
    catch (RemoteException paramString)
    {
      b.b("Unable to call getAssetView on delegate", paramString);
    }
    return null;
  }
  
  FrameLayout a(Context paramContext)
  {
    return new FrameLayout(paramContext);
  }
  
  public void a()
  {
    try
    {
      this.b.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      b.b("Unable to destroy native ad view", localRemoteException);
    }
  }
  
  protected void a(String paramString, View paramView)
  {
    try
    {
      this.b.a(paramString, f.a(paramView));
      return;
    }
    catch (RemoteException paramString)
    {
      b.b("Unable to call setAssetView on delegate", paramString);
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront(this.a);
  }
  
  public void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    if (this.a != paramView) {
      super.bringChildToFront(this.a);
    }
  }
  
  public void removeAllViews()
  {
    super.removeAllViews();
    super.addView(this.a);
  }
  
  public void removeView(View paramView)
  {
    if (this.a == paramView) {
      return;
    }
    super.removeView(paramView);
  }
  
  public void setNativeAd(a parama)
  {
    try
    {
      this.b.a((e)parama.a());
      return;
    }
    catch (RemoteException parama)
    {
      b.b("Unable to call setNativeAd on delegate", parama);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/formats/NativeAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */