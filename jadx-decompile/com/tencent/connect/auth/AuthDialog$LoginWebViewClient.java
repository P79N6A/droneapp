package com.tencent.connect.auth;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.drive.e;
import com.tencent.open.a.f;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.Util;
import com.tencent.tauth.UiError;
import org.json.JSONObject;

class AuthDialog$LoginWebViewClient extends WebViewClient {
    final /* synthetic */ AuthDialog a;

    private AuthDialog$LoginWebViewClient(AuthDialog authDialog) {
        this.a = authDialog;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        f.b(AuthDialog.a(), "-->onPageFinished, url: " + str);
        AuthDialog.g(this.a).setVisibility(8);
        if (AuthDialog.e(this.a) != null) {
            AuthDialog.e(this.a).setVisibility(0);
        }
        if (!TextUtils.isEmpty(str)) {
            AuthDialog.n(this.a).removeCallbacks((Runnable) AuthDialog.p(this.a).remove(str));
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        f.b(AuthDialog.a(), "-->onPageStarted, url: " + str);
        super.onPageStarted(webView, str, bitmap);
        AuthDialog.g(this.a).setVisibility(0);
        AuthDialog.a(this.a, SystemClock.elapsedRealtime());
        if (!TextUtils.isEmpty(AuthDialog.i(this.a))) {
            AuthDialog.n(this.a).removeCallbacks((Runnable) AuthDialog.p(this.a).remove(AuthDialog.i(this.a)));
        }
        AuthDialog.c(this.a, str);
        Runnable authDialog$TimeOutRunable = new AuthDialog$TimeOutRunable(this.a, AuthDialog.i(this.a));
        AuthDialog.p(this.a).put(str, authDialog$TimeOutRunable);
        AuthDialog.n(this.a).postDelayed(authDialog$TimeOutRunable, 120000);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        f.c(AuthDialog.a(), "-->onReceivedError, errorCode: " + i + " | description: " + str);
        if (!Util.checkNetWork(AuthDialog.a(this.a))) {
            AuthDialog.f(this.a).onError(new UiError(9001, "当前网络不可用，请稍后重试！", str2));
            this.a.dismiss();
        } else if (AuthDialog.i(this.a).startsWith(ServerSetting.DOWNLOAD_QQ_URL)) {
            AuthDialog.f(this.a).onError(new UiError(i, str, str2));
            this.a.dismiss();
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime() - AuthDialog.j(this.a);
            if (AuthDialog.k(this.a) >= 1 || elapsedRealtime >= AuthDialog.l(this.a)) {
                AuthDialog.e(this.a).loadUrl(AuthDialog.o(this.a));
                return;
            }
            AuthDialog.m(this.a);
            AuthDialog.n(this.a).postDelayed(new Runnable(this) {
                final /* synthetic */ AuthDialog$LoginWebViewClient a;

                {
                    this.a = r1;
                }

                public void run() {
                    AuthDialog.e(this.a.a).loadUrl(AuthDialog.i(this.a.a));
                }
            }, 500);
        }
    }

    @TargetApi(8)
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
        AuthDialog.f(this.a).onError(new UiError(sslError.getPrimaryError(), "请求不合法，请检查手机安全设置，如系统时间、代理等。", "ssl error"));
        this.a.dismiss();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f.b(AuthDialog.a(), "-->Redirect URL: " + str);
        if (str.startsWith(AuthConstants.REDIRECT_BROWSER_URI)) {
            JSONObject parseUrlToJson = Util.parseUrlToJson(str);
            AuthDialog.a(this.a, AuthDialog.b(this.a));
            if (!AuthDialog.c(this.a)) {
                if (parseUrlToJson.optString("fail_cb", null) != null) {
                    this.a.callJs(parseUrlToJson.optString("fail_cb"), "");
                } else if (parseUrlToJson.optInt("fall_to_wv") == 1) {
                    AuthDialog.a(this.a, AuthDialog.d(this.a).indexOf("?") > -1 ? "&" : "?");
                    AuthDialog.a(this.a, "browser_error=1");
                    AuthDialog.e(this.a).loadUrl(AuthDialog.d(this.a));
                } else {
                    String optString = parseUrlToJson.optString("redir", null);
                    if (optString != null) {
                        AuthDialog.e(this.a).loadUrl(optString);
                    }
                }
            }
            return true;
        } else if (str.startsWith(ServerSetting.DEFAULT_REDIRECT_URI)) {
            AuthDialog.f(this.a).onComplete(Util.parseUrlToJson(str));
            this.a.dismiss();
            return true;
        } else if (str.startsWith("auth://cancel")) {
            AuthDialog.f(this.a).onCancel();
            this.a.dismiss();
            return true;
        } else if (str.startsWith("auth://close")) {
            this.a.dismiss();
            return true;
        } else if (str.startsWith("download://")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(str.substring("download://".length()))));
                intent.addFlags(e.a_);
                AuthDialog.a(this.a).startActivity(intent);
            } catch (Exception e) {
                f.b(AuthDialog.a(), "-->start download activity exception, e: " + e.getMessage());
            }
            return true;
        } else if (str.startsWith(AuthConstants.PROGRESS_URI)) {
            try {
                r0 = Uri.parse(str).getPathSegments();
                if (r0.isEmpty()) {
                    return true;
                }
                int intValue = Integer.valueOf((String) r0.get(0)).intValue();
                if (intValue == 0) {
                    AuthDialog.g(this.a).setVisibility(8);
                    AuthDialog.e(this.a).setVisibility(0);
                } else if (intValue == 1) {
                    AuthDialog.g(this.a).setVisibility(0);
                }
                return true;
            } catch (Exception e2) {
                return true;
            }
        } else if (str.startsWith(AuthConstants.ON_LOGIN_URI)) {
            try {
                r0 = Uri.parse(str).getPathSegments();
                if (!r0.isEmpty()) {
                    AuthDialog.b(this.a, (String) r0.get(0));
                }
            } catch (Exception e3) {
            }
            return true;
        } else if (AuthDialog.h(this.a).a(AuthDialog.e(this.a), str)) {
            return true;
        } else {
            f.c(AuthDialog.a(), "-->Redirect URL: return false");
            return false;
        }
    }
}
