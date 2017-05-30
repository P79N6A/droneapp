package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;

public final class ZInvitationCluster extends AbstractSafeParcelable implements Invitation {
    public static final a CREATOR = new a();
    private final int c;
    private final ArrayList<InvitationEntity> d;

    ZInvitationCluster(int i, ArrayList<InvitationEntity> arrayList) {
        this.c = i;
        this.d = arrayList;
        n();
    }

    private void n() {
        n.a(!this.d.isEmpty());
        Invitation invitation = (Invitation) this.d.get(0);
        int size = this.d.size();
        for (int i = 1; i < size; i++) {
            n.a(invitation.g().equals(((Invitation) this.d.get(i)).g()), "All the invitations must be from the same inviter");
        }
    }

    public /* synthetic */ Object a() {
        return l();
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return this.c;
    }

    public ArrayList<Invitation> d() {
        return new ArrayList(this.d);
    }

    public Game e() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ZInvitationCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ZInvitationCluster zInvitationCluster = (ZInvitationCluster) obj;
        if (zInvitationCluster.d.size() != this.d.size()) {
            return false;
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            if (!((Invitation) this.d.get(i)).equals((Invitation) zInvitationCluster.d.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String f() {
        return ((InvitationEntity) this.d.get(0)).f();
    }

    public Participant g() {
        return ((InvitationEntity) this.d.get(0)).g();
    }

    public long h() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int hashCode() {
        return c.a(this.d.toArray());
    }

    public int i() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int j() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int k() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Invitation l() {
        return this;
    }

    public ArrayList<Participant> m() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
