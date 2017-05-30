package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.b;

public final class PlayerRef extends j implements Player {
    private final b c;
    private final PlayerLevelInfo d;
    private final MostRecentGameInfoRef e;

    public PlayerRef(DataHolder dataHolder, int i) {
        this(dataHolder, i, null);
    }

    public PlayerRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        this.c = new b(str);
        this.e = new MostRecentGameInfoRef(dataHolder, i, this.c);
        if (y()) {
            PlayerLevel playerLevel;
            int c = c(this.c.k);
            int c2 = c(this.c.n);
            PlayerLevel playerLevel2 = new PlayerLevel(c, b(this.c.l), b(this.c.m));
            if (c != c2) {
                playerLevel = new PlayerLevel(c2, b(this.c.m), b(this.c.o));
            } else {
                playerLevel = playerLevel2;
            }
            this.d = new PlayerLevelInfo(b(this.c.j), b(this.c.p), playerLevel2, playerLevel);
            return;
        }
        this.d = null;
    }

    private boolean y() {
        return (i(this.c.j) || b(this.c.j) == -1) ? false : true;
    }

    public /* synthetic */ Object a() {
        return x();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a(this.c.b, charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        a(this.c.q, charArrayBuffer);
    }

    public String c() {
        return e(this.c.a);
    }

    public String d() {
        return e(this.c.b);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e(this.c.A);
    }

    public boolean equals(Object obj) {
        return PlayerEntity.a(this, obj);
    }

    public String f() {
        return e(this.c.B);
    }

    public boolean g() {
        return d(this.c.z);
    }

    public String getBannerImageLandscapeUrl() {
        return e(this.c.D);
    }

    public String getBannerImagePortraitUrl() {
        return e(this.c.F);
    }

    public String getHiResImageUrl() {
        return e(this.c.f);
    }

    public String getIconImageUrl() {
        return e(this.c.d);
    }

    public boolean h() {
        return i() != null;
    }

    public int hashCode() {
        return PlayerEntity.a((Player) this);
    }

    public Uri i() {
        return h(this.c.c);
    }

    public boolean j() {
        return k() != null;
    }

    public Uri k() {
        return h(this.c.e);
    }

    public long l() {
        return b(this.c.g);
    }

    public long m() {
        return (!d_(this.c.i) || i(this.c.i)) ? -1 : b(this.c.i);
    }

    public int n() {
        return c(this.c.h);
    }

    public boolean o() {
        return d(this.c.s);
    }

    public String p() {
        return e(this.c.q);
    }

    public PlayerLevelInfo q() {
        return this.d;
    }

    public MostRecentGameInfo r() {
        return i(this.c.t) ? null : this.e;
    }

    public Uri s() {
        return h(this.c.C);
    }

    public Uri t() {
        return h(this.c.E);
    }

    public String toString() {
        return PlayerEntity.b((Player) this);
    }

    public int u() {
        return c(this.c.G);
    }

    public long v() {
        return b(this.c.H);
    }

    public boolean w() {
        return d(this.c.I);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) ((Player) a())).writeToParcel(parcel, i);
    }

    public Player x() {
        return new PlayerEntity(this);
    }
}
