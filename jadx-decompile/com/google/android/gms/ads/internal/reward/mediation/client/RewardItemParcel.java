package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.b.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public final class RewardItemParcel extends AbstractSafeParcelable {
    public static final c CREATOR = new c();
    public final int a;
    public final String b;
    public final int c;

    public RewardItemParcel(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public RewardItemParcel(a aVar) {
        this(1, aVar.a(), aVar.b());
    }

    public RewardItemParcel(String str, int i) {
        this(1, str, i);
    }

    @Nullable
    public static RewardItemParcel a(@Nullable String str) {
        RewardItemParcel rewardItemParcel = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                rewardItemParcel = a(new JSONArray(str));
            } catch (JSONException e) {
            }
        }
        return rewardItemParcel;
    }

    @Nullable
    public static RewardItemParcel a(JSONArray jSONArray) {
        return (jSONArray == null || jSONArray.length() == 0) ? null : new RewardItemParcel(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public JSONArray a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rb_type", this.b);
        jSONObject.put("rb_amount", this.c);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof RewardItemParcel)) {
            return false;
        }
        RewardItemParcel rewardItemParcel = (RewardItemParcel) obj;
        return c.a(this.b, rewardItemParcel.b) && c.a(Integer.valueOf(this.c), Integer.valueOf(rewardItemParcel.c));
    }

    public int hashCode() {
        return c.a(this.b, Integer.valueOf(this.c));
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
