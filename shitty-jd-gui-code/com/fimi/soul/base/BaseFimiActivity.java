package com.fimi.soul.base;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.fimi.kernel.BaseActivity;
import com.fimi.kernel.utils.w;
import com.fimi.soul.view.titlebar.FmBottomBar;
import com.fimi.soul.view.titlebar.FmTitleBar;

public abstract class BaseFimiActivity
  extends BaseActivity
{
  public Application abApplication = null;
  public RelativeLayout ab_base = null;
  protected RelativeLayout contentLayout = null;
  private FmBottomBar mAbBottomBar = null;
  private FmTitleBar mAbTitleBar = null;
  public LayoutInflater mInflater;
  protected w mTintManager;
  
  public void finish()
  {
    super.finish();
  }
  
  public FmBottomBar getBottomBar()
  {
    return this.mAbBottomBar;
  }
  
  public FmTitleBar getTitleBar()
  {
    this.mAbTitleBar.setVisibility(0);
    return this.mAbTitleBar;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.mAbTitleBar.b();
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    this.mInflater = LayoutInflater.from(this);
    this.mTintManager = new w(this);
    if (Build.VERSION.SDK_INT >= 19) {
      setTranslucentStatus(true);
    }
    this.mTintManager.a(true);
    this.mAbTitleBar = new FmTitleBar(this);
    this.ab_base = new RelativeLayout(this);
    this.ab_base.setBackgroundColor(Color.rgb(255, 255, 255));
    this.contentLayout = new RelativeLayout(this);
    this.contentLayout.setPadding(0, 0, 0, 0);
    this.mAbBottomBar = new FmBottomBar(this);
    this.ab_base.addView(this.mAbTitleBar, new LinearLayout.LayoutParams(-1, -2));
    this.mAbTitleBar.setVisibility(8);
    paramBundle = new RelativeLayout.LayoutParams(-1, -2);
    paramBundle.addRule(12, -1);
    this.ab_base.addView(this.mAbBottomBar, paramBundle);
    paramBundle = new RelativeLayout.LayoutParams(-1, -2);
    paramBundle.addRule(3, this.mAbTitleBar.getId());
    paramBundle.addRule(2, this.mAbBottomBar.getId());
    this.ab_base.addView(this.contentLayout, paramBundle);
    this.abApplication = getApplication();
    setContentView(this.ab_base, new LinearLayout.LayoutParams(-1, -1));
  }
  
  protected void onDestroy()
  {
    this.mAbTitleBar.b();
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    this.mAbTitleBar.b();
  }
  
  public void setAbContentView(int paramInt)
  {
    setAbContentView(this.mInflater.inflate(paramInt, null));
  }
  
  public void setAbContentView(View paramView)
  {
    this.contentLayout.removeAllViews();
    this.contentLayout.addView(paramView, new LinearLayout.LayoutParams(-1, -1));
  }
  
  public void setContentView(int paramInt)
  {
    super.setContentView(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    super.setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
  }
  
  public void setStatusBarTintResource(int paramInt)
  {
    this.mTintManager.d(paramInt);
  }
  
  public void setTitleBarOverlay(boolean paramBoolean)
  {
    this.ab_base.removeAllViews();
    if (paramBoolean)
    {
      localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(2, this.mAbBottomBar.getId());
      this.ab_base.addView(this.contentLayout, localLayoutParams);
      localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(10, -1);
      this.ab_base.addView(this.mAbTitleBar, localLayoutParams);
      localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(12, -1);
      this.ab_base.addView(this.mAbBottomBar, localLayoutParams);
      return;
    }
    this.ab_base.addView(this.mAbTitleBar, new LinearLayout.LayoutParams(-1, -2));
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(12, -1);
    this.ab_base.addView(this.mAbBottomBar, localLayoutParams);
    localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(3, this.mAbTitleBar.getId());
    localLayoutParams.addRule(2, this.mAbBottomBar.getId());
    this.ab_base.addView(this.contentLayout, localLayoutParams);
  }
  
  public void setTitleColor(int paramInt)
  {
    super.setTitleColor(paramInt);
  }
  
  @TargetApi(19)
  protected void setTranslucentStatus(boolean paramBoolean)
  {
    Window localWindow = getWindow();
    WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
    if (paramBoolean) {}
    for (localLayoutParams.flags |= 0x4000000;; localLayoutParams.flags &= 0xFBFFFFFF)
    {
      localWindow.setAttributes(localLayoutParams);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/base/BaseFimiActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */