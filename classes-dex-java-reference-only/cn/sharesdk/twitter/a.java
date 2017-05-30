package cn.sharesdk.twitter;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.AuthorizeHelper;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.e;
import cn.sharesdk.framework.utils.d;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.R;

public class a
  extends cn.sharesdk.framework.authorize.b
{
  private boolean d;
  
  public a(e parame)
  {
    super(parame);
  }
  
  public void a(String paramString)
  {
    if (this.d) {}
    Bundle localBundle;
    do
    {
      do
      {
        do
        {
          return;
          this.d = true;
          paramString = b.a(this.a.a().getPlatform()).a(paramString);
          if ((paramString != null) && (paramString.length() > 0)) {
            break;
          }
        } while (this.c == null);
        this.c.onError(new Throwable());
        return;
        paramString = paramString.split("&");
        localBundle = new Bundle();
        int j = paramString.length;
        int i = 0;
        if (i < j)
        {
          String[] arrayOfString = paramString[i];
          if (arrayOfString == null) {}
          for (;;)
          {
            i += 1;
            break;
            arrayOfString = arrayOfString.split("=");
            if (arrayOfString.length >= 2) {
              localBundle.putString(arrayOfString[0], arrayOfString[1]);
            }
          }
        }
        if ((localBundle != null) && (localBundle.size() > 0)) {
          break;
        }
      } while (this.c == null);
      this.c.onError(new Throwable());
      return;
    } while (this.c == null);
    this.c.onComplete(localBundle);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if ((this.b != null) && (paramString.startsWith(this.b)))
    {
      paramWebView.stopLoading();
      this.a.finish();
      new Thread()
      {
        public void run()
        {
          try
          {
            a.this.a(this.a);
            return;
          }
          catch (Throwable localThrowable)
          {
            d.a().d(localThrowable);
          }
        }
      }.start();
    }
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if ((this.b != null) && (paramString.startsWith(this.b)))
    {
      paramWebView.stopLoading();
      this.a.finish();
      new Thread()
      {
        public void run()
        {
          try
          {
            a.this.a(this.a);
            return;
          }
          catch (Throwable localThrowable)
          {
            d.a().d(localThrowable);
          }
        }
      }.start();
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/twitter/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */