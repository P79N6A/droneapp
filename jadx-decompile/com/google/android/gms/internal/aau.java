package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.abi.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@aaa
public class aau extends b implements aay {
    private static final xp l = new xp();
    private final Map<String, abc> m = new HashMap();
    private boolean n;

    public aau(Context context, d dVar, AdSizeParcel adSizeParcel, xq xqVar, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, null, xqVar, versionInfoParcel, dVar);
    }

    private a b(a aVar) {
        abr.e("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String jSONObject = aaf.a(aVar.b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.google.ads.mediation.a.AD_UNIT_ID_PARAMETER, aVar.a.e);
            xg xgVar = new xg(jSONObject, null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
            return new a(aVar.a, aVar.b, new xh(Arrays.asList(new xg[]{xgVar}), -1, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false), aVar.d, aVar.e, aVar.f, aVar.g, aVar.h);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.b("Unable to generate ad state for non-mediated rewarded video.", e);
            return c(aVar);
        }
    }

    private a c(a aVar) {
        return new a(aVar.a, aVar.b, null, aVar.d, 0, aVar.f, aVar.g, aVar.h);
    }

    public void E() {
        com.google.android.gms.common.internal.d.b("showAd must be called on the main UI thread.");
        if (F()) {
            this.n = true;
            abc c = c(this.f.j.q);
            if (c != null && c.a() != null) {
                try {
                    c.a().f();
                    return;
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.b.d("Could not call showVideo.", e);
                    return;
                }
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.b.d("The reward video has not loaded.");
    }

    public boolean F() {
        com.google.android.gms.common.internal.d.b("isLoaded must be called on the main UI thread.");
        return this.f.g == null && this.f.h == null && this.f.j != null && !this.n;
    }

    public void G() {
        a(this.f.j, false);
        r();
    }

    public void H() {
        if (!(this.f.j == null || this.f.j.o == null)) {
            u.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.o.j);
        }
        t();
    }

    public void I() {
        p();
    }

    public void J() {
        e();
    }

    public void K() {
        q();
    }

    public void a(@NonNull Context context) {
        for (abc a : this.m.values()) {
            try {
                a.a().a(f.a((Object) context));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    public void a(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel) {
        com.google.android.gms.common.internal.d.b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(rewardedVideoAdRequestParcel.c)) {
            com.google.android.gms.ads.internal.util.client.b.d("Invalid ad unit id. Aborting.");
            abv.a.post(new 1(this));
            return;
        }
        this.n = false;
        this.f.b = rewardedVideoAdRequestParcel.c;
        super.a(rewardedVideoAdRequestParcel.b);
    }

    public void a(a aVar, un unVar) {
        if (aVar.e != -2) {
            abv.a.post(new 2(this, aVar));
            return;
        }
        this.f.k = aVar;
        if (aVar.c == null) {
            this.f.k = b(aVar);
        }
        this.f.E = 0;
        this.f.h = u.d().a(this.f.c, this.f.k, this);
    }

    protected boolean a(AdRequestParcel adRequestParcel, abi com_google_android_gms_internal_abi, boolean z) {
        return false;
    }

    public boolean a(abi com_google_android_gms_internal_abi, abi com_google_android_gms_internal_abi2) {
        return true;
    }

    public void b() {
        com.google.android.gms.common.internal.d.b("destroy must be called on the main UI thread.");
        for (String str : this.m.keySet()) {
            String str2;
            try {
                abc com_google_android_gms_internal_abc = (abc) this.m.get(str2);
                if (!(com_google_android_gms_internal_abc == null || com_google_android_gms_internal_abc.a() == null)) {
                    com_google_android_gms_internal_abc.a().c();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to destroy adapter: ";
                str2 = String.valueOf(str2);
                com.google.android.gms.ads.internal.util.client.b.d(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    public void b(@Nullable RewardItemParcel rewardItemParcel) {
        if (!(this.f.j == null || this.f.j.o == null)) {
            u.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.o.k);
        }
        if (!(this.f.j == null || this.f.j.r == null || TextUtils.isEmpty(this.f.j.r.j))) {
            rewardItemParcel = new RewardItemParcel(this.f.j.r.j, this.f.j.r.k);
        }
        a(rewardItemParcel);
    }

    @Nullable
    public abc c(String str) {
        abc com_google_android_gms_internal_abc;
        Throwable th;
        String str2;
        String valueOf;
        abc com_google_android_gms_internal_abc2 = (abc) this.m.get(str);
        if (com_google_android_gms_internal_abc2 != null) {
            return com_google_android_gms_internal_abc2;
        }
        try {
            com_google_android_gms_internal_abc = new abc(("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? l : this.j).a(str), this);
            try {
                this.m.put(str, com_google_android_gms_internal_abc);
                return com_google_android_gms_internal_abc;
            } catch (Throwable e) {
                th = e;
                str2 = "Fail to instantiate adapter ";
                valueOf = String.valueOf(str);
                com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
                return com_google_android_gms_internal_abc;
            }
        } catch (Throwable e2) {
            th = e2;
            com_google_android_gms_internal_abc = com_google_android_gms_internal_abc2;
            str2 = "Fail to instantiate adapter ";
            valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
            }
            com.google.android.gms.ads.internal.util.client.b.d(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
            return com_google_android_gms_internal_abc;
        }
    }

    public void c_() {
        com.google.android.gms.common.internal.d.b("resume must be called on the main UI thread.");
        for (String str : this.m.keySet()) {
            String str2;
            try {
                abc com_google_android_gms_internal_abc = (abc) this.m.get(str2);
                if (!(com_google_android_gms_internal_abc == null || com_google_android_gms_internal_abc.a() == null)) {
                    com_google_android_gms_internal_abc.a().e();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to resume adapter: ";
                str2 = String.valueOf(str2);
                com.google.android.gms.ads.internal.util.client.b.d(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    public void d() {
        String valueOf;
        com.google.android.gms.common.internal.d.b("pause must be called on the main UI thread.");
        for (String valueOf2 : this.m.keySet()) {
            try {
                abc com_google_android_gms_internal_abc = (abc) this.m.get(valueOf2);
                if (!(com_google_android_gms_internal_abc == null || com_google_android_gms_internal_abc.a() == null)) {
                    com_google_android_gms_internal_abc.a().d();
                }
            } catch (RemoteException e) {
                String str = "Fail to pause adapter: ";
                valueOf2 = String.valueOf(valueOf2);
                com.google.android.gms.ads.internal.util.client.b.d(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
            }
        }
    }
}
