package com.tencent.connect.auth;

import com.tencent.open.a.f;
import com.tencent.tauth.UiError;

class AuthDialog$TimeOutRunable implements Runnable {
    String a = "";
    final /* synthetic */ AuthDialog b;

    public AuthDialog$TimeOutRunable(AuthDialog authDialog, String str) {
        this.b = authDialog;
        this.a = str;
    }

    public void run() {
        f.b(AuthDialog.a(), "-->timeoutUrl: " + this.a + " | mRetryUrl: " + AuthDialog.i(this.b));
        if (this.a.equals(AuthDialog.i(this.b))) {
            AuthDialog.f(this.b).onError(new UiError(9002, "请求页面超时，请稍后重试！", AuthDialog.i(this.b)));
            this.b.dismiss();
        }
    }
}
