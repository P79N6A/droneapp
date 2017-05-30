package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class EventParcel extends AbstractSafeParcelable {
    public static final w CREATOR = new w();
    public final int a;
    public final String b;
    public final EventParams c;
    public final String d;
    public final long e;

    EventParcel(int i, String str, EventParams eventParams, String str2, long j) {
        this.a = i;
        this.b = str;
        this.c = eventParams;
        this.d = str2;
        this.e = j;
    }

    public EventParcel(String str, EventParams eventParams, String str2, long j) {
        this.a = 1;
        this.b = str;
        this.c = eventParams;
        this.d = str2;
        this.e = j;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        return new StringBuilder(((String.valueOf(str).length() + 21) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(valueOf).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
