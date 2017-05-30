package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class MostRecentGameInfoEntity extends AbstractSafeParcelable implements MostRecentGameInfo {
    public static final a CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final long d;
    private final Uri e;
    private final Uri f;
    private final Uri g;

    MostRecentGameInfoEntity(int i, String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = uri;
        this.f = uri2;
        this.g = uri3;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostRecentGameInfo) {
        this.a = 2;
        this.b = mostRecentGameInfo.c();
        this.c = mostRecentGameInfo.d();
        this.d = mostRecentGameInfo.e();
        this.e = mostRecentGameInfo.f();
        this.f = mostRecentGameInfo.g();
        this.g = mostRecentGameInfo.h();
    }

    static int a(MostRecentGameInfo mostRecentGameInfo) {
        return c.a(new Object[]{mostRecentGameInfo.c(), mostRecentGameInfo.d(), Long.valueOf(mostRecentGameInfo.e()), mostRecentGameInfo.f(), mostRecentGameInfo.g(), mostRecentGameInfo.h()});
    }

    static boolean a(MostRecentGameInfo mostRecentGameInfo, Object obj) {
        if (!(obj instanceof MostRecentGameInfo)) {
            return false;
        }
        if (mostRecentGameInfo == obj) {
            return true;
        }
        MostRecentGameInfo mostRecentGameInfo2 = (MostRecentGameInfo) obj;
        return c.a(mostRecentGameInfo2.c(), mostRecentGameInfo.c()) && c.a(mostRecentGameInfo2.d(), mostRecentGameInfo.d()) && c.a(Long.valueOf(mostRecentGameInfo2.e()), Long.valueOf(mostRecentGameInfo.e())) && c.a(mostRecentGameInfo2.f(), mostRecentGameInfo.f()) && c.a(mostRecentGameInfo2.g(), mostRecentGameInfo.g()) && c.a(mostRecentGameInfo2.h(), mostRecentGameInfo.h());
    }

    static String b(MostRecentGameInfo mostRecentGameInfo) {
        return c.a(mostRecentGameInfo).a("GameId", mostRecentGameInfo.c()).a("GameName", mostRecentGameInfo.d()).a("ActivityTimestampMillis", Long.valueOf(mostRecentGameInfo.e())).a("GameIconUri", mostRecentGameInfo.f()).a("GameHiResUri", mostRecentGameInfo.g()).a("GameFeaturedUri", mostRecentGameInfo.h()).toString();
    }

    public /* synthetic */ Object a() {
        return j();
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public Uri f() {
        return this.e;
    }

    public Uri g() {
        return this.f;
    }

    public Uri h() {
        return this.g;
    }

    public int hashCode() {
        return a(this);
    }

    public int i() {
        return this.a;
    }

    public MostRecentGameInfo j() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
