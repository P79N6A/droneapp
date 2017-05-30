package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.support.annotation.Nullable;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
@aaa
public class adl extends adj {
    public adl(acy com_google_android_gms_internal_acy, boolean z) {
        super(com_google_android_gms_internal_acy, z);
    }

    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return (webResourceRequest == null || webResourceRequest.getUrl() == null) ? null : a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
