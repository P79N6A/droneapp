package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@aaa
@TargetApi(21)
public class adl
  extends adj
{
  public adl(acy paramacy, boolean paramBoolean)
  {
    super(paramacy, paramBoolean);
  }
  
  @Nullable
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    if ((paramWebResourceRequest == null) || (paramWebResourceRequest.getUrl() == null)) {
      return null;
    }
    return a(paramWebView, paramWebResourceRequest.getUrl().toString(), paramWebResourceRequest.getRequestHeaders());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/adl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */