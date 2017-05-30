package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;

public final class ExperienceEventRef extends j implements ExperienceEvent {
    private final GameRef c;

    public ExperienceEventRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        if (i("external_game_id")) {
            this.c = null;
        } else {
            this.c = new GameRef(this.c_, this.d_);
        }
    }

    public /* synthetic */ Object a() {
        return m();
    }

    public String c() {
        return e("external_experience_id");
    }

    public Game d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("display_title");
    }

    public boolean equals(Object obj) {
        return ExperienceEventEntity.a(this, obj);
    }

    public String f() {
        return e("display_description");
    }

    public Uri g() {
        return h("icon_uri");
    }

    public String getIconImageUrl() {
        return e("icon_url");
    }

    public long h() {
        return b("created_timestamp");
    }

    public int hashCode() {
        return ExperienceEventEntity.a(this);
    }

    public long i() {
        return b("xp_earned");
    }

    public long j() {
        return b("current_xp");
    }

    public int k() {
        return c("type");
    }

    public int l() {
        return c("newLevel");
    }

    public ExperienceEvent m() {
        return new ExperienceEventEntity(this);
    }

    public String toString() {
        return ExperienceEventEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((ExperienceEventEntity) ((ExperienceEvent) a())).writeToParcel(parcel, i);
    }
}
