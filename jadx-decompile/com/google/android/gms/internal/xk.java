package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.xl.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class xk implements a {
    private final String a;
    private final xq b;
    private final long c;
    private final xh d;
    private final xg e;
    private AdRequestParcel f;
    private final AdSizeParcel g;
    private final Context h;
    private final Object i = new Object();
    private final VersionInfoParcel j;
    private final boolean k;
    private final NativeAdOptionsParcel l;
    private final List<String> m;
    private final boolean n;
    private xr o;
    private int p = -2;
    private xt q;

    public xk(Context context, String str, xq xqVar, xh xhVar, xg xgVar, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, VersionInfoParcel versionInfoParcel, boolean z, boolean z2, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
        this.h = context;
        this.b = xqVar;
        this.e = xgVar;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.a = b();
        } else {
            this.a = str;
        }
        this.d = xhVar;
        this.c = xhVar.b != -1 ? xhVar.b : NotificationOptions.a;
        this.f = adRequestParcel;
        this.g = adSizeParcel;
        this.j = versionInfoParcel;
        this.k = z;
        this.n = z2;
        this.l = nativeAdOptionsParcel;
        this.m = list;
    }

    private long a(long j, long j2, long j3, long j4) {
        while (this.p == -2) {
            b(j, j2, j3, j4);
        }
        return u.k().b() - j;
    }

    private String a(String str) {
        if (!(str == null || !e() || b(2))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                str = jSONObject.toString();
            } catch (JSONException e) {
                b.d("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    private void a(xj xjVar) {
        String a = a(this.e.i);
        try {
            if (this.j.d < 4100000) {
                if (this.g.e) {
                    this.o.a(f.a(this.h), this.f, a, xjVar);
                } else {
                    this.o.a(f.a(this.h), this.g, this.f, a, xjVar);
                }
            } else if (this.k) {
                this.o.a(f.a(this.h), this.f, a, this.e.a, xjVar, this.l, this.m);
            } else if (this.g.e) {
                this.o.a(f.a(this.h), this.f, a, this.e.a, xjVar);
            } else if (!this.n) {
                this.o.a(f.a(this.h), this.g, this.f, a, this.e.a, xjVar);
            } else if (this.e.l != null) {
                this.o.a(f.a(this.h), this.f, a, this.e.a, xjVar, new NativeAdOptionsParcel(b(this.e.p)), this.e.o);
            } else {
                this.o.a(f.a(this.h), this.g, this.f, a, this.e.a, xjVar);
            }
        } catch (Throwable e) {
            b.d("Could not request ad from mediation adapter.", e);
            a(5);
        }
    }

    private static com.google.android.gms.ads.formats.b b(String str) {
        com.google.android.gms.ads.formats.b.b bVar = new com.google.android.gms.ads.formats.b.b();
        if (str == null) {
            return bVar.a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            bVar.b(jSONObject.optBoolean("multiple_images", false));
            bVar.a(jSONObject.optBoolean("only_urls", false));
            bVar.a(c(jSONObject.optString("native_image_orientation", "any")));
        } catch (Throwable e) {
            b.d("Exception occurred when creating native ad options", e);
        }
        return bVar.a();
    }

    private String b() {
        try {
            if (!TextUtils.isEmpty(this.e.e)) {
                return this.b.b(this.e.e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            b.d("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private void b(long j, long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (elapsedRealtime - j);
        elapsedRealtime = j4 - (elapsedRealtime - j3);
        if (j5 <= 0 || elapsedRealtime <= 0) {
            b.c("Timed out waiting for adapter.");
            this.p = 3;
            return;
        }
        try {
            this.i.wait(Math.min(j5, elapsedRealtime));
        } catch (InterruptedException e) {
            this.p = -1;
        }
    }

    private boolean b(int i) {
        try {
            Bundle l = this.k ? this.o.l() : this.g.e ? this.o.k() : this.o.j();
            if (l == null) {
                return false;
            }
            return (l.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException e) {
            b.d("Could not get adapter info. Returning false");
            return false;
        }
    }

    private static int c(String str) {
        return "landscape".equals(str) ? 2 : "portrait".equals(str) ? 1 : 0;
    }

    private xt c() {
        if (this.p != 0 || !e()) {
            return null;
        }
        try {
            if (!(!b(4) || this.q == null || this.q.a() == 0)) {
                return this.q;
            }
        } catch (RemoteException e) {
            b.d("Could not get cpm value from MediationResponseMetadata");
        }
        return c(f());
    }

    private static xt c(int i) {
        return new 2(i);
    }

    private xr d() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.a);
        b.c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!this.k) {
            if (((Boolean) uf.aV.c()).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                return a(new AdMobAdapter());
            }
            if (((Boolean) uf.aW.c()).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.a)) {
                return a(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.a)) {
                return new xx(new yg());
            }
        }
        try {
            return this.b.a(this.a);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Could not instantiate mediation adapter: ";
            valueOf = String.valueOf(this.a);
            b.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    private boolean e() {
        return this.d.l != -1;
    }

    private int f() {
        if (this.e.i == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.e.i);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException e) {
            b.d("Could not convert to json. Returning 0");
            return 0;
        }
    }

    public xl a(long j, long j2) {
        xl xlVar;
        synchronized (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            xj xjVar = new xj();
            abv.a.post(new 1(this, xjVar));
            xj xjVar2 = xjVar;
            xlVar = new xl(this.e, this.o, this.a, xjVar2, this.p, c(), a(elapsedRealtime, this.c, j, j2));
        }
        return xlVar;
    }

    protected xr a(com.google.android.gms.ads.mediation.b bVar) {
        return new xx(bVar);
    }

    public void a() {
        synchronized (this.i) {
            try {
                if (this.o != null) {
                    this.o.c();
                }
            } catch (Throwable e) {
                b.d("Could not destroy mediation adapter.", e);
            }
            this.p = -1;
            this.i.notify();
        }
    }

    public void a(int i) {
        synchronized (this.i) {
            this.p = i;
            this.i.notify();
        }
    }

    public void a(int i, xt xtVar) {
        synchronized (this.i) {
            this.p = i;
            this.q = xtVar;
            this.i.notify();
        }
    }
}
