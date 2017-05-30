package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.a.a.e;

@TargetApi(11)
@aaa
public class adj extends acz {
    public adj(acy com_google_android_gms_internal_acy, boolean z) {
        super(com_google_android_gms_internal_acy, z);
    }

    protected WebResourceResponse a(Context context, String str, String str2) {
        Map hashMap = new HashMap();
        hashMap.put(e.Y, u.e().a(context, str));
        hashMap.put("Cache-Control", "max-stale=3600");
        String str3 = (String) new acc(context).a(str2, hashMap).get(60, TimeUnit.SECONDS);
        return str3 == null ? null : new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
    }

    protected WebResourceResponse a(WebView webView, String str, @Nullable Map<String, String> map) {
        Exception e;
        String valueOf;
        if (webView instanceof acy) {
            acy com_google_android_gms_internal_acy = (acy) webView;
            if (this.b != null) {
                this.b.a(str, map);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (com_google_android_gms_internal_acy.l() != null) {
                com_google_android_gms_internal_acy.l().o();
            }
            String str2 = com_google_android_gms_internal_acy.k().e ? (String) uf.M.c() : com_google_android_gms_internal_acy.p() ? (String) uf.L.c() : (String) uf.K.c();
            try {
                return a(com_google_android_gms_internal_acy.getContext(), com_google_android_gms_internal_acy.o().b, str2);
            } catch (IOException e2) {
                e = e2;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                b.d(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            } catch (ExecutionException e3) {
                e = e3;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                b.d(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            } catch (InterruptedException e4) {
                e = e4;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                b.d(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            } catch (TimeoutException e5) {
                e = e5;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                b.d(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            }
        }
        b.d("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return null;
    }
}
