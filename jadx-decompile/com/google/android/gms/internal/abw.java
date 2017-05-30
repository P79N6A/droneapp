package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@TargetApi(8)
@aaa
public class abw {
    private abw() {
    }

    public static abw a(int i) {
        return i >= 21 ? new h() : i >= 19 ? new g() : i >= 18 ? new e() : i >= 17 ? new d() : i >= 16 ? new f() : i >= 14 ? new c() : i >= 11 ? new b() : i >= 9 ? new a() : new abw();
    }

    public int a() {
        return 0;
    }

    public Drawable a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public acz a(acy com_google_android_gms_internal_acy, boolean z) {
        return new acz(com_google_android_gms_internal_acy, z);
    }

    public String a(Context context) {
        return "";
    }

    public String a(SslError sslError) {
        return "";
    }

    public Set<String> a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        Set linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public void a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public void a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public void a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public boolean a(Request request) {
        return false;
    }

    public boolean a(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean a(Window window) {
        return false;
    }

    public boolean a(acy com_google_android_gms_internal_acy) {
        if (com_google_android_gms_internal_acy == null) {
            return false;
        }
        com_google_android_gms_internal_acy.onPause();
        return true;
    }

    public int b() {
        return 1;
    }

    public CookieManager b(Context context) {
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable e) {
            b.b("Failed to obtain CookieManager.", e);
            u.i().a(e, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public boolean b(View view) {
        return false;
    }

    public boolean b(acy com_google_android_gms_internal_acy) {
        if (com_google_android_gms_internal_acy == null) {
            return false;
        }
        com_google_android_gms_internal_acy.onResume();
        return true;
    }

    public int c() {
        return 5;
    }

    public WebChromeClient c(acy com_google_android_gms_internal_acy) {
        return null;
    }

    public boolean c(View view) {
        return false;
    }

    public LayoutParams d() {
        return new LayoutParams(-2, -2);
    }
}
