package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import java.util.Map;
import org.json.JSONObject;

class zu$1 extends zt$a {
    final /* synthetic */ zu$b a;
    final /* synthetic */ acl b;
    final /* synthetic */ String c;
    final /* synthetic */ zu d;

    zu$1(zu zuVar, zu$b com_google_android_gms_internal_zu_b, acl com_google_android_gms_internal_acl, String str) {
        this.d = zuVar;
        this.a = com_google_android_gms_internal_zu_b;
        this.b = com_google_android_gms_internal_acl;
        this.c = str;
    }

    public void a() {
        this.b.b(null);
    }

    public void a(final wy wyVar) {
        vt anonymousClass1 = new vt(this) {
            final /* synthetic */ zu$1 b;

            public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
                wyVar.b("/nativeAdPreProcess", this.b.a.a);
                try {
                    String str = (String) map.get("success");
                    if (!TextUtils.isEmpty(str)) {
                        this.b.b.b(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
                        return;
                    }
                } catch (Throwable e) {
                    abr.b("Malformed native JSON response.", e);
                }
                this.b.d.a(0);
                d.a(this.b.d.b(), "Unable to set the ad state error!");
                this.b.b.b(null);
            }
        };
        this.a.a = anonymousClass1;
        wyVar.a("/nativeAdPreProcess", anonymousClass1);
        try {
            JSONObject jSONObject = new JSONObject(zu.a(this.d).b.c);
            jSONObject.put("ads_id", this.c);
            wyVar.a("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        } catch (Throwable e) {
            abr.d("Exception occurred while invoking javascript", e);
            this.b.b(null);
        }
    }
}
