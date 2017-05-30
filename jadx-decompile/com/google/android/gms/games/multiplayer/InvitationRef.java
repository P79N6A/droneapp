package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class InvitationRef extends j implements Invitation {
    private final Game c;
    private final ParticipantRef d;
    private final ArrayList<Participant> e;

    InvitationRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = new GameRef(dataHolder, i);
        this.e = new ArrayList(i2);
        String e = e("external_inviter_id");
        Object obj = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ParticipantRef participantRef = new ParticipantRef(this.c_, this.d_ + i3);
            if (participantRef.j().equals(e)) {
                obj = participantRef;
            }
            this.e.add(participantRef);
        }
        this.d = (ParticipantRef) d.a(obj, "Must have a valid inviter!");
    }

    public /* synthetic */ Object a() {
        return d();
    }

    public Invitation d() {
        return new InvitationEntity(this);
    }

    public int describeContents() {
        return 0;
    }

    public Game e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return InvitationEntity.a(this, obj);
    }

    public String f() {
        return e("external_invitation_id");
    }

    public Participant g() {
        return this.d;
    }

    public long h() {
        return Math.max(b("creation_timestamp"), b("last_modified_timestamp"));
    }

    public int hashCode() {
        return InvitationEntity.a((Invitation) this);
    }

    public int i() {
        return c("type");
    }

    public int j() {
        return c("variant");
    }

    public int k() {
        return !d("has_automatch_criteria") ? 0 : c("automatch_max_players");
    }

    public ArrayList<Participant> m() {
        return this.e;
    }

    public String toString() {
        return InvitationEntity.b((Invitation) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((InvitationEntity) ((Invitation) a())).writeToParcel(parcel, i);
    }
}
