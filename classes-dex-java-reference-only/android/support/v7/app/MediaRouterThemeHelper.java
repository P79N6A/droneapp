package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.appcompat.R.attr;
import android.support.v7.mediarouter.R.style;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;

final class MediaRouterThemeHelper
{
  private static final int COLOR_DARK_ON_LIGHT_BACKGROUND = -570425344;
  private static final int COLOR_WHITE_ON_DARK_BACKGROUND = -1;
  private static final float MIN_CONTRAST = 3.0F;
  
  public static Context createThemedContext(Context paramContext, int paramInt)
  {
    if (isLightTheme(paramContext)) {
      if (getControllerColor(paramContext, paramInt) == -570425344) {
        paramInt = R.style.Theme_MediaRouter_Light;
      }
    }
    for (;;)
    {
      return new ContextThemeWrapper(paramContext, paramInt);
      paramInt = R.style.Theme_MediaRouter_Light_DarkControlPanel;
      continue;
      if (getControllerColor(paramContext, paramInt) == -570425344) {
        paramInt = R.style.Theme_MediaRouter_LightControlPanel;
      } else {
        paramInt = R.style.Theme_MediaRouter;
      }
    }
  }
  
  public static int getButtonTextColor(Context paramContext)
  {
    int j = getThemeColor(paramContext, 0, R.attr.colorPrimary);
    int i = j;
    if (ColorUtils.calculateContrast(j, getThemeColor(paramContext, 0, 16842801)) < 3.0D) {
      i = getThemeColor(paramContext, 0, R.attr.colorAccent);
    }
    return i;
  }
  
  public static int getControllerColor(Context paramContext, int paramInt)
  {
    if (ColorUtils.calculateContrast(-1, getThemeColor(paramContext, paramInt, R.attr.colorPrimary)) >= 3.0D) {
      return -1;
    }
    return -570425344;
  }
  
  public static float getDisabledAlpha(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(16842803, localTypedValue, true)) {
      return localTypedValue.getFloat();
    }
    return 0.5F;
  }
  
  private static int getThemeColor(Context paramContext, int paramInt1, int paramInt2)
  {
    if (paramInt1 != 0)
    {
      localObject = paramContext.obtainStyledAttributes(paramInt1, new int[] { paramInt2 });
      paramInt1 = ((TypedArray)localObject).getColor(0, 0);
      ((TypedArray)localObject).recycle();
      if (paramInt1 != 0) {
        return paramInt1;
      }
    }
    Object localObject = new TypedValue();
    paramContext.getTheme().resolveAttribute(paramInt2, (TypedValue)localObject, true);
    if (((TypedValue)localObject).resourceId != 0) {
      return paramContext.getResources().getColor(((TypedValue)localObject).resourceId);
    }
    return ((TypedValue)localObject).data;
  }
  
  public static int getThemeResource(Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(paramInt, localTypedValue, true)) {
      return localTypedValue.resourceId;
    }
    return 0;
  }
  
  private static boolean isLightTheme(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    return (paramContext.getTheme().resolveAttribute(R.attr.isLightTheme, localTypedValue, true)) && (localTypedValue.data != 0);
  }
  
  public static void setMediaControlsBackgroundColor(Context paramContext, View paramView1, View paramView2, boolean paramBoolean)
  {
    int i = getThemeColor(paramContext, 0, R.attr.colorPrimary);
    int j = getThemeColor(paramContext, 0, R.attr.colorPrimaryDark);
    int k;
    if ((paramBoolean) && (getControllerColor(paramContext, 0) == -570425344))
    {
      k = -1;
      j = i;
    }
    for (;;)
    {
      paramView1.setBackgroundColor(k);
      paramView2.setBackgroundColor(j);
      paramView1.setTag(Integer.valueOf(k));
      paramView2.setTag(Integer.valueOf(j));
      return;
      k = i;
    }
  }
  
  public static void setVolumeSliderColor(Context paramContext, MediaRouteVolumeSlider paramMediaRouteVolumeSlider, View paramView)
  {
    int i = getControllerColor(paramContext, 0);
    if (Color.alpha(i) != 255) {
      i = ColorUtils.compositeColors(i, ((Integer)paramView.getTag()).intValue());
    }
    for (;;)
    {
      paramMediaRouteVolumeSlider.setColor(i);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/MediaRouterThemeHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */