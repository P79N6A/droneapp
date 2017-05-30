package com.fimi.soul.module.push;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.ao;

public class MessageDetailActivity
  extends BaseActivity
{
  protected static final FrameLayout.LayoutParams a = new FrameLayout.LayoutParams(-1, -1);
  private WebView b;
  private View c;
  private FrameLayout d;
  private WebChromeClient.CustomViewCallback e;
  
  private void a()
  {
    TextView localTextView = (TextView)findViewById(2131690327);
    localTextView.setText(2131362457);
    Button localButton = (Button)findViewById(2131690535);
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        MessageDetailActivity.this.finish();
      }
    });
    this.b = ((WebView)findViewById(2131689839));
    this.b.getSettings().setJavaScriptEnabled(true);
    WebSettings localWebSettings = this.b.getSettings();
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setUseWideViewPort(true);
    localWebSettings.setAllowFileAccess(true);
    localWebSettings.setSupportZoom(true);
    localWebSettings.setLoadWithOverviewMode(true);
    localWebSettings.setCacheMode(2);
    localWebSettings.setDomStorageEnabled(true);
    this.b.setWebViewClient(new WebViewClient()
    {
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        paramAnonymousWebView.loadUrl(paramAnonymousString);
        return true;
      }
    });
    ao.a(getAssets(), new View[] { localTextView, localButton });
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    getWindow().setFlags(128, 128);
    super.onCreate(paramBundle);
    setContentView(2130968624);
    a();
    paramBundle = getIntent().getStringExtra("redirectURL");
    if (paramBundle != null) {
      this.b.loadUrl(paramBundle);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.b.removeAllViews();
    this.b.destroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  static class a
    extends FrameLayout
  {
    public a(Context paramContext)
    {
      super();
      setBackgroundColor(paramContext.getResources().getColor(17170444));
    }
    
    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      return true;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/push/MessageDetailActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */