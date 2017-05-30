package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestEntity extends AbstractSafeParcelable implements GameRequest {
    public static final Creator<GameRequestEntity> CREATOR = new b();
    private final int g;
    private final GameEntity h;
    private final PlayerEntity i;
    private final byte[] j;
    private final String k;
    private final ArrayList<PlayerEntity> l;
    private final int m;
    private final long n;
    private final long o;
    private final Bundle p;
    private final int q;

    GameRequestEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, byte[] bArr, String str, ArrayList<PlayerEntity> arrayList, int i2, long j, long j2, Bundle bundle, int i3) {
        this.g = i;
        this.h = gameEntity;
        this.i = playerEntity;
        this.j = bArr;
        this.k = str;
        this.l = arrayList;
        this.m = i2;
        this.n = j;
        this.o = j2;
        this.p = bundle;
        this.q = i3;
    }

    public GameRequestEntity(GameRequest gameRequest) {
        this.g = 2;
        this.h = new GameEntity(gameRequest.f());
        this.i = new PlayerEntity(gameRequest.g());
        this.k = gameRequest.e();
        this.m = gameRequest.j();
        this.n = gameRequest.k();
        this.o = gameRequest.l();
        this.q = gameRequest.m();
        Object i = gameRequest.i();
        if (i == null) {
            this.j = null;
        } else {
            this.j = new byte[i.length];
            System.arraycopy(i, 0, this.j, 0, i.length);
        }
        List o = gameRequest.o();
        int size = o.size();
        this.l = new ArrayList(size);
        this.p = new Bundle();
        for (int i2 = 0; i2 < size; i2++) {
            Player player = (Player) ((Player) o.get(i2)).a();
            String c = player.c();
            this.l.add((PlayerEntity) player);
            this.p.putInt(c, gameRequest.g_(c));
        }
    }

    static int a(GameRequest gameRequest) {
        return c.a(new Object[]{gameRequest.f(), gameRequest.o(), gameRequest.e(), gameRequest.g(), c(gameRequest), Integer.valueOf(gameRequest.j()), Long.valueOf(gameRequest.k()), Long.valueOf(gameRequest.l())});
    }

    static boolean a(GameRequest gameRequest, Object obj) {
        if (!(obj instanceof GameRequest)) {
            return false;
        }
        if (gameRequest == obj) {
            return true;
        }
        GameRequest gameRequest2 = (GameRequest) obj;
        return c.a(gameRequest2.f(), gameRequest.f()) && c.a(gameRequest2.o(), gameRequest.o()) && c.a(gameRequest2.e(), gameRequest.e()) && c.a(gameRequest2.g(), gameRequest.g()) && Arrays.equals(c(gameRequest2), c(gameRequest)) && c.a(Integer.valueOf(gameRequest2.j()), Integer.valueOf(gameRequest.j())) && c.a(Long.valueOf(gameRequest2.k()), Long.valueOf(gameRequest.k())) && c.a(Long.valueOf(gameRequest2.l()), Long.valueOf(gameRequest.l()));
    }

    static String b(GameRequest gameRequest) {
        return c.a(gameRequest).a("Game", gameRequest.f()).a("Sender", gameRequest.g()).a("Recipients", gameRequest.o()).a("Data", gameRequest.i()).a("RequestId", gameRequest.e()).a("Type", Integer.valueOf(gameRequest.j())).a("CreationTimestamp", Long.valueOf(gameRequest.k())).a("ExpirationTimestamp", Long.valueOf(gameRequest.l())).toString();
    }

    private static int[] c(GameRequest gameRequest) {
        List o = gameRequest.o();
        int size = o.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = gameRequest.g_(((Player) o.get(i)).c());
        }
        return iArr;
    }

    public /* synthetic */ Object a() {
        return h();
    }

    public boolean a(String str) {
        return g_(str) == 1;
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return this.g;
    }

    public Bundle d() {
        return this.p;
    }

    public String e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public Game f() {
        return this.h;
    }

    public Player g() {
        return this.i;
    }

    public int g_(String str) {
        return this.p.getInt(str, 0);
    }

    public GameRequest h() {
        return this;
    }

    public int hashCode() {
        return a((GameRequest) this);
    }

    public byte[] i() {
        return this.j;
    }

    public int j() {
        return this.m;
    }

    public long k() {
        return this.n;
    }

    public long l() {
        return this.o;
    }

    public int m() {
        return this.q;
    }

    public List<Player> o() {
        return new ArrayList(this.l);
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
