package com.fimi.soul.module.social;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.titlebar.FmTitleBar;
import com.mining.app.zxing.activity.MipcaActivityCapture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebViewActivity
  extends Activity
{
  private static final int SCANNIN_GREQUEST_CODE = 1;
  public static final String WEB_TITLE = "title";
  public static final String WEB_URL = "url";
  private ImageView back_btn;
  private int index;
  private FmTitleBar mAbTitleBar;
  WebView mWebView;
  private String main_url;
  private String policy_url = "https://api.jr.mi.com/insurance/insurance_asset.html?source=p0&from=local#/index";
  private Button right_bt;
  private String temp_url;
  private TextView title;
  private String wholeJS;
  
  public void loadFiileJS()
  {
    Object localObject3 = null;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        localInputStream = getAssets().open("insurance.js");
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        arrayOfByte = new byte['Ѐ'];
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        localByteArrayOutputStream = new ByteArrayOutputStream();
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        i = localInputStream.read(arrayOfByte);
        if (i <= 0)
        {
          localObject1 = localInputStream;
          localObject3 = localInputStream;
          this.wholeJS = localByteArrayOutputStream.toString();
        }
      }
      catch (IOException localIOException4)
      {
        InputStream localInputStream;
        byte[] arrayOfByte;
        ByteArrayOutputStream localByteArrayOutputStream;
        int i;
        localObject3 = localObject1;
        localIOException4.printStackTrace();
        if (localObject1 == null) {
          continue;
        }
        try
        {
          ((InputStream)localObject1).close();
          return;
        }
        catch (IOException localIOException1)
        {
          localIOException1.printStackTrace();
          return;
        }
      }
      finally
      {
        if (localObject3 == null) {
          break label144;
        }
      }
      try
      {
        localInputStream.close();
        return;
      }
      catch (IOException localIOException2)
      {
        localIOException2.printStackTrace();
        return;
      }
      localObject1 = localInputStream;
      localObject3 = localInputStream;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    try
    {
      ((InputStream)localObject3).close();
      label144:
      throw ((Throwable)localObject2);
    }
    catch (IOException localIOException3)
    {
      for (;;)
      {
        localIOException3.printStackTrace();
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while (paramInt2 != -1);
    paramIntent = paramIntent.getExtras().getString("result");
    Log.i("zdy", "mTextView.setText(" + paramIntent);
    this.mWebView.loadUrl("javascript:SnCallback('" + paramIntent + "')");
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 19)
    {
      getWindow().setFlags(67108864, 67108864);
      paramBundle = new SystemBarTintManager(this);
      paramBundle.setStatusBarTintEnabled(true);
      paramBundle.setStatusBarTintResource(2131624132);
    }
    setContentView(2130968804);
    this.back_btn = ((ImageView)findViewById(2131689874));
    this.right_bt = ((Button)findViewById(2131690615));
    this.title = ((TextView)findViewById(2131689628));
    ao.a(getAssets(), new View[] { this.title, this.right_bt });
    loadFiileJS();
    this.back_btn.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        WebViewActivity.this.onGoBack();
      }
    });
    this.right_bt.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = WebViewActivity.this.mWebView.copyBackForwardList();
        WebViewActivity.access$002(WebViewActivity.this, paramAnonymousView.getCurrentIndex());
        WebViewActivity.this.right_bt.setVisibility(4);
        WebViewActivity.this.mWebView.loadUrl(WebViewActivity.this.policy_url);
      }
    });
    this.mWebView = ((WebView)findViewById(2131689839));
    this.mWebView.getSettings().setJavaScriptEnabled(true);
    this.mWebView.getSettings().setDomStorageEnabled(true);
    this.mWebView.getSettings().setAllowFileAccess(true);
    this.mWebView.getSettings().setBuiltInZoomControls(true);
    this.mWebView.getSettings().setDefaultTextEncodingName("UTF-8");
    this.mWebView.addJavascriptInterface(new InterfaceJS(null), "interfacejs");
    this.mWebView.setWebViewClient(new HelloWebViewClient(null));
    Intent localIntent = getIntent();
    if (localIntent != null)
    {
      paramBundle = localIntent.getStringExtra("url");
      setTitle(localIntent.getStringExtra("title"));
    }
    for (;;)
    {
      if (paramBundle != null)
      {
        this.main_url = paramBundle;
        this.mWebView.loadUrl(paramBundle);
        return;
      }
      finish();
      return;
      paramBundle = null;
    }
  }
  
  public void onGoBack()
  {
    if (this.mWebView.canGoBack())
    {
      if (this.temp_url.equals(this.main_url))
      {
        finish();
        return;
      }
      this.right_bt.setVisibility(0);
      this.mWebView.loadUrl(this.main_url);
      return;
    }
    finish();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.temp_url.equals(this.main_url)) {
        finish();
      }
      for (;;)
      {
        return true;
        paramKeyEvent = this.mWebView.copyBackForwardList();
        if (this.index == paramKeyEvent.getCurrentIndex() - 1) {
          this.right_bt.setVisibility(0);
        }
        this.mWebView.goBack();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  private class HelloWebViewClient
    extends WebViewClient
  {
    private HelloWebViewClient() {}
    
    public void onPageFinished(WebView paramWebView, String paramString)
    {
      paramWebView.loadUrl("javascript:" + WebViewActivity.this.wholeJS);
      super.onPageFinished(paramWebView, paramString);
    }
    
    public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      super.onPageStarted(paramWebView, paramString, paramBitmap);
      WebViewActivity.access$502(WebViewActivity.this, paramString);
      if (WebViewActivity.this.temp_url.equals(WebViewActivity.this.main_url))
      {
        WebViewActivity.this.back_btn.setImageResource(2130837725);
        return;
      }
      WebViewActivity.this.back_btn.setImageResource(2130837694);
    }
    
    public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
    {
      paramWebView.loadUrl(paramString);
      return true;
    }
  }
  
  private final class InterfaceJS
  {
    private InterfaceJS() {}
    
    @JavascriptInterface
    public void js2Android()
    {
      Log.i("zdy", " Test ");
      Intent localIntent = new Intent();
      localIntent.setClass(WebViewActivity.this, MipcaActivityCapture.class);
      localIntent.setFlags(67108864);
      WebViewActivity.this.startActivityForResult(localIntent, 1);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/social/WebViewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */