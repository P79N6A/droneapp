package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlayerStatsEntity extends AbstractSafeParcelable implements PlayerStats {
    public static final Creator<PlayerStatsEntity> CREATOR = new b();
    private final int b;
    private final float c;
    private final float d;
    private final int e;
    private final int f;
    private final int g;
    private final float h;
    private final float i;
    private final Bundle j;
    private final float k;
    private final float l;
    private final float m;

    PlayerStatsEntity(int i, float f, float f2, int i2, int i3, int i4, float f3, float f4, Bundle bundle, float f5, float f6, float f7) {
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = f3;
        this.i = f4;
        this.j = bundle;
        this.k = f5;
        this.l = f6;
        this.m = f7;
    }

    public PlayerStatsEntity(PlayerStats playerStats) {
        this.b = 4;
        this.c = playerStats.c();
        this.d = playerStats.d();
        this.e = playerStats.e();
        this.f = playerStats.f();
        this.g = playerStats.g();
        this.h = playerStats.h();
        this.i = playerStats.i();
        this.k = playerStats.j();
        this.l = playerStats.k();
        this.m = playerStats.l();
        this.j = playerStats.m();
    }

    static int a(PlayerStats playerStats) {
        return c.a(new Object[]{Float.valueOf(playerStats.c()), Float.valueOf(playerStats.d()), Integer.valueOf(playerStats.e()), Integer.valueOf(playerStats.f()), Integer.valueOf(playerStats.g()), Float.valueOf(playerStats.h()), Float.valueOf(playerStats.i()), Float.valueOf(playerStats.j()), Float.valueOf(playerStats.k()), Float.valueOf(playerStats.l())});
    }

    static boolean a(PlayerStats playerStats, Object obj) {
        if (!(obj instanceof PlayerStats)) {
            return false;
        }
        if (playerStats == obj) {
            return true;
        }
        PlayerStats playerStats2 = (PlayerStats) obj;
        return c.a(Float.valueOf(playerStats2.c()), Float.valueOf(playerStats.c())) && c.a(Float.valueOf(playerStats2.d()), Float.valueOf(playerStats.d())) && c.a(Integer.valueOf(playerStats2.e()), Integer.valueOf(playerStats.e())) && c.a(Integer.valueOf(playerStats2.f()), Integer.valueOf(playerStats.f())) && c.a(Integer.valueOf(playerStats2.g()), Integer.valueOf(playerStats.g())) && c.a(Float.valueOf(playerStats2.h()), Float.valueOf(playerStats.h())) && c.a(Float.valueOf(playerStats2.i()), Float.valueOf(playerStats.i())) && c.a(Float.valueOf(playerStats2.j()), Float.valueOf(playerStats.j())) && c.a(Float.valueOf(playerStats2.k()), Float.valueOf(playerStats.k())) && c.a(Float.valueOf(playerStats2.l()), Float.valueOf(playerStats.l()));
    }

    static String b(PlayerStats playerStats) {
        return c.a(playerStats).a("AverageSessionLength", Float.valueOf(playerStats.c())).a("ChurnProbability", Float.valueOf(playerStats.d())).a("DaysSinceLastPlayed", Integer.valueOf(playerStats.e())).a("NumberOfPurchases", Integer.valueOf(playerStats.f())).a("NumberOfSessions", Integer.valueOf(playerStats.g())).a("SessionPercentile", Float.valueOf(playerStats.h())).a("SpendPercentile", Float.valueOf(playerStats.i())).a("SpendProbability", Float.valueOf(playerStats.j())).a("HighSpenderProbability", Float.valueOf(playerStats.k())).a("TotalSpendNext28Days", Float.valueOf(playerStats.l())).toString();
    }

    public /* synthetic */ Object a() {
        return o();
    }

    public boolean b() {
        return true;
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public float h() {
        return this.h;
    }

    public int hashCode() {
        return a(this);
    }

    public float i() {
        return this.i;
    }

    public float j() {
        return this.k;
    }

    public float k() {
        return this.l;
    }

    public float l() {
        return this.m;
    }

    public Bundle m() {
        return this.j;
    }

    public int n() {
        return this.b;
    }

    public PlayerStats o() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
