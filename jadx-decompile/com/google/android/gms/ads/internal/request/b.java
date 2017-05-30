package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abu;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.acs;
import com.google.android.gms.internal.ro;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.xh;
import org.json.JSONObject;

@aaa
public class b extends abq implements com.google.android.gms.ads.internal.request.c.a {
    abx a;
    AdResponseParcel b;
    xh c;
    private final com.google.android.gms.ads.internal.request.a.a d;
    private final com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a e;
    private final Object f = new Object();
    private final Context g;
    private final ro h;
    private AdRequestInfoParcel i;
    private Runnable j;

    @aaa
    static final class a extends Exception {
        private final int a;

        public a(String str, int i) {
            super(str);
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    public b(Context context, com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a aVar, ro roVar, com.google.android.gms.ads.internal.request.a.a aVar2) {
        this.d = aVar2;
        this.g = context;
        this.e = aVar;
        this.h = roVar;
    }

    private void a(int i, String str) {
        if (i == 3 || i == -1) {
            com.google.android.gms.ads.internal.util.client.b.c(str);
        } else {
            com.google.android.gms.ads.internal.util.client.b.d(str);
        }
        if (this.b == null) {
            this.b = new AdResponseParcel(i);
        } else {
            this.b = new AdResponseParcel(i, this.b.k);
        }
        this.d.a(new com.google.android.gms.internal.abi.a(this.i != null ? this.i : new AdRequestInfoParcel(this.e, null, -1), this.b, this.c, null, i, -1, this.b.n, null));
    }

    protected AdSizeParcel a(AdRequestInfoParcel adRequestInfoParcel) {
        int i;
        if (this.b.A) {
            for (AdSizeParcel adSizeParcel : adRequestInfoParcel.d.h) {
                if (adSizeParcel.j) {
                    return new AdSizeParcel(adSizeParcel, adRequestInfoParcel.d.h);
                }
            }
        }
        if (this.b.m == null) {
            throw new a("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.b.m.split("x");
        if (split.length != 2) {
            String str = "Invalid ad size format from the ad response: ";
            String valueOf = String.valueOf(this.b.m);
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (AdSizeParcel adSizeParcel2 : adRequestInfoParcel.d.h) {
                float f = this.g.getResources().getDisplayMetrics().density;
                i = adSizeParcel2.f == -1 ? (int) (((float) adSizeParcel2.g) / f) : adSizeParcel2.f;
                int i2 = adSizeParcel2.c == -2 ? (int) (((float) adSizeParcel2.d) / f) : adSizeParcel2.c;
                if (parseInt == i && parseInt2 == i2 && !adSizeParcel2.j) {
                    return new AdSizeParcel(adSizeParcel2, adRequestInfoParcel.d.h);
                }
            }
            str = "The ad size from the ad response was not one of the requested sizes: ";
            valueOf = String.valueOf(this.b.m);
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        } catch (NumberFormatException e) {
            str = "Invalid ad size number from the ad response: ";
            valueOf = String.valueOf(this.b.m);
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
    }

    abx a(VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel) {
        return c.a(this.g, versionInfoParcel, com_google_android_gms_internal_acr_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, this);
    }

    public void a() {
        com.google.android.gms.ads.internal.util.client.b.a("AdLoaderBackgroundTask started.");
        this.j = new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                synchronized (this.a.f) {
                    if (this.a.a == null) {
                        return;
                    }
                    this.a.b();
                    this.a.a(2, "Timed out waiting for ad response.");
                }
            }
        };
        abv.a.postDelayed(this.j, ((Long) uf.aX.c()).longValue());
        final acr com_google_android_gms_internal_acs = new acs();
        long b = u.k().b();
        abu.a(new Runnable(this) {
            final /* synthetic */ b b;

            public void run() {
                synchronized (this.b.f) {
                    this.b.a = this.b.a(this.b.e.j, com_google_android_gms_internal_acs);
                    if (this.b.a == null) {
                        this.b.a(0, "Could not start the ad request service.");
                        abv.a.removeCallbacks(this.b.j);
                    }
                }
            }
        });
        this.i = new AdRequestInfoParcel(this.e, this.h.a().a(this.g), b);
        com_google_android_gms_internal_acs.a(this.i);
    }

    public void a(@NonNull AdResponseParcel adResponseParcel) {
        com.google.android.gms.ads.internal.util.client.b.a("Received ad response.");
        this.b = adResponseParcel;
        long b = u.k().b();
        synchronized (this.f) {
            this.a = null;
        }
        u.i().b(this.g, this.b.H);
        try {
            if (this.b.e == -2 || this.b.e == -3) {
                JSONObject jSONObject;
                c();
                AdSizeParcel a = this.i.d.h != null ? a(this.i) : null;
                u.i().b(this.b.v);
                if (!TextUtils.isEmpty(this.b.r)) {
                    try {
                        jSONObject = new JSONObject(this.b.r);
                    } catch (Throwable e) {
                        com.google.android.gms.ads.internal.util.client.b.b("Error parsing the JSON for Active View.", e);
                    }
                    this.d.a(new com.google.android.gms.internal.abi.a(this.i, this.b, this.c, a, -2, b, this.b.n, jSONObject));
                    abv.a.removeCallbacks(this.j);
                    return;
                }
                jSONObject = null;
                this.d.a(new com.google.android.gms.internal.abi.a(this.i, this.b, this.c, a, -2, b, this.b.n, jSONObject));
                abv.a.removeCallbacks(this.j);
                return;
            }
            throw new a("There was a problem getting an ad response. ErrorCode: " + this.b.e, this.b.e);
        } catch (a e2) {
            a(e2.a(), e2.getMessage());
            abv.a.removeCallbacks(this.j);
        }
    }

    public void b() {
        synchronized (this.f) {
            if (this.a != null) {
                this.a.d();
            }
        }
    }

    protected void c() {
        if (this.b.e != -3) {
            if (TextUtils.isEmpty(this.b.c)) {
                throw new a("No fill from ad server.", 3);
            }
            u.i().a(this.g, this.b.u);
            if (this.b.h) {
                try {
                    this.c = new xh(this.b.c);
                    u.i().c(this.c.g);
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.b.b("Could not parse mediation config.", e);
                    String str = "Could not parse mediation config: ";
                    String valueOf = String.valueOf(this.b.c);
                    throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
                }
            }
            u.i().c(this.b.K);
            if (!TextUtils.isEmpty(this.b.I) && ((Boolean) uf.cu.c()).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.b.a("Received cookie from server. Setting webview cookie in CookieManager.");
                CookieManager b = u.g().b(this.g);
                if (b != null) {
                    b.setCookie("googleads.g.doubleclick.net", this.b.I);
                }
            }
        }
    }
}
