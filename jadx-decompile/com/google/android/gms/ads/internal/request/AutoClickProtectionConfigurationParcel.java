package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public final class AutoClickProtectionConfigurationParcel extends AbstractSafeParcelable {
    public static final i CREATOR = new i();
    public final int a;
    public final boolean b;
    @Nullable
    public final List<String> c;

    public AutoClickProtectionConfigurationParcel() {
        this(1, false, Collections.emptyList());
    }

    public AutoClickProtectionConfigurationParcel(int i, boolean z, List<String> list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    public AutoClickProtectionConfigurationParcel(boolean z) {
        this(1, z, Collections.emptyList());
    }

    public AutoClickProtectionConfigurationParcel(boolean z, List<String> list) {
        this(1, z, list);
    }

    @Nullable
    public static AutoClickProtectionConfigurationParcel a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new AutoClickProtectionConfigurationParcel();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        List arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (Throwable e) {
                    b.d("Error grabbing url from json.", e);
                }
            }
        }
        return new AutoClickProtectionConfigurationParcel(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
