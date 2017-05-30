package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.c;
import java.net.URI;
import java.net.URISyntaxException;

@aaa
public class adk
  extends WebViewClient
{
  private final String a = b(paramString);
  private boolean b = false;
  private final acy c;
  private final zk d;
  
  public adk(zk paramzk, acy paramacy, String paramString)
  {
    this.c = paramacy;
    this.d = paramzk;
  }
  
  private String b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return paramString;
      try
      {
        if (paramString.endsWith("/"))
        {
          String str = paramString.substring(0, paramString.length() - 1);
          return str;
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        abr.b(localIndexOutOfBoundsException.getMessage());
      }
    }
    return paramString;
  }
  
  protected boolean a(String paramString)
  {
    paramString = b(paramString);
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return false;
      try
      {
        Object localObject1 = new URI(paramString);
        if ("passback".equals(((URI)localObject1).getScheme()))
        {
          abr.a("Passback received");
          this.d.b();
          return true;
        }
        if (!TextUtils.isEmpty(this.a))
        {
          Object localObject2 = new URI(this.a);
          paramString = ((URI)localObject2).getHost();
          String str = ((URI)localObject1).getHost();
          localObject2 = ((URI)localObject2).getPath();
          localObject1 = ((URI)localObject1).getPath();
          if ((c.a(paramString, str)) && (c.a(localObject2, localObject1)))
          {
            abr.a("Passback received");
            this.d.b();
            return true;
          }
        }
      }
      catch (URISyntaxException paramString)
      {
        abr.b(paramString.getMessage());
      }
    }
    return false;
  }
  
  public void onLoadResource(WebView paramWebView, String paramString)
  {
    paramWebView = String.valueOf(paramString);
    if (paramWebView.length() != 0) {}
    for (paramWebView = "JavascriptAdWebViewClient::onLoadResource: ".concat(paramWebView);; paramWebView = new String("JavascriptAdWebViewClient::onLoadResource: "))
    {
      abr.a(paramWebView);
      if (!a(paramString)) {
        this.c.l().onLoadResource(this.c.a(), paramString);
      }
      return;
    }
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    paramWebView = String.valueOf(paramString);
    if (paramWebView.length() != 0) {}
    for (paramWebView = "JavascriptAdWebViewClient::onPageFinished: ".concat(paramWebView);; paramWebView = new String("JavascriptAdWebViewClient::onPageFinished: "))
    {
      abr.a(paramWebView);
      if (!this.b)
      {
        this.d.a();
        this.b = true;
      }
      return;
    }
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView = String.valueOf(paramString);
    if (paramWebView.length() != 0) {}
    for (paramWebView = "JavascriptAdWebViewClient::shouldOverrideUrlLoading: ".concat(paramWebView);; paramWebView = new String("JavascriptAdWebViewClient::shouldOverrideUrlLoading: "))
    {
      abr.a(paramWebView);
      if (!a(paramString)) {
        break;
      }
      abr.a("shouldOverrideUrlLoading: received passback url");
      return true;
    }
    return this.c.l().shouldOverrideUrlLoading(this.c.a(), paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/adk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */