package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
import java.util.List;

public final class QuestRef extends j implements Quest {
    private final Game h;
    private final int i;

    QuestRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.h = new GameRef(dataHolder, i);
        this.i = i2;
    }

    public /* synthetic */ Object a() {
        return s();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a("quest_name", charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        a("quest_description", charArrayBuffer);
    }

    public String c() {
        return e("external_quest_id");
    }

    public String d() {
        return e("quest_name");
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("quest_description");
    }

    public boolean equals(Object obj) {
        return QuestEntity.a(this, obj);
    }

    public Uri f() {
        return h("quest_banner_image_uri");
    }

    public Uri g() {
        return h("quest_icon_image_uri");
    }

    public String getBannerImageUrl() {
        return e("quest_banner_image_url");
    }

    public String getIconImageUrl() {
        return e("quest_icon_image_url");
    }

    public Milestone h() {
        return (Milestone) i().get(0);
    }

    public int hashCode() {
        return QuestEntity.a((Quest) this);
    }

    public List<Milestone> i() {
        List arrayList = new ArrayList(this.i);
        for (int i = 0; i < this.i; i++) {
            arrayList.add(new MilestoneRef(this.c_, this.d_ + i));
        }
        return arrayList;
    }

    public Game j() {
        return this.h;
    }

    public int k() {
        return c("quest_state");
    }

    public int l() {
        return c("quest_type");
    }

    public long m() {
        return b("accepted_ts");
    }

    public long n() {
        return b("quest_end_ts");
    }

    public long o() {
        return b("quest_last_updated_ts");
    }

    public long p() {
        return b("notification_ts");
    }

    public long q() {
        return b("quest_start_ts");
    }

    public boolean r() {
        return p() <= System.currentTimeMillis() + 1800000;
    }

    public Quest s() {
        return new QuestEntity(this);
    }

    public String toString() {
        return QuestEntity.b((Quest) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((QuestEntity) ((Quest) a())).writeToParcel(parcel, i);
    }
}
