package com.fimi.soul.module.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.ao;

public class ShowTextActivity extends BaseActivity {
    public static final String a = "URL_TITLE";
    public static final String b = "URL_LOCAL";
    public static final String c = "URL_ONLINE";
    private WebView d;
    private Button e;
    private TextView f;

    private void a(Intent intent) {
        String stringExtra = intent.getStringExtra(c);
        String stringExtra2 = intent.getStringExtra(b);
        int intExtra = intent.getIntExtra(a, 0);
        if (intExtra != 0) {
            this.f.setText(intExtra);
        }
        this.e = (Button) findViewById(R.id.backBtn);
        this.e.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ ShowTextActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
        this.d = (WebView) findViewById(R.id.web_view);
        this.d.getSettings().setJavaScriptEnabled(true);
        this.d.getSettings().setDomStorageEnabled(true);
        this.d.setWebViewClient(new WebViewClient(this) {
            final /* synthetic */ ShowTextActivity a;

            {
                this.a = r1;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
        if (ao.b((Context) this)) {
            this.d.loadUrl(stringExtra);
        } else {
            this.d.loadUrl(stringExtra2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_show_text);
        this.f = (TextView) findViewById(R.id.title);
        a(getIntent());
    }
}
