package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.WebChromeClient;

@TargetApi(14)
public class abw$c extends abw$b {
    public String a(SslError sslError) {
        return sslError.getUrl();
    }

    public WebChromeClient c(acy com_google_android_gms_internal_acy) {
        return new adi(com_google_android_gms_internal_acy);
    }
}
