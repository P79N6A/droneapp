package com.google.android.gms.games.request;

import android.os.Parcel;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestRef extends j implements GameRequest {
    private final int g;

    public GameRequestRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.g = i2;
    }

    public /* synthetic */ Object a() {
        return d();
    }

    public boolean a(String str) {
        return g_(str) == 1;
    }

    public GameRequest d() {
        return new GameRequestEntity(this);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("external_request_id");
    }

    public boolean equals(Object obj) {
        return GameRequestEntity.a(this, obj);
    }

    public Game f() {
        return new GameRef(this.c_, this.d_);
    }

    public Player g() {
        return new PlayerRef(this.c_, n_(), "sender_");
    }

    public int g_(String str) {
        for (int i = this.d_; i < this.d_ + this.g; i++) {
            int a = this.c_.a(i);
            if (this.c_.c("recipient_external_player_id", i, a).equals(str)) {
                return this.c_.b("recipient_status", i, a);
            }
        }
        return -1;
    }

    public int hashCode() {
        return GameRequestEntity.a((GameRequest) this);
    }

    public byte[] i() {
        return g(UriUtil.DATA_SCHEME);
    }

    public int j() {
        return c("type");
    }

    public long k() {
        return b("creation_timestamp");
    }

    public long l() {
        return b("expiration_timestamp");
    }

    public int m() {
        return c("status");
    }

    public List<Player> o() {
        List arrayList = new ArrayList(this.g);
        for (int i = 0; i < this.g; i++) {
            arrayList.add(new PlayerRef(this.c_, this.d_ + i, "recipient_"));
        }
        return arrayList;
    }

    public String toString() {
        return GameRequestEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameRequestEntity) ((GameRequest) a())).writeToParcel(parcel, i);
    }
}
