package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Set;
import java.util.concurrent.Callable;

@TargetApi(11)
public class abw$b extends abw$a {
    public acz a(acy com_google_android_gms_internal_acy, boolean z) {
        return new adh(com_google_android_gms_internal_acy, z);
    }

    public Set<String> a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    public boolean a(Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    public boolean a(final Context context, final WebSettings webSettings) {
        super.a(context, webSettings);
        return ((Boolean) acj.a(new Callable<Boolean>(this) {
            final /* synthetic */ abw$b c;

            public Boolean a() {
                if (context.getCacheDir() != null) {
                    webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                    webSettings.setAppCacheMaxSize(0);
                    webSettings.setAppCacheEnabled(true);
                }
                webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                webSettings.setAllowContentAccess(false);
                return Boolean.valueOf(true);
            }

            public /* synthetic */ Object call() {
                return a();
            }
        })).booleanValue();
    }

    public boolean a(Window window) {
        window.setFlags(ViewCompat.MEASURED_STATE_TOO_SMALL, ViewCompat.MEASURED_STATE_TOO_SMALL);
        return true;
    }

    public boolean b(View view) {
        view.setLayerType(0, null);
        return true;
    }

    public WebChromeClient c(acy com_google_android_gms_internal_acy) {
        return new adg(com_google_android_gms_internal_acy);
    }

    public boolean c(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
