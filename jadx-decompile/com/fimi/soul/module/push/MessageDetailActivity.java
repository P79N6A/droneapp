package com.fimi.soul.module.push;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.ao;

public class MessageDetailActivity extends BaseActivity {
    protected static final LayoutParams a = new LayoutParams(-1, -1);
    private WebView b;
    private View c;
    private FrameLayout d;
    private CustomViewCallback e;

    static class a extends FrameLayout {
        public a(Context context) {
            super(context);
            setBackgroundColor(context.getResources().getColor(17170444));
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    private void a() {
        ((TextView) findViewById(R.id.tv_settingTitle)).setText(R.string.message_detail);
        ((Button) findViewById(R.id.black_btn)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MessageDetailActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
        this.b = (WebView) findViewById(R.id.web_view);
        this.b.getSettings().setJavaScriptEnabled(true);
        WebSettings settings = this.b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setSupportZoom(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        this.b.setWebViewClient(new WebViewClient(this) {
            final /* synthetic */ MessageDetailActivity a;

            {
                this.a = r1;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
        ao.a(getAssets(), r0, r1);
    }

    protected void onCreate(Bundle bundle) {
        getWindow().setFlags(128, 128);
        super.onCreate(bundle);
        setContentView(R.layout.activity_message_detail);
        a();
        String stringExtra = getIntent().getStringExtra("redirectURL");
        if (stringExtra != null) {
            this.b.loadUrl(stringExtra);
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.b.removeAllViews();
        this.b.destroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        return true;
    }
}
