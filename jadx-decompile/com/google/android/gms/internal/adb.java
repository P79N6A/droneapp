package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.g;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@aaa
class adb extends FrameLayout implements acy {
    private static final int a = Color.argb(0, 0, 0, 0);
    private final acy b;
    private final acx c;

    public adb(acy com_google_android_gms_internal_acy) {
        super(com_google_android_gms_internal_acy.getContext());
        this.b = com_google_android_gms_internal_acy;
        this.c = new acx(com_google_android_gms_internal_acy.g(), this, this);
        acz l = this.b.l();
        if (l != null) {
            l.a((acy) this);
        }
        addView(this.b.b());
    }

    public boolean A() {
        return this.b.A();
    }

    public void B() {
        this.b.B();
    }

    public void C() {
        this.b.C();
    }

    public void D() {
        this.b.D();
    }

    public void E() {
        this.b.E();
    }

    public OnClickListener F() {
        return this.b.F();
    }

    @Nullable
    public g G() {
        return this.b.G();
    }

    public void H() {
        setBackgroundColor(a);
        this.b.setBackgroundColor(a);
    }

    public WebView a() {
        return this.b.a();
    }

    public void a(int i) {
        this.b.a(i);
    }

    public void a(Context context) {
        this.b.a(context);
    }

    public void a(Context context, AdSizeParcel adSizeParcel, un unVar) {
        this.c.c();
        this.b.a(context, adSizeParcel, unVar);
    }

    public void a(AdSizeParcel adSizeParcel) {
        this.b.a(adSizeParcel);
    }

    public void a(@Nullable g gVar) {
        this.b.a(gVar);
    }

    public void a(d dVar) {
        this.b.a(dVar);
    }

    public void a(add com_google_android_gms_internal_add) {
        this.b.a(com_google_android_gms_internal_add);
    }

    public void a(tf tfVar, boolean z) {
        this.b.a(tfVar, z);
    }

    public void a(String str) {
        this.b.a(str);
    }

    public void a(String str, vt vtVar) {
        this.b.a(str, vtVar);
    }

    public void a(String str, String str2) {
        this.b.a(str, str2);
    }

    public void a(String str, Map<String, ?> map) {
        this.b.a(str, (Map) map);
    }

    public void a(String str, JSONObject jSONObject) {
        this.b.a(str, jSONObject);
    }

    public void a(boolean z) {
        this.b.a(z);
    }

    public View b() {
        return this;
    }

    public void b(int i) {
        this.b.b(i);
    }

    public void b(d dVar) {
        this.b.b(dVar);
    }

    public void b(String str) {
        this.b.b(str);
    }

    public void b(String str, vt vtVar) {
        this.b.b(str, vtVar);
    }

    public void b(String str, JSONObject jSONObject) {
        this.b.b(str, jSONObject);
    }

    public void b(boolean z) {
        this.b.b(z);
    }

    public void c() {
        this.b.c();
    }

    public void c(boolean z) {
        this.b.c(z);
    }

    public void d() {
        this.b.d();
    }

    public void d(boolean z) {
        this.b.d(z);
    }

    public void destroy() {
        this.b.destroy();
    }

    public void e() {
        this.b.e();
    }

    public Activity f() {
        return this.b.f();
    }

    public Context g() {
        return this.b.g();
    }

    public com.google.android.gms.ads.internal.d h() {
        return this.b.h();
    }

    public d i() {
        return this.b.i();
    }

    public d j() {
        return this.b.j();
    }

    public AdSizeParcel k() {
        return this.b.k();
    }

    public acz l() {
        return this.b.l();
    }

    public void loadData(String str, String str2, String str3) {
        this.b.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(String str) {
        this.b.loadUrl(str);
    }

    public boolean m() {
        return this.b.m();
    }

    public ro n() {
        return this.b.n();
    }

    public VersionInfoParcel o() {
        return this.b.o();
    }

    public void onPause() {
        this.c.b();
        this.b.onPause();
    }

    public void onResume() {
        this.b.onResume();
    }

    public boolean p() {
        return this.b.p();
    }

    public int q() {
        return this.b.q();
    }

    public boolean r() {
        return this.b.r();
    }

    public void s() {
        this.c.c();
        this.b.s();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.b.setOnTouchListener(onTouchListener);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.b.setWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.b.setWebViewClient(webViewClient);
    }

    public void stopLoading() {
        this.b.stopLoading();
    }

    public boolean t() {
        return this.b.t();
    }

    public boolean u() {
        return this.b.u();
    }

    public String v() {
        return this.b.v();
    }

    public acx w() {
        return this.c;
    }

    public ul x() {
        return this.b.x();
    }

    public um y() {
        return this.b.y();
    }

    public add z() {
        return this.b.z();
    }
}
