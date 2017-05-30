package com.google.android.gms.internal;

import java.util.Map;
import org.json.JSONObject;

class vu$1 implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ acy b;
    final /* synthetic */ vu c;

    vu$1(vu vuVar, Map map, acy com_google_android_gms_internal_acy) {
        this.c = vuVar;
        this.a = map;
        this.b = com_google_android_gms_internal_acy;
    }

    public void run() {
        abr.a("Received Http request.");
        final JSONObject a = this.c.a((String) this.a.get("http_request"));
        if (a == null) {
            abr.b("Response should not be null.");
        } else {
            abv.a.post(new Runnable(this) {
                final /* synthetic */ vu$1 b;

                public void run() {
                    this.b.b.b("fetchHttpRequestCompleted", a);
                    abr.a("Dispatched http response.");
                }
            });
        }
    }
}
