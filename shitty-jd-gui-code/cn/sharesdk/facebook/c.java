package cn.sharesdk.facebook;

import android.os.Bundle;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.b;
import cn.sharesdk.framework.authorize.e;
import cn.sharesdk.framework.utils.d;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.R;

public class c
  extends b
{
  public c(e parame)
  {
    super(parame);
  }
  
  protected void a(String paramString)
  {
    Bundle localBundle = R.urlToBundle(paramString);
    Object localObject2 = localBundle.getString("error_message");
    Object localObject1 = localObject2;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (this.c != null)
      {
        localObject1 = "error_message ==>>" + (String)localObject2 + "\n" + "error_code ==>>" + localBundle.getString("error_code");
        this.c.onError(new Throwable(paramString));
      }
    }
    if (localObject1 == null)
    {
      localObject1 = localBundle.getString("access_token");
      if (!localBundle.containsKey("expires_in")) {
        break label179;
      }
      paramString = localBundle.getString("expires_in");
    }
    for (;;)
    {
      if (this.c != null)
      {
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("oauth_token", (String)localObject1);
        ((Bundle)localObject2).putString("oauth_token_secret", "");
      }
      try
      {
        i = R.parseInt(paramString);
        ((Bundle)localObject2).putInt("oauth_token_expires", i);
        this.c.onComplete((Bundle)localObject2);
        return;
        label179:
        paramString = "-1";
      }
      catch (Throwable paramString)
      {
        for (;;)
        {
          d.a().d(paramString);
          int i = -1;
        }
      }
    }
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.startsWith(this.b))
    {
      paramWebView.stopLoading();
      paramWebView.postDelayed(new Runnable()
      {
        public void run()
        {
          c.a(c.this).finish();
        }
      }, 500L);
      a(paramString);
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/facebook/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */