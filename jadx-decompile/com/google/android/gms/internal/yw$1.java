package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class yw$1 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ yw c;

    yw$1(yw ywVar, String str, String str2) {
        this.c = ywVar;
        this.a = str;
        this.b = str2;
    }

    public void run() {
        final WebView a = this.c.a();
        a.setWebViewClient(new WebViewClient(this) {
            final /* synthetic */ yw$1 b;

            public void onPageFinished(WebView webView, String str) {
                abr.a("Loading assets have finished");
                this.b.c.a.remove(a);
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                abr.d("Loading assets have failed.");
                this.b.c.a.remove(a);
            }
        });
        this.c.a.add(a);
        a.loadDataWithBaseURL(this.a, this.b, "text/html", "UTF-8", null);
        abr.a("Fetching assets finished.");
    }
}
