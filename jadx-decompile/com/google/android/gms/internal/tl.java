package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.wx.c;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class tl extends tf {
    private c d;
    private boolean e;

    public tl(Context context, AdSizeParcel adSizeParcel, abi com_google_android_gms_internal_abi, VersionInfoParcel versionInfoParcel, tm tmVar, wx wxVar) {
        super(context, adSizeParcel, com_google_android_gms_internal_abi, versionInfoParcel, tmVar);
        this.d = wxVar.a();
        try {
            this.d.a(new 1(this, a(tmVar.c().a())), new 2(this));
        } catch (JSONException e) {
        } catch (Throwable e2) {
            b.b("Failure while processing active view data.", e2);
        }
        this.d.a(new 3(this), new 4(this));
        String str = "Tracking ad unit: ";
        String valueOf = String.valueOf(this.b.d());
        b.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected void b(JSONObject jSONObject) {
        this.d.a(new 5(this, jSONObject), new acr.b());
    }

    protected void c() {
        synchronized (this.a) {
            super.c();
            this.d.a(new 6(this), new acr.b());
            this.d.q_();
        }
    }

    protected boolean j() {
        return this.e;
    }
}
