package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.cache.CacheEntryParcel;
import com.google.android.gms.ads.internal.cache.CacheOffering;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.safebrowsing.c;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.iid.a;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@aaa
public class acz extends WebViewClient {
    private static final String[] c = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", a.b, "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] d = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    protected acy a;
    @Nullable
    protected c b;
    private final HashMap<String, List<vt>> e;
    private final Object f;
    private com.google.android.gms.ads.internal.client.a g;
    private g h;
    private a i;
    private b j;
    private vp k;
    private c l;
    private boolean m;
    private vv n;
    private vx o;
    private boolean p;
    private boolean q;
    private OnGlobalLayoutListener r;
    private OnScrollChangedListener s;
    private boolean t;
    private p u;
    private final ym v;
    private e w;
    private yi x;
    private yo y;
    private e z;

    public acz(acy com_google_android_gms_internal_acy, boolean z) {
        this(com_google_android_gms_internal_acy, z, new ym(com_google_android_gms_internal_acy, com_google_android_gms_internal_acy.g(), new tx(com_google_android_gms_internal_acy.getContext())), null);
    }

    acz(acy com_google_android_gms_internal_acy, boolean z, ym ymVar, yi yiVar) {
        this.e = new HashMap();
        this.f = new Object();
        this.m = false;
        this.a = com_google_android_gms_internal_acy;
        this.p = z;
        this.v = ymVar;
        this.x = yiVar;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() != null ? parse.getHost() : "";
    }

    private void a(Context context, String str, String str2, String str3) {
        if (((Boolean) uf.aM.c()).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString(XiaomiOAuthConstants.EXTRA_CODE_2, str2);
            bundle.putString(j.HOST, a(str3));
            u.e().a(context, this.a.o().b, "gmob-apps", bundle, true);
        }
    }

    private static boolean b(Uri uri) {
        String scheme = uri.getScheme();
        return UriUtil.HTTP_SCHEME.equalsIgnoreCase(scheme) || UriUtil.HTTPS_SCHEME.equalsIgnoreCase(scheme);
    }

    private void p() {
        if (this.j != null) {
            this.j.a(this.a);
            this.j = null;
        }
    }

    public e a() {
        return this.w;
    }

    public void a(int i, int i2) {
        if (this.x != null) {
            this.x.c(i, i2);
        }
    }

    public void a(int i, int i2, boolean z) {
        this.v.a(i, i2);
        if (this.x != null) {
            this.x.a(i, i2, z);
        }
    }

    public void a(Uri uri) {
        String path = uri.getPath();
        List<vt> list = (List) this.e.get(path);
        if (list != null) {
            Map a = u.e().a(uri);
            if (b.a(2)) {
                String str = "Received GMSG: ";
                path = String.valueOf(path);
                abr.e(path.length() != 0 ? str.concat(path) : new String(str));
                for (String path2 : a.keySet()) {
                    str = (String) a.get(path2);
                    abr.e(new StringBuilder((String.valueOf(path2).length() + 4) + String.valueOf(str).length()).append("  ").append(path2).append(": ").append(str).toString());
                }
            }
            for (vt a2 : list) {
                a2.a(this.a, a);
            }
            return;
        }
        String valueOf = String.valueOf(uri);
        abr.e(new StringBuilder(String.valueOf(valueOf).length() + 32).append("No GMSG handler found for GMSG: ").append(valueOf).toString());
    }

    public final void a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f) {
            this.q = true;
            this.a.B();
            this.r = onGlobalLayoutListener;
            this.s = onScrollChangedListener;
        }
    }

    public void a(com.google.android.gms.ads.internal.client.a aVar, g gVar, vp vpVar, p pVar, boolean z, vv vvVar, @Nullable vx vxVar, e eVar, yo yoVar, @Nullable c cVar) {
        if (eVar == null) {
            eVar = new e(this.a.getContext());
        }
        this.x = new yi(this.a, yoVar);
        this.b = cVar;
        a("/appEvent", new vo(vpVar));
        a("/backButton", vs.l);
        a("/refresh", vs.m);
        a("/canOpenURLs", vs.b);
        a("/canOpenIntents", vs.c);
        a("/click", vs.d);
        a("/close", vs.e);
        a("/customClose", vs.g);
        a("/instrument", vs.q);
        a("/delayPageLoaded", vs.s);
        a("/delayPageClosed", vs.t);
        a("/getLocationInfo", vs.u);
        a("/httpTrack", vs.h);
        a("/log", vs.i);
        a("/mraid", new wa(eVar, this.x));
        a("/mraidLoaded", this.v);
        a("/open", new wb(vvVar, eVar, this.x));
        a("/precache", vs.p);
        a("/touch", vs.k);
        a("/video", vs.n);
        a("/videoMeta", vs.o);
        a("/appStreaming", vs.f);
        if (vxVar != null) {
            a("/setInterstitialProperties", new vw(vxVar));
        }
        this.g = aVar;
        this.h = gVar;
        this.k = vpVar;
        this.n = vvVar;
        this.u = pVar;
        this.w = eVar;
        this.y = yoVar;
        this.o = vxVar;
        a(z);
    }

    public final void a(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel) {
        g gVar = null;
        boolean p = this.a.p();
        com.google.android.gms.ads.internal.client.a aVar = (!p || this.a.k().e) ? this.g : null;
        if (!p) {
            gVar = this.h;
        }
        a(new AdOverlayInfoParcel(adLauncherIntentInfoParcel, aVar, gVar, this.u, this.a.o()));
    }

    public void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean b = this.x != null ? this.x.b() : false;
        com.google.android.gms.ads.internal.overlay.e c = u.c();
        Context context = this.a.getContext();
        if (!b) {
            z = true;
        }
        c.a(context, adOverlayInfoParcel, z);
        if (this.b != null) {
            String str = adOverlayInfoParcel.m;
            if (str == null && adOverlayInfoParcel.b != null) {
                str = adOverlayInfoParcel.b.c;
            }
            this.b.a(str);
        }
    }

    public void a(acy com_google_android_gms_internal_acy) {
        this.a = com_google_android_gms_internal_acy;
    }

    public void a(a aVar) {
        this.i = aVar;
    }

    public void a(b bVar) {
        this.j = bVar;
    }

    public void a(c cVar) {
        this.l = cVar;
    }

    public void a(e eVar) {
        this.z = eVar;
    }

    public void a(String str, vt vtVar) {
        synchronized (this.f) {
            List list = (List) this.e.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.e.put(str, list);
            }
            list.add(vtVar);
        }
    }

    public void a(boolean z) {
        this.m = z;
    }

    public final void a(boolean z, int i) {
        com.google.android.gms.ads.internal.client.a aVar = (!this.a.p() || this.a.k().e) ? this.g : null;
        a(new AdOverlayInfoParcel(aVar, this.h, this.u, this.a, z, i, this.a.o()));
    }

    public final void a(boolean z, int i, String str) {
        g gVar = null;
        boolean p = this.a.p();
        com.google.android.gms.ads.internal.client.a aVar = (!p || this.a.k().e) ? this.g : null;
        if (!p) {
            gVar = new d(this.a, this.h);
        }
        a(new AdOverlayInfoParcel(aVar, gVar, this.k, this.u, this.a, z, i, str, this.a.o(), this.n));
    }

    public final void a(boolean z, int i, String str, String str2) {
        boolean p = this.a.p();
        com.google.android.gms.ads.internal.client.a aVar = (!p || this.a.k().e) ? this.g : null;
        a(new AdOverlayInfoParcel(aVar, p ? null : new d(this.a, this.h), this.k, this.u, this.a, z, i, str, str2, this.a.o(), this.n));
    }

    public void b(String str, vt vtVar) {
        synchronized (this.f) {
            List list = (List) this.e.get(str);
            if (list == null) {
                return;
            }
            list.remove(vtVar);
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.f) {
            z = this.p;
        }
        return z;
    }

    public boolean c() {
        boolean z;
        synchronized (this.f) {
            z = this.q;
        }
        return z;
    }

    public OnGlobalLayoutListener d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f) {
            onGlobalLayoutListener = this.r;
        }
        return onGlobalLayoutListener;
    }

    public OnScrollChangedListener e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f) {
            onScrollChangedListener = this.s;
        }
        return onScrollChangedListener;
    }

    public boolean f() {
        boolean z;
        synchronized (this.f) {
            z = this.t;
        }
        return z;
    }

    public void g() {
        synchronized (this.f) {
            abr.e("Loading blank page in WebView, 2...");
            this.A = true;
            this.a.a("about:blank");
        }
    }

    public void h() {
        if (this.b != null) {
            abv.a.post(new 1(this));
        }
    }

    public void i() {
        synchronized (this.f) {
            this.t = true;
        }
        this.D++;
        l();
    }

    public void j() {
        this.D--;
        l();
    }

    public void k() {
        this.C = true;
        l();
    }

    public final void l() {
        if (this.i != null && ((this.B && this.D <= 0) || this.C)) {
            this.i.a(this.a, !this.C);
            this.i = null;
        }
        this.a.E();
    }

    public final void m() {
        if (this.b != null) {
            this.b.a();
            this.b = null;
        }
        synchronized (this.f) {
            this.e.clear();
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.m = false;
            this.p = false;
            this.q = false;
            this.t = false;
            this.n = null;
            this.u = null;
            this.l = null;
            if (this.x != null) {
                this.x.a(true);
                this.x = null;
            }
        }
    }

    public e n() {
        return this.z;
    }

    public final void o() {
        synchronized (this.f) {
            this.m = false;
            this.p = true;
            u.e().a(new 2(this));
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        abr.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f) {
            if (this.A) {
                abr.e("Blank page loaded, 1...");
                this.a.s();
                return;
            }
            this.B = true;
            p();
            l();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String valueOf = (i >= 0 || (-i) - 1 >= c.length) ? String.valueOf(i) : c[(-i) - 1];
        a(this.a.getContext(), "http_err", valueOf, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String valueOf = (primaryError < 0 || primaryError >= d.length) ? String.valueOf(primaryError) : d[primaryError];
            a(this.a.getContext(), "ssl_err", valueOf, u.g().a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            CacheOffering a = CacheOffering.a(str);
            if (a == null) {
                return null;
            }
            CacheEntryParcel a2 = u.j().a(a);
            return (a2 == null || !a2.a()) ? null : new WebResourceResponse("", "", a2.b());
        } catch (Throwable th) {
            return null;
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 79:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(str);
        abr.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        } else if (this.m && webView == this.a.a() && b(parse)) {
            if (this.g != null && ((Boolean) uf.ad.c()).booleanValue()) {
                this.g.e();
                if (this.b != null) {
                    this.b.a(str);
                }
                this.g = null;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } else if (this.a.a().willNotDraw()) {
            str2 = "AdWebView unable to handle URL: ";
            valueOf = String.valueOf(str);
            b.d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            Uri uri;
            try {
                ro n = this.a.n();
                if (n != null && n.c(parse)) {
                    parse = n.a(parse, this.a.getContext(), this.a.b());
                }
                uri = parse;
            } catch (rp e) {
                String str3 = "Unable to append parameter to URL: ";
                str2 = String.valueOf(str);
                b.d(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                uri = parse;
            }
            if (this.w == null || this.w.b()) {
                a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.w.a(str);
            }
        }
        return true;
    }
}
