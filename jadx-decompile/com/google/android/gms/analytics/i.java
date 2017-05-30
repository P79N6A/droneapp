package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.u;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adp;
import com.google.android.gms.internal.adq;
import com.google.android.gms.internal.adr;
import com.google.android.gms.internal.ads;
import com.google.android.gms.internal.adt;
import com.google.android.gms.internal.adu;
import com.google.android.gms.internal.adv;
import com.google.android.gms.internal.adw;
import com.google.android.gms.internal.adx;
import com.google.android.gms.internal.ady;
import com.google.android.gms.internal.adz;
import com.google.android.gms.internal.aea;
import com.tencent.stat.DeviceInfo;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class i extends s implements r {
    private static DecimalFormat a;
    private final v b;
    private final String c;
    private final Uri d;
    private final boolean e;
    private final boolean f;

    public i(v vVar, String str) {
        this(vVar, str, true, false);
    }

    public i(v vVar, String str, boolean z, boolean z2) {
        super(vVar);
        d.a(str);
        this.b = vVar;
        this.c = str;
        this.e = z;
        this.f = z2;
        this.d = a(this.c);
    }

    static Uri a(String str) {
        d.a(str);
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    static String a(double d) {
        if (a == null) {
            a = new DecimalFormat("0.######");
        }
        return a.format(d);
    }

    private static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return TextUtils.isEmpty(str) ? null : str;
        } else if (!(obj instanceof Double)) {
            return obj instanceof Boolean ? obj != Boolean.FALSE ? "1" : null : String.valueOf(obj);
        } else {
            Double d = (Double) obj;
            return d.doubleValue() != 0.0d ? a(d.doubleValue()) : null;
        }
    }

    private static String a(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("=");
            stringBuilder.append((String) entry.getValue());
        }
        return stringBuilder.toString();
    }

    private static void a(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, a(d));
        }
    }

    private static void a(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            map.put(str, i + "x" + i2);
        }
    }

    private static void a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    private static void a(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    public static Map<String, String> b(l lVar) {
        CharSequence b;
        Map hashMap = new HashMap();
        ads com_google_android_gms_internal_ads = (ads) lVar.a(ads.class);
        if (com_google_android_gms_internal_ads != null) {
            for (Entry entry : com_google_android_gms_internal_ads.a().entrySet()) {
                String a = a(entry.getValue());
                if (a != null) {
                    hashMap.put((String) entry.getKey(), a);
                }
            }
        }
        adx com_google_android_gms_internal_adx = (adx) lVar.a(adx.class);
        if (com_google_android_gms_internal_adx != null) {
            a(hashMap, "t", com_google_android_gms_internal_adx.a());
            a(hashMap, "cid", com_google_android_gms_internal_adx.b());
            a(hashMap, "uid", com_google_android_gms_internal_adx.c());
            a(hashMap, "sc", com_google_android_gms_internal_adx.f());
            a(hashMap, "sf", com_google_android_gms_internal_adx.h());
            a(hashMap, "ni", com_google_android_gms_internal_adx.g());
            a(hashMap, "adid", com_google_android_gms_internal_adx.d());
            a(hashMap, "ate", com_google_android_gms_internal_adx.e());
        }
        ady com_google_android_gms_internal_ady = (ady) lVar.a(ady.class);
        if (com_google_android_gms_internal_ady != null) {
            a(hashMap, "cd", com_google_android_gms_internal_ady.b());
            a(hashMap, "a", (double) com_google_android_gms_internal_ady.c());
            a(hashMap, "dr", com_google_android_gms_internal_ady.d());
        }
        adv com_google_android_gms_internal_adv = (adv) lVar.a(adv.class);
        if (com_google_android_gms_internal_adv != null) {
            a(hashMap, "ec", com_google_android_gms_internal_adv.a());
            a(hashMap, "ea", com_google_android_gms_internal_adv.b());
            a(hashMap, "el", com_google_android_gms_internal_adv.c());
            a(hashMap, "ev", (double) com_google_android_gms_internal_adv.d());
        }
        adp com_google_android_gms_internal_adp = (adp) lVar.a(adp.class);
        if (com_google_android_gms_internal_adp != null) {
            a(hashMap, "cn", com_google_android_gms_internal_adp.a());
            a(hashMap, "cs", com_google_android_gms_internal_adp.b());
            a(hashMap, "cm", com_google_android_gms_internal_adp.c());
            a(hashMap, "ck", com_google_android_gms_internal_adp.d());
            a(hashMap, "cc", com_google_android_gms_internal_adp.e());
            a(hashMap, "ci", com_google_android_gms_internal_adp.f());
            a(hashMap, "anid", com_google_android_gms_internal_adp.g());
            a(hashMap, "gclid", com_google_android_gms_internal_adp.h());
            a(hashMap, "dclid", com_google_android_gms_internal_adp.i());
            a(hashMap, "aclid", com_google_android_gms_internal_adp.j());
        }
        adw com_google_android_gms_internal_adw = (adw) lVar.a(adw.class);
        if (com_google_android_gms_internal_adw != null) {
            a(hashMap, "exd", com_google_android_gms_internal_adw.a());
            a(hashMap, "exf", com_google_android_gms_internal_adw.b());
        }
        adz com_google_android_gms_internal_adz = (adz) lVar.a(adz.class);
        if (com_google_android_gms_internal_adz != null) {
            a(hashMap, "sn", com_google_android_gms_internal_adz.a());
            a(hashMap, "sa", com_google_android_gms_internal_adz.b());
            a(hashMap, "st", com_google_android_gms_internal_adz.c());
        }
        aea com_google_android_gms_internal_aea = (aea) lVar.a(aea.class);
        if (com_google_android_gms_internal_aea != null) {
            a(hashMap, "utv", com_google_android_gms_internal_aea.a());
            a(hashMap, "utt", (double) com_google_android_gms_internal_aea.b());
            a(hashMap, "utc", com_google_android_gms_internal_aea.c());
            a(hashMap, "utl", com_google_android_gms_internal_aea.d());
        }
        adq com_google_android_gms_internal_adq = (adq) lVar.a(adq.class);
        if (com_google_android_gms_internal_adq != null) {
            for (Entry entry2 : com_google_android_gms_internal_adq.a().entrySet()) {
                b = j.b(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(b)) {
                    hashMap.put(b, (String) entry2.getValue());
                }
            }
        }
        adr com_google_android_gms_internal_adr = (adr) lVar.a(adr.class);
        if (com_google_android_gms_internal_adr != null) {
            for (Entry entry22 : com_google_android_gms_internal_adr.a().entrySet()) {
                b = j.d(((Integer) entry22.getKey()).intValue());
                if (!TextUtils.isEmpty(b)) {
                    hashMap.put(b, a(((Double) entry22.getValue()).doubleValue()));
                }
            }
        }
        adu com_google_android_gms_internal_adu = (adu) lVar.a(adu.class);
        if (com_google_android_gms_internal_adu != null) {
            b a2 = com_google_android_gms_internal_adu.a();
            if (a2 != null) {
                for (Entry entry3 : a2.a().entrySet()) {
                    if (((String) entry3.getKey()).startsWith("&")) {
                        hashMap.put(((String) entry3.getKey()).substring(1), (String) entry3.getValue());
                    } else {
                        hashMap.put((String) entry3.getKey(), (String) entry3.getValue());
                    }
                }
            }
            int i = 1;
            for (c e : com_google_android_gms_internal_adu.d()) {
                hashMap.putAll(e.e(j.h(i)));
                i++;
            }
            i = 1;
            for (a g : com_google_android_gms_internal_adu.b()) {
                hashMap.putAll(g.g(j.f(i)));
                i++;
            }
            i = 1;
            for (Entry entry222 : com_google_android_gms_internal_adu.c().entrySet()) {
                List<a> list = (List) entry222.getValue();
                String k = j.k(i);
                int i2 = 1;
                for (a g2 : list) {
                    String valueOf = String.valueOf(k);
                    String valueOf2 = String.valueOf(j.i(i2));
                    hashMap.putAll(g2.g(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i2++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry222.getKey())) {
                    String valueOf3 = String.valueOf(k);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), (String) entry222.getKey());
                }
                i++;
            }
        }
        adt com_google_android_gms_internal_adt = (adt) lVar.a(adt.class);
        if (com_google_android_gms_internal_adt != null) {
            a(hashMap, "ul", com_google_android_gms_internal_adt.f());
            a(hashMap, "sd", (double) com_google_android_gms_internal_adt.a());
            a(hashMap, "sr", com_google_android_gms_internal_adt.b(), com_google_android_gms_internal_adt.c());
            a(hashMap, "vp", com_google_android_gms_internal_adt.d(), com_google_android_gms_internal_adt.e());
        }
        ado com_google_android_gms_internal_ado = (ado) lVar.a(ado.class);
        if (com_google_android_gms_internal_ado != null) {
            a(hashMap, "an", com_google_android_gms_internal_ado.a());
            a(hashMap, DeviceInfo.TAG_ANDROID_ID, com_google_android_gms_internal_ado.c());
            a(hashMap, "aiid", com_google_android_gms_internal_ado.d());
            a(hashMap, "av", com_google_android_gms_internal_ado.b());
        }
        return hashMap;
    }

    public Uri a() {
        return this.d;
    }

    public void a(l lVar) {
        d.a((Object) lVar);
        d.b(lVar.f(), "Can't deliver not submitted measurement");
        d.c("deliver should be called on worker thread");
        l a = lVar.a();
        adx com_google_android_gms_internal_adx = (adx) a.b(adx.class);
        if (TextUtils.isEmpty(com_google_android_gms_internal_adx.a())) {
            p().a(b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(com_google_android_gms_internal_adx.b())) {
            p().a(b(a), "Ignoring measurement without client id");
        } else if (!this.b.k().f()) {
            double h = com_google_android_gms_internal_adx.h();
            if (p.a(h, com_google_android_gms_internal_adx.b())) {
                b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(h));
                return;
            }
            Map b = b(a);
            b.put("v", "1");
            b.put("_v", u.b);
            b.put("tid", this.c);
            if (this.b.k().e()) {
                c("Dry run is enabled. GoogleAnalytics would have sent", a(b));
                return;
            }
            Map hashMap = new HashMap();
            p.a(hashMap, "uid", com_google_android_gms_internal_adx.c());
            ado com_google_android_gms_internal_ado = (ado) lVar.a(ado.class);
            if (com_google_android_gms_internal_ado != null) {
                p.a(hashMap, "an", com_google_android_gms_internal_ado.a());
                p.a(hashMap, DeviceInfo.TAG_ANDROID_ID, com_google_android_gms_internal_ado.c());
                p.a(hashMap, "av", com_google_android_gms_internal_ado.b());
                p.a(hashMap, "aiid", com_google_android_gms_internal_ado.d());
            }
            b.put("_s", String.valueOf(t().a(new x(0, com_google_android_gms_internal_adx.b(), this.c, !TextUtils.isEmpty(com_google_android_gms_internal_adx.d()), 0, hashMap))));
            t().a(new com.google.android.gms.analytics.internal.c(p(), b, lVar.d(), true));
        }
    }
}
