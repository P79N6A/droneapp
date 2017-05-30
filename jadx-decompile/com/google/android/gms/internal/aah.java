package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@aaa
public final class aah {
    private boolean A = false;
    private String B;
    private List<String> C;
    private boolean D;
    private String E;
    private SafeBrowsingConfigParcel F;
    private final AdRequestInfoParcel G;
    private String a;
    private String b;
    private String c;
    private List<String> d;
    private String e;
    private String f;
    private String g;
    private List<String> h;
    private long i = -1;
    private boolean j = false;
    private final long k = -1;
    private List<String> l;
    private long m = -1;
    private int n = -1;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = true;
    private String s = "";
    private boolean t = false;
    private boolean u = false;
    private RewardItemParcel v;
    private List<String> w;
    private List<String> x;
    private boolean y = false;
    private AutoClickProtectionConfigurationParcel z;

    public aah(AdRequestInfoParcel adRequestInfoParcel) {
        this.G = adRequestInfoParcel;
    }

    private void A(Map<String, List<String>> map) {
        List c = c(map, "X-Afma-Remote-Ping-Urls");
        if (c != null) {
            this.C = c;
        }
    }

    private void B(Map<String, List<String>> map) {
        Object a = a(map, "X-Afma-Auto-Protection-Configuration");
        if (a == null || TextUtils.isEmpty(a)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f);
            }
            boolean booleanValue = ((Boolean) uf.j.c()).booleanValue();
            String[] strArr = new String[1];
            String valueOf = String.valueOf(buildUpon.toString());
            String valueOf2 = String.valueOf("navigationURL");
            strArr[0] = new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append(valueOf).append("&").append(valueOf2).append("={NAVIGATION_URL}").toString();
            this.z = new AutoClickProtectionConfigurationParcel(booleanValue, Arrays.asList(strArr));
            return;
        }
        try {
            this.z = AutoClickProtectionConfigurationParcel.a(new JSONObject(a));
        } catch (Throwable e) {
            b.d("Error parsing configuration JSON", e);
            this.z = new AutoClickProtectionConfigurationParcel();
        }
    }

    private void C(Map<String, List<String>> map) {
        this.B = a(map, "Set-Cookie");
    }

    private void D(Map<String, List<String>> map) {
        Object a = a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a)) {
            try {
                this.F = SafeBrowsingConfigParcel.a(new JSONObject(a));
            } catch (Throwable e) {
                b.d("Error parsing safe browsing header", e);
            }
        }
    }

    static String a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    static long b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                b.d(new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(str2).length()).append("Could not parse float from ").append(str).append(" header: ").append(str2).toString());
            }
        }
        return -1;
    }

    private void b(Map<String, List<String>> map) {
        this.a = a(map, "X-Afma-Ad-Size");
    }

    static List<String> c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private void c(Map<String, List<String>> map) {
        this.E = a(map, "X-Afma-Ad-Slot-Size");
    }

    private void d(Map<String, List<String>> map) {
        List c = c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.d = c;
        }
    }

    private boolean d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty() || !Boolean.valueOf((String) list.get(0)).booleanValue()) ? false : true;
    }

    private void e(Map<String, List<String>> map) {
        this.e = a(map, "X-Afma-Debug-Signals");
    }

    private void f(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f = (String) list.get(0);
        }
    }

    private void g(Map<String, List<String>> map) {
        List c = c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.h = c;
        }
    }

    private void h(Map<String, List<String>> map) {
        long b = b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.i = b;
        }
    }

    private void i(Map<String, List<String>> map) {
        this.g = a(map, "X-Afma-ActiveView");
    }

    private void j(Map<String, List<String>> map) {
        this.p = "native".equals(a(map, "X-Afma-Ad-Format"));
    }

    private void k(Map<String, List<String>> map) {
        this.o |= d(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void l(Map<String, List<String>> map) {
        this.j |= d(map, "X-Afma-Mediation");
    }

    private void m(Map<String, List<String>> map) {
        this.D |= d(map, "X-Afma-Render-In-Browser");
    }

    private void n(Map<String, List<String>> map) {
        List c = c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.l = c;
        }
    }

    private void o(Map<String, List<String>> map) {
        long b = b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.m = b;
        }
    }

    private void p(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.n = u.g().b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.n = u.g().a();
            }
        }
    }

    private void q(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Use-HTTPS");
        if (list != null && !list.isEmpty()) {
            this.q = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void r(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list != null && !list.isEmpty()) {
            this.r = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void s(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Gws-Query-Id");
        if (list != null && !list.isEmpty()) {
            this.s = (String) list.get(0);
        }
    }

    private void t(Map<String, List<String>> map) {
        String a = a(map, "X-Afma-Fluid");
        if (a != null && a.equals(FimiMediaMeta.IJKM_KEY_HEIGHT)) {
            this.t = true;
        }
    }

    private void u(Map<String, List<String>> map) {
        this.u = "native_express".equals(a(map, "X-Afma-Ad-Format"));
    }

    private void v(Map<String, List<String>> map) {
        this.v = RewardItemParcel.a(a(map, "X-Afma-Rewards"));
    }

    private void w(Map<String, List<String>> map) {
        if (this.w == null) {
            this.w = c(map, "X-Afma-Reward-Video-Start-Urls");
        }
    }

    private void x(Map<String, List<String>> map) {
        if (this.x == null) {
            this.x = c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
    }

    private void y(Map<String, List<String>> map) {
        this.y |= d(map, "X-Afma-Use-Displayed-Impression");
    }

    private void z(Map<String, List<String>> map) {
        this.A |= d(map, "X-Afma-Auto-Collect-Location");
    }

    public AdResponseParcel a(long j) {
        return new AdResponseParcel(this.G, this.b, this.c, this.d, this.h, this.i, this.j, -1, this.l, this.m, this.n, this.a, j, this.f, this.g, this.o, this.p, this.q, this.r, false, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.e);
    }

    public void a(String str, Map<String, List<String>> map, String str2) {
        this.b = str;
        this.c = str2;
        a((Map) map);
    }

    public void a(Map<String, List<String>> map) {
        b(map);
        c(map);
        d(map);
        e(map);
        f(map);
        g(map);
        h(map);
        l(map);
        n(map);
        o(map);
        p(map);
        i(map);
        q(map);
        k(map);
        j(map);
        r(map);
        s(map);
        t(map);
        u(map);
        v(map);
        w(map);
        x(map);
        y(map);
        z(map);
        C(map);
        B(map);
        A(map);
        D(map);
        m(map);
    }
}
