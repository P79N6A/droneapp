package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public final class xg {
    public final String a;
    public final String b;
    public final List<String> c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final List<String> g;
    public final List<String> h;
    public final String i;
    public final List<String> j;
    public final List<String> k;
    @Nullable
    public final String l;
    @Nullable
    public final String m;
    public final String n;
    @Nullable
    public final List<String> o;
    public final String p;

    public xg(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, String str5, String str6, List<String> list4, List<String> list5, String str7, String str8, String str9, List<String> list6, String str10, List<String> list7) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = list2;
        this.g = list3;
        this.i = str5;
        this.j = list4;
        this.k = list5;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = list6;
        this.p = str10;
        this.h = list7;
    }

    public xg(JSONObject jSONObject) {
        String str = null;
        this.b = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.c = Collections.unmodifiableList(arrayList);
        this.d = jSONObject.optString("allocation_id", null);
        this.f = u.x().a(jSONObject, "clickurl");
        this.g = u.x().a(jSONObject, "imp_urls");
        this.h = u.x().a(jSONObject, "fill_urls");
        this.j = u.x().a(jSONObject, "video_start_urls");
        this.k = u.x().a(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(UriUtil.DATA_SCHEME);
        this.i = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.l = jSONObject.optString("html_template", null);
        this.m = jSONObject.optString("ad_base_url", null);
        optJSONObject = jSONObject.optJSONObject("assets");
        this.n = optJSONObject != null ? optJSONObject.toString() : null;
        this.o = u.x().a(jSONObject, "template_ids");
        optJSONObject = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        }
        this.p = str;
    }
}
