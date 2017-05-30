package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public final class xh {
    public final List<xg> a;
    public final long b;
    public final List<String> c;
    public final List<String> d;
    public final List<String> e;
    public final List<String> f;
    public final boolean g;
    public final String h;
    public final long i;
    public final String j;
    public final int k;
    public final int l;
    public final long m;
    public final boolean n;
    public int o;
    public int p;

    public xh(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (b.a(2)) {
            String str2 = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            abr.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            xg xgVar = new xg(jSONArray.getJSONObject(i2));
            arrayList.add(xgVar);
            if (i < 0 && a(xgVar)) {
                i = i2;
            }
        }
        this.o = i;
        this.p = jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        this.h = jSONObject.getString("qdata");
        this.l = jSONObject.optInt("fs_model_type", -1);
        this.m = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.c = u.x().a(optJSONObject, "click_urls");
            this.d = u.x().a(optJSONObject, "imp_urls");
            this.e = u.x().a(optJSONObject, "nofill_urls");
            this.f = u.x().a(optJSONObject, "remote_ping_urls");
            this.g = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.i = optLong > 0 ? optLong * 1000 : -1;
            RewardItemParcel a = RewardItemParcel.a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.j = null;
                this.k = 0;
            } else {
                this.j = a.b;
                this.k = a.c;
            }
            this.n = optJSONObject.optBoolean("use_displayed_impression", false);
            return;
        }
        this.b = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.i = -1;
        this.j = null;
        this.k = 0;
        this.n = false;
        this.g = false;
    }

    public xh(List<xg> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.a = list;
        this.b = j;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = z;
        this.h = str;
        this.i = j2;
        this.o = i;
        this.p = i2;
        this.j = str2;
        this.k = i3;
        this.l = i4;
        this.m = j3;
        this.n = z2;
    }

    private boolean a(xg xgVar) {
        for (String equals : xgVar.c) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
