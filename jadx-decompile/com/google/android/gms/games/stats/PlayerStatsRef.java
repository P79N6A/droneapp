package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.common.internal.n;
import com.xiaomi.mipush.sdk.Constants;

public class PlayerStatsRef extends j implements PlayerStats {
    private Bundle c;

    PlayerStatsRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return n();
    }

    public float c() {
        return f("ave_session_length_minutes");
    }

    public float d() {
        return f("churn_probability");
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return c("days_since_last_played");
    }

    public boolean equals(Object obj) {
        return PlayerStatsEntity.a(this, obj);
    }

    public int f() {
        return c("num_purchases");
    }

    public int g() {
        return c("num_sessions");
    }

    public float h() {
        return f("num_sessions_percentile");
    }

    public int hashCode() {
        return PlayerStatsEntity.a(this);
    }

    public float i() {
        return f("spend_percentile");
    }

    public float j() {
        return !d_("spend_probability") ? -1.0f : f("spend_probability");
    }

    public float k() {
        return !d_("high_spender_probability") ? -1.0f : f("high_spender_probability");
    }

    public float l() {
        return !d_("total_spend_next_28_days") ? -1.0f : f("total_spend_next_28_days");
    }

    public Bundle m() {
        int i = 0;
        if (this.c != null) {
            return this.c;
        }
        this.c = new Bundle();
        String e = e("unknown_raw_keys");
        String e2 = e("unknown_raw_values");
        if (!(e == null || e2 == null)) {
            String[] split = e.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            String[] split2 = e2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            n.a(split.length <= split2.length, "Invalid raw arguments!");
            while (i < split.length) {
                this.c.putString(split[i], split2[i]);
                i++;
            }
        }
        return this.c;
    }

    public PlayerStats n() {
        return new PlayerStatsEntity(this);
    }

    public String toString() {
        return PlayerStatsEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerStatsEntity) ((PlayerStats) a())).writeToParcel(parcel, i);
    }
}
