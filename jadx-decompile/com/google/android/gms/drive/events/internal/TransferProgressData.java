package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class TransferProgressData extends AbstractSafeParcelable {
    public static final Creator<TransferProgressData> CREATOR = new c();
    final int a;
    final int b;
    final DriveId c;
    final int d;
    final long e;
    final long f;

    TransferProgressData(int i, int i2, DriveId driveId, int i3, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = driveId;
        this.d = i3;
        this.e = j;
        this.f = j2;
    }

    public int a() {
        return this.b;
    }

    public DriveId b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public long d() {
        return this.e;
    }

    public long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TransferProgressData transferProgressData = (TransferProgressData) obj;
        return this.b == transferProgressData.b && c.a(this.c, transferProgressData.c) && this.d == transferProgressData.d && this.e == transferProgressData.e && this.f == transferProgressData.f;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f)});
    }

    public String toString() {
        return String.format("TransferProgressData[TransferType: %d, DriveId: %s, status: %d, bytes transferred: %d, total bytes: %d]", new Object[]{Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
