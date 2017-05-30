package cn.sharesdk.framework.authorize;

import android.webkit.WebView;
import cn.sharesdk.framework.d;

public abstract class b
  extends d
{
  protected e a;
  protected String b;
  protected AuthorizeListener c;
  
  public b(e parame)
  {
    this.a = parame;
    parame = parame.a();
    this.b = parame.getRedirectUri();
    this.c = parame.getAuthorizeListener();
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    paramWebView.stopLoading();
    paramWebView = this.a.a().getAuthorizeListener();
    this.a.finish();
    if (paramWebView != null) {
      paramWebView.onError(new Throwable(paramString1 + " (" + paramInt + "): " + paramString2));
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/framework/authorize/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */