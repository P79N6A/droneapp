package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

public class Strategy extends AbstractSafeParcelable {
    public static final Creator<Strategy> CREATOR = new r();
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 300;
    public static final int g = 86400;
    public static final int h = Integer.MAX_VALUE;
    public static final Strategy i = new a().a();
    public static final Strategy j = new a().b(2).c(Integer.MAX_VALUE).a();
    @Deprecated
    public static final Strategy k = j;
    final int l;
    @Deprecated
    final int m;
    final int n;
    final int o;
    @Deprecated
    final boolean p;
    final int q;
    final int r;

    Strategy(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        this.l = i;
        this.m = i2;
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    this.r = 1;
                    break;
                case 3:
                    this.r = 2;
                    break;
                default:
                    this.r = 3;
                    break;
            }
        }
        this.r = i6;
        this.o = i4;
        this.p = z;
        if (z) {
            this.q = 2;
            this.n = Integer.MAX_VALUE;
            return;
        }
        this.n = i3;
        switch (i5) {
            case -1:
            case 0:
            case 1:
            case 6:
                this.q = -1;
                return;
            default:
                this.q = i5;
                return;
        }
    }

    private static String a(int i) {
        switch (i) {
            case 0:
                return "DEFAULT";
            case 1:
                return "EARSHOT";
            default:
                return "UNKNOWN:" + i;
        }
    }

    private static String b(int i) {
        if (i == -1) {
            return "DEFAULT";
        }
        List arrayList = new ArrayList();
        if ((i & 4) > 0) {
            arrayList.add("ULTRASOUND");
        }
        if ((i & 2) > 0) {
            arrayList.add("BLE");
        }
        return arrayList.isEmpty() ? "UNKNOWN:" + i : arrayList.toString();
    }

    private static String c(int i) {
        if (i == 3) {
            return "DEFAULT";
        }
        List arrayList = new ArrayList();
        if ((i & 1) > 0) {
            arrayList.add("BROADCAST");
        }
        if ((i & 2) > 0) {
            arrayList.add("SCAN");
        }
        return arrayList.isEmpty() ? "UNKNOWN:" + i : arrayList.toString();
    }

    public int a() {
        return this.q;
    }

    public int b() {
        return this.r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.l == strategy.l && this.r == strategy.r && this.n == strategy.n && this.o == strategy.o && this.q == strategy.q;
    }

    public int hashCode() {
        return (((((((this.l * 31) + this.r) * 31) + this.n) * 31) + this.o) * 31) + this.q;
    }

    public String toString() {
        int i = this.n;
        String valueOf = String.valueOf(a(this.o));
        String valueOf2 = String.valueOf(b(this.q));
        String valueOf3 = String.valueOf(c(this.r));
        return new StringBuilder(((String.valueOf(valueOf).length() + 81) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Strategy{ttlSeconds=").append(i).append(", distanceType=").append(valueOf).append(", discoveryMedium=").append(valueOf2).append(", discoveryMode=").append(valueOf3).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
