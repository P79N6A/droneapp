package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class AchievementEntity extends AbstractSafeParcelable implements Achievement {
    public static final Creator<AchievementEntity> CREATOR = new b();
    private final int f;
    private final String g;
    private final int h;
    private final String i;
    private final String j;
    private final Uri k;
    private final String l;
    private final Uri m;
    private final String n;
    private final int o;
    private final String p;
    private final PlayerEntity q;
    private final int r;
    private final int s;
    private final String t;
    private final long u;
    private final long v;

    AchievementEntity(int i, String str, int i2, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i3, String str6, PlayerEntity playerEntity, int i4, int i5, String str7, long j, long j2) {
        this.f = i;
        this.g = str;
        this.h = i2;
        this.i = str2;
        this.j = str3;
        this.k = uri;
        this.l = str4;
        this.m = uri2;
        this.n = str5;
        this.o = i3;
        this.p = str6;
        this.q = playerEntity;
        this.r = i4;
        this.s = i5;
        this.t = str7;
        this.u = j;
        this.v = j2;
    }

    public AchievementEntity(Achievement achievement) {
        this.f = 1;
        this.g = achievement.c();
        this.h = achievement.d();
        this.i = achievement.e();
        this.j = achievement.f();
        this.k = achievement.g();
        this.l = achievement.getUnlockedImageUrl();
        this.m = achievement.h();
        this.n = achievement.getRevealedImageUrl();
        this.q = (PlayerEntity) achievement.k().a();
        this.r = achievement.l();
        this.u = achievement.o();
        this.v = achievement.p();
        if (achievement.d() == 1) {
            this.o = achievement.i();
            this.p = achievement.j();
            this.s = achievement.m();
            this.t = achievement.n();
        } else {
            this.o = 0;
            this.p = null;
            this.s = 0;
            this.t = null;
        }
        n.a(this.g);
        n.a(this.j);
    }

    static int a(Achievement achievement) {
        int m;
        int i;
        if (achievement.d() == 1) {
            m = achievement.m();
            i = achievement.i();
        } else {
            i = 0;
            m = 0;
        }
        return c.a(new Object[]{achievement.c(), achievement.e(), Integer.valueOf(achievement.d()), achievement.f(), Long.valueOf(achievement.p()), Integer.valueOf(achievement.l()), Long.valueOf(achievement.o()), achievement.k(), Integer.valueOf(m), Integer.valueOf(i)});
    }

    static boolean a(Achievement achievement, Object obj) {
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        boolean a;
        boolean a2;
        Achievement achievement2 = (Achievement) obj;
        if (achievement.d() == 1) {
            a = c.a(Integer.valueOf(achievement2.m()), Integer.valueOf(achievement.m()));
            a2 = c.a(Integer.valueOf(achievement2.i()), Integer.valueOf(achievement.i()));
        } else {
            a2 = true;
            a = true;
        }
        return c.a(achievement2.c(), achievement.c()) && c.a(achievement2.e(), achievement.e()) && c.a(Integer.valueOf(achievement2.d()), Integer.valueOf(achievement.d())) && c.a(achievement2.f(), achievement.f()) && c.a(Long.valueOf(achievement2.p()), Long.valueOf(achievement.p())) && c.a(Integer.valueOf(achievement2.l()), Integer.valueOf(achievement.l())) && c.a(Long.valueOf(achievement2.o()), Long.valueOf(achievement.o())) && c.a(achievement2.k(), achievement.k()) && a && a2;
    }

    static String b(Achievement achievement) {
        a a = c.a(achievement).a("Id", achievement.c()).a("Type", Integer.valueOf(achievement.d())).a("Name", achievement.e()).a("Description", achievement.f()).a("Player", achievement.k()).a("State", Integer.valueOf(achievement.l()));
        if (achievement.d() == 1) {
            a.a("CurrentSteps", Integer.valueOf(achievement.m()));
            a.a("TotalSteps", Integer.valueOf(achievement.i()));
        }
        return a.toString();
    }

    public /* synthetic */ Object a() {
        return v();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        g.a(this.i, charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        g.a(this.j, charArrayBuffer);
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.g;
    }

    public void c(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        g.a(this.p, charArrayBuffer);
    }

    public int d() {
        return this.h;
    }

    public void d(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        g.a(this.t, charArrayBuffer);
    }

    public String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public String f() {
        return this.j;
    }

    public Uri g() {
        return this.k;
    }

    public String getRevealedImageUrl() {
        return this.n;
    }

    public String getUnlockedImageUrl() {
        return this.l;
    }

    public Uri h() {
        return this.m;
    }

    public int hashCode() {
        return a((Achievement) this);
    }

    public int i() {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        return r();
    }

    public String j() {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        return s();
    }

    public Player k() {
        return this.q;
    }

    public int l() {
        return this.r;
    }

    public int m() {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        return t();
    }

    public String n() {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        return u();
    }

    public long o() {
        return this.u;
    }

    public long p() {
        return this.v;
    }

    public int q() {
        return this.f;
    }

    public int r() {
        return this.o;
    }

    public String s() {
        return this.p;
    }

    public int t() {
        return this.s;
    }

    public String toString() {
        return b((Achievement) this);
    }

    public String u() {
        return this.t;
    }

    public Achievement v() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
