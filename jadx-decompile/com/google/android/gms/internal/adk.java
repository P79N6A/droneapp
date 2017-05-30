package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.c;
import java.net.URI;
import java.net.URISyntaxException;

@aaa
public class adk extends WebViewClient {
    private final String a;
    private boolean b = false;
    private final acy c;
    private final zk d;

    public adk(zk zkVar, acy com_google_android_gms_internal_acy, String str) {
        this.a = b(str);
        this.c = com_google_android_gms_internal_acy;
        this.d = zkVar;
    }

    private String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str.endsWith("/")) {
                    str = str.substring(0, str.length() - 1);
                }
            } catch (IndexOutOfBoundsException e) {
                b.b(e.getMessage());
            }
        }
        return str;
    }

    protected boolean a(String str) {
        Object b = b(str);
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        try {
            URI uri = new URI(b);
            if ("passback".equals(uri.getScheme())) {
                b.a("Passback received");
                this.d.b();
                return true;
            } else if (TextUtils.isEmpty(this.a)) {
                return false;
            } else {
                URI uri2 = new URI(this.a);
                String host = uri2.getHost();
                String host2 = uri.getHost();
                String path = uri2.getPath();
                String path2 = uri.getPath();
                if (!c.a(host, host2) || !c.a(path, path2)) {
                    return false;
                }
                b.a("Passback received");
                this.d.b();
                return true;
            }
        } catch (URISyntaxException e) {
            b.b(e.getMessage());
            return false;
        }
    }

    public void onLoadResource(WebView webView, String str) {
        String str2 = "JavascriptAdWebViewClient::onLoadResource: ";
        String valueOf = String.valueOf(str);
        b.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        if (!a(str)) {
            this.c.l().onLoadResource(this.c.a(), str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        String str2 = "JavascriptAdWebViewClient::onPageFinished: ";
        String valueOf = String.valueOf(str);
        b.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        if (!this.b) {
            this.d.a();
            this.b = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "JavascriptAdWebViewClient::shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(str);
        b.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        if (!a(str)) {
            return this.c.l().shouldOverrideUrlLoading(this.c.a(), str);
        }
        b.a("shouldOverrideUrlLoading: received passback url");
        return true;
    }
}
