package com.fimi.soul.module.social;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.titlebar.FmTitleBar;
import com.mining.app.zxing.activity.MipcaActivityCapture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebViewActivity extends Activity {
    private static final int SCANNIN_GREQUEST_CODE = 1;
    public static final String WEB_TITLE = "title";
    public static final String WEB_URL = "url";
    private ImageView back_btn;
    private int index;
    private FmTitleBar mAbTitleBar;
    WebView mWebView;
    private String main_url;
    private String policy_url = "https://api.jr.mi.com/insurance/insurance_asset.html?source=p0&from=local#/index";
    private Button right_bt;
    private String temp_url;
    private TextView title;
    private String wholeJS;

    private class HelloWebViewClient extends WebViewClient {
        private HelloWebViewClient() {
        }

        public void onPageFinished(WebView webView, String str) {
            webView.loadUrl("javascript:" + WebViewActivity.this.wholeJS);
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            WebViewActivity.this.temp_url = str;
            if (WebViewActivity.this.temp_url.equals(WebViewActivity.this.main_url)) {
                WebViewActivity.this.back_btn.setImageResource(R.drawable.btn_setting_back_selector);
            } else {
                WebViewActivity.this.back_btn.setImageResource(R.drawable.btn_insurance_close_selector);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    private final class InterfaceJS {
        private InterfaceJS() {
        }

        @JavascriptInterface
        public void js2Android() {
            Log.i("zdy", " Test ");
            Intent intent = new Intent();
            intent.setClass(WebViewActivity.this, MipcaActivityCapture.class);
            intent.setFlags(67108864);
            WebViewActivity.this.startActivityForResult(intent, 1);
        }
    }

    public void loadFiileJS() {
        InputStream inputStream = null;
        try {
            inputStream = getAssets().open("insurance.js");
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            this.wholeJS = byteArrayOutputStream.toString();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1:
                if (i2 == -1) {
                    String string = intent.getExtras().getString("result");
                    Log.i("zdy", "mTextView.setText(" + string);
                    this.mWebView.loadUrl("javascript:SnCallback('" + string + "')");
                    return;
                }
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 19) {
            getWindow().setFlags(67108864, 67108864);
            SystemBarTintManager systemBarTintManager = new SystemBarTintManager(this);
            systemBarTintManager.setStatusBarTintEnabled(true);
            systemBarTintManager.setStatusBarTintResource(R.color.list_press);
        }
        setContentView(R.layout.web_view_url);
        this.back_btn = (ImageView) findViewById(R.id.back_btn);
        this.right_bt = (Button) findViewById(R.id.right_bt);
        this.title = (TextView) findViewById(R.id.title);
        ao.a(getAssets(), this.title, this.right_bt);
        loadFiileJS();
        this.back_btn.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                WebViewActivity.this.onGoBack();
            }
        });
        this.right_bt.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                WebViewActivity.this.index = WebViewActivity.this.mWebView.copyBackForwardList().getCurrentIndex();
                WebViewActivity.this.right_bt.setVisibility(4);
                WebViewActivity.this.mWebView.loadUrl(WebViewActivity.this.policy_url);
            }
        });
        this.mWebView = (WebView) findViewById(R.id.web_view);
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.getSettings().setDomStorageEnabled(true);
        this.mWebView.getSettings().setAllowFileAccess(true);
        this.mWebView.getSettings().setBuiltInZoomControls(true);
        this.mWebView.getSettings().setDefaultTextEncodingName("UTF-8");
        this.mWebView.addJavascriptInterface(new InterfaceJS(), "interfacejs");
        this.mWebView.setWebViewClient(new HelloWebViewClient());
        Intent intent = getIntent();
        if (intent != null) {
            stringExtra = intent.getStringExtra("url");
            setTitle(intent.getStringExtra("title"));
        } else {
            stringExtra = null;
        }
        if (stringExtra != null) {
            this.main_url = stringExtra;
            this.mWebView.loadUrl(stringExtra);
            return;
        }
        finish();
    }

    public void onGoBack() {
        if (!this.mWebView.canGoBack()) {
            finish();
        } else if (this.temp_url.equals(this.main_url)) {
            finish();
        } else {
            this.right_bt.setVisibility(0);
            this.mWebView.loadUrl(this.main_url);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.temp_url.equals(this.main_url)) {
            finish();
        } else {
            if (this.index == this.mWebView.copyBackForwardList().getCurrentIndex() - 1) {
                this.right_bt.setVisibility(0);
            }
            this.mWebView.goBack();
        }
        return true;
    }
}
