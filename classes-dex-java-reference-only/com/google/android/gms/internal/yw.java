package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@aaa
public class yw
  implements yu
{
  final Set<WebView> a = Collections.synchronizedSet(new HashSet());
  private final Context b;
  
  public yw(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public WebView a()
  {
    WebView localWebView = new WebView(this.b);
    localWebView.getSettings().setJavaScriptEnabled(true);
    return localWebView;
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    abr.a("Fetching assets for the given html");
    abv.a.post(new yw.1(this, paramString2, paramString3));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */