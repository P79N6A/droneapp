package com.google.android.gms.games.social;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public class SocialInviteEntity extends AbstractSafeParcelable implements SocialInvite {
    public static final Creator<SocialInviteEntity> CREATOR = new d();
    private final int a;
    private final String b;
    private final PlayerEntity c;
    private final int d;
    private final int e;
    private final long f;

    SocialInviteEntity(int i, String str, PlayerEntity playerEntity, int i2, int i3, long j) {
        this.a = i;
        this.b = str;
        this.c = playerEntity;
        this.d = i2;
        this.e = i3;
        this.f = j;
    }

    public SocialInviteEntity(SocialInvite socialInvite) {
        this.a = 1;
        this.b = socialInvite.c();
        Player d = socialInvite.d();
        this.c = d == null ? null : (PlayerEntity) d.a();
        this.d = socialInvite.e();
        this.e = socialInvite.f();
        this.f = socialInvite.g();
    }

    static int a(SocialInvite socialInvite) {
        return c.a(new Object[]{socialInvite.c(), socialInvite.d(), Integer.valueOf(socialInvite.e()), Integer.valueOf(socialInvite.f()), Long.valueOf(socialInvite.g())});
    }

    static boolean a(SocialInvite socialInvite, Object obj) {
        if (!(obj instanceof SocialInvite)) {
            return false;
        }
        if (socialInvite == obj) {
            return true;
        }
        SocialInvite socialInvite2 = (SocialInvite) obj;
        return c.a(socialInvite2.c(), socialInvite.c()) && c.a(socialInvite2.d(), socialInvite.d()) && c.a(Integer.valueOf(socialInvite2.e()), Integer.valueOf(socialInvite.e())) && c.a(Integer.valueOf(socialInvite2.f()), Integer.valueOf(socialInvite.f())) && c.a(Long.valueOf(socialInvite2.g()), Long.valueOf(socialInvite.g()));
    }

    static String b(SocialInvite socialInvite) {
        return c.a(socialInvite).a("Social Invite ID", socialInvite.c()).a("Player", socialInvite.d()).a("Type", Integer.valueOf(socialInvite.e())).a("Direction", Integer.valueOf(socialInvite.f())).a("Last Modified Timestamp", Long.valueOf(socialInvite.g())).toString();
    }

    public /* synthetic */ Object a() {
        return i();
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.b;
    }

    public Player d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public int f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    public int h() {
        return this.a;
    }

    public int hashCode() {
        return a(this);
    }

    public SocialInvite i() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
