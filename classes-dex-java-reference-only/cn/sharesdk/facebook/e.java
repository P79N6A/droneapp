package cn.sharesdk.facebook;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.TitleLayout;
import cn.sharesdk.framework.authorize.RegisterView;
import com.mob.tools.FakeActivity;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.R;
import java.io.File;
import java.util.HashMap;

public class e
  extends FakeActivity
{
  private String a;
  private PlatformActionListener b;
  private a c;
  private RegisterView d;
  private WebView e;
  private boolean f;
  private boolean g;
  
  private a b()
  {
    try
    {
      Object localObject = this.activity.getPackageManager().getActivityInfo(this.activity.getComponentName(), 128).metaData.getString("FBWebShareAdapter");
      if ((localObject != null) && (((String)localObject).length() > 0))
      {
        localObject = Class.forName((String)localObject).newInstance();
        if (!(localObject instanceof a)) {
          return null;
        }
        localObject = (a)localObject;
        return (a)localObject;
      }
    }
    catch (Throwable localThrowable)
    {
      cn.sharesdk.framework.utils.d.a().d(localThrowable);
      return null;
    }
    return null;
  }
  
  private void b(String paramString)
  {
    if (paramString == null) {}
    for (String str = "";; str = new String(paramString))
    {
      paramString = R.urlToBundle(paramString);
      if (paramString != null) {
        break;
      }
      this.f = true;
      finish();
      this.b.onError(null, 0, new Throwable("failed to parse callback uri: " + str));
      return;
    }
    str = paramString.getString("post_id");
    HashMap localHashMap = new HashMap();
    if (!TextUtils.isEmpty(str)) {
      localHashMap.put("post_id", str);
    }
    if ((paramString.containsKey("error_code")) || (paramString.containsKey("error")))
    {
      if (this.b != null)
      {
        paramString = R.encodeUrl(paramString);
        this.b.onError(null, 9, new Throwable(paramString));
      }
      this.f = true;
      finish();
      return;
    }
    this.g = true;
    finish();
    this.b.onComplete(null, 0, localHashMap);
  }
  
  protected RegisterView a()
  {
    RegisterView localRegisterView = new RegisterView(this.activity);
    int i = localRegisterView.c().getChildCount();
    localRegisterView.c().getChildAt(i - 1).setVisibility(8);
    localRegisterView.a().setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        new Thread()
        {
          public void run()
          {
            try
            {
              new Instrumentation().sendKeyDownUpSync(4);
              return;
            }
            catch (Throwable localThrowable)
            {
              cn.sharesdk.framework.utils.d.a().d(localThrowable);
              e.this.finish();
              e.a(e.this).onCancel(null, 0);
            }
          }
        }.start();
      }
    });
    this.e = localRegisterView.b();
    WebSettings localWebSettings = this.e.getSettings();
    localWebSettings.setBuiltInZoomControls(true);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setCacheMode(1);
    localWebSettings.setDomStorageEnabled(true);
    localWebSettings.setDatabaseEnabled(true);
    localWebSettings.setSavePassword(false);
    localWebSettings.setDatabasePath(this.activity.getDir("database", 0).getPath());
    this.e.setVerticalScrollBarEnabled(false);
    this.e.setHorizontalScrollBarEnabled(false);
    this.e.setWebViewClient(new cn.sharesdk.framework.d()
    {
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        if ((paramAnonymousString != null) && (paramAnonymousString.startsWith("fbconnect://success"))) {
          e.a(e.this, paramAnonymousString);
        }
        return super.shouldOverrideUrlLoading(paramAnonymousWebView, paramAnonymousString);
      }
    });
    return localRegisterView;
  }
  
  public void a(PlatformActionListener paramPlatformActionListener)
  {
    this.b = paramPlatformActionListener;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void onCreate()
  {
    this.d = a();
    try
    {
      int i = R.getStringRes(getContext(), "ssdk_share_to_facebook");
      if (i > 0) {
        this.d.c().getTvTitle().setText(i);
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        cn.sharesdk.framework.utils.d.a().d(localThrowable);
        this.d.c().setVisibility(8);
      }
      this.d.b().loadUrl(this.a);
    }
    this.c.a(this.d.d());
    this.c.a(this.d.b());
    this.c.a(this.d.c());
    this.c.a();
    this.activity.setContentView(this.d);
    if ("none".equals(DeviceHelper.getInstance(this.activity).getDetailNetworkTypeForStatic()))
    {
      this.f = true;
      finish();
      this.b.onError(null, 0, new Throwable("failed to load webpage, network disconnected."));
      return;
    }
  }
  
  public void onDestroy()
  {
    if ((!this.f) && (!this.g)) {
      this.b.onCancel(null, 0);
    }
    if (this.c != null) {
      this.c.b();
    }
  }
  
  public boolean onFinish()
  {
    if (this.c != null) {
      return this.c.h();
    }
    return super.onFinish();
  }
  
  public void onPause()
  {
    if (this.c != null) {
      this.c.d();
    }
  }
  
  public void onRestart()
  {
    if (this.c != null) {
      this.c.g();
    }
  }
  
  public void onResume()
  {
    if (this.c != null) {
      this.c.e();
    }
  }
  
  public void onStart()
  {
    if (this.c != null) {
      this.c.c();
    }
  }
  
  public void onStop()
  {
    if (this.c != null) {
      this.c.f();
    }
  }
  
  public void setActivity(Activity paramActivity)
  {
    super.setActivity(paramActivity);
    if (this.c == null)
    {
      this.c = b();
      if (this.c == null) {
        this.c = new a();
      }
    }
    this.c.a(paramActivity);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/facebook/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */