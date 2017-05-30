package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.internal.h;

public final class MilestoneRef extends j implements Milestone {
    MilestoneRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private long j() {
        return b("initial_value");
    }

    public /* synthetic */ Object a() {
        return i();
    }

    public String c() {
        return e("external_milestone_id");
    }

    public long d() {
        long j;
        long j2 = 0;
        switch (f()) {
            case 1:
                j = 0;
                break;
            case 2:
                j = b("current_value");
                if (b("quest_state") != 6) {
                    j -= j();
                    break;
                }
                break;
            case 3:
            case 4:
                j = g();
                break;
            default:
                j = 0;
                break;
        }
        if (j < 0) {
            h.b("MilestoneRef", "Current progress should never be negative");
        } else {
            j2 = j;
        }
        if (j2 <= g()) {
            return j2;
        }
        h.b("MilestoneRef", "Current progress should never exceed target progress");
        return g();
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("external_event_id");
    }

    public boolean equals(Object obj) {
        return MilestoneEntity.a(this, obj);
    }

    public int f() {
        return c("milestone_state");
    }

    public long g() {
        return b("target_value");
    }

    public byte[] h() {
        return g("completion_reward_data");
    }

    public int hashCode() {
        return MilestoneEntity.a(this);
    }

    public Milestone i() {
        return new MilestoneEntity(this);
    }

    public String toString() {
        return MilestoneEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MilestoneEntity) ((Milestone) a())).writeToParcel(parcel, i);
    }
}
