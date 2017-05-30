package com.google.android.gms.ads.internal.safebrowsing;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import org.json.JSONObject;

@aaa
public class SafeBrowsingConfigParcel extends AbstractSafeParcelable {
    public static final b CREATOR = new b();
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public SafeBrowsingConfigParcel(int i, String str, String str2, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    @Nullable
    public static SafeBrowsingConfigParcel a(JSONObject jSONObject) {
        return jSONObject == null ? null : new SafeBrowsingConfigParcel(1, jSONObject.getString("click_string"), jSONObject.getString("report_url"), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false));
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
