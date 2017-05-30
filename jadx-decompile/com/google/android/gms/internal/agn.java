package com.google.android.gms.internal;

import org.json.JSONObject;

public final class agn {
    private final String a;
    private final int b;
    private final String c;

    public agn(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public agn(JSONObject jSONObject) {
        this(jSONObject.optString("applicationName"), jSONObject.optInt("maxPlayers"), jSONObject.optString("version"));
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}
