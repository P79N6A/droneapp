package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.utils.a.b.a;
import com.fimi.soul.utils.m;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.tencent.mm.sdk.platformtools.LocaleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.a.a.c.c.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public final class aaf {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    private static Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("runtime_free", Long.toString(bundle.getLong("runtime_free_memory", -1)));
        bundle2.putString("runtime_max", Long.toString(bundle.getLong("runtime_max_memory", -1)));
        bundle2.putString("runtime_total", Long.toString(bundle.getLong("runtime_total_memory", -1)));
        MemoryInfo memoryInfo = (MemoryInfo) bundle.getParcelable("debug_memory_info");
        if (memoryInfo != null) {
            bundle2.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
            bundle2.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
            bundle2.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
            bundle2.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
            bundle2.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
            bundle2.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
            bundle2.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
            bundle2.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
            bundle2.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
        }
        return bundle2;
    }

    public static AdResponseParcel a(Context context, AdRequestInfoParcel adRequestInfoParcel, String str) {
        String optString;
        try {
            String str2;
            JSONObject jSONObject = new JSONObject(str);
            String optString2 = jSONObject.optString("ad_base_url", null);
            Object optString3 = jSONObject.optString("ad_url", null);
            String optString4 = jSONObject.optString("ad_size", null);
            String optString5 = jSONObject.optString("ad_slot_size", optString4);
            boolean z = (adRequestInfoParcel == null || adRequestInfoParcel.m == 0) ? false : true;
            CharSequence optString6 = jSONObject.optString("ad_json", null);
            if (optString6 == null) {
                optString6 = jSONObject.optString("ad_html", null);
            }
            if (optString6 == null) {
                optString6 = jSONObject.optString("body", null);
            }
            long j = -1;
            String optString7 = jSONObject.optString("debug_dialog", null);
            String optString8 = jSONObject.optString("debug_signals", null);
            long j2 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            optString = jSONObject.optString("orientation", null);
            int i = -1;
            if ("portrait".equals(optString)) {
                i = u.g().b();
            } else if ("landscape".equals(optString)) {
                i = u.g().a();
            }
            AdResponseParcel adResponseParcel = null;
            if (!TextUtils.isEmpty(optString6) || TextUtils.isEmpty(optString3)) {
                CharSequence charSequence = optString6;
            } else {
                adResponseParcel = aae.a(adRequestInfoParcel, context, adRequestInfoParcel.k.b, optString3, null, null, null, null);
                optString2 = adResponseParcel.b;
                str2 = adResponseParcel.c;
                j = adResponseParcel.n;
            }
            if (str2 == null) {
                return new AdResponseParcel(0);
            }
            long j3;
            String optString9;
            String str3;
            boolean optBoolean;
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List list = adResponseParcel == null ? null : adResponseParcel.d;
            if (optJSONArray != null) {
                list = a(optJSONArray, list);
            }
            optJSONArray = jSONObject.optJSONArray("impression_urls");
            List list2 = adResponseParcel == null ? null : adResponseParcel.f;
            if (optJSONArray != null) {
                list2 = a(optJSONArray, list2);
            }
            optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
            List list3 = adResponseParcel == null ? null : adResponseParcel.j;
            if (optJSONArray != null) {
                list3 = a(optJSONArray, list3);
            }
            if (adResponseParcel != null) {
                if (adResponseParcel.l != -1) {
                    i = adResponseParcel.l;
                }
                if (adResponseParcel.g > 0) {
                    j3 = adResponseParcel.g;
                    optString9 = jSONObject.optString("active_view");
                    str3 = null;
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                        str3 = jSONObject.optString("ad_passback_url", null);
                    }
                    return new AdResponseParcel(adRequestInfoParcel, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, str3, optString9, jSONObject.optBoolean("custom_render_allowed", false), z, adRequestInfoParcel.p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), FimiMediaMeta.IJKM_KEY_HEIGHT.equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), RewardItemParcel.a(jSONObject.optJSONArray("rewards")), a(jSONObject.optJSONArray("video_start_urls"), null), a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), AutoClickProtectionConfigurationParcel.a(jSONObject.optJSONObject("auto_protection_configuration")), adRequestInfoParcel.I, jSONObject.optString("set_cookie", ""), a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", adRequestInfoParcel.M), optString5, SafeBrowsingConfigParcel.a(jSONObject.optJSONObject("safe_browsing")), optString8);
                }
            }
            j3 = j2;
            optString9 = jSONObject.optString("active_view");
            str3 = null;
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
                str3 = jSONObject.optString("ad_passback_url", null);
            }
            return new AdResponseParcel(adRequestInfoParcel, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, str3, optString9, jSONObject.optBoolean("custom_render_allowed", false), z, adRequestInfoParcel.p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), FimiMediaMeta.IJKM_KEY_HEIGHT.equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), RewardItemParcel.a(jSONObject.optJSONArray("rewards")), a(jSONObject.optJSONArray("video_start_urls"), null), a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), AutoClickProtectionConfigurationParcel.a(jSONObject.optJSONObject("auto_protection_configuration")), adRequestInfoParcel.I, jSONObject.optString("set_cookie", ""), a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", adRequestInfoParcel.M), optString5, SafeBrowsingConfigParcel.a(jSONObject.optJSONObject("safe_browsing")), optString8);
        } catch (JSONException e) {
            String str4 = "Could not parse the inline ad response: ";
            optString = String.valueOf(e.getMessage());
            b.d(optString.length() != 0 ? str4.concat(optString) : new String(str4));
            return new AdResponseParcel(0);
        }
    }

    private static Integer a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static String a(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(ViewCompat.MEASURED_SIZE_MASK & i)});
    }

    private static String a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        switch (nativeAdOptionsParcel != null ? nativeAdOptionsParcel.c : 0) {
            case 1:
                return "portrait";
            case 2:
                return "landscape";
            default:
                return "any";
        }
    }

    @Nullable
    private static List<String> a(@Nullable JSONArray jSONArray, @Nullable List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    @Nullable
    static JSONArray a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    @Nullable
    public static JSONObject a(Context context, aab com_google_android_gms_internal_aab) {
        Object obj;
        String str;
        String valueOf;
        AdRequestInfoParcel adRequestInfoParcel = com_google_android_gms_internal_aab.h;
        Location location = com_google_android_gms_internal_aab.d;
        aak com_google_android_gms_internal_aak = com_google_android_gms_internal_aab.i;
        Bundle bundle = com_google_android_gms_internal_aab.a;
        JSONObject jSONObject = com_google_android_gms_internal_aab.j;
        HashMap hashMap = new HashMap();
        hashMap.put("extra_caps", uf.bE.c());
        if (com_google_android_gms_internal_aab.c.size() > 0) {
            hashMap.put("eid", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, com_google_android_gms_internal_aab.c));
        }
        if (adRequestInfoParcel.b != null) {
            hashMap.put("ad_pos", adRequestInfoParcel.b);
        }
        a(hashMap, adRequestInfoParcel.c);
        if (adRequestInfoParcel.d.h != null) {
            obj = null;
            Object obj2 = null;
            for (AdSizeParcel adSizeParcel : adRequestInfoParcel.d.h) {
                if (!adSizeParcel.j && r3 == null) {
                    hashMap.put(FimiMediaMeta.IJKM_KEY_FORMAT, adSizeParcel.b);
                    obj2 = 1;
                }
                if (adSizeParcel.j && r2 == null) {
                    hashMap.put("fluid", FimiMediaMeta.IJKM_KEY_HEIGHT);
                    obj = 1;
                }
                if (obj2 != null && r2 != null) {
                    break;
                }
            }
        } else {
            hashMap.put(FimiMediaMeta.IJKM_KEY_FORMAT, adRequestInfoParcel.d.b);
            if (adRequestInfoParcel.d.j) {
                hashMap.put("fluid", FimiMediaMeta.IJKM_KEY_HEIGHT);
            }
        }
        if (adRequestInfoParcel.d.f == -1) {
            hashMap.put("smart_w", m.au);
        }
        if (adRequestInfoParcel.d.c == -2) {
            hashMap.put("smart_h", "auto");
        }
        if (adRequestInfoParcel.d.h != null) {
            StringBuilder stringBuilder = new StringBuilder();
            obj = null;
            for (AdSizeParcel adSizeParcel2 : adRequestInfoParcel.d.h) {
                if (adSizeParcel2.j) {
                    obj = 1;
                } else {
                    int i;
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    if (adSizeParcel2.f == -1) {
                        i = (int) (((float) adSizeParcel2.g) / com_google_android_gms_internal_aak.r);
                    } else {
                        try {
                            i = adSizeParcel2.f;
                        } catch (JSONException e) {
                            str = "Problem serializing ad request to JSON: ";
                            valueOf = String.valueOf(e.getMessage());
                            b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                            return null;
                        }
                    }
                    stringBuilder.append(i);
                    stringBuilder.append("x");
                    stringBuilder.append(adSizeParcel2.c == -2 ? (int) (((float) adSizeParcel2.d) / com_google_android_gms_internal_aak.r) : adSizeParcel2.c);
                }
            }
            if (obj != null) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.insert(0, "|");
                }
                stringBuilder.insert(0, "320x50");
            }
            hashMap.put("sz", stringBuilder);
        }
        if (adRequestInfoParcel.m != 0) {
            hashMap.put("native_version", Integer.valueOf(adRequestInfoParcel.m));
            hashMap.put("native_templates", adRequestInfoParcel.n);
            hashMap.put("native_image_orientation", a(adRequestInfoParcel.z));
            if (!adRequestInfoParcel.A.isEmpty()) {
                hashMap.put("native_custom_templates", adRequestInfoParcel.A);
            }
        }
        if (adRequestInfoParcel.d.k) {
            hashMap.put("ene", Boolean.valueOf(true));
        }
        hashMap.put("slotname", adRequestInfoParcel.e);
        hashMap.put("pn", adRequestInfoParcel.f.packageName);
        if (adRequestInfoParcel.g != null) {
            hashMap.put("vc", Integer.valueOf(adRequestInfoParcel.g.versionCode));
        }
        hashMap.put(LocaleUtil.MALAY, com_google_android_gms_internal_aab.g);
        hashMap.put("seq_num", adRequestInfoParcel.i);
        hashMap.put("session_id", adRequestInfoParcel.j);
        hashMap.put("js", adRequestInfoParcel.k.b);
        a(hashMap, com_google_android_gms_internal_aak, com_google_android_gms_internal_aab.e, adRequestInfoParcel.O, com_google_android_gms_internal_aab.b);
        a(hashMap, com_google_android_gms_internal_aab.f);
        hashMap.put(com.tencent.connect.common.Constants.PARAM_PLATFORM, Build.MANUFACTURER);
        hashMap.put("submodel", Build.MODEL);
        if (location != null) {
            a(hashMap, location);
        } else if (adRequestInfoParcel.c.a >= 2 && adRequestInfoParcel.c.k != null) {
            a(hashMap, adRequestInfoParcel.c.k);
        }
        if (adRequestInfoParcel.a >= 2) {
            hashMap.put("quality_signals", adRequestInfoParcel.l);
        }
        if (adRequestInfoParcel.a >= 4 && adRequestInfoParcel.p) {
            hashMap.put("forceHttps", Boolean.valueOf(adRequestInfoParcel.p));
        }
        if (bundle != null) {
            hashMap.put("content_info", bundle);
        }
        if (adRequestInfoParcel.a >= 5) {
            hashMap.put("u_sd", Float.valueOf(adRequestInfoParcel.t));
            hashMap.put("sh", Integer.valueOf(adRequestInfoParcel.s));
            hashMap.put("sw", Integer.valueOf(adRequestInfoParcel.r));
        } else {
            hashMap.put("u_sd", Float.valueOf(com_google_android_gms_internal_aak.r));
            hashMap.put("sh", Integer.valueOf(com_google_android_gms_internal_aak.t));
            hashMap.put("sw", Integer.valueOf(com_google_android_gms_internal_aak.s));
        }
        if (adRequestInfoParcel.a >= 6) {
            if (!TextUtils.isEmpty(adRequestInfoParcel.u)) {
                try {
                    hashMap.put("view_hierarchy", new JSONObject(adRequestInfoParcel.u));
                } catch (Throwable e2) {
                    b.d("Problem serializing view hierarchy to JSON", e2);
                }
            }
            hashMap.put("correlation_id", Long.valueOf(adRequestInfoParcel.v));
        }
        if (adRequestInfoParcel.a >= 7) {
            hashMap.put("request_id", adRequestInfoParcel.w);
        }
        if (adRequestInfoParcel.a >= 11 && adRequestInfoParcel.C != null) {
            hashMap.put("capability", adRequestInfoParcel.C.a());
        }
        if (adRequestInfoParcel.a >= 12 && !TextUtils.isEmpty(adRequestInfoParcel.D)) {
            hashMap.put("anchor", adRequestInfoParcel.D);
        }
        if (adRequestInfoParcel.a >= 13) {
            hashMap.put("android_app_volume", Float.valueOf(adRequestInfoParcel.E));
        }
        if (adRequestInfoParcel.a >= 18) {
            hashMap.put("android_app_muted", Boolean.valueOf(adRequestInfoParcel.K));
        }
        if (adRequestInfoParcel.a >= 14 && adRequestInfoParcel.F > 0) {
            hashMap.put("target_api", Integer.valueOf(adRequestInfoParcel.F));
        }
        if (adRequestInfoParcel.a >= 15) {
            hashMap.put("scroll_index", Integer.valueOf(adRequestInfoParcel.G == -1 ? -1 : adRequestInfoParcel.G));
        }
        if (adRequestInfoParcel.a >= 16) {
            hashMap.put("_activity_context", Boolean.valueOf(adRequestInfoParcel.H));
        }
        if (adRequestInfoParcel.a >= 18) {
            if (!TextUtils.isEmpty(adRequestInfoParcel.L)) {
                try {
                    hashMap.put("app_settings", new JSONObject(adRequestInfoParcel.L));
                } catch (Throwable e22) {
                    b.d("Problem creating json from app settings", e22);
                }
            }
            hashMap.put("render_in_browser", Boolean.valueOf(adRequestInfoParcel.M));
        }
        if (adRequestInfoParcel.a >= 18) {
            hashMap.put("android_num_video_cache_tasks", Integer.valueOf(adRequestInfoParcel.N));
        }
        a(hashMap);
        hashMap.put("cache_state", jSONObject);
        if (adRequestInfoParcel.a >= 19) {
            hashMap.put("gct", adRequestInfoParcel.P);
        }
        if (b.a(2)) {
            str = "Ad Request JSON: ";
            valueOf = String.valueOf(u.e().a((Map) hashMap).toString(2));
            abr.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        return u.e().a((Map) hashMap);
    }

    public static JSONObject a(AdResponseParcel adResponseParcel) {
        JSONObject jSONObject = new JSONObject();
        if (adResponseParcel.b != null) {
            jSONObject.put("ad_base_url", adResponseParcel.b);
        }
        if (adResponseParcel.m != null) {
            jSONObject.put("ad_size", adResponseParcel.m);
        }
        jSONObject.put("native", adResponseParcel.t);
        if (adResponseParcel.t) {
            jSONObject.put("ad_json", adResponseParcel.c);
        } else {
            jSONObject.put("ad_html", adResponseParcel.c);
        }
        if (adResponseParcel.o != null) {
            jSONObject.put("debug_dialog", adResponseParcel.o);
        }
        if (adResponseParcel.N != null) {
            jSONObject.put("debug_signals", adResponseParcel.N);
        }
        if (adResponseParcel.g != -1) {
            jSONObject.put("interstitial_timeout", ((double) adResponseParcel.g) / 1000.0d);
        }
        if (adResponseParcel.l == u.g().b()) {
            jSONObject.put("orientation", "portrait");
        } else if (adResponseParcel.l == u.g().a()) {
            jSONObject.put("orientation", "landscape");
        }
        if (adResponseParcel.d != null) {
            jSONObject.put("click_urls", a(adResponseParcel.d));
        }
        if (adResponseParcel.f != null) {
            jSONObject.put("impression_urls", a(adResponseParcel.f));
        }
        if (adResponseParcel.j != null) {
            jSONObject.put("manual_impression_urls", a(adResponseParcel.j));
        }
        if (adResponseParcel.r != null) {
            jSONObject.put("active_view", adResponseParcel.r);
        }
        jSONObject.put("ad_is_javascript", adResponseParcel.p);
        if (adResponseParcel.q != null) {
            jSONObject.put("ad_passback_url", adResponseParcel.q);
        }
        jSONObject.put("mediation", adResponseParcel.h);
        jSONObject.put("custom_render_allowed", adResponseParcel.s);
        jSONObject.put("content_url_opted_out", adResponseParcel.v);
        jSONObject.put("prefetch", adResponseParcel.w);
        if (adResponseParcel.k != -1) {
            jSONObject.put("refresh_interval_milliseconds", adResponseParcel.k);
        }
        if (adResponseParcel.i != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", adResponseParcel.i);
        }
        if (!TextUtils.isEmpty(adResponseParcel.z)) {
            jSONObject.put("gws_query_id", adResponseParcel.z);
        }
        jSONObject.put("fluid", adResponseParcel.A ? FimiMediaMeta.IJKM_KEY_HEIGHT : "");
        jSONObject.put("native_express", adResponseParcel.B);
        if (adResponseParcel.D != null) {
            jSONObject.put("video_start_urls", a(adResponseParcel.D));
        }
        if (adResponseParcel.E != null) {
            jSONObject.put("video_complete_urls", a(adResponseParcel.E));
        }
        if (adResponseParcel.C != null) {
            jSONObject.put("rewards", adResponseParcel.C.a());
        }
        jSONObject.put("use_displayed_impression", adResponseParcel.F);
        jSONObject.put("auto_protection_configuration", adResponseParcel.G);
        jSONObject.put("render_in_browser", adResponseParcel.K);
        return jSONObject;
    }

    private static void a(HashMap<String, Object> hashMap) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("cl", "133155058");
        bundle2.putString("rapid_rc", "dev");
        bundle2.putString("rapid_rollup", h.a);
        bundle.putBundle("build_meta", bundle2);
        bundle.putString("mf", Boolean.toString(((Boolean) uf.bG.c()).booleanValue()));
        hashMap.put("sdk_env", bundle);
    }

    private static void a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put(a.i, valueOf2);
        hashMap.put("uule", hashMap2);
    }

    private static void a(HashMap<String, Object> hashMap, AdRequestParcel adRequestParcel) {
        String a = abp.a();
        if (a != null) {
            hashMap.put("abf", a);
        }
        if (adRequestParcel.b != -1) {
            hashMap.put("cust_age", a.format(new Date(adRequestParcel.b)));
        }
        if (adRequestParcel.c != null) {
            hashMap.put("extras", adRequestParcel.c);
        }
        if (adRequestParcel.d != -1) {
            hashMap.put("cust_gender", Integer.valueOf(adRequestParcel.d));
        }
        if (adRequestParcel.e != null) {
            hashMap.put("kw", adRequestParcel.e);
        }
        if (adRequestParcel.g != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(adRequestParcel.g));
        }
        if (adRequestParcel.f) {
            hashMap.put("adtest", "on");
        }
        if (adRequestParcel.a >= 2) {
            if (adRequestParcel.h) {
                hashMap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(adRequestParcel.i)) {
                hashMap.put("ppid", adRequestParcel.i);
            }
            if (adRequestParcel.j != null) {
                a((HashMap) hashMap, adRequestParcel.j);
            }
        }
        if (adRequestParcel.a >= 3 && adRequestParcel.l != null) {
            hashMap.put("url", adRequestParcel.l);
        }
        if (adRequestParcel.a >= 5) {
            if (adRequestParcel.n != null) {
                hashMap.put("custom_targeting", adRequestParcel.n);
            }
            if (adRequestParcel.o != null) {
                hashMap.put("category_exclusions", adRequestParcel.o);
            }
            if (adRequestParcel.p != null) {
                hashMap.put("request_agent", adRequestParcel.p);
            }
        }
        if (adRequestParcel.a >= 6 && adRequestParcel.q != null) {
            hashMap.put("request_pkg", adRequestParcel.q);
        }
        if (adRequestParcel.a >= 7) {
            hashMap.put("is_designed_for_families", Boolean.valueOf(adRequestParcel.r));
        }
    }

    private static void a(HashMap<String, Object> hashMap, SearchAdRequestParcel searchAdRequestParcel) {
        Object obj;
        Object obj2 = null;
        if (Color.alpha(searchAdRequestParcel.b) != 0) {
            hashMap.put("acolor", a(searchAdRequestParcel.b));
        }
        if (Color.alpha(searchAdRequestParcel.c) != 0) {
            hashMap.put("bgcolor", a(searchAdRequestParcel.c));
        }
        if (!(Color.alpha(searchAdRequestParcel.d) == 0 || Color.alpha(searchAdRequestParcel.e) == 0)) {
            hashMap.put("gradientto", a(searchAdRequestParcel.d));
            hashMap.put("gradientfrom", a(searchAdRequestParcel.e));
        }
        if (Color.alpha(searchAdRequestParcel.f) != 0) {
            hashMap.put("bcolor", a(searchAdRequestParcel.f));
        }
        hashMap.put("bthick", Integer.toString(searchAdRequestParcel.g));
        switch (searchAdRequestParcel.h) {
            case 0:
                obj = "none";
                break;
            case 1:
                obj = "dashed";
                break;
            case 2:
                obj = "dotted";
                break;
            case 3:
                obj = "solid";
                break;
            default:
                obj = null;
                break;
        }
        if (obj != null) {
            hashMap.put("btype", obj);
        }
        switch (searchAdRequestParcel.i) {
            case 0:
                obj2 = "light";
                break;
            case 1:
                obj2 = "medium";
                break;
            case 2:
                obj2 = "dark";
                break;
        }
        if (obj2 != null) {
            hashMap.put("callbuttoncolor", obj2);
        }
        if (searchAdRequestParcel.j != null) {
            hashMap.put("channel", searchAdRequestParcel.j);
        }
        if (Color.alpha(searchAdRequestParcel.k) != 0) {
            hashMap.put("dcolor", a(searchAdRequestParcel.k));
        }
        if (searchAdRequestParcel.l != null) {
            hashMap.put("font", searchAdRequestParcel.l);
        }
        if (Color.alpha(searchAdRequestParcel.m) != 0) {
            hashMap.put("hcolor", a(searchAdRequestParcel.m));
        }
        hashMap.put("headersize", Integer.toString(searchAdRequestParcel.n));
        if (searchAdRequestParcel.o != null) {
            hashMap.put("q", searchAdRequestParcel.o);
        }
    }

    private static void a(HashMap<String, Object> hashMap, aak com_google_android_gms_internal_aak, aao.a aVar, Bundle bundle, Bundle bundle2) {
        hashMap.put("am", Integer.valueOf(com_google_android_gms_internal_aak.a));
        hashMap.put("cog", a(com_google_android_gms_internal_aak.b));
        hashMap.put("coh", a(com_google_android_gms_internal_aak.c));
        if (!TextUtils.isEmpty(com_google_android_gms_internal_aak.d)) {
            hashMap.put("carrier", com_google_android_gms_internal_aak.d);
        }
        hashMap.put("gl", com_google_android_gms_internal_aak.e);
        if (com_google_android_gms_internal_aak.f) {
            hashMap.put("simulator", Integer.valueOf(1));
        }
        if (com_google_android_gms_internal_aak.g) {
            hashMap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashMap.put("ma", a(com_google_android_gms_internal_aak.h));
        hashMap.put("sp", a(com_google_android_gms_internal_aak.i));
        hashMap.put("hl", com_google_android_gms_internal_aak.j);
        if (!TextUtils.isEmpty(com_google_android_gms_internal_aak.k)) {
            hashMap.put("mv", com_google_android_gms_internal_aak.k);
        }
        hashMap.put("muv", Integer.valueOf(com_google_android_gms_internal_aak.l));
        if (com_google_android_gms_internal_aak.m != -2) {
            hashMap.put("cnt", Integer.valueOf(com_google_android_gms_internal_aak.m));
        }
        hashMap.put("gnt", Integer.valueOf(com_google_android_gms_internal_aak.n));
        hashMap.put(LocaleUtil.PORTUGUESE, Integer.valueOf(com_google_android_gms_internal_aak.o));
        hashMap.put("rm", Integer.valueOf(com_google_android_gms_internal_aak.p));
        hashMap.put("riv", Integer.valueOf(com_google_android_gms_internal_aak.q));
        Bundle bundle3 = new Bundle();
        bundle3.putString("build", com_google_android_gms_internal_aak.y);
        Bundle bundle4 = new Bundle();
        bundle4.putBoolean("is_charging", com_google_android_gms_internal_aak.v);
        bundle4.putDouble("battery_level", com_google_android_gms_internal_aak.u);
        bundle3.putBundle("battery", bundle4);
        bundle4 = new Bundle();
        bundle4.putInt("active_network_state", com_google_android_gms_internal_aak.x);
        bundle4.putBoolean("active_network_metered", com_google_android_gms_internal_aak.w);
        if (aVar != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("predicted_latency_micros", 0);
            bundle5.putLong("predicted_down_throughput_bps", 0);
            bundle5.putLong("predicted_up_throughput_bps", 0);
            bundle4.putBundle("predictions", bundle5);
        }
        bundle3.putBundle("network", bundle4);
        bundle4 = new Bundle();
        bundle4.putBoolean("is_browser_custom_tabs_capable", com_google_android_gms_internal_aak.z);
        bundle3.putBundle("browser", bundle4);
        if (bundle != null) {
            bundle3.putBundle("android_mem_info", a(bundle));
        }
        bundle4 = new Bundle();
        bundle4.putBundle("parental_controls", bundle2);
        bundle3.putBundle("play_store", bundle4);
        hashMap.put("device", bundle3);
    }

    private static void a(HashMap<String, Object> hashMap, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("doritos", str);
        hashMap.put("pii", bundle);
    }
}
