package com.google.android.gms.games.social;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class SocialInviteRef extends j implements SocialInvite {
    private final Player c;

    SocialInviteRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.c = new PlayerRef(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return h();
    }

    public String c() {
        return e("external_social_invite_id");
    }

    public Player d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return c("type");
    }

    public boolean equals(Object obj) {
        return SocialInviteEntity.a(this, obj);
    }

    public int f() {
        return c("direction");
    }

    public long g() {
        return b("last_modified_timestamp");
    }

    public SocialInvite h() {
        return new SocialInviteEntity(this);
    }

    public int hashCode() {
        return SocialInviteEntity.a(this);
    }

    public String toString() {
        return SocialInviteEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((SocialInviteEntity) ((SocialInvite) a())).writeToParcel(parcel, i);
    }
}
