package android.support.v7.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R.attr;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.util.Log;

class MediaRouteVolumeSlider
  extends AppCompatSeekBar
{
  private static final String TAG = "MediaRouteVolumeSlider";
  private int mColor;
  private final float mDisabledAlpha;
  private boolean mHideThumb;
  private Drawable mThumb;
  
  public MediaRouteVolumeSlider(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MediaRouteVolumeSlider(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.seekBarStyle);
  }
  
  public MediaRouteVolumeSlider(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(paramContext);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (isEnabled()) {}
    for (int i = 255;; i = (int)(255.0F * this.mDisabledAlpha))
    {
      this.mThumb.setColorFilter(this.mColor, PorterDuff.Mode.SRC_IN);
      this.mThumb.setAlpha(i);
      getProgressDrawable().setColorFilter(this.mColor, PorterDuff.Mode.SRC_IN);
      getProgressDrawable().setAlpha(i);
      return;
    }
  }
  
  public void setColor(int paramInt)
  {
    if (this.mColor == paramInt) {
      return;
    }
    if (Color.alpha(paramInt) != 255) {
      Log.e("MediaRouteVolumeSlider", "Volume slider color cannot be translucent: #" + Integer.toHexString(paramInt));
    }
    this.mColor = paramInt;
  }
  
  public void setHideThumb(boolean paramBoolean)
  {
    if (this.mHideThumb == paramBoolean) {
      return;
    }
    this.mHideThumb = paramBoolean;
    if (this.mHideThumb) {}
    for (Drawable localDrawable = null;; localDrawable = this.mThumb)
    {
      super.setThumb(localDrawable);
      return;
    }
  }
  
  public void setThumb(Drawable paramDrawable)
  {
    this.mThumb = paramDrawable;
    if (this.mHideThumb) {}
    for (paramDrawable = null;; paramDrawable = this.mThumb)
    {
      super.setThumb(paramDrawable);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/MediaRouteVolumeSlider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */