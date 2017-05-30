package com.fimi.soul.module.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.ao;

public class ShowTextActivity
  extends BaseActivity
{
  public static final String a = "URL_TITLE";
  public static final String b = "URL_LOCAL";
  public static final String c = "URL_ONLINE";
  private WebView d;
  private Button e;
  private TextView f;
  
  private void a(Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("URL_ONLINE");
    String str2 = paramIntent.getStringExtra("URL_LOCAL");
    int i = paramIntent.getIntExtra("URL_TITLE", 0);
    if (i != 0) {
      this.f.setText(i);
    }
    this.e = ((Button)findViewById(2131689853));
    this.e.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        ShowTextActivity.this.finish();
      }
    });
    this.d = ((WebView)findViewById(2131689839));
    this.d.getSettings().setJavaScriptEnabled(true);
    this.d.getSettings().setDomStorageEnabled(true);
    this.d.setWebViewClient(new WebViewClient()
    {
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        paramAnonymousWebView.loadUrl(paramAnonymousString);
        return true;
      }
    });
    if (ao.b(this))
    {
      this.d.loadUrl(str1);
      return;
    }
    this.d.loadUrl(str2);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968631);
    this.f = ((TextView)findViewById(2131689628));
    a(getIntent());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/ShowTextActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */