package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.g;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@aaa
public interface acy extends s, tg, wy {
    boolean A();

    void B();

    void E();

    @Nullable
    OnClickListener F();

    g G();

    void H();

    WebView a();

    void a(int i);

    void a(Context context);

    void a(Context context, AdSizeParcel adSizeParcel, un unVar);

    void a(AdSizeParcel adSizeParcel);

    void a(g gVar);

    void a(d dVar);

    void a(add com_google_android_gms_internal_add);

    void a(String str);

    void a(String str, String str2);

    void a(String str, Map<String, ?> map);

    void a(String str, JSONObject jSONObject);

    void a(boolean z);

    View b();

    void b(int i);

    void b(d dVar);

    void b(String str);

    void b(boolean z);

    void c();

    void c(boolean z);

    void d();

    void d(boolean z);

    void destroy();

    void e();

    Activity f();

    Context g();

    Context getContext();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    com.google.android.gms.ads.internal.d h();

    d i();

    d j();

    AdSizeParcel k();

    @Nullable
    acz l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, @Nullable String str5);

    void loadUrl(String str);

    boolean m();

    void measure(int i, int i2);

    ro n();

    VersionInfoParcel o();

    void onPause();

    void onResume();

    boolean p();

    int q();

    boolean r();

    void s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    boolean t();

    boolean u();

    String v();

    @Nullable
    acx w();

    @Nullable
    ul x();

    um y();

    @Nullable
    add z();
}
