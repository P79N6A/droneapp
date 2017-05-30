package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Strategy extends AbstractSafeParcelable {
    public static final Creator<Strategy> CREATOR = new g();
    public static final Strategy a = new Strategy(3, 3);
    public static final Strategy b = new Strategy(1, 1);
    final int c;
    private final int d;
    private final int e;

    private Strategy(int i, int i2) {
        this(1, i, i2);
    }

    Strategy(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    int a() {
        return this.d;
    }

    int b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.d == strategy.d && this.e == strategy.e;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public String toString() {
        int i = this.d;
        return "Strategy{discoveryMode=" + i + ", connectionType=" + this.e + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
