package com.fimi.soul.module.insurance;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fimi.overseas.soul.R;

public class ReceiveInsuranceActivity extends Activity {
    public static String a = "https://api.jr.mi.com/insurance/uav.html?from=uav";
    private WebView b;

    private void a() {
        this.b = (WebView) findViewById(R.id.webView);
        String str = "http://baidu.com";
        WebSettings settings = this.b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        this.b.setWebViewClient(new WebViewClient(this) {
            final /* synthetic */ ReceiveInsuranceActivity a;

            {
                this.a = r1;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
        this.b.loadUrl("http://staging.mifi.pt.xiaomi.com/insurance/uav.html");
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receive_insurance);
        a();
    }
}
