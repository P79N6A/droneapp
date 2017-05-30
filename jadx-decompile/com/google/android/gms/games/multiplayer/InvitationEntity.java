package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;

public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    public static final Creator<InvitationEntity> CREATOR = new a();
    private final int c;
    private final GameEntity d;
    private final String e;
    private final long f;
    private final int g;
    private final ParticipantEntity h;
    private final ArrayList<ParticipantEntity> i;
    private final int j;
    private final int k;

    static final class a extends b {
        a() {
        }

        public InvitationEntity a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.b(InvitationEntity.l_()) || InvitationEntity.a_(InvitationEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add((ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new InvitationEntity(2, gameEntity, readString, readLong, readInt, participantEntity, arrayList, -1, 0);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }
    }

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList<ParticipantEntity> arrayList, int i3, int i4) {
        this.c = i;
        this.d = gameEntity;
        this.e = str;
        this.f = j;
        this.g = i2;
        this.h = participantEntity;
        this.i = arrayList;
        this.j = i3;
        this.k = i4;
    }

    InvitationEntity(Invitation invitation) {
        this.c = 2;
        this.d = new GameEntity(invitation.e());
        this.e = invitation.f();
        this.f = invitation.h();
        this.g = invitation.i();
        this.j = invitation.j();
        this.k = invitation.k();
        String j = invitation.g().j();
        Participant participant = null;
        ArrayList m = invitation.m();
        int size = m.size();
        this.i = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Participant participant2 = (Participant) m.get(i);
            if (participant2.j().equals(j)) {
                participant = participant2;
            }
            this.i.add((ParticipantEntity) participant2.a());
        }
        d.a(participant, "Must have a valid inviter!");
        this.h = (ParticipantEntity) participant.a();
    }

    static int a(Invitation invitation) {
        return c.a(new Object[]{invitation.e(), invitation.f(), Long.valueOf(invitation.h()), Integer.valueOf(invitation.i()), invitation.g(), invitation.m(), Integer.valueOf(invitation.j()), Integer.valueOf(invitation.k())});
    }

    static boolean a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return c.a(invitation2.e(), invitation.e()) && c.a(invitation2.f(), invitation.f()) && c.a(Long.valueOf(invitation2.h()), Long.valueOf(invitation.h())) && c.a(Integer.valueOf(invitation2.i()), Integer.valueOf(invitation.i())) && c.a(invitation2.g(), invitation.g()) && c.a(invitation2.m(), invitation.m()) && c.a(Integer.valueOf(invitation2.j()), Integer.valueOf(invitation.j())) && c.a(Integer.valueOf(invitation2.k()), Integer.valueOf(invitation.k()));
    }

    static String b(Invitation invitation) {
        return c.a(invitation).a("Game", invitation.e()).a("InvitationId", invitation.f()).a("CreationTimestamp", Long.valueOf(invitation.h())).a("InvitationType", Integer.valueOf(invitation.i())).a("Inviter", invitation.g()).a("Participants", invitation.m()).a("Variant", Integer.valueOf(invitation.j())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.k())).toString();
    }

    public /* synthetic */ Object a() {
        return n();
    }

    public boolean b() {
        return true;
    }

    public Game e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public String f() {
        return this.e;
    }

    public Participant g() {
        return this.h;
    }

    public long h() {
        return this.f;
    }

    public int hashCode() {
        return a((Invitation) this);
    }

    public int i() {
        return this.g;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }

    public int l() {
        return this.c;
    }

    public ArrayList<Participant> m() {
        return new ArrayList(this.i);
    }

    public Invitation n() {
        return this;
    }

    public String toString() {
        return b((Invitation) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (m_()) {
            this.d.writeToParcel(parcel, i);
            parcel.writeString(this.e);
            parcel.writeLong(this.f);
            parcel.writeInt(this.g);
            this.h.writeToParcel(parcel, i);
            int size = this.i.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.i.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        b.a(this, parcel, i);
    }
}
