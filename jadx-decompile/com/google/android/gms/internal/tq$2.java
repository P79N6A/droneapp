package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;

class tq$2 implements Runnable {
    ValueCallback<String> a = new ValueCallback<String>(this) {
        final /* synthetic */ tq$2 a;

        {
            this.a = r1;
        }

        public void a(String str) {
            this.a.e.a(this.a.b, this.a.c, str, this.a.d);
        }

        public /* synthetic */ void onReceiveValue(Object obj) {
            a((String) obj);
        }
    };
    final /* synthetic */ tn b;
    final /* synthetic */ WebView c;
    final /* synthetic */ boolean d;
    final /* synthetic */ tq e;

    tq$2(tq tqVar, tn tnVar, WebView webView, boolean z) {
        this.e = tqVar;
        this.b = tnVar;
        this.c = webView;
        this.d = z;
    }

    public void run() {
        if (this.c.getSettings().getJavaScriptEnabled()) {
            try {
                this.c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.a);
            } catch (Throwable th) {
                this.a.onReceiveValue("");
            }
        }
    }
}
