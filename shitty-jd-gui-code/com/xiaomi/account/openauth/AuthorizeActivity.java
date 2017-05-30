package com.xiaomi.account.openauth;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class AuthorizeActivity
  extends AuthorizeActivityBase
{
  @Deprecated
  public static int RESULT_CANCEL = AuthorizeActivityBase.RESULT_CANCEL;
  @Deprecated
  public static int RESULT_FAIL;
  @Deprecated
  public static int RESULT_SUCCESS = AuthorizeActivityBase.RESULT_SUCCESS;
  private ProgressBar mProgressBar;
  private MenuItem mRefreshItem;
  
  static
  {
    RESULT_FAIL = AuthorizeActivityBase.RESULT_FAIL;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((isFinishing()) || (super.isMiddleActivityMode())) {
      return;
    }
    paramBundle = super.getWebView();
    RelativeLayout localRelativeLayout = new RelativeLayout(this);
    localRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    localRelativeLayout.addView(paramBundle, new ViewGroup.LayoutParams(-1, -1));
    this.mProgressBar = new ProgressBar(this, null, 16842872);
    localRelativeLayout.addView(this.mProgressBar, new ViewGroup.LayoutParams(-1, -2));
    setContentView(localRelativeLayout);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if ((isFinishing()) || (super.isMiddleActivityMode())) {
      return true;
    }
    this.mRefreshItem = paramMenu.add("refresh");
    this.mRefreshItem.setIcon(17301629);
    this.mRefreshItem.setShowAsActionFlags(2);
    this.mRefreshItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
    {
      public boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AuthorizeActivity.this.refreshWebView();
        return true;
      }
    });
    this.mRefreshItem.setVisible(false);
    return true;
  }
  
  protected void onHideErrorUI()
  {
    if (this.mRefreshItem != null) {
      this.mRefreshItem.setVisible(false);
    }
  }
  
  protected void onHideProgress()
  {
    if (this.mProgressBar != null) {
      this.mProgressBar.setVisibility(8);
    }
  }
  
  protected void onShowErrorUI()
  {
    if (this.mRefreshItem != null) {
      this.mRefreshItem.setVisible(true);
    }
  }
  
  protected void onShowProgress()
  {
    if (this.mProgressBar != null) {
      this.mProgressBar.setVisibility(0);
    }
  }
  
  protected void onUpdateProgress(int paramInt)
  {
    if (this.mProgressBar != null) {
      this.mProgressBar.setProgress(paramInt);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/account/openauth/AuthorizeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */