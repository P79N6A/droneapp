package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    public static final b CREATOR = new a();
    private final int a;
    private int b;
    private String c;
    private String d;
    private Uri e;

    static final class a extends b {
        a() {
        }

        public GameBadgeEntity a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.b(GameBadgeEntity.l_()) || GameBadgeEntity.a_(GameBadgeEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            return new GameBadgeEntity(1, readInt, readString, readString2, readString3 == null ? null : Uri.parse(readString3));
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }
    }

    GameBadgeEntity(int i, int i2, String str, String str2, Uri uri) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = uri;
    }

    public GameBadgeEntity(GameBadge gameBadge) {
        this.a = 1;
        this.b = gameBadge.c();
        this.c = gameBadge.d();
        this.d = gameBadge.e();
        this.e = gameBadge.f();
    }

    static int a(GameBadge gameBadge) {
        return c.a(new Object[]{Integer.valueOf(gameBadge.c()), gameBadge.d(), gameBadge.e(), gameBadge.f()});
    }

    static boolean a(GameBadge gameBadge, Object obj) {
        if (!(obj instanceof GameBadge)) {
            return false;
        }
        if (gameBadge == obj) {
            return true;
        }
        GameBadge gameBadge2 = (GameBadge) obj;
        return c.a(Integer.valueOf(gameBadge2.c()), gameBadge.d()) && c.a(gameBadge2.e(), gameBadge.f());
    }

    static String b(GameBadge gameBadge) {
        return c.a(gameBadge).a("Type", Integer.valueOf(gameBadge.c())).a("Title", gameBadge.d()).a("Description", gameBadge.e()).a("IconImageUri", gameBadge.f()).toString();
    }

    public /* synthetic */ Object a() {
        return h();
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return this.b;
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

    public Uri f() {
        return this.e;
    }

    public int g() {
        return this.a;
    }

    public GameBadge h() {
        return this;
    }

    public int hashCode() {
        return a((GameBadge) this);
    }

    public String toString() {
        return b((GameBadge) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (m_()) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e == null ? null : this.e.toString());
            return;
        }
        b.a(this, parcel, i);
    }
}
