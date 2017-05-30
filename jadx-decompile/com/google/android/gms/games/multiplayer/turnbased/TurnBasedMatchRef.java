package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class TurnBasedMatchRef extends j implements TurnBasedMatch {
    private final Game k;
    private final int l;

    TurnBasedMatchRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.k = new GameRef(dataHolder, i);
        this.l = i2;
    }

    public TurnBasedMatch A() {
        return new TurnBasedMatchEntity(this);
    }

    public int a(String str) {
        return TurnBasedMatchEntity.a((TurnBasedMatch) this, str);
    }

    public /* synthetic */ Object a() {
        return A();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    public Game c() {
        return this.k;
    }

    public String d() {
        return e("external_match_id");
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("creator_external");
    }

    public String e_(String str) {
        return TurnBasedMatchEntity.b(this, str);
    }

    public boolean equals(Object obj) {
        return TurnBasedMatchEntity.a((TurnBasedMatch) this, obj);
    }

    public long f() {
        return b("creation_timestamp");
    }

    public Participant f_(String str) {
        return TurnBasedMatchEntity.c(this, str);
    }

    public int g() {
        return c("status");
    }

    public int h() {
        return c("user_match_status");
    }

    public int hashCode() {
        return TurnBasedMatchEntity.a((TurnBasedMatch) this);
    }

    public String i() {
        return e("description");
    }

    public int j() {
        return c("variant");
    }

    public String k() {
        return e("last_updater_external");
    }

    public long l() {
        return b("last_updated_timestamp");
    }

    public ArrayList<Participant> m() {
        ArrayList<Participant> arrayList = new ArrayList(this.l);
        for (int i = 0; i < this.l; i++) {
            arrayList.add(new ParticipantRef(this.c_, this.d_ + i));
        }
        return arrayList;
    }

    public String n() {
        return e("pending_participant_external");
    }

    public byte[] o() {
        return g(UriUtil.DATA_SCHEME);
    }

    public int p() {
        return c("version");
    }

    public boolean q() {
        return h() == 3 && r() == null && m().size() > 1;
    }

    public String r() {
        return e("rematch_id");
    }

    public byte[] s() {
        return g("previous_match_data");
    }

    public int t() {
        return c("match_number");
    }

    public String toString() {
        return TurnBasedMatchEntity.b(this);
    }

    public Bundle u() {
        return !d("has_automatch_criteria") ? null : d.a(c("automatch_min_players"), c("automatch_max_players"), b("automatch_bit_mask"));
    }

    public int v() {
        return !d("has_automatch_criteria") ? 0 : c("automatch_max_players");
    }

    public boolean w() {
        return d("upsync_required");
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((TurnBasedMatchEntity) ((TurnBasedMatch) a())).writeToParcel(parcel, i);
    }

    public ArrayList<String> x() {
        return TurnBasedMatchEntity.c(this);
    }

    public String y() {
        return e("description_participant_id");
    }

    public Participant z() {
        String y = y();
        return y == null ? null : f_(y);
    }
}
