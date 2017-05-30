package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;

public final class ExperienceEventEntity extends AbstractSafeParcelable implements ExperienceEvent {
    public static final b CREATOR = new b();
    private final int a;
    private final String b;
    private final GameEntity c;
    private final String d;
    private final String e;
    private final String f;
    private final Uri g;
    private final long h;
    private final long i;
    private final long j;
    private final int k;
    private final int l;

    ExperienceEventEntity(int i, String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j, long j2, long j3, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = gameEntity;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = uri;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = i2;
        this.l = i3;
    }

    public ExperienceEventEntity(ExperienceEvent experienceEvent) {
        this.a = 1;
        this.b = experienceEvent.c();
        this.c = new GameEntity(experienceEvent.d());
        this.d = experienceEvent.e();
        this.e = experienceEvent.f();
        this.f = experienceEvent.getIconImageUrl();
        this.g = experienceEvent.g();
        this.h = experienceEvent.h();
        this.i = experienceEvent.i();
        this.j = experienceEvent.j();
        this.k = experienceEvent.k();
        this.l = experienceEvent.l();
    }

    static int a(ExperienceEvent experienceEvent) {
        return c.a(new Object[]{experienceEvent.c(), experienceEvent.d(), experienceEvent.e(), experienceEvent.f(), experienceEvent.getIconImageUrl(), experienceEvent.g(), Long.valueOf(experienceEvent.h()), Long.valueOf(experienceEvent.i()), Long.valueOf(experienceEvent.j()), Integer.valueOf(experienceEvent.k()), Integer.valueOf(experienceEvent.l())});
    }

    static boolean a(ExperienceEvent experienceEvent, Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (experienceEvent == obj) {
            return true;
        }
        ExperienceEvent experienceEvent2 = (ExperienceEvent) obj;
        return c.a(experienceEvent2.c(), experienceEvent.c()) && c.a(experienceEvent2.d(), experienceEvent.d()) && c.a(experienceEvent2.e(), experienceEvent.e()) && c.a(experienceEvent2.f(), experienceEvent.f()) && c.a(experienceEvent2.getIconImageUrl(), experienceEvent.getIconImageUrl()) && c.a(experienceEvent2.g(), experienceEvent.g()) && c.a(Long.valueOf(experienceEvent2.h()), Long.valueOf(experienceEvent.h())) && c.a(Long.valueOf(experienceEvent2.i()), Long.valueOf(experienceEvent.i())) && c.a(Long.valueOf(experienceEvent2.j()), Long.valueOf(experienceEvent.j())) && c.a(Integer.valueOf(experienceEvent2.k()), Integer.valueOf(experienceEvent.k())) && c.a(Integer.valueOf(experienceEvent2.l()), Integer.valueOf(experienceEvent.l()));
    }

    static String b(ExperienceEvent experienceEvent) {
        return c.a(experienceEvent).a("ExperienceId", experienceEvent.c()).a("Game", experienceEvent.d()).a("DisplayTitle", experienceEvent.e()).a("DisplayDescription", experienceEvent.f()).a("IconImageUrl", experienceEvent.getIconImageUrl()).a("IconImageUri", experienceEvent.g()).a("CreatedTimestamp", Long.valueOf(experienceEvent.h())).a("XpEarned", Long.valueOf(experienceEvent.i())).a("CurrentXp", Long.valueOf(experienceEvent.j())).a("Type", Integer.valueOf(experienceEvent.k())).a("NewLevel", Integer.valueOf(experienceEvent.l())).toString();
    }

    public /* synthetic */ Object a() {
        return n();
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.b;
    }

    public Game d() {
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

    public Uri g() {
        return this.g;
    }

    public String getIconImageUrl() {
        return this.f;
    }

    public long h() {
        return this.h;
    }

    public int hashCode() {
        return a(this);
    }

    public long i() {
        return this.i;
    }

    public long j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }

    public int l() {
        return this.l;
    }

    public int m() {
        return this.a;
    }

    public ExperienceEvent n() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
