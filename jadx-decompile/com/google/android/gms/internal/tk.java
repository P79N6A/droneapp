package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import org.json.JSONObject;

@aaa
public class tk extends tf {
    private final wy d;

    public tk(Context context, AdSizeParcel adSizeParcel, abi com_google_android_gms_internal_abi, VersionInfoParcel versionInfoParcel, tm tmVar, wy wyVar) {
        super(context, adSizeParcel, com_google_android_gms_internal_abi, versionInfoParcel, tmVar);
        this.d = wyVar;
        a(this.d);
        a();
        a(3);
        String str = "Tracking ad unit: ";
        String valueOf = String.valueOf(this.b.d());
        b.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected void b(JSONObject jSONObject) {
        this.d.a("AFMA_updateActiveView", jSONObject);
    }

    protected void c() {
        synchronized (this.a) {
            super.c();
            b(this.d);
        }
    }

    public void d() {
        c();
    }

    protected boolean j() {
        return true;
    }
}
