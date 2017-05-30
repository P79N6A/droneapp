package com.google.android.gms.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public class abk {
    private final long a;
    private final List<String> b = new ArrayList();
    private final Map<String, b> c = new HashMap();
    private String d;
    private String e;
    private boolean f = false;

    public abk(String str, long j) {
        this.e = str;
        this.a = j;
        a(str);
    }

    private void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f = false;
                    b.d("App settings could not be fetched successfully.");
                    return;
                }
                this.f = true;
                this.d = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        a(optJSONArray.getJSONObject(i));
                    }
                }
            } catch (Throwable e) {
                b.d("Exception occurred while processing app setting json", e);
                u.i().a(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    private void a(JSONObject jSONObject) {
        String optString = jSONObject.optString(FimiMediaMeta.IJKM_KEY_FORMAT);
        CharSequence optString2 = jSONObject.optString("ad_unit_id");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            if ("interstitial".equalsIgnoreCase(optString)) {
                this.b.add(optString2);
            } else if ("rewarded".equalsIgnoreCase(optString)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                if (optJSONObject != null) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("ad_networks");
                    if (optJSONArray != null) {
                        int i = 0;
                        while (i < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray("adapters");
                            if (optJSONArray2 != null) {
                                List arrayList = new ArrayList();
                                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                    arrayList.add(optJSONArray2.getString(i2));
                                }
                                jSONObject2 = jSONObject2.optJSONObject(UriUtil.DATA_SCHEME);
                                if (jSONObject2 != null) {
                                    Bundle bundle = new Bundle();
                                    Iterator keys = jSONObject2.keys();
                                    while (keys.hasNext()) {
                                        optString = (String) keys.next();
                                        bundle.putString(optString, jSONObject2.getString(optString));
                                    }
                                    a aVar = new a(this, arrayList, bundle);
                                    b bVar = this.c.containsKey(optString2) ? (b) this.c.get(optString2) : new b(this);
                                    bVar.a(aVar);
                                    this.c.put(optString2, bVar);
                                    i++;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public long a() {
        return this.a;
    }

    public boolean b() {
        return this.f;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.d;
    }
}
