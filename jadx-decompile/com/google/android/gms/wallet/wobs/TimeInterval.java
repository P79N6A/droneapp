package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class TimeInterval extends AbstractSafeParcelable {
    public static final Creator<TimeInterval> CREATOR = new g();
    long a;
    long b;
    private final int c;

    TimeInterval() {
        this.c = 1;
    }

    TimeInterval(int i, long j, long j2) {
        this.c = i;
        this.a = j;
        this.b = j2;
    }

    public int a() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
