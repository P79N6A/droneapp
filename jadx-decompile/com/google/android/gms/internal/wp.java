package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.wr.a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

@aaa
public class wp {
    private final Map<wq, wr> a = new HashMap();
    private final LinkedList<wq> b = new LinkedList();
    @Nullable
    private wm c;

    @Nullable
    static Bundle a(AdRequestParcel adRequestParcel) {
        Bundle bundle = adRequestParcel.m;
        return bundle == null ? null : bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    }

    private static void a(Bundle bundle, String str) {
        String[] split = str.split("/", 2);
        if (split.length != 0) {
            String str2 = split[0];
            if (split.length == 1) {
                bundle.remove(str2);
                return;
            }
            Bundle bundle2 = bundle.getBundle(str2);
            if (bundle2 != null) {
                a(bundle2, split[1]);
            }
        }
    }

    private static void a(String str, wq wqVar) {
        if (b.a(2)) {
            abr.e(String.format(str, new Object[]{wqVar}));
        }
    }

    private String[] a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException e) {
            return new String[0];
        }
    }

    static AdRequestParcel b(AdRequestParcel adRequestParcel) {
        AdRequestParcel d = d(adRequestParcel);
        Bundle a = a(d);
        if (a == null) {
            a = new Bundle();
            d.m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", a);
        }
        a.putBoolean("_skipMediation", true);
        return d;
    }

    private boolean b(String str) {
        try {
            return Pattern.matches((String) uf.aC.c(), str);
        } catch (Throwable e) {
            u.i().a(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    static boolean c(AdRequestParcel adRequestParcel) {
        Bundle bundle = adRequestParcel.m;
        if (bundle == null) {
            return false;
        }
        bundle = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle != null && bundle.containsKey("_skipMediation");
    }

    static AdRequestParcel d(AdRequestParcel adRequestParcel) {
        Parcel obtain = Parcel.obtain();
        adRequestParcel.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        AdRequestParcel adRequestParcel2 = (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        AdRequestParcel.a(adRequestParcel2);
        return adRequestParcel2;
    }

    private static AdRequestParcel e(AdRequestParcel adRequestParcel) {
        AdRequestParcel d = d(adRequestParcel);
        for (String a : ((String) uf.ay.c()).split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            a(d.m, a);
        }
        return d;
    }

    private String e() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                stringBuilder.append(Base64.encodeToString(((wq) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    stringBuilder.append("\u0000");
                }
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    @Nullable
    a a(AdRequestParcel adRequestParcel, String str) {
        if (b(str)) {
            return null;
        }
        wr wrVar;
        int i = new aak.a(this.c.a()).a().m;
        AdRequestParcel e = e(adRequestParcel);
        wq wqVar = new wq(e, str, i);
        wr wrVar2 = (wr) this.a.get(wqVar);
        if (wrVar2 == null) {
            a("Interstitial pool created at %s.", wqVar);
            wrVar2 = new wr(e, str, i);
            this.a.put(wqVar, wrVar2);
            wrVar = wrVar2;
        } else {
            wrVar = wrVar2;
        }
        this.b.remove(wqVar);
        this.b.add(wqVar);
        wrVar.g();
        while (this.b.size() > ((Integer) uf.az.c()).intValue()) {
            wq wqVar2 = (wq) this.b.remove();
            wr wrVar3 = (wr) this.a.get(wqVar2);
            a("Evicting interstitial queue for %s.", wqVar2);
            while (wrVar3.d() > 0) {
                wrVar3.a(null).a.I();
            }
            this.a.remove(wqVar2);
        }
        while (wrVar.d() > 0) {
            a a = wrVar.a(e);
            if (!a.e || u.k().a() - a.d <= 1000 * ((long) ((Integer) uf.aB.c()).intValue())) {
                String str2 = a.b != null ? " (inline) " : " ";
                a(new StringBuilder(String.valueOf(str2).length() + 34).append("Pooled interstitial").append(str2).append("returned at %s.").toString(), wqVar);
                return a;
            }
            a("Expired interstitial at %s.", wqVar);
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a() {
        /*
        r9 = this;
        r8 = 2;
        r0 = r9.c;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r0 = r9.a;
        r0 = r0.entrySet();
        r3 = r0.iterator();
    L_0x0010:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0076;
    L_0x0016:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (com.google.android.gms.internal.wq) r1;
        r0 = r0.getValue();
        r0 = (com.google.android.gms.internal.wr) r0;
        r2 = com.google.android.gms.ads.internal.util.client.b.a(r8);
        if (r2 == 0) goto L_0x0056;
    L_0x002e:
        r2 = r0.d();
        r4 = r0.e();
        if (r4 >= r2) goto L_0x0056;
    L_0x0038:
        r5 = "Loading %s/%s pooled interstitials for %s.";
        r6 = 3;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r4 = r2 - r4;
        r4 = java.lang.Integer.valueOf(r4);
        r6[r7] = r4;
        r4 = 1;
        r2 = java.lang.Integer.valueOf(r2);
        r6[r4] = r2;
        r6[r8] = r1;
        r2 = java.lang.String.format(r5, r6);
        com.google.android.gms.internal.abr.e(r2);
    L_0x0056:
        r0.f();
    L_0x0059:
        r4 = r0.d();
        r2 = com.google.android.gms.internal.uf.aA;
        r2 = r2.c();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        if (r4 >= r2) goto L_0x0010;
    L_0x006b:
        r2 = "Pooling and loading one new interstitial for %s.";
        a(r2, r1);
        r2 = r9.c;
        r0.a(r2);
        goto L_0x0059;
    L_0x0076:
        r9.b();
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wp.a():void");
    }

    void a(wm wmVar) {
        if (this.c == null) {
            this.c = wmVar.b();
            c();
        }
    }

    void b() {
        if (this.c != null) {
            Editor edit = this.c.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
            edit.clear();
            for (Entry entry : this.a.entrySet()) {
                wq wqVar = (wq) entry.getKey();
                wr wrVar = (wr) entry.getValue();
                if (wrVar.h()) {
                    edit.putString(wqVar.toString(), new wt(wrVar).a());
                    a("Saved interstitial queue for %s.", wqVar);
                }
            }
            edit.putString("PoolKeys", e());
            edit.apply();
        }
    }

    void b(AdRequestParcel adRequestParcel, String str) {
        if (this.c != null) {
            int i = new aak.a(this.c.a()).a().m;
            AdRequestParcel e = e(adRequestParcel);
            wq wqVar = new wq(e, str, i);
            wr wrVar = (wr) this.a.get(wqVar);
            if (wrVar == null) {
                a("Interstitial pool created at %s.", wqVar);
                wrVar = new wr(e, str, i);
                this.a.put(wqVar, wrVar);
            }
            wrVar.a(this.c, adRequestParcel);
            wrVar.g();
            a("Inline entry added to the queue at %s.", wqVar);
        }
    }

    void c() {
        if (this.c != null) {
            SharedPreferences sharedPreferences = this.c.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
            d();
            try {
                Map hashMap = new HashMap();
                for (Entry entry : sharedPreferences.getAll().entrySet()) {
                    if (!((String) entry.getKey()).equals("PoolKeys")) {
                        wt a = wt.a((String) entry.getValue());
                        wq wqVar = new wq(a.a, a.b, a.c);
                        if (!this.a.containsKey(wqVar)) {
                            this.a.put(wqVar, new wr(a.a, a.b, a.c));
                            hashMap.put(wqVar.toString(), wqVar);
                            a("Restored interstitial queue for %s.", wqVar);
                        }
                    }
                }
                for (Object obj : a(sharedPreferences.getString("PoolKeys", ""))) {
                    wq wqVar2 = (wq) hashMap.get(obj);
                    if (this.a.containsKey(wqVar2)) {
                        this.b.add(wqVar2);
                    }
                }
            } catch (Throwable th) {
                u.i().a(th, "InterstitialAdPool.restore");
                b.d("Malformed preferences value for InterstitialAdPool.", th);
                this.a.clear();
                this.b.clear();
            }
        }
    }

    void d() {
        while (this.b.size() > 0) {
            wq wqVar = (wq) this.b.remove();
            wr wrVar = (wr) this.a.get(wqVar);
            a("Flushing interstitial queue for %s.", wqVar);
            while (wrVar.d() > 0) {
                wrVar.a(null).a.I();
            }
            this.a.remove(wqVar);
        }
    }
}
