package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PlayerLevel implements SafeParcelable {
    public static final Creator<PlayerLevel> CREATOR = new l();
    private final int a;
    private final int b;
    private final long c;
    private final long d;

    PlayerLevel(int i, int i2, long j, long j2) {
        boolean z = true;
        d.a(j >= 0, "Min XP must be positive!");
        if (j2 <= j) {
            z = false;
        }
        d.a(z, "Max XP must be more than min XP!");
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public PlayerLevel(int i, long j, long j2) {
        this(1, i, j, j2);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return c.a(Integer.valueOf(playerLevel.b()), Integer.valueOf(b())) && c.a(Long.valueOf(playerLevel.c()), Long.valueOf(c())) && c.a(Long.valueOf(playerLevel.d()), Long.valueOf(d()));
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public String toString() {
        return c.a(this).a("LevelNumber", Integer.valueOf(b())).a("MinXp", Long.valueOf(c())).a("MaxXp", Long.valueOf(d())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
