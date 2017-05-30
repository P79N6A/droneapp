package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.u;

@aaa
@TargetApi(11)
public class adg
  extends WebChromeClient
{
  private final acy a;
  
  public adg(acy paramacy)
  {
    this.a = paramacy;
  }
  
  private final Context a(WebView paramWebView)
  {
    if (!(paramWebView instanceof acy)) {
      paramWebView = paramWebView.getContext();
    }
    acy localacy;
    Activity localActivity;
    do
    {
      return paramWebView;
      localacy = (acy)paramWebView;
      localActivity = localacy.f();
      paramWebView = localActivity;
    } while (localActivity != null);
    return localacy.getContext();
  }
  
  private static void a(AlertDialog.Builder paramBuilder, String paramString, JsResult paramJsResult)
  {
    paramBuilder.setMessage(paramString).setPositiveButton(17039370, new adg.3(paramJsResult)).setNegativeButton(17039360, new adg.2(paramJsResult)).setOnCancelListener(new adg.1(paramJsResult)).create().show();
  }
  
  private static void a(Context paramContext, AlertDialog.Builder paramBuilder, String paramString1, String paramString2, JsPromptResult paramJsPromptResult)
  {
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(paramString1);
    paramContext = new EditText(paramContext);
    paramContext.setText(paramString2);
    localLinearLayout.addView(localTextView);
    localLinearLayout.addView(paramContext);
    paramBuilder.setView(localLinearLayout).setPositiveButton(17039370, new adg.6(paramJsPromptResult, paramContext)).setNegativeButton(17039360, new adg.5(paramJsPromptResult)).setOnCancelListener(new adg.4(paramJsPromptResult)).create().show();
  }
  
  private final boolean a()
  {
    return (u.e().a(this.a.getContext().getPackageManager(), this.a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) || (u.e().a(this.a.getContext().getPackageManager(), this.a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION"));
  }
  
  protected final void a(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    d locald = this.a.i();
    if (locald == null)
    {
      abr.d("Could not get ad overlay when showing custom view.");
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    locald.a(paramView, paramCustomViewCallback);
    locald.a(paramInt);
  }
  
  protected boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    try
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
      localBuilder.setTitle(paramString1);
      if (paramBoolean) {
        a(paramContext, localBuilder, paramString2, paramString3, paramJsPromptResult);
      } else {
        a(localBuilder, paramString2, paramJsResult);
      }
    }
    catch (WindowManager.BadTokenException paramContext)
    {
      abr.d("Fail to display Dialog.", paramContext);
    }
    return true;
  }
  
  public final void onCloseWindow(WebView paramWebView)
  {
    if (!(paramWebView instanceof acy))
    {
      abr.d("Tried to close a WebView that wasn't an AdWebView.");
      return;
    }
    paramWebView = ((acy)paramWebView).i();
    if (paramWebView == null)
    {
      abr.d("Tried to close an AdWebView not associated with an overlay.");
      return;
    }
    paramWebView.a();
  }
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str1 = String.valueOf(paramConsoleMessage.message());
    String str2 = String.valueOf(paramConsoleMessage.sourceId());
    int i = paramConsoleMessage.lineNumber();
    str1 = String.valueOf(str1).length() + 19 + String.valueOf(str2).length() + "JS: " + str1 + " (" + str2 + ":" + i + ")";
    if (str1.contains("Application Cache")) {
      return super.onConsoleMessage(paramConsoleMessage);
    }
    switch (adg.7.a[paramConsoleMessage.messageLevel().ordinal()])
    {
    default: 
      abr.c(str1);
    }
    for (;;)
    {
      return super.onConsoleMessage(paramConsoleMessage);
      abr.b(str1);
      continue;
      abr.d(str1);
      continue;
      abr.c(str1);
      continue;
      abr.a(str1);
    }
  }
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView.WebViewTransport localWebViewTransport = (WebView.WebViewTransport)paramMessage.obj;
    paramWebView = new WebView(paramWebView.getContext());
    paramWebView.setWebViewClient(this.a.l());
    localWebViewTransport.setWebView(paramWebView);
    paramMessage.sendToTarget();
    return true;
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l = 5242880L - paramLong3;
    if (l <= 0L)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    if (paramLong1 == 0L) {
      if ((paramLong2 > l) || (paramLong2 > 1048576L)) {}
    }
    for (;;)
    {
      paramQuotaUpdater.updateQuota(paramLong2);
      return;
      paramLong2 = 0L;
      continue;
      if (paramLong2 == 0L)
      {
        paramLong2 = Math.min(Math.min(131072L, l) + paramLong1, 1048576L);
      }
      else
      {
        paramLong3 = paramLong1;
        if (paramLong2 <= Math.min(1048576L - paramLong1, l)) {
          paramLong3 = paramLong1 + paramLong2;
        }
        paramLong2 = paramLong3;
      }
    }
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    if (paramCallback != null) {
      paramCallback.invoke(paramString, a(), true);
    }
  }
  
  public final void onHideCustomView()
  {
    d locald = this.a.i();
    if (locald == null)
    {
      abr.d("Could not get ad overlay when hiding custom view.");
      return;
    }
    locald.b();
  }
  
  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return a(a(paramWebView), paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }
  
  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    paramLong1 = 131072L + paramLong1;
    if (5242880L - paramLong2 < paramLong1)
    {
      paramQuotaUpdater.updateQuota(0L);
      return;
    }
    paramQuotaUpdater.updateQuota(paramLong1);
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    a(paramView, -1, paramCustomViewCallback);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/adg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */