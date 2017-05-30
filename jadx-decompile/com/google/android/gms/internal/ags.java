package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.util.p;
import org.json.JSONObject;

public final class ags {
    private final String a;
    private final int b;
    private final JSONObject c;

    public ags(String str, int i, JSONObject jSONObject) {
        this.a = str;
        this.b = i;
        this.c = jSONObject;
    }

    public ags(JSONObject jSONObject) {
        this(jSONObject.optString("playerId"), jSONObject.optInt("playerState"), jSONObject.optJSONObject("playerData"));
    }

    public int a() {
        return this.b;
    }

    public JSONObject b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ags)) {
            return false;
        }
        ags com_google_android_gms_internal_ags = (ags) obj;
        return this.b == com_google_android_gms_internal_ags.a() && f.a(this.a, com_google_android_gms_internal_ags.c()) && p.a(this.c, com_google_android_gms_internal_ags.b());
    }
}
