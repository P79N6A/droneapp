package com.xiaomi.account.openauth;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.xiaomi.account.IXiaomiAuthResponse;
import com.xiaomi.account.XiaomiOAuthResponse;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public abstract class AuthorizeActivityBase
  extends Activity
{
  private static final String AUTHORIZE_PATH = AuthorizeHelper.OAUTH2_HOST + "/oauth2/authorize";
  private static final String KEY_KEEP_COOKIES = "extra_keep_cookies ";
  private static final String KEY_MY_BUNDLE = "extra_my_bundle";
  private static final String KEY_MY_INTENT = "extra_my_intent";
  public static final String KEY_REDIRECT_URI = "redirect_uri";
  private static final String KEY_RESPONSE = "extra_response";
  private static final String KEY_RESULT_CODE = "extra_result_code";
  private static final String LOCALE_KEY_IN_URL = "_locale";
  private static final int REQUEST_CODE = 1001;
  public static int RESULT_CANCEL = 0;
  public static int RESULT_FAIL = 0;
  public static int RESULT_SUCCESS = -1;
  private static final String UTF8 = "UTF-8";
  private boolean mKeepCookies = false;
  private boolean mMiddleActivityMode = false;
  private XiaomiOAuthResponse mResponse;
  private WebSettings mSettings;
  private String mUrl;
  private WebView mWebView;
  
  static
  {
    RESULT_FAIL = 1;
    RESULT_CANCEL = 0;
  }
  
  private Bundle addLocaleIfNeeded(Bundle paramBundle)
  {
    if ((paramBundle == null) || (paramBundle.containsKey("_locale"))) {}
    String str;
    do
    {
      return paramBundle;
      str = getLocaleString(Locale.getDefault());
    } while (TextUtils.isEmpty(str));
    paramBundle.putString("_locale", str);
    return paramBundle;
  }
  
  private void appendPassportUserAgent()
  {
    String str = this.mSettings.getUserAgentString();
    if (!TextUtils.isEmpty(str))
    {
      str = String.format("%s Passport/OAuthSDK/%d.%d", new Object[] { str, Integer.valueOf(1), Integer.valueOf(4) });
      this.mSettings.setUserAgentString(str);
    }
  }
  
  public static Intent asMiddleActivity(Activity paramActivity, int paramInt, Bundle paramBundle, Class<? extends AuthorizeActivityBase> paramClass)
  {
    paramActivity = new Intent(paramActivity, paramClass);
    paramActivity.putExtra("extra_my_bundle", paramBundle);
    paramActivity.putExtra("extra_result_code", paramInt);
    return paramActivity;
  }
  
  public static Intent asMiddleActivity(Activity paramActivity, Intent paramIntent, IXiaomiAuthResponse paramIXiaomiAuthResponse, Class<? extends AuthorizeActivityBase> paramClass)
  {
    paramActivity = new Intent(paramActivity, paramClass);
    paramActivity.putExtra("extra_my_intent", paramIntent);
    paramActivity.putExtra("extra_response", new XiaomiOAuthResponse(paramIXiaomiAuthResponse));
    return paramActivity;
  }
  
  public static Intent getIntent(Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Boolean paramBoolean, boolean paramBoolean1, IXiaomiAuthResponse paramIXiaomiAuthResponse, Class<? extends AuthorizeActivityBase> paramClass)
  {
    paramActivity = new Intent(paramActivity, paramClass);
    paramClass = new Bundle();
    paramClass.putString("client_id", String.valueOf(paramString1));
    paramClass.putString("redirect_uri", paramString2);
    paramClass.putString("response_type", paramString3);
    paramClass.putString("scope", paramString4);
    paramClass.putString("state", paramString5);
    if (paramBoolean != null) {
      paramClass.putString("skip_confirm", String.valueOf(paramBoolean));
    }
    paramActivity.putExtra("url_param", paramClass);
    paramActivity.putExtra("extra_keep_cookies ", paramBoolean1);
    paramActivity.putExtra("extra_response", new XiaomiOAuthResponse(paramIXiaomiAuthResponse));
    return paramActivity;
  }
  
  private static String getLocaleString(Locale paramLocale)
  {
    if (paramLocale == null) {
      paramLocale = null;
    }
    String str1;
    String str2;
    do
    {
      return paramLocale;
      str1 = paramLocale.getLanguage();
      str2 = paramLocale.getCountry();
      paramLocale = str1;
    } while (TextUtils.isEmpty(str2));
    return String.format("%s_%s", new Object[] { str1, str2 });
  }
  
  private String parseBundle(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return "";
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = paramBundle.getString(str1);
      if ((!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str2))) {
        localArrayList.add(new BasicNameValuePair(str1, str2));
      }
    }
    return URLEncodedUtils.format(localArrayList, "UTF-8");
  }
  
  private Bundle parseUrl(String paramString)
  {
    localBundle = new Bundle();
    if (paramString != null) {
      try
      {
        paramString = URLEncodedUtils.parse(new URI(paramString), "UTF-8").iterator();
        while (paramString.hasNext())
        {
          NameValuePair localNameValuePair = (NameValuePair)paramString.next();
          if ((!TextUtils.isEmpty(localNameValuePair.getName())) && (!TextUtils.isEmpty(localNameValuePair.getValue()))) {
            localBundle.putString(localNameValuePair.getName(), localNameValuePair.getValue());
          }
        }
        return localBundle;
      }
      catch (URISyntaxException paramString)
      {
        Log.e("openauth", paramString.getMessage());
      }
    }
  }
  
  private void removeCookiesIfNeeded()
  {
    if (!this.mKeepCookies)
    {
      CookieSyncManager.createInstance(this);
      CookieManager.getInstance().removeAllCookie();
    }
  }
  
  protected final WebView getWebView()
  {
    return this.mWebView;
  }
  
  protected final boolean isMiddleActivityMode()
  {
    return this.mMiddleActivityMode;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1001) {
      if (paramIntent == null) {
        break label23;
      }
    }
    label23:
    for (paramIntent = paramIntent.getExtras();; paramIntent = null)
    {
      setResultAndFinish(paramInt2, paramIntent);
      return;
    }
  }
  
  public void onBackPressed()
  {
    if (this.mWebView.canGoBack())
    {
      this.mWebView.goBack();
      return;
    }
    setResultAndFinish(RESULT_CANCEL, (Bundle)null);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!new ParcelableAttackGuardian().safeCheck(this))
    {
      finish();
      return;
    }
    paramBundle = getIntent();
    Object localObject = paramBundle.getBundleExtra("extra_my_bundle");
    if (localObject != null)
    {
      setResultAndFinish(paramBundle.getIntExtra("extra_result_code", -1), (Bundle)localObject);
      return;
    }
    this.mResponse = ((XiaomiOAuthResponse)paramBundle.getParcelableExtra("extra_response"));
    localObject = (Intent)paramBundle.getParcelableExtra("extra_my_intent");
    if (localObject != null)
    {
      startActivityForResult((Intent)localObject, 1001);
      this.mMiddleActivityMode = true;
      return;
    }
    this.mKeepCookies = paramBundle.getBooleanExtra("extra_keep_cookies ", false);
    this.mWebView = new WebView(this);
    this.mSettings = this.mWebView.getSettings();
    this.mSettings.setJavaScriptEnabled(true);
    this.mSettings.setSavePassword(false);
    this.mSettings.setSaveFormData(false);
    paramBundle = addLocaleIfNeeded(paramBundle.getBundleExtra("url_param"));
    this.mUrl = (AUTHORIZE_PATH + "?" + parseBundle(paramBundle));
    removeCookiesIfNeeded();
    appendPassportUserAgent();
    refreshWebView(false);
    paramBundle = paramBundle.getString("redirect_uri");
    this.mWebView.setWebViewClient(new AuthorizeWebViewClient(paramBundle));
    this.mWebView.setWebChromeClient(new WebChromeClient()
    {
      public void onProgressChanged(WebView paramAnonymousWebView, int paramAnonymousInt)
      {
        AuthorizeActivityBase.this.onUpdateProgress(paramAnonymousInt);
      }
    });
  }
  
  protected abstract void onHideErrorUI();
  
  protected abstract void onHideProgress();
  
  protected abstract void onShowErrorUI();
  
  protected abstract void onShowProgress();
  
  protected abstract void onUpdateProgress(int paramInt);
  
  protected final void refreshWebView()
  {
    refreshWebView(true);
  }
  
  protected final void refreshWebView(boolean paramBoolean)
  {
    this.mWebView.loadUrl(this.mUrl);
    if (paramBoolean)
    {
      onHideErrorUI();
      return;
    }
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public void run()
      {
        AuthorizeActivityBase.this.onHideErrorUI();
      }
    });
  }
  
  void setResultAndFinish(int paramInt, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    setResult(paramInt, localIntent);
    if (this.mResponse != null)
    {
      if (paramInt != 0) {
        break label51;
      }
      this.mResponse.onCancel();
    }
    for (;;)
    {
      removeCookiesIfNeeded();
      finish();
      return;
      label51:
      this.mResponse.onResult(paramBundle);
    }
  }
  
  void setResultAndFinish(int paramInt, String paramString)
  {
    setResultAndFinish(paramInt, parseUrl(paramString));
  }
  
  class AuthorizeWebViewClient
    extends WebViewClient
  {
    private final String mRedirectUrlOf3rdPartyApp;
    
    AuthorizeWebViewClient(String paramString)
    {
      this.mRedirectUrlOf3rdPartyApp = paramString;
    }
    
    public void onPageFinished(WebView paramWebView, String paramString)
    {
      AuthorizeActivityBase.this.onHideProgress();
      super.onPageFinished(paramWebView, paramString);
    }
    
    public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      AuthorizeActivityBase.this.onShowProgress();
      super.onPageStarted(paramWebView, paramString, paramBitmap);
    }
    
    public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      AuthorizeActivityBase.this.onShowErrorUI();
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    }
    
    public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
    {
      AuthorizeActivityBase.this.onShowErrorUI();
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
    }
    
    public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
    {
      if ((this.mRedirectUrlOf3rdPartyApp != null) && (!paramString.toLowerCase().startsWith(this.mRedirectUrlOf3rdPartyApp.toLowerCase()))) {
        return super.shouldOverrideUrlLoading(paramWebView, paramString);
      }
      String str1 = new String(paramString);
      int i = str1.indexOf('?');
      String str2;
      if (i > 0)
      {
        str2 = str1.substring(i + 1);
        if ((str2.startsWith("code=")) || (str2.contains("&code=")))
        {
          AuthorizeActivityBase.this.setResultAndFinish(AuthorizeActivityBase.RESULT_SUCCESS, str1);
          return true;
        }
        if ((str2.startsWith("error=")) || (str2.contains("&error=")))
        {
          AuthorizeActivityBase.this.setResultAndFinish(AuthorizeActivityBase.RESULT_FAIL, str1);
          return true;
        }
      }
      else
      {
        i = str1.indexOf('#');
        if (i > 0)
        {
          str2 = str1.substring(i + 1);
          if ((str2.startsWith("access_token=")) || (str2.contains("&access_token=")))
          {
            AuthorizeActivityBase.this.setResultAndFinish(AuthorizeActivityBase.RESULT_SUCCESS, str1.replace("#", "?"));
            return true;
          }
          if ((str2.startsWith("error=")) || (str2.contains("&error=")))
          {
            AuthorizeActivityBase.this.setResultAndFinish(AuthorizeActivityBase.RESULT_FAIL, str1.replace("#", "?"));
            return true;
          }
        }
      }
      return super.shouldOverrideUrlLoading(paramWebView, paramString);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/account/openauth/AuthorizeActivityBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */