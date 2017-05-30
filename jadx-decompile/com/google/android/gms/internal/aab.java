package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.internal.aao.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@aaa
public class aab {
    @Nullable
    public Bundle a;
    @Nullable
    public Bundle b;
    @Nullable
    public List<String> c = new ArrayList();
    @Nullable
    public Location d;
    @Nullable
    public a e;
    @Nullable
    public String f;
    @Nullable
    public String g;
    public AdRequestInfoParcel h;
    public aak i;
    public JSONObject j = new JSONObject();

    public aab a(Location location) {
        this.d = location;
        return this;
    }

    public aab a(Bundle bundle) {
        this.b = bundle;
        return this;
    }

    public aab a(AdRequestInfoParcel adRequestInfoParcel) {
        this.h = adRequestInfoParcel;
        return this;
    }

    public aab a(aak com_google_android_gms_internal_aak) {
        this.i = com_google_android_gms_internal_aak;
        return this;
    }

    public aab a(a aVar) {
        this.e = aVar;
        return this;
    }

    public aab a(String str) {
        this.g = str;
        return this;
    }

    public aab a(List<String> list) {
        if (list == null) {
            this.c.clear();
        }
        this.c = list;
        return this;
    }

    public aab a(JSONObject jSONObject) {
        this.j = jSONObject;
        return this;
    }

    public aab b(Bundle bundle) {
        this.a = bundle;
        return this;
    }

    public aab b(String str) {
        this.f = str;
        return this;
    }
}
