package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Creator<PlayerEntity> CREATOR = new a();
    private final int c;
    private String d;
    private String e;
    private final Uri f;
    private final Uri g;
    private final long h;
    private final int i;
    private final long j;
    private final String k;
    private final String l;
    private final String m;
    private final MostRecentGameInfoEntity n;
    private final PlayerLevelInfo o;
    private final boolean p;
    private final boolean q;
    private final String r;
    private final String s;
    private final Uri t;
    private final String u;
    private final Uri v;
    private final String w;
    private final int x;
    private final long y;
    private final boolean z;

    static final class a extends k {
        a() {
        }

        public PlayerEntity a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.b(PlayerEntity.l_()) || PlayerEntity.a_(PlayerEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            return new PlayerEntity(14, readString, readString2, readString3 == null ? null : Uri.parse(readString3), readString4 == null ? null : Uri.parse(readString4), parcel.readLong(), -1, -1, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1, -1, false);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }
    }

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j, int i2, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, int i3, long j3, boolean z3) {
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = uri;
        this.k = str3;
        this.g = uri2;
        this.l = str4;
        this.h = j;
        this.i = i2;
        this.j = j2;
        this.m = str5;
        this.p = z;
        this.n = mostRecentGameInfoEntity;
        this.o = playerLevelInfo;
        this.q = z2;
        this.r = str6;
        this.s = str7;
        this.t = uri3;
        this.u = str8;
        this.v = uri4;
        this.w = str9;
        this.x = i3;
        this.y = j3;
        this.z = z3;
    }

    public PlayerEntity(Player player) {
        this(player, true);
    }

    public PlayerEntity(Player player, boolean z) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        this.c = 14;
        this.d = z ? player.c() : null;
        this.e = player.d();
        this.f = player.i();
        this.k = player.getIconImageUrl();
        this.g = player.k();
        this.l = player.getHiResImageUrl();
        this.h = player.l();
        this.i = player.n();
        this.j = player.m();
        this.m = player.p();
        this.p = player.o();
        MostRecentGameInfo r = player.r();
        if (r != null) {
            mostRecentGameInfoEntity = new MostRecentGameInfoEntity(r);
        }
        this.n = mostRecentGameInfoEntity;
        this.o = player.q();
        this.q = player.g();
        this.r = player.e();
        this.s = player.f();
        this.t = player.s();
        this.u = player.getBannerImageLandscapeUrl();
        this.v = player.t();
        this.w = player.getBannerImagePortraitUrl();
        this.x = player.u();
        this.y = player.v();
        this.z = player.w();
        if (z) {
            n.a(this.d);
        }
        n.a(this.e);
        n.a(this.h > 0);
    }

    static int a(Player player) {
        return c.a(new Object[]{player.c(), player.d(), Boolean.valueOf(player.g()), player.i(), player.k(), Long.valueOf(player.l()), player.p(), player.q(), player.e(), player.f(), player.s(), player.t(), Integer.valueOf(player.u()), Long.valueOf(player.v()), Boolean.valueOf(player.w())});
    }

    static boolean a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return c.a(player2.c(), player.c()) && c.a(player2.d(), player.d()) && c.a(Boolean.valueOf(player2.g()), Boolean.valueOf(player.g())) && c.a(player2.i(), player.i()) && c.a(player2.k(), player.k()) && c.a(Long.valueOf(player2.l()), Long.valueOf(player.l())) && c.a(player2.p(), player.p()) && c.a(player2.q(), player.q()) && c.a(player2.e(), player.e()) && c.a(player2.f(), player.f()) && c.a(player2.s(), player.s()) && c.a(player2.t(), player.t()) && c.a(Integer.valueOf(player2.u()), Integer.valueOf(player.u())) && c.a(Long.valueOf(player2.v()), Long.valueOf(player.v())) && c.a(Boolean.valueOf(player2.w()), Boolean.valueOf(player.w()));
    }

    static String b(Player player) {
        return c.a(player).a("PlayerId", player.c()).a("DisplayName", player.d()).a("HasDebugAccess", Boolean.valueOf(player.g())).a("IconImageUri", player.i()).a("IconImageUrl", player.getIconImageUrl()).a("HiResImageUri", player.k()).a("HiResImageUrl", player.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(player.l())).a("Title", player.p()).a("LevelInfo", player.q()).a("GamerTag", player.e()).a("Name", player.f()).a("BannerImageLandscapeUri", player.s()).a("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).a("BannerImagePortraitUri", player.t()).a("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).a("GamerFriendStatus", Integer.valueOf(player.u())).a("GamerFriendUpdateTimestamp", Long.valueOf(player.v())).a("IsMuted", Boolean.valueOf(player.w())).toString();
    }

    public /* synthetic */ Object a() {
        return y();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.e, charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        g.a(this.m, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.r;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public String f() {
        return this.s;
    }

    public boolean g() {
        return this.q;
    }

    public String getBannerImageLandscapeUrl() {
        return this.u;
    }

    public String getBannerImagePortraitUrl() {
        return this.w;
    }

    public String getHiResImageUrl() {
        return this.l;
    }

    public String getIconImageUrl() {
        return this.k;
    }

    public boolean h() {
        return i() != null;
    }

    public int hashCode() {
        return a((Player) this);
    }

    public Uri i() {
        return this.f;
    }

    public boolean j() {
        return k() != null;
    }

    public Uri k() {
        return this.g;
    }

    public long l() {
        return this.h;
    }

    public long m() {
        return this.j;
    }

    public int n() {
        return this.i;
    }

    public boolean o() {
        return this.p;
    }

    public String p() {
        return this.m;
    }

    public PlayerLevelInfo q() {
        return this.o;
    }

    public MostRecentGameInfo r() {
        return this.n;
    }

    public Uri s() {
        return this.t;
    }

    public Uri t() {
        return this.v;
    }

    public String toString() {
        return b((Player) this);
    }

    public int u() {
        return this.x;
    }

    public long v() {
        return this.y;
    }

    public boolean w() {
        return this.z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        if (m_()) {
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f == null ? null : this.f.toString());
            if (this.g != null) {
                str = this.g.toString();
            }
            parcel.writeString(str);
            parcel.writeLong(this.h);
            return;
        }
        k.a(this, parcel, i);
    }

    public int x() {
        return this.c;
    }

    public Player y() {
        return this;
    }
}
