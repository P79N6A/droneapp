package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.af;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.am;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abu;
import com.google.android.gms.internal.sy;
import com.google.android.gms.internal.sz;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aaa
public class t extends com.google.android.gms.ads.internal.client.ak.a {
    private final VersionInfoParcel a;
    private final AdSizeParcel b;
    private final Future<sy> c = p();
    private final Context d;
    private final b e;
    @Nullable
    private WebView f = new WebView(this.d);
    @Nullable
    private ag g;
    @Nullable
    private sy h;
    private AsyncTask<Void, Void, Void> i;

    private class a extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ t a;

        private a(t tVar) {
            this.a = tVar;
        }

        protected Void a(Void... voidArr) {
            Throwable e;
            try {
                this.a.h = (sy) this.a.c.get(((Long) uf.cn.c()).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.b.d("Failed to load ad data", e);
            } catch (ExecutionException e3) {
                e = e3;
                com.google.android.gms.ads.internal.util.client.b.d("Failed to load ad data", e);
            } catch (TimeoutException e4) {
                com.google.android.gms.ads.internal.util.client.b.d("Timed out waiting for ad data");
            }
            return null;
        }

        protected void a(Void voidR) {
            String m = this.a.m();
            if (this.a.f != null) {
                this.a.f.loadUrl(m);
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((Void) obj);
        }
    }

    private static class b {
        private final String a;
        private final Map<String, String> b = new TreeMap();
        private String c;
        private String d;

        public b(String str) {
            this.a = str;
        }

        public String a() {
            return this.d;
        }

        public void a(AdRequestParcel adRequestParcel) {
            this.c = adRequestParcel.j.o;
            Bundle bundle = adRequestParcel.m != null ? adRequestParcel.m.getBundle(AdMobAdapter.class.getName()) : null;
            if (bundle != null) {
                String str = (String) uf.cm.c();
                for (String str2 : bundle.keySet()) {
                    if (str.equals(str2)) {
                        this.d = bundle.getString(str2);
                    } else if (str2.startsWith("csa_")) {
                        this.b.put(str2.substring("csa_".length()), bundle.getString(str2));
                    }
                }
            }
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.a;
        }

        public Map<String, String> d() {
            return this.b;
        }
    }

    public t(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel) {
        this.d = context;
        this.a = versionInfoParcel;
        this.b = adSizeParcel;
        this.e = new b(str);
        o();
    }

    private String c(String str) {
        if (this.h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.h.b(parse, this.d);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Unable to process ad data", e);
        } catch (Throwable e2) {
            com.google.android.gms.ads.internal.util.client.b.d("Unable to parse ad click url", e2);
        }
        return parse.toString();
    }

    private void d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.d.startActivity(intent);
    }

    private void o() {
        a(0);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.setWebViewClient(new WebViewClient(this) {
            final /* synthetic */ t a;

            {
                this.a = r1;
            }

            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (this.a.g != null) {
                    try {
                        this.a.g.a(0);
                    } catch (Throwable e) {
                        com.google.android.gms.ads.internal.util.client.b.d("Could not call AdListener.onAdFailedToLoad().", e);
                    }
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.startsWith(this.a.n())) {
                    return false;
                }
                if (str.startsWith((String) uf.ci.c())) {
                    if (this.a.g != null) {
                        try {
                            this.a.g.a(3);
                        } catch (Throwable e) {
                            com.google.android.gms.ads.internal.util.client.b.d("Could not call AdListener.onAdFailedToLoad().", e);
                        }
                    }
                    this.a.a(0);
                    return true;
                } else if (str.startsWith((String) uf.cj.c())) {
                    if (this.a.g != null) {
                        try {
                            this.a.g.a(0);
                        } catch (Throwable e2) {
                            com.google.android.gms.ads.internal.util.client.b.d("Could not call AdListener.onAdFailedToLoad().", e2);
                        }
                    }
                    this.a.a(0);
                    return true;
                } else if (str.startsWith((String) uf.ck.c())) {
                    if (this.a.g != null) {
                        try {
                            this.a.g.c();
                        } catch (Throwable e22) {
                            com.google.android.gms.ads.internal.util.client.b.d("Could not call AdListener.onAdLoaded().", e22);
                        }
                    }
                    this.a.a(this.a.b(str));
                    return true;
                } else if (str.startsWith("gmsg://")) {
                    return true;
                } else {
                    if (this.a.g != null) {
                        try {
                            this.a.g.b();
                        } catch (Throwable e222) {
                            com.google.android.gms.ads.internal.util.client.b.d("Could not call AdListener.onAdLeftApplication().", e222);
                        }
                    }
                    this.a.d(this.a.c(str));
                    return true;
                }
            }
        });
        this.f.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ t a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (this.a.h != null) {
                    try {
                        this.a.h.a(motionEvent);
                    } catch (Throwable e) {
                        com.google.android.gms.ads.internal.util.client.b.d("Unable to process ad data", e);
                    }
                }
                return false;
            }
        });
    }

    private Future<sy> p() {
        return abu.a(new Callable<sy>(this) {
            final /* synthetic */ t a;

            {
                this.a = r1;
            }

            public sy a() {
                return new sy(this.a.a.b, this.a.d, false);
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public e a() {
        d.b("getAdFrame must be called on the main UI thread.");
        return f.a(this.f);
    }

    void a(int i) {
        if (this.f != null) {
            this.f.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    public void a(AdSizeParcel adSizeParcel) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public void a(VideoOptionsParcel videoOptionsParcel) {
        throw new IllegalStateException("Unused method");
    }

    public void a(af afVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(ag agVar) {
        this.g = agVar;
    }

    public void a(am amVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(ao aoVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(com.google.android.gms.ads.internal.reward.client.d dVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(ur urVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(yy yyVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(zd zdVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    public void a(String str) {
        throw new IllegalStateException("Unused method");
    }

    public void a(boolean z) {
    }

    public boolean a(AdRequestParcel adRequestParcel) {
        d.a(this.f, (Object) "This Search Ad has already been torn down");
        this.e.a(adRequestParcel);
        this.i = new a().execute(new Void[0]);
        return true;
    }

    int b(String str) {
        int i = 0;
        Object queryParameter = Uri.parse(str).getQueryParameter(FimiMediaMeta.IJKM_KEY_HEIGHT);
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                i = ac.a().a(this.d, Integer.parseInt(queryParameter));
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    public void b() {
        d.b("destroy must be called on the main UI thread.");
        this.i.cancel(true);
        this.c.cancel(true);
        this.f.destroy();
        this.f = null;
    }

    public boolean c() {
        return false;
    }

    public void c_() {
        d.b("resume must be called on the main UI thread.");
    }

    public void d() {
        d.b("pause must be called on the main UI thread.");
    }

    public void f() {
        throw new IllegalStateException("Unused method");
    }

    public void g_() {
    }

    public void h() {
        throw new IllegalStateException("Unused method");
    }

    public AdSizeParcel i() {
        return this.b;
    }

    @Nullable
    public String j() {
        return null;
    }

    public boolean k() {
        return false;
    }

    @Nullable
    public c l() {
        return null;
    }

    String m() {
        String valueOf;
        Uri a;
        Throwable e;
        String valueOf2;
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) uf.cl.c());
        builder.appendQueryParameter(com.google.android.gms.a.d.b, this.e.b());
        builder.appendQueryParameter("pubId", this.e.c());
        Map d = this.e.d();
        for (String valueOf3 : d.keySet()) {
            builder.appendQueryParameter(valueOf3, (String) d.get(valueOf3));
        }
        Uri build = builder.build();
        if (this.h != null) {
            try {
                a = this.h.a(build, this.d);
            } catch (sz e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.b.d("Unable to process ad data", e);
                a = build;
                valueOf2 = String.valueOf(n());
                valueOf3 = String.valueOf(a.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            } catch (RemoteException e3) {
                e = e3;
                com.google.android.gms.ads.internal.util.client.b.d("Unable to process ad data", e);
                a = build;
                valueOf2 = String.valueOf(n());
                valueOf3 = String.valueOf(a.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            }
            valueOf2 = String.valueOf(n());
            valueOf3 = String.valueOf(a.getEncodedQuery());
            return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
        }
        a = build;
        valueOf2 = String.valueOf(n());
        valueOf3 = String.valueOf(a.getEncodedQuery());
        return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
    }

    String n() {
        String str;
        CharSequence a = this.e.a();
        if (TextUtils.isEmpty(a)) {
            str = "www.google.com";
        } else {
            CharSequence charSequence = a;
        }
        String valueOf = String.valueOf("https://");
        String str2 = (String) uf.cl.c();
        return new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(str).append(str2).toString();
    }
}
