package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Creator<GameEntity> CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Uri h;
    private final Uri i;
    private final Uri j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean q;
    private final boolean r;
    private final String s;
    private final String t;
    private final String u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final String y;
    private final boolean z;

    static final class a extends b {
        a() {
        }

        public GameEntity a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.b(GameEntity.l_()) || GameEntity.a_(GameEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Uri parse = readString7 == null ? null : Uri.parse(readString7);
            readString7 = parcel.readString();
            Uri parse2 = readString7 == null ? null : Uri.parse(readString7);
            readString7 = parcel.readString();
            return new GameEntity(7, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString7 == null ? null : Uri.parse(readString7), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }
    }

    GameEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = uri;
        this.s = str8;
        this.i = uri2;
        this.t = str9;
        this.j = uri3;
        this.u = str10;
        this.k = z;
        this.l = z2;
        this.m = str7;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = z3;
        this.r = z4;
        this.v = z5;
        this.w = z6;
        this.x = z7;
        this.y = str11;
        this.z = z8;
    }

    public GameEntity(Game game) {
        this.a = 7;
        this.b = game.c();
        this.d = game.e();
        this.e = game.f();
        this.f = game.g();
        this.g = game.h();
        this.c = game.d();
        this.h = game.i();
        this.s = game.getIconImageUrl();
        this.i = game.j();
        this.t = game.getHiResImageUrl();
        this.j = game.k();
        this.u = game.getFeaturedImageUrl();
        this.k = game.l();
        this.l = game.o();
        this.m = game.p();
        this.n = 1;
        this.o = game.q();
        this.p = game.r();
        this.q = game.s();
        this.r = game.t();
        this.v = game.m();
        this.w = game.n();
        this.x = game.u();
        this.y = game.v();
        this.z = game.w();
    }

    static int a(Game game) {
        return c.a(new Object[]{game.c(), game.d(), game.e(), game.f(), game.g(), game.h(), game.i(), game.j(), game.k(), Boolean.valueOf(game.l()), Boolean.valueOf(game.o()), game.p(), Integer.valueOf(game.q()), Integer.valueOf(game.r()), Boolean.valueOf(game.s()), Boolean.valueOf(game.t()), Boolean.valueOf(game.m()), Boolean.valueOf(game.n()), Boolean.valueOf(game.u()), game.v(), Boolean.valueOf(game.w())});
    }

    static boolean a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        if (c.a(game2.c(), game.c()) && c.a(game2.d(), game.d()) && c.a(game2.e(), game.e()) && c.a(game2.f(), game.f()) && c.a(game2.g(), game.g()) && c.a(game2.h(), game.h()) && c.a(game2.i(), game.i()) && c.a(game2.j(), game.j()) && c.a(game2.k(), game.k()) && c.a(Boolean.valueOf(game2.l()), Boolean.valueOf(game.l())) && c.a(Boolean.valueOf(game2.o()), Boolean.valueOf(game.o())) && c.a(game2.p(), game.p()) && c.a(Integer.valueOf(game2.q()), Integer.valueOf(game.q())) && c.a(Integer.valueOf(game2.r()), Integer.valueOf(game.r())) && c.a(Boolean.valueOf(game2.s()), Boolean.valueOf(game.s()))) {
            Boolean valueOf = Boolean.valueOf(game2.t());
            boolean z = game.t() && c.a(Boolean.valueOf(game2.m()), Boolean.valueOf(game.m())) && c.a(Boolean.valueOf(game2.n()), Boolean.valueOf(game.n()));
            if (c.a(valueOf, Boolean.valueOf(z)) && c.a(Boolean.valueOf(game2.u()), Boolean.valueOf(game.u())) && c.a(game2.v(), game.v()) && c.a(Boolean.valueOf(game2.w()), Boolean.valueOf(game.w()))) {
                return true;
            }
        }
        return false;
    }

    static String b(Game game) {
        return c.a(game).a("ApplicationId", game.c()).a("DisplayName", game.d()).a("PrimaryCategory", game.e()).a("SecondaryCategory", game.f()).a("Description", game.g()).a("DeveloperName", game.h()).a("IconImageUri", game.i()).a("IconImageUrl", game.getIconImageUrl()).a("HiResImageUri", game.j()).a("HiResImageUrl", game.getHiResImageUrl()).a("FeaturedImageUri", game.k()).a("FeaturedImageUrl", game.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(game.l())).a("InstanceInstalled", Boolean.valueOf(game.o())).a("InstancePackageName", game.p()).a("AchievementTotalCount", Integer.valueOf(game.q())).a("LeaderboardCount", Integer.valueOf(game.r())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.s())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.t())).a("AreSnapshotsEnabled", Boolean.valueOf(game.u())).a("ThemeColor", game.v()).a("HasGamepadSupport", Boolean.valueOf(game.w())).toString();
    }

    public /* synthetic */ Object a() {
        return z();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.c, charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        g.a(this.f, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.b;
    }

    public void c(CharArrayBuffer charArrayBuffer) {
        g.a(this.g, charArrayBuffer);
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public String f() {
        return this.e;
    }

    public String g() {
        return this.f;
    }

    public String getFeaturedImageUrl() {
        return this.u;
    }

    public String getHiResImageUrl() {
        return this.t;
    }

    public String getIconImageUrl() {
        return this.s;
    }

    public String h() {
        return this.g;
    }

    public int hashCode() {
        return a((Game) this);
    }

    public Uri i() {
        return this.h;
    }

    public Uri j() {
        return this.i;
    }

    public Uri k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }

    public boolean m() {
        return this.v;
    }

    public boolean n() {
        return this.w;
    }

    public boolean o() {
        return this.l;
    }

    public String p() {
        return this.m;
    }

    public int q() {
        return this.o;
    }

    public int r() {
        return this.p;
    }

    public boolean s() {
        return this.q;
    }

    public boolean t() {
        return this.r;
    }

    public String toString() {
        return b((Game) this);
    }

    public boolean u() {
        return this.x;
    }

    public String v() {
        return this.y;
    }

    public boolean w() {
        return this.z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        String str = null;
        if (m_()) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h == null ? null : this.h.toString());
            parcel.writeString(this.i == null ? null : this.i.toString());
            if (this.j != null) {
                str = this.j.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.k ? 1 : 0);
            if (!this.l) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            return;
        }
        b.a(this, parcel, i);
    }

    public int x() {
        return this.a;
    }

    public int y() {
        return this.n;
    }

    public Game z() {
        return this;
    }
}
