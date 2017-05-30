package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@aaa
public class yw implements yu {
    final Set<WebView> a = Collections.synchronizedSet(new HashSet());
    private final Context b;

    public yw(Context context) {
        this.b = context;
    }

    public WebView a() {
        WebView webView = new WebView(this.b);
        webView.getSettings().setJavaScriptEnabled(true);
        return webView;
    }

    public void a(String str, String str2, String str3) {
        b.a("Fetching assets for the given html");
        abv.a.post(new 1(this, str2, str3));
    }
}
