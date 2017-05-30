package com.fimi.soul.module.login;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fimi.overseas.soul.R;

public class RegisterActivity extends Activity {
    private WebView a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_register);
        this.a = (WebView) findViewById(R.id.web_view);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.a.setWebViewClient(new WebViewClient(this) {
            final /* synthetic */ RegisterActivity a;

            {
                this.a = r1;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
        this.a.loadUrl("https://account.xiaomi.com/pass/register");
    }
}
