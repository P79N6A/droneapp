package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestCluster extends AbstractSafeParcelable implements GameRequest {
    public static final a CREATOR = new a();
    private final int g;
    private final ArrayList<GameRequestEntity> h;

    GameRequestCluster(int i, ArrayList<GameRequestEntity> arrayList) {
        this.g = i;
        this.h = arrayList;
        p();
    }

    private void p() {
        n.a(!this.h.isEmpty());
        GameRequest gameRequest = (GameRequest) this.h.get(0);
        int size = this.h.size();
        for (int i = 1; i < size; i++) {
            GameRequest gameRequest2 = (GameRequest) this.h.get(i);
            n.a(gameRequest.j() == gameRequest2.j(), "All the requests must be of the same type");
            n.a(gameRequest.g().equals(gameRequest2.g()), "All the requests must be from the same sender");
        }
    }

    public /* synthetic */ Object a() {
        return n();
    }

    public boolean a(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return this.g;
    }

    public ArrayList<GameRequest> d() {
        return new ArrayList(this.h);
    }

    public String e() {
        return ((GameRequestEntity) this.h.get(0)).e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GameRequestCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GameRequestCluster gameRequestCluster = (GameRequestCluster) obj;
        if (gameRequestCluster.h.size() != this.h.size()) {
            return false;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (!((GameRequest) this.h.get(i)).equals((GameRequest) gameRequestCluster.h.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Game f() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Player g() {
        return ((GameRequestEntity) this.h.get(0)).g();
    }

    public int g_(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public ArrayList<Player> h() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int hashCode() {
        return c.a(this.h.toArray());
    }

    public byte[] i() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int j() {
        return ((GameRequestEntity) this.h.get(0)).j();
    }

    public long k() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long l() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int m() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public GameRequest n() {
        return this;
    }

    public /* synthetic */ List o() {
        return h();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
