package com.fimi.soul.module.insurance;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ReceiveInsuranceActivity
  extends Activity
{
  public static String a = "https://api.jr.mi.com/insurance/uav.html?from=uav";
  private WebView b;
  
  private void a()
  {
    this.b = ((WebView)findViewById(2131689852));
    WebSettings localWebSettings = this.b.getSettings();
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setDomStorageEnabled(true);
    this.b.setWebViewClient(new WebViewClient()
    {
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        paramAnonymousWebView.loadUrl(paramAnonymousString);
        return true;
      }
    });
    this.b.loadUrl("http://staging.mifi.pt.xiaomi.com/insurance/uav.html");
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968629);
    a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/insurance/ReceiveInsuranceActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */