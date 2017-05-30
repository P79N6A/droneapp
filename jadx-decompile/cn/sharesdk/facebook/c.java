package cn.sharesdk.facebook;

import android.os.Bundle;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.b;
import cn.sharesdk.framework.authorize.e;
import cn.sharesdk.framework.utils.d;
import com.mob.tools.utils.R;

public class c extends b {
    public c(e eVar) {
        super(eVar);
    }

    protected void a(String str) {
        Bundle urlToBundle = R.urlToBundle(str);
        String string = urlToBundle.getString("error_message");
        if (!(string == null || this.c == null)) {
            string = "error_message ==>>" + string + "\n" + "error_code ==>>" + urlToBundle.getString("error_code");
            this.c.onError(new Throwable(str));
        }
        if (string == null) {
            String string2 = urlToBundle.getString("access_token");
            string = urlToBundle.containsKey("expires_in") ? urlToBundle.getString("expires_in") : "-1";
            if (this.c != null) {
                int parseInt;
                urlToBundle = new Bundle();
                urlToBundle.putString("oauth_token", string2);
                urlToBundle.putString("oauth_token_secret", "");
                try {
                    parseInt = R.parseInt(string);
                } catch (Throwable th) {
                    d.a().d(th);
                    parseInt = -1;
                }
                urlToBundle.putInt("oauth_token_expires", parseInt);
                this.c.onComplete(urlToBundle);
            }
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(this.b)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        webView.stopLoading();
        webView.postDelayed(new Runnable(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a.finish();
            }
        }, 500);
        a(str);
        return true;
    }
}
