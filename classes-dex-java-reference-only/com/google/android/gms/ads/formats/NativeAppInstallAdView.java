package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.b;

public final class NativeAppInstallAdView
  extends NativeAdView
{
  public NativeAppInstallAdView(Context paramContext)
  {
    super(paramContext);
  }
  
  public NativeAppInstallAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NativeAppInstallAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public NativeAppInstallAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public final View getBodyView()
  {
    return super.a("2004");
  }
  
  public final View getCallToActionView()
  {
    return super.a("2002");
  }
  
  public final View getHeadlineView()
  {
    return super.a("2001");
  }
  
  public final View getIconView()
  {
    return super.a("2003");
  }
  
  public final View getImageView()
  {
    return super.a("2007");
  }
  
  public final MediaView getMediaView()
  {
    View localView = super.a("2011");
    if ((localView instanceof MediaView)) {
      return (MediaView)localView;
    }
    if (localView != null) {
      b.a("View is not an instance of MediaView");
    }
    return null;
  }
  
  public final View getPriceView()
  {
    return super.a("2006");
  }
  
  public final View getStarRatingView()
  {
    return super.a("2008");
  }
  
  public final View getStoreView()
  {
    return super.a("2005");
  }
  
  public final void setBodyView(View paramView)
  {
    super.a("2004", paramView);
  }
  
  public final void setCallToActionView(View paramView)
  {
    super.a("2002", paramView);
  }
  
  public final void setHeadlineView(View paramView)
  {
    super.a("2001", paramView);
  }
  
  public final void setIconView(View paramView)
  {
    super.a("2003", paramView);
  }
  
  public final void setImageView(View paramView)
  {
    super.a("2007", paramView);
  }
  
  public final void setMediaView(MediaView paramMediaView)
  {
    super.a("2011", paramMediaView);
  }
  
  public final void setPriceView(View paramView)
  {
    super.a("2006", paramView);
  }
  
  public final void setStarRatingView(View paramView)
  {
    super.a("2008", paramView);
  }
  
  public final void setStoreView(View paramView)
  {
    super.a("2005", paramView);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/formats/NativeAppInstallAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */