package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;

@TargetApi(21)
public class abw$h extends abw$g {
    public acz a(acy com_google_android_gms_internal_acy, boolean z) {
        return new adl(com_google_android_gms_internal_acy, z);
    }

    public CookieManager b(Context context) {
        return CookieManager.getInstance();
    }
}
