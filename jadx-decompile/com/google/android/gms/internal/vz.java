package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

@aaa
public class vz implements vt {
    final HashMap<String, acl<JSONObject>> a = new HashMap();

    public Future<JSONObject> a(String str) {
        Future com_google_android_gms_internal_acl = new acl();
        this.a.put(str, com_google_android_gms_internal_acl);
        return com_google_android_gms_internal_acl;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        a((String) map.get("request_id"), (String) map.get("fetched_ad"));
    }

    public void a(String str, String str2) {
        b.a("Received ad from the cache.");
        acl com_google_android_gms_internal_acl = (acl) this.a.get(str);
        if (com_google_android_gms_internal_acl == null) {
            b.b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            com_google_android_gms_internal_acl.b(new JSONObject(str2));
        } catch (Throwable e) {
            b.b("Failed constructing JSON object from value passed from javascript", e);
            com_google_android_gms_internal_acl.b(null);
        } finally {
            this.a.remove(str);
        }
    }

    public void b(String str) {
        acl com_google_android_gms_internal_acl = (acl) this.a.get(str);
        if (com_google_android_gms_internal_acl == null) {
            b.b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!com_google_android_gms_internal_acl.isDone()) {
            com_google_android_gms_internal_acl.cancel(true);
        }
        this.a.remove(str);
    }
}
