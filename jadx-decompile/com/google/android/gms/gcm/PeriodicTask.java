package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.Task.a;

public class PeriodicTask extends Task {
    public static final Creator<PeriodicTask> CREATOR = new 1();
    protected long a;
    protected long b;

    @Deprecated
    private PeriodicTask(Parcel parcel) {
        super(parcel);
        this.a = -1;
        this.b = -1;
        this.a = parcel.readLong();
        this.b = Math.min(parcel.readLong(), this.a);
    }

    private PeriodicTask(a aVar) {
        super((a) aVar);
        this.a = -1;
        this.b = -1;
        this.a = a.a(aVar);
        this.b = Math.min(a.b(aVar), this.a);
    }

    public long a() {
        return this.a;
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("period", this.a);
        bundle.putLong("period_flex", this.b);
    }

    public long b() {
        return this.b;
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        long a = a();
        return new StringBuilder(String.valueOf(valueOf).length() + 54).append(valueOf).append(" period=").append(a).append(" flex=").append(b()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
