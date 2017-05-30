package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.safebrowsing.c;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aaa
@TargetApi(11)
public class adj
  extends acz
{
  public adj(acy paramacy, boolean paramBoolean)
  {
    super(paramacy, paramBoolean);
  }
  
  protected WebResourceResponse a(Context paramContext, String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("User-Agent", u.e().a(paramContext, paramString1));
    localHashMap.put("Cache-Control", "max-stale=3600");
    paramContext = (String)new acc(paramContext).a(paramString2, localHashMap).get(60L, TimeUnit.SECONDS);
    if (paramContext == null) {
      return null;
    }
    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(paramContext.getBytes("UTF-8")));
  }
  
  protected WebResourceResponse a(WebView paramWebView, String paramString, @Nullable Map<String, String> paramMap)
  {
    if (!(paramWebView instanceof acy))
    {
      abr.d("Tried to intercept request from a WebView that wasn't an AdWebView.");
      return null;
    }
    acy localacy = (acy)paramWebView;
    if (this.b != null) {
      this.b.a(paramString, paramMap);
    }
    if (!"mraid.js".equalsIgnoreCase(new File(paramString).getName())) {
      return super.shouldInterceptRequest(paramWebView, paramString);
    }
    if (localacy.l() != null) {
      localacy.l().o();
    }
    if (localacy.k().e) {
      paramWebView = (String)uf.M.c();
    }
    for (;;)
    {
      try
      {
        paramWebView = a(localacy.getContext(), localacy.o().b, paramWebView);
        return paramWebView;
      }
      catch (InterruptedException paramWebView)
      {
        paramWebView = String.valueOf(paramWebView.getMessage());
        if (paramWebView.length() == 0) {
          continue;
        }
        paramWebView = "Could not fetch MRAID JS. ".concat(paramWebView);
        abr.d(paramWebView);
        return null;
        paramWebView = new String("Could not fetch MRAID JS. ");
        continue;
      }
      catch (ExecutionException paramWebView)
      {
        continue;
      }
      catch (IOException paramWebView)
      {
        continue;
      }
      catch (TimeoutException paramWebView)
      {
        continue;
      }
      if (localacy.p()) {
        paramWebView = (String)uf.L.c();
      } else {
        paramWebView = (String)uf.K.c();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/adj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */