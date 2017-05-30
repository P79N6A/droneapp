package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.internal.client.f;
import com.google.android.gms.internal.aaa;

@aaa
public final class NativeExpressAdView
  extends BaseAdView
{
  public NativeExpressAdView(Context paramContext)
  {
    super(paramContext, 2);
  }
  
  public NativeExpressAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2);
  }
  
  public NativeExpressAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, 2);
  }
  
  public h getVideoController()
  {
    return this.a.n();
  }
  
  public i getVideoOptions()
  {
    return this.a.p();
  }
  
  public void setVideoOptions(i parami)
  {
    this.a.a(parami);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/NativeExpressAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */