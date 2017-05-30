package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class NetworkStateImpl extends AbstractSafeParcelable {
    public static final Creator<NetworkStateImpl> CREATOR = new e();
    private final int a;
    private final int b;
    private final int c;

    NetworkStateImpl(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "DISCONNECTED";
            case 2:
                return "ON_WIFI";
            case 3:
                return "ON_CELLULAR";
            default:
                return "unknown connection state: " + i;
        }
    }

    public static String b(int i) {
        switch (i) {
            case 1:
                return "METERED";
            case 2:
                return "UNMETERED";
            default:
                return "unknown meter state: " + i;
        }
    }

    public int a() {
        return this.b;
    }

    int b() {
        return this.a;
    }

    int c() {
        return this.c;
    }

    public String toString() {
        String valueOf = String.valueOf(a(this.b));
        String valueOf2 = String.valueOf(b(this.c));
        return new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(valueOf2).length()).append("ConnectionState = ").append(valueOf).append(" NetworkMeteredState = ").append(valueOf2).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
