package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class RoomRef extends j implements Room {
    private final int f;

    RoomRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f = i2;
    }

    public int a(String str) {
        return RoomEntity.a((Room) this, str);
    }

    public /* synthetic */ Object a() {
        return l();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    public String b_(String str) {
        return RoomEntity.b(this, str);
    }

    public String c() {
        return e("external_match_id");
    }

    public Participant c_(String str) {
        return RoomEntity.c(this, str);
    }

    public String d() {
        return e("creator_external");
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return b("creation_timestamp");
    }

    public boolean equals(Object obj) {
        return RoomEntity.a((Room) this, obj);
    }

    public int f() {
        return c("status");
    }

    public String g() {
        return e("description");
    }

    public int h() {
        return c("variant");
    }

    public int hashCode() {
        return RoomEntity.a((Room) this);
    }

    public Bundle i() {
        return !d("has_automatch_criteria") ? null : d.a(c("automatch_min_players"), c("automatch_max_players"), b("automatch_bit_mask"));
    }

    public int j() {
        return c("automatch_wait_estimate_sec");
    }

    public ArrayList<String> k() {
        return RoomEntity.c(this);
    }

    public Room l() {
        return new RoomEntity(this);
    }

    public ArrayList<Participant> m() {
        ArrayList<Participant> arrayList = new ArrayList(this.f);
        for (int i = 0; i < this.f; i++) {
            arrayList.add(new ParticipantRef(this.c_, this.d_ + i));
        }
        return arrayList;
    }

    public String toString() {
        return RoomEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) ((Room) a())).writeToParcel(parcel, i);
    }
}
