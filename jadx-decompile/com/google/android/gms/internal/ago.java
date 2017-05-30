package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.m;
import com.google.android.gms.games.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class ago {
    private static final m n = new m("GameManagerMessage");
    protected final int a;
    protected final int b;
    protected final String c;
    protected final JSONObject d;
    protected final int e;
    protected final int f;
    protected final List<ags> g;
    protected final JSONObject h;
    protected final String i;
    protected final String j;
    protected final long k;
    protected final String l;
    protected final agn m;

    public ago(int i, int i2, String str, JSONObject jSONObject, int i3, int i4, List<ags> list, JSONObject jSONObject2, String str2, String str3, long j, String str4, agn com_google_android_gms_internal_agn) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = jSONObject;
        this.e = i3;
        this.f = i4;
        this.g = list;
        this.h = jSONObject2;
        this.i = str2;
        this.j = str3;
        this.k = j;
        this.l = str4;
        this.m = com_google_android_gms_internal_agn;
    }

    protected static ago a(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("type", -1);
        switch (optInt) {
            case 1:
                agn com_google_android_gms_internal_agn = null;
                JSONObject optJSONObject = jSONObject.optJSONObject("gameManagerConfig");
                if (optJSONObject != null) {
                    agn com_google_android_gms_internal_agn2 = new agn(optJSONObject);
                }
                return new ago(optInt, jSONObject.optInt("statusCode"), jSONObject.optString("errorDescription"), jSONObject.optJSONObject("extraMessageData"), jSONObject.optInt("gameplayState"), jSONObject.optInt("lobbyState"), a(jSONObject.optJSONArray(c.a)), jSONObject.optJSONObject("gameData"), jSONObject.optString("gameStatusText"), jSONObject.optString("playerId"), jSONObject.optLong("requestId"), jSONObject.optString("playerToken"), com_google_android_gms_internal_agn);
            case 2:
                return new ago(optInt, jSONObject.optInt("statusCode"), jSONObject.optString("errorDescription"), jSONObject.optJSONObject("extraMessageData"), jSONObject.optInt("gameplayState"), jSONObject.optInt("lobbyState"), a(jSONObject.optJSONArray(c.a)), jSONObject.optJSONObject("gameData"), jSONObject.optString("gameStatusText"), jSONObject.optString("playerId"), -1, null, null);
            default:
                try {
                    n.d("Unrecognized Game Message type %d", new Object[]{Integer.valueOf(optInt)});
                    break;
                } catch (Throwable e) {
                    n.b(e, "Exception while parsing GameManagerMessage from json", new Object[0]);
                    break;
                }
        }
        return null;
    }

    private static List<ags> a(JSONArray jSONArray) {
        List<ags> arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                Object com_google_android_gms_internal_ags;
                try {
                    com_google_android_gms_internal_ags = new ags(optJSONObject);
                } catch (Throwable e) {
                    n.b(e, "Exception when attempting to parse PlayerInfoMessageComponent at index %d", new Object[]{Integer.valueOf(i)});
                    com_google_android_gms_internal_ags = null;
                }
                if (com_google_android_gms_internal_ags != null) {
                    arrayList.add(com_google_android_gms_internal_ags);
                }
            }
        }
        return arrayList;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final JSONObject d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final List<ags> g() {
        return this.g;
    }

    public final JSONObject h() {
        return this.h;
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.j;
    }

    public final long k() {
        return this.k;
    }

    public final String l() {
        return this.l;
    }

    public final agn m() {
        return this.m;
    }
}
