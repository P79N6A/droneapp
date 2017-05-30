package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PlayerLevelInfo implements SafeParcelable {
    public static final Creator<PlayerLevelInfo> CREATOR = new m();
    private final int a;
    private final long b;
    private final long c;
    private final PlayerLevel d;
    private final PlayerLevel e;

    PlayerLevelInfo(int i, long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        d.a(j != -1);
        d.a(playerLevel);
        d.a(playerLevel2);
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = playerLevel;
        this.e = playerLevel2;
    }

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        this(1, j, j2, playerLevel, playerLevel2);
    }

    public int a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public PlayerLevel d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public PlayerLevel e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return c.a(Long.valueOf(this.b), Long.valueOf(playerLevelInfo.b)) && c.a(Long.valueOf(this.c), Long.valueOf(playerLevelInfo.c)) && c.a(this.d, playerLevelInfo.d) && c.a(this.e, playerLevelInfo.e);
    }

    public boolean f() {
        return this.d.equals(this.e);
    }

    public int hashCode() {
        return c.a(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
