package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import org.json.JSONObject;

@aaa
public class yl {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    private yl(a aVar) {
        this.a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
    }

    public JSONObject a() {
        try {
            return new JSONObject().put("sms", this.a).put("tel", this.b).put("calendar", this.c).put("storePicture", this.d).put("inlineVideo", this.e);
        } catch (Throwable e) {
            b.b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
