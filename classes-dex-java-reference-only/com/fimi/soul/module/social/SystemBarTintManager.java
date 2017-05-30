package com.fimi.soul.module.social;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import java.lang.reflect.Method;

public class SystemBarTintManager
{
  public static final int DEFAULT_TINT_COLOR = -1728053248;
  private static String sNavBarOverride;
  private final SystemBarConfig mConfig;
  private boolean mNavBarAvailable;
  private boolean mNavBarTintEnabled;
  private View mNavBarTintView;
  private boolean mStatusBarAvailable;
  private boolean mStatusBarTintEnabled;
  private View mStatusBarTintView;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    try
    {
      Method localMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
      localMethod.setAccessible(true);
      sNavBarOverride = (String)localMethod.invoke(null, new Object[] { "qemu.hw.mainkeys" });
      return;
    }
    catch (Throwable localThrowable)
    {
      sNavBarOverride = null;
    }
  }
  
  @TargetApi(19)
  public SystemBarTintManager(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    ViewGroup localViewGroup = (ViewGroup)localWindow.getDecorView();
    Object localObject;
    if (Build.VERSION.SDK_INT >= 19) {
      localObject = paramActivity.obtainStyledAttributes(new int[] { 16843759, 16843760 });
    }
    try
    {
      this.mStatusBarAvailable = ((TypedArray)localObject).getBoolean(0, false);
      this.mNavBarAvailable = ((TypedArray)localObject).getBoolean(1, false);
      ((TypedArray)localObject).recycle();
      localObject = localWindow.getAttributes();
      if ((0x4000000 & ((WindowManager.LayoutParams)localObject).flags) != 0) {
        this.mStatusBarAvailable = true;
      }
      if ((((WindowManager.LayoutParams)localObject).flags & 0x8000000) != 0) {
        this.mNavBarAvailable = true;
      }
      this.mConfig = new SystemBarConfig(paramActivity, this.mStatusBarAvailable, this.mNavBarAvailable, null);
      if (!this.mConfig.hasNavigtionBar()) {
        this.mNavBarAvailable = false;
      }
      if (this.mStatusBarAvailable) {
        setupStatusBarView(paramActivity, localViewGroup);
      }
      if (this.mNavBarAvailable) {
        setupNavBarView(paramActivity, localViewGroup);
      }
      return;
    }
    finally
    {
      ((TypedArray)localObject).recycle();
    }
  }
  
  private void setupNavBarView(Context paramContext, ViewGroup paramViewGroup)
  {
    this.mNavBarTintView = new View(paramContext);
    if (this.mConfig.isNavigationAtBottom()) {
      paramContext = new FrameLayout.LayoutParams(-1, this.mConfig.getNavigationBarHeight());
    }
    for (paramContext.gravity = 80;; paramContext.gravity = 5)
    {
      this.mNavBarTintView.setLayoutParams(paramContext);
      this.mNavBarTintView.setBackgroundColor(-1728053248);
      this.mNavBarTintView.setVisibility(8);
      paramViewGroup.addView(this.mNavBarTintView);
      return;
      paramContext = new FrameLayout.LayoutParams(this.mConfig.getNavigationBarWidth(), -1);
    }
  }
  
  private void setupStatusBarView(Context paramContext, ViewGroup paramViewGroup)
  {
    this.mStatusBarTintView = new View(paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, this.mConfig.getStatusBarHeight());
    paramContext.gravity = 48;
    if ((this.mNavBarAvailable) && (!this.mConfig.isNavigationAtBottom())) {
      paramContext.rightMargin = this.mConfig.getNavigationBarWidth();
    }
    this.mStatusBarTintView.setLayoutParams(paramContext);
    this.mStatusBarTintView.setBackgroundColor(-1728053248);
    this.mStatusBarTintView.setVisibility(8);
    paramViewGroup.addView(this.mStatusBarTintView);
  }
  
  public SystemBarConfig getConfig()
  {
    return this.mConfig;
  }
  
  public boolean isNavBarTintEnabled()
  {
    return this.mNavBarTintEnabled;
  }
  
  public boolean isStatusBarTintEnabled()
  {
    return this.mStatusBarTintEnabled;
  }
  
  @TargetApi(11)
  public void setNavigationBarAlpha(float paramFloat)
  {
    if ((this.mNavBarAvailable) && (Build.VERSION.SDK_INT >= 11)) {
      this.mNavBarTintView.setAlpha(paramFloat);
    }
  }
  
  public void setNavigationBarTintColor(int paramInt)
  {
    if (this.mNavBarAvailable) {
      this.mNavBarTintView.setBackgroundColor(paramInt);
    }
  }
  
  public void setNavigationBarTintDrawable(Drawable paramDrawable)
  {
    if (this.mNavBarAvailable) {
      this.mNavBarTintView.setBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setNavigationBarTintEnabled(boolean paramBoolean)
  {
    this.mNavBarTintEnabled = paramBoolean;
    View localView;
    if (this.mNavBarAvailable)
    {
      localView = this.mNavBarTintView;
      if (!paramBoolean) {
        break label29;
      }
    }
    label29:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  public void setNavigationBarTintResource(int paramInt)
  {
    if (this.mNavBarAvailable) {
      this.mNavBarTintView.setBackgroundResource(paramInt);
    }
  }
  
  @TargetApi(11)
  public void setStatusBarAlpha(float paramFloat)
  {
    if ((this.mStatusBarAvailable) && (Build.VERSION.SDK_INT >= 11)) {
      this.mStatusBarTintView.setAlpha(paramFloat);
    }
  }
  
  public void setStatusBarTintColor(int paramInt)
  {
    if (this.mStatusBarAvailable) {
      this.mStatusBarTintView.setBackgroundColor(paramInt);
    }
  }
  
  public void setStatusBarTintDrawable(Drawable paramDrawable)
  {
    if (this.mStatusBarAvailable) {
      this.mStatusBarTintView.setBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setStatusBarTintEnabled(boolean paramBoolean)
  {
    this.mStatusBarTintEnabled = paramBoolean;
    View localView;
    if (this.mStatusBarAvailable)
    {
      localView = this.mStatusBarTintView;
      if (!paramBoolean) {
        break label29;
      }
    }
    label29:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  public void setStatusBarTintResource(int paramInt)
  {
    if (this.mStatusBarAvailable) {
      this.mStatusBarTintView.setBackgroundResource(paramInt);
    }
  }
  
  public void setTintAlpha(float paramFloat)
  {
    setStatusBarAlpha(paramFloat);
    setNavigationBarAlpha(paramFloat);
  }
  
  public void setTintColor(int paramInt)
  {
    setStatusBarTintColor(paramInt);
    setNavigationBarTintColor(paramInt);
  }
  
  public void setTintDrawable(Drawable paramDrawable)
  {
    setStatusBarTintDrawable(paramDrawable);
    setNavigationBarTintDrawable(paramDrawable);
  }
  
  public void setTintResource(int paramInt)
  {
    setStatusBarTintResource(paramInt);
    setNavigationBarTintResource(paramInt);
  }
  
  public static class SystemBarConfig
  {
    private static final String NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME = "navigation_bar_height_landscape";
    private static final String NAV_BAR_HEIGHT_RES_NAME = "navigation_bar_height";
    private static final String NAV_BAR_WIDTH_RES_NAME = "navigation_bar_width";
    private static final String SHOW_NAV_BAR_RES_NAME = "config_showNavigationBar";
    private static final String STATUS_BAR_HEIGHT_RES_NAME = "status_bar_height";
    private final int mActionBarHeight;
    private final boolean mHasNavigationBar;
    private final boolean mInPortrait;
    private final int mNavigationBarHeight;
    private final int mNavigationBarWidth;
    private final float mSmallestWidthDp;
    private final int mStatusBarHeight;
    private final boolean mTranslucentNavBar;
    private final boolean mTranslucentStatusBar;
    
    private SystemBarConfig(Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2)
    {
      Resources localResources = paramActivity.getResources();
      if (localResources.getConfiguration().orientation == 1)
      {
        bool1 = true;
        this.mInPortrait = bool1;
        this.mSmallestWidthDp = getSmallestWidthDp(paramActivity);
        this.mStatusBarHeight = getInternalDimensionSize(localResources, "status_bar_height");
        this.mActionBarHeight = getActionBarHeight(paramActivity);
        this.mNavigationBarHeight = getNavigationBarHeight(paramActivity);
        this.mNavigationBarWidth = getNavigationBarWidth(paramActivity);
        if (this.mNavigationBarHeight <= 0) {
          break label116;
        }
      }
      label116:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.mHasNavigationBar = bool1;
        this.mTranslucentStatusBar = paramBoolean1;
        this.mTranslucentNavBar = paramBoolean2;
        return;
        bool1 = false;
        break;
      }
    }
    
    @TargetApi(14)
    private int getActionBarHeight(Context paramContext)
    {
      int i = 0;
      if (Build.VERSION.SDK_INT >= 14)
      {
        TypedValue localTypedValue = new TypedValue();
        paramContext.getTheme().resolveAttribute(16843499, localTypedValue, true);
        i = TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramContext.getResources().getDisplayMetrics());
      }
      return i;
    }
    
    private int getInternalDimensionSize(Resources paramResources, String paramString)
    {
      int i = 0;
      int j = paramResources.getIdentifier(paramString, "dimen", "android");
      if (j > 0) {
        i = paramResources.getDimensionPixelSize(j);
      }
      return i;
    }
    
    @TargetApi(14)
    private int getNavigationBarHeight(Context paramContext)
    {
      Resources localResources = paramContext.getResources();
      int j = 0;
      int i = j;
      if (Build.VERSION.SDK_INT >= 14)
      {
        i = j;
        if (hasNavBar(paramContext)) {
          if (!this.mInPortrait) {
            break label48;
          }
        }
      }
      label48:
      for (paramContext = "navigation_bar_height";; paramContext = "navigation_bar_height_landscape")
      {
        i = getInternalDimensionSize(localResources, paramContext);
        return i;
      }
    }
    
    @TargetApi(14)
    private int getNavigationBarWidth(Context paramContext)
    {
      Resources localResources = paramContext.getResources();
      int j = 0;
      int i = j;
      if (Build.VERSION.SDK_INT >= 14)
      {
        i = j;
        if (hasNavBar(paramContext)) {
          i = getInternalDimensionSize(localResources, "navigation_bar_width");
        }
      }
      return i;
    }
    
    @SuppressLint({"NewApi"})
    private float getSmallestWidthDp(Activity paramActivity)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      if (Build.VERSION.SDK_INT >= 16) {
        paramActivity.getWindowManager().getDefaultDisplay().getRealMetrics(localDisplayMetrics);
      }
      for (;;)
      {
        return Math.min(localDisplayMetrics.widthPixels / localDisplayMetrics.density, localDisplayMetrics.heightPixels / localDisplayMetrics.density);
        paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      }
    }
    
    @TargetApi(14)
    private boolean hasNavBar(Context paramContext)
    {
      boolean bool = true;
      Resources localResources = paramContext.getResources();
      int i = localResources.getIdentifier("config_showNavigationBar", "bool", "android");
      if (i != 0)
      {
        bool = localResources.getBoolean(i);
        if ("1".equals(SystemBarTintManager.sNavBarOverride)) {
          return false;
        }
        if ("0".equals(SystemBarTintManager.sNavBarOverride)) {
          return true;
        }
      }
      else
      {
        if (!ViewConfiguration.get(paramContext).hasPermanentMenuKey()) {}
        for (;;)
        {
          return bool;
          bool = false;
        }
      }
      return bool;
    }
    
    public int getActionBarHeight()
    {
      return this.mActionBarHeight;
    }
    
    public int getNavigationBarHeight()
    {
      return this.mNavigationBarHeight;
    }
    
    public int getNavigationBarWidth()
    {
      return this.mNavigationBarWidth;
    }
    
    public int getPixelInsetBottom()
    {
      if ((this.mTranslucentNavBar) && (isNavigationAtBottom())) {
        return this.mNavigationBarHeight;
      }
      return 0;
    }
    
    public int getPixelInsetRight()
    {
      if ((this.mTranslucentNavBar) && (!isNavigationAtBottom())) {
        return this.mNavigationBarWidth;
      }
      return 0;
    }
    
    public int getPixelInsetTop(boolean paramBoolean)
    {
      int j = 0;
      if (this.mTranslucentStatusBar) {}
      for (int i = this.mStatusBarHeight;; i = 0)
      {
        if (paramBoolean) {
          j = this.mActionBarHeight;
        }
        return j + i;
      }
    }
    
    public int getStatusBarHeight()
    {
      return this.mStatusBarHeight;
    }
    
    public boolean hasNavigtionBar()
    {
      return this.mHasNavigationBar;
    }
    
    public boolean isNavigationAtBottom()
    {
      return (this.mSmallestWidthDp >= 600.0F) || (this.mInPortrait);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/social/SystemBarTintManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */