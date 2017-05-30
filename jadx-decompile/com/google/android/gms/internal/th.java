package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@aaa
public final class th {
    private final String a;
    private final JSONObject b;
    private final String c;
    private final String d;
    private final boolean e;
    private final boolean f;

    public th(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        this.d = versionInfoParcel.b;
        this.b = jSONObject;
        this.c = str;
        this.a = str2;
        this.e = z;
        this.f = z2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public JSONObject c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }
}
