package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class ParticipantRef extends j implements Participant {
    private final PlayerRef h;

    public ParticipantRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.h = new PlayerRef(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return m();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        if (i("external_player_id")) {
            a("default_display_name", charArrayBuffer);
        } else {
            this.h.a(charArrayBuffer);
        }
    }

    public int c() {
        return c("player_status");
    }

    public String d() {
        return e("client_address");
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return c("capabilities");
    }

    public boolean equals(Object obj) {
        return ParticipantEntity.a(this, obj);
    }

    public boolean f() {
        return c("connected") > 0;
    }

    public String g() {
        return i("external_player_id") ? e("default_display_name") : this.h.d();
    }

    public String getHiResImageUrl() {
        return i("external_player_id") ? e("default_display_hi_res_image_url") : this.h.getHiResImageUrl();
    }

    public String getIconImageUrl() {
        return i("external_player_id") ? e("default_display_image_url") : this.h.getIconImageUrl();
    }

    public Uri h() {
        return i("external_player_id") ? h("default_display_image_uri") : this.h.i();
    }

    public int hashCode() {
        return ParticipantEntity.a((Participant) this);
    }

    public Uri i() {
        return i("external_player_id") ? h("default_display_hi_res_image_uri") : this.h.k();
    }

    public String j() {
        return e("external_participant_id");
    }

    public Player k() {
        return i("external_player_id") ? null : this.h;
    }

    public ParticipantResult l() {
        if (i("result_type")) {
            return null;
        }
        return new ParticipantResult(j(), c("result_type"), c("placing"));
    }

    public Participant m() {
        return new ParticipantEntity(this);
    }

    public String toString() {
        return ParticipantEntity.b((Participant) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((ParticipantEntity) ((Participant) a())).writeToParcel(parcel, i);
    }
}
