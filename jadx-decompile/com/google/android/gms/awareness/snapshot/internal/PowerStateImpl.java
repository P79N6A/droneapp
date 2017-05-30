package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PowerStateImpl extends AbstractSafeParcelable {
    public static final Creator<PowerStateImpl> CREATOR = new h();
    private final int a;
    private final int b;
    private final double c;

    PowerStateImpl(int i, int i2, double d) {
        this.a = i;
        this.b = i2;
        this.c = d;
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "POWER_DISCONNECTED";
            case 2:
                return "POWER_CONNECTED_USB";
            case 3:
                return "POWER_CONNECTED_AC";
            case 4:
                return "POWER_CONNECTED_WIRELESS";
            default:
                return "unknown plugged in state=" + i;
        }
    }

    public int a() {
        return this.b;
    }

    public double b() {
        return this.c;
    }

    int c() {
        return this.a;
    }

    public String toString() {
        String valueOf = String.valueOf(a(this.b));
        return new StringBuilder(String.valueOf(valueOf).length() + 69).append("PowerConnectionState = ").append(valueOf).append(" Battery Percentage = ").append(this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
